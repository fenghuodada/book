package io.reactivex.rxjava3.internal.schedulers;

import androidx.concurrent.futures.C0484a;
import io.reactivex.rxjava3.annotations.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.reactivex.rxjava3.internal.schedulers.g */
/* loaded from: classes3.dex */
public final class ThreadFactoryC10217g extends AtomicLong implements ThreadFactory {

    /* renamed from: a */
    public final String f20531a;

    /* renamed from: b */
    public final int f20532b;

    /* renamed from: c */
    public final boolean f20533c;

    /* renamed from: io.reactivex.rxjava3.internal.schedulers.g$a */
    /* loaded from: classes3.dex */
    public static final class C10218a extends Thread {
        public C10218a(String str, Runnable runnable) {
            super(runnable, str);
        }
    }

    public ThreadFactoryC10217g(String str) {
        this(str, 5, false);
    }

    public ThreadFactoryC10217g(String str, int i, boolean z) {
        this.f20531a = str;
        this.f20532b = i;
        this.f20533c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        String str = this.f20531a + '-' + incrementAndGet();
        Thread c10218a = this.f20533c ? new C10218a(str, runnable) : new Thread(runnable, str);
        c10218a.setPriority(this.f20532b);
        c10218a.setDaemon(true);
        return c10218a;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return C0484a.m12392a(new StringBuilder("RxThreadFactory["), this.f20531a, "]");
    }
}
