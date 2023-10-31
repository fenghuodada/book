package com.vungle.warren;

import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.C9863c;
import com.vungle.warren.model.C9867g;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.utility.C10085g;
import com.vungle.warren.utility.C10111y;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.vungle.warren.j0 */
/* loaded from: classes3.dex */
public final class C9818j0 {

    /* renamed from: c */
    public static final AtomicReference<Boolean> f19599c = new AtomicReference<>();

    /* renamed from: d */
    public static final AtomicReference<Boolean> f19600d = new AtomicReference<>();

    /* renamed from: e */
    public static C9818j0 f19601e;

    /* renamed from: a */
    public C9928h f19602a;

    /* renamed from: b */
    public ExecutorService f19603b;

    /* renamed from: com.vungle.warren.j0$a */
    /* loaded from: classes3.dex */
    public enum EnumC9819a {
        f19604b(Boolean.TRUE),
        f19605c(Boolean.FALSE),
        f19606d(null);
        

        /* renamed from: a */
        public final Boolean f19608a;

        EnumC9819a(Boolean bool) {
            this.f19608a = bool;
        }
    }

    /* renamed from: a */
    public static EnumC9819a m1501a() {
        AtomicReference<Boolean> atomicReference = f19599c;
        return (atomicReference == null || atomicReference.get() == null) ? EnumC9819a.f19606d : atomicReference.get().booleanValue() ? EnumC9819a.f19604b : !atomicReference.get().booleanValue() ? EnumC9819a.f19605c : EnumC9819a.f19606d;
    }

    /* renamed from: b */
    public static synchronized C9818j0 m1500b() {
        C9818j0 c9818j0;
        synchronized (C9818j0.class) {
            if (f19601e == null) {
                f19601e = new C9818j0();
            }
            c9818j0 = f19601e;
        }
        return c9818j0;
    }

    /* renamed from: d */
    public static boolean m1498d() {
        AtomicReference<Boolean> atomicReference = f19600d;
        if (atomicReference == null || atomicReference.get() == null) {
            return false;
        }
        return !atomicReference.get().booleanValue();
    }

    /* renamed from: c */
    public final synchronized void m1499c(C10111y c10111y, C9928h c9928h) {
        Boolean bool;
        ExecutorService executorService;
        this.f19602a = c9928h;
        this.f19603b = c10111y;
        int i = C10085g.f20312a;
        C9867g c9867g = (C9867g) c9928h.m1383p(C9867g.class, "coppa_cookie").get();
        if (c9867g != null) {
            bool = c9867g.f19824b.get("is_coppa");
        } else {
            bool = null;
        }
        AtomicReference<Boolean> atomicReference = f19599c;
        if (atomicReference.get() != null) {
            Boolean bool2 = atomicReference.get();
            if (bool2 != null) {
                atomicReference.set(bool2);
                if (this.f19602a != null && (executorService = this.f19603b) != null) {
                    executorService.execute(new RunnableC9809i0(this, bool2));
                }
            }
        } else if (bool != null) {
            atomicReference.set(bool);
        }
    }

    /* renamed from: e */
    public final void m1497e(boolean z) {
        Boolean bool;
        f19600d.set(Boolean.valueOf(z));
        C9928h c9928h = this.f19602a;
        if (c9928h == null) {
            return;
        }
        int i = C10085g.f20312a;
        C9867g c9867g = (C9867g) c9928h.m1383p(C9867g.class, "coppa_cookie").get();
        if (c9867g != null) {
            bool = c9867g.f19824b.get("disable_ad_id");
        } else {
            bool = null;
        }
        if ((bool == null || !bool.booleanValue()) && z) {
            this.f19602a.m1391h(Advertisement.class);
            this.f19602a.m1391h(C9863c.class);
        }
        C10085g.m1273a(this.f19602a, "disable_ad_id", Boolean.valueOf(z));
    }
}
