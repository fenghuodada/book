package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.C9545c;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.unity3d.services.core.timer.h */
/* loaded from: classes3.dex */
public class C9618h extends C9609a implements InterfaceC9614d {

    /* renamed from: j */
    private final Integer f19073j;

    /* renamed from: k */
    private final Integer f19074k;

    /* renamed from: l */
    private Integer f19075l;

    /* renamed from: m */
    private InterfaceC9616f f19076m;

    /* renamed from: n */
    private final AtomicInteger f19077n;

    public C9618h(Integer num, Integer num2, InterfaceC9616f interfaceC9616f, C9545c c9545c) {
        super(num, null, c9545c);
        this.f19077n = new AtomicInteger(0);
        this.f19073j = num2;
        this.f19076m = interfaceC9616f;
        int intValue = num2.intValue();
        int intValue2 = num.intValue();
        Integer valueOf = Integer.valueOf(intValue != 0 ? intValue2 / num2.intValue() : intValue2);
        this.f19074k = valueOf;
        this.f19075l = valueOf;
    }

    @Override // com.unity3d.services.core.timer.C9609a, com.unity3d.services.core.timer.InterfaceC9613c
    /* renamed from: a */
    public void mo1797a() {
        super.mo1797a();
        this.f19076m = null;
    }

    @Override // com.unity3d.services.core.timer.C9609a
    /* renamed from: d */
    public void mo1796d() {
        if (this.f19077n.addAndGet(this.f19064c.intValue()) >= this.f19075l.intValue()) {
            m1795i();
        }
        super.mo1796d();
    }

    /* renamed from: i */
    public void m1795i() {
        InterfaceC9616f interfaceC9616f = this.f19076m;
        if (interfaceC9616f != null) {
            interfaceC9616f.mo1799a();
        }
        this.f19075l = Integer.valueOf(this.f19074k.intValue() + this.f19075l.intValue());
    }
}
