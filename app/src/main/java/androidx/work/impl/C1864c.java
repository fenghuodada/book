package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.arch.core.executor.C0444b;
import androidx.lifecycle.C1489r;
import androidx.lifecycle.LiveData;
import androidx.work.InterfaceC2010o;
import androidx.work.impl.utils.futures.C1977c;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.c */
/* loaded from: classes.dex */
public final class C1864c implements InterfaceC2010o {

    /* renamed from: c */
    public final C1489r<InterfaceC2010o.AbstractC2011a> f4546c = new C1489r<>();

    /* renamed from: d */
    public final C1977c<InterfaceC2010o.AbstractC2011a.C2014c> f4547d = new C1977c<>();

    public C1864c() {
        m9861a(InterfaceC2010o.f4877b);
    }

    /* renamed from: a */
    public final void m9861a(@NonNull InterfaceC2010o.AbstractC2011a abstractC2011a) {
        boolean z;
        C1489r<InterfaceC2010o.AbstractC2011a> c1489r = this.f4546c;
        synchronized (c1489r.f3383a) {
            if (c1489r.f3388f == LiveData.f3382k) {
                z = true;
            } else {
                z = false;
            }
            c1489r.f3388f = abstractC2011a;
        }
        if (z) {
            C0444b.m12450a().m12449b(c1489r.f3392j);
        }
        if (abstractC2011a instanceof InterfaceC2010o.AbstractC2011a.C2014c) {
            this.f4547d.m9750h((InterfaceC2010o.AbstractC2011a.C2014c) abstractC2011a);
        } else if (abstractC2011a instanceof InterfaceC2010o.AbstractC2011a.C2012a) {
            this.f4547d.m9749i(((InterfaceC2010o.AbstractC2011a.C2012a) abstractC2011a).f4878a);
        }
    }
}
