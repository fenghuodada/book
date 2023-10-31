package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.InterfaceC6499b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6544f;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6542d;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6565x;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d;
import com.google.android.datatransport.runtime.time.C6615d;
import com.google.android.datatransport.runtime.time.InterfaceC6611a;
import javax.inject.InterfaceC10733a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.i */
/* loaded from: classes.dex */
public final class C6537i implements InterfaceC6499b<InterfaceC6565x> {

    /* renamed from: a */
    public final InterfaceC10733a<Context> f10310a;

    /* renamed from: b */
    public final InterfaceC10733a<InterfaceC6574d> f10311b;

    /* renamed from: c */
    public final InterfaceC10733a<AbstractC6544f> f10312c;

    /* renamed from: d */
    public final InterfaceC10733a<InterfaceC6611a> f10313d;

    public C6537i(InterfaceC10733a interfaceC10733a, InterfaceC10733a interfaceC10733a2, C6535g c6535g) {
        C6615d c6615d = C6615d.C6616a.f10453a;
        this.f10310a = interfaceC10733a;
        this.f10311b = interfaceC10733a2;
        this.f10312c = c6535g;
        this.f10313d = c6615d;
    }

    @Override // javax.inject.InterfaceC10733a
    public final Object get() {
        this.f10313d.get();
        return new C6542d(this.f10310a.get(), this.f10311b.get(), this.f10312c.get());
    }
}
