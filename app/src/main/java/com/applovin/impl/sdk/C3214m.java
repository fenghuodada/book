package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.C2808x;
import com.applovin.impl.mediation.C2888d;
import com.applovin.impl.mediation.C2977e;
import com.applovin.impl.mediation.C2978f;
import com.applovin.impl.mediation.C3025h;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.debugger.C2896a;
import com.applovin.impl.mediation.debugger.p021ui.testmode.C2976b;
import com.applovin.impl.mediation.p011a.C2828f;
import com.applovin.impl.mediation.p015d.C2894b;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.C3240b;
import com.applovin.impl.sdk.network.C3247d;
import com.applovin.impl.sdk.network.C3257f;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.p028a.C3051f;
import com.applovin.impl.sdk.p031c.C3108a;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p031c.C3110c;
import com.applovin.impl.sdk.p031c.C3111d;
import com.applovin.impl.sdk.p031c.C3112e;
import com.applovin.impl.sdk.p032d.C3121c;
import com.applovin.impl.sdk.p032d.C3125f;
import com.applovin.impl.sdk.p032d.C3126g;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.p033e.C3150i;
import com.applovin.impl.sdk.p033e.C3160n;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.p033e.C3189z;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.C3336n;
import com.applovin.impl.sdk.utils.C3339p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinTargetingData;
import com.applovin.sdk.AppLovinUserSegment;
import com.applovin.sdk.AppLovinUserService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.m */
/* loaded from: classes.dex */
public class C3214m {

    /* renamed from: a */
    protected static Context f8376a;

    /* renamed from: c */
    private static C3038a f8377c;

    /* renamed from: A */
    private C3277q f8378A;

    /* renamed from: B */
    private C3121c f8379B;

    /* renamed from: C */
    private C3353y f8380C;

    /* renamed from: D */
    private C3279s f8381D;

    /* renamed from: E */
    private C3247d f8382E;

    /* renamed from: F */
    private C3198i f8383F;

    /* renamed from: G */
    private C3336n f8384G;

    /* renamed from: H */
    private C3195h f8385H;

    /* renamed from: I */
    private C3220n f8386I;

    /* renamed from: J */
    private C3051f f8387J;

    /* renamed from: K */
    private C3283u f8388K;

    /* renamed from: L */
    private PostbackServiceImpl f8389L;

    /* renamed from: M */
    private C3257f f8390M;

    /* renamed from: N */
    private C3127e f8391N;

    /* renamed from: O */
    private C2978f f8392O;

    /* renamed from: P */
    private C2977e f8393P;

    /* renamed from: Q */
    private MediationServiceImpl f8394Q;

    /* renamed from: R */
    private C3025h f8395R;

    /* renamed from: S */
    private C2896a f8396S;

    /* renamed from: T */
    private C3351w f8397T;

    /* renamed from: U */
    private C2888d f8398U;

    /* renamed from: V */
    private C2976b f8399V;

    /* renamed from: W */
    private List<MaxAdFormat> f8400W;

    /* renamed from: X */
    private final Object f8401X = new Object();

    /* renamed from: Y */
    private final AtomicBoolean f8402Y = new AtomicBoolean(true);

    /* renamed from: Z */
    private boolean f8403Z = false;

    /* renamed from: aa */
    private boolean f8404aa = false;

    /* renamed from: ab */
    private boolean f8405ab = false;

    /* renamed from: ac */
    private boolean f8406ac = false;

    /* renamed from: ad */
    private int f8407ad = 0;

    /* renamed from: ae */
    private AppLovinSdk.SdkInitializationListener f8408ae;

    /* renamed from: af */
    private AppLovinSdk.SdkInitializationListener f8409af;

    /* renamed from: ag */
    private AppLovinSdkConfiguration f8410ag;

    /* renamed from: b */
    protected C3110c f8411b;

    /* renamed from: d */
    private String f8412d;

    /* renamed from: e */
    private WeakReference<Activity> f8413e;

    /* renamed from: f */
    private long f8414f;

    /* renamed from: g */
    private AppLovinSdkSettings f8415g;

    /* renamed from: h */
    private AppLovinUserSegment f8416h;

    /* renamed from: i */
    private AppLovinTargetingData f8417i;

    /* renamed from: j */
    private String f8418j;

    /* renamed from: k */
    private AppLovinAdServiceImpl f8419k;

    /* renamed from: l */
    private AppLovinNativeAdService f8420l;

    /* renamed from: m */
    private EventServiceImpl f8421m;

    /* renamed from: n */
    private UserServiceImpl f8422n;

    /* renamed from: o */
    private VariableServiceImpl f8423o;

    /* renamed from: p */
    private AppLovinSdk f8424p;

    /* renamed from: q */
    private C3349v f8425q;

    /* renamed from: r */
    private C3163o f8426r;

    /* renamed from: s */
    private C3240b f8427s;

    /* renamed from: t */
    private C3126g f8428t;

    /* renamed from: u */
    private C3267o f8429u;

    /* renamed from: v */
    private C3112e f8430v;

    /* renamed from: w */
    private C3207l f8431w;

    /* renamed from: x */
    private C3339p f8432x;

    /* renamed from: y */
    private C3107c f8433y;

    /* renamed from: z */
    private C3278r f8434z;

    /* renamed from: M */
    public static Context m7475M() {
        return f8376a;
    }

    /* renamed from: a */
    public static C3038a m7459a(Context context) {
        if (f8377c == null) {
            f8377c = new C3038a(context);
        }
        return f8377c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7441a(JSONObject jSONObject) {
        if (C3349v.m6862a()) {
            for (String str : JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList())) {
                C3349v.m6846i("AppLovinSdk", str);
            }
        }
    }

    /* renamed from: ao */
    private void m7425ao() {
        this.f8382E.m7303a(new C3247d.InterfaceC3248a() { // from class: com.applovin.impl.sdk.m.5
            @Override // com.applovin.impl.sdk.network.C3247d.InterfaceC3248a
            /* renamed from: a */
            public void mo7301a() {
                if (C3349v.m6862a()) {
                    C3214m.this.f8425q.m6853c("AppLovinSdk", "Connected to internet - re-initializing SDK");
                }
                synchronized (C3214m.this.f8401X) {
                    if (!C3214m.this.f8403Z) {
                        C3214m.this.m7424b();
                    }
                }
                C3214m.this.f8382E.m7302b(this);
            }

            @Override // com.applovin.impl.sdk.network.C3247d.InterfaceC3248a
            /* renamed from: b */
            public void mo7300b() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public List<MaxAdFormat> m7416b(JSONObject jSONObject) {
        List<String> asList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(asList.size());
        for (String str : asList) {
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString(str);
            if (formatFromString != null) {
                arrayList.add(formatFromString);
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public C3349v m7487A() {
        return this.f8425q;
    }

    /* renamed from: B */
    public C3127e m7486B() {
        return this.f8391N;
    }

    /* renamed from: C */
    public C2978f m7485C() {
        return this.f8392O;
    }

    /* renamed from: D */
    public C2977e m7484D() {
        return this.f8393P;
    }

    /* renamed from: E */
    public MediationServiceImpl m7483E() {
        return this.f8394Q;
    }

    /* renamed from: F */
    public C3351w m7482F() {
        return this.f8397T;
    }

    /* renamed from: G */
    public C2896a m7481G() {
        return this.f8396S;
    }

    /* renamed from: H */
    public C3025h m7480H() {
        return this.f8395R;
    }

    /* renamed from: I */
    public C2888d m7479I() {
        return this.f8398U;
    }

    /* renamed from: J */
    public C2976b m7478J() {
        return this.f8399V;
    }

    /* renamed from: K */
    public C3110c m7477K() {
        return this.f8411b;
    }

    /* renamed from: L */
    public Context m7476L() {
        return f8376a;
    }

    /* renamed from: N */
    public Activity m7474N() {
        WeakReference<Activity> weakReference = this.f8413e;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: O */
    public long m7473O() {
        return this.f8414f;
    }

    /* renamed from: P */
    public boolean m7472P() {
        return this.f8405ab;
    }

    /* renamed from: Q */
    public boolean m7471Q() {
        return this.f8406ac;
    }

    /* renamed from: R */
    public C3240b m7470R() {
        return this.f8427s;
    }

    /* renamed from: S */
    public C3163o m7469S() {
        return this.f8426r;
    }

    /* renamed from: T */
    public C3126g m7468T() {
        return this.f8428t;
    }

    /* renamed from: U */
    public C3257f m7467U() {
        return this.f8390M;
    }

    /* renamed from: V */
    public C3267o m7466V() {
        return this.f8429u;
    }

    /* renamed from: W */
    public C3207l m7465W() {
        return this.f8431w;
    }

    /* renamed from: X */
    public PostbackServiceImpl m7464X() {
        return this.f8389L;
    }

    /* renamed from: Y */
    public AppLovinSdk m7463Y() {
        return this.f8424p;
    }

    /* renamed from: Z */
    public C3107c m7462Z() {
        return this.f8433y;
    }

    /* renamed from: a */
    public <T> T m7456a(C3109b<T> c3109b) {
        return (T) this.f8411b.m7806a(c3109b);
    }

    /* renamed from: a */
    public <T> T m7454a(C3111d<T> c3111d) {
        return (T) m7421b((C3111d<C3111d<T>>) c3111d, (C3111d<T>) null);
    }

    /* renamed from: a */
    public <T> T m7442a(String str, @Nullable T t, Class<?> cls, SharedPreferences sharedPreferences) {
        return (T) C3112e.m7783a(str, t, cls, sharedPreferences);
    }

    /* renamed from: a */
    public void m7461a() {
        synchronized (this.f8401X) {
            if (!this.f8403Z && !this.f8404aa) {
                m7424b();
            }
        }
    }

    /* renamed from: a */
    public void m7460a(long j) {
        this.f8431w.m7506a(j);
    }

    /* renamed from: a */
    public void m7458a(SharedPreferences sharedPreferences) {
        this.f8430v.m7791a(sharedPreferences);
    }

    /* renamed from: a */
    public void m7457a(C2828f c2828f) {
        if (this.f8426r.m7622a()) {
            return;
        }
        List<String> m7423b = m7423b(C3108a.f7765a);
        if (m7423b.size() <= 0 || !this.f8393P.m8182b().containsAll(m7423b)) {
            return;
        }
        if (C3349v.m6862a()) {
            this.f8425q.m6855b("AppLovinSdk", "All required adapters initialized");
        }
        this.f8426r.m7608d();
        m7402j();
    }

    /* renamed from: a */
    public <T> void m7453a(C3111d<T> c3111d, @Nullable T t) {
        this.f8430v.m7789a(c3111d, t);
    }

    /* renamed from: a */
    public <T> void m7452a(C3111d<T> c3111d, @Nullable T t, SharedPreferences sharedPreferences) {
        this.f8430v.m7787a((C3111d<C3111d<T>>) c3111d, (C3111d<T>) t, sharedPreferences);
    }

    /* renamed from: a */
    public void m7447a(final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!m7411d()) {
            this.f8408ae = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.m.1
                @Override // java.lang.Runnable
                public void run() {
                    sdkInitializationListener.onSdkInitialized(C3214m.this.f8410ag);
                }
            });
        }
    }

    /* renamed from: a */
    public void m7446a(AppLovinSdk appLovinSdk) {
        this.f8424p = appLovinSdk;
    }

    /* renamed from: a */
    public void m7445a(String str) {
        if (C3349v.m6862a()) {
            C3349v.m6849f("AppLovinSdk", "Setting plugin version: " + str);
        }
        this.f8411b.m7805a(C3109b.f8004dz, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0273, code lost:
        if (com.applovin.sdk.AppLovinSdk.VERSION_CODE > com.applovin.impl.sdk.utils.Utils.toVersionCode(r7)) goto L62;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m7444a(java.lang.String r7, com.applovin.sdk.AppLovinSdkSettings r8, android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C3214m.m7444a(java.lang.String, com.applovin.sdk.AppLovinSdkSettings, android.content.Context):void");
    }

    /* renamed from: a */
    public <T> void m7443a(String str, @Nullable T t, SharedPreferences.Editor editor) {
        this.f8430v.m7786a(str, (String) t, editor);
    }

    /* renamed from: a */
    public void m7440a(boolean z) {
        synchronized (this.f8401X) {
            this.f8403Z = false;
            this.f8404aa = z;
        }
        if (this.f8411b == null || this.f8426r == null) {
            return;
        }
        List<String> m7423b = m7423b(C3108a.f7765a);
        if (m7423b.isEmpty()) {
            this.f8426r.m7608d();
            m7402j();
            return;
        }
        long longValue = ((Long) m7456a(C3108a.f7766b)).longValue();
        C3189z c3189z = new C3189z(this, true, new Runnable() { // from class: com.applovin.impl.sdk.m.2
            @Override // java.lang.Runnable
            public void run() {
                if (C3214m.this.f8426r.m7622a()) {
                    return;
                }
                if (C3349v.m6862a()) {
                    C3214m.this.f8425q.m6855b("AppLovinSdk", "Timing out adapters init...");
                }
                C3214m.this.f8426r.m7608d();
                C3214m.this.m7402j();
            }
        });
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f8425q;
            c3349v.m6855b("AppLovinSdk", "Waiting for required adapters to init: " + m7423b + " - timing out in " + longValue + "ms...");
        }
        this.f8426r.m7618a(c3189z, C3163o.EnumC3165a.MEDIATION_TIMEOUT, longValue, true);
    }

    /* renamed from: a */
    public boolean m7455a(C3109b<String> c3109b, MaxAdFormat maxAdFormat) {
        return m7414c(c3109b).contains(maxAdFormat);
    }

    /* renamed from: a */
    public boolean m7448a(MaxAdFormat maxAdFormat) {
        List<MaxAdFormat> list = this.f8400W;
        return (list == null || list.size() <= 0 || this.f8400W.contains(maxAdFormat)) ? false : true;
    }

    @Nullable
    /* renamed from: aa */
    public C3278r m7439aa() {
        return this.f8434z;
    }

    /* renamed from: ab */
    public C3277q m7438ab() {
        return this.f8378A;
    }

    /* renamed from: ac */
    public C3121c m7437ac() {
        return this.f8379B;
    }

    /* renamed from: ad */
    public C3353y m7436ad() {
        return this.f8380C;
    }

    /* renamed from: ae */
    public C3279s m7435ae() {
        return this.f8381D;
    }

    /* renamed from: af */
    public C3038a m7434af() {
        return f8377c;
    }

    /* renamed from: ag */
    public C3198i m7433ag() {
        return this.f8383F;
    }

    /* renamed from: ah */
    public C3336n m7432ah() {
        return this.f8384G;
    }

    /* renamed from: ai */
    public C3195h m7431ai() {
        return this.f8385H;
    }

    /* renamed from: aj */
    public AppLovinBroadcastManager m7430aj() {
        return AppLovinBroadcastManager.getInstance(f8376a);
    }

    /* renamed from: ak */
    public C3220n m7429ak() {
        return this.f8386I;
    }

    /* renamed from: al */
    public C3051f m7428al() {
        return this.f8387J;
    }

    /* renamed from: am */
    public C3283u m7427am() {
        return this.f8388K;
    }

    /* renamed from: an */
    public Activity m7426an() {
        Activity m8070a = m7459a(f8376a).m8070a();
        if (m8070a != null) {
            return m8070a;
        }
        Activity m7474N = m7474N();
        if (m7474N != null) {
            return m7474N;
        }
        return null;
    }

    /* renamed from: b */
    public <T> T m7421b(C3111d<T> c3111d, @Nullable T t) {
        return (T) this.f8430v.m7782b(c3111d, t);
    }

    /* renamed from: b */
    public <T> T m7420b(C3111d<T> c3111d, @Nullable T t, SharedPreferences sharedPreferences) {
        return (T) this.f8430v.m7780b((C3111d<C3111d<T>>) c3111d, (C3111d<T>) t, sharedPreferences);
    }

    /* renamed from: b */
    public List<String> m7423b(C3109b<String> c3109b) {
        return this.f8411b.m7800b(c3109b);
    }

    /* renamed from: b */
    public void m7424b() {
        synchronized (this.f8401X) {
            this.f8403Z = true;
            m7469S().m7610c();
            int i = this.f8407ad + 1;
            this.f8407ad = i;
            m7469S().m7619a(new C3150i(i, this, new C3150i.InterfaceC3152a() { // from class: com.applovin.impl.sdk.m.3
                @Override // com.applovin.impl.sdk.p033e.C3150i.InterfaceC3152a
                /* renamed from: a */
                public void mo7385a(JSONObject jSONObject) {
                    boolean z = jSONObject.length() > 0;
                    C3295h.m7003d(jSONObject, C3214m.this);
                    C3295h.m7004c(jSONObject, C3214m.this);
                    C3190f.m7557a(C3214m.this);
                    C3295h.m7001e(jSONObject, C3214m.this);
                    C3295h.m7007a(jSONObject, z, C3214m.this);
                    C2894b.m8468a(jSONObject, C3214m.this);
                    C2894b.m8465b(jSONObject, C3214m.this);
                    C3214m.this.m7481G().m8443a(JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE).booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
                    C3214m c3214m = C3214m.this;
                    c3214m.f8400W = c3214m.m7416b(jSONObject);
                    C3295h.m6999f(jSONObject, C3214m.this);
                    C3214m.this.m7478J().m8196a(jSONObject);
                    C3214m.this.m7441a(jSONObject);
                    C3214m.this.m7469S().m7621a((AbstractRunnableC3131a) new C3160n(C3214m.this));
                }
            }), C3163o.EnumC3165a.MAIN, ((Integer) m7456a(C3109b.f7974dV)).intValue());
        }
    }

    /* renamed from: b */
    public <T> void m7422b(C3111d<T> c3111d) {
        this.f8430v.m7790a(c3111d);
    }

    /* renamed from: b */
    public void m7417b(String str) {
        if (C3349v.m6862a()) {
            C2808x.m8855b("Setting user id: ", str, this.f8425q, "AppLovinSdk");
        }
        if (StringUtils.isValidString(str) && str.length() > Utils.kilobytesToByes(8)) {
            C3349v.m6846i("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + Utils.kilobytesToByes(8) + " maximum)");
        }
        this.f8432x.m6894a(str);
    }

    /* renamed from: c */
    public List<MaxAdFormat> m7414c(C3109b<String> c3109b) {
        return this.f8411b.m7798c(c3109b);
    }

    /* renamed from: c */
    public void m7412c(String str) {
        this.f8418j = str;
        m7422b(C3111d.f8062A);
    }

    /* renamed from: c */
    public boolean m7415c() {
        boolean z;
        synchronized (this.f8401X) {
            z = this.f8403Z;
        }
        return z;
    }

    /* renamed from: d */
    public boolean m7411d() {
        boolean z;
        synchronized (this.f8401X) {
            z = this.f8404aa;
        }
        return z;
    }

    /* renamed from: e */
    public boolean m7409e() {
        return "HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(m7386z());
    }

    /* renamed from: f */
    public boolean m7407f() {
        return StringUtils.containsIgnoreCase(m7392t(), AppLovinMediationProvider.MAX);
    }

    /* renamed from: g */
    public boolean m7405g() {
        return Utils.checkClassExistence("com.unity3d.player.UnityPlayerActivity");
    }

    /* renamed from: h */
    public void m7404h() {
        String str = (String) this.f8430v.m7782b(C3111d.f8067c, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE >= Utils.toVersionCode(str) || !C3349v.m6862a()) {
                return;
            }
            C3349v.m6846i("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
        }
    }

    /* renamed from: i */
    public void m7403i() {
        this.f8383F.m7536a();
    }

    /* renamed from: j */
    public void m7402j() {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener = this.f8408ae;
        if (sdkInitializationListener != null) {
            if (m7411d()) {
                this.f8408ae = null;
                this.f8409af = null;
                this.f8393P.m8184a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
            } else if (this.f8409af == sdkInitializationListener) {
                return;
            } else {
                this.f8393P.m8184a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
                if (((Boolean) m7456a(C3109b.f7831aj)).booleanValue()) {
                    this.f8408ae = null;
                } else {
                    this.f8409af = sdkInitializationListener;
                }
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.m.4
                @Override // java.lang.Runnable
                public void run() {
                    if (C3349v.m6862a()) {
                        C3214m.this.f8425q.m6855b("AppLovinSdk", "Calling back publisher's initialization completion handler...");
                    }
                    sdkInitializationListener.onSdkInitialized(C3214m.this.f8410ag);
                }
            }, Math.max(0L, ((Long) m7456a(C3109b.f7832ak)).longValue()));
        }
    }

    /* renamed from: k */
    public void m7401k() {
        if (C3349v.m6862a()) {
            C3349v.m6846i("AppLovinSdk", "Resetting SDK state...");
        }
        C3126g c3126g = this.f8428t;
        C3125f c3125f = C3125f.f8167g;
        long m7716b = c3126g.m7716b(c3125f);
        this.f8411b.m7799c();
        this.f8411b.m7807a();
        this.f8428t.m7720a();
        this.f8428t.m7715b(c3125f, m7716b + 1);
        if (this.f8402Y.compareAndSet(true, false)) {
            m7424b();
        } else {
            this.f8402Y.set(true);
        }
    }

    /* renamed from: l */
    public void m7400l() {
        this.f8396S.m8440c();
    }

    /* renamed from: m */
    public String m7399m() {
        return this.f8432x.m6897a();
    }

    /* renamed from: n */
    public String m7398n() {
        return this.f8432x.m6893b();
    }

    /* renamed from: o */
    public String m7397o() {
        return this.f8432x.m6892c();
    }

    /* renamed from: p */
    public AppLovinSdkSettings m7396p() {
        return this.f8415g;
    }

    /* renamed from: q */
    public AppLovinUserSegment m7395q() {
        return this.f8416h;
    }

    /* renamed from: r */
    public AppLovinTargetingDataImpl m7394r() {
        return (AppLovinTargetingDataImpl) this.f8417i;
    }

    /* renamed from: s */
    public AppLovinSdkConfiguration m7393s() {
        return this.f8410ag;
    }

    /* renamed from: t */
    public String m7392t() {
        String str = (String) m7454a(C3111d.f8062A);
        return StringUtils.isValidString(str) ? str : this.f8418j;
    }

    @NonNull
    public String toString() {
        return "CoreSdk{sdkKey='" + this.f8412d + "', enabled=" + this.f8404aa + ", isFirstSession=" + this.f8405ab + '}';
    }

    /* renamed from: u */
    public AppLovinAdServiceImpl m7391u() {
        return this.f8419k;
    }

    /* renamed from: v */
    public AppLovinNativeAdService m7390v() {
        return this.f8420l;
    }

    /* renamed from: w */
    public AppLovinEventService m7389w() {
        return this.f8421m;
    }

    /* renamed from: x */
    public AppLovinUserService m7388x() {
        return this.f8422n;
    }

    /* renamed from: y */
    public VariableServiceImpl m7387y() {
        return this.f8423o;
    }

    /* renamed from: z */
    public String m7386z() {
        return this.f8412d;
    }
}
