package com.adcolony.sdk;

import android.content.Context;
import androidx.datastore.preferences.protobuf.C1169e;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iab.omid.library.adcolony.adsession.C8720j;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.adcolony.sdk.b3 */
/* loaded from: classes.dex */
public final class C2058b3 {

    /* renamed from: Y */
    public static String f4957Y = "https://adc3-launch.adcolony.com/v4/launch";

    /* renamed from: Z */
    public static volatile String f4958Z = "";

    /* renamed from: A */
    public boolean f4959A;

    /* renamed from: B */
    public boolean f4960B;

    /* renamed from: C */
    public boolean f4961C;

    /* renamed from: E */
    public boolean f4963E;

    /* renamed from: F */
    public boolean f4964F;

    /* renamed from: G */
    public boolean f4965G;

    /* renamed from: H */
    public boolean f4966H;

    /* renamed from: I */
    public boolean f4967I;

    /* renamed from: J */
    public boolean f4968J;

    /* renamed from: K */
    public boolean f4969K;

    /* renamed from: L */
    public int f4970L;

    /* renamed from: N */
    public C2128h3 f4972N;

    /* renamed from: S */
    public boolean f4977S;

    /* renamed from: W */
    public int f4981W;

    /* renamed from: a */
    public C2117g2 f4983a;

    /* renamed from: b */
    public C2052a5 f4984b;

    /* renamed from: c */
    public C2383z4 f4985c;

    /* renamed from: d */
    public C2145j1 f4986d;

    /* renamed from: e */
    public C2264q4 f4987e;

    /* renamed from: f */
    public C2298t5 f4988f;

    /* renamed from: g */
    public C2332v5 f4989g;

    /* renamed from: h */
    public C2290s5 f4990h;

    /* renamed from: i */
    public C2040a2 f4991i;

    /* renamed from: j */
    public C2247p4 f4992j;

    /* renamed from: k */
    public C2354w3 f4993k;

    /* renamed from: l */
    public C2135i1 f4994l;

    /* renamed from: m */
    public C2175j6 f4995m;

    /* renamed from: n */
    public C2178k f4996n;

    /* renamed from: o */
    public C2249q f4997o;

    /* renamed from: p */
    public InterfaceC2349w f4998p;

    /* renamed from: r */
    public C2200m f5000r;

    /* renamed from: s */
    public C2100e2 f5001s;

    /* renamed from: t */
    public C2367y1 f5002t;

    /* renamed from: w */
    public String f5005w;

    /* renamed from: x */
    public String f5006x;

    /* renamed from: y */
    public String f5007y;

    /* renamed from: q */
    public final HashMap<String, InterfaceC2217o> f4999q = new HashMap<>();

    /* renamed from: u */
    public final HashMap<String, C2365y> f5003u = new HashMap<>();

    /* renamed from: v */
    public final HashMap<Integer, C2088e1> f5004v = new HashMap<>();

    /* renamed from: z */
    public String f5008z = "";

    /* renamed from: D */
    public final C2376z1 f4962D = new C2376z1();

    /* renamed from: M */
    public int f4971M = 1;

    /* renamed from: O */
    public C8720j f4973O = null;

    /* renamed from: P */
    public C2367y1 f4974P = new C2367y1();

    /* renamed from: Q */
    public long f4975Q = 500;

    /* renamed from: R */
    public long f4976R = 500;

    /* renamed from: T */
    public long f4978T = 20000;

    /* renamed from: U */
    public long f4979U = 300000;

    /* renamed from: V */
    public long f4980V = 15000;

    /* renamed from: X */
    public boolean f4982X = false;

    /* renamed from: com.adcolony.sdk.b3$a */
    /* loaded from: classes.dex */
    public class RunnableC2059a implements Runnable {
        public RunnableC2059a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C2201m0.m9588d().m9686q().f5725f) {
                C2058b3 c2058b3 = C2058b3.this;
                c2058b3.getClass();
                new Thread(new RunnableC2368y2(c2058b3)).start();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.b3$b */
    /* loaded from: classes.dex */
    public class C2060b implements InterfaceC2356w5<C2378z3> {
        @Override // com.adcolony.sdk.InterfaceC2356w5
        /* renamed from: a */
        public final void mo9462a(C2378z3 c2378z3) {
            C2110f4.m9634c().f5110a = c2378z3;
        }
    }

    /* renamed from: a */
    public final C2332v5 m9702a() {
        if (this.f4989g == null) {
            C2332v5 c2332v5 = new C2332v5();
            this.f4989g = c2332v5;
            c2332v5.m9479a();
        }
        return this.f4989g;
    }

    /* renamed from: b */
    public final void m9701b() {
        this.f4962D.m9427b(false);
        this.f4986d.m9605e();
        Object m9437v = this.f5000r.f5362b.m9437v("force_ad_id");
        if (m9437v == null) {
            m9437v = Boolean.FALSE;
        }
        if ((m9437v instanceof String) && !((String) m9437v).isEmpty()) {
            m9700c();
        }
        C2074d.m9675b(C2201m0.f5363a, this.f5000r);
        m9698e();
        this.f5003u.clear();
        this.f4983a.m9633a();
    }

    /* renamed from: c */
    public final void m9700c() {
        synchronized (this.f4986d.f5266c) {
            for (C2249q c2249q : this.f4986d.f5266c.values()) {
                c2249q.m9520b();
            }
            this.f4986d.f5266c.clear();
        }
    }

    /* renamed from: d */
    public final void m9699d() {
        if (C2201m0.m9588d().m9686q().f5725f) {
            int i = this.f4970L + 1;
            this.f4970L = i;
            int min = Math.min(this.f4971M * i, 120);
            this.f4971M = min;
            C2232o6.m9556g(new RunnableC2059a(), min * 1000);
            return;
        }
        C1169e.m11129c("Max launch server download attempts hit, or AdColony is no longer active.", 0, 1, true);
    }

    /* renamed from: e */
    public final void m9698e() {
        HashMap<Integer, C2088e1> hashMap = this.f5004v;
        hashMap.remove(1);
        this.f4983a.m9631c(1);
        for (C2088e1 c2088e1 : hashMap.values()) {
            C2117g2 c2117g2 = this.f4983a;
            c2117g2.getClass();
            c2117g2.m9631c(c2088e1.getAdcModuleId());
        }
        hashMap.clear();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:4|(15:6|7|(1:9)|10|(3:14|(1:16)(1:18)|17)|19|20|21|(8:23|(3:25|(1:27)(1:43)|28)(1:45)|(2:39|40)|(1:31)(1:38)|32|(1:34)|35|36)|46|(0)(0)|32|(0)|35|36))|48|7|(0)|10|(4:12|14|(0)(0)|17)|19|20|21|(0)|46|(0)(0)|32|(0)|35|36) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x023b A[Catch: Exception -> 0x0280, TryCatch #0 {Exception -> 0x0280, blocks: (B:22:0x0237, B:24:0x023b, B:26:0x0257), top: B:46:0x0237 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x028a  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9697f(com.adcolony.sdk.C2200m r9) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2058b3.m9697f(com.adcolony.sdk.m):void");
    }

    /* renamed from: g */
    public final boolean m9696g(boolean z, boolean z2) {
        if (!C2201m0.m9587e()) {
            return false;
        }
        this.f4966H = z2;
        this.f4964F = z;
        if (z && !z2) {
            this.f4983a.m9633a();
            this.f4966H = true;
        }
        new Thread(new RunnableC2368y2(this)).start();
        return true;
    }

    /* renamed from: h */
    public final void m9695h() {
        boolean z;
        Iterator<C2249q> it = this.f4986d.f5266c.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2249q next = it.next();
            if (next != null) {
                if (next.f5487l == 5) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (C2201m0.m9586f()) {
                        C2058b3 m9588d = C2201m0.m9588d();
                        C2145j1 m9692k = m9588d.m9692k();
                        C2232o6.m9548o(new RunnableC2271r(next));
                        HashMap<String, C2365y> hashMap = m9588d.f5003u;
                        String str = next.f5484i;
                        C2365y c2365y = hashMap.get(str);
                        if (c2365y != null && c2365y.f5688g) {
                            C2367y1 c2367y1 = new C2367y1();
                            C2080d1.m9657k(C2365y.m9459a(c2365y.f5686e), c2367y1, "reward_amount");
                            String str2 = c2365y.f5683b;
                            if (!C2201m0.m9586f() || C2201m0.m9588d().f4960B || C2201m0.m9588d().f4961C) {
                                C1169e.m11129c("The AdColonyZone API is not available while AdColony is disabled.", 0, 0, false);
                                str2 = "";
                            }
                            C2080d1.m9660h(c2367y1, "reward_name", str2);
                            C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
                            C2080d1.m9660h(c2367y1, "zone_id", str);
                            C2100e2 c2100e2 = new C2100e2(0, c2367y1, "AdColony.v4vc_reward");
                            if (m9588d.f4998p != null) {
                                C2232o6.m9548o(new RunnableC2119g3(m9588d, c2100e2));
                            }
                        }
                        C2232o6.m9548o(new RunnableC2281s(next, m9692k));
                    }
                }
            }
        }
        m9701b();
    }

    /* renamed from: i */
    public final void m9694i(C2367y1 c2367y1) {
        long j;
        boolean optBoolean;
        Context context;
        if (!C2240p3.f5458F) {
            C2367y1 m9439t = c2367y1.m9439t("logging");
            C2040a2.f4921h = m9439t.m9458a("send_level", 1);
            C2040a2.f4919f = m9439t.m9444o("log_private");
            C2040a2.f4920g = m9439t.m9458a("print_level", 3);
            C2040a2 c2040a2 = this.f4991i;
            C2328v1 m9666b = C2080d1.m9666b(m9439t, "modules");
            c2040a2.getClass();
            C2367y1 c2367y12 = new C2367y1();
            for (int i = 0; i < m9666b.m9484c(); i++) {
                C2367y1 m9482e = m9666b.m9482e(i);
                C2080d1.m9661g(c2367y12, Integer.toString(m9482e.m9441r(FacebookAdapter.KEY_ID)), m9482e);
            }
            c2040a2.f4922a = c2367y12;
            C2040a2 c2040a22 = this.f4991i;
            C2328v1 m9440s = m9439t.m9440s("included_fields");
            if (m9440s != null) {
                c2040a22.getClass();
                m9440s.m9483d("level");
                m9440s.m9483d("message");
            }
            c2040a22.f4923b = m9440s;
        }
        C2367y1 m9439t2 = c2367y1.m9439t("metadata");
        m9691l().f5470f = m9439t2;
        C2383z4 m9686q = m9686q();
        int m9441r = m9439t2.m9441r("session_timeout");
        if (m9441r <= 0) {
            j = m9686q.f5720a;
        } else {
            j = m9441r * 1000;
        }
        m9686q.f5720a = j;
        f4958Z = c2367y1.m9436w("pie");
        this.f5008z = c2367y1.m9439t("controller").m9436w(MediationMetaData.KEY_VERSION);
        this.f4975Q = C2080d1.m9667a(m9439t2, "signals_timeout", this.f4975Q);
        this.f4976R = C2080d1.m9667a(m9439t2, "calculate_odt_timeout", this.f4976R);
        boolean z = this.f4977S;
        synchronized (m9439t2.f5690a) {
            optBoolean = m9439t2.f5690a.optBoolean("async_odt_query", z);
        }
        this.f4977S = optBoolean;
        this.f4978T = C2080d1.m9667a(m9439t2, "ad_request_timeout", this.f4978T);
        this.f4979U = C2080d1.m9667a(m9439t2, "controller_heartbeat_interval", this.f4979U);
        this.f4980V = C2080d1.m9667a(m9439t2, "controller_heartbeat_timeout", this.f4980V);
        this.f4982X = C2080d1.m9659i(m9439t2, "enable_compression", false);
        C2279r5 m9508a = C2279r5.m9508a();
        C2367y1 m9438u = m9439t2.m9438u("odt_config");
        C2060b c2060b = new C2060b();
        m9508a.getClass();
        if (C2201m0.m9587e()) {
            context = C2201m0.f5363a.getApplicationContext();
        } else {
            context = null;
        }
        if (context != null && m9438u != null) {
            try {
                m9508a.f5545a.execute(new RunnableC2248p5(m9508a, m9438u, c2060b, context));
            } catch (RejectedExecutionException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ADCEventsRepository.open failed with: " + e.toString());
                C1169e.m11129c(sb.toString(), 0, 0, true);
            }
        }
    }

    /* renamed from: j */
    public final void m9693j() {
        this.f4962D.m9427b(false);
        this.f4961C = true;
    }

    /* renamed from: k */
    public final C2145j1 m9692k() {
        if (this.f4986d == null) {
            C2145j1 c2145j1 = new C2145j1();
            this.f4986d = c2145j1;
            c2145j1.m9604f();
        }
        return this.f4986d;
    }

    /* renamed from: l */
    public final C2247p4 m9691l() {
        if (this.f4992j == null) {
            C2247p4 c2247p4 = new C2247p4();
            this.f4992j = c2247p4;
            c2247p4.f5465a.m9427b(false);
            c2247p4.f5466b.m9427b(false);
            C2201m0.m9590b("Device.get_info", new C2171j4());
        }
        return this.f4992j;
    }

    /* renamed from: m */
    public final C2298t5 m9690m() {
        if (this.f4988f == null) {
            C2298t5 c2298t5 = new C2298t5();
            this.f4988f = c2298t5;
            c2298t5.m9493f();
        }
        return this.f4988f;
    }

    /* renamed from: n */
    public final C2040a2 m9689n() {
        if (this.f4991i == null) {
            C2040a2 c2040a2 = new C2040a2();
            this.f4991i = c2040a2;
            c2040a2.m9705e();
        }
        return this.f4991i;
    }

    /* renamed from: o */
    public final C2117g2 m9688o() {
        if (this.f4983a == null) {
            C2117g2 c2117g2 = new C2117g2();
            this.f4983a = c2117g2;
            c2117g2.m9633a();
        }
        return this.f4983a;
    }

    /* renamed from: p */
    public final C2200m m9687p() {
        if (this.f5000r == null) {
            this.f5000r = new C2200m();
        }
        return this.f5000r;
    }

    /* renamed from: q */
    public final C2383z4 m9686q() {
        if (this.f4985c == null) {
            C2383z4 c2383z4 = new C2383z4();
            this.f4985c = c2383z4;
            C2201m0.m9590b("SessionInfo.stopped", new C2372y4(c2383z4));
            c2383z4.f5730k = new C2215n5(c2383z4);
        }
        return this.f4985c;
    }

    /* renamed from: r */
    public final C2290s5 m9685r() {
        if (this.f4990h == null) {
            C2290s5 c2290s5 = new C2290s5();
            this.f4990h = c2290s5;
            c2290s5.m9501a();
        }
        return this.f4990h;
    }
}
