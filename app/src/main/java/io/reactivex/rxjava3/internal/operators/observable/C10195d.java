package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.AbstractC10151d;
import io.reactivex.rxjava3.core.AbstractC10154g;
import io.reactivex.rxjava3.core.InterfaceC10152e;
import io.reactivex.rxjava3.core.InterfaceC10153f;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.exceptions.C10169b;
import io.reactivex.rxjava3.internal.fuseable.InterfaceC10185b;
import io.reactivex.rxjava3.internal.observers.AbstractC10186a;
import io.reactivex.rxjava3.internal.schedulers.C10226m;
import io.reactivex.rxjava3.plugins.C10234a;

/* renamed from: io.reactivex.rxjava3.internal.operators.observable.d */
/* loaded from: classes3.dex */
public final class C10195d<T> extends AbstractC10191a<T, T> {

    /* renamed from: b */
    public final AbstractC10154g f20452b;

    /* renamed from: c */
    public final boolean f20453c;

    /* renamed from: d */
    public final int f20454d;

    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.d$a */
    /* loaded from: classes3.dex */
    public static final class RunnableC10196a<T> extends AbstractC10186a<T> implements InterfaceC10153f<T>, Runnable {

        /* renamed from: a */
        public final InterfaceC10153f<? super T> f20455a;

        /* renamed from: b */
        public final AbstractC10154g.AbstractC10157c f20456b;

        /* renamed from: c */
        public final boolean f20457c;

        /* renamed from: d */
        public final int f20458d;

        /* renamed from: e */
        public InterfaceC10185b<T> f20459e;

        /* renamed from: f */
        public InterfaceC10161b f20460f;

        /* renamed from: g */
        public Throwable f20461g;

        /* renamed from: h */
        public volatile boolean f20462h;

        /* renamed from: i */
        public volatile boolean f20463i;

        /* renamed from: j */
        public int f20464j;

        /* renamed from: k */
        public boolean f20465k;

        public RunnableC10196a(InterfaceC10153f<? super T> interfaceC10153f, AbstractC10154g.AbstractC10157c abstractC10157c, boolean z, int i) {
            this.f20455a = interfaceC10153f;
            this.f20456b = abstractC10157c;
            this.f20457c = z;
            this.f20458d = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo47a(io.reactivex.rxjava3.disposables.InterfaceC10161b r4) {
            /*
                r3 = this;
                io.reactivex.rxjava3.disposables.b r0 = r3.f20460f
                r1 = 1
                if (r4 != 0) goto L10
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r2 = "next is null"
                r0.<init>(r2)
                io.reactivex.rxjava3.plugins.C10234a.m1188a(r0)
                goto L1d
            L10:
                if (r0 == 0) goto L1f
                r4.mo49b()
                io.reactivex.rxjava3.exceptions.d r0 = new io.reactivex.rxjava3.exceptions.d
                r0.<init>()
                io.reactivex.rxjava3.plugins.C10234a.m1188a(r0)
            L1d:
                r0 = 0
                goto L20
            L1f:
                r0 = r1
            L20:
                if (r0 == 0) goto L62
                r3.f20460f = r4
                boolean r0 = r4 instanceof io.reactivex.rxjava3.internal.fuseable.InterfaceC10184a
                if (r0 == 0) goto L54
                io.reactivex.rxjava3.internal.fuseable.a r4 = (io.reactivex.rxjava3.internal.fuseable.InterfaceC10184a) r4
                int r0 = r4.mo1206d()
                if (r0 != r1) goto L47
                r3.f20464j = r0
                r3.f20459e = r4
                r3.f20462h = r1
                io.reactivex.rxjava3.core.f<? super T> r4 = r3.f20455a
                r4.mo47a(r3)
                int r4 = r3.getAndIncrement()
                if (r4 != 0) goto L46
                io.reactivex.rxjava3.core.g$c r4 = r3.f20456b
                r4.mo1193e(r3)
            L46:
                return
            L47:
                r1 = 2
                if (r0 != r1) goto L54
                r3.f20464j = r0
                r3.f20459e = r4
                io.reactivex.rxjava3.core.f<? super T> r4 = r3.f20455a
                r4.mo47a(r3)
                return
            L54:
                io.reactivex.rxjava3.internal.queue.a r4 = new io.reactivex.rxjava3.internal.queue.a
                int r0 = r3.f20458d
                r4.<init>(r0)
                r3.f20459e = r4
                io.reactivex.rxjava3.core.f<? super T> r4 = r3.f20455a
                r4.mo47a(r3)
            L62:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.observable.C10195d.RunnableC10196a.mo47a(io.reactivex.rxjava3.disposables.b):void");
        }

        @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
        /* renamed from: b */
        public final void mo49b() {
            if (this.f20463i) {
                return;
            }
            this.f20463i = true;
            this.f20460f.mo49b();
            this.f20456b.mo49b();
            if (this.f20465k || getAndIncrement() != 0) {
                return;
            }
            this.f20459e.clear();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        /* renamed from: c */
        public final void mo46c(T t) {
            if (this.f20462h) {
                return;
            }
            if (this.f20464j != 2) {
                this.f20459e.offer(t);
            }
            if (getAndIncrement() == 0) {
                this.f20456b.mo1193e(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.InterfaceC10185b
        public final void clear() {
            this.f20459e.clear();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.InterfaceC10184a
        /* renamed from: d */
        public final int mo1206d() {
            this.f20465k = true;
            return 2;
        }

        /* renamed from: e */
        public final boolean m1205e(boolean z, boolean z2, InterfaceC10153f<? super T> interfaceC10153f) {
            if (this.f20463i) {
                this.f20459e.clear();
                return true;
            } else if (z) {
                Throwable th = this.f20461g;
                if (this.f20457c) {
                    if (z2) {
                        this.f20463i = true;
                        if (th != null) {
                            interfaceC10153f.onError(th);
                        } else {
                            interfaceC10153f.onComplete();
                        }
                        this.f20456b.mo49b();
                        return true;
                    }
                    return false;
                } else if (th != null) {
                    this.f20463i = true;
                    this.f20459e.clear();
                    interfaceC10153f.onError(th);
                    this.f20456b.mo49b();
                    return true;
                } else if (z2) {
                    this.f20463i = true;
                    interfaceC10153f.onComplete();
                    this.f20456b.mo49b();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.InterfaceC10185b
        public final boolean isEmpty() {
            return this.f20459e.isEmpty();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        public final void onComplete() {
            if (this.f20462h) {
                return;
            }
            this.f20462h = true;
            if (getAndIncrement() == 0) {
                this.f20456b.mo1193e(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        public final void onError(Throwable th) {
            if (this.f20462h) {
                C10234a.m1188a(th);
                return;
            }
            this.f20461g = th;
            this.f20462h = true;
            if (getAndIncrement() == 0) {
                this.f20456b.mo1193e(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.InterfaceC10185b
        @Nullable
        public final T poll() throws Throwable {
            return this.f20459e.poll();
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            if (this.f20465k) {
                int i = 1;
                while (!this.f20463i) {
                    boolean z2 = this.f20462h;
                    Throwable th = this.f20461g;
                    if (!this.f20457c && z2 && th != null) {
                        this.f20463i = true;
                        this.f20455a.onError(this.f20461g);
                    } else {
                        this.f20455a.mo46c(null);
                        if (z2) {
                            this.f20463i = true;
                            Throwable th2 = this.f20461g;
                            if (th2 != null) {
                                this.f20455a.onError(th2);
                            } else {
                                this.f20455a.onComplete();
                            }
                        } else {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    }
                    this.f20456b.mo49b();
                    return;
                }
                return;
            }
            InterfaceC10185b<T> interfaceC10185b = this.f20459e;
            InterfaceC10153f<? super T> interfaceC10153f = this.f20455a;
            int i2 = 1;
            while (!m1205e(this.f20462h, interfaceC10185b.isEmpty(), interfaceC10153f)) {
                while (true) {
                    boolean z3 = this.f20462h;
                    try {
                        Object obj = (T) interfaceC10185b.poll();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!m1205e(z3, z, interfaceC10153f)) {
                            if (z) {
                                i2 = addAndGet(-i2);
                                if (i2 == 0) {
                                    return;
                                }
                            } else {
                                interfaceC10153f.mo46c(obj);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th3) {
                        C10169b.m1213a(th3);
                        this.f20463i = true;
                        this.f20460f.mo49b();
                        interfaceC10185b.clear();
                        interfaceC10153f.onError(th3);
                        this.f20456b.mo49b();
                        return;
                    }
                }
            }
        }
    }

    public C10195d(InterfaceC10152e interfaceC10152e, AbstractC10154g abstractC10154g, int i) {
        super(interfaceC10152e);
        this.f20452b = abstractC10154g;
        this.f20453c = false;
        this.f20454d = i;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10151d
    /* renamed from: e */
    public final void mo48e(InterfaceC10153f<? super T> interfaceC10153f) {
        AbstractC10154g abstractC10154g = this.f20452b;
        boolean z = abstractC10154g instanceof C10226m;
        InterfaceC10152e<T> interfaceC10152e = this.f20445a;
        if (z) {
            ((AbstractC10151d) interfaceC10152e).m1221d(interfaceC10153f);
            return;
        }
        ((AbstractC10151d) interfaceC10152e).m1221d(new RunnableC10196a(interfaceC10153f, abstractC10154g.mo1197a(), this.f20453c, this.f20454d));
    }
}
