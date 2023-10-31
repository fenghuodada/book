package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.InterfaceC6499b;
import com.google.android.datatransport.runtime.scheduling.persistence.C6589j;
import com.google.android.datatransport.runtime.time.C6613c;
import com.google.android.datatransport.runtime.time.C6615d;
import com.google.android.datatransport.runtime.time.InterfaceC6611a;
import javax.inject.InterfaceC10733a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.b0 */
/* loaded from: classes.dex */
public final class C6571b0 implements InterfaceC6499b<C6567a0> {

    /* renamed from: a */
    public final InterfaceC10733a<InterfaceC6611a> f10404a;

    /* renamed from: b */
    public final InterfaceC10733a<InterfaceC6611a> f10405b;

    /* renamed from: c */
    public final InterfaceC10733a<AbstractC6576e> f10406c;

    /* renamed from: d */
    public final InterfaceC10733a<C6584h0> f10407d;

    /* renamed from: e */
    public final InterfaceC10733a<String> f10408e;

    public C6571b0(InterfaceC10733a interfaceC10733a, InterfaceC10733a interfaceC10733a2) {
        C6613c c6613c = C6613c.C6614a.f10452a;
        C6615d c6615d = C6615d.C6616a.f10453a;
        C6589j c6589j = C6589j.C6590a.f10421a;
        this.f10404a = c6613c;
        this.f10405b = c6615d;
        this.f10406c = c6589j;
        this.f10407d = interfaceC10733a;
        this.f10408e = interfaceC10733a2;
    }

    @Override // javax.inject.InterfaceC10733a
    public final Object get() {
        InterfaceC6611a interfaceC6611a = this.f10404a.get();
        InterfaceC6611a interfaceC6611a2 = this.f10405b.get();
        AbstractC6576e abstractC6576e = this.f10406c.get();
        return new C6567a0(interfaceC6611a, interfaceC6611a2, abstractC6576e, this.f10407d.get(), this.f10408e);
    }
}
