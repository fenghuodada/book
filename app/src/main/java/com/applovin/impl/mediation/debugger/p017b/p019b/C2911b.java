package com.applovin.impl.mediation.debugger.p017b.p019b;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0484a;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.debugger.p016a.C2903b;
import com.applovin.impl.mediation.p015d.C2895c;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.b.b */
/* loaded from: classes.dex */
public class C2911b implements AppLovinCommunicatorSubscriber, Comparable<C2911b> {

    /* renamed from: A */
    private final Map<MaxAdFormat, C2903b> f7074A;

    /* renamed from: a */
    private final C3214m f7075a;

    /* renamed from: b */
    private final EnumC2912a f7076b;

    /* renamed from: c */
    private int f7077c;

    /* renamed from: d */
    private final boolean f7078d;

    /* renamed from: e */
    private final boolean f7079e;

    /* renamed from: f */
    private final boolean f7080f;

    /* renamed from: g */
    private final boolean f7081g;

    /* renamed from: h */
    private final boolean f7082h;

    /* renamed from: i */
    private final boolean f7083i;

    /* renamed from: j */
    private final boolean f7084j;

    /* renamed from: k */
    private final boolean f7085k;

    /* renamed from: l */
    private final String f7086l;

    /* renamed from: m */
    private final String f7087m;

    /* renamed from: n */
    private final String f7088n;

    /* renamed from: o */
    private String f7089o;

    /* renamed from: p */
    private final String f7090p;

    /* renamed from: q */
    private final String f7091q;

    /* renamed from: r */
    private final String f7092r;

    /* renamed from: s */
    private final int f7093s;

    /* renamed from: t */
    private final List<MaxAdFormat> f7094t;

    /* renamed from: u */
    private final List<C2915d> f7095u;

    /* renamed from: v */
    private final List<C2910a> f7096v;

    /* renamed from: w */
    private final List<String> f7097w;

    /* renamed from: x */
    private final C2914c f7098x;

    /* renamed from: y */
    private final boolean f7099y;

    /* renamed from: z */
    private final String f7100z;

    /* renamed from: com.applovin.impl.mediation.debugger.b.b.b$a */
    /* loaded from: classes.dex */
    public enum EnumC2912a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");
        

        /* renamed from: e */
        private final String f7106e;

        EnumC2912a(String str) {
            this.f7106e = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public String m8370a() {
            return this.f7106e;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.b.b.b$b */
    /* loaded from: classes.dex */
    public enum EnumC2913b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");
        

        /* renamed from: f */
        private final String f7113f;

        /* renamed from: g */
        private final int f7114g;

        /* renamed from: h */
        private final String f7115h;

        EnumC2913b(String str, int i, String str2) {
            this.f7113f = str;
            this.f7114g = i;
            this.f7115h = str2;
        }

        /* renamed from: a */
        public String m8368a() {
            return this.f7113f;
        }

        /* renamed from: b */
        public int m8367b() {
            return this.f7114g;
        }

        /* renamed from: c */
        public String m8366c() {
            return this.f7115h;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2911b(org.json.JSONObject r19, com.applovin.impl.sdk.C3214m r20) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.p017b.p019b.C2911b.<init>(org.json.JSONObject, com.applovin.impl.sdk.m):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
        if (r3.f7079e != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
        r0 = com.applovin.impl.mediation.debugger.p017b.p019b.C2911b.EnumC2912a.f7102b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
        r0 = com.applovin.impl.mediation.debugger.p017b.p019b.C2911b.EnumC2912a.f7101a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
        if (r3.f7081g != false) goto L39;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.applovin.impl.mediation.debugger.p017b.p019b.C2911b.EnumC2912a m8402A() {
        /*
            r3 = this;
            boolean r0 = r3.f7078d
            if (r0 == 0) goto L10
            boolean r0 = r3.f7079e
            if (r0 == 0) goto Lb
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p017b.p019b.C2911b.EnumC2912a.COMPLETE
            goto L19
        Lb:
            boolean r0 = r3.f7081g
            if (r0 == 0) goto L14
            goto L17
        L10:
            boolean r0 = r3.f7079e
            if (r0 == 0) goto L17
        L14:
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p017b.p019b.C2911b.EnumC2912a.INCOMPLETE_INTEGRATION
            goto L19
        L17:
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p017b.p019b.C2911b.EnumC2912a.MISSING
        L19:
            com.applovin.impl.mediation.debugger.b.b.b$a r1 = com.applovin.impl.mediation.debugger.p017b.p019b.C2911b.EnumC2912a.MISSING
            if (r0 != r1) goto L1e
            return r0
        L1e:
            java.util.List<com.applovin.impl.mediation.debugger.b.b.d> r1 = r3.f7095u
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            com.applovin.impl.mediation.debugger.b.b.d r2 = (com.applovin.impl.mediation.debugger.p017b.p019b.C2915d) r2
            boolean r2 = r2.m8360c()
            if (r2 != 0) goto L24
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p017b.p019b.C2911b.EnumC2912a.INVALID_INTEGRATION
            return r0
        L39:
            java.util.List<com.applovin.impl.mediation.debugger.b.b.a> r1 = r3.f7096v
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r1.next()
            com.applovin.impl.mediation.debugger.b.b.a r2 = (com.applovin.impl.mediation.debugger.p017b.p019b.C2910a) r2
            boolean r2 = r2.m8403c()
            if (r2 != 0) goto L3f
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p017b.p019b.C2911b.EnumC2912a.INVALID_INTEGRATION
            return r0
        L54:
            com.applovin.impl.mediation.debugger.b.b.c r1 = r3.f7098x
            boolean r1 = r1.m8365a()
            if (r1 == 0) goto L66
            com.applovin.impl.mediation.debugger.b.b.c r1 = r3.f7098x
            boolean r1 = r1.m8364b()
            if (r1 != 0) goto L66
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p017b.p019b.C2911b.EnumC2912a.INVALID_INTEGRATION
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.p017b.p019b.C2911b.m8402A():com.applovin.impl.mediation.debugger.b.b.b$a");
    }

    /* renamed from: a */
    private List<MaxAdFormat> m8399a(MaxAdapter maxAdapter) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxRewardedInterstitialAdapter) {
            arrayList.add(MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            arrayList.add(MaxAdFormat.MREC);
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: a */
    private List<String> m8398a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    /* renamed from: a */
    private List<C2915d> m8397a(JSONObject jSONObject, C3214m c3214m) {
        ArrayList arrayList = new ArrayList();
        if (this.f7088n.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            C2915d c2915d = new C2915d("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", c3214m.m7476L());
            if (c2915d.m8360c()) {
                arrayList.add(c2915d);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new C2915d(next, jSONObject2.getString(next), c3214m.m7476L()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<C2910a> m8396a(JSONObject jSONObject, String str, C3214m c3214m) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray2.length() + jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C2910a(jSONObject2, c3214m));
            }
        }
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && C2910a.m8405a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new C2910a(jSONObject3, c3214m));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C2911b c2911b) {
        return this.f7087m.compareToIgnoreCase(c2911b.f7087m);
    }

    /* renamed from: a */
    public EnumC2912a m8401a() {
        return this.f7076b;
    }

    /* renamed from: b */
    public int m8395b() {
        return this.f7077c;
    }

    /* renamed from: c */
    public EnumC2913b m8394c() {
        return !this.f7082h ? EnumC2913b.NOT_SUPPORTED : this.f7076b == EnumC2912a.INVALID_INTEGRATION ? EnumC2913b.INVALID_INTEGRATION : !this.f7075a.m7478J().m8198a() ? EnumC2913b.DISABLED : (this.f7083i && (this.f7077c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f7077c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? EnumC2913b.NOT_INITIALIZED : EnumC2913b.READY;
    }

    /* renamed from: d */
    public boolean m8393d() {
        return this.f7078d;
    }

    /* renamed from: e */
    public boolean m8392e() {
        return this.f7079e;
    }

    /* renamed from: f */
    public boolean m8391f() {
        return this.f7080f;
    }

    /* renamed from: g */
    public boolean m8390g() {
        return this.f7076b == EnumC2912a.MISSING && this.f7084j;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    /* renamed from: h */
    public String m8389h() {
        return this.f7086l;
    }

    /* renamed from: i */
    public String m8388i() {
        return this.f7087m;
    }

    /* renamed from: j */
    public String m8387j() {
        return this.f7089o;
    }

    /* renamed from: k */
    public String m8386k() {
        return this.f7090p;
    }

    /* renamed from: l */
    public String m8385l() {
        return this.f7091q;
    }

    /* renamed from: m */
    public String m8384m() {
        return this.f7088n;
    }

    @Nullable
    /* renamed from: n */
    public List<String> m8383n() {
        return this.f7097w;
    }

    /* renamed from: o */
    public int m8382o() {
        return this.f7093s;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f7088n.equals(string)) {
            this.f7077c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter m8452b = C2895c.m8452b(string, this.f7075a);
            if (m8452b == null || this.f7089o.equals(m8452b.getSdkVersion())) {
                return;
            }
            this.f7089o = m8452b.getSdkVersion();
            this.f7075a.m7433ag().m7530a(this.f7089o, string);
        }
    }

    /* renamed from: p */
    public List<MaxAdFormat> m8381p() {
        return this.f7094t;
    }

    /* renamed from: q */
    public boolean m8380q() {
        return this.f7085k;
    }

    /* renamed from: r */
    public List<C2915d> m8379r() {
        return this.f7095u;
    }

    /* renamed from: s */
    public List<C2910a> m8378s() {
        return this.f7096v;
    }

    /* renamed from: t */
    public final C2914c m8377t() {
        return this.f7098x;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediatedNetwork{name=");
        sb.append(this.f7086l);
        sb.append(", displayName=");
        sb.append(this.f7087m);
        sb.append(", sdkAvailable=");
        sb.append(this.f7078d);
        sb.append(", sdkVersion=");
        sb.append(this.f7089o);
        sb.append(", adapterAvailable=");
        sb.append(this.f7079e);
        sb.append(", adapterVersion=");
        return C0484a.m12392a(sb, this.f7090p, "}");
    }

    /* renamed from: u */
    public String m8376u() {
        return this.f7092r;
    }

    /* renamed from: v */
    public final C3214m m8375v() {
        return this.f7075a;
    }

    /* renamed from: w */
    public final String m8374w() {
        StringBuilder sb = new StringBuilder("\n---------- ");
        sb.append(this.f7086l);
        sb.append(" ----------\nStatus  - ");
        sb.append(this.f7076b.m8370a());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.f7078d || TextUtils.isEmpty(this.f7089o)) ? "UNAVAILABLE" : this.f7089o);
        sb.append("\nAdapter - ");
        if (this.f7079e && !TextUtils.isEmpty(this.f7090p)) {
            str = this.f7090p;
        }
        sb.append(str);
        if (this.f7098x.m8365a() && !this.f7098x.m8364b()) {
            sb.append("\n* ");
            sb.append(this.f7098x.m8363c());
        }
        for (C2915d c2915d : m8379r()) {
            if (!c2915d.m8360c()) {
                sb.append("\n* MISSING ");
                sb.append(c2915d.m8362a());
                sb.append(": ");
                sb.append(c2915d.m8361b());
            }
        }
        for (C2910a c2910a : m8378s()) {
            if (!c2910a.m8403c()) {
                sb.append("\n* MISSING ");
                sb.append(c2910a.m8406a());
                sb.append(": ");
                sb.append(c2910a.m8404b());
            }
        }
        return sb.toString();
    }

    /* renamed from: x */
    public boolean m8373x() {
        return this.f7099y;
    }

    /* renamed from: y */
    public String m8372y() {
        return this.f7100z;
    }

    /* renamed from: z */
    public Map<MaxAdFormat, C2903b> m8371z() {
        return this.f7074A;
    }
}
