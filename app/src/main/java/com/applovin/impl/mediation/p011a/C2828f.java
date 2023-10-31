package com.applovin.impl.mediation.p011a;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p031c.C3108a;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.f */
/* loaded from: classes.dex */
public class C2828f {

    /* renamed from: a */
    private final JSONObject f6790a;

    /* renamed from: b */
    protected final C3214m f6791b;

    /* renamed from: c */
    private final JSONObject f6792c;

    /* renamed from: d */
    private final Map<String, Object> f6793d;

    /* renamed from: e */
    private final Object f6794e = new Object();

    /* renamed from: f */
    private final Object f6795f = new Object();

    /* renamed from: g */
    private String f6796g;
    @Nullable

    /* renamed from: h */
    private String f6797h;

    public C2828f(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C3214m c3214m) {
        if (c3214m == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.f6791b = c3214m;
        this.f6790a = jSONObject2;
        this.f6792c = jSONObject;
        this.f6793d = map;
    }

    /* renamed from: a */
    private int m8728a() {
        return m8718b("mute_state", m8726a("mute_state", ((Integer) this.f6791b.m7456a(C3108a.f7753K)).intValue()));
    }

    /* renamed from: I */
    public JSONObject m8746I() {
        JSONObject jSONObject;
        synchronized (this.f6795f) {
            jSONObject = this.f6790a;
        }
        return jSONObject;
    }

    /* renamed from: J */
    public JSONObject m8745J() {
        JSONObject jSONObject;
        synchronized (this.f6794e) {
            jSONObject = this.f6792c;
        }
        return jSONObject;
    }

    /* renamed from: K */
    public String m8744K() {
        return m8715b("class", (String) null);
    }

    /* renamed from: L */
    public String m8743L() {
        return m8715b("name", (String) null);
    }

    /* renamed from: M */
    public String m8742M() {
        return m8743L().split("_")[0];
    }

    /* renamed from: N */
    public boolean m8741N() {
        return m8716b("is_testing", Boolean.FALSE).booleanValue();
    }

    /* renamed from: O */
    public Boolean m8740O() {
        String str = this.f6791b.m7396p().getExtraParameters().get("huc");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : m8719b("huc") ? m8716b("huc", Boolean.FALSE) : m8724a("huc", (Boolean) null);
    }

    /* renamed from: P */
    public Boolean m8739P() {
        String str = this.f6791b.m7396p().getExtraParameters().get("aru");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : m8719b("aru") ? m8716b("aru", Boolean.FALSE) : m8724a("aru", (Boolean) null);
    }

    /* renamed from: Q */
    public Boolean m8738Q() {
        String str = this.f6791b.m7396p().getExtraParameters().get("dns");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : m8719b("dns") ? m8716b("dns", Boolean.FALSE) : m8724a("dns", (Boolean) null);
    }

    @Nullable
    /* renamed from: R */
    public String m8737R() {
        return m8719b("consent_string") ? m8715b("consent_string", (String) null) : m8722a("consent_string", (String) null);
    }

    /* renamed from: S */
    public boolean m8736S() {
        return m8716b("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    /* renamed from: T */
    public Map<String, Object> m8735T() {
        return this.f6793d;
    }

    /* renamed from: U */
    public Bundle m8734U() {
        Bundle bundle = m8713c("server_parameters") instanceof JSONObject ? JsonUtils.toBundle(m8720a("server_parameters", (JSONObject) null)) : new Bundle();
        int m8728a = m8728a();
        if (m8728a != -1) {
            bundle.putBoolean("is_muted", m8728a == 2 ? this.f6791b.m7396p().isMuted() : m8728a == 0);
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_AMOUNT)) {
            bundle.putLong(AppLovinEventParameters.REVENUE_AMOUNT, m8725a(AppLovinEventParameters.REVENUE_AMOUNT, 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", m8722a("currency", ""));
        }
        return bundle;
    }

    /* renamed from: V */
    public Bundle m8733V() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), m8734U());
    }

    /* renamed from: W */
    public long m8732W() {
        return m8717b("adapter_timeout_ms", ((Long) this.f6791b.m7456a(C3108a.f7776l)).longValue());
    }

    /* renamed from: X */
    public long m8731X() {
        return m8717b("init_completion_delay_ms", -1L);
    }

    /* renamed from: Y */
    public long m8730Y() {
        return m8717b("auto_init_delay_ms", 0L);
    }

    @Nullable
    /* renamed from: Z */
    public String m8729Z() {
        return this.f6797h;
    }

    /* renamed from: a */
    public float m8727a(String str, float f) {
        float f2;
        synchronized (this.f6794e) {
            f2 = JsonUtils.getFloat(this.f6792c, str, f);
        }
        return f2;
    }

    /* renamed from: a */
    public int m8726a(String str, int i) {
        int i2;
        synchronized (this.f6795f) {
            i2 = JsonUtils.getInt(this.f6790a, str, i);
        }
        return i2;
    }

    /* renamed from: a */
    public long m8725a(String str, long j) {
        long j2;
        synchronized (this.f6795f) {
            j2 = JsonUtils.getLong(this.f6790a, str, j);
        }
        return j2;
    }

    /* renamed from: a */
    public Boolean m8724a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f6795f) {
            bool2 = JsonUtils.getBoolean(this.f6790a, str, bool);
        }
        return bool2;
    }

    /* renamed from: a */
    public String m8722a(String str, String str2) {
        String string;
        synchronized (this.f6795f) {
            string = JsonUtils.getString(this.f6790a, str, str2);
        }
        return string;
    }

    /* renamed from: a */
    public JSONArray m8721a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f6795f) {
            jSONArray2 = JsonUtils.getJSONArray(this.f6790a, str, jSONArray);
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public JSONObject m8720a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f6794e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f6792c, str, jSONObject);
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public void m8723a(String str, Object obj) {
        synchronized (this.f6794e) {
            JsonUtils.putObject(this.f6792c, str, obj);
        }
    }

    /* renamed from: b */
    public int m8718b(String str, int i) {
        int i2;
        synchronized (this.f6794e) {
            i2 = JsonUtils.getInt(this.f6792c, str, i);
        }
        return i2;
    }

    /* renamed from: b */
    public long m8717b(String str, long j) {
        long j2;
        synchronized (this.f6794e) {
            j2 = JsonUtils.getLong(this.f6792c, str, j);
        }
        return j2;
    }

    /* renamed from: b */
    public Boolean m8716b(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f6794e) {
            bool2 = JsonUtils.getBoolean(this.f6792c, str, bool);
        }
        return bool2;
    }

    /* renamed from: b */
    public String m8715b(String str, String str2) {
        String string;
        synchronized (this.f6794e) {
            string = JsonUtils.getString(this.f6792c, str, str2);
        }
        return string;
    }

    /* renamed from: b */
    public JSONArray m8714b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f6794e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f6792c, str, jSONArray);
        }
        return jSONArray2;
    }

    /* renamed from: b */
    public boolean m8719b(String str) {
        boolean has;
        synchronized (this.f6794e) {
            has = this.f6792c.has(str);
        }
        return has;
    }

    /* renamed from: c */
    public Object m8713c(String str) {
        Object opt;
        synchronized (this.f6794e) {
            opt = this.f6792c.opt(str);
        }
        return opt;
    }

    /* renamed from: c */
    public void m8712c(String str, int i) {
        synchronized (this.f6794e) {
            JsonUtils.putInt(this.f6792c, str, i);
        }
    }

    /* renamed from: c */
    public void m8711c(String str, long j) {
        synchronized (this.f6794e) {
            JsonUtils.putLong(this.f6792c, str, j);
        }
    }

    /* renamed from: c */
    public void m8710c(String str, String str2) {
        synchronized (this.f6794e) {
            JsonUtils.putString(this.f6792c, str, str2);
        }
    }

    /* renamed from: d */
    public void m8709d(String str) {
        this.f6796g = str;
    }

    /* renamed from: e */
    public void m8708e(@Nullable String str) {
        this.f6797h = str;
    }

    /* renamed from: f */
    public List<String> m8707f(String str) {
        if (str != null) {
            JSONArray m8721a = m8721a(str, new JSONArray());
            List list = Collections.EMPTY_LIST;
            List optList = JsonUtils.optList(m8721a, list);
            List optList2 = JsonUtils.optList(m8714b(str, new JSONArray()), list);
            ArrayList arrayList = new ArrayList(optList2.size() + optList.size());
            arrayList.addAll(optList);
            arrayList.addAll(optList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    /* renamed from: g */
    public String m8706g(String str) {
        String m8715b = m8715b(str, "");
        return StringUtils.isValidString(m8715b) ? m8715b : m8722a(str, "");
    }

    public String getAdUnitId() {
        return m8722a("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f6796g;
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + m8744K() + "', adapterName='" + m8743L() + "', isTesting=" + m8741N() + '}';
    }
}
