package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.InterfaceC0801e;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.engine.C3564r;
import com.bumptech.glide.load.engine.RunnableC3535j;
import com.bumptech.glide.load.engine.executor.ExecutorServiceC3527a;
import com.bumptech.glide.request.C3829i;
import com.bumptech.glide.request.InterfaceC3828h;
import com.bumptech.glide.util.C3852e;
import com.bumptech.glide.util.C3860j;
import com.bumptech.glide.util.pool.AbstractC3871d;
import com.bumptech.glide.util.pool.C3863a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bumptech.glide.load.engine.o */
/* loaded from: classes.dex */
public final class C3556o<R> implements RunnableC3535j.InterfaceC3536a<R>, C3863a.InterfaceC3867d {

    /* renamed from: z */
    public static final C3559c f9428z = new C3559c();

    /* renamed from: a */
    public final C3561e f9429a;

    /* renamed from: b */
    public final AbstractC3871d.C3872a f9430b;

    /* renamed from: c */
    public final C3564r.InterfaceC3565a f9431c;

    /* renamed from: d */
    public final InterfaceC0801e<C3556o<?>> f9432d;

    /* renamed from: e */
    public final C3559c f9433e;

    /* renamed from: f */
    public final InterfaceC3562p f9434f;

    /* renamed from: g */
    public final ExecutorServiceC3527a f9435g;

    /* renamed from: h */
    public final ExecutorServiceC3527a f9436h;

    /* renamed from: i */
    public final ExecutorServiceC3527a f9437i;

    /* renamed from: j */
    public final ExecutorServiceC3527a f9438j;

    /* renamed from: k */
    public final AtomicInteger f9439k;

    /* renamed from: l */
    public InterfaceC3577g f9440l;

    /* renamed from: m */
    public boolean f9441m;

    /* renamed from: n */
    public boolean f9442n;

    /* renamed from: o */
    public boolean f9443o;

    /* renamed from: p */
    public boolean f9444p;

    /* renamed from: q */
    public InterfaceC3573x<?> f9445q;

    /* renamed from: r */
    public EnumC3444a f9446r;

    /* renamed from: s */
    public boolean f9447s;

    /* renamed from: t */
    public C3566s f9448t;

    /* renamed from: u */
    public boolean f9449u;

    /* renamed from: v */
    public C3564r<?> f9450v;

    /* renamed from: w */
    public RunnableC3535j<R> f9451w;

    /* renamed from: x */
    public volatile boolean f9452x;

    /* renamed from: y */
    public boolean f9453y;

    /* renamed from: com.bumptech.glide.load.engine.o$a */
    /* loaded from: classes.dex */
    public class RunnableC3557a implements Runnable {

        /* renamed from: a */
        public final InterfaceC3828h f9454a;

        public RunnableC3557a(InterfaceC3828h interfaceC3828h) {
            this.f9454a = interfaceC3828h;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C3829i c3829i = (C3829i) this.f9454a;
            c3829i.f9885b.m6390a();
            synchronized (c3829i.f9886c) {
                synchronized (C3556o.this) {
                    C3561e c3561e = C3556o.this.f9429a;
                    InterfaceC3828h interfaceC3828h = this.f9454a;
                    c3561e.getClass();
                    if (c3561e.f9460a.contains(new C3560d(interfaceC3828h, C3852e.f9944b))) {
                        C3556o c3556o = C3556o.this;
                        InterfaceC3828h interfaceC3828h2 = this.f9454a;
                        c3556o.getClass();
                        ((C3829i) interfaceC3828h2).m6446l(c3556o.f9448t, 5);
                    }
                    C3556o.this.m6629d();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.o$b */
    /* loaded from: classes.dex */
    public class RunnableC3558b implements Runnable {

        /* renamed from: a */
        public final InterfaceC3828h f9456a;

        public RunnableC3558b(InterfaceC3828h interfaceC3828h) {
            this.f9456a = interfaceC3828h;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C3829i c3829i = (C3829i) this.f9456a;
            c3829i.f9885b.m6390a();
            synchronized (c3829i.f9886c) {
                synchronized (C3556o.this) {
                    C3561e c3561e = C3556o.this.f9429a;
                    InterfaceC3828h interfaceC3828h = this.f9456a;
                    c3561e.getClass();
                    if (c3561e.f9460a.contains(new C3560d(interfaceC3828h, C3852e.f9944b))) {
                        C3556o.this.f9450v.m6621b();
                        C3556o c3556o = C3556o.this;
                        InterfaceC3828h interfaceC3828h2 = this.f9456a;
                        c3556o.getClass();
                        ((C3829i) interfaceC3828h2).m6445m(c3556o.f9450v, c3556o.f9446r, c3556o.f9453y);
                        C3556o.this.m6623j(this.f9456a);
                    }
                    C3556o.this.m6629d();
                }
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.o$c */
    /* loaded from: classes.dex */
    public static class C3559c {
    }

    /* renamed from: com.bumptech.glide.load.engine.o$d */
    /* loaded from: classes.dex */
    public static final class C3560d {

        /* renamed from: a */
        public final InterfaceC3828h f9458a;

        /* renamed from: b */
        public final Executor f9459b;

        public C3560d(InterfaceC3828h interfaceC3828h, Executor executor) {
            this.f9458a = interfaceC3828h;
            this.f9459b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C3560d) {
                return this.f9458a.equals(((C3560d) obj).f9458a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f9458a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.o$e */
    /* loaded from: classes.dex */
    public static final class C3561e implements Iterable<C3560d> {

        /* renamed from: a */
        public final List<C3560d> f9460a;

        public C3561e(ArrayList arrayList) {
            this.f9460a = arrayList;
        }

        @Override // java.lang.Iterable
        @NonNull
        public final Iterator<C3560d> iterator() {
            return this.f9460a.iterator();
        }
    }

    @VisibleForTesting
    public C3556o() {
        throw null;
    }

    public C3556o(ExecutorServiceC3527a executorServiceC3527a, ExecutorServiceC3527a executorServiceC3527a2, ExecutorServiceC3527a executorServiceC3527a3, ExecutorServiceC3527a executorServiceC3527a4, InterfaceC3562p interfaceC3562p, C3564r.InterfaceC3565a interfaceC3565a, C3863a.C3866c c3866c) {
        C3559c c3559c = f9428z;
        this.f9429a = new C3561e(new ArrayList(2));
        this.f9430b = new AbstractC3871d.C3872a();
        this.f9439k = new AtomicInteger();
        this.f9435g = executorServiceC3527a;
        this.f9436h = executorServiceC3527a2;
        this.f9437i = executorServiceC3527a3;
        this.f9438j = executorServiceC3527a4;
        this.f9434f = interfaceC3562p;
        this.f9431c = interfaceC3565a;
        this.f9432d = c3866c;
        this.f9433e = c3559c;
    }

    /* renamed from: a */
    public final synchronized void m6631a(InterfaceC3828h interfaceC3828h, Executor executor) {
        Runnable runnableC3557a;
        this.f9430b.m6390a();
        C3561e c3561e = this.f9429a;
        c3561e.getClass();
        c3561e.f9460a.add(new C3560d(interfaceC3828h, executor));
        boolean z = true;
        if (this.f9447s) {
            m6628e(1);
            runnableC3557a = new RunnableC3558b(interfaceC3828h);
        } else if (this.f9449u) {
            m6628e(1);
            runnableC3557a = new RunnableC3557a(interfaceC3828h);
        } else {
            if (this.f9452x) {
                z = false;
            }
            C3860j.m6405a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(runnableC3557a);
    }

    @Override // com.bumptech.glide.util.pool.C3863a.InterfaceC3867d
    @NonNull
    /* renamed from: b */
    public final AbstractC3871d.C3872a mo6393b() {
        return this.f9430b;
    }

    /* renamed from: c */
    public final void m6630c() {
        HashMap hashMap;
        if (m6627f()) {
            return;
        }
        this.f9452x = true;
        RunnableC3535j<R> runnableC3535j = this.f9451w;
        runnableC3535j.f9359E = true;
        InterfaceC3532h interfaceC3532h = runnableC3535j.f9357C;
        if (interfaceC3532h != null) {
            interfaceC3532h.cancel();
        }
        InterfaceC3562p interfaceC3562p = this.f9434f;
        InterfaceC3577g interfaceC3577g = this.f9440l;
        C3549n c3549n = (C3549n) interfaceC3562p;
        synchronized (c3549n) {
            C3569u c3569u = c3549n.f9404a;
            c3569u.getClass();
            if (this.f9444p) {
                hashMap = c3569u.f9486b;
            } else {
                hashMap = c3569u.f9485a;
            }
            if (equals(hashMap.get(interfaceC3577g))) {
                hashMap.remove(interfaceC3577g);
            }
        }
    }

    /* renamed from: d */
    public final void m6629d() {
        C3564r<?> c3564r;
        synchronized (this) {
            this.f9430b.m6390a();
            C3860j.m6405a(m6627f(), "Not yet complete!");
            int decrementAndGet = this.f9439k.decrementAndGet();
            C3860j.m6405a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                c3564r = this.f9450v;
                m6624i();
            } else {
                c3564r = null;
            }
        }
        if (c3564r != null) {
            c3564r.m6620d();
        }
    }

    /* renamed from: e */
    public final synchronized void m6628e(int i) {
        C3564r<?> c3564r;
        C3860j.m6405a(m6627f(), "Not yet complete!");
        if (this.f9439k.getAndAdd(i) == 0 && (c3564r = this.f9450v) != null) {
            c3564r.m6621b();
        }
    }

    /* renamed from: f */
    public final boolean m6627f() {
        return this.f9449u || this.f9447s || this.f9452x;
    }

    /* renamed from: g */
    public final void m6626g() {
        synchronized (this) {
            this.f9430b.m6390a();
            if (this.f9452x) {
                m6624i();
            } else if (!this.f9429a.f9460a.isEmpty()) {
                if (!this.f9449u) {
                    this.f9449u = true;
                    InterfaceC3577g interfaceC3577g = this.f9440l;
                    C3561e c3561e = this.f9429a;
                    c3561e.getClass();
                    ArrayList<C3560d> arrayList = new ArrayList(c3561e.f9460a);
                    m6628e(arrayList.size() + 1);
                    ((C3549n) this.f9434f).m6635f(this, interfaceC3577g, null);
                    for (C3560d c3560d : arrayList) {
                        c3560d.f9459b.execute(new RunnableC3557a(c3560d.f9458a));
                    }
                    m6629d();
                    return;
                }
                throw new IllegalStateException("Already failed once");
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
    }

    /* renamed from: h */
    public final void m6625h() {
        synchronized (this) {
            this.f9430b.m6390a();
            if (this.f9452x) {
                this.f9445q.mo6510a();
                m6624i();
            } else if (!this.f9429a.f9460a.isEmpty()) {
                if (!this.f9447s) {
                    C3559c c3559c = this.f9433e;
                    InterfaceC3573x<?> interfaceC3573x = this.f9445q;
                    boolean z = this.f9441m;
                    InterfaceC3577g interfaceC3577g = this.f9440l;
                    C3564r.InterfaceC3565a interfaceC3565a = this.f9431c;
                    c3559c.getClass();
                    this.f9450v = new C3564r<>(interfaceC3573x, z, true, interfaceC3577g, interfaceC3565a);
                    this.f9447s = true;
                    C3561e c3561e = this.f9429a;
                    c3561e.getClass();
                    ArrayList<C3560d> arrayList = new ArrayList(c3561e.f9460a);
                    m6628e(arrayList.size() + 1);
                    ((C3549n) this.f9434f).m6635f(this, this.f9440l, this.f9450v);
                    for (C3560d c3560d : arrayList) {
                        c3560d.f9459b.execute(new RunnableC3558b(c3560d.f9458a));
                    }
                    m6629d();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            } else {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
        }
    }

    /* renamed from: i */
    public final synchronized void m6624i() {
        if (this.f9440l != null) {
            this.f9429a.f9460a.clear();
            this.f9440l = null;
            this.f9450v = null;
            this.f9445q = null;
            this.f9449u = false;
            this.f9452x = false;
            this.f9447s = false;
            this.f9453y = false;
            this.f9451w.m6652o();
            this.f9451w = null;
            this.f9448t = null;
            this.f9446r = null;
            this.f9432d.mo6395a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: j */
    public final synchronized void m6623j(InterfaceC3828h interfaceC3828h) {
        boolean z;
        this.f9430b.m6390a();
        C3561e c3561e = this.f9429a;
        c3561e.f9460a.remove(new C3560d(interfaceC3828h, C3852e.f9944b));
        if (this.f9429a.f9460a.isEmpty()) {
            m6630c();
            if (!this.f9447s && !this.f9449u) {
                z = false;
                if (z && this.f9439k.get() == 0) {
                    m6624i();
                }
            }
            z = true;
            if (z) {
                m6624i();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
        r0 = r3.f9435g;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m6622k(com.bumptech.glide.load.engine.RunnableC3535j<R> r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.f9451w = r4     // Catch: java.lang.Throwable -> L2a
            r0 = 1
            int r1 = r4.m6657j(r0)     // Catch: java.lang.Throwable -> L2a
            r2 = 2
            if (r1 == r2) goto L10
            r2 = 3
            if (r1 != r2) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L15
            com.bumptech.glide.load.engine.executor.a r0 = r3.f9435g     // Catch: java.lang.Throwable -> L2a
            goto L25
        L15:
            boolean r0 = r3.f9442n     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L1c
            com.bumptech.glide.load.engine.executor.a r0 = r3.f9437i     // Catch: java.lang.Throwable -> L2a
            goto L25
        L1c:
            boolean r0 = r3.f9443o     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L23
            com.bumptech.glide.load.engine.executor.a r0 = r3.f9438j     // Catch: java.lang.Throwable -> L2a
            goto L25
        L23:
            com.bumptech.glide.load.engine.executor.a r0 = r3.f9436h     // Catch: java.lang.Throwable -> L2a
        L25:
            r0.execute(r4)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)
            return
        L2a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C3556o.m6622k(com.bumptech.glide.load.engine.j):void");
    }
}
