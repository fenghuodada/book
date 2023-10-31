package io.reactivex.rxjava3.internal.queue;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.internal.fuseable.InterfaceC10185b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: io.reactivex.rxjava3.internal.queue.a */
/* loaded from: classes3.dex */
public final class C10204a<T> implements InterfaceC10185b {

    /* renamed from: i */
    public static final int f20476i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    public static final Object f20477j = new Object();

    /* renamed from: a */
    public final AtomicLong f20478a;

    /* renamed from: b */
    public int f20479b;

    /* renamed from: c */
    public long f20480c;

    /* renamed from: d */
    public final int f20481d;

    /* renamed from: e */
    public AtomicReferenceArray<Object> f20482e;

    /* renamed from: f */
    public final int f20483f;

    /* renamed from: g */
    public AtomicReferenceArray<Object> f20484g;

    /* renamed from: h */
    public final AtomicLong f20485h;

    public C10204a(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.f20478a = atomicLong;
        this.f20485h = new AtomicLong();
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = numberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(numberOfLeadingZeros + 1);
        this.f20482e = atomicReferenceArray;
        this.f20481d = i2;
        this.f20479b = Math.min(numberOfLeadingZeros / 4, f20476i);
        this.f20484g = atomicReferenceArray;
        this.f20483f = i2;
        this.f20480c = i2 - 1;
        atomicLong.lazySet(0L);
    }

    /* renamed from: a */
    public final void m1204a(AtomicReferenceArray atomicReferenceArray, Object obj, long j, int i) {
        atomicReferenceArray.lazySet(i, obj);
        this.f20478a.lazySet(j + 1);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.InterfaceC10185b
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.InterfaceC10185b
    public final boolean isEmpty() {
        if (this.f20478a.get() == this.f20485h.get()) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.InterfaceC10185b
    public final boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f20482e;
            AtomicLong atomicLong = this.f20478a;
            long j = atomicLong.get();
            int i = this.f20481d;
            int i2 = i & ((int) j);
            if (j >= this.f20480c) {
                long j2 = this.f20479b + j;
                if (atomicReferenceArray.get(((int) j2) & i) == null) {
                    this.f20480c = j2 - 1;
                } else {
                    long j3 = j + 1;
                    if (atomicReferenceArray.get(((int) j3) & i) != null) {
                        long j4 = i;
                        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
                        this.f20482e = atomicReferenceArray2;
                        this.f20480c = (j4 + j) - 1;
                        atomicReferenceArray2.lazySet(i2, t);
                        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
                        atomicReferenceArray.lazySet(i2, f20477j);
                        atomicLong.lazySet(j3);
                        return true;
                    }
                }
            }
            m1204a(atomicReferenceArray, t, j, i2);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.InterfaceC10185b
    @Nullable
    public final T poll() {
        boolean z;
        AtomicReferenceArray<Object> atomicReferenceArray = this.f20484g;
        AtomicLong atomicLong = this.f20485h;
        long j = atomicLong.get();
        int i = this.f20483f;
        int i2 = ((int) j) & i;
        T t = (T) atomicReferenceArray.get(i2);
        if (t == f20477j) {
            z = true;
        } else {
            z = false;
        }
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            int i3 = i + 1;
            AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
            atomicReferenceArray.lazySet(i3, null);
            this.f20484g = atomicReferenceArray2;
            T t2 = (T) atomicReferenceArray2.get(i2);
            if (t2 != null) {
                atomicReferenceArray2.lazySet(i2, null);
                atomicLong.lazySet(j + 1);
            }
            return t2;
        }
    }
}
