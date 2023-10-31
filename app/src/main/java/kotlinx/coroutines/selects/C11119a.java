package kotlinx.coroutines.selects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10868p;
import kotlin.PublishedApi;
import kotlin.collections.C10752h;
import kotlin.collections.C10757m;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC10980f;
import kotlinx.coroutines.InterfaceC10974d2;
import kotlinx.coroutines.InterfaceC11015h;
import kotlinx.coroutines.internal.AbstractC11028c0;
import kotlinx.coroutines.internal.C11034f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@PublishedApi
@SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,873:1\n1#2:874\n2624#3,3:875\n1855#3,2:888\n1855#3,2:896\n1855#3,2:898\n314#4,9:878\n323#4,2:890\n19#5:887\n153#6,4:892\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n505#1:875,3\n569#1:888,2\n726#1:896,2\n751#1:898,2\n545#1:878,9\n545#1:890,2\n561#1:887\n711#1:892,4\n*E\n"})
/* renamed from: kotlinx.coroutines.selects.a */
/* loaded from: classes3.dex */
public final class C11119a<R> extends AbstractC10980f implements InterfaceC11121b, InterfaceC10974d2 {
    @NotNull

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f21762a = AtomicReferenceFieldUpdater.newUpdater(C11119a.class, Object.class, "state");
    @Volatile
    @Nullable
    private volatile Object state;

    @SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,873:1\n1#2:874\n*E\n"})
    /* renamed from: kotlinx.coroutines.selects.a$a */
    /* loaded from: classes3.dex */
    public final class C11120a {
    }

    @Override // kotlinx.coroutines.InterfaceC10974d2
    /* renamed from: b */
    public final void mo137b(@NotNull AbstractC11028c0<?> abstractC11028c0, int i) {
    }

    @Override // kotlinx.coroutines.selects.InterfaceC11121b
    /* renamed from: c */
    public final boolean mo141c(@NotNull Object obj, @Nullable Object obj2) {
        return m142e(obj) == 0;
    }

    @Override // kotlinx.coroutines.AbstractC11012g
    /* renamed from: d */
    public final void mo143d(@Nullable Throwable th) {
        boolean z;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21762a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != C11122c.f21764b) {
                C11034f0 c11034f0 = C11122c.f21765c;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c11034f0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z = false;
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z);
    }

    /* renamed from: e */
    public final int m142e(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21762a;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC11015h)) {
                if (C10843j.m435a(obj2, C11122c.f21764b) ? true : obj2 instanceof C11120a) {
                    return 3;
                }
                if (C10843j.m435a(obj2, C11122c.f21765c)) {
                    return 2;
                }
                boolean z = false;
                if (C10843j.m435a(obj2, C11122c.f21763a)) {
                    List m486c = C10752h.m486c(obj);
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, m486c)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        return 1;
                    }
                } else if (!(obj2 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj2).toString());
                } else {
                    ArrayList m473p = C10757m.m473p(obj, (Collection) obj2);
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, m473p)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        return 1;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.InterfaceC11121b
    @NotNull
    public final InterfaceC10775f getContext() {
        return null;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final /* bridge */ /* synthetic */ C10868p invoke(Throwable th) {
        mo143d(th);
        return C10868p.f21418a;
    }
}
