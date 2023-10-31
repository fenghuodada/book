package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9569b;
import com.unity3d.services.core.properties.C9572d;
import com.unity3d.services.core.request.C9583h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.request.metrics.f */
/* loaded from: classes3.dex */
public class C9600f implements InterfaceC9596c {

    /* renamed from: a */
    private final C9598e f19040a;

    /* renamed from: b */
    private final String f19041b;

    /* renamed from: c */
    private final String f19042c;

    /* renamed from: d */
    private final ExecutorService f19043d = Executors.newSingleThreadExecutor();

    /* renamed from: e */
    private final C9569b f19044e;

    /* renamed from: com.unity3d.services.core.request.metrics.f$a */
    /* loaded from: classes3.dex */
    public class RunnableC9601a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f19045a;

        public RunnableC9601a(List list) {
            this.f19045a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            try {
                String jSONObject = new JSONObject(new C9603h(C9600f.this.f19042c, C9600f.this.f19040a, this.f19045a).m1840a()).toString();
                C9583h c9583h = new C9583h(C9600f.this.f19041b, "POST", null);
                c9583h.m1899a(jSONObject);
                c9583h.m1885n();
                if (c9583h.m1889j() / 100 == 2) {
                    str = "Metric " + this.f19045a + " sent to " + C9600f.this.f19041b;
                } else {
                    str = "Metric " + this.f19045a + " failed to send with response code: " + c9583h.m1889j();
                }
                C9549a.m2019b(str);
            } catch (Exception e) {
                C9549a.m2019b("Metric " + this.f19045a + " failed to send from exception: " + e.getMessage());
            }
        }
    }

    public C9600f(Configuration configuration, C9569b c9569b) {
        this.f19041b = configuration.getMetricsUrl();
        this.f19042c = String.valueOf((int) Math.round(configuration.getMetricSampleRate()));
        this.f19044e = c9569b;
        C9598e c9598e = new C9598e();
        this.f19040a = c9598e;
        c9598e.m1855a(configuration);
    }

    @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
    /* renamed from: a */
    public void mo1835a(C9597d c9597d) {
        if (c9597d == null || c9597d.m1857b() == null) {
            return;
        }
        c9597d.m1857b().put("state", this.f19044e.m1956a(C9572d.m1935e()));
        sendMetric(c9597d);
    }

    /* renamed from: a */
    public void m1847a(String str, String str2, Map<String, String> map) {
        mo1832a(new ArrayList(Collections.singletonList(new C9597d(str, str2, map))));
    }

    @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
    /* renamed from: a */
    public void mo1833a(String str, Map<String, String> map) {
        if (str != null && !str.isEmpty()) {
            m1847a(str, null, map);
            return;
        }
        C9549a.m2019b("Metric event not sent due to being null or empty: " + str);
    }

    @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
    /* renamed from: a */
    public void mo1832a(List<C9597d> list) {
        if (list == null || list.size() <= 0) {
            C9549a.m2019b("Metrics event not send due to being null or empty");
        } else if (TextUtils.isEmpty(this.f19041b)) {
            C9549a.m2019b("Metrics: " + list + " was not sent to null or empty endpoint: " + this.f19041b);
        } else if (!this.f19043d.isShutdown()) {
            this.f19043d.submit(new RunnableC9601a(list));
        } else {
            C9549a.m2019b("Metrics " + list + " was not sent due to misconfiguration");
        }
    }

    @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
    /* renamed from: a */
    public boolean mo1836a() {
        return true;
    }

    @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
    /* renamed from: b */
    public String mo1831b() {
        return this.f19041b;
    }

    /* renamed from: c */
    public void m1845c() {
        this.f19040a.m1851d();
        this.f19043d.shutdown();
    }

    @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
    public void sendMetric(C9597d c9597d) {
        mo1832a(new ArrayList(Collections.singletonList(c9597d)));
    }
}
