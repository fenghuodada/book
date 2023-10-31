package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9569b;
import com.unity3d.services.core.properties.C9572d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.unity3d.services.core.request.metrics.g */
/* loaded from: classes3.dex */
public class C9602g implements InterfaceC9596c {

    /* renamed from: b */
    private InterfaceC9596c f19048b;

    /* renamed from: a */
    private final LinkedBlockingQueue<C9597d> f19047a = new LinkedBlockingQueue<>();

    /* renamed from: c */
    private final C9569b f19049c = new C9569b();

    public C9602g(InterfaceC9596c interfaceC9596c) {
        this.f19048b = interfaceC9596c;
    }

    /* renamed from: a */
    public void m1843a(InterfaceC9596c interfaceC9596c) {
        this.f19048b = interfaceC9596c;
    }

    @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
    /* renamed from: a */
    public void mo1835a(C9597d c9597d) {
        if (c9597d == null || c9597d.m1857b() == null) {
            return;
        }
        c9597d.m1857b().put("state", this.f19049c.m1956a(C9572d.m1935e()));
        sendMetric(c9597d);
    }

    /* renamed from: a */
    public void m1842a(String str, String str2, Map<String, String> map) {
        if (str != null && !str.isEmpty()) {
            mo1832a(new ArrayList(Collections.singletonList(new C9597d(str, str2, map))));
            return;
        }
        C9549a.m2019b("Metric event not sent due to being null or empty: " + str);
    }

    @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
    /* renamed from: a */
    public void mo1833a(String str, Map<String, String> map) {
        m1842a(str, null, map);
    }

    @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
    /* renamed from: a */
    public synchronized void mo1832a(List<C9597d> list) {
        this.f19047a.addAll(list);
        if (!TextUtils.isEmpty(this.f19048b.mo1831b()) && this.f19047a.size() > 0) {
            ArrayList arrayList = new ArrayList();
            this.f19047a.drainTo(arrayList);
            this.f19048b.mo1832a(arrayList);
        }
    }

    @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
    /* renamed from: a */
    public boolean mo1836a() {
        return this.f19048b.mo1836a();
    }

    @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
    /* renamed from: b */
    public String mo1831b() {
        InterfaceC9596c interfaceC9596c = this.f19048b;
        if (interfaceC9596c == null) {
            return null;
        }
        return interfaceC9596c.mo1831b();
    }

    /* renamed from: c */
    public void m1841c() {
        mo1832a(new ArrayList());
    }

    @Override // com.unity3d.services.core.request.metrics.InterfaceC9596c
    public void sendMetric(C9597d c9597d) {
        mo1832a(new ArrayList(Collections.singletonList(c9597d)));
    }
}
