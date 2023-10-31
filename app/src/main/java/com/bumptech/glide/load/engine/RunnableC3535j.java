package com.bumptech.glide.load.engine;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.C0510h;
import androidx.constraintlayout.core.C0511i;
import androidx.core.util.InterfaceC0801e;
import androidx.profileinstaller.C1544f;
import com.bumptech.glide.C3424g;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.C3578h;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.InterfaceC3584l;
import com.bumptech.glide.load.data.C3456f;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.data.InterfaceC3454e;
import com.bumptech.glide.load.engine.C3549n;
import com.bumptech.glide.load.engine.InterfaceC3532h;
import com.bumptech.glide.load.engine.executor.ExecutorServiceC3527a;
import com.bumptech.glide.load.resource.bitmap.C3720p;
import com.bumptech.glide.util.C3855f;
import com.bumptech.glide.util.C3860j;
import com.bumptech.glide.util.pool.AbstractC3871d;
import com.bumptech.glide.util.pool.C3863a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.load.engine.j */
/* loaded from: classes.dex */
public final class RunnableC3535j<R> implements InterfaceC3532h.InterfaceC3533a, Runnable, Comparable<RunnableC3535j<?>>, C3863a.InterfaceC3867d {

    /* renamed from: A */
    public EnumC3444a f9355A;

    /* renamed from: B */
    public InterfaceC3452d<?> f9356B;

    /* renamed from: C */
    public volatile InterfaceC3532h f9357C;

    /* renamed from: D */
    public volatile boolean f9358D;

    /* renamed from: E */
    public volatile boolean f9359E;

    /* renamed from: F */
    public boolean f9360F;

    /* renamed from: d */
    public final InterfaceC3539d f9364d;

    /* renamed from: e */
    public final InterfaceC0801e<RunnableC3535j<?>> f9365e;

    /* renamed from: h */
    public C3424g f9368h;

    /* renamed from: i */
    public InterfaceC3577g f9369i;

    /* renamed from: j */
    public EnumC3432i f9370j;

    /* renamed from: k */
    public C3563q f9371k;

    /* renamed from: l */
    public int f9372l;

    /* renamed from: m */
    public int f9373m;

    /* renamed from: n */
    public AbstractC3543m f9374n;

    /* renamed from: o */
    public C3581i f9375o;

    /* renamed from: p */
    public InterfaceC3536a<R> f9376p;

    /* renamed from: q */
    public int f9377q;

    /* renamed from: r */
    public int f9378r;

    /* renamed from: s */
    public int f9379s;

    /* renamed from: t */
    public long f9380t;

    /* renamed from: u */
    public boolean f9381u;

    /* renamed from: v */
    public Object f9382v;

    /* renamed from: w */
    public Thread f9383w;

    /* renamed from: x */
    public InterfaceC3577g f9384x;

    /* renamed from: y */
    public InterfaceC3577g f9385y;

    /* renamed from: z */
    public Object f9386z;

    /* renamed from: a */
    public final C3534i<R> f9361a = new C3534i<>();

    /* renamed from: b */
    public final ArrayList f9362b = new ArrayList();

    /* renamed from: c */
    public final AbstractC3871d.C3872a f9363c = new AbstractC3871d.C3872a();

    /* renamed from: f */
    public final C3538c<?> f9366f = new C3538c<>();

    /* renamed from: g */
    public final C3540e f9367g = new C3540e();

    /* renamed from: com.bumptech.glide.load.engine.j$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3536a<R> {
    }

    /* renamed from: com.bumptech.glide.load.engine.j$b */
    /* loaded from: classes.dex */
    public final class C3537b<Z> {

        /* renamed from: a */
        public final EnumC3444a f9387a;

        public C3537b(EnumC3444a enumC3444a) {
            this.f9387a = enumC3444a;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$c */
    /* loaded from: classes.dex */
    public static class C3538c<Z> {

        /* renamed from: a */
        public InterfaceC3577g f9389a;

        /* renamed from: b */
        public InterfaceC3584l<Z> f9390b;

        /* renamed from: c */
        public C3571w<Z> f9391c;
    }

    /* renamed from: com.bumptech.glide.load.engine.j$d */
    /* loaded from: classes.dex */
    public interface InterfaceC3539d {
    }

    /* renamed from: com.bumptech.glide.load.engine.j$e */
    /* loaded from: classes.dex */
    public static class C3540e {

        /* renamed from: a */
        public boolean f9392a;

        /* renamed from: b */
        public boolean f9393b;

        /* renamed from: c */
        public boolean f9394c;

        /* renamed from: a */
        public final boolean m6647a() {
            return (this.f9394c || this.f9393b) && this.f9392a;
        }
    }

    public RunnableC3535j(InterfaceC3539d interfaceC3539d, C3863a.C3866c c3866c) {
        this.f9364d = interfaceC3539d;
        this.f9365e = c3866c;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3532h.InterfaceC3533a
    /* renamed from: a */
    public final void mo6664a(InterfaceC3577g interfaceC3577g, Exception exc, InterfaceC3452d<?> interfaceC3452d, EnumC3444a enumC3444a) {
        ExecutorServiceC3527a executorServiceC3527a;
        interfaceC3452d.mo6578b();
        C3566s c3566s = new C3566s("Fetching data failed", Collections.singletonList(exc));
        Class<?> mo6579a = interfaceC3452d.mo6579a();
        c3566s.f9479b = interfaceC3577g;
        c3566s.f9480c = enumC3444a;
        c3566s.f9481d = mo6579a;
        this.f9362b.add(c3566s);
        if (Thread.currentThread() != this.f9383w) {
            this.f9379s = 2;
            C3556o c3556o = (C3556o) this.f9376p;
            if (c3556o.f9442n) {
                executorServiceC3527a = c3556o.f9437i;
            } else if (c3556o.f9443o) {
                executorServiceC3527a = c3556o.f9438j;
            } else {
                executorServiceC3527a = c3556o.f9436h;
            }
            executorServiceC3527a.execute(this);
            return;
        }
        m6650q();
    }

    @Override // com.bumptech.glide.util.pool.C3863a.InterfaceC3867d
    @NonNull
    /* renamed from: b */
    public final AbstractC3871d.C3872a mo6393b() {
        return this.f9363c;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3532h.InterfaceC3533a
    /* renamed from: c */
    public final void mo6663c() {
        ExecutorServiceC3527a executorServiceC3527a;
        this.f9379s = 2;
        C3556o c3556o = (C3556o) this.f9376p;
        if (c3556o.f9442n) {
            executorServiceC3527a = c3556o.f9437i;
        } else if (c3556o.f9443o) {
            executorServiceC3527a = c3556o.f9438j;
        } else {
            executorServiceC3527a = c3556o.f9436h;
        }
        executorServiceC3527a.execute(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull RunnableC3535j<?> runnableC3535j) {
        RunnableC3535j<?> runnableC3535j2 = runnableC3535j;
        int ordinal = this.f9370j.ordinal() - runnableC3535j2.f9370j.ordinal();
        if (ordinal == 0) {
            return this.f9377q - runnableC3535j2.f9377q;
        }
        return ordinal;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3532h.InterfaceC3533a
    /* renamed from: d */
    public final void mo6662d(InterfaceC3577g interfaceC3577g, Object obj, InterfaceC3452d<?> interfaceC3452d, EnumC3444a enumC3444a, InterfaceC3577g interfaceC3577g2) {
        ExecutorServiceC3527a executorServiceC3527a;
        this.f9384x = interfaceC3577g;
        this.f9386z = obj;
        this.f9356B = interfaceC3452d;
        this.f9355A = enumC3444a;
        this.f9385y = interfaceC3577g2;
        boolean z = false;
        if (interfaceC3577g != this.f9361a.m6669a().get(0)) {
            z = true;
        }
        this.f9360F = z;
        if (Thread.currentThread() != this.f9383w) {
            this.f9379s = 3;
            C3556o c3556o = (C3556o) this.f9376p;
            if (c3556o.f9442n) {
                executorServiceC3527a = c3556o.f9437i;
            } else if (c3556o.f9443o) {
                executorServiceC3527a = c3556o.f9438j;
            } else {
                executorServiceC3527a = c3556o.f9436h;
            }
            executorServiceC3527a.execute(this);
            return;
        }
        m6659h();
    }

    /* renamed from: f */
    public final <Data> InterfaceC3573x<R> m6661f(InterfaceC3452d<?> interfaceC3452d, Data data, EnumC3444a enumC3444a) throws C3566s {
        if (data == null) {
            return null;
        }
        try {
            int i = C3855f.f9946b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC3573x<R> m6660g = m6660g(data, enumC3444a);
            if (Log.isLoggable("DecodeJob", 2)) {
                m6656k(elapsedRealtimeNanos, "Decoded result " + m6660g, null);
            }
            return m6660g;
        } finally {
            interfaceC3452d.mo6578b();
        }
    }

    /* renamed from: g */
    public final <Data> InterfaceC3573x<R> m6660g(Data data, EnumC3444a enumC3444a) throws C3566s {
        InterfaceC3454e mo6523b;
        boolean z;
        C3570v<Data, ?, R> m6667c = this.f9361a.m6667c(data.getClass());
        C3581i c3581i = this.f9375o;
        if (Build.VERSION.SDK_INT >= 26) {
            if (enumC3444a != EnumC3444a.RESOURCE_DISK_CACHE && !this.f9361a.f9354r) {
                z = false;
            } else {
                z = true;
            }
            C3578h<Boolean> c3578h = C3720p.f9680i;
            Boolean bool = (Boolean) c3581i.m6606c(c3578h);
            if (bool == null || (bool.booleanValue() && !z)) {
                c3581i = new C3581i();
                c3581i.f9520b.mo6417i(this.f9375o.f9520b);
                c3581i.f9520b.put(c3578h, Boolean.valueOf(z));
            }
        }
        C3581i c3581i2 = c3581i;
        C3456f c3456f = this.f9368h.f9077b.f9143e;
        synchronized (c3456f) {
            InterfaceC3454e.InterfaceC3455a interfaceC3455a = (InterfaceC3454e.InterfaceC3455a) c3456f.f9201a.get(data.getClass());
            if (interfaceC3455a == null) {
                Iterator it = c3456f.f9201a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InterfaceC3454e.InterfaceC3455a interfaceC3455a2 = (InterfaceC3454e.InterfaceC3455a) it.next();
                    if (interfaceC3455a2.mo6524a().isAssignableFrom(data.getClass())) {
                        interfaceC3455a = interfaceC3455a2;
                        break;
                    }
                }
            }
            if (interfaceC3455a == null) {
                interfaceC3455a = C3456f.f9200b;
            }
            mo6523b = interfaceC3455a.mo6523b(data);
        }
        try {
            return m6667c.m6612a(this.f9372l, this.f9373m, c3581i2, mo6523b, new C3537b(enumC3444a));
        } finally {
            mo6523b.mo6525b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final void m6659h() {
        InterfaceC3573x interfaceC3573x;
        boolean z;
        if (Log.isLoggable("DecodeJob", 2)) {
            m6656k(this.f9380t, "Retrieved data", "data: " + this.f9386z + ", cache key: " + this.f9384x + ", fetcher: " + this.f9356B);
        }
        C3571w c3571w = null;
        try {
            interfaceC3573x = (InterfaceC3573x<R>) m6661f(this.f9356B, this.f9386z, this.f9355A);
        } catch (C3566s e) {
            InterfaceC3577g interfaceC3577g = this.f9385y;
            EnumC3444a enumC3444a = this.f9355A;
            e.f9479b = interfaceC3577g;
            e.f9480c = enumC3444a;
            e.f9481d = null;
            this.f9362b.add(e);
            interfaceC3573x = (InterfaceC3573x<R>) null;
        }
        if (interfaceC3573x != null) {
            EnumC3444a enumC3444a2 = this.f9355A;
            boolean z2 = this.f9360F;
            if (interfaceC3573x instanceof InterfaceC3568t) {
                ((InterfaceC3568t) interfaceC3573x).initialize();
            }
            boolean z3 = true;
            if (this.f9366f.f9391c != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c3571w = (C3571w) C3571w.f9490e.mo6394b();
                C3860j.m6404b(c3571w);
                c3571w.f9494d = false;
                c3571w.f9493c = true;
                c3571w.f9492b = interfaceC3573x;
                interfaceC3573x = c3571w;
            }
            m6648s();
            C3556o c3556o = (C3556o) this.f9376p;
            synchronized (c3556o) {
                c3556o.f9445q = interfaceC3573x;
                c3556o.f9446r = enumC3444a2;
                c3556o.f9453y = z2;
            }
            c3556o.m6625h();
            this.f9378r = 5;
            try {
                C3538c<?> c3538c = this.f9366f;
                if (c3538c.f9391c == null) {
                    z3 = false;
                }
                if (z3) {
                    InterfaceC3539d interfaceC3539d = this.f9364d;
                    C3581i c3581i = this.f9375o;
                    c3538c.getClass();
                    ((C3549n.C3554c) interfaceC3539d).m6632a().mo6675a(c3538c.f9389a, new C3531g(c3538c.f9390b, c3538c.f9391c, c3581i));
                    c3538c.f9391c.m6611d();
                }
                m6654m();
                return;
            } finally {
                if (c3571w != null) {
                    c3571w.m6611d();
                }
            }
        }
        m6650q();
    }

    /* renamed from: i */
    public final InterfaceC3532h m6658i() {
        int m12337b = C0511i.m12337b(this.f9378r);
        C3534i<R> c3534i = this.f9361a;
        if (m12337b != 1) {
            if (m12337b != 2) {
                if (m12337b != 3) {
                    if (m12337b == 5) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: ".concat(C1544f.m10470b(this.f9378r)));
                }
                return new C3504c0(c3534i, this);
            }
            return new C3526e(c3534i.m6669a(), c3534i, this);
        }
        return new C3574y(c3534i, this);
    }

    /* renamed from: j */
    public final int m6657j(int i) {
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0) {
                if (this.f9374n.mo6642b()) {
                    return 2;
                }
                return m6657j(2);
            } else if (i2 == 1) {
                if (this.f9374n.mo6643a()) {
                    return 3;
                }
                return m6657j(3);
            } else if (i2 == 2) {
                return this.f9381u ? 6 : 4;
            } else if (i2 == 3 || i2 == 5) {
                return 6;
            } else {
                throw new IllegalArgumentException("Unrecognized stage: ".concat(C1544f.m10470b(i)));
            }
        }
        throw null;
    }

    /* renamed from: k */
    public final void m6656k(long j, String str, String str2) {
        String str3;
        StringBuilder m12339b = C0510h.m12339b(str, " in ");
        m12339b.append(C3855f.m6413a(j));
        m12339b.append(", load key: ");
        m12339b.append(this.f9371k);
        if (str2 != null) {
            str3 = ", ".concat(str2);
        } else {
            str3 = "";
        }
        m12339b.append(str3);
        m12339b.append(", thread: ");
        m12339b.append(Thread.currentThread().getName());
        Log.v("DecodeJob", m12339b.toString());
    }

    /* renamed from: l */
    public final void m6655l() {
        m6648s();
        C3566s c3566s = new C3566s("Failed to load resource", new ArrayList(this.f9362b));
        C3556o c3556o = (C3556o) this.f9376p;
        synchronized (c3556o) {
            c3556o.f9448t = c3566s;
        }
        c3556o.m6626g();
        m6653n();
    }

    /* renamed from: m */
    public final void m6654m() {
        boolean m6647a;
        C3540e c3540e = this.f9367g;
        synchronized (c3540e) {
            c3540e.f9393b = true;
            m6647a = c3540e.m6647a();
        }
        if (m6647a) {
            m6651p();
        }
    }

    /* renamed from: n */
    public final void m6653n() {
        boolean m6647a;
        C3540e c3540e = this.f9367g;
        synchronized (c3540e) {
            c3540e.f9394c = true;
            m6647a = c3540e.m6647a();
        }
        if (m6647a) {
            m6651p();
        }
    }

    /* renamed from: o */
    public final void m6652o() {
        boolean m6647a;
        C3540e c3540e = this.f9367g;
        synchronized (c3540e) {
            c3540e.f9392a = true;
            m6647a = c3540e.m6647a();
        }
        if (m6647a) {
            m6651p();
        }
    }

    /* renamed from: p */
    public final void m6651p() {
        C3540e c3540e = this.f9367g;
        synchronized (c3540e) {
            c3540e.f9393b = false;
            c3540e.f9392a = false;
            c3540e.f9394c = false;
        }
        C3538c<?> c3538c = this.f9366f;
        c3538c.f9389a = null;
        c3538c.f9390b = null;
        c3538c.f9391c = null;
        C3534i<R> c3534i = this.f9361a;
        c3534i.f9339c = null;
        c3534i.f9340d = null;
        c3534i.f9350n = null;
        c3534i.f9343g = null;
        c3534i.f9347k = null;
        c3534i.f9345i = null;
        c3534i.f9351o = null;
        c3534i.f9346j = null;
        c3534i.f9352p = null;
        c3534i.f9337a.clear();
        c3534i.f9348l = false;
        c3534i.f9338b.clear();
        c3534i.f9349m = false;
        this.f9358D = false;
        this.f9368h = null;
        this.f9369i = null;
        this.f9375o = null;
        this.f9370j = null;
        this.f9371k = null;
        this.f9376p = null;
        this.f9378r = 0;
        this.f9357C = null;
        this.f9383w = null;
        this.f9384x = null;
        this.f9386z = null;
        this.f9355A = null;
        this.f9356B = null;
        this.f9380t = 0L;
        this.f9359E = false;
        this.f9382v = null;
        this.f9362b.clear();
        this.f9365e.mo6395a(this);
    }

    /* renamed from: q */
    public final void m6650q() {
        this.f9383w = Thread.currentThread();
        int i = C3855f.f9946b;
        this.f9380t = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.f9359E && this.f9357C != null && !(z = this.f9357C.mo6610b())) {
            this.f9378r = m6657j(this.f9378r);
            this.f9357C = m6658i();
            if (this.f9378r == 4) {
                mo6663c();
                return;
            }
        }
        if ((this.f9378r == 6 || this.f9359E) && !z) {
            m6655l();
        }
    }

    /* renamed from: r */
    public final void m6649r() {
        int m12337b = C0511i.m12337b(this.f9379s);
        if (m12337b == 0) {
            this.f9378r = m6657j(1);
            this.f9357C = m6658i();
        } else if (m12337b != 1) {
            if (m12337b != 2) {
                throw new IllegalStateException("Unrecognized run reason: ".concat(C3541k.m6646a(this.f9379s)));
            }
            m6659h();
            return;
        }
        m6650q();
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3452d<?> interfaceC3452d = this.f9356B;
        try {
            try {
                if (this.f9359E) {
                    m6655l();
                    if (interfaceC3452d != null) {
                        interfaceC3452d.mo6578b();
                        return;
                    }
                    return;
                }
                m6649r();
                if (interfaceC3452d != null) {
                    interfaceC3452d.mo6578b();
                }
            } catch (C3525d e) {
                throw e;
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f9359E + ", stage: " + C1544f.m10470b(this.f9378r), th);
                }
                if (this.f9378r != 5) {
                    this.f9362b.add(th);
                    m6655l();
                }
                if (!this.f9359E) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (interfaceC3452d != null) {
                interfaceC3452d.mo6578b();
            }
            throw th2;
        }
    }

    /* renamed from: s */
    public final void m6648s() {
        Throwable th;
        this.f9363c.m6390a();
        if (!this.f9358D) {
            this.f9358D = true;
            return;
        }
        if (this.f9362b.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f9362b;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }
}
