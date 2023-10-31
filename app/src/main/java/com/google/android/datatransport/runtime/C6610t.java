package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.InterfaceC6499b;
import com.google.android.datatransport.runtime.scheduling.C6532d;
import com.google.android.datatransport.runtime.scheduling.InterfaceC6533e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6559r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6560s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6563v;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6564w;
import com.google.android.datatransport.runtime.time.C6613c;
import com.google.android.datatransport.runtime.time.C6615d;
import com.google.android.datatransport.runtime.time.InterfaceC6611a;
import javax.inject.InterfaceC10733a;

/* renamed from: com.google.android.datatransport.runtime.t */
/* loaded from: classes.dex */
public final class C6610t implements InterfaceC6499b<C6527r> {

    /* renamed from: a */
    public final InterfaceC10733a<InterfaceC6611a> f10447a;

    /* renamed from: b */
    public final InterfaceC10733a<InterfaceC6611a> f10448b;

    /* renamed from: c */
    public final InterfaceC10733a<InterfaceC6533e> f10449c;

    /* renamed from: d */
    public final InterfaceC10733a<C6559r> f10450d;

    /* renamed from: e */
    public final InterfaceC10733a<C6563v> f10451e;

    public C6610t(C6532d c6532d, C6560s c6560s, C6564w c6564w) {
        C6613c c6613c = C6613c.C6614a.f10452a;
        C6615d c6615d = C6615d.C6616a.f10453a;
        this.f10447a = c6613c;
        this.f10448b = c6615d;
        this.f10449c = c6532d;
        this.f10450d = c6560s;
        this.f10451e = c6564w;
    }

    @Override // javax.inject.InterfaceC10733a
    public final Object get() {
        return new C6527r(this.f10447a.get(), this.f10448b.get(), this.f10449c.get(), this.f10450d.get(), this.f10451e.get());
    }
}
