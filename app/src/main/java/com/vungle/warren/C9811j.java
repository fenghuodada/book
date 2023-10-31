package com.vungle.warren;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.warren.AbstractActivityC9743a;
import com.vungle.warren.AdConfig;
import com.vungle.warren.InterfaceC9800h0;
import com.vungle.warren.analytics.C9752b;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.AdAsset;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.C9867g;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.admarkup.AbstractC9853a;
import com.vungle.warren.omsdk.C9908c;
import com.vungle.warren.p058ui.C10000c;
import com.vungle.warren.p058ui.InterfaceC10008d;
import com.vungle.warren.p058ui.InterfaceC9998a;
import com.vungle.warren.p058ui.contract.InterfaceC10002a;
import com.vungle.warren.p058ui.contract.InterfaceC10003b;
import com.vungle.warren.p058ui.contract.InterfaceC10006d;
import com.vungle.warren.p058ui.presenter.C10012a;
import com.vungle.warren.p058ui.presenter.C10019d;
import com.vungle.warren.p058ui.state.InterfaceC10030b;
import com.vungle.warren.p058ui.view.AbstractC10038a;
import com.vungle.warren.p058ui.view.C10048h;
import com.vungle.warren.p058ui.view.C10052j;
import com.vungle.warren.p058ui.view.C10055l;
import com.vungle.warren.p058ui.view.C10061n;
import com.vungle.warren.p058ui.view.C10065o;
import com.vungle.warren.p058ui.view.FullAdWidget;
import com.vungle.warren.persistence.C9919c;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.tasks.InterfaceC9982e;
import com.vungle.warren.utility.C10091l;
import com.vungle.warren.utility.C10111y;
import com.vungle.warren.utility.InterfaceC10086h;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.vungle.warren.j */
/* loaded from: classes3.dex */
public final class C9811j implements InterfaceC9800h0 {

    /* renamed from: k */
    public static final /* synthetic */ int f19556k = 0;

    /* renamed from: a */
    public final InterfaceC9982e f19557a;

    /* renamed from: b */
    public final VungleApiClient f19558b;

    /* renamed from: c */
    public AbstractAsyncTaskC9814c f19559c;

    /* renamed from: d */
    public final C9928h f19560d;

    /* renamed from: e */
    public final InterfaceC10128w1 f19561e;

    /* renamed from: f */
    public Advertisement f19562f;

    /* renamed from: g */
    public final AdLoader f19563g;

    /* renamed from: h */
    public final C9908c.C9909a f19564h;

    /* renamed from: i */
    public final ExecutorService f19565i;

    /* renamed from: j */
    public final C9812a f19566j = new C9812a();

    /* renamed from: com.vungle.warren.j$a */
    /* loaded from: classes3.dex */
    public class C9812a implements AbstractAsyncTaskC9814c.InterfaceC9815a {
        public C9812a() {
        }
    }

    /* renamed from: com.vungle.warren.j$b */
    /* loaded from: classes3.dex */
    public static class AsyncTaskC9813b extends AbstractAsyncTaskC9814c {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: f */
        public Context f19568f;

        /* renamed from: g */
        public final AdRequest f19569g;

        /* renamed from: h */
        public final AdConfig f19570h;

        /* renamed from: i */
        public final InterfaceC9800h0.InterfaceC9802b f19571i;

        /* renamed from: j */
        public final Bundle f19572j;

        /* renamed from: k */
        public final InterfaceC9982e f19573k;

        /* renamed from: l */
        public final AdLoader f19574l;

        /* renamed from: m */
        public final VungleApiClient f19575m;

        /* renamed from: n */
        public final C9908c.C9909a f19576n;

        public AsyncTaskC9813b(Context context, AdRequest adRequest, AdConfig adConfig, AdLoader adLoader, C9928h c9928h, InterfaceC10128w1 interfaceC10128w1, InterfaceC9982e interfaceC9982e, C10055l.C10058c c10058c, C9812a c9812a, VungleApiClient vungleApiClient, C9908c.C9909a c9909a) {
            super(c9928h, interfaceC10128w1, c9812a);
            this.f19568f = context;
            this.f19569g = adRequest;
            this.f19570h = adConfig;
            this.f19571i = c10058c;
            this.f19572j = null;
            this.f19573k = interfaceC9982e;
            this.f19574l = adLoader;
            this.f19575m = vungleApiClient;
            this.f19576n = c9909a;
        }

        @Override // com.vungle.warren.C9811j.AbstractAsyncTaskC9814c
        /* renamed from: a */
        public final void mo1502a() {
            this.f19579c = null;
            this.f19568f = null;
        }

        @Override // android.os.AsyncTask
        public final C9817e doInBackground(Void[] voidArr) {
            boolean m1640i;
            boolean z;
            String[] strArr;
            AdRequest adRequest = this.f19569g;
            try {
                Pair<Advertisement, Placement> m1504b = m1504b(adRequest, this.f19572j);
                Advertisement advertisement = (Advertisement) m1504b.first;
                boolean z2 = true;
                if (advertisement.f19737b != 1) {
                    int i = C9811j.f19556k;
                    Log.e("j", "Invalid Ad Type for Native Ad.");
                    return new C9817e(new VungleException(10));
                }
                Placement placement = (Placement) m1504b.second;
                AdLoader adLoader = this.f19574l;
                adLoader.getClass();
                if (advertisement.f19725M != 1) {
                    m1640i = false;
                } else {
                    m1640i = adLoader.m1640i(advertisement);
                }
                if (!m1640i) {
                    int i2 = C9811j.f19556k;
                    Log.e("j", "Advertisement is null or assets are missing");
                    return new C9817e(new VungleException(10));
                }
                C9928h c9928h = this.f19577a;
                C9867g c9867g = (C9867g) c9928h.m1383p(C9867g.class, "configSettings").get();
                if (c9867g != null && c9867g.m1448a("isAdDownloadOptEnabled").booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !advertisement.f19734V) {
                    List m1381r = c9928h.m1381r(advertisement.getId());
                    if (!m1381r.isEmpty()) {
                        advertisement.m1468g(m1381r);
                        try {
                            c9928h.m1376w(advertisement);
                        } catch (C9919c.C9920a unused) {
                            int i3 = C9811j.f19556k;
                            Log.e("j", "Unable to update tokens");
                        }
                    }
                }
                C9752b c9752b = new C9752b(this.f19573k);
                C10061n c10061n = new C10061n(advertisement, placement, ((InterfaceC10086h) C10114v0.m1234a(this.f19568f).m1232c(InterfaceC10086h.class)).mo1245e());
                File file = c9928h.m1385n(advertisement.getId()).get();
                if (file != null && file.isDirectory()) {
                    boolean equals = "mrec".equals(advertisement.f19718F);
                    AdConfig adConfig = this.f19570h;
                    if (equals && adConfig.m1425a() != AdConfig.AdSize.VUNGLE_MREC) {
                        int i4 = C9811j.f19556k;
                        Log.e("j", "Corresponding AdConfig#setAdSize must be passed for the type/size of banner ad");
                        return new C9817e(new VungleException(28));
                    } else if (placement.f19777i == 0) {
                        return new C9817e(new VungleException(10));
                    } else {
                        if (adConfig == null) {
                            adConfig = new AdConfig();
                        }
                        advertisement.f19757v = adConfig;
                        try {
                            c9928h.m1376w(advertisement);
                            if (!this.f19575m.f19381s || !advertisement.f19719G) {
                                z2 = false;
                            }
                            this.f19576n.getClass();
                            C9908c c9908c = new C9908c(z2);
                            c10061n.f20270n = c9908c;
                            C9928h c9928h2 = this.f19577a;
                            C10091l c10091l = new C10091l();
                            AbstractC9853a abstractC9853a = adRequest.f19308c;
                            if (abstractC9853a != null) {
                                strArr = abstractC9853a.f19809a;
                            } else {
                                strArr = null;
                            }
                            return new C9817e(null, new C10019d(advertisement, placement, c9928h2, c10091l, c9752b, c10061n, null, file, c9908c, strArr), c10061n);
                        } catch (C9919c.C9920a unused2) {
                            return new C9817e(new VungleException(26));
                        }
                    }
                }
                int i5 = C9811j.f19556k;
                Log.e("j", "Advertisement assets dir is missing");
                return new C9817e(new VungleException(26));
            } catch (VungleException e) {
                return new C9817e(e);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(C9817e c9817e) {
            InterfaceC9800h0.InterfaceC9802b interfaceC9802b;
            C9817e c9817e2 = c9817e;
            super.m1503c(c9817e2);
            if (!isCancelled() && (interfaceC9802b = this.f19571i) != null) {
                Pair pair = new Pair((InterfaceC10006d) c9817e2.f19596b, c9817e2.f19598d);
                C10055l c10055l = C10055l.this;
                c10055l.f20247f = null;
                VungleException vungleException = c9817e2.f19597c;
                InterfaceC10003b.InterfaceC10004a interfaceC10004a = c10055l.f20244c;
                if (vungleException != null) {
                    if (interfaceC10004a != null) {
                        ((C9758c) interfaceC10004a).m1589a(c10055l.f20245d.f19307b, vungleException);
                        return;
                    }
                    return;
                }
                c10055l.f20242a = (InterfaceC10006d) pair.first;
                c10055l.setWebViewClient((C10061n) pair.second);
                c10055l.f20242a.mo1334k(interfaceC10004a);
                c10055l.f20242a.mo1339c(c10055l, null);
                C10065o.m1293a(c10055l);
                c10055l.addJavascriptInterface(new C10000c(c10055l.f20242a), "Android");
                c10055l.getSettings().setMediaPlaybackRequiresUserGesture(false);
                AtomicReference<Boolean> atomicReference = c10055l.f20248g;
                if (atomicReference.get() != null) {
                    c10055l.setAdVisibility(atomicReference.get().booleanValue());
                }
                ViewGroup.LayoutParams layoutParams = c10055l.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -1;
                    layoutParams.width = -1;
                }
            }
        }
    }

    /* renamed from: com.vungle.warren.j$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractAsyncTaskC9814c extends AsyncTask<Void, Void, C9817e> {

        /* renamed from: a */
        public final C9928h f19577a;

        /* renamed from: b */
        public final InterfaceC10128w1 f19578b;

        /* renamed from: c */
        public InterfaceC9815a f19579c;

        /* renamed from: d */
        public final AtomicReference<Advertisement> f19580d = new AtomicReference<>();

        /* renamed from: e */
        public final AtomicReference<Placement> f19581e = new AtomicReference<>();

        /* renamed from: com.vungle.warren.j$c$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC9815a {
        }

        public AbstractAsyncTaskC9814c(C9928h c9928h, InterfaceC10128w1 interfaceC10128w1, C9812a c9812a) {
            this.f19577a = c9928h;
            this.f19578b = interfaceC10128w1;
            this.f19579c = c9812a;
        }

        /* renamed from: a */
        public abstract void mo1502a();

        /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.util.Pair<com.vungle.warren.model.Advertisement, com.vungle.warren.model.Placement> m1504b(com.vungle.warren.AdRequest r10, android.os.Bundle r11) throws com.vungle.warren.error.VungleException {
            /*
                Method dump skipped, instructions count: 389
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.C9811j.AbstractAsyncTaskC9814c.m1504b(com.vungle.warren.AdRequest, android.os.Bundle):android.util.Pair");
        }

        /* renamed from: c */
        public void m1503c(C9817e c9817e) {
            super.onPostExecute(c9817e);
            InterfaceC9815a interfaceC9815a = this.f19579c;
            if (interfaceC9815a != null) {
                this.f19581e.get();
                C9811j.this.f19562f = this.f19580d.get();
            }
        }
    }

    /* renamed from: com.vungle.warren.j$d */
    /* loaded from: classes3.dex */
    public static class AsyncTaskC9816d extends AbstractAsyncTaskC9814c {

        /* renamed from: f */
        public final AdLoader f19582f;
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: g */
        public FullAdWidget f19583g;
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: h */
        public Context f19584h;

        /* renamed from: i */
        public final AdRequest f19585i;

        /* renamed from: j */
        public final InterfaceC10030b f19586j;

        /* renamed from: k */
        public final InterfaceC9800h0.InterfaceC9801a f19587k;

        /* renamed from: l */
        public final Bundle f19588l;

        /* renamed from: m */
        public final InterfaceC9982e f19589m;

        /* renamed from: n */
        public final VungleApiClient f19590n;

        /* renamed from: o */
        public final InterfaceC9998a f19591o;

        /* renamed from: p */
        public final InterfaceC10008d f19592p;

        /* renamed from: q */
        public Advertisement f19593q;

        /* renamed from: r */
        public final C9908c.C9909a f19594r;

        public AsyncTaskC9816d(Context context, AdLoader adLoader, AdRequest adRequest, C9928h c9928h, InterfaceC10128w1 interfaceC10128w1, InterfaceC9982e interfaceC9982e, VungleApiClient vungleApiClient, FullAdWidget fullAdWidget, InterfaceC10030b interfaceC10030b, AbstractActivityC9743a.C9745b c9745b, AbstractActivityC9743a.C9744a c9744a, AbstractActivityC9743a.C9746c c9746c, C9812a c9812a, Bundle bundle, C9908c.C9909a c9909a) {
            super(c9928h, interfaceC10128w1, c9812a);
            this.f19585i = adRequest;
            this.f19583g = fullAdWidget;
            this.f19586j = interfaceC10030b;
            this.f19584h = context;
            this.f19587k = c9746c;
            this.f19588l = bundle;
            this.f19589m = interfaceC9982e;
            this.f19590n = vungleApiClient;
            this.f19592p = c9745b;
            this.f19591o = c9744a;
            this.f19582f = adLoader;
            this.f19594r = c9909a;
        }

        @Override // com.vungle.warren.C9811j.AbstractAsyncTaskC9814c
        /* renamed from: a */
        public final void mo1502a() {
            this.f19579c = null;
            this.f19584h = null;
            this.f19583g = null;
        }

        @Override // android.os.AsyncTask
        public final C9817e doInBackground(Void[] voidArr) {
            C9817e c9817e;
            Placement placement;
            boolean z;
            boolean z2;
            boolean z3;
            String[] strArr;
            String[] strArr2;
            int i;
            AdRequest adRequest = this.f19585i;
            try {
                Pair<Advertisement, Placement> m1504b = m1504b(adRequest, this.f19588l);
                Advertisement advertisement = (Advertisement) m1504b.first;
                this.f19593q = advertisement;
                placement = (Placement) m1504b.second;
                AdLoader adLoader = this.f19582f;
                adLoader.getClass();
                z = false;
                if (advertisement == null || ((i = advertisement.f19725M) != 1 && i != 2)) {
                    z2 = false;
                } else {
                    z2 = adLoader.m1640i(advertisement);
                }
            } catch (VungleException e) {
                c9817e = new C9817e(e);
            }
            if (!z2) {
                int i2 = C9811j.f19556k;
                Log.e("j", "Advertisement is null or assets are missing");
                return new C9817e(new VungleException(10));
            }
            int i3 = placement.f19777i;
            if (i3 == 4) {
                return new C9817e(new VungleException(41));
            }
            if (i3 != 0) {
                return new C9817e(new VungleException(29));
            }
            C9752b c9752b = new C9752b(this.f19589m);
            C9928h c9928h = this.f19577a;
            C9867g c9867g = (C9867g) c9928h.m1383p(C9867g.class, "appId").get();
            if (c9867g != null && !TextUtils.isEmpty(c9867g.m1446c("appId"))) {
                c9867g.m1446c("appId");
            }
            C9867g c9867g2 = (C9867g) c9928h.m1383p(C9867g.class, "configSettings").get();
            if (c9867g2 != null && c9867g2.m1448a("isAdDownloadOptEnabled").booleanValue()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                Advertisement advertisement2 = this.f19593q;
                if (!advertisement2.f19734V) {
                    List<AdAsset> m1381r = c9928h.m1381r(advertisement2.getId());
                    if (!m1381r.isEmpty()) {
                        this.f19593q.m1468g(m1381r);
                        try {
                            c9928h.m1376w(this.f19593q);
                        } catch (C9919c.C9920a unused) {
                            int i4 = C9811j.f19556k;
                            Log.e("j", "Unable to update tokens");
                        }
                    }
                }
            }
            C10061n c10061n = new C10061n(this.f19593q, placement, ((InterfaceC10086h) C10114v0.m1234a(this.f19584h).m1232c(InterfaceC10086h.class)).mo1245e());
            File file = c9928h.m1385n(this.f19593q.getId()).get();
            if (file != null && file.isDirectory()) {
                Advertisement advertisement3 = this.f19593q;
                int i5 = advertisement3.f19737b;
                AbstractC9853a abstractC9853a = adRequest.f19308c;
                InterfaceC9998a interfaceC9998a = this.f19591o;
                InterfaceC10008d interfaceC10008d = this.f19592p;
                if (i5 != 0) {
                    if (i5 != 1) {
                        return new C9817e(new VungleException(10));
                    }
                    if (this.f19590n.f19381s && advertisement3.f19719G) {
                        z = true;
                    }
                    this.f19594r.getClass();
                    C9908c c9908c = new C9908c(z);
                    c10061n.f20270n = c9908c;
                    Advertisement advertisement4 = this.f19593q;
                    C9928h c9928h2 = this.f19577a;
                    C10091l c10091l = new C10091l();
                    InterfaceC10030b interfaceC10030b = this.f19586j;
                    if (abstractC9853a != null) {
                        strArr2 = abstractC9853a.f19809a;
                    } else {
                        strArr2 = null;
                    }
                    c9817e = new C9817e(new C10052j(this.f19584h, this.f19583g, interfaceC10008d, interfaceC9998a), new C10019d(advertisement4, placement, c9928h2, c10091l, c9752b, c10061n, interfaceC10030b, file, c9908c, strArr2), c10061n);
                    return c9817e;
                }
                C9928h c9928h3 = this.f19577a;
                C10091l c10091l2 = new C10091l();
                InterfaceC10030b interfaceC10030b2 = this.f19586j;
                if (abstractC9853a != null) {
                    strArr = abstractC9853a.f19809a;
                } else {
                    strArr = null;
                }
                return new C9817e(new C10048h(this.f19584h, this.f19583g, interfaceC10008d, interfaceC9998a), new C10012a(advertisement3, placement, c9928h3, c10091l2, c9752b, c10061n, interfaceC10030b2, file, strArr), c10061n);
            }
            int i6 = C9811j.f19556k;
            Log.e("j", "Advertisement assets dir is missing");
            return new C9817e(new VungleException(26));
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(C9817e c9817e) {
            InterfaceC9800h0.InterfaceC9801a interfaceC9801a;
            C9817e c9817e2 = c9817e;
            super.m1503c(c9817e2);
            if (!isCancelled() && (interfaceC9801a = this.f19587k) != null) {
                VungleException vungleException = c9817e2.f19597c;
                if (vungleException != null) {
                    int i = C9811j.f19556k;
                    Log.e("j", "Exception on creating presenter", vungleException);
                    ((AbstractActivityC9743a.C9746c) interfaceC9801a).m1594a(new Pair<>(null, null), vungleException);
                    return;
                }
                FullAdWidget fullAdWidget = this.f19583g;
                InterfaceC10003b interfaceC10003b = c9817e2.f19596b;
                C10000c c10000c = new C10000c(interfaceC10003b);
                WebView webView = fullAdWidget.f20192e;
                if (webView != null) {
                    C10065o.m1293a(webView);
                    fullAdWidget.f20192e.setWebViewClient(c9817e2.f19598d);
                    fullAdWidget.f20192e.addJavascriptInterface(c10000c, "Android");
                }
                ((AbstractActivityC9743a.C9746c) interfaceC9801a).m1594a(new Pair<>(c9817e2.f19595a, interfaceC10003b), vungleException);
            }
        }
    }

    /* renamed from: com.vungle.warren.j$e */
    /* loaded from: classes3.dex */
    public static class C9817e {

        /* renamed from: a */
        public final InterfaceC10002a f19595a;

        /* renamed from: b */
        public final InterfaceC10003b f19596b;

        /* renamed from: c */
        public final VungleException f19597c;

        /* renamed from: d */
        public final C10061n f19598d;

        public C9817e(VungleException vungleException) {
            this.f19597c = vungleException;
        }

        public C9817e(AbstractC10038a abstractC10038a, InterfaceC10003b interfaceC10003b, C10061n c10061n) {
            this.f19595a = abstractC10038a;
            this.f19596b = interfaceC10003b;
            this.f19598d = c10061n;
        }
    }

    public C9811j(@NonNull AdLoader adLoader, @NonNull InterfaceC10128w1 interfaceC10128w1, @NonNull C9928h c9928h, @NonNull VungleApiClient vungleApiClient, @NonNull InterfaceC9982e interfaceC9982e, @NonNull C9908c.C9909a c9909a, @NonNull C10111y c10111y) {
        this.f19561e = interfaceC10128w1;
        this.f19560d = c9928h;
        this.f19558b = vungleApiClient;
        this.f19557a = interfaceC9982e;
        this.f19563g = adLoader;
        this.f19564h = c9909a;
        this.f19565i = c10111y;
    }

    @Override // com.vungle.warren.InterfaceC9800h0
    /* renamed from: a */
    public final void mo1507a(@NonNull Context context, @NonNull AdRequest adRequest, @NonNull FullAdWidget fullAdWidget, @Nullable InterfaceC10030b interfaceC10030b, @NonNull AbstractActivityC9743a.C9744a c9744a, @NonNull AbstractActivityC9743a.C9745b c9745b, @Nullable Bundle bundle, @NonNull AbstractActivityC9743a.C9746c c9746c) {
        AbstractAsyncTaskC9814c abstractAsyncTaskC9814c = this.f19559c;
        if (abstractAsyncTaskC9814c != null) {
            abstractAsyncTaskC9814c.cancel(true);
            this.f19559c.mo1502a();
        }
        AsyncTaskC9816d asyncTaskC9816d = new AsyncTaskC9816d(context, this.f19563g, adRequest, this.f19560d, this.f19561e, this.f19557a, this.f19558b, fullAdWidget, interfaceC10030b, c9745b, c9744a, c9746c, this.f19566j, bundle, this.f19564h);
        this.f19559c = asyncTaskC9816d;
        asyncTaskC9816d.executeOnExecutor(this.f19565i, new Void[0]);
    }

    @Override // com.vungle.warren.InterfaceC9800h0
    /* renamed from: b */
    public final void mo1506b(Context context, @NonNull AdRequest adRequest, @Nullable AdConfig adConfig, @NonNull C10055l.C10058c c10058c) {
        AbstractAsyncTaskC9814c abstractAsyncTaskC9814c = this.f19559c;
        if (abstractAsyncTaskC9814c != null) {
            abstractAsyncTaskC9814c.cancel(true);
            this.f19559c.mo1502a();
        }
        AsyncTaskC9813b asyncTaskC9813b = new AsyncTaskC9813b(context, adRequest, adConfig, this.f19563g, this.f19560d, this.f19561e, this.f19557a, c10058c, this.f19566j, this.f19558b, this.f19564h);
        this.f19559c = asyncTaskC9813b;
        asyncTaskC9813b.executeOnExecutor(this.f19565i, new Void[0]);
    }

    @Override // com.vungle.warren.InterfaceC9800h0
    /* renamed from: c */
    public final void mo1505c(Bundle bundle) {
        Advertisement advertisement = this.f19562f;
        bundle.putString("ADV_FACTORY_ADVERTISEMENT", advertisement == null ? null : advertisement.getId());
    }

    @Override // com.vungle.warren.InterfaceC9800h0
    public final void destroy() {
        AbstractAsyncTaskC9814c abstractAsyncTaskC9814c = this.f19559c;
        if (abstractAsyncTaskC9814c != null) {
            abstractAsyncTaskC9814c.cancel(true);
            this.f19559c.mo1502a();
        }
    }
}
