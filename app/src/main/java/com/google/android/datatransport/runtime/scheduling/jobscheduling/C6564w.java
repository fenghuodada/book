package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.InterfaceC6499b;
import com.google.android.datatransport.runtime.scheduling.C6537i;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6608b;
import java.util.concurrent.Executor;
import javax.inject.InterfaceC10733a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.w */
/* loaded from: classes.dex */
public final class C6564w implements InterfaceC6499b<C6563v> {

    /* renamed from: a */
    public final InterfaceC10733a<Executor> f10384a;

    /* renamed from: b */
    public final InterfaceC10733a<InterfaceC6574d> f10385b;

    /* renamed from: c */
    public final InterfaceC10733a<InterfaceC6565x> f10386c;

    /* renamed from: d */
    public final InterfaceC10733a<InterfaceC6608b> f10387d;

    public C6564w(InterfaceC10733a interfaceC10733a, InterfaceC10733a interfaceC10733a2, C6537i c6537i, InterfaceC10733a interfaceC10733a3) {
        this.f10384a = interfaceC10733a;
        this.f10385b = interfaceC10733a2;
        this.f10386c = c6537i;
        this.f10387d = interfaceC10733a3;
    }

    @Override // javax.inject.InterfaceC10733a
    public final Object get() {
        return new C6563v(this.f10384a.get(), this.f10385b.get(), this.f10386c.get(), this.f10387d.get());
    }
}
