package androidx.datastore.core;

import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;

/* renamed from: androidx.datastore.core.r */
/* loaded from: classes.dex */
public final class C1119r extends AbstractC10844k implements InterfaceC10820l<Throwable, C10868p> {

    /* renamed from: a */
    public final /* synthetic */ C1107q<Object> f2884a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1119r(C1107q<Object> c1107q) {
        super(1);
        this.f2884a = c1107q;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final C10868p invoke(Throwable th) {
        Throwable th2 = th;
        if (th2 != null) {
            this.f2884a.f2837h.setValue(new C1100j(th2));
        }
        Object obj = C1107q.f2829l;
        C1107q<Object> c1107q = this.f2884a;
        synchronized (obj) {
            C1107q.f2828k.remove(c1107q.m11195c().getAbsolutePath());
        }
        return C10868p.f21418a;
    }
}
