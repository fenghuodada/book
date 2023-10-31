package com.applovin.impl.mediation.debugger.p021ui.p023b;

import android.app.Activity;
import android.content.Context;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.debugger.p017b.p018a.C2905a;
import com.applovin.impl.mediation.debugger.p017b.p018a.C2906b;
import com.applovin.impl.mediation.debugger.p017b.p018a.C2907c;
import com.applovin.impl.mediation.debugger.p017b.p018a.C2908d;
import com.applovin.impl.mediation.debugger.p017b.p019b.C2911b;
import com.applovin.impl.mediation.debugger.p021ui.p023b.p024a.C2944a;
import com.applovin.impl.mediation.debugger.p021ui.p023b.p024a.C2945b;
import com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2964e;
import com.applovin.impl.sdk.C3127e;
import com.applovin.impl.sdk.C3199j;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.C3293f;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C3393R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.b */
/* loaded from: classes.dex */
public class C2946b extends AbstractView$OnClickListenerC2961d implements AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private C3214m f7203a;

    /* renamed from: b */
    private List<C2905a> f7204b;

    /* renamed from: d */
    private String f7205d;

    /* renamed from: e */
    private String f7206e;

    /* renamed from: f */
    private String f7207f;

    /* renamed from: g */
    private final StringBuilder f7208g;

    /* renamed from: h */
    private final AtomicBoolean f7209h;

    /* renamed from: i */
    private boolean f7210i;

    /* renamed from: j */
    private List<C2911b> f7211j;

    /* renamed from: k */
    private List<C2911b> f7212k;

    /* renamed from: l */
    private List<C2911b> f7213l;

    /* renamed from: m */
    private List<C2908d> f7214m;

    /* renamed from: n */
    private List<C2908d> f7215n;

    /* renamed from: o */
    private List<C2957c> f7216o;

    /* renamed from: p */
    private List<C2957c> f7217p;

    /* renamed from: q */
    private List<C2957c> f7218q;

    /* renamed from: r */
    private List<C2957c> f7219r;

    /* renamed from: s */
    private List<C2957c> f7220s;

    /* renamed from: t */
    private List<C2957c> f7221t;

    /* renamed from: u */
    private List<C2957c> f7222u;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.b.b$a */
    /* loaded from: classes.dex */
    public enum EnumC2948a {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        COUNT
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.b.b$b */
    /* loaded from: classes.dex */
    public enum EnumC2949b {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public C2946b(Context context) {
        super(context);
        this.f7208g = new StringBuilder("");
        this.f7209h = new AtomicBoolean();
        this.f7210i = false;
        this.f7211j = new ArrayList();
        this.f7212k = new ArrayList();
        this.f7213l = new ArrayList();
        this.f7214m = new ArrayList();
        this.f7215n = new ArrayList();
        this.f7216o = new ArrayList();
        this.f7217p = new ArrayList();
        this.f7218q = new ArrayList();
        this.f7219r = new ArrayList();
        this.f7220s = new ArrayList();
        this.f7221t = new ArrayList();
        this.f7222u = new ArrayList();
    }

    /* renamed from: a */
    private C2957c m8311a(String str, String str2) {
        C2957c.C2959a m8249a = C2957c.m8254p().m8249a(str);
        if (StringUtils.isValidString(str2)) {
            m8249a.m8245b(str2);
        } else {
            m8249a.m8252a(C3393R.C3395drawable.applovin_ic_x_mark);
            m8249a.m8243c(C3293f.m7029a(C3393R.C3394color.applovin_sdk_xmarkColor, this.f7300c));
        }
        return m8249a.m8253a();
    }

    /* renamed from: a */
    private void m8312a(C2957c.C2959a c2959a, String str) {
        c2959a.m8242c("MAX Ad Review").m8241d(str).m8252a(C3393R.C3395drawable.applovin_ic_x_mark).m8243c(C3293f.m7029a(C3393R.C3394color.applovin_sdk_xmarkColor, this.f7300c)).m8248a(true);
    }

    /* renamed from: a */
    private void m8310a(StringBuilder sb, String str) {
        String sb2 = sb.toString();
        if (str.length() + sb2.length() >= ((Integer) this.f7203a.m7456a(C3109b.f7833al)).intValue()) {
            C3349v.m6849f("MediationDebuggerListAdapter", sb2);
            this.f7208g.append(sb2);
            sb.setLength(1);
        }
        sb.append(str);
    }

    /* renamed from: a */
    private void m8309a(List<C2911b> list) {
        List<C2911b> list2;
        for (C2911b c2911b : list) {
            if (!c2911b.m8390g()) {
                if (c2911b.m8401a() == C2911b.EnumC2912a.INCOMPLETE_INTEGRATION || c2911b.m8401a() == C2911b.EnumC2912a.INVALID_INTEGRATION) {
                    list2 = this.f7211j;
                } else if (c2911b.m8401a() == C2911b.EnumC2912a.COMPLETE) {
                    list2 = this.f7212k;
                } else if (c2911b.m8401a() == C2911b.EnumC2912a.MISSING) {
                    list2 = this.f7213l;
                }
                list2.add(c2911b);
            }
        }
    }

    /* renamed from: b */
    private void m8306b(List<C2905a> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C2905a c2905a : list) {
            C2907c m8425e = c2905a.m8425e();
            for (C2906b c2906b : m8425e.m8417a()) {
                hashSet.add(c2906b.m8422a());
            }
            for (C2906b c2906b2 : m8425e.m8415b()) {
                hashSet2.add(c2906b2.m8422a());
            }
        }
        this.f7214m = new ArrayList(hashSet);
        this.f7215n = new ArrayList(hashSet2);
        Collections.sort(this.f7214m);
        Collections.sort(this.f7215n);
    }

    /* renamed from: c */
    private List<C2957c> m8304c(List<C2911b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C2911b c2911b : list) {
            arrayList.add(new C2944a(c2911b, this.f7300c));
        }
        return arrayList;
    }

    /* renamed from: l */
    private void m8297l() {
        Map<String, String> metaData;
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + Utils.isPubInDebugMode(this.f7300c, this.f7203a));
        sb.append("\nTest Mode - ".concat(this.f7203a.m7478J().m8198a() ? "enabled" : "disabled"));
        sb.append("\nTarget SDK - " + this.f7203a.m7466V().m7132h().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f7203a.m7456a(C3109b.f8004dz);
        String m7713a = C3127e.m7713a();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb2 = new StringBuilder("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb2.append(str2);
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder("\nAd Review Version - ");
        if (!StringUtils.isValidString(m7713a)) {
            m7713a = "Disabled";
        }
        sb3.append(m7713a);
        sb.append(sb3.toString());
        if (this.f7203a.m7405g() && (metaData = Utils.getMetaData(this.f7203a.m7396p())) != null) {
            String str3 = metaData.get("UnityVersion");
            StringBuilder sb4 = new StringBuilder("\nUnity Version - ");
            sb4.append(StringUtils.isValidString(str3) ? str3 : "None");
            sb.append(sb4.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(C3199j.m7524a(this.f7300c));
        sb.append("\n========== NETWORKS ==========");
        for (C2911b c2911b : this.f7212k) {
            m8310a(sb, c2911b.m8374w());
        }
        for (C2911b c2911b2 : this.f7211j) {
            m8310a(sb, c2911b2.m8374w());
        }
        sb.append("\n========== AD UNITS ==========");
        for (C2905a c2905a : this.f7204b) {
            m8310a(sb, c2905a.m8424f());
        }
        sb.append("\n========== END ==========");
        C3349v.m6849f("MediationDebuggerListAdapter", sb.toString());
        this.f7208g.append(sb.toString());
    }

    /* renamed from: m */
    private List<C2957c> m8296m() {
        String str;
        ArrayList arrayList = new ArrayList(5);
        try {
            str = this.f7300c.getPackageManager().getPackageInfo(this.f7300c.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(C2957c.m8254p().m8249a("Package Name").m8245b(this.f7300c.getPackageName()).m8253a());
        C2957c.C2959a m8249a = C2957c.m8254p().m8249a("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(m8249a.m8245b(str).m8253a());
        arrayList.add(C2957c.m8254p().m8249a("OS").m8245b(Utils.getAndroidOSInfo()).m8253a());
        arrayList.add(C2957c.m8254p().m8249a("Account").m8245b(StringUtils.isValidString(this.f7207f) ? this.f7207f : "None").m8253a());
        arrayList.add(C2957c.m8254p().m8249a("Mediation Provider").m8245b(StringUtils.isValidString(this.f7203a.m7392t()) ? this.f7203a.m7392t() : "None").m8253a());
        arrayList.add(C2957c.m8254p().m8249a("OM SDK Version").m8245b(this.f7203a.m7428al().m8049c()).m8253a());
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c> m8295n() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c.m8254p()
            java.lang.String r2 = "SDK Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.m8249a(r2)
            java.lang.String r2 = com.applovin.sdk.AppLovinSdk.VERSION
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.m8245b(r2)
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.m8253a()
            r0.add(r1)
            com.applovin.impl.sdk.m r1 = r6.f7203a
            com.applovin.impl.sdk.c.b<java.lang.String> r2 = com.applovin.impl.sdk.p031c.C3109b.f8004dz
            java.lang.Object r1 = r1.m7456a(r2)
            java.lang.String r1 = (java.lang.String) r1
            com.applovin.impl.mediation.debugger.ui.d.c$a r2 = com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c.m8254p()
            java.lang.String r3 = "Plugin Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r2 = r2.m8249a(r3)
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            java.lang.String r4 = "None"
            if (r3 == 0) goto L3a
            goto L3b
        L3a:
            r1 = r4
        L3b:
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r2.m8245b(r1)
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.m8253a()
            r0.add(r1)
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c.m8254p()
            java.lang.String r2 = "Ad Review Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.m8249a(r2)
            java.lang.String r2 = com.applovin.impl.sdk.C3127e.m7713a()
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r2)
            if (r3 == 0) goto L90
            java.lang.String r3 = com.applovin.impl.sdk.C3127e.m7710b()
            boolean r5 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r3)
            if (r5 == 0) goto L8c
            com.applovin.impl.sdk.m r5 = r6.f7203a
            java.lang.String r5 = r5.m7386z()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L71
            goto L8c
        L71:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "MAX Ad Review integrated with wrong SDK key. Please check that your "
            r2.<init>(r3)
            com.applovin.impl.sdk.m r3 = r6.f7203a
            boolean r3 = r3.m7405g()
            if (r3 == 0) goto L83
            java.lang.String r3 = "SDK key is downloaded"
            goto L85
        L83:
            java.lang.String r3 = "Gradle plugin snippet is integrated"
        L85:
            java.lang.String r5 = " from the correct account."
            java.lang.String r2 = androidx.concurrent.futures.C0484a.m12392a(r2, r3, r5)
            goto L92
        L8c:
            r1.m8245b(r2)
            goto L95
        L90:
            java.lang.String r2 = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps."
        L92:
            r6.m8312a(r1, r2)
        L95:
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.m8253a()
            r0.add(r1)
            com.applovin.impl.sdk.m r1 = r6.f7203a
            boolean r1 = r1.m7405g()
            if (r1 == 0) goto Lc8
            com.applovin.impl.sdk.m r1 = r6.f7203a
            com.applovin.sdk.AppLovinSdkSettings r1 = r1.m7396p()
            java.util.Map r1 = com.applovin.impl.sdk.utils.Utils.getMetaData(r1)
            if (r1 == 0) goto Lc8
            java.lang.String r2 = "UnityVersion"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r2 == 0) goto Lbf
            r4 = r1
        Lbf:
            java.lang.String r1 = "Unity Version"
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r6.m8311a(r1, r4)
            r0.add(r1)
        Lc8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.p021ui.p023b.C2946b.m8295n():java.util.List");
    }

    /* renamed from: o */
    private List<C2957c> m8294o() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new C2945b(C3199j.m7525a(), true, this.f7300c));
        arrayList.add(new C2945b(C3199j.m7520b(), false, this.f7300c));
        arrayList.add(new C2945b(C3199j.m7518c(), true, this.f7300c));
        return arrayList;
    }

    /* renamed from: p */
    private List<C2957c> m8293p() {
        ArrayList arrayList = new ArrayList(2);
        C2957c.C2959a m8254p = C2957c.m8254p();
        arrayList.add(m8254p.m8249a("View Ad Units (" + this.f7204b.size() + ")").m8251a(this.f7300c).m8248a(true).m8253a());
        arrayList.add(m8292q());
        return arrayList;
    }

    /* renamed from: q */
    private C2957c m8292q() {
        C2957c.C2959a m8254p = C2957c.m8254p();
        if (!this.f7203a.m7478J().m8198a()) {
            m8254p.m8251a(this.f7300c);
        }
        return m8254p.m8249a((this.f7203a.m7478J().m8192c() != null ? "" : "Select ").concat("Live Network")).m8245b(this.f7203a.m7478J().m8198a() ? "Enable" : null).m8247b(-16776961).m8241d("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").m8248a(true).m8253a();
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
    /* renamed from: a */
    public int mo8225a(int i) {
        return (i == EnumC2949b.APP_INFO.ordinal() ? this.f7216o : i == EnumC2949b.MAX.ordinal() ? this.f7217p : i == EnumC2949b.PRIVACY.ordinal() ? this.f7218q : i == EnumC2949b.ADS.ordinal() ? this.f7219r : i == EnumC2949b.INCOMPLETE_NETWORKS.ordinal() ? this.f7220s : i == EnumC2949b.COMPLETED_NETWORKS.ordinal() ? this.f7221t : this.f7222u).size();
    }

    /* renamed from: a */
    public void m8308a(List<C2911b> list, List<C2905a> list2, String str, String str2, String str3, C3214m c3214m) {
        Activity m7426an;
        this.f7203a = c3214m;
        this.f7204b = list2;
        this.f7205d = str;
        this.f7206e = str2;
        this.f7207f = str3;
        if (!(this.f7300c instanceof Activity) && (m7426an = c3214m.m7426an()) != null) {
            this.f7300c = m7426an;
        }
        if (list != null && this.f7209h.compareAndSet(false, true)) {
            c3214m.m7487A().m6855b("MediationDebuggerListAdapter", "Populating networks...");
            m8309a(list);
            m8306b(list2);
            this.f7216o.addAll(m8296m());
            this.f7217p.addAll(m8295n());
            this.f7218q.addAll(m8294o());
            this.f7219r.addAll(m8293p());
            this.f7220s = m8304c(this.f7211j);
            this.f7221t = m8304c(this.f7212k);
            this.f7222u = m8304c(this.f7213l);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            AppLovinCommunicator.getInstance(this.f7300c).subscribe(this, arrayList);
            m8297l();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                C2946b.this.notifyDataSetChanged();
            }
        });
    }

    /* renamed from: a */
    public void m8307a(boolean z) {
        this.f7210i = z;
    }

    /* renamed from: a */
    public boolean m8313a() {
        return this.f7209h.get();
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
    /* renamed from: b */
    public int mo8224b() {
        return EnumC2949b.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
    /* renamed from: b */
    public C2957c mo8223b(int i) {
        return i == EnumC2949b.APP_INFO.ordinal() ? new C2964e("APP INFO") : i == EnumC2949b.MAX.ordinal() ? new C2964e("MAX") : i == EnumC2949b.PRIVACY.ordinal() ? new C2964e("PRIVACY") : i == EnumC2949b.ADS.ordinal() ? new C2964e("ADS") : i == EnumC2949b.INCOMPLETE_NETWORKS.ordinal() ? new C2964e("INCOMPLETE INTEGRATIONS") : i == EnumC2949b.COMPLETED_NETWORKS.ordinal() ? new C2964e("COMPLETED INTEGRATIONS") : new C2964e("MISSING INTEGRATIONS");
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
    /* renamed from: c */
    public List<C2957c> mo8222c(int i) {
        return i == EnumC2949b.APP_INFO.ordinal() ? this.f7216o : i == EnumC2949b.MAX.ordinal() ? this.f7217p : i == EnumC2949b.PRIVACY.ordinal() ? this.f7218q : i == EnumC2949b.ADS.ordinal() ? this.f7219r : i == EnumC2949b.INCOMPLETE_NETWORKS.ordinal() ? this.f7220s : i == EnumC2949b.COMPLETED_NETWORKS.ordinal() ? this.f7221t : this.f7222u;
    }

    /* renamed from: c */
    public boolean m8305c() {
        return this.f7210i;
    }

    /* renamed from: d */
    public C3214m m8303d() {
        return this.f7203a;
    }

    /* renamed from: e */
    public List<C2905a> m8302e() {
        return this.f7204b;
    }

    /* renamed from: f */
    public String m8301f() {
        return this.f7205d;
    }

    /* renamed from: g */
    public String m8300g() {
        return this.f7206e;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    /* renamed from: h */
    public List<C2908d> m8299h() {
        return this.f7214m;
    }

    /* renamed from: i */
    public List<C2908d> m8298i() {
        return this.f7215n;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f7218q = m8294o();
        } else if (!"network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            return;
        } else {
            this.f7220s = m8304c(this.f7211j);
            this.f7221t = m8304c(this.f7212k);
        }
        m8233j();
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f7209h.get() + "}";
    }
}
