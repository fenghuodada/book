package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.request.metrics.C9604i;
import com.unity3d.services.core.request.metrics.C9606j;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.unity3d.services.core.device.reader.c */
/* loaded from: classes3.dex */
public class C9519c implements InterfaceC9531n {

    /* renamed from: a */
    private final InterfaceC9531n f18846a;

    /* renamed from: b */
    private long f18847b;

    /* renamed from: c */
    private long f18848c;

    /* renamed from: d */
    private long f18849d;

    public C9519c(InterfaceC9531n interfaceC9531n) {
        this.f18846a = interfaceC9531n;
    }

    /* renamed from: b */
    private long m2069b() {
        return TimeUnit.NANOSECONDS.toMillis(this.f18849d - this.f18848c);
    }

    /* renamed from: d */
    private long m2067d() {
        return TimeUnit.NANOSECONDS.toMillis(this.f18848c - this.f18847b);
    }

    /* renamed from: e */
    private void m2066e() {
        C9604i.m1839a().sendMetric(C9606j.m1829a(Long.valueOf(m2067d())));
        C9604i.m1839a().sendMetric(C9606j.m1825b(Long.valueOf(m2069b())));
    }

    @Override // com.unity3d.services.core.device.reader.InterfaceC9532o
    /* renamed from: a */
    public Map<String, Object> mo2056a() {
        return this.f18846a.mo2056a();
    }

    @Override // com.unity3d.services.core.device.reader.InterfaceC9531n
    /* renamed from: a */
    public byte[] mo2057a(Map<String, Object> map) {
        this.f18848c = System.nanoTime();
        byte[] mo2057a = this.f18846a.mo2057a(map);
        this.f18849d = System.nanoTime();
        return mo2057a;
    }

    /* renamed from: c */
    public byte[] m2068c() {
        if (this.f18846a == null) {
            return new byte[0];
        }
        this.f18847b = System.nanoTime();
        byte[] mo2057a = mo2057a(mo2056a());
        m2066e();
        return mo2057a;
    }
}
