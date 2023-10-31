package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import kotlin.C10862k;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.collections.C10749e;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC10946b0;
import kotlinx.coroutines.AbstractC11080m0;
import kotlinx.coroutines.AbstractC11138t0;
import kotlinx.coroutines.C10950b2;
import kotlinx.coroutines.C11137t;
import kotlinx.coroutines.C11143u;
import kotlinx.coroutines.C11160z;
import kotlinx.coroutines.C11164z1;
import kotlinx.coroutines.InterfaceC11017h1;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 2 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,315:1\n295#1,5:323\n300#1,12:329\n312#1:385\n299#1:387\n300#1,12:389\n312#1:418\n215#2,7:316\n222#2:344\n241#2,8:345\n223#2:353\n253#2:354\n254#2,2:365\n256#2:369\n225#2:370\n227#2:386\n1#3:328\n1#3:388\n1#3:419\n198#4,3:341\n201#4,14:371\n198#4,17:401\n198#4,17:420\n107#5,10:355\n118#5,2:367\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n*L\n280#1:323,5\n280#1:329,12\n280#1:385\n285#1:387\n285#1:389,12\n285#1:418\n280#1:316,7\n280#1:344\n280#1:345,8\n280#1:353\n280#1:354\n280#1:365,2\n280#1:369\n280#1:370\n280#1:386\n280#1:328\n285#1:388\n280#1:341,3\n280#1:371,14\n285#1:401,17\n311#1:420,17\n280#1:355,10\n280#1:367,2\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.l */
/* loaded from: classes3.dex */
public final class C11048l {
    @NotNull

    /* renamed from: a */
    public static final C11034f0 f21645a = new C11034f0("UNDEFINED");
    @JvmField
    @NotNull

    /* renamed from: b */
    public static final C11034f0 f21646b = new C11034f0("REUSABLE_CLAIMED");

    @InternalCoroutinesApi
    /* renamed from: a */
    public static final <T> void m252a(@NotNull InterfaceC10772d<? super T> interfaceC10772d, @NotNull Object obj, @Nullable InterfaceC10820l<? super Throwable, C10868p> interfaceC10820l) {
        Object c11137t;
        boolean z;
        C10950b2<?> c10950b2;
        if (interfaceC10772d instanceof C11046k) {
            C11046k c11046k = (C11046k) interfaceC10772d;
            Throwable m420a = C10862k.m420a(obj);
            boolean z2 = false;
            if (m420a == null) {
                if (interfaceC10820l != null) {
                    c11137t = new C11143u(obj, interfaceC10820l);
                } else {
                    c11137t = obj;
                }
            } else {
                c11137t = new C11137t(false, m420a);
            }
            InterfaceC10772d<T> interfaceC10772d2 = c11046k.f21642e;
            c11046k.getContext();
            AbstractC10946b0 abstractC10946b0 = c11046k.f21641d;
            if (abstractC10946b0.mo352H()) {
                c11046k.f21643f = c11137t;
                c11046k.f21685c = 1;
                abstractC10946b0.mo100G(c11046k.getContext(), c11046k);
                return;
            }
            AbstractC11138t0 m99a = C11164z1.m99a();
            if (m99a.f21798c >= 4294967296L) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c11046k.f21643f = c11137t;
                c11046k.f21685c = 1;
                C10749e<AbstractC11080m0<?>> c10749e = m99a.f21800e;
                if (c10749e == null) {
                    c10749e = new C10749e<>();
                    m99a.f21800e = c10749e;
                }
                c10749e.addLast(c11046k);
                return;
            }
            m99a.m126J(true);
            try {
                InterfaceC11017h1 interfaceC11017h1 = (InterfaceC11017h1) c11046k.getContext().mo195a(InterfaceC11017h1.C11019b.f21607a);
                if (interfaceC11017h1 != null && !interfaceC11017h1.mo191c()) {
                    CancellationException mo188j = interfaceC11017h1.mo188j();
                    c11046k.mo223a(c11137t, mo188j);
                    c11046k.resumeWith(C10864l.m419a(mo188j));
                    z2 = true;
                }
                if (!z2) {
                    Object obj2 = c11046k.f21644g;
                    InterfaceC10775f context = interfaceC10772d2.getContext();
                    Object m260b = C11040i0.m260b(context, obj2);
                    if (m260b != C11040i0.f21630a) {
                        c10950b2 = C11160z.m101b(interfaceC10772d2, context, m260b);
                    } else {
                        c10950b2 = null;
                    }
                    interfaceC10772d2.resumeWith(obj);
                    C10868p c10868p = C10868p.f21418a;
                    if (c10950b2 == null || c10950b2.m349e0()) {
                        C11040i0.m261a(context, m260b);
                    }
                }
                do {
                } while (m99a.m125L());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        interfaceC10772d.resumeWith(obj);
    }
}
