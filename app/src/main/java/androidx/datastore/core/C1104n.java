package androidx.datastore.core;

import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.AbstractC10844k;
import kotlinx.coroutines.channels.C10963e;

/* renamed from: androidx.datastore.core.n */
/* loaded from: classes.dex */
public final class C1104n extends AbstractC10844k implements InterfaceC10820l<Throwable, C10868p> {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10820l<Throwable, C10868p> f2818a;

    /* renamed from: b */
    public final /* synthetic */ C1106p<Object> f2819b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10824p<Object, Throwable, C10868p> f2820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1104n(C1119r c1119r, C1106p c1106p, C1120s c1120s) {
        super(1);
        this.f2818a = c1119r;
        this.f2819b = c1106p;
        this.f2820c = c1120s;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final C10868p invoke(Throwable th) {
        C10868p c10868p;
        Throwable th2 = th;
        this.f2818a.invoke(th2);
        C1106p<Object> c1106p = this.f2819b;
        c1106p.f2826c.m341d(th2);
        do {
            Object m323v = c1106p.f2826c.m323v();
            c10868p = null;
            if (m323v instanceof C10963e.C10965b) {
                m323v = null;
            }
            if (m323v != null) {
                this.f2820c.invoke(m323v, th2);
                c10868p = C10868p.f21418a;
                continue;
            }
        } while (c10868p != null);
        return C10868p.f21418a;
    }
}
