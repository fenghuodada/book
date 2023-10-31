package com.google.android.datatransport.runtime;

import com.google.android.datatransport.AbstractC6430c;
import com.google.android.datatransport.C6428a;
import com.google.android.datatransport.C6429b;
import com.google.android.datatransport.InterfaceC6465e;
import com.google.android.datatransport.InterfaceC6466f;
import com.google.android.datatransport.InterfaceC6468h;
import com.google.android.datatransport.runtime.C6477b;
import java.util.HashMap;

/* renamed from: com.google.android.datatransport.runtime.p */
/* loaded from: classes.dex */
public final class C6525p<T> implements InterfaceC6466f<T> {

    /* renamed from: a */
    public final AbstractC6522n f10281a;

    /* renamed from: b */
    public final String f10282b;

    /* renamed from: c */
    public final C6429b f10283c;

    /* renamed from: d */
    public final InterfaceC6465e<T, byte[]> f10284d;

    /* renamed from: e */
    public final InterfaceC6526q f10285e;

    public C6525p(AbstractC6522n abstractC6522n, String str, C6429b c6429b, InterfaceC6465e<T, byte[]> interfaceC6465e, InterfaceC6526q interfaceC6526q) {
        this.f10281a = abstractC6522n;
        this.f10282b = str;
        this.f10283c = c6429b;
        this.f10284d = interfaceC6465e;
        this.f10285e = interfaceC6526q;
    }

    /* renamed from: a */
    public final void m6272a(C6428a c6428a, InterfaceC6468h interfaceC6468h) {
        AbstractC6522n abstractC6522n = this.f10281a;
        if (abstractC6522n != null) {
            String str = this.f10282b;
            if (str != null) {
                InterfaceC6465e<T, byte[]> interfaceC6465e = this.f10284d;
                if (interfaceC6465e != null) {
                    C6429b c6429b = this.f10283c;
                    if (c6429b != null) {
                        C6495c c6495c = new C6495c(abstractC6522n, str, c6428a, interfaceC6465e, c6429b);
                        C6527r c6527r = (C6527r) this.f10285e;
                        c6527r.getClass();
                        AbstractC6430c<?> abstractC6430c = c6495c.f10225c;
                        C6496d m6274e = c6495c.f10223a.m6274e(abstractC6430c.mo6354c());
                        C6477b.C6478a c6478a = new C6477b.C6478a();
                        c6478a.f10201f = new HashMap();
                        c6478a.f10199d = Long.valueOf(c6527r.f10287a.mo6226a());
                        c6478a.f10200e = Long.valueOf(c6527r.f10288b.mo6226a());
                        c6478a.m6314d(c6495c.f10224b);
                        Object mo6355b = abstractC6430c.mo6355b();
                        c6478a.m6315c(new C6511g(c6495c.f10227e, c6495c.f10226d.apply(mo6355b)));
                        c6478a.f10197b = abstractC6430c.mo6356a();
                        c6527r.f10289c.mo6268a(interfaceC6468h, c6478a.m6316b(), m6274e);
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }
}
