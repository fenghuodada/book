package com.vungle.warren;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.core.content.PermissionChecker;
import androidx.localbroadcastmanager.content.C1520a;
import androidx.work.C1828a;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.android.gms.appset.AppSet;
import com.google.gson.C8686j;
import com.google.gson.C8688k;
import com.google.gson.C8695r;
import com.vungle.warren.AdConfig;
import com.vungle.warren.AdLoader;
import com.vungle.warren.C10118v1;
import com.vungle.warren.C9846m1;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.downloader.DownloadRequest;
import com.vungle.warren.downloader.Downloader;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.log.C9835f;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.C9867g;
import com.vungle.warren.model.C9874j;
import com.vungle.warren.model.C9879m;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.admarkup.AbstractC9853a;
import com.vungle.warren.network.C9901e;
import com.vungle.warren.network.InterfaceC9892b;
import com.vungle.warren.p058ui.VungleActivity;
import com.vungle.warren.p058ui.view.C10055l;
import com.vungle.warren.persistence.C9914a;
import com.vungle.warren.persistence.C9919c;
import com.vungle.warren.persistence.C9924e;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.persistence.CallableC9948l;
import com.vungle.warren.persistence.CallableC9949m;
import com.vungle.warren.persistence.FutureC9926f;
import com.vungle.warren.persistence.RunnableC9957u;
import com.vungle.warren.tasks.AnalyticsJob;
import com.vungle.warren.tasks.InterfaceC9982e;
import com.vungle.warren.utility.C10069a;
import com.vungle.warren.utility.C10078c;
import com.vungle.warren.utility.InterfaceC10086h;
import com.vungle.warren.utility.InterfaceC10107v;
import com.vungle.warren.utility.platform.InterfaceC10100c;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p060j$.util.concurrent.ConcurrentHashMap;

@Keep
/* loaded from: classes3.dex */
public class Vungle {
    private static final int DEFAULT_SESSION_TIMEOUT = 900;
    private static volatile boolean isInitialized;
    volatile String appID;
    private volatile String consentVersion;
    private Context context;
    static final Vungle _instance = new Vungle();
    private static final String TAG = Vungle.class.getCanonicalName();
    private static AtomicBoolean isInitializing = new AtomicBoolean(false);
    private static AtomicBoolean isDepInit = new AtomicBoolean(false);
    private static C8686j gson = new C8688k().m3226a();
    private static C9914a.InterfaceC9917c cacheListener = new C9730j();
    private final AtomicReference<Consent> consent = new AtomicReference<>();
    private final AtomicReference<Consent> ccpaStatus = new AtomicReference<>();
    private Map<String, Boolean> playOperations = new ConcurrentHashMap();
    private AtomicInteger hbpOrdinalViewCount = new AtomicInteger(0);

    @Keep
    /* loaded from: classes3.dex */
    public enum Consent {
        OPTED_IN,
        OPTED_OUT
    }

    /* renamed from: com.vungle.warren.Vungle$a */
    /* loaded from: classes3.dex */
    public class CallableC9719a implements Callable<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ Context f19312a;

        /* renamed from: b */
        public final /* synthetic */ String f19313b;

        /* renamed from: c */
        public final /* synthetic */ String f19314c;

        public CallableC9719a(Context context, String str, String str2) {
            this.f19312a = context;
            this.f19313b = str;
            this.f19314c = str2;
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() throws Exception {
            String str;
            Advertisement advertisement;
            if (!Vungle.isInitialized()) {
                Log.e(Vungle.TAG, "Vungle is not initialized");
            } else {
                C9928h c9928h = (C9928h) C10114v0.m1234a(this.f19312a).m1232c(C9928h.class);
                AbstractC9853a m1278a = C10078c.m1278a(this.f19313b);
                if (m1278a != null) {
                    str = m1278a.mo1452a();
                } else {
                    str = null;
                }
                String str2 = this.f19314c;
                Placement placement = (Placement) c9928h.m1383p(Placement.class, str2).get();
                if (placement != null && placement.f19776h && ((!placement.m1458c() || str != null) && (advertisement = c9928h.m1387l(str2, str).get()) != null && placement.f19777i != 1 && (AdConfig.AdSize.isDefaultAdSize(placement.m1460a()) || placement.m1460a().equals(advertisement.f19757v.m1425a())))) {
                    return Boolean.valueOf(Vungle.canPlayAd(advertisement));
                }
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.vungle.warren.Vungle$b */
    /* loaded from: classes3.dex */
    public class RunnableC9720b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f19315a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9782e0 f19316b;

        public RunnableC9720b(String str, C9785f0 c9785f0) {
            this.f19315a = str;
            this.f19316b = c9785f0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Vungle.onPlayError(this.f19315a, this.f19316b, new VungleException(39));
        }
    }

    /* renamed from: com.vungle.warren.Vungle$c */
    /* loaded from: classes3.dex */
    public class RunnableC9721c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f19317a;

        /* renamed from: b */
        public final /* synthetic */ String f19318b;

        /* renamed from: c */
        public final /* synthetic */ AdLoader f19319c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC9782e0 f19320d;

        /* renamed from: e */
        public final /* synthetic */ C9928h f19321e;

        /* renamed from: f */
        public final /* synthetic */ AdConfig f19322f;

        /* renamed from: g */
        public final /* synthetic */ VungleApiClient f19323g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC10086h f19324h;

        /* renamed from: i */
        public final /* synthetic */ Runnable f19325i;

        /* renamed from: com.vungle.warren.Vungle$c$a */
        /* loaded from: classes3.dex */
        public class C9722a implements InterfaceC9892b<C8695r> {

            /* renamed from: a */
            public final /* synthetic */ boolean f19326a;

            /* renamed from: b */
            public final /* synthetic */ AdRequest f19327b;

            /* renamed from: c */
            public final /* synthetic */ Placement f19328c;

            /* renamed from: d */
            public final /* synthetic */ Advertisement f19329d;

            public C9722a(boolean z, AdRequest adRequest, Placement placement, Advertisement advertisement) {
                this.f19326a = z;
                this.f19327b = adRequest;
                this.f19328c = placement;
                this.f19329d = advertisement;
            }

            @Override // com.vungle.warren.network.InterfaceC9892b
            /* renamed from: a */
            public final void mo1435a(C9901e c9901e) {
                RunnableC9721c runnableC9721c = RunnableC9721c.this;
                runnableC9721c.f19324h.mo1240j().m1236a(new RunnableC9905o1(this, c9901e), runnableC9721c.f19325i);
            }

            @Override // com.vungle.warren.network.InterfaceC9892b
            /* renamed from: b */
            public final void mo1434b(Throwable th) {
                RunnableC9721c runnableC9721c = RunnableC9721c.this;
                runnableC9721c.f19324h.mo1240j().m1236a(new RunnableC9913p1(this), runnableC9721c.f19325i);
            }
        }

        public RunnableC9721c(String str, String str2, AdLoader adLoader, C9785f0 c9785f0, C9928h c9928h, AdConfig adConfig, VungleApiClient vungleApiClient, InterfaceC10086h interfaceC10086h, RunnableC9720b runnableC9720b) {
            this.f19317a = str;
            this.f19318b = str2;
            this.f19319c = adLoader;
            this.f19320d = c9785f0;
            this.f19321e = c9928h;
            this.f19322f = adConfig;
            this.f19323g = vungleApiClient;
            this.f19324h = interfaceC10086h;
            this.f19325i = runnableC9720b;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 478
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.Vungle.RunnableC9721c.run():void");
        }
    }

    /* renamed from: com.vungle.warren.Vungle$d */
    /* loaded from: classes3.dex */
    public class C9723d extends C9758c {
        public C9723d(AdRequest adRequest, Map map, InterfaceC9782e0 interfaceC9782e0, C9928h c9928h, AdLoader adLoader, InterfaceC9982e interfaceC9982e, C9890n1 c9890n1, Placement placement, Advertisement advertisement) {
            super(adRequest, map, interfaceC9782e0, c9928h, adLoader, interfaceC9982e, c9890n1, placement, advertisement);
        }

        @Override // com.vungle.warren.C9758c
        /* renamed from: b */
        public final void mo1588b() {
            super.mo1588b();
            AbstractActivityC9743a.f19393j = null;
        }
    }

    /* renamed from: com.vungle.warren.Vungle$e */
    /* loaded from: classes3.dex */
    public class RunnableC9724e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C10114v0 f19331a;

        public RunnableC9724e(C10114v0 c10114v0) {
            this.f19331a = c10114v0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((Downloader) this.f19331a.m1232c(Downloader.class)).mo1542c();
            ((AdLoader) this.f19331a.m1232c(AdLoader.class)).m1647b();
            C9928h c9928h = (C9928h) this.f19331a.m1232c(C9928h.class);
            C9919c c9919c = c9928h.f19929a;
            synchronized (c9919c) {
                ((C9928h.C9944o) c9919c.f19918a).m1371b(c9919c.m1411a());
                c9919c.close();
                c9919c.onCreate(c9919c.m1411a());
            }
            c9928h.f19932d.mo1403a();
            Vungle vungle = Vungle._instance;
            vungle.playOperations.clear();
            vungle.ccpaStatus.set(null);
            vungle.configure(((C9822k0) this.f19331a.m1232c(C9822k0.class)).f19611b.get(), true);
        }
    }

    /* renamed from: com.vungle.warren.Vungle$f */
    /* loaded from: classes3.dex */
    public class RunnableC9725f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C10114v0 f19332a;

        /* renamed from: com.vungle.warren.Vungle$f$a */
        /* loaded from: classes3.dex */
        public class RunnableC9726a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C9928h f19333a;

            public RunnableC9726a(C9928h c9928h) {
                this.f19333a = c9928h;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C9928h c9928h = this.f19333a;
                List<Advertisement> list = (List) c9928h.m1382q(Advertisement.class).get();
                if (list != null) {
                    for (Advertisement advertisement : list) {
                        try {
                            c9928h.m1392g(advertisement.getId());
                        } catch (C9919c.C9920a unused) {
                        }
                    }
                }
            }
        }

        public RunnableC9725f(C10114v0 c10114v0) {
            this.f19332a = c10114v0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C10114v0 c10114v0 = this.f19332a;
            ((Downloader) c10114v0.m1232c(Downloader.class)).mo1542c();
            ((AdLoader) c10114v0.m1232c(AdLoader.class)).m1647b();
            ((InterfaceC10086h) c10114v0.m1232c(InterfaceC10086h.class)).mo1240j().execute(new RunnableC9726a((C9928h) c10114v0.m1232c(C9928h.class)));
        }
    }

    /* renamed from: com.vungle.warren.Vungle$g */
    /* loaded from: classes3.dex */
    public class C9727g implements C9928h.InterfaceC9942m<C9867g> {

        /* renamed from: a */
        public final /* synthetic */ Consent f19334a;

        /* renamed from: b */
        public final /* synthetic */ String f19335b;

        /* renamed from: c */
        public final /* synthetic */ C9928h f19336c;

        public C9727g(C9928h c9928h, Consent consent, String str) {
            this.f19334a = consent;
            this.f19335b = str;
            this.f19336c = c9928h;
        }

        @Override // com.vungle.warren.persistence.C9928h.InterfaceC9942m
        /* renamed from: a */
        public final void mo1373a(C9867g c9867g) {
            String str;
            C9867g c9867g2 = c9867g;
            if (c9867g2 == null) {
                c9867g2 = new C9867g("consentIsImportantToVungle");
            }
            if (this.f19334a == Consent.OPTED_IN) {
                str = "opted_in";
            } else {
                str = "opted_out";
            }
            c9867g2.m1445d(str, "consent_status");
            c9867g2.m1445d(Long.valueOf(System.currentTimeMillis() / 1000), "timestamp");
            c9867g2.m1445d("publisher", "consent_source");
            String str2 = this.f19335b;
            if (str2 == null) {
                str2 = "";
            }
            c9867g2.m1445d(str2, "consent_message_version");
            this.f19336c.m1375x(c9867g2, null, false);
        }
    }

    /* renamed from: com.vungle.warren.Vungle$h */
    /* loaded from: classes3.dex */
    public class C9728h implements C9928h.InterfaceC9942m<C9867g> {

        /* renamed from: a */
        public final /* synthetic */ Consent f19337a;

        /* renamed from: b */
        public final /* synthetic */ C9928h f19338b;

        public C9728h(C9928h c9928h, Consent consent) {
            this.f19337a = consent;
            this.f19338b = c9928h;
        }

        @Override // com.vungle.warren.persistence.C9928h.InterfaceC9942m
        /* renamed from: a */
        public final void mo1373a(C9867g c9867g) {
            String str;
            C9867g c9867g2 = c9867g;
            if (c9867g2 == null) {
                c9867g2 = new C9867g("ccpaIsImportantToVungle");
            }
            if (this.f19337a == Consent.OPTED_OUT) {
                str = "opted_out";
            } else {
                str = "opted_in";
            }
            c9867g2.m1445d(str, "ccpa_status");
            this.f19338b.m1375x(c9867g2, null, false);
        }
    }

    /* renamed from: com.vungle.warren.Vungle$i */
    /* loaded from: classes3.dex */
    public class CallableC9729i implements Callable<String> {

        /* renamed from: a */
        public final /* synthetic */ C9911p f19339a;

        /* renamed from: b */
        public final /* synthetic */ String f19340b;

        /* renamed from: c */
        public final /* synthetic */ int f19341c;

        public CallableC9729i(C9911p c9911p, String str, int i) {
            this.f19339a = c9911p;
            this.f19340b = str;
            this.f19341c = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
            if ("opted_out".equals(r5.m1446c("ccpa_status")) != false) goto L5;
         */
        @Override // java.util.concurrent.Callable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String call() throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 469
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.Vungle.CallableC9729i.call():java.lang.Object");
        }
    }

    /* renamed from: com.vungle.warren.Vungle$j */
    /* loaded from: classes3.dex */
    public class C9730j implements C9914a.InterfaceC9917c {
        @Override // com.vungle.warren.persistence.C9914a.InterfaceC9917c
        /* renamed from: b */
        public final void mo1402b() {
            Vungle vungle = Vungle._instance;
            if (vungle.context == null) {
                return;
            }
            Vungle.stopPlaying();
            C10114v0 m1234a = C10114v0.m1234a(vungle.context);
            C9914a c9914a = (C9914a) m1234a.m1232c(C9914a.class);
            Downloader downloader = (Downloader) m1234a.m1232c(Downloader.class);
            if (c9914a.m1417d() != null) {
                ArrayList<DownloadRequest> mo1538g = downloader.mo1538g();
                String path = c9914a.m1417d().getPath();
                for (DownloadRequest downloadRequest : mo1538g) {
                    if (!downloadRequest.f19477c.startsWith(path)) {
                        downloader.mo1537h(downloadRequest);
                    }
                }
            }
            downloader.mo1543b();
        }
    }

    /* renamed from: com.vungle.warren.Vungle$k */
    /* loaded from: classes3.dex */
    public class RunnableC9731k implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f19342a;

        /* renamed from: b */
        public final /* synthetic */ C9822k0 f19343b;

        /* renamed from: c */
        public final /* synthetic */ C10114v0 f19344c;

        /* renamed from: d */
        public final /* synthetic */ Context f19345d;

        public RunnableC9731k(String str, C9822k0 c9822k0, C10114v0 c10114v0, Context context) {
            this.f19342a = str;
            this.f19343b = c9822k0;
            this.f19344c = c10114v0;
            this.f19345d = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            String str2;
            Vungle vungle = Vungle._instance;
            vungle.appID = this.f19342a;
            InterfaceC10129x interfaceC10129x = this.f19343b.f19611b.get();
            if (!Vungle.isDepInit.getAndSet(true)) {
                C9835f c9835f = (C9835f) this.f19344c.m1232c(C9835f.class);
                VungleLogger.LoggerLevel loggerLevel = VungleLogger.LoggerLevel.DEBUG;
                VungleLogger vungleLogger = VungleLogger.f19390c;
                vungleLogger.f19391a = loggerLevel;
                vungleLogger.f19392b = c9835f;
                c9835f.getClass();
                c9835f.f19641a.f19667f = 100;
                C9914a c9914a = (C9914a) this.f19344c.m1232c(C9914a.class);
                C10118v1 c10118v1 = this.f19343b.f19612c.get();
                if (c10118v1 != null && c9914a.m1418c(1) < c10118v1.f20363a) {
                    Vungle.onInitError(interfaceC10129x, new VungleException(16));
                    Vungle.deInit();
                    return;
                }
                c9914a.m1420a(Vungle.cacheListener);
                vungle.context = this.f19345d;
                C9928h c9928h = (C9928h) this.f19344c.m1232c(C9928h.class);
                try {
                    c9928h.getClass();
                    c9928h.m1377v(new CallableC9948l(c9928h));
                    C9818j0.m1500b().m1499c(((InterfaceC10086h) this.f19344c.m1232c(InterfaceC10086h.class)).mo1240j(), c9928h);
                    VungleApiClient vungleApiClient = (VungleApiClient) this.f19344c.m1232c(VungleApiClient.class);
                    Context context = vungleApiClient.f19364b;
                    synchronized (vungleApiClient) {
                        C8695r c8695r = new C8695r();
                        c8695r.m3215u("bundle", context.getPackageName());
                        try {
                            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                        } catch (PackageManager.NameNotFoundException unused) {
                            str = null;
                        }
                        if (str == null) {
                            str = "1.0";
                        }
                        c8695r.m3215u("ver", str);
                        C8695r c8695r2 = new C8695r();
                        String str3 = Build.MANUFACTURER;
                        c8695r2.m3215u("make", str3);
                        c8695r2.m3215u("model", Build.MODEL);
                        c8695r2.m3215u("osv", Build.VERSION.RELEASE);
                        c8695r2.m3215u("carrier", ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName());
                        if ("Amazon".equals(str3)) {
                            str2 = "amazon";
                        } else {
                            str2 = "android";
                        }
                        c8695r2.m3215u("os", str2);
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                        c8695r2.m3216t("w", Integer.valueOf(displayMetrics.widthPixels));
                        c8695r2.m3216t("h", Integer.valueOf(displayMetrics.heightPixels));
                        try {
                            String userAgent = vungleApiClient.f19363a.getUserAgent();
                            vungleApiClient.f19388z = userAgent;
                            c8695r2.m3215u("ua", userAgent);
                            vungleApiClient.f19363a.mo1256d(new C9963q1(vungleApiClient));
                        } catch (Exception e) {
                            Log.e("com.vungle.warren.VungleApiClient", "Cannot Get UserAgent. Setting Default Device UserAgent." + e.getLocalizedMessage());
                        }
                        vungleApiClient.f19374l = c8695r2;
                        vungleApiClient.f19375m = c8695r;
                        vungleApiClient.f19383u = vungleApiClient.m1614f();
                        try {
                            AppSet.getClient(vungleApiClient.f19364b).getAppSetIdInfo().addOnSuccessListener(new C9966r1(vungleApiClient));
                        } catch (NoClassDefFoundError e2) {
                            Log.e("com.vungle.warren.VungleApiClient", "Required libs to get AppSetID Not available: " + e2.getLocalizedMessage());
                        }
                    }
                    if (c10118v1 != null) {
                        vungleApiClient.f19386x = false;
                    }
                    AdLoader adLoader = (AdLoader) this.f19344c.m1232c(AdLoader.class);
                    adLoader.f19278l.set((InterfaceC9982e) this.f19344c.m1232c(InterfaceC9982e.class));
                    adLoader.f19276j.mo1543b();
                    Vungle vungle2 = Vungle._instance;
                    if (vungle2.consent.get() != null) {
                        Vungle.saveGDPRConsent(c9928h, (Consent) vungle2.consent.get(), vungle2.consentVersion);
                    } else {
                        C9867g c9867g = (C9867g) c9928h.m1383p(C9867g.class, "consentIsImportantToVungle").get();
                        if (c9867g == null) {
                            vungle2.consent.set(null);
                            vungle2.consentVersion = null;
                        } else {
                            vungle2.consent.set(Vungle.getConsent(c9867g));
                            vungle2.consentVersion = Vungle.getConsentMessageVersion(c9867g);
                        }
                    }
                    if (vungle2.ccpaStatus.get() != null) {
                        Vungle.updateCCPAStatus(c9928h, (Consent) vungle2.ccpaStatus.get());
                    } else {
                        vungle2.ccpaStatus.set(Vungle.getCCPAStatus((C9867g) c9928h.m1383p(C9867g.class, "ccpaIsImportantToVungle").get()));
                    }
                } catch (C9919c.C9920a unused2) {
                    Vungle.onInitError(interfaceC10129x, new VungleException(26));
                    Vungle.deInit();
                    return;
                }
            }
            C9928h c9928h2 = (C9928h) this.f19344c.m1232c(C9928h.class);
            C9867g c9867g2 = (C9867g) c9928h2.m1383p(C9867g.class, "appId").get();
            if (c9867g2 == null) {
                c9867g2 = new C9867g("appId");
            }
            c9867g2.m1445d(this.f19342a, "appId");
            try {
                c9928h2.m1376w(c9867g2);
                Vungle._instance.configure(interfaceC10129x, false);
                ((InterfaceC9982e) this.f19344c.m1232c(InterfaceC9982e.class)).mo1353a(AnalyticsJob.m1362b(2, null, null, 1));
            } catch (C9919c.C9920a unused3) {
                if (interfaceC10129x != null) {
                    Vungle.onInitError(interfaceC10129x, new VungleException(26));
                }
                Vungle.isInitializing.set(false);
            }
        }
    }

    /* renamed from: com.vungle.warren.Vungle$l */
    /* loaded from: classes3.dex */
    public class RunnableC9732l implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10129x f19346a;

        public RunnableC9732l(InterfaceC10129x interfaceC10129x) {
            this.f19346a = interfaceC10129x;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Vungle.onInitError(this.f19346a, new VungleException(39));
        }
    }

    /* renamed from: com.vungle.warren.Vungle$m */
    /* loaded from: classes3.dex */
    public class RunnableC9733m implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9822k0 f19347a;

        public RunnableC9733m(C9822k0 c9822k0) {
            this.f19347a = c9822k0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Vungle._instance.configure(this.f19347a.f19611b.get(), true);
        }
    }

    /* renamed from: com.vungle.warren.Vungle$n */
    /* loaded from: classes3.dex */
    public class RunnableC9734n implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9822k0 f19348a;

        public RunnableC9734n(C9822k0 c9822k0) {
            this.f19348a = c9822k0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Vungle.onInitError(this.f19348a.f19611b.get(), new VungleException(39));
        }
    }

    /* renamed from: com.vungle.warren.Vungle$o */
    /* loaded from: classes3.dex */
    public class C9735o implements C9846m1.InterfaceC9849c {
    }

    /* renamed from: com.vungle.warren.Vungle$p */
    /* loaded from: classes3.dex */
    public class C9736p implements Comparator<Placement> {

        /* renamed from: a */
        public final /* synthetic */ C10118v1 f19349a;

        public C9736p(C10118v1 c10118v1) {
            this.f19349a = c10118v1;
        }

        @Override // java.util.Comparator
        public final int compare(Placement placement, Placement placement2) {
            Placement placement3 = placement;
            Placement placement4 = placement2;
            if (this.f19349a != null) {
                if (placement3.f19769a.equals(null)) {
                    return -1;
                }
                if (placement4.f19769a.equals(null)) {
                    return 1;
                }
            }
            return Integer.valueOf(placement3.f19774f).compareTo(Integer.valueOf(placement4.f19774f));
        }
    }

    /* renamed from: com.vungle.warren.Vungle$q */
    /* loaded from: classes3.dex */
    public class RunnableC9737q implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f19350a;

        /* renamed from: b */
        public final /* synthetic */ AdLoader f19351b;

        public RunnableC9737q(ArrayList arrayList, AdLoader adLoader) {
            this.f19350a = arrayList;
            this.f19351b = adLoader;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (Placement placement : this.f19350a) {
                this.f19351b.m1636m(placement, placement.m1460a(), 0L, false);
            }
        }
    }

    /* renamed from: com.vungle.warren.Vungle$r */
    /* loaded from: classes3.dex */
    public class C9738r implements InterfaceC9892b<C8695r> {

        /* renamed from: a */
        public final /* synthetic */ C9924e f19352a;

        public C9738r(C9924e c9924e) {
            this.f19352a = c9924e;
        }

        @Override // com.vungle.warren.network.InterfaceC9892b
        /* renamed from: a */
        public final void mo1435a(C9901e c9901e) {
            if (c9901e.m1430a()) {
                C9924e c9924e = this.f19352a;
                c9924e.m1404g("reported", true);
                c9924e.m1410a();
                Log.d(Vungle.TAG, "Saving reported state to shared preferences");
            }
        }

        @Override // com.vungle.warren.network.InterfaceC9892b
        /* renamed from: b */
        public final void mo1434b(Throwable th) {
        }
    }

    /* renamed from: com.vungle.warren.Vungle$s */
    /* loaded from: classes3.dex */
    public class RunnableC9739s implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C10114v0 f19353a;

        /* renamed from: b */
        public final /* synthetic */ String f19354b;

        /* renamed from: c */
        public final /* synthetic */ String f19355c;

        /* renamed from: d */
        public final /* synthetic */ String f19356d;

        /* renamed from: e */
        public final /* synthetic */ String f19357e;

        /* renamed from: f */
        public final /* synthetic */ String f19358f;

        public RunnableC9739s(C10114v0 c10114v0, String str, String str2, String str3, String str4, String str5) {
            this.f19353a = c10114v0;
            this.f19354b = str;
            this.f19355c = str2;
            this.f19356d = str3;
            this.f19357e = str4;
            this.f19358f = str5;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!Vungle.isInitialized()) {
                Log.e(Vungle.TAG, "Vungle is not initialized");
                return;
            }
            C9928h c9928h = (C9928h) this.f19353a.m1232c(C9928h.class);
            C9867g c9867g = (C9867g) c9928h.m1383p(C9867g.class, "incentivizedTextSetByPub").get();
            if (c9867g == null) {
                c9867g = new C9867g("incentivizedTextSetByPub");
            }
            String str = this.f19354b;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            String str2 = this.f19355c;
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            String str3 = this.f19356d;
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            }
            String str4 = this.f19357e;
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            String str5 = this.f19358f;
            String str6 = TextUtils.isEmpty(str5) ? "" : str5;
            c9867g.m1445d(str, AppIntroBaseFragmentKt.ARG_TITLE);
            c9867g.m1445d(str2, "body");
            c9867g.m1445d(str3, "continue");
            c9867g.m1445d(str4, "close");
            c9867g.m1445d(str6, "userID");
            try {
                c9928h.m1376w(c9867g);
            } catch (C9919c.C9920a e) {
                Log.e(Vungle.TAG, "Cannot save incentivized cookie", e);
            }
        }
    }

    private Vungle() {
    }

    @Nullable
    public static Context appContext() {
        Vungle vungle = _instance;
        if (vungle != null) {
            return vungle.context;
        }
        return null;
    }

    public static boolean canPlayAd(Advertisement advertisement) {
        Context context = _instance.context;
        if (context == null) {
            return false;
        }
        AdLoader adLoader = (AdLoader) C10114v0.m1234a(context).m1232c(AdLoader.class);
        adLoader.getClass();
        if (advertisement == null || advertisement.f19725M != 1) {
            return false;
        }
        return adLoader.m1640i(advertisement);
    }

    public static boolean canPlayAd(@NonNull String str) {
        return canPlayAd(str, null);
    }

    public static boolean canPlayAd(@NonNull String str, @Nullable String str2) {
        String str3;
        String str4;
        Context context = _instance.context;
        if (context == null) {
            str3 = TAG;
            str4 = "Context is null";
        } else if (TextUtils.isEmpty(str)) {
            str3 = TAG;
            str4 = "AdMarkup/PlacementId is null";
        } else {
            AbstractC9853a m1278a = C10078c.m1278a(str2);
            if (str2 == null || m1278a != null) {
                C10114v0 m1234a = C10114v0.m1234a(context);
                return Boolean.TRUE.equals(new FutureC9926f(((InterfaceC10086h) m1234a.m1232c(InterfaceC10086h.class)).mo1249a().submit(new CallableC9719a(context, str2, str))).get(((InterfaceC10107v) m1234a.m1232c(InterfaceC10107v.class)).mo1238a(), TimeUnit.MILLISECONDS));
            }
            str3 = TAG;
            str4 = "Invalid AdMarkup";
        }
        Log.e(str3, str4);
        return false;
    }

    private static void clearAdvertisements() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
            return;
        }
        C10114v0 m1234a = C10114v0.m1234a(_instance.context);
        ((InterfaceC10086h) m1234a.m1232c(InterfaceC10086h.class)).mo1240j().execute(new RunnableC9725f(m1234a));
    }

    private static void clearCache() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
            return;
        }
        C10114v0 m1234a = C10114v0.m1234a(_instance.context);
        ((InterfaceC10086h) m1234a.m1232c(InterfaceC10086h.class)).mo1240j().execute(new RunnableC9724e(m1234a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void configure(@androidx.annotation.NonNull com.vungle.warren.InterfaceC10129x r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 1445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.Vungle.configure(com.vungle.warren.x, boolean):void");
    }

    public static void deInit() {
        Vungle vungle = _instance;
        Context context = vungle.context;
        if (context != null) {
            C10114v0 m1234a = C10114v0.m1234a(context);
            if (m1234a.m1230e(C9914a.class)) {
                ((C9914a) m1234a.m1232c(C9914a.class)).m1415f(cacheListener);
            }
            if (m1234a.m1230e(Downloader.class)) {
                ((Downloader) m1234a.m1232c(Downloader.class)).mo1542c();
            }
            if (m1234a.m1230e(AdLoader.class)) {
                ((AdLoader) m1234a.m1232c(AdLoader.class)).m1647b();
            }
            vungle.playOperations.clear();
        }
        synchronized (C10114v0.class) {
            C10114v0.f20357d = null;
        }
        isInitialized = false;
        isDepInit.set(false);
        isInitializing.set(false);
    }

    public static Context getAppContext() {
        return _instance.context;
    }

    public static String getAvailableBidTokens(@NonNull Context context) {
        return getAvailableBidTokens(context, null, 0);
    }

    @Nullable
    public static String getAvailableBidTokens(@NonNull Context context, @Nullable String str, int i) {
        if (context == null) {
            Log.e(TAG, "Context is null");
            return null;
        }
        C10114v0 m1234a = C10114v0.m1234a(context);
        return (String) new FutureC9926f(((InterfaceC10086h) m1234a.m1232c(InterfaceC10086h.class)).mo1249a().submit(new CallableC9729i((C9911p) m1234a.m1232c(C9911p.class), str, i))).get(((InterfaceC10107v) m1234a.m1232c(InterfaceC10107v.class)).mo1238a(), TimeUnit.MILLISECONDS);
    }

    @Deprecated
    public static String getAvailableBidTokensBySize(@NonNull Context context, int i) {
        return getAvailableBidTokens(context, null, i);
    }

    @Nullable
    public static C10055l getBannerViewInternal(String str, AbstractC9853a abstractC9853a, AdConfig adConfig, InterfaceC9782e0 interfaceC9782e0) {
        VungleException vungleException;
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized, returned VungleBannerView = null");
            vungleException = new VungleException(9);
        } else if (TextUtils.isEmpty(str)) {
            vungleException = new VungleException(13);
        } else {
            Vungle vungle = _instance;
            C10114v0 m1234a = C10114v0.m1234a(vungle.context);
            AdLoader adLoader = (AdLoader) m1234a.m1232c(AdLoader.class);
            boolean z = true;
            AdRequest adRequest = new AdRequest(str, abstractC9853a, true);
            AdLoader.C9718f c9718f = (AdLoader.C9718f) adLoader.f19267a.get(adRequest);
            z = (c9718f == null || !c9718f.f19302i.get()) ? false : false;
            if (!Boolean.TRUE.equals(vungle.playOperations.get(str)) && !z) {
                try {
                    return new C10055l(vungle.context.getApplicationContext(), adRequest, adConfig, (InterfaceC9800h0) m1234a.m1232c(InterfaceC9800h0.class), new C9758c(adRequest, vungle.playOperations, interfaceC9782e0, (C9928h) m1234a.m1232c(C9928h.class), adLoader, (InterfaceC9982e) m1234a.m1232c(InterfaceC9982e.class), (C9890n1) m1234a.m1232c(C9890n1.class), null, null));
                } catch (Exception e) {
                    VungleLogger.m1603c("Vungle#playAd", "Vungle banner ad fail: " + e.getLocalizedMessage());
                    if (interfaceC9782e0 != null) {
                        interfaceC9782e0.onError(str, new VungleException(10));
                    }
                    return null;
                }
            }
            String str2 = TAG;
            Log.e(str2, "Playing or Loading operation ongoing. Playing " + vungle.playOperations.get(adRequest.f19307b) + " Loading: " + z);
            vungleException = new VungleException(8);
        }
        onPlayError(str, interfaceC9782e0, vungleException);
        return null;
    }

    @Nullable
    public static Consent getCCPAStatus() {
        return _instance.ccpaStatus.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Consent getCCPAStatus(@Nullable C9867g c9867g) {
        if (c9867g == null) {
            return null;
        }
        return "opted_out".equals(c9867g.m1446c("ccpa_status")) ? Consent.OPTED_OUT : Consent.OPTED_IN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Consent getConsent(C9867g c9867g) {
        if (c9867g == null) {
            return null;
        }
        return "opted_in".equals(c9867g.m1446c("consent_status")) ? Consent.OPTED_IN : Consent.OPTED_OUT;
    }

    public static String getConsentMessageVersion() {
        return _instance.consentVersion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getConsentMessageVersion(C9867g c9867g) {
        if (c9867g == null) {
            return null;
        }
        return c9867g.m1446c("consent_message_version");
    }

    private static String getConsentSource(C9867g c9867g) {
        if (c9867g == null) {
            return null;
        }
        return c9867g.m1446c("consent_source");
    }

    @Nullable
    public static Consent getConsentStatus() {
        return (isInitialized() && isDepInit.get()) ? getConsentStatus(getGDPRConsent()) : _instance.consent.get();
    }

    private static Consent getConsentStatus(C9867g c9867g) {
        AtomicReference<Consent> atomicReference;
        Consent consent;
        if (c9867g == null) {
            return null;
        }
        String m1446c = c9867g.m1446c("consent_status");
        m1446c.getClass();
        char c = 65535;
        switch (m1446c.hashCode()) {
            case -83053070:
                if (m1446c.equals("opted_in")) {
                    c = 0;
                    break;
                }
                break;
            case 1230717015:
                if (m1446c.equals("opted_out_by_timeout")) {
                    c = 1;
                    break;
                }
                break;
            case 1720328225:
                if (m1446c.equals("opted_out")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                atomicReference = _instance.consent;
                consent = Consent.OPTED_IN;
                break;
            case 1:
            case 2:
                atomicReference = _instance.consent;
                consent = Consent.OPTED_OUT;
                break;
            default:
                return null;
        }
        atomicReference.set(consent);
        return consent;
    }

    public static C9758c getEventListener(@NonNull AdRequest adRequest, @Nullable InterfaceC9782e0 interfaceC9782e0) {
        Vungle vungle = _instance;
        C10114v0 m1234a = C10114v0.m1234a(vungle.context);
        return new C9758c(adRequest, vungle.playOperations, interfaceC9782e0, (C9928h) m1234a.m1232c(C9928h.class), (AdLoader) m1234a.m1232c(AdLoader.class), (InterfaceC9982e) m1234a.m1232c(InterfaceC9982e.class), (C9890n1) m1234a.m1232c(C9890n1.class), null, null);
    }

    @Nullable
    private static C9867g getGDPRConsent() {
        C10114v0 m1234a = C10114v0.m1234a(_instance.context);
        return (C9867g) ((C9928h) m1234a.m1232c(C9928h.class)).m1383p(C9867g.class, "consentIsImportantToVungle").get(((InterfaceC10107v) m1234a.m1232c(InterfaceC10107v.class)).mo1238a(), TimeUnit.MILLISECONDS);
    }

    @VisibleForTesting
    public static Collection<Advertisement> getValidAdvertisementModels(@NonNull String str) {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized return empty placements list");
            return Collections.emptyList();
        }
        C10114v0 m1234a = C10114v0.m1234a(_instance.context);
        List<Advertisement> list = ((C9928h) m1234a.m1232c(C9928h.class)).m1386m(str, null).get(((InterfaceC10107v) m1234a.m1232c(InterfaceC10107v.class)).mo1238a(), TimeUnit.MILLISECONDS);
        return list == null ? Collections.emptyList() : list;
    }

    @VisibleForTesting
    public static Collection<Placement> getValidPlacementModels() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized return empty placements list");
            return Collections.emptyList();
        }
        C10114v0 m1234a = C10114v0.m1234a(_instance.context);
        Collection<Placement> collection = ((C9928h) m1234a.m1232c(C9928h.class)).m1378u().get(((InterfaceC10107v) m1234a.m1232c(InterfaceC10107v.class)).mo1238a(), TimeUnit.MILLISECONDS);
        return collection == null ? Collections.emptyList() : collection;
    }

    public static Collection<String> getValidPlacements() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized return empty placements list");
            return Collections.emptyList();
        }
        C10114v0 m1234a = C10114v0.m1234a(_instance.context);
        C9928h c9928h = (C9928h) m1234a.m1232c(C9928h.class);
        c9928h.getClass();
        Collection<String> collection = (Collection) new FutureC9926f(c9928h.f19930b.submit(new CallableC9949m(c9928h))).get(((InterfaceC10107v) m1234a.m1232c(InterfaceC10107v.class)).mo1238a(), TimeUnit.MILLISECONDS);
        if (collection == null) {
            return Collections.emptyList();
        }
        return collection;
    }

    public static void init(@NonNull String str, @NonNull Context context, @NonNull InterfaceC10129x interfaceC10129x) throws IllegalArgumentException {
        init(str, context, interfaceC10129x, new C10118v1(new C10118v1.C10119a()));
    }

    public static boolean isInitialized() {
        return isInitialized && _instance.context != null;
    }

    public static void loadAd(@NonNull String str, @Nullable AdConfig adConfig, @Nullable InterfaceC10136z interfaceC10136z) {
        loadAd(str, null, adConfig, interfaceC10136z);
    }

    public static void loadAd(@NonNull String str, @Nullable InterfaceC10136z interfaceC10136z) {
        loadAd(str, new AdConfig(), interfaceC10136z);
    }

    public static void loadAd(@NonNull String str, @Nullable String str2, @Nullable AdConfig adConfig, @Nullable InterfaceC10136z interfaceC10136z) {
        VungleException vungleException;
        VungleLogger.m1604b("Vungle#loadAd", "loadAd API call invoked");
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
            vungleException = new VungleException(9);
        } else if (adConfig != null && !AdConfig.AdSize.isDefaultAdSize(adConfig.m1425a())) {
            vungleException = new VungleException(29);
        } else {
            C10114v0 m1234a = C10114v0.m1234a(_instance.context);
            Placement placement = (Placement) ((C9928h) m1234a.m1232c(C9928h.class)).m1383p(Placement.class, str).get(((InterfaceC10107v) m1234a.m1232c(InterfaceC10107v.class)).mo1238a(), TimeUnit.MILLISECONDS);
            if (placement != null && placement.f19777i == 4) {
                vungleException = new VungleException(41);
            } else {
                loadAdInternal(str, str2, adConfig, interfaceC10136z);
                return;
            }
        }
        onLoadError(str, interfaceC10136z, vungleException);
    }

    public static void loadAdInternal(@NonNull String str, @Nullable String str2, @Nullable AdConfig adConfig, @Nullable InterfaceC10136z interfaceC10136z) {
        InterfaceC10136z c9747a0;
        AdConfig adConfig2;
        VungleException vungleException;
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
            vungleException = new VungleException(9);
        } else {
            C10114v0 m1234a = C10114v0.m1234a(_instance.context);
            if (interfaceC10136z instanceof InterfaceC9756b0) {
                c9747a0 = new C9759c0(((InterfaceC10086h) m1234a.m1232c(InterfaceC10086h.class)).mo1248b(), (InterfaceC9756b0) interfaceC10136z);
            } else {
                c9747a0 = new C9747a0(((InterfaceC10086h) m1234a.m1232c(InterfaceC10086h.class)).mo1248b(), interfaceC10136z);
            }
            AbstractC9853a m1278a = C10078c.m1278a(str2);
            if (str2 != null && m1278a == null) {
                vungleException = new VungleException(36);
            } else {
                AbstractC9853a m1278a2 = C10078c.m1278a(str2);
                AdLoader adLoader = (AdLoader) m1234a.m1232c(AdLoader.class);
                if (adConfig == null) {
                    adConfig2 = new AdConfig();
                } else {
                    adConfig2 = adConfig;
                }
                AdRequest adRequest = new AdRequest(str, m1278a2, true);
                adLoader.getClass();
                adLoader.m1637l(new AdLoader.C9718f(adRequest, adConfig2.m1425a(), 0L, 2000L, 5, 0, 0, true, 0, c9747a0));
                return;
            }
        }
        onLoadError(str, interfaceC10136z, vungleException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onInitError(InterfaceC10129x interfaceC10129x, VungleException vungleException) {
        if (interfaceC10129x != null) {
            interfaceC10129x.onError(vungleException);
        }
        if (vungleException != null) {
            VungleLogger.m1603c("Vungle#init", (vungleException.getLocalizedMessage() == null || !vungleException.getLocalizedMessage().isEmpty()) ? Integer.toString(vungleException.f19507a) : vungleException.getLocalizedMessage());
        }
    }

    private static void onLoadError(String str, @Nullable InterfaceC10136z interfaceC10136z, VungleException vungleException) {
        if (interfaceC10136z != null) {
            interfaceC10136z.onError(str, vungleException);
        }
        if (vungleException != null) {
            VungleLogger.m1603c("Vungle#loadAd", (vungleException.getLocalizedMessage() == null || !vungleException.getLocalizedMessage().isEmpty()) ? Integer.toString(vungleException.f19507a) : vungleException.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onPlayError(String str, InterfaceC9782e0 interfaceC9782e0, VungleException vungleException) {
        String num;
        if (interfaceC9782e0 != null) {
            interfaceC9782e0.onError(str, vungleException);
        }
        if (vungleException != null) {
            if (vungleException.getLocalizedMessage() != null && vungleException.getLocalizedMessage().isEmpty()) {
                num = vungleException.getLocalizedMessage();
            } else {
                num = Integer.toString(vungleException.f19507a);
            }
            VungleLogger.m1603c("Vungle#playAd", num);
        }
        C9846m1 m1477b = C9846m1.m1477b();
        C8695r c8695r = new C8695r();
        c8695r.m3215u("event", C0539e.m12265a(3));
        c8695r.m3217s(C1828a.m9909a(3), Boolean.FALSE);
        m1477b.m1474e(new C9879m(3, c8695r));
    }

    public static void playAd(@NonNull String str, AdConfig adConfig, @Nullable InterfaceC9782e0 interfaceC9782e0) {
        playAd(str, null, adConfig, interfaceC9782e0);
    }

    public static void playAd(@NonNull String str, @Nullable String str2, AdConfig adConfig, @Nullable InterfaceC9782e0 interfaceC9782e0) {
        String str3;
        boolean z;
        VungleLogger.m1604b("Vungle#playAd", "playAd call invoked");
        C9846m1 m1477b = C9846m1.m1477b();
        m1477b.getClass();
        if (adConfig != null && adConfig.f19891c) {
            C8695r c8695r = new C8695r();
            c8695r.m3215u("event", C0539e.m12265a(13));
            if ((adConfig.f19889a & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            c8695r.m3217s(C1828a.m9909a(9), Boolean.valueOf(z));
            m1477b.m1474e(new C9879m(13, c8695r));
        }
        if (adConfig != null && adConfig.f19265f) {
            C8695r c8695r2 = new C8695r();
            c8695r2.m3215u("event", C0539e.m12265a(12));
            int m1652e = adConfig.m1652e();
            if (m1652e != 0) {
                if (m1652e != 1) {
                    if (m1652e != 2) {
                        if (m1652e != 3) {
                            str3 = SchedulerSupport.NONE;
                        } else {
                            str3 = "match_video";
                        }
                    } else {
                        str3 = "auto_rotate";
                    }
                } else {
                    str3 = "landscape";
                }
            } else {
                str3 = "portrait";
            }
            c8695r2.m3215u(C1828a.m9909a(5), str3);
            m1477b.m1474e(new C9879m(12, c8695r2));
        }
        if (!isInitialized()) {
            Log.e(TAG, "Locator is not initialized");
            if (interfaceC9782e0 != null) {
                onPlayError(str, interfaceC9782e0, new VungleException(9));
            }
        } else if (TextUtils.isEmpty(str)) {
            onPlayError(str, interfaceC9782e0, new VungleException(13));
        } else {
            AbstractC9853a m1278a = C10078c.m1278a(str2);
            if (str2 != null && m1278a == null) {
                onPlayError(str, interfaceC9782e0, new VungleException(36));
                return;
            }
            C10114v0 m1234a = C10114v0.m1234a(_instance.context);
            InterfaceC10086h interfaceC10086h = (InterfaceC10086h) m1234a.m1232c(InterfaceC10086h.class);
            C9928h c9928h = (C9928h) m1234a.m1232c(C9928h.class);
            VungleApiClient vungleApiClient = (VungleApiClient) m1234a.m1232c(VungleApiClient.class);
            C9785f0 c9785f0 = new C9785f0(interfaceC10086h.mo1248b(), interfaceC9782e0);
            RunnableC9720b runnableC9720b = new RunnableC9720b(str, c9785f0);
            interfaceC10086h.mo1240j().m1236a(new RunnableC9721c(str2, str, (AdLoader) m1234a.m1232c(AdLoader.class), c9785f0, c9928h, adConfig, vungleApiClient, interfaceC10086h, runnableC9720b), runnableC9720b);
        }
    }

    public static void reConfigure() {
        Vungle vungle = _instance;
        Context context = vungle.context;
        if (context == null) {
            return;
        }
        C10114v0 m1234a = C10114v0.m1234a(context);
        InterfaceC10086h interfaceC10086h = (InterfaceC10086h) m1234a.m1232c(InterfaceC10086h.class);
        C9822k0 c9822k0 = (C9822k0) m1234a.m1232c(C9822k0.class);
        if (isInitialized()) {
            interfaceC10086h.mo1240j().m1236a(new RunnableC9733m(c9822k0), new RunnableC9734n(c9822k0));
        } else {
            init(vungle.appID, vungle.context, c9822k0.f19611b.get());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void renderAd(@NonNull AdRequest adRequest, @Nullable InterfaceC9782e0 interfaceC9782e0, Placement placement, Advertisement advertisement) {
        synchronized (Vungle.class) {
            if (!isInitialized()) {
                Log.e(TAG, "Sdk is not initialized");
                return;
            }
            Vungle vungle = _instance;
            C10114v0 m1234a = C10114v0.m1234a(vungle.context);
            AbstractActivityC9743a.f19393j = new C9723d(adRequest, vungle.playOperations, interfaceC9782e0, (C9928h) m1234a.m1232c(C9928h.class), (AdLoader) m1234a.m1232c(AdLoader.class), (InterfaceC9982e) m1234a.m1232c(InterfaceC9982e.class), (C9890n1) m1234a.m1232c(C9890n1.class), placement, advertisement);
            Intent intent = new Intent(vungle.context, VungleActivity.class);
            intent.addFlags(268435456);
            Bundle bundle = new Bundle();
            bundle.putSerializable("request", adRequest);
            intent.putExtras(bundle);
            C10069a.m1284d(vungle.context, null, intent, null, null);
        }
    }

    private void saveConfigExtension(C9928h c9928h, C8695r c8695r) throws C9919c.C9920a {
        C9867g c9867g = new C9867g("config_extension");
        c9867g.m1445d(c8695r.m3219A("config_extension") ? C9874j.m1442b(c8695r, "config_extension", "") : "", "config_extension");
        c9928h.m1376w(c9867g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveGDPRConsent(@NonNull C9928h c9928h, @NonNull Consent consent, @Nullable String str) {
        C9727g c9727g = new C9727g(c9928h, consent, str);
        c9928h.getClass();
        c9928h.f19930b.execute(new RunnableC9957u(c9928h, "consentIsImportantToVungle", C9867g.class, c9727g));
    }

    public static void setHeaderBiddingCallback(InterfaceC10113v interfaceC10113v) {
        Context context = _instance.context;
        if (context == null) {
            return;
        }
        C10114v0 m1234a = C10114v0.m1234a(context);
        ((C9822k0) m1234a.m1232c(C9822k0.class)).f19610a.set(new C10124w(((InterfaceC10086h) m1234a.m1232c(InterfaceC10086h.class)).mo1248b(), interfaceC10113v));
    }

    public static void setIncentivizedFields(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized, context is null");
            return;
        }
        C10114v0 m1234a = C10114v0.m1234a(_instance.context);
        ((InterfaceC10086h) m1234a.m1232c(InterfaceC10086h.class)).mo1240j().execute(new RunnableC9739s(m1234a, str2, str3, str4, str5, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    public static void stopPlaying() {
        boolean z;
        ArrayList<C1520a.C1523c> arrayList;
        int i;
        String str;
        ?? r12;
        String str2;
        Vungle vungle = _instance;
        if (vungle.context == null) {
            return;
        }
        Intent intent = new Intent("AdvertisementBus");
        intent.putExtra("command", "stopAll");
        C1520a m10509a = C1520a.m10509a(vungle.context);
        synchronized (m10509a.f3499b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(m10509a.f3498a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            int i2 = 1;
            if ((intent.getFlags() & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<C1520a.C1523c> arrayList2 = m10509a.f3500c.get(intent.getAction());
            if (arrayList2 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                }
                ArrayList arrayList3 = null;
                int i3 = 0;
                while (i3 < arrayList2.size()) {
                    C1520a.C1523c c1523c = arrayList2.get(i3);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + c1523c.f3506a);
                    }
                    if (c1523c.f3508c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        arrayList = arrayList2;
                        i = i3;
                        str = action;
                        r12 = i2;
                    } else {
                        String str3 = action;
                        arrayList = arrayList2;
                        i = i3;
                        str = action;
                        r12 = i2;
                        int match = c1523c.f3506a.match(str3, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(c1523c);
                            c1523c.f3508c = r12;
                        } else if (z) {
                            if (match != -4) {
                                if (match != -3) {
                                    if (match != -2) {
                                        if (match != -1) {
                                            str2 = "unknown reason";
                                        } else {
                                            str2 = "type";
                                        }
                                    } else {
                                        str2 = "data";
                                    }
                                } else {
                                    str2 = "action";
                                }
                            } else {
                                str2 = "category";
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + str2);
                        }
                    }
                    i3 = i + 1;
                    i2 = r12;
                    arrayList2 = arrayList;
                    action = str;
                }
                int i4 = i2;
                if (arrayList3 != null) {
                    for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                        ((C1520a.C1523c) arrayList3.get(i5)).f3508c = false;
                    }
                    m10509a.f3501d.add(new C1520a.C1522b(intent, arrayList3));
                    if (!m10509a.f3502e.hasMessages(i4)) {
                        m10509a.f3502e.sendEmptyMessage(i4);
                    }
                }
            }
        }
    }

    public static void updateCCPAStatus(@NonNull Consent consent) {
        if (consent == null) {
            Log.e(TAG, "Unable to update CCPA status, Invalid input parameter.");
            return;
        }
        Vungle vungle = _instance;
        vungle.ccpaStatus.set(consent);
        if (isInitialized() && isDepInit.get()) {
            updateCCPAStatus((C9928h) C10114v0.m1234a(vungle.context).m1232c(C9928h.class), consent);
        } else {
            Log.e(TAG, "Vungle is not initialized");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateCCPAStatus(@NonNull C9928h c9928h, @NonNull Consent consent) {
        C9728h c9728h = new C9728h(c9928h, consent);
        c9928h.getClass();
        c9928h.f19930b.execute(new RunnableC9957u(c9928h, "ccpaIsImportantToVungle", C9867g.class, c9728h));
    }

    public static void updateConsentStatus(@NonNull Consent consent, @Nullable String str) {
        if (consent == null) {
            Log.e(TAG, "Cannot set consent with a null consent, please check your code");
            return;
        }
        Vungle vungle = _instance;
        vungle.consent.set(consent);
        vungle.consentVersion = str;
        if (isInitialized() && isDepInit.get()) {
            saveGDPRConsent((C9928h) C10114v0.m1234a(vungle.context).m1232c(C9928h.class), vungle.consent.get(), vungle.consentVersion);
        } else {
            Log.e(TAG, "Vungle is not initialized");
        }
    }

    public static void updateUserCoppaStatus(boolean z) {
        ExecutorService executorService;
        C9818j0 m1500b = C9818j0.m1500b();
        Boolean valueOf = Boolean.valueOf(z);
        m1500b.getClass();
        if (valueOf != null) {
            C9818j0.f19599c.set(valueOf);
            if (m1500b.f19602a != null && (executorService = m1500b.f19603b) != null) {
                executorService.execute(new RunnableC9809i0(m1500b, valueOf));
            }
        }
        if (isInitialized()) {
            Log.e(TAG, "COPPA status changes should be passed before SDK initialization, they will ONLY take into effect during future SDK initializations and sessions");
        }
    }

    public static void init(@NonNull String str, @NonNull Context context, @NonNull InterfaceC10129x interfaceC10129x, @NonNull C10118v1 c10118v1) throws IllegalArgumentException {
        VungleLogger.m1604b("Vungle#init", "init request");
        C9846m1 m1477b = C9846m1.m1477b();
        C8695r c8695r = new C8695r();
        c8695r.m3215u("event", C0539e.m12265a(1));
        m1477b.m1474e(new C9879m(1, c8695r));
        if (interfaceC10129x == null) {
            C9846m1 m1477b2 = C9846m1.m1477b();
            C8695r c8695r2 = new C8695r();
            c8695r2.m3215u("event", C0539e.m12265a(2));
            c8695r2.m3217s(C1828a.m9909a(3), Boolean.FALSE);
            m1477b2.m1474e(new C9879m(2, c8695r2));
            throw new IllegalArgumentException("A valid InitCallback required to ensure API calls are being made after initialize is successful");
        } else if (context == null) {
            C9846m1 m1477b3 = C9846m1.m1477b();
            C8695r c8695r3 = new C8695r();
            c8695r3.m3215u("event", C0539e.m12265a(2));
            c8695r3.m3217s(C1828a.m9909a(3), Boolean.FALSE);
            m1477b3.m1474e(new C9879m(2, c8695r3));
            interfaceC10129x.onError(new VungleException(6));
        } else {
            C10114v0 m1234a = C10114v0.m1234a(context);
            ((InterfaceC10100c) m1234a.m1232c(InterfaceC10100c.class)).mo1258b();
            C9822k0 c9822k0 = (C9822k0) C10114v0.m1234a(context).m1232c(C9822k0.class);
            c9822k0.f19612c.set(c10118v1);
            InterfaceC10086h interfaceC10086h = (InterfaceC10086h) m1234a.m1232c(InterfaceC10086h.class);
            InterfaceC10129x c10131y = interfaceC10129x instanceof C10131y ? interfaceC10129x : new C10131y(interfaceC10086h.mo1248b(), interfaceC10129x);
            if (str == null || str.isEmpty()) {
                c10131y.onError(new VungleException(6));
                C9846m1 m1477b4 = C9846m1.m1477b();
                C8695r c8695r4 = new C8695r();
                c8695r4.m3215u("event", C0539e.m12265a(2));
                c8695r4.m3217s(C1828a.m9909a(3), Boolean.FALSE);
                m1477b4.m1474e(new C9879m(2, c8695r4));
            } else if (!(context instanceof Application)) {
                c10131y.onError(new VungleException(7));
                C9846m1 m1477b5 = C9846m1.m1477b();
                C8695r c8695r5 = new C8695r();
                c8695r5.m3215u("event", C0539e.m12265a(2));
                c8695r5.m3217s(C1828a.m9909a(3), Boolean.FALSE);
                m1477b5.m1474e(new C9879m(2, c8695r5));
            } else if (isInitialized()) {
                Log.d(TAG, "init already complete");
                c10131y.onSuccess();
                VungleLogger.m1604b("Vungle#init", "init already complete");
                C9846m1 m1477b6 = C9846m1.m1477b();
                C8695r c8695r6 = new C8695r();
                c8695r6.m3215u("event", C0539e.m12265a(2));
                c8695r6.m3217s(C1828a.m9909a(3), Boolean.FALSE);
                m1477b6.m1474e(new C9879m(2, c8695r6));
            } else if (isInitializing.getAndSet(true)) {
                Log.d(TAG, "init ongoing");
                onInitError(c10131y, new VungleException(8));
                C9846m1 m1477b7 = C9846m1.m1477b();
                C8695r c8695r7 = new C8695r();
                c8695r7.m3215u("event", C0539e.m12265a(2));
                c8695r7.m3217s(C1828a.m9909a(3), Boolean.FALSE);
                m1477b7.m1474e(new C9879m(2, c8695r7));
            } else if (PermissionChecker.m12018a(context, "android.permission.ACCESS_NETWORK_STATE") == 0 && PermissionChecker.m12018a(context, "android.permission.INTERNET") == 0) {
                C9846m1 m1477b8 = C9846m1.m1477b();
                long currentTimeMillis = System.currentTimeMillis();
                m1477b8.getClass();
                C9846m1.f19682p = currentTimeMillis;
                c9822k0.f19611b.set(c10131y);
                interfaceC10086h.mo1240j().m1236a(new RunnableC9731k(str, c9822k0, m1234a, context), new RunnableC9732l(interfaceC10129x));
            } else {
                Log.e(TAG, "Network permissions not granted");
                onInitError(c10131y, new VungleException(34));
                isInitializing.set(false);
                C9846m1 m1477b9 = C9846m1.m1477b();
                C8695r c8695r8 = new C8695r();
                c8695r8.m3215u("event", C0539e.m12265a(2));
                c8695r8.m3217s(C1828a.m9909a(3), Boolean.FALSE);
                m1477b9.m1474e(new C9879m(2, c8695r8));
            }
        }
    }

    @Deprecated
    public static void init(@NonNull Collection<String> collection, @NonNull String str, @NonNull Context context, @NonNull InterfaceC10129x interfaceC10129x) throws IllegalArgumentException {
        init(str, context, interfaceC10129x, new C10118v1(new C10118v1.C10119a()));
    }
}
