package com.applovin.impl.mediation;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.p011a.C2828f;
import com.applovin.impl.mediation.p014c.C2869a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3111d;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.e */
/* loaded from: classes.dex */
public class C2977e {

    /* renamed from: a */
    private final C3214m f7357a;

    /* renamed from: b */
    private final C3349v f7358b;

    /* renamed from: c */
    private final AtomicBoolean f7359c = new AtomicBoolean();

    /* renamed from: d */
    private final JSONArray f7360d = new JSONArray();

    /* renamed from: e */
    private final LinkedHashSet<String> f7361e = new LinkedHashSet<>();

    /* renamed from: f */
    private final Object f7362f = new Object();

    /* renamed from: g */
    private List<C2828f> f7363g;

    public C2977e(C3214m c3214m) {
        this.f7357a = c3214m;
        this.f7358b = c3214m.m7487A();
    }

    /* renamed from: a */
    private List<C2828f> m8183a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C2828f(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, this.f7357a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m8189a(Activity activity) {
        if (this.f7359c.compareAndSet(false, true)) {
            String str = (String) this.f7357a.m7454a(C3111d.f8089y);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<C2828f> m8183a = m8183a(JsonUtils.getJSONArray(jSONObject, this.f7357a.m7478J().m8198a() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f7363g = m8183a;
                    this.f7357a.m7469S().m7621a((AbstractRunnableC3131a) new C2869a(m8183a, activity, this.f7357a));
                } catch (JSONException e) {
                    if (C3349v.m6862a()) {
                        this.f7358b.m6854b("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m8187a(C2828f c2828f, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f7362f) {
            z = !m8188a(c2828f);
            if (z) {
                this.f7361e.add(c2828f.m8744K());
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putString(jSONObject, "class", c2828f.m8744K());
                JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                this.f7360d.put(jSONObject);
            }
        }
        if (z) {
            this.f7357a.m7457a(c2828f);
            this.f7357a.m7483E().processAdapterInitializationPostback(c2828f, j, initializationStatus, str);
            this.f7357a.m7433ag().m7532a(initializationStatus, c2828f.m8744K());
        }
    }

    /* renamed from: a */
    public void m8186a(C2828f c2828f, Activity activity) {
        m8185a(c2828f, activity, null);
    }

    /* renamed from: a */
    public void m8185a(C2828f c2828f, Activity activity, @Nullable Runnable runnable) {
        List<C2828f> list;
        if (this.f7357a.m7478J().m8198a() && (list = this.f7363g) != null) {
            Iterator<C2828f> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c2828f = null;
                    break;
                }
                C2828f next = it.next();
                if (next.m8744K().equals(c2828f.m8744K())) {
                    c2828f = next;
                    break;
                }
            }
        }
        if (c2828f == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        C2980g m8179a = this.f7357a.m7485C().m8179a(c2828f);
        if (m8179a == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f7358b;
            c3349v.m6853c("MediationAdapterInitializationManager", "Initializing adapter " + c2828f);
        }
        m8179a.m8161a(MaxAdapterParametersImpl.m8840a(c2828f), activity, runnable);
    }

    /* renamed from: a */
    public void m8184a(MaxAdapter.InitializationStatus initializationStatus) {
        this.f7357a.m7433ag().m7532a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }

    /* renamed from: a */
    public boolean m8190a() {
        return this.f7359c.get();
    }

    /* renamed from: a */
    public boolean m8188a(C2828f c2828f) {
        boolean contains;
        synchronized (this.f7362f) {
            contains = this.f7361e.contains(c2828f.m8744K());
        }
        return contains;
    }

    /* renamed from: b */
    public LinkedHashSet<String> m8182b() {
        LinkedHashSet<String> linkedHashSet;
        synchronized (this.f7362f) {
            linkedHashSet = this.f7361e;
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public JSONArray m8181c() {
        JSONArray jSONArray;
        synchronized (this.f7362f) {
            jSONArray = this.f7360d;
        }
        return jSONArray;
    }
}
