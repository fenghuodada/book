package com.applovin.impl.mediation.p014c;

import android.content.Context;
import com.applovin.impl.mediation.p011a.C2829g;
import com.applovin.impl.mediation.p011a.C2831h;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3108a;
import com.applovin.impl.sdk.p031c.C3111d;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.p033e.C3189z;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.b */
/* loaded from: classes.dex */
public class C2873b extends AbstractRunnableC3131a {

    /* renamed from: a */
    private static String f6944a;

    /* renamed from: c */
    private final MaxAdFormat f6945c;

    /* renamed from: d */
    private final Map<String, Object> f6946d;

    /* renamed from: e */
    private final Context f6947e;

    /* renamed from: f */
    private final InterfaceC2875a f6948f;

    /* renamed from: com.applovin.impl.mediation.c.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2875a {
        /* renamed from: a */
        void mo8480a(JSONArray jSONArray);
    }

    /* renamed from: com.applovin.impl.mediation.c.b$b */
    /* loaded from: classes.dex */
    public static class RunnableC2876b implements C2829g.InterfaceC2830a, Runnable {

        /* renamed from: a */
        private final InterfaceC2875a f6952a;

        /* renamed from: b */
        private final Object f6953b;

        /* renamed from: c */
        private int f6954c;

        /* renamed from: d */
        private final AtomicBoolean f6955d;

        /* renamed from: e */
        private final Collection<C2829g> f6956e;

        /* renamed from: f */
        private final C3349v f6957f;

        private RunnableC2876b(int i, InterfaceC2875a interfaceC2875a, C3349v c3349v) {
            this.f6954c = i;
            this.f6952a = interfaceC2875a;
            this.f6957f = c3349v;
            this.f6953b = new Object();
            this.f6956e = new ArrayList(i);
            this.f6955d = new AtomicBoolean();
        }

        /* renamed from: a */
        private void m8539a() {
            ArrayList arrayList;
            String str;
            String m8699d;
            synchronized (this.f6953b) {
                arrayList = new ArrayList(this.f6956e);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2829g c2829g = (C2829g) it.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    C2831h m8705a = c2829g.m8705a();
                    jSONObject.put("name", m8705a.m8743L());
                    jSONObject.put("class", m8705a.m8744K());
                    jSONObject.put("adapter_version", c2829g.m8700c());
                    jSONObject.put("sdk_version", c2829g.m8702b());
                    JSONObject jSONObject2 = new JSONObject();
                    if (StringUtils.isValidString(c2829g.m8698e())) {
                        str = "error_message";
                        m8699d = c2829g.m8698e();
                    } else {
                        str = "signal";
                        m8699d = c2829g.m8699d();
                    }
                    jSONObject2.put(str, m8699d);
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (C3349v.m6862a()) {
                        C3349v c3349v = this.f6957f;
                        c3349v.m6855b("TaskCollectSignals", "Collected signal from " + m8705a);
                    }
                } catch (JSONException e) {
                    if (C3349v.m6862a()) {
                        this.f6957f.m6854b("TaskCollectSignals", "Failed to create signal data", e);
                    }
                }
            }
            m8537a(jSONArray);
        }

        /* renamed from: a */
        private void m8537a(JSONArray jSONArray) {
            InterfaceC2875a interfaceC2875a = this.f6952a;
            if (interfaceC2875a != null) {
                interfaceC2875a.mo8480a(jSONArray);
            }
        }

        @Override // com.applovin.impl.mediation.p011a.C2829g.InterfaceC2830a
        /* renamed from: a */
        public void mo8538a(C2829g c2829g) {
            boolean z;
            synchronized (this.f6953b) {
                this.f6956e.add(c2829g);
                int i = this.f6954c - 1;
                this.f6954c = i;
                z = i < 1;
            }
            if (z && this.f6955d.compareAndSet(false, true)) {
                m8539a();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6955d.compareAndSet(false, true)) {
                m8539a();
            }
        }
    }

    static {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(m8544a("APPLOVIN_NETWORK", "com.applovin.mediation.adapters.AppLovinMediationAdapter"));
            m8544a("FACEBOOK_NETWORK", "com.applovin.mediation.adapters.FacebookMediationAdapter").put("run_on_ui_thread", false);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("signal_providers", jSONArray);
            f6944a = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }

    public C2873b(MaxAdFormat maxAdFormat, Map<String, Object> map, Context context, C3214m c3214m, InterfaceC2875a interfaceC2875a) {
        super("TaskCollectSignals", c3214m);
        this.f6945c = maxAdFormat;
        this.f6946d = map;
        this.f6947e = context;
        this.f6948f = interfaceC2875a;
    }

    /* renamed from: a */
    private static JSONObject m8544a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put("class", str2);
        jSONObject.put("adapter_timeout_ms", 30000);
        jSONObject.put("max_signal_length", 32768);
        jSONObject.put("scode", "");
        return jSONObject;
    }

    /* renamed from: a */
    private void m8546a(final C2831h c2831h, final C2829g.InterfaceC2830a interfaceC2830a) {
        if (c2831h.m8736S()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.c.b.1
                @Override // java.lang.Runnable
                public void run() {
                    ((AbstractRunnableC3131a) C2873b.this).f8192b.m7483E().collectSignal(C2873b.this.f6945c, c2831h, C2873b.this.f6947e, interfaceC2830a);
                }
            });
        } else {
            this.f8192b.m7483E().collectSignal(this.f6945c, c2831h, this.f6947e, interfaceC2830a);
        }
    }

    /* renamed from: a */
    private void m8543a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException, InterruptedException {
        RunnableC2876b runnableC2876b = new RunnableC2876b(jSONArray.length(), this.f6948f, this.f8192b.m7487A());
        for (int i = 0; i < jSONArray.length(); i++) {
            m8546a(new C2831h(this.f6946d, jSONArray.getJSONObject(i), jSONObject, this.f8192b), runnableC2876b);
        }
        this.f8192b.m7469S().m7619a(new C3189z(this.f8192b, runnableC2876b), C3163o.EnumC3165a.MAIN, ((Long) this.f8192b.m7456a(C3108a.f7775k)).longValue());
    }

    /* renamed from: b */
    private void m8541b(String str, Throwable th) {
        if (C3349v.m6862a()) {
            m7704a("No signals collected: " + str, th);
        }
        InterfaceC2875a interfaceC2875a = this.f6948f;
        if (interfaceC2875a != null) {
            interfaceC2875a.mo8480a(new JSONArray());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject((String) this.f8192b.m7421b((C3111d<C3111d<String>>) C3111d.f8088x, (C3111d<String>) f6944a));
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray != null && jSONArray.length() != 0) {
                m8543a(jSONArray, jSONObject);
                return;
            }
            m8541b("No signal providers found", null);
        } catch (InterruptedException e) {
            e = e;
            str = "Failed to wait for signals";
            m8541b(str, e);
        } catch (JSONException e2) {
            e = e2;
            str = "Failed to parse signals JSON";
            m8541b(str, e);
        } catch (Throwable th) {
            e = th;
            str = "Failed to collect signals";
            m8541b(str, e);
        }
    }
}
