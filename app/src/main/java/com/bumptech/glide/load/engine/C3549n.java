package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.C0510h;
import com.ambrose.overwall.fragment.C2488w;
import com.bumptech.glide.C3424g;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.engine.C3502c;
import com.bumptech.glide.load.engine.C3564r;
import com.bumptech.glide.load.engine.RunnableC3535j;
import com.bumptech.glide.load.engine.cache.C3507b;
import com.bumptech.glide.load.engine.cache.C3511d;
import com.bumptech.glide.load.engine.cache.C3513e;
import com.bumptech.glide.load.engine.cache.C3514f;
import com.bumptech.glide.load.engine.cache.C3516h;
import com.bumptech.glide.load.engine.cache.InterfaceC3505a;
import com.bumptech.glide.load.engine.cache.InterfaceC3517i;
import com.bumptech.glide.load.engine.executor.ExecutorServiceC3527a;
import com.bumptech.glide.request.C3829i;
import com.bumptech.glide.request.InterfaceC3828h;
import com.bumptech.glide.util.C3849b;
import com.bumptech.glide.util.C3855f;
import com.bumptech.glide.util.C3856g;
import com.bumptech.glide.util.C3860j;
import com.bumptech.glide.util.pool.C3863a;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.load.engine.n */
/* loaded from: classes.dex */
public final class C3549n implements InterfaceC3562p, InterfaceC3517i.InterfaceC3518a, C3564r.InterfaceC3565a {

    /* renamed from: h */
    public static final boolean f9403h = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C3569u f9404a;

    /* renamed from: b */
    public final C2488w f9405b;

    /* renamed from: c */
    public final InterfaceC3517i f9406c;

    /* renamed from: d */
    public final C3552b f9407d;

    /* renamed from: e */
    public final C3478a0 f9408e;

    /* renamed from: f */
    public final C3550a f9409f;

    /* renamed from: g */
    public final C3502c f9410g;

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.n$a */
    /* loaded from: classes.dex */
    public static class C3550a {

        /* renamed from: a */
        public final RunnableC3535j.InterfaceC3539d f9411a;

        /* renamed from: b */
        public final C3863a.C3866c f9412b = C3863a.m6396a(150, new C3551a());

        /* renamed from: c */
        public int f9413c;

        /* renamed from: com.bumptech.glide.load.engine.n$a$a */
        /* loaded from: classes.dex */
        public class C3551a implements C3863a.InterfaceC3865b<RunnableC3535j<?>> {
            public C3551a() {
            }

            @Override // com.bumptech.glide.util.pool.C3863a.InterfaceC3865b
            /* renamed from: a */
            public final RunnableC3535j<?> mo6392a() {
                C3550a c3550a = C3550a.this;
                return new RunnableC3535j<>(c3550a.f9411a, c3550a.f9412b);
            }
        }

        public C3550a(C3554c c3554c) {
            this.f9411a = c3554c;
        }
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.n$b */
    /* loaded from: classes.dex */
    public static class C3552b {

        /* renamed from: a */
        public final ExecutorServiceC3527a f9415a;

        /* renamed from: b */
        public final ExecutorServiceC3527a f9416b;

        /* renamed from: c */
        public final ExecutorServiceC3527a f9417c;

        /* renamed from: d */
        public final ExecutorServiceC3527a f9418d;

        /* renamed from: e */
        public final InterfaceC3562p f9419e;

        /* renamed from: f */
        public final C3564r.InterfaceC3565a f9420f;

        /* renamed from: g */
        public final C3863a.C3866c f9421g = C3863a.m6396a(150, new C3553a());

        /* renamed from: com.bumptech.glide.load.engine.n$b$a */
        /* loaded from: classes.dex */
        public class C3553a implements C3863a.InterfaceC3865b<C3556o<?>> {
            public C3553a() {
            }

            @Override // com.bumptech.glide.util.pool.C3863a.InterfaceC3865b
            /* renamed from: a */
            public final C3556o<?> mo6392a() {
                C3552b c3552b = C3552b.this;
                return new C3556o<>(c3552b.f9415a, c3552b.f9416b, c3552b.f9417c, c3552b.f9418d, c3552b.f9419e, c3552b.f9420f, c3552b.f9421g);
            }
        }

        public C3552b(ExecutorServiceC3527a executorServiceC3527a, ExecutorServiceC3527a executorServiceC3527a2, ExecutorServiceC3527a executorServiceC3527a3, ExecutorServiceC3527a executorServiceC3527a4, InterfaceC3562p interfaceC3562p, C3564r.InterfaceC3565a interfaceC3565a) {
            this.f9415a = executorServiceC3527a;
            this.f9416b = executorServiceC3527a2;
            this.f9417c = executorServiceC3527a3;
            this.f9418d = executorServiceC3527a4;
            this.f9419e = interfaceC3562p;
            this.f9420f = interfaceC3565a;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.n$c */
    /* loaded from: classes.dex */
    public static class C3554c implements RunnableC3535j.InterfaceC3539d {

        /* renamed from: a */
        public final InterfaceC3505a.InterfaceC3506a f9423a;

        /* renamed from: b */
        public volatile InterfaceC3505a f9424b;

        public C3554c(InterfaceC3505a.InterfaceC3506a interfaceC3506a) {
            this.f9423a = interfaceC3506a;
        }

        /* renamed from: a */
        public final InterfaceC3505a m6632a() {
            if (this.f9424b == null) {
                synchronized (this) {
                    if (this.f9424b == null) {
                        C3511d c3511d = (C3511d) this.f9423a;
                        C3514f c3514f = (C3514f) c3511d.f9294b;
                        File cacheDir = c3514f.f9300a.getCacheDir();
                        C3513e c3513e = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else {
                            String str = c3514f.f9301b;
                            if (str != null) {
                                cacheDir = new File(cacheDir, str);
                            }
                        }
                        if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                            c3513e = new C3513e(cacheDir, c3511d.f9293a);
                        }
                        this.f9424b = c3513e;
                    }
                    if (this.f9424b == null) {
                        this.f9424b = new C3507b();
                    }
                }
            }
            return this.f9424b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.n$d */
    /* loaded from: classes.dex */
    public class C3555d {

        /* renamed from: a */
        public final C3556o<?> f9425a;

        /* renamed from: b */
        public final InterfaceC3828h f9426b;

        public C3555d(InterfaceC3828h interfaceC3828h, C3556o<?> c3556o) {
            this.f9426b = interfaceC3828h;
            this.f9425a = c3556o;
        }
    }

    public C3549n(InterfaceC3517i interfaceC3517i, InterfaceC3505a.InterfaceC3506a interfaceC3506a, ExecutorServiceC3527a executorServiceC3527a, ExecutorServiceC3527a executorServiceC3527a2, ExecutorServiceC3527a executorServiceC3527a3, ExecutorServiceC3527a executorServiceC3527a4) {
        this.f9406c = interfaceC3517i;
        C3554c c3554c = new C3554c(interfaceC3506a);
        C3502c c3502c = new C3502c();
        this.f9410g = c3502c;
        synchronized (this) {
            synchronized (c3502c) {
                c3502c.f9277e = this;
            }
        }
        this.f9405b = new C2488w();
        this.f9404a = new C3569u();
        this.f9407d = new C3552b(executorServiceC3527a, executorServiceC3527a2, executorServiceC3527a3, executorServiceC3527a4, this, this);
        this.f9409f = new C3550a(c3554c);
        this.f9408e = new C3478a0();
        ((C3516h) interfaceC3517i).f9302d = this;
    }

    /* renamed from: e */
    public static void m6636e(String str, long j, InterfaceC3577g interfaceC3577g) {
        StringBuilder m12339b = C0510h.m12339b(str, " in ");
        m12339b.append(C3855f.m6413a(j));
        m12339b.append("ms, key: ");
        m12339b.append(interfaceC3577g);
        Log.v("Engine", m12339b.toString());
    }

    /* renamed from: g */
    public static void m6634g(InterfaceC3573x interfaceC3573x) {
        if (!(interfaceC3573x instanceof C3564r)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C3564r) interfaceC3573x).m6620d();
    }

    @Override // com.bumptech.glide.load.engine.C3564r.InterfaceC3565a
    /* renamed from: a */
    public final void mo6619a(InterfaceC3577g interfaceC3577g, C3564r<?> c3564r) {
        C3502c c3502c = this.f9410g;
        synchronized (c3502c) {
            C3502c.C3503a c3503a = (C3502c.C3503a) c3502c.f9275c.remove(interfaceC3577g);
            if (c3503a != null) {
                c3503a.f9280c = null;
                c3503a.clear();
            }
        }
        if (c3564r.f9470a) {
            ((C3516h) this.f9406c).m6409d(interfaceC3577g, c3564r);
        } else {
            this.f9408e.m6713a(c3564r, false);
        }
    }

    /* renamed from: b */
    public final C3555d m6639b(C3424g c3424g, Object obj, InterfaceC3577g interfaceC3577g, int i, int i2, Class cls, Class cls2, EnumC3432i enumC3432i, AbstractC3543m abstractC3543m, C3849b c3849b, boolean z, boolean z2, C3581i c3581i, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC3828h interfaceC3828h, Executor executor) {
        long j;
        if (f9403h) {
            int i3 = C3855f.f9946b;
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        long j2 = j;
        this.f9405b.getClass();
        C3563q c3563q = new C3563q(obj, interfaceC3577g, i, i2, c3849b, cls, cls2, c3581i);
        synchronized (this) {
            try {
                C3564r<?> m6637d = m6637d(c3563q, z3, j2);
                if (m6637d == null) {
                    return m6633h(c3424g, obj, interfaceC3577g, i, i2, cls, cls2, enumC3432i, abstractC3543m, c3849b, z, z2, c3581i, z3, z4, z5, z6, interfaceC3828h, executor, c3563q, j2);
                }
                ((C3829i) interfaceC3828h).m6445m(m6637d, EnumC3444a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final C3564r<?> m6638c(InterfaceC3577g interfaceC3577g) {
        C3564r<?> c3564r;
        InterfaceC3573x interfaceC3573x;
        C3516h c3516h = (C3516h) this.f9406c;
        synchronized (c3516h) {
            C3856g.C3857a c3857a = (C3856g.C3857a) c3516h.f9947a.remove(interfaceC3577g);
            c3564r = null;
            if (c3857a == null) {
                interfaceC3573x = null;
            } else {
                c3516h.f9949c -= c3857a.f9951b;
                interfaceC3573x = c3857a.f9950a;
            }
        }
        InterfaceC3573x interfaceC3573x2 = interfaceC3573x;
        if (interfaceC3573x2 != null) {
            if (interfaceC3573x2 instanceof C3564r) {
                c3564r = (C3564r) interfaceC3573x2;
            } else {
                c3564r = new C3564r<>(interfaceC3573x2, true, true, interfaceC3577g, this);
            }
        }
        if (c3564r != null) {
            c3564r.m6621b();
            this.f9410g.m6680a(interfaceC3577g, c3564r);
        }
        return c3564r;
    }

    @Nullable
    /* renamed from: d */
    public final C3564r<?> m6637d(C3563q c3563q, boolean z, long j) {
        C3564r<?> c3564r;
        if (!z) {
            return null;
        }
        C3502c c3502c = this.f9410g;
        synchronized (c3502c) {
            C3502c.C3503a c3503a = (C3502c.C3503a) c3502c.f9275c.get(c3563q);
            if (c3503a == null) {
                c3564r = null;
            } else {
                c3564r = c3503a.get();
                if (c3564r == null) {
                    c3502c.m6679b(c3503a);
                }
            }
        }
        if (c3564r != null) {
            c3564r.m6621b();
        }
        if (c3564r != null) {
            if (f9403h) {
                m6636e("Loaded resource from active resources", j, c3563q);
            }
            return c3564r;
        }
        C3564r<?> m6638c = m6638c(c3563q);
        if (m6638c == null) {
            return null;
        }
        if (f9403h) {
            m6636e("Loaded resource from cache", j, c3563q);
        }
        return m6638c;
    }

    /* renamed from: f */
    public final synchronized void m6635f(C3556o<?> c3556o, InterfaceC3577g interfaceC3577g, C3564r<?> c3564r) {
        HashMap hashMap;
        if (c3564r != null) {
            if (c3564r.f9470a) {
                this.f9410g.m6680a(interfaceC3577g, c3564r);
            }
        }
        C3569u c3569u = this.f9404a;
        c3569u.getClass();
        if (c3556o.f9444p) {
            hashMap = c3569u.f9486b;
        } else {
            hashMap = c3569u.f9485a;
        }
        if (c3556o.equals(hashMap.get(interfaceC3577g))) {
            hashMap.remove(interfaceC3577g);
        }
    }

    /* renamed from: h */
    public final C3555d m6633h(C3424g c3424g, Object obj, InterfaceC3577g interfaceC3577g, int i, int i2, Class cls, Class cls2, EnumC3432i enumC3432i, AbstractC3543m abstractC3543m, C3849b c3849b, boolean z, boolean z2, C3581i c3581i, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC3828h interfaceC3828h, Executor executor, C3563q c3563q, long j) {
        C3569u c3569u = this.f9404a;
        C3556o c3556o = (C3556o) (z6 ? c3569u.f9486b : c3569u.f9485a).get(c3563q);
        if (c3556o != null) {
            c3556o.m6631a(interfaceC3828h, executor);
            if (f9403h) {
                m6636e("Added to existing load", j, c3563q);
            }
            return new C3555d(interfaceC3828h, c3556o);
        }
        C3556o c3556o2 = (C3556o) this.f9407d.f9421g.mo6394b();
        C3860j.m6404b(c3556o2);
        synchronized (c3556o2) {
            c3556o2.f9440l = c3563q;
            c3556o2.f9441m = z3;
            c3556o2.f9442n = z4;
            c3556o2.f9443o = z5;
            c3556o2.f9444p = z6;
        }
        C3550a c3550a = this.f9409f;
        RunnableC3535j runnableC3535j = (RunnableC3535j) c3550a.f9412b.mo6394b();
        C3860j.m6404b(runnableC3535j);
        int i3 = c3550a.f9413c;
        c3550a.f9413c = i3 + 1;
        C3534i<R> c3534i = runnableC3535j.f9361a;
        c3534i.f9339c = c3424g;
        c3534i.f9340d = obj;
        c3534i.f9350n = interfaceC3577g;
        c3534i.f9341e = i;
        c3534i.f9342f = i2;
        c3534i.f9352p = abstractC3543m;
        c3534i.f9343g = cls;
        c3534i.f9344h = runnableC3535j.f9364d;
        c3534i.f9347k = cls2;
        c3534i.f9351o = enumC3432i;
        c3534i.f9345i = c3581i;
        c3534i.f9346j = c3849b;
        c3534i.f9353q = z;
        c3534i.f9354r = z2;
        runnableC3535j.f9368h = c3424g;
        runnableC3535j.f9369i = interfaceC3577g;
        runnableC3535j.f9370j = enumC3432i;
        runnableC3535j.f9371k = c3563q;
        runnableC3535j.f9372l = i;
        runnableC3535j.f9373m = i2;
        runnableC3535j.f9374n = abstractC3543m;
        runnableC3535j.f9381u = z6;
        runnableC3535j.f9375o = c3581i;
        runnableC3535j.f9376p = c3556o2;
        runnableC3535j.f9377q = i3;
        runnableC3535j.f9379s = 1;
        runnableC3535j.f9382v = obj;
        C3569u c3569u2 = this.f9404a;
        c3569u2.getClass();
        (c3556o2.f9444p ? c3569u2.f9486b : c3569u2.f9485a).put(c3563q, c3556o2);
        c3556o2.m6631a(interfaceC3828h, executor);
        c3556o2.m6622k(runnableC3535j);
        if (f9403h) {
            m6636e("Started new load", j, c3563q);
        }
        return new C3555d(interfaceC3828h, c3556o2);
    }
}
