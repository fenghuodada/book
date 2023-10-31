package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.InterfaceC6499b;
import com.google.android.datatransport.runtime.scheduling.persistence.C6580g;
import com.google.android.datatransport.runtime.scheduling.persistence.C6586i;
import javax.inject.InterfaceC10733a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.i0 */
/* loaded from: classes.dex */
public final class C6588i0 implements InterfaceC6499b<C6584h0> {

    /* renamed from: a */
    public final InterfaceC10733a<Context> f10418a;

    /* renamed from: b */
    public final InterfaceC10733a<String> f10419b;

    /* renamed from: c */
    public final InterfaceC10733a<Integer> f10420c;

    public C6588i0(InterfaceC10733a interfaceC10733a) {
        C6580g c6580g = C6580g.C6581a.f10410a;
        C6586i c6586i = C6586i.C6587a.f10417a;
        this.f10418a = interfaceC10733a;
        this.f10419b = c6580g;
        this.f10420c = c6586i;
    }

    @Override // javax.inject.InterfaceC10733a
    public final Object get() {
        return new C6584h0(this.f10418a.get(), this.f10419b.get(), this.f10420c.get().intValue());
    }
}
