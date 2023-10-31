package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.coroutines.C10781g;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10773e;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.intrinsics.C10783b;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.InterfaceC11017h1;
import kotlinx.coroutines.internal.C11026b0;
import kotlinx.coroutines.internal.C11040i0;
import kotlinx.coroutines.internal.C11048l;
import kotlinx.coroutines.intrinsics.C11069a;
import kotlinx.coroutines.scheduling.C11107c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.e */
/* loaded from: classes3.dex */
public final class C10975e {
    /* renamed from: a */
    public static void m310a(InterfaceC10976e0 interfaceC10976e0, AbstractC10946b0 abstractC10946b0, InterfaceC10824p interfaceC10824p, int i) {
        int i2;
        AbstractC10936a c11153w1;
        InterfaceC10775f interfaceC10775f = abstractC10946b0;
        if ((i & 1) != 0) {
            interfaceC10775f = C10781g.f21377a;
        }
        boolean z = false;
        if ((i & 2) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        InterfaceC10775f m102a = C11160z.m102a(interfaceC10976e0.mo266i(), interfaceC10775f, true);
        C11107c c11107c = C11093p0.f21708a;
        if (m102a != c11107c && m102a.mo195a(InterfaceC10773e.C10774a.f21375a) == null) {
            m102a = m102a.mo190f(c11107c);
        }
        if (i2 != 0) {
            if (i2 == 2) {
                z = true;
            }
            if (z) {
                c11153w1 = new C11094p1(m102a, interfaceC10824p);
            } else {
                c11153w1 = new C11153w1(m102a, true);
            }
            c11153w1.m355d0(i2, c11153w1, interfaceC10824p);
            return;
        }
        throw null;
    }

    @Nullable
    /* renamed from: b */
    public static final Object m309b(@NotNull InterfaceC10772d interfaceC10772d, @NotNull InterfaceC10775f interfaceC10775f, @NotNull InterfaceC10824p interfaceC10824p) {
        InterfaceC10775f m102a;
        InterfaceC10775f context = interfaceC10772d.getContext();
        boolean z = false;
        if (!((Boolean) interfaceC10775f.mo183w(Boolean.FALSE, C10937a0.f21491a)).booleanValue()) {
            m102a = context.mo190f(interfaceC10775f);
        } else {
            m102a = C11160z.m102a(context, interfaceC10775f, false);
        }
        InterfaceC11017h1 interfaceC11017h1 = (InterfaceC11017h1) m102a.mo195a(InterfaceC11017h1.C11019b.f21607a);
        if (interfaceC11017h1 != null && !interfaceC11017h1.mo191c()) {
            throw interfaceC11017h1.mo188j();
        }
        if (m102a == context) {
            C11026b0 c11026b0 = new C11026b0(interfaceC10772d, m102a);
            return C11069a.m227a(c11026b0, c11026b0, interfaceC10824p);
        }
        InterfaceC10773e.C10774a c10774a = InterfaceC10773e.C10774a.f21375a;
        if (C10843j.m435a(m102a.mo195a(c10774a), context.mo195a(c10774a))) {
            C10950b2 c10950b2 = new C10950b2(interfaceC10772d, m102a);
            InterfaceC10775f interfaceC10775f2 = c10950b2.f21490c;
            Object m260b = C11040i0.m260b(interfaceC10775f2, null);
            try {
                return C11069a.m227a(c10950b2, c10950b2, interfaceC10824p);
            } finally {
                C11040i0.m261a(interfaceC10775f2, m260b);
            }
        }
        C11077l0 c11077l0 = new C11077l0(interfaceC10772d, m102a);
        try {
            C11048l.m252a(C10783b.m455b(C10783b.m456a(c11077l0, c11077l0, interfaceC10824p)), C10868p.f21418a, null);
            while (true) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C11077l0.f21683e;
                int i = atomicIntegerFieldUpdater.get(c11077l0);
                if (i != 0) {
                    if (i != 2) {
                        throw new IllegalStateException("Already suspended".toString());
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(c11077l0, 0, 1)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return EnumC10782a.COROUTINE_SUSPENDED;
            }
            Object m172a = C11091o1.m172a(c11077l0.m207M());
            if (!(m172a instanceof C11137t)) {
                return m172a;
            }
            throw ((C11137t) m172a).f21796a;
        } catch (Throwable th) {
            c11077l0.resumeWith(C10864l.m419a(th));
            throw th;
        }
    }
}
