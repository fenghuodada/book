package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalCoroutinesApi
@SourceDebugExtension({"SMAP\nAtomic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Atomic.kt\nkotlinx/coroutines/internal/AtomicOp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.b */
/* loaded from: classes3.dex */
public abstract class AbstractC11025b<T> extends AbstractC11067y {
    @NotNull

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f21617a = AtomicReferenceFieldUpdater.newUpdater(AbstractC11025b.class, Object.class, "_consensus");
    @Volatile
    @Nullable
    private volatile Object _consensus = C11023a.f21616a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.AbstractC11067y
    @Nullable
    /* renamed from: a */
    public final Object mo228a(@Nullable Object obj) {
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21617a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        C11034f0 c11034f0 = C11023a.f21616a;
        if (obj2 == c11034f0) {
            C11034f0 mo173c = mo173c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == c11034f0) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c11034f0, mo173c)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != c11034f0) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    obj2 = mo173c;
                } else {
                    obj2 = atomicReferenceFieldUpdater.get(this);
                }
            }
        }
        mo242b(obj, obj2);
        return obj2;
    }

    /* renamed from: b */
    public abstract void mo242b(T t, @Nullable Object obj);

    @Nullable
    /* renamed from: c */
    public abstract C11034f0 mo173c(Object obj);
}
