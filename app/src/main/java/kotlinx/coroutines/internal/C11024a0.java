package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.scheduling.ExecutorC11104a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.internal.a0 */
/* loaded from: classes3.dex */
public final class C11024a0<T> {
    @NotNull
    private volatile AtomicReferenceArray<T> array;

    public C11024a0(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    /* renamed from: a */
    public final int m279a() {
        return this.array.length();
    }

    @Nullable
    /* renamed from: b */
    public final T m278b(int i) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* renamed from: c */
    public final void m277c(int i, @Nullable ExecutorC11104a.C11105a c11105a) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, c11105a);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, c11105a);
        this.array = atomicReferenceArray2;
    }
}
