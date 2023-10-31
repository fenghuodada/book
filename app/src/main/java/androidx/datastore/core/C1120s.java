package androidx.datastore.core;

import androidx.datastore.core.C1107q;
import java.util.concurrent.CancellationException;
import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;

/* renamed from: androidx.datastore.core.s */
/* loaded from: classes.dex */
public final class C1120s extends AbstractC10844k implements InterfaceC10824p<C1107q.AbstractC1108a<Object>, Throwable, C10868p> {

    /* renamed from: a */
    public static final C1120s f2885a = new C1120s();

    public C1120s() {
        super(2);
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    public final C10868p invoke(C1107q.AbstractC1108a<Object> abstractC1108a, Throwable th) {
        C1107q.AbstractC1108a<Object> msg = abstractC1108a;
        Throwable th2 = th;
        C10843j.m430f(msg, "msg");
        if (msg instanceof C1107q.AbstractC1108a.C1110b) {
            C1107q.AbstractC1108a.C1110b c1110b = (C1107q.AbstractC1108a.C1110b) msg;
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            c1110b.f2842b.mo168q(th2);
        }
        return C10868p.f21418a;
    }
}
