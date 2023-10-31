package com.vungle.warren.p058ui.presenter;

import android.content.ActivityNotFoundException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0484a;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.work.C1828a;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.gson.C8695r;
import com.iab.omid.library.vungle.C8817a;
import com.iab.omid.library.vungle.adsession.C8830i;
import com.vungle.warren.C9758c;
import com.vungle.warren.C9846m1;
import com.vungle.warren.C9970t;
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
import com.vungle.warren.omsdk.C9908c;
import com.vungle.warren.p058ui.C10011f;
import com.vungle.warren.p058ui.C9999b;
import com.vungle.warren.p058ui.InterfaceC10009e;
import com.vungle.warren.p058ui.contract.AdContract$AdStopReason;
import com.vungle.warren.p058ui.contract.InterfaceC10003b;
import com.vungle.warren.p058ui.contract.InterfaceC10006d;
import com.vungle.warren.p058ui.contract.InterfaceC10007e;
import com.vungle.warren.p058ui.state.C10028a;
import com.vungle.warren.p058ui.state.InterfaceC10030b;
import com.vungle.warren.p058ui.view.C10061n;
import com.vungle.warren.p058ui.view.InterfaceC10066p;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.utility.C10079d;
import com.vungle.warren.utility.C10091l;
import com.vungle.warren.utility.C10111y;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.vungle.warren.ui.presenter.d */
/* loaded from: classes3.dex */
public final class C10019d implements InterfaceC10006d, InterfaceC10066p.InterfaceC10067a, InterfaceC10066p.InterfaceC10068b {

    /* renamed from: a */
    public final C10091l f20152a;

    /* renamed from: b */
    public final InterfaceC9751a f20153b;

    /* renamed from: c */
    public final C9908c f20154c;

    /* renamed from: d */
    public final HashMap f20155d;

    /* renamed from: e */
    public C10079d.C10080a f20156e;

    /* renamed from: f */
    public final C9970t f20157f;

    /* renamed from: g */
    public InterfaceC10003b.InterfaceC10004a f20158g;

    /* renamed from: h */
    public final Advertisement f20159h;

    /* renamed from: i */
    public Report f20160i;
    @NonNull

    /* renamed from: j */
    public final Placement f20161j;

    /* renamed from: k */
    public final InterfaceC10066p f20162k;

    /* renamed from: l */
    public final C9928h f20163l;

    /* renamed from: m */
    public final File f20164m;

    /* renamed from: n */
    public InterfaceC10007e f20165n;

    /* renamed from: o */
    public boolean f20166o;

    /* renamed from: p */
    public long f20167p;

    /* renamed from: q */
    public boolean f20168q;

    /* renamed from: r */
    public final AtomicBoolean f20169r;

    /* renamed from: s */
    public final AtomicBoolean f20170s;

    /* renamed from: t */
    public final C10020a f20171t;

    /* renamed from: u */
    public C9999b f20172u;
    @Nullable

    /* renamed from: v */
    public final String[] f20173v;

    /* renamed from: com.vungle.warren.ui.presenter.d$a */
    /* loaded from: classes3.dex */
    public class C10020a implements C9928h.InterfaceC9943n {

        /* renamed from: a */
        public boolean f20174a = false;

        public C10020a() {
        }

        @Override // com.vungle.warren.persistence.C9928h.InterfaceC9943n
        /* renamed from: a */
        public final void mo1326a() {
            if (this.f20174a) {
                return;
            }
            this.f20174a = true;
            VungleException vungleException = new VungleException(26);
            C10019d c10019d = C10019d.this;
            c10019d.m1329p(vungleException);
            VungleLogger.m1603c(C10019d.class.getSimpleName(), vungleException.getLocalizedMessage());
            c10019d.f20165n.close();
            c10019d.f20152a.f20314a.removeCallbacksAndMessages(null);
        }

        @Override // com.vungle.warren.persistence.C9928h.InterfaceC9943n
        /* renamed from: b */
        public final void mo1325b() {
        }
    }

    /* renamed from: com.vungle.warren.ui.presenter.d$b */
    /* loaded from: classes3.dex */
    public class RunnableC10021b implements Runnable {
        public RunnableC10021b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((C10061n) C10019d.this.f20162k).m1294b(true);
        }
    }

    /* renamed from: com.vungle.warren.ui.presenter.d$c */
    /* loaded from: classes3.dex */
    public class RunnableC10022c implements Runnable {
        public RunnableC10022c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C10019d.this.f20165n.setVisibility(true);
        }
    }

    /* renamed from: com.vungle.warren.ui.presenter.d$d */
    /* loaded from: classes3.dex */
    public class C10023d implements InterfaceC10009e {
        public C10023d() {
        }

        @Override // com.vungle.warren.p058ui.InterfaceC10009e
        /* renamed from: a */
        public final void mo1324a(InterfaceC10009e.EnumC10010a enumC10010a) {
            if (enumC10010a == InterfaceC10009e.EnumC10010a.DEEP_LINK) {
                C10019d.this.m1327r("deeplinkSuccess", null);
            }
        }
    }

    /* renamed from: com.vungle.warren.ui.presenter.d$e */
    /* loaded from: classes3.dex */
    public class RunnableC10024e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f20179a;

        public RunnableC10024e(String str) {
            this.f20179a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C10019d.this.m1330o(new VungleException(this.f20179a));
        }
    }

    public C10019d(@NonNull Advertisement advertisement, @NonNull Placement placement, @NonNull C9928h c9928h, @NonNull C10091l c10091l, @NonNull C9752b c9752b, @NonNull C10061n c10061n, @Nullable InterfaceC10030b interfaceC10030b, @NonNull File file, @NonNull C9908c c9908c, @Nullable String[] strArr) {
        HashMap hashMap = new HashMap();
        this.f20155d = hashMap;
        this.f20169r = new AtomicBoolean(false);
        this.f20170s = new AtomicBoolean(false);
        this.f20171t = new C10020a();
        this.f20159h = advertisement;
        this.f20163l = c9928h;
        this.f20161j = placement;
        this.f20152a = c10091l;
        this.f20153b = c9752b;
        this.f20162k = c10061n;
        this.f20164m = file;
        this.f20154c = c9908c;
        this.f20173v = strArr;
        hashMap.put("incentivizedTextSetByPub", c9928h.m1383p(C9867g.class, "incentivizedTextSetByPub").get());
        hashMap.put("consentIsImportantToVungle", c9928h.m1383p(C9867g.class, "consentIsImportantToVungle").get());
        hashMap.put("configSettings", c9928h.m1383p(C9867g.class, "configSettings").get());
        if (interfaceC10030b != null) {
            String mo1320b = interfaceC10030b.mo1320b();
            Report report = TextUtils.isEmpty(mo1320b) ? null : (Report) c9928h.m1383p(Report.class, mo1320b).get();
            if (report != null) {
                this.f20160i = report;
            }
        }
        if (advertisement.f19733U) {
            this.f20157f = new C9970t(advertisement, c9752b);
        }
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: a */
    public final void mo1341a(@Nullable C10028a c10028a) {
        this.f20163l.m1375x(this.f20160i, this.f20171t, true);
        c10028a.m1322d(this.f20160i.m1457a());
        c10028a.m1321e("incentivized_sent", this.f20169r.get());
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: b */
    public final void mo1340b() {
        this.f20165n.mo1302l();
        ((C10061n) this.f20162k).m1294b(true);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: c */
    public final void mo1339c(@NonNull InterfaceC10007e interfaceC10007e, @Nullable InterfaceC10030b interfaceC10030b) {
        int i;
        String m1446c;
        C9928h c9928h;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC10007e interfaceC10007e2 = interfaceC10007e;
        this.f20170s.set(false);
        this.f20165n = interfaceC10007e2;
        interfaceC10007e2.setPresenter(this);
        InterfaceC10003b.InterfaceC10004a interfaceC10004a = this.f20158g;
        Placement placement = this.f20161j;
        Advertisement advertisement = this.f20159h;
        if (interfaceC10004a != null) {
            ((C9758c) interfaceC10004a).m1587c("attach", advertisement.m1471c(), placement.f19769a);
        }
        C9908c c9908c = this.f20154c;
        if (c9908c.f19898a && C8817a.f16787a.f16846a) {
            c9908c.f19899b = true;
        }
        int m1424b = advertisement.f19757v.m1424b();
        if (m1424b > 0) {
            if ((m1424b & 2) == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f20166o = z3;
        }
        int m1652e = advertisement.f19757v.m1652e();
        if (m1652e == 3) {
            if (advertisement.f19749n > advertisement.f19750o) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (!z2) {
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
        Log.d("com.vungle.warren.ui.presenter.d", "Requested Orientation " + i);
        interfaceC10007e2.setOrientation(i);
        C10061n c10061n = (C10061n) this.f20162k;
        c10061n.f20260d = this;
        c10061n.f20269m = this;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20164m.getPath());
        String str = File.separator;
        File file = new File(new File(C0484a.m12392a(sb, str, "template")).getParent());
        File file2 = new File(file.getPath() + str + "index.html");
        C10026f c10026f = new C10026f(this, file2);
        C10111y c10111y = C10079d.f20304a;
        C10079d.AsyncTaskC10082c asyncTaskC10082c = new C10079d.AsyncTaskC10082c(file2, c10026f);
        C10079d.C10080a c10080a = new C10079d.C10080a(asyncTaskC10082c);
        asyncTaskC10082c.executeOnExecutor(C10079d.f20304a, new Void[0]);
        this.f20156e = c10080a;
        HashMap hashMap = this.f20155d;
        C9867g c9867g = (C9867g) hashMap.get("incentivizedTextSetByPub");
        if (c9867g != null) {
            String m1446c2 = c9867g.m1446c(AppIntroBaseFragmentKt.ARG_TITLE);
            String m1446c3 = c9867g.m1446c("body");
            String m1446c4 = c9867g.m1446c("continue");
            String m1446c5 = c9867g.m1446c("close");
            boolean isEmpty = TextUtils.isEmpty(m1446c2);
            HashMap hashMap2 = advertisement.f19716D;
            if (!isEmpty) {
                hashMap2.put("INCENTIVIZED_TITLE_TEXT", m1446c2);
            }
            if (!TextUtils.isEmpty(m1446c3)) {
                hashMap2.put("INCENTIVIZED_BODY_TEXT", m1446c3);
            }
            if (!TextUtils.isEmpty(m1446c4)) {
                hashMap2.put("INCENTIVIZED_CONTINUE_TEXT", m1446c4);
            }
            if (!TextUtils.isEmpty(m1446c5)) {
                hashMap2.put("INCENTIVIZED_CLOSE_TEXT", m1446c5);
            }
        }
        if (c9867g == null) {
            m1446c = null;
        } else {
            m1446c = c9867g.m1446c("userID");
        }
        Report report = this.f20160i;
        C10020a c10020a = this.f20171t;
        C9928h c9928h2 = this.f20163l;
        if (report == null) {
            c9928h = c9928h2;
            Report report2 = new Report(this.f20159h, this.f20161j, System.currentTimeMillis(), m1446c);
            this.f20160i = report2;
            report2.f19792l = advertisement.f19727O;
            c9928h.m1375x(report2, c10020a, true);
        } else {
            c9928h = c9928h2;
        }
        if (this.f20172u == null) {
            this.f20172u = new C9999b(this.f20160i, c9928h, c10020a);
        }
        C9867g c9867g2 = (C9867g) hashMap.get("consentIsImportantToVungle");
        if (c9867g2 != null) {
            if (c9867g2.m1448a("is_country_data_protected").booleanValue() && VungleApiClient.ConnectionTypeDetail.UNKNOWN.equals(c9867g2.m1446c("consent_status"))) {
                z = true;
            } else {
                z = false;
            }
            String m1446c6 = c9867g2.m1446c("consent_title");
            String m1446c7 = c9867g2.m1446c("consent_message");
            String m1446c8 = c9867g2.m1446c("button_accept");
            String m1446c9 = c9867g2.m1446c("button_deny");
            c10061n.f20261e = z;
            c10061n.f20264h = m1446c6;
            c10061n.f20265i = m1446c7;
            c10061n.f20266j = m1446c8;
            c10061n.f20267k = m1446c9;
            if (z) {
                c9867g2.m1445d("opted_out_by_timeout", "consent_status");
                c9867g2.m1445d(Long.valueOf(System.currentTimeMillis() / 1000), "timestamp");
                c9867g2.m1445d("vungle_modal", "consent_source");
                c9928h.m1375x(c9867g2, c10020a, true);
            }
        }
        if (placement.f19771c) {
            i2 = advertisement.f19746k;
        } else {
            i2 = advertisement.f19745j;
        }
        int i3 = i2 * 1000;
        if (i3 > 0) {
            this.f20152a.f20314a.postAtTime(new RunnableC10025e(this), SystemClock.uptimeMillis() + i3);
        } else {
            this.f20166o = true;
        }
        this.f20165n.mo1302l();
        InterfaceC10003b.InterfaceC10004a interfaceC10004a2 = this.f20158g;
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

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r11.f20031b != Integer.MIN_VALUE) goto L20;
     */
    @Override // com.vungle.warren.p058ui.contract.InterfaceC10006d
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1338d(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.p058ui.presenter.C10019d.mo1338d(android.view.MotionEvent):void");
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: e */
    public final void mo1337e(@AdContract$AdStopReason int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f20165n.mo1306c();
        mo1333l(false);
        if (!z && z2 && !this.f20170s.getAndSet(true)) {
            InterfaceC10066p interfaceC10066p = this.f20162k;
            String str = null;
            if (interfaceC10066p != null) {
                ((C10061n) interfaceC10066p).f20260d = null;
            }
            if (z3) {
                m1327r("mraidCloseByApi", null);
            }
            this.f20163l.m1375x(this.f20160i, this.f20171t, true);
            InterfaceC10003b.InterfaceC10004a interfaceC10004a = this.f20158g;
            if (interfaceC10004a != null) {
                if (this.f20160i.f19803w) {
                    str = "isCTAClicked";
                }
                ((C9758c) interfaceC10004a).m1587c("end", str, this.f20161j.f19769a);
            }
        }
    }

    @Override // com.vungle.warren.p058ui.view.InterfaceC10066p.InterfaceC10068b
    /* renamed from: f */
    public final void mo1292f() {
        VungleException vungleException = new VungleException(32);
        m1330o(vungleException);
        VungleLogger.m1603c(C10019d.class.getSimpleName().concat("#onRenderProcessUnresponsive"), vungleException.getLocalizedMessage());
    }

    @Override // com.vungle.warren.p058ui.view.InterfaceC10066p.InterfaceC10068b
    /* renamed from: g */
    public final void mo1291g(String str, boolean z) {
        if (this.f20160i != null && !TextUtils.isEmpty(str)) {
            Report report = this.f20160i;
            synchronized (report) {
                report.f19797q.add(str);
            }
            this.f20163l.m1375x(this.f20160i, this.f20171t, true);
        }
        VungleLogger.m1603c(C10019d.class.getSimpleName().concat("#onReceivedError"), str);
        if (z) {
            m1329p(new VungleException(38));
            this.f20165n.close();
            this.f20152a.f20314a.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: h */
    public final void mo1336h(@AdContract$AdStopReason int i) {
        long j;
        C8830i c8830i;
        C10079d.C10080a c10080a = this.f20156e;
        if (c10080a != null) {
            C10079d.AsyncTaskC10082c asyncTaskC10082c = c10080a.f20305a;
            int i2 = C10079d.AsyncTaskC10082c.f20306c;
            synchronized (asyncTaskC10082c) {
                asyncTaskC10082c.f20308b = null;
            }
            c10080a.f20305a.cancel(true);
        }
        mo1337e(i);
        ((C10061n) this.f20162k).f20270n = null;
        C9908c c9908c = this.f20154c;
        if (c9908c.f19899b && (c8830i = c9908c.f19900c) != null) {
            c8830i.m2942b();
            j = C9908c.f19897d;
        } else {
            j = 0;
        }
        c9908c.f19899b = false;
        c9908c.f19900c = null;
        this.f20165n.mo1298q(j);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: i */
    public final void mo1335i(@Nullable InterfaceC10030b interfaceC10030b) {
        if (interfaceC10030b == null) {
            return;
        }
        boolean z = interfaceC10030b.getBoolean("incentivized_sent", false);
        if (z) {
            this.f20169r.set(z);
        }
        if (this.f20160i == null) {
            this.f20165n.close();
            VungleLogger.m1603c(C10019d.class.getSimpleName().concat("#restoreFromSave"), "The advertisement was not started and cannot be restored.");
        }
    }

    @Override // com.vungle.warren.p058ui.view.InterfaceC10066p.InterfaceC10068b
    /* renamed from: j */
    public final void mo1290j() {
        m1330o(new VungleException(31));
        VungleLogger.m1603c(C10019d.class.getSimpleName().concat("onWebRenderingProcessGone"), new VungleException(31).getLocalizedMessage());
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: k */
    public final void mo1334k(@Nullable InterfaceC10003b.InterfaceC10004a interfaceC10004a) {
        this.f20158g = interfaceC10004a;
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10006d
    /* renamed from: l */
    public final void mo1333l(boolean z) {
        C10061n c10061n = (C10061n) this.f20162k;
        c10061n.f20268l = Boolean.valueOf(z);
        c10061n.m1294b(false);
        if (z) {
            C9999b c9999b = this.f20172u;
            if (c9999b.f20106d.getAndSet(false)) {
                c9999b.f20107e = System.currentTimeMillis() - c9999b.f20103a.f19791k;
                return;
            }
            return;
        }
        C9999b c9999b2 = this.f20172u;
        if (!c9999b2.f20106d.getAndSet(true)) {
            Report report = c9999b2.f20103a;
            report.f19791k = System.currentTimeMillis() - c9999b2.f20107e;
            c9999b2.f20104b.m1375x(report, c9999b2.f20105c, true);
        }
    }

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
                this.f20165n.close();
                this.f20152a.f20314a.removeCallbacksAndMessages(null);
                return;
            case 2:
                Advertisement advertisement = this.f20159h;
                m1327r("cta", "");
                try {
                    this.f20153b.mo1591c(new String[]{advertisement.m1473a(true)});
                    this.f20165n.mo1305e(advertisement.f19728P, advertisement.m1473a(false), new C10011f(this.f20158g, this.f20161j), new C10027g(this));
                    return;
                } catch (ActivityNotFoundException unused) {
                    VungleLogger.m1603c(C10019d.class.getSimpleName().concat("#download"), "Download - Activity Not Found");
                    return;
                }
            default:
                throw new IllegalArgumentException("Unknown action ".concat(str));
        }
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    /* renamed from: n */
    public final boolean mo1331n() {
        if (this.f20166o) {
            this.f20165n.mo1300o("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
            return false;
        }
        return false;
    }

    /* renamed from: o */
    public final void m1330o(@NonNull VungleException vungleException) {
        InterfaceC10007e interfaceC10007e = this.f20165n;
        if (interfaceC10007e != null) {
            interfaceC10007e.mo1304g();
        }
        String concat = C10019d.class.getSimpleName().concat("#handleWebViewException");
        VungleLogger.m1603c(concat, "WebViewException: " + vungleException.getLocalizedMessage());
        m1329p(vungleException);
        this.f20165n.close();
        this.f20152a.f20314a.removeCallbacksAndMessages(null);
    }

    /* renamed from: p */
    public final void m1329p(@NonNull VungleException vungleException) {
        InterfaceC10003b.InterfaceC10004a interfaceC10004a = this.f20158g;
        if (interfaceC10004a != null) {
            ((C9758c) interfaceC10004a).m1589a(this.f20161j.f19769a, vungleException);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:155:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1328q(@androidx.annotation.NonNull java.lang.String r21, @androidx.annotation.NonNull com.google.gson.C8695r r22) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.p058ui.presenter.C10019d.m1328q(java.lang.String, com.google.gson.r):boolean");
    }

    /* renamed from: r */
    public final void m1327r(@NonNull String str, @Nullable String str2) {
        boolean equals = str.equals("videoLength");
        C10020a c10020a = this.f20171t;
        C9928h c9928h = this.f20163l;
        if (equals) {
            long parseLong = Long.parseLong(str2);
            this.f20167p = parseLong;
            Report report = this.f20160i;
            report.f19790j = parseLong;
            c9928h.m1375x(report, c10020a, true);
            return;
        }
        this.f20160i.m1456b(System.currentTimeMillis(), str, str2);
        c9928h.m1375x(this.f20160i, c10020a, true);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10003b
    public final void start() {
        if (!this.f20165n.mo1301n()) {
            m1329p(new VungleException(31));
            this.f20165n.close();
            this.f20152a.f20314a.removeCallbacksAndMessages(null);
            return;
        }
        this.f20165n.mo1299p();
        this.f20165n.mo1303h();
        mo1333l(true);
    }
}
