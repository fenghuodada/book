package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.C9543a;
import com.unity3d.services.core.lifecycle.C9545c;
import com.unity3d.services.core.lifecycle.EnumC9547e;
import com.unity3d.services.core.lifecycle.InterfaceC9544b;
import com.unity3d.services.core.log.C9549a;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.unity3d.services.core.timer.a */
/* loaded from: classes3.dex */
public class C9609a implements InterfaceC9613c, InterfaceC9544b {

    /* renamed from: a */
    private final C9545c f19062a;

    /* renamed from: b */
    final Integer f19063b;

    /* renamed from: c */
    final Integer f19064c;

    /* renamed from: d */
    Integer f19065d;

    /* renamed from: e */
    private InterfaceC9617g f19066e;

    /* renamed from: f */
    private ScheduledFuture<?> f19067f;

    /* renamed from: g */
    private ScheduledExecutorService f19068g;

    /* renamed from: h */
    private final AtomicBoolean f19069h;

    /* renamed from: i */
    private final AtomicBoolean f19070i;

    /* renamed from: com.unity3d.services.core.timer.a$a */
    /* loaded from: classes3.dex */
    public class RunnableC9610a implements Runnable {
        public RunnableC9610a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9609a c9609a = C9609a.this;
            c9609a.f19065d = Integer.valueOf(c9609a.f19065d.intValue() - C9609a.this.f19064c.intValue());
            C9609a.this.mo1796d();
        }
    }

    /* renamed from: com.unity3d.services.core.timer.a$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C9611b {

        /* renamed from: a */
        static final /* synthetic */ int[] f19072a;

        static {
            int[] iArr = new int[EnumC9547e.values().length];
            f19072a = iArr;
            try {
                iArr[EnumC9547e.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19072a[EnumC9547e.RESUMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C9609a(Integer num, InterfaceC9617g interfaceC9617g) {
        this(num, interfaceC9617g, C9543a.m2036a());
    }

    public C9609a(Integer num, InterfaceC9617g interfaceC9617g, C9545c c9545c) {
        this.f19064c = 1000;
        this.f19069h = new AtomicBoolean(false);
        this.f19070i = new AtomicBoolean(false);
        this.f19063b = num;
        this.f19065d = num;
        this.f19066e = interfaceC9617g;
        this.f19062a = c9545c;
        if (c9545c != null) {
            c9545c.m2032a(this);
        }
    }

    /* renamed from: c */
    private void m1806c() {
        InterfaceC9617g interfaceC9617g = this.f19066e;
        if (interfaceC9617g != null) {
            interfaceC9617g.mo1798a();
        }
    }

    /* renamed from: g */
    private void m1803g() {
        try {
            this.f19067f = this.f19068g.scheduleAtFixedRate(new RunnableC9610a(), this.f19064c.intValue(), this.f19064c.intValue(), TimeUnit.MILLISECONDS);
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException | RejectedExecutionException e) {
            C9549a.m2019b("ERROR: IntervalTimer failed to start due to exception " + e.getLocalizedMessage());
        }
    }

    @Override // com.unity3d.services.core.timer.InterfaceC9613c
    /* renamed from: a */
    public void mo1797a() {
        m1802h();
        C9545c c9545c = this.f19062a;
        if (c9545c != null) {
            c9545c.m2030b(this);
        }
        this.f19066e = null;
    }

    @Override // com.unity3d.services.core.lifecycle.InterfaceC9544b
    /* renamed from: a */
    public void mo1808a(EnumC9547e enumC9547e) {
        int i = C9611b.f19072a[enumC9547e.ordinal()];
        if (i == 1) {
            if (m1807b()) {
                m1805e();
                this.f19070i.getAndSet(true);
            }
        } else if (i == 2 && this.f19070i.get()) {
            this.f19070i.getAndSet(false);
            m1804f();
        }
    }

    @Override // com.unity3d.services.core.timer.InterfaceC9613c
    /* renamed from: a */
    public void mo1801a(ScheduledExecutorService scheduledExecutorService) {
        if (this.f19069h.compareAndSet(false, true)) {
            this.f19068g = scheduledExecutorService;
            m1803g();
        }
    }

    /* renamed from: b */
    public boolean m1807b() {
        return this.f19069h.get();
    }

    /* renamed from: d */
    public void mo1796d() {
        if (this.f19065d.intValue() <= 0) {
            m1806c();
            mo1797a();
        }
    }

    /* renamed from: e */
    public boolean m1805e() {
        boolean z;
        ScheduledFuture<?> scheduledFuture = this.f19067f;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            z = false;
        } else {
            z = true;
            this.f19067f.cancel(true);
            this.f19067f = null;
        }
        this.f19069h.getAndSet(false);
        return z;
    }

    /* renamed from: f */
    public boolean m1804f() {
        boolean z;
        ScheduledExecutorService scheduledExecutorService = this.f19068g;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            z = false;
        } else {
            m1803g();
            z = true;
        }
        this.f19069h.getAndSet(z);
        return z;
    }

    /* renamed from: h */
    public void m1802h() {
        ScheduledExecutorService scheduledExecutorService = this.f19068g;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.f19068g.shutdown();
            this.f19068g = null;
        }
        this.f19069h.getAndSet(false);
    }
}
