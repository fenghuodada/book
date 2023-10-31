package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.InterfaceC6483e;
import com.google.android.datatransport.runtime.dagger.internal.InterfaceC6499b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6565x;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6608b;
import java.util.concurrent.Executor;
import javax.inject.InterfaceC10733a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.d */
/* loaded from: classes.dex */
public final class C6532d implements InterfaceC6499b<C6531c> {

    /* renamed from: a */
    public final InterfaceC10733a<Executor> f10304a;

    /* renamed from: b */
    public final InterfaceC10733a<InterfaceC6483e> f10305b;

    /* renamed from: c */
    public final InterfaceC10733a<InterfaceC6565x> f10306c;

    /* renamed from: d */
    public final InterfaceC10733a<InterfaceC6574d> f10307d;

    /* renamed from: e */
    public final InterfaceC10733a<InterfaceC6608b> f10308e;

    public C6532d(InterfaceC10733a interfaceC10733a, InterfaceC10733a interfaceC10733a2, C6537i c6537i, InterfaceC10733a interfaceC10733a3, InterfaceC10733a interfaceC10733a4) {
        this.f10304a = interfaceC10733a;
        this.f10305b = interfaceC10733a2;
        this.f10306c = c6537i;
        this.f10307d = interfaceC10733a3;
        this.f10308e = interfaceC10733a4;
    }

    @Override // javax.inject.InterfaceC10733a
    public final Object get() {
        return new C6531c(this.f10304a.get(), this.f10305b.get(), this.f10306c.get(), this.f10307d.get(), this.f10308e.get());
    }
}
