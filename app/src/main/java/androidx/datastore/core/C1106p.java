package androidx.datastore.core;

import androidx.datastore.core.C1107q;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.C10975e;
import kotlinx.coroutines.InterfaceC10976e0;
import kotlinx.coroutines.InterfaceC11017h1;
import kotlinx.coroutines.channels.C10956a;
import kotlinx.coroutines.channels.C10963e;
import kotlinx.coroutines.channels.C10968h;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.datastore.core.p */
/* loaded from: classes.dex */
public final class C1106p<T> {
    @NotNull

    /* renamed from: a */
    public final InterfaceC10976e0 f2824a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC10824p<T, InterfaceC10772d<? super C10868p>, Object> f2825b;
    @NotNull

    /* renamed from: c */
    public final C10956a f2826c;
    @NotNull

    /* renamed from: d */
    public final AtomicInteger f2827d;

    public C1106p(@NotNull InterfaceC10976e0 interfaceC10976e0, @NotNull C1119r c1119r, @NotNull C1120s onUndeliveredElement, @NotNull C1121t c1121t) {
        C10843j.m430f(onUndeliveredElement, "onUndeliveredElement");
        this.f2824a = interfaceC10976e0;
        this.f2825b = c1121t;
        this.f2826c = new C10956a(Integer.MAX_VALUE, null);
        this.f2827d = new AtomicInteger(0);
        InterfaceC11017h1 interfaceC11017h1 = (InterfaceC11017h1) interfaceC10976e0.mo266i().mo195a(InterfaceC11017h1.C11019b.f21607a);
        if (interfaceC11017h1 != null) {
            interfaceC11017h1.mo185m(new C1104n(c1119r, this, onUndeliveredElement));
        }
    }

    /* renamed from: a */
    public final void m11197a(C1107q.AbstractC1108a abstractC1108a) {
        C10963e.C10964a c10964a;
        Object m320y = this.f2826c.m320y(abstractC1108a);
        boolean z = m320y instanceof C10963e.C10964a;
        Throwable th = null;
        if (z) {
            if (z) {
                c10964a = (C10963e.C10964a) m320y;
            } else {
                c10964a = null;
            }
            if (c10964a != null) {
                th = c10964a.f21542a;
            }
            if (th == null) {
                throw new C10968h("Channel was closed normally");
            }
        } else if (!(m320y instanceof C10963e.C10965b)) {
            if (this.f2827d.getAndIncrement() == 0) {
                C10975e.m310a(this.f2824a, null, new C1105o(this, null), 3);
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
