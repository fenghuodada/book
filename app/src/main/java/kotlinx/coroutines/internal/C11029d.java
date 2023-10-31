package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,269:1\n46#1,8:284\n107#2,7:270\n107#2,7:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n74#1:284,8\n27#1:270,7\n85#1:277,7\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.d */
/* loaded from: classes3.dex */
public final class C11029d {
    @NotNull

    /* renamed from: a */
    public static final C11034f0 f21622a = new C11034f0("CLOSED");

    @NotNull
    /* renamed from: a */
    public static final <S extends AbstractC11028c0<S>> Object m273a(@NotNull S s, long j, @NotNull InterfaceC10824p<? super Long, ? super S, ? extends S> interfaceC10824p) {
        boolean z;
        while (true) {
            if (s.f21621c >= j && !s.mo268c()) {
                return s;
            }
            Object obj = AbstractC11031e.f21623a.get(s);
            C11034f0 c11034f0 = f21622a;
            if (obj == c11034f0) {
                return c11034f0;
            }
            S s2 = (S) ((AbstractC11031e) obj);
            if (s2 == null) {
                s2 = interfaceC10824p.invoke(Long.valueOf(s.f21621c + 1), s);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC11031e.f21623a;
                    if (atomicReferenceFieldUpdater.compareAndSet(s, null, s2)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(s) != null) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    if (s.mo268c()) {
                        s.m267d();
                    }
                }
            }
            s = s2;
        }
    }
}
