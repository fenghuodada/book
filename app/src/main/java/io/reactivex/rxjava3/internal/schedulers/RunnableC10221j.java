package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.disposables.InterfaceC10162c;
import io.reactivex.rxjava3.plugins.C10234a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: io.reactivex.rxjava3.internal.schedulers.j */
/* loaded from: classes3.dex */
public final class RunnableC10221j extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, InterfaceC10161b {

    /* renamed from: b */
    public static final Object f20534b = new Object();

    /* renamed from: c */
    public static final Object f20535c = new Object();

    /* renamed from: d */
    public static final Object f20536d = new Object();

    /* renamed from: e */
    public static final Object f20537e = new Object();

    /* renamed from: a */
    public final Runnable f20538a;

    public RunnableC10221j(Runnable runnable, InterfaceC10162c interfaceC10162c) {
        super(3);
        this.f20538a = runnable;
        lazySet(0, interfaceC10162c);
    }

    /* renamed from: a */
    public final void m1199a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f20537e) {
                return;
            }
            if (obj == f20535c) {
                future.cancel(false);
                return;
            } else if (obj == f20536d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
    /* renamed from: b */
    public final void mo49b() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f20537e;
            if (obj6 == obj || obj6 == (obj4 = f20535c) || obj6 == (obj5 = f20536d)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f20534b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((InterfaceC10162c) obj2).mo1208e(this);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        Object obj3 = f20536d;
        Object obj4 = f20535c;
        Object obj5 = f20534b;
        Object obj6 = f20537e;
        lazySet(2, Thread.currentThread());
        try {
            this.f20538a.run();
            lazySet(2, null);
            Object obj7 = get(0);
            if (obj7 != obj5 && compareAndSet(0, obj7, obj6) && obj7 != null) {
                ((InterfaceC10162c) obj7).mo1208e(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == obj4 || obj2 == obj3) {
                    return;
                }
            } while (!compareAndSet(1, obj2, obj6));
        } catch (Throwable th) {
            try {
                C10234a.m1188a(th);
                throw th;
            } catch (Throwable th2) {
                lazySet(2, null);
                Object obj8 = get(0);
                if (obj8 != obj5 && compareAndSet(0, obj8, obj6) && obj8 != null) {
                    ((InterfaceC10162c) obj8).mo1208e(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj4 || obj == obj3) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj6));
                throw th2;
            }
        }
    }
}
