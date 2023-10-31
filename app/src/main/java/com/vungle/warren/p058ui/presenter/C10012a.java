package com.vungle.warren.p058ui.presenter;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0484a;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.work.C1828a;
import com.google.ads.mediation.adcolony.AdColonyAdapterUtils;
import com.google.gson.C8695r;
import com.google.gson.C8700u;
import com.vungle.warren.C9758c;
import com.vungle.warren.C9846m1;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.analytics.C9752b;
import com.vungle.warren.analytics.InterfaceC9751a;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.C9867g;
import com.vungle.warren.model.C9879m;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.p058ui.C9999b;
import com.vungle.warren.p058ui.InterfaceC10009e;
import com.vungle.warren.p058ui.contract.AdContract$AdStopReason;
import com.vungle.warren.p058ui.contract.InterfaceC10002a;
import com.vungle.warren.p058ui.contract.InterfaceC10003b;
import com.vungle.warren.p058ui.contract.InterfaceC10005c;
import com.vungle.warren.p058ui.state.C10028a;
import com.vungle.warren.p058ui.state.InterfaceC10030b;
import com.vungle.warren.p058ui.view.C10061n;
import com.vungle.warren.p058ui.view.InterfaceC10066p;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.utility.C10079d;
import com.vungle.warren.utility.C10091l;
import com.vungle.warren.utility.C10111y;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.vungle.warren.ui.presenter.a */
/* loaded from: classes3.dex */
public final class C10012a implements InterfaceC10003b, InterfaceC10066p.InterfaceC10068b {

    /* renamed from: A */
    public C9999b f20114A;
    @Nullable

    /* renamed from: B */
    public final String[] f20115B;

    /* renamed from: C */
    public final AtomicBoolean f20116C;

    /* renamed from: a */
    public final C10091l f20117a;

    /* renamed from: b */
    public final InterfaceC9751a f20118b;

    /* renamed from: c */
    public final InterfaceC10066p f20119c;

    /* renamed from: d */
    public final HashMap f20120d;

    /* renamed from: e */
    public C10079d.C10080a f20121e;
    @NonNull

    /* renamed from: f */
    public final Placement f20122f;

    /* renamed from: g */
    public final Advertisement f20123g;

    /* renamed from: h */
    public Report f20124h;

    /* renamed from: i */
    public final C9928h f20125i;

    /* renamed from: j */
    public final File f20126j;

    /* renamed from: k */
    public boolean f20127k;

    /* renamed from: l */
    public boolean f20128l;

    /* renamed from: m */
    public boolean f20129m;

    /* renamed from: n */
    public InterfaceC10005c f20130n;

    /* renamed from: o */
    public final String f20131o;

    /* renamed from: p */
    public final String f20132p;

    /* renamed from: q */
    public final String f20133q;

    /* renamed from: r */
    public final String f20134r;

    /* renamed from: s */
    public InterfaceC10003b.InterfaceC10004a f20135s;

    /* renamed from: t */
    public boolean f20136t;

    /* renamed from: u */
    public final AtomicBoolean f20137u;

    /* renamed from: v */
    public final AtomicBoolean f20138v;

    /* renamed from: w */
    public int f20139w;

    /* renamed from: x */
    public int f20140x;

    /* renamed from: y */
    public final LinkedList<Advertisement.C9850a> f20141y;

    /* renamed from: z */
    public final C10013a f20142z;

    /* renamed from: com.vungle.warren.ui.presenter.a$a */
    /* loaded from: classes3.dex */
    public class C10013a implements C9928h.InterfaceC9943n {

        /* renamed from: a */
        public boolean f20143a = false;

        public C10013a() {
        }

        @Override // com.vungle.warren.persistence.C9928h.InterfaceC9943n
        /* renamed from: a */
        public final void mo1326a() {
            if (this.f20143a) {
                return;
            }
            this.f20143a = true;
            C10012a c10012a = C10012a.this;
            c10012a.m1346q(26);
            VungleLogger.m1603c(C10012a.class.getSimpleName().concat("#onError"), new VungleException(26).getLocalizedMessage());
            c10012a.m1348o();
        }

        @Override // com.vungle.warren.persistence.C9928h.InterfaceC9943n
        /* renamed from: b */
        public final void mo1325b() {
        }
    }

    /* renamed from: com.vungle.warren.ui.presenter.a$b */
    /* loaded from: classes3.dex */
    public class C10014b implements C10079d.InterfaceC10081b {

        /* renamed from: a */
        public final /* synthetic */ File f20145a;

        public C10014b(File file) {
            this.f20145a = file;
        }

        @Override // com.vungle.warren.utility.C10079d.InterfaceC10081b
        /* renamed from: a */
        public final void mo1276a(boolean z) {
            C10012a c10012a = C10012a.this;
            if (z) {
                InterfaceC10005c interfaceC10005c = c10012a.f20130n;
                interfaceC10005c.mo1300o("file://" + this.f20145a.getPath());
                c10012a.f20118b.mo1591c(c10012a.f20123g.m1469f("postroll_view"));
                c10012a.f20129m = true;
                return;
            }
            c10012a.m1346q(27);
            c10012a.m1346q(10);
            VungleLogger.m1603c(C10012a.class.getSimpleName().concat("#playPost"), "Error Rendering Postroll");
            c10012a.m1348o();
        }
    }

    /* renamed from: com.vungle.warren.ui.presenter.a$c */
    /* loaded from: classes3.dex */
    public class RunnableC10015c implements Runnable {
        public RunnableC10015c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C10012a c10012a = C10012a.this;
            c10012a.f20128l = true;
            if (!c10012a.f20129m) {
                c10012a.f20130n.mo1314d();
            }
        }
    }

    /* renamed from: com.vungle.warren.ui.presenter.a$d */
    /* loaded from: classes3.dex */
    public class C10016d implements InterfaceC10009e {
        public C10016d() {
        }

        @Override // com.vungle.warren.p058ui.InterfaceC10009e
        /* renamed from: a */
        public final void mo1324a(InterfaceC10009e.EnumC10010a enumC10010a) {
            if (enumC10010a == InterfaceC10009e.EnumC10010a.DEEP_LINK) {
                C10012a.this.m1343t("deeplinkSuccess", null);
            }
        }
    }

    public C10012a(@NonNull Advertisement advertisement, @NonNull Placement placement, @NonNull C9928h c9928h, @NonNull C10091l c10091l, @NonNull C9752b c9752b, @NonNull C10061n c10061n, @Nullable InterfaceC10030b interfaceC10030b, @NonNull File file, @Nullable String[] strArr) {
        HashMap hashMap = new HashMap();
        this.f20120d = hashMap;
        this.f20131o = "Are you sure?";
        this.f20132p = "If you exit now, you will not get your reward";
        this.f20133q = "Continue";
        this.f20134r = "Close";
        this.f20137u = new AtomicBoolean(false);
        this.f20138v = new AtomicBoolean(false);
        LinkedList<Advertisement.C9850a> linkedList = new LinkedList<>();
        this.f20141y = linkedList;
        this.f20142z = new C10013a();
        this.f20116C = new AtomicBoolean(false);
        this.f20123g = advertisement;
        this.f20122f = placement;
        this.f20117a = c10091l;
        this.f20118b = c9752b;
        this.f20119c = c10061n;
        this.f20125i = c9928h;
        this.f20126j = file;
        this.f20115B = strArr;
        List<Advertisement.C9850a> list = advertisement.f19741f;
        if (list != null) {
            linkedList.addAll(list);
            Collections.sort(linkedList);
        }
        hashMap.put("incentivizedTextSetByPub", c9928h.m1383p(C9867g.class, "incentivizedTextSetByPub").get());
        hashMap.put("consentIsImportantToVungle", c9928h.m1383p(C9867g.class, "consentIsImportantToVungle").get());
        hashMap.put("configSettings", c9928h.m1383p(C9867g.class, "configSettings").get());
        if (interfaceC10030b != null) {
            String mo1320b = interfaceC10030b.mo1320b();
            Report report = TextUtils.isEmpty(mo1320b) ? null : (Report) c9928h.m1383p(Report.class, mo1320b).get();
            if (report != null) {
                this.f20124h = report;
            }
        }
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: a */
    public final void mo1341a(@Nullable C10028a c10028a) {
        String m1457a;
        int i;
        this.f20125i.m1375x(this.f20124h, this.f20142z, true);
        Report report = this.f20124h;
        if (report == null) {
            m1457a = null;
        } else {
            m1457a = report.m1457a();
        }
        c10028a.m1322d(m1457a);
        c10028a.m1321e("incentivized_sent", this.f20137u.get());
        c10028a.m1321e("in_post_roll", this.f20129m);
        c10028a.m1321e("is_muted_mode", this.f20127k);
        InterfaceC10005c interfaceC10005c = this.f20130n;
        if (interfaceC10005c != null && interfaceC10005c.mo1309i()) {
            i = this.f20130n.mo1310f();
        } else {
            i = this.f20139w;
        }
        c10028a.m1323c(i);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: b */
    public final void mo1340b() {
        ((C10061n) this.f20119c).m1294b(true);
        this.f20130n.mo1312r();
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: c */
    public final void mo1339c(@NonNull InterfaceC10002a interfaceC10002a, @Nullable InterfaceC10030b interfaceC10030b) {
        int i;
        String m1446c;
        C9928h c9928h;
        boolean z;
        boolean z2;
        InterfaceC10005c interfaceC10005c = (InterfaceC10005c) interfaceC10002a;
        boolean z3 = false;
        this.f20138v.set(false);
        this.f20130n = interfaceC10005c;
        interfaceC10005c.setPresenter(this);
        InterfaceC10003b.InterfaceC10004a interfaceC10004a = this.f20135s;
        Placement placement = this.f20122f;
        Advertisement advertisement = this.f20123g;
        if (interfaceC10004a != null) {
            ((C9758c) interfaceC10004a).m1587c("attach", advertisement.m1471c(), placement.f19769a);
        }
        int m1424b = advertisement.f19757v.m1424b();
        if (m1424b > 0) {
            if ((m1424b & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f20127k = z;
            if ((m1424b & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f20128l = z2;
        }
        int m1652e = advertisement.f19757v.m1652e();
        if (m1652e == 3) {
            if (advertisement.f19749n > advertisement.f19750o) {
                z3 = true;
            }
            if (z3) {
                if (!z3) {
                    i = -1;
                }
                i = 6;
            }
            i = 7;
        } else {
            if (m1652e != 0) {
                if (m1652e != 1) {
                    i = 4;
                }
                i = 6;
            }
            i = 7;
        }
        Log.d("LocalAdPresenter", "Requested Orientation " + i);
        interfaceC10005c.setOrientation(i);
        mo1335i(interfaceC10030b);
        C9867g c9867g = (C9867g) this.f20120d.get("incentivizedTextSetByPub");
        if (c9867g == null) {
            m1446c = null;
        } else {
            m1446c = c9867g.m1446c("userID");
        }
        Report report = this.f20124h;
        Advertisement advertisement2 = this.f20123g;
        C10013a c10013a = this.f20142z;
        C9928h c9928h2 = this.f20125i;
        if (report == null) {
            c9928h = c9928h2;
            Report report2 = new Report(advertisement2, this.f20122f, System.currentTimeMillis(), m1446c);
            this.f20124h = report2;
            report2.f19792l = advertisement2.f19727O;
            c9928h.m1375x(report2, c10013a, true);
        } else {
            c9928h = c9928h2;
        }
        if (this.f20114A == null) {
            this.f20114A = new C9999b(this.f20124h, c9928h, c10013a);
        }
        ((C10061n) this.f20119c).f20269m = this;
        this.f20130n.mo1311a(advertisement2.f19753r, advertisement2.f19754s);
        InterfaceC10003b.InterfaceC10004a interfaceC10004a2 = this.f20135s;
        if (interfaceC10004a2 != null) {
            ((C9758c) interfaceC10004a2).m1587c("start", null, placement.f19769a);
        }
        C9846m1 m1477b = C9846m1.m1477b();
        C8695r c8695r = new C8695r();
        c8695r.m3215u("event", C0539e.m12265a(3));
        c8695r.m3217s(C1828a.m9909a(3), Boolean.TRUE);
        c8695r.m3215u(C1828a.m9909a(4), advertisement.getId());
        m1477b.m1474e(new C9879m(3, c8695r));
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: e */
    public final void mo1337e(@AdContract$AdStopReason int i) {
        boolean z;
        C9999b c9999b = this.f20114A;
        if (!c9999b.f20106d.getAndSet(true)) {
            Report report = c9999b.f20103a;
            report.f19791k = System.currentTimeMillis() - c9999b.f20107e;
            c9999b.f20104b.m1375x(report, c9999b.f20105c, true);
        }
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        this.f20130n.mo1306c();
        if (this.f20130n.mo1309i()) {
            this.f20139w = this.f20130n.mo1310f();
            this.f20130n.mo1308j();
        }
        if (!z && z2) {
            if (!this.f20138v.getAndSet(true)) {
                String str = null;
                m1343t("close", null);
                this.f20117a.f20314a.removeCallbacksAndMessages(null);
                InterfaceC10003b.InterfaceC10004a interfaceC10004a = this.f20135s;
                if (interfaceC10004a != null) {
                    if (this.f20124h.f19803w) {
                        str = "isCTAClicked";
                    }
                    ((C9758c) interfaceC10004a).m1587c("end", str, this.f20122f.f19769a);
                }
            }
        } else if (this.f20129m || z2) {
            this.f20130n.mo1300o("about:blank");
        }
    }

    @Override // com.vungle.warren.p058ui.view.InterfaceC10066p.InterfaceC10068b
    /* renamed from: f */
    public final void mo1292f() {
        InterfaceC10005c interfaceC10005c = this.f20130n;
        if (interfaceC10005c != null) {
            interfaceC10005c.mo1304g();
        }
        m1342u(32);
        VungleLogger.m1603c(C10012a.class.getSimpleName().concat("#onRenderProcessUnresponsive"), new VungleException(32).getLocalizedMessage());
    }

    @Override // com.vungle.warren.p058ui.view.InterfaceC10066p.InterfaceC10068b
    /* renamed from: g */
    public final void mo1291g(String str, boolean z) {
        Report report = this.f20124h;
        if (report != null) {
            synchronized (report) {
                report.f19797q.add(str);
            }
            this.f20125i.m1375x(this.f20124h, this.f20142z, true);
            VungleLogger.m1603c(C10012a.class.getSimpleName().concat("onReceivedError"), str);
        }
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: h */
    public final void mo1336h(@AdContract$AdStopReason int i) {
        C10079d.C10080a c10080a = this.f20121e;
        if (c10080a != null) {
            C10079d.AsyncTaskC10082c asyncTaskC10082c = c10080a.f20305a;
            int i2 = C10079d.AsyncTaskC10082c.f20306c;
            synchronized (asyncTaskC10082c) {
                asyncTaskC10082c.f20308b = null;
            }
            c10080a.f20305a.cancel(true);
        }
        mo1337e(i);
        this.f20130n.mo1298q(0L);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: i */
    public final void mo1335i(@Nullable InterfaceC10030b interfaceC10030b) {
        if (interfaceC10030b == null) {
            return;
        }
        if (interfaceC10030b.getBoolean("incentivized_sent", false)) {
            this.f20137u.set(true);
        }
        this.f20129m = interfaceC10030b.getBoolean("in_post_roll", this.f20129m);
        this.f20127k = interfaceC10030b.getBoolean("is_muted_mode", this.f20127k);
        this.f20139w = interfaceC10030b.getInt(this.f20139w).intValue();
    }

    @Override // com.vungle.warren.p058ui.view.InterfaceC10066p.InterfaceC10068b
    /* renamed from: j */
    public final void mo1290j() {
        InterfaceC10005c interfaceC10005c = this.f20130n;
        if (interfaceC10005c != null) {
            interfaceC10005c.mo1304g();
        }
        m1342u(31);
        VungleLogger.m1603c(C10012a.class.getSimpleName().concat("#onWebRenderingProcessGone"), new VungleException(31).getLocalizedMessage());
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: k */
    public final void mo1334k(@Nullable InterfaceC10003b.InterfaceC10004a interfaceC10004a) {
        this.f20135s = interfaceC10004a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.vungle.warren.p058ui.C10000c.InterfaceC10001a
    /* renamed from: m */
    public final void mo1332m(@NonNull String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -314498168:
                if (str.equals("privacy")) {
                    c = 0;
                    break;
                }
                break;
            case 94756344:
                if (str.equals("close")) {
                    c = 1;
                    break;
                }
                break;
            case 1427818632:
                if (str.equals("download")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return;
            case 1:
                break;
            case 2:
                m1347p();
                break;
            default:
                VungleLogger.m1603c(C10012a.class.getSimpleName().concat("#onMraidAction"), "Unknown MRAID Command");
                throw new IllegalArgumentException("Unknown action ".concat(str));
        }
        m1348o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L26;
     */
    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo1331n() {
        /*
            r11 = this;
            boolean r0 = r11.f20129m
            r1 = 1
            if (r0 == 0) goto L9
            r11.m1348o()
            return r1
        L9:
            boolean r0 = r11.f20128l
            r2 = 0
            if (r0 != 0) goto Lf
            return r2
        Lf:
            com.vungle.warren.model.Placement r0 = r11.f20122f
            boolean r0 = r0.f19771c
            if (r0 == 0) goto L77
            int r0 = r11.f20140x
            r3 = 75
            if (r0 > r3) goto L77
            java.util.HashMap r0 = r11.f20120d
            java.lang.String r1 = "incentivizedTextSetByPub"
            java.lang.Object r0 = r0.get(r1)
            com.vungle.warren.model.g r0 = (com.vungle.warren.model.C9867g) r0
            java.lang.String r1 = r11.f20131o
            java.lang.String r3 = r11.f20132p
            java.lang.String r4 = r11.f20133q
            if (r0 == 0) goto L61
            java.lang.String r5 = "title"
            java.lang.String r5 = r0.m1446c(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L3a
            r1 = r5
        L3a:
            java.lang.String r5 = "body"
            java.lang.String r5 = r0.m1446c(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L47
            r3 = r5
        L47:
            java.lang.String r5 = "continue"
            java.lang.String r5 = r0.m1446c(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L54
            r4 = r5
        L54:
            java.lang.String r5 = "close"
            java.lang.String r0 = r0.m1446c(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L61
            goto L63
        L61:
            java.lang.String r0 = r11.f20134r
        L63:
            r9 = r0
            r6 = r1
            r7 = r3
            r8 = r4
            com.vungle.warren.ui.presenter.c r10 = new com.vungle.warren.ui.presenter.c
            r10.<init>(r11)
            com.vungle.warren.ui.contract.c r0 = r11.f20130n
            r0.mo1308j()
            com.vungle.warren.ui.contract.c r5 = r11.f20130n
            r5.mo1313k(r6, r7, r8, r9, r10)
            return r2
        L77:
            java.lang.String r0 = "video_close"
            r3 = 0
            r11.m1343t(r0, r3)
            com.vungle.warren.model.Advertisement r0 = r11.f20123g
            java.lang.String r0 = r0.f19752q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ r1
            if (r0 == 0) goto L8c
            r11.m1344s()
            return r2
        L8c:
            r11.m1348o()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.p058ui.presenter.C10012a.mo1331n():boolean");
    }

    /* renamed from: o */
    public final void m1348o() {
        AtomicBoolean atomicBoolean = this.f20116C;
        if (atomicBoolean.get()) {
            Log.w("LocalAdPresenter", "Busy with closing");
            return;
        }
        atomicBoolean.set(true);
        m1343t("close", null);
        this.f20117a.f20314a.removeCallbacksAndMessages(null);
        this.f20130n.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[Catch: ActivityNotFoundException -> 0x0073, TRY_LEAVE, TryCatch #0 {ActivityNotFoundException -> 0x0073, blocks: (B:3:0x000d, B:6:0x0043, B:9:0x004a, B:11:0x0063, B:13:0x0067, B:10:0x005e), top: B:17:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1347p() {
        /*
            r7 = this;
            java.lang.String r0 = "LocalAdPresenter"
            com.vungle.warren.analytics.a r1 = r7.f20118b
            com.vungle.warren.model.Advertisement r2 = r7.f20123g
            java.lang.String r3 = "cta"
            java.lang.String r4 = ""
            r7.m1343t(r3, r4)
            java.lang.String r3 = "postroll_click"
            java.lang.String[] r3 = r2.m1469f(r3)     // Catch: android.content.ActivityNotFoundException -> L73
            r1.mo1591c(r3)     // Catch: android.content.ActivityNotFoundException -> L73
            java.lang.String r3 = "click_url"
            java.lang.String[] r3 = r2.m1469f(r3)     // Catch: android.content.ActivityNotFoundException -> L73
            r1.mo1591c(r3)     // Catch: android.content.ActivityNotFoundException -> L73
            java.lang.String r3 = "video_click"
            java.lang.String[] r3 = r2.m1469f(r3)     // Catch: android.content.ActivityNotFoundException -> L73
            r1.mo1591c(r3)     // Catch: android.content.ActivityNotFoundException -> L73
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: android.content.ActivityNotFoundException -> L73
            java.lang.String r3 = r2.m1473a(r3)     // Catch: android.content.ActivityNotFoundException -> L73
            r5 = 0
            r4[r5] = r3     // Catch: android.content.ActivityNotFoundException -> L73
            r1.mo1591c(r4)     // Catch: android.content.ActivityNotFoundException -> L73
            java.lang.String r1 = "download"
            r3 = 0
            r7.m1343t(r1, r3)     // Catch: android.content.ActivityNotFoundException -> L73
            java.lang.String r1 = r2.m1473a(r5)     // Catch: android.content.ActivityNotFoundException -> L73
            com.vungle.warren.model.Placement r3 = r7.f20122f
            if (r1 == 0) goto L5e
            boolean r4 = r1.isEmpty()     // Catch: android.content.ActivityNotFoundException -> L73
            if (r4 == 0) goto L4a
            goto L5e
        L4a:
            com.vungle.warren.ui.contract.c r4 = r7.f20130n     // Catch: android.content.ActivityNotFoundException -> L73
            java.lang.String r2 = r2.f19728P     // Catch: android.content.ActivityNotFoundException -> L73
            com.vungle.warren.ui.f r5 = new com.vungle.warren.ui.f     // Catch: android.content.ActivityNotFoundException -> L73
            com.vungle.warren.ui.contract.b$a r6 = r7.f20135s     // Catch: android.content.ActivityNotFoundException -> L73
            r5.<init>(r6, r3)     // Catch: android.content.ActivityNotFoundException -> L73
            com.vungle.warren.ui.presenter.a$d r6 = new com.vungle.warren.ui.presenter.a$d     // Catch: android.content.ActivityNotFoundException -> L73
            r6.<init>()     // Catch: android.content.ActivityNotFoundException -> L73
            r4.mo1305e(r2, r1, r5, r6)     // Catch: android.content.ActivityNotFoundException -> L73
            goto L63
        L5e:
            java.lang.String r1 = "CTA destination URL is not configured properly"
            android.util.Log.e(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L73
        L63:
            com.vungle.warren.ui.contract.b$a r1 = r7.f20135s     // Catch: android.content.ActivityNotFoundException -> L73
            if (r1 == 0) goto L89
            java.lang.String r2 = "open"
            java.lang.String r4 = "adClick"
            java.lang.String r3 = r3.f19769a     // Catch: android.content.ActivityNotFoundException -> L73
            com.vungle.warren.c r1 = (com.vungle.warren.C9758c) r1     // Catch: android.content.ActivityNotFoundException -> L73
            r1.m1587c(r2, r4, r3)     // Catch: android.content.ActivityNotFoundException -> L73
            goto L89
        L73:
            java.lang.String r1 = "Unable to find destination activity"
            android.util.Log.e(r0, r1)
            java.lang.Class<com.vungle.warren.ui.presenter.a> r0 = com.vungle.warren.p058ui.presenter.C10012a.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "#download"
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "Download - Activity Not Found"
            com.vungle.warren.VungleLogger.m1603c(r0, r1)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.p058ui.presenter.C10012a.m1347p():void");
    }

    /* renamed from: q */
    public final void m1346q(@VungleException.ExceptionCode int i) {
        InterfaceC10003b.InterfaceC10004a interfaceC10004a = this.f20135s;
        if (interfaceC10004a != null) {
            C9758c c9758c = (C9758c) interfaceC10004a;
            c9758c.m1589a(this.f20122f.f19769a, new VungleException(i));
        }
    }

    /* renamed from: r */
    public final void m1345r(float f, int i) {
        this.f20140x = (int) ((i / f) * 100.0f);
        this.f20139w = i;
        C9999b c9999b = this.f20114A;
        if (!c9999b.f20106d.get()) {
            Report report = c9999b.f20103a;
            report.f19791k = System.currentTimeMillis() - c9999b.f20107e;
            c9999b.f20104b.m1375x(report, c9999b.f20105c, true);
        }
        InterfaceC10003b.InterfaceC10004a interfaceC10004a = this.f20135s;
        Placement placement = this.f20122f;
        if (interfaceC10004a != null) {
            ((C9758c) interfaceC10004a).m1587c("percentViewed:" + this.f20140x, null, placement.f19769a);
        }
        InterfaceC10003b.InterfaceC10004a interfaceC10004a2 = this.f20135s;
        InterfaceC9751a interfaceC9751a = this.f20118b;
        if (interfaceC10004a2 != null && i > 0 && !this.f20136t) {
            this.f20136t = true;
            ((C9758c) interfaceC10004a2).m1587c("adViewed", null, placement.f19769a);
            String[] strArr = this.f20115B;
            if (strArr != null) {
                interfaceC9751a.mo1591c(strArr);
            }
        }
        m1343t("video_viewed", String.format(Locale.ENGLISH, "%d", Integer.valueOf(i)));
        int i2 = this.f20140x;
        LinkedList<Advertisement.C9850a> linkedList = this.f20141y;
        Advertisement advertisement = this.f20123g;
        if (i2 == 100) {
            if (linkedList.peekLast() != null && linkedList.peekLast().m1467a() == 100) {
                interfaceC9751a.mo1591c(linkedList.pollLast().m1466b());
            }
            if (!TextUtils.isEmpty(advertisement.f19752q)) {
                m1344s();
            } else {
                m1348o();
            }
        }
        Report report2 = this.f20124h;
        report2.f19794n = this.f20139w;
        this.f20125i.m1375x(report2, this.f20142z, true);
        while (linkedList.peek() != null && this.f20140x > linkedList.peek().m1467a()) {
            interfaceC9751a.mo1591c(linkedList.poll().m1466b());
        }
        C9867g c9867g = (C9867g) this.f20120d.get("configSettings");
        if (placement.f19771c && this.f20140x > 75 && c9867g != null && c9867g.m1448a("isReportIncentivizedEnabled").booleanValue() && !this.f20137u.getAndSet(true)) {
            C8695r c8695r = new C8695r();
            c8695r.m3218r(new C8700u(placement.f19769a), "placement_reference_id");
            c8695r.m3218r(new C8700u(advertisement.f19739d), AdColonyAdapterUtils.KEY_APP_ID);
            c8695r.m3218r(new C8700u(Long.valueOf(this.f20124h.f19788h)), "adStartTime");
            c8695r.m3218r(new C8700u(this.f20124h.f19800t), "user");
            interfaceC9751a.mo1593a(c8695r);
        }
    }

    /* renamed from: s */
    public final void m1344s() {
        File file = new File(this.f20126j.getPath());
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        File file2 = new File(C0484a.m12392a(sb, File.separator, "index.html"));
        C10014b c10014b = new C10014b(file2);
        C10111y c10111y = C10079d.f20304a;
        C10079d.AsyncTaskC10082c asyncTaskC10082c = new C10079d.AsyncTaskC10082c(file2, c10014b);
        C10079d.C10080a c10080a = new C10079d.C10080a(asyncTaskC10082c);
        asyncTaskC10082c.executeOnExecutor(C10079d.f20304a, new Void[0]);
        this.f20121e = c10080a;
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    public final void start() {
        boolean z;
        int i;
        C9999b c9999b = this.f20114A;
        boolean z2 = false;
        if (c9999b.f20106d.getAndSet(false)) {
            c9999b.f20107e = System.currentTimeMillis() - c9999b.f20103a.f19791k;
        }
        if (!this.f20130n.mo1301n()) {
            m1342u(31);
            VungleLogger.m1603c(C10012a.class.getSimpleName().concat("#start"), new VungleException(31).getLocalizedMessage());
            return;
        }
        this.f20130n.mo1299p();
        this.f20130n.mo1303h();
        C9867g c9867g = (C9867g) this.f20120d.get("consentIsImportantToVungle");
        if (c9867g != null && c9867g.m1448a("is_country_data_protected").booleanValue() && VungleApiClient.ConnectionTypeDetail.UNKNOWN.equals(c9867g.m1446c("consent_status"))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DialogInterface$OnClickListenerC10017b dialogInterface$OnClickListenerC10017b = new DialogInterface$OnClickListenerC10017b(this, c9867g);
            c9867g.m1445d("opted_out_by_timeout", "consent_status");
            c9867g.m1445d(Long.valueOf(System.currentTimeMillis() / 1000), "timestamp");
            c9867g.m1445d("vungle_modal", "consent_source");
            this.f20125i.m1375x(c9867g, this.f20142z, true);
            String m1446c = c9867g.m1446c("consent_title");
            String m1446c2 = c9867g.m1446c("consent_message");
            String m1446c3 = c9867g.m1446c("button_accept");
            String m1446c4 = c9867g.m1446c("button_deny");
            this.f20130n.mo1308j();
            this.f20130n.mo1313k(m1446c, m1446c2, m1446c3, m1446c4, dialogInterface$OnClickListenerC10017b);
        } else if (this.f20129m) {
            String websiteUrl = this.f20130n.getWebsiteUrl();
            if (TextUtils.isEmpty(websiteUrl) || "about:blank".equalsIgnoreCase(websiteUrl)) {
                z2 = true;
            }
            if (z2) {
                m1344s();
            }
        } else if (!this.f20130n.mo1309i() && !this.f20130n.m1349b()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20126j.getPath());
            this.f20130n.mo1307m(new File(C0484a.m12392a(sb, File.separator, "video")), this.f20127k, this.f20139w);
            boolean z3 = this.f20122f.f19771c;
            Advertisement advertisement = this.f20123g;
            if (z3) {
                i = advertisement.f19746k;
            } else {
                i = advertisement.f19745j;
            }
            int i2 = i * 1000;
            if (i2 > 0) {
                this.f20117a.f20314a.postAtTime(new RunnableC10015c(), SystemClock.uptimeMillis() + i2);
                return;
            }
            this.f20128l = true;
            this.f20130n.mo1314d();
        }
    }

    /* renamed from: t */
    public final void m1343t(@NonNull String str, @Nullable String str2) {
        boolean equals = str.equals("videoLength");
        C10013a c10013a = this.f20142z;
        C9928h c9928h = this.f20125i;
        if (equals) {
            int parseInt = Integer.parseInt(str2);
            Report report = this.f20124h;
            report.f19790j = parseInt;
            c9928h.m1375x(report, c10013a, true);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -840405966:
                if (str.equals("unmute")) {
                    c = 0;
                    break;
                }
                break;
            case 3363353:
                if (str.equals("mute")) {
                    c = 1;
                    break;
                }
                break;
            case 1370606900:
                if (str.equals("video_close")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                this.f20118b.mo1591c(this.f20123g.m1469f(str));
                break;
        }
        this.f20124h.m1456b(System.currentTimeMillis(), str, str2);
        c9928h.m1375x(this.f20124h, c10013a, true);
    }

    /* renamed from: u */
    public final void m1342u(@VungleException.ExceptionCode int i) {
        m1346q(i);
        String simpleName = C10012a.class.getSimpleName();
        VungleLogger.m1603c(simpleName, "WebViewException: " + new VungleException(i).getLocalizedMessage());
        m1348o();
    }
}
