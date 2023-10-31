package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9569b;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.unity3d.services.core.request.metrics.i */
/* loaded from: classes3.dex */
public final class C9604i {

    /* renamed from: a */
    private static InterfaceC9596c f19053a;

    /* renamed from: b */
    private static C9602g f19054b;

    /* renamed from: c */
    private static final AtomicBoolean f19055c = new AtomicBoolean(false);

    /* renamed from: com.unity3d.services.core.request.metrics.i$a */
    /* loaded from: classes3.dex */
    public static final class C9605a implements InterfaceC9596c {

        /* renamed from: a */
        private final String f19056a;

        public C9605a(String str) {
            this.f19056a = str;
        }

        @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
        /* renamed from: a */
        public void mo1835a(C9597d c9597d) {
            sendMetric(c9597d);
        }

        /* renamed from: a */
        public void m1834a(String str) {
            C9549a.m2019b("Metric " + str + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
        /* renamed from: a */
        public void mo1833a(String str, Map<String, String> map) {
            m1834a(str);
        }

        @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
        /* renamed from: a */
        public void mo1832a(List<C9597d> list) {
            C9549a.m2019b("Metrics: " + list + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
        /* renamed from: a */
        public boolean mo1836a() {
            return false;
        }

        @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
        /* renamed from: b */
        public String mo1831b() {
            return this.f19056a;
        }

        @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
        public void sendMetric(C9597d c9597d) {
            C9549a.m2019b("Metric " + c9597d + " was skipped from being sent");
        }
    }

    /* renamed from: a */
    public static synchronized InterfaceC9596c m1839a() {
        C9602g c9602g;
        synchronized (C9604i.class) {
            if (f19053a == null) {
                f19053a = new C9605a(null);
            }
            if (f19054b == null) {
                f19054b = new C9602g(f19053a);
            }
            c9602g = f19054b;
        }
        return c9602g;
    }

    /* renamed from: a */
    private static boolean m1838a(Configuration configuration) {
        return !TextUtils.isEmpty(configuration.getMetricsUrl()) && f19055c.compareAndSet(false, true);
    }

    /* renamed from: b */
    public static void m1837b(Configuration configuration) {
        if (configuration == null) {
            C9549a.m2019b("Metrics will not be sent from the device for this session due to misconfiguration");
        } else if (m1838a(configuration)) {
            InterfaceC9596c interfaceC9596c = f19053a;
            if (interfaceC9596c instanceof C9600f) {
                ((C9600f) interfaceC9596c).m1845c();
            }
            if (configuration.getMetricSampleRate() >= new Random().nextInt(99) + 1) {
                f19053a = new C9600f(configuration, new C9569b());
            } else {
                C9549a.m2019b("Metrics will not be sent from the device for this session");
                f19053a = new C9605a("nullInstanceMetricsUrl");
            }
            C9602g c9602g = f19054b;
            if (c9602g == null) {
                f19054b = new C9602g(f19053a);
            } else {
                c9602g.m1843a(f19053a);
            }
            f19054b.m1841c();
        }
    }
}
