package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.C6515j;
import com.google.android.datatransport.runtime.backends.C6490l;
import com.google.android.datatransport.runtime.backends.C6493n;
import com.google.android.datatransport.runtime.dagger.internal.C6498a;
import com.google.android.datatransport.runtime.dagger.internal.C6500c;
import com.google.android.datatransport.runtime.scheduling.C6532d;
import com.google.android.datatransport.runtime.scheduling.C6535g;
import com.google.android.datatransport.runtime.scheduling.C6537i;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6560s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6564w;
import com.google.android.datatransport.runtime.scheduling.persistence.C6567a0;
import com.google.android.datatransport.runtime.scheduling.persistence.C6571b0;
import com.google.android.datatransport.runtime.scheduling.persistence.C6583h;
import com.google.android.datatransport.runtime.scheduling.persistence.C6588i0;
import java.util.concurrent.Executor;
import javax.inject.InterfaceC10733a;

/* renamed from: com.google.android.datatransport.runtime.e */
/* loaded from: classes.dex */
public final class C6501e extends AbstractC6528s {

    /* renamed from: a */
    public InterfaceC10733a<Executor> f10238a = C6498a.m6298a(C6515j.C6516a.f10274a);

    /* renamed from: b */
    public C6500c f10239b;

    /* renamed from: c */
    public InterfaceC10733a f10240c;

    /* renamed from: d */
    public C6588i0 f10241d;

    /* renamed from: e */
    public InterfaceC10733a<C6567a0> f10242e;

    /* renamed from: f */
    public InterfaceC10733a<C6527r> f10243f;

    public C6501e(Context context) {
        if (context != null) {
            C6500c c6500c = new C6500c(context);
            this.f10239b = c6500c;
            this.f10240c = C6498a.m6298a(new C6493n(c6500c, new C6490l(c6500c)));
            C6500c c6500c2 = this.f10239b;
            this.f10241d = new C6588i0(c6500c2);
            InterfaceC10733a<C6567a0> m6298a = C6498a.m6298a(new C6571b0(this.f10241d, C6498a.m6298a(new C6583h(c6500c2))));
            this.f10242e = m6298a;
            C6535g c6535g = new C6535g();
            C6500c c6500c3 = this.f10239b;
            C6537i c6537i = new C6537i(c6500c3, m6298a, c6535g);
            InterfaceC10733a<Executor> interfaceC10733a = this.f10238a;
            InterfaceC10733a interfaceC10733a2 = this.f10240c;
            this.f10243f = C6498a.m6298a(new C6610t(new C6532d(interfaceC10733a, interfaceC10733a2, c6537i, m6298a, m6298a), new C6560s(c6500c3, interfaceC10733a2, m6298a, c6537i, interfaceC10733a, m6298a, m6298a), new C6564w(interfaceC10733a, m6298a, c6537i, m6298a)));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }
}
