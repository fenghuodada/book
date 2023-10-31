package androidx.lifecycle;

import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.C0444b;
import androidx.arch.core.internal.C0450b;
import androidx.core.content.C0663f;
import androidx.lifecycle.AbstractC1464h;
import com.ambrose.overwall.fragment.child.C2420c;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k */
    public static final Object f3382k = new Object();

    /* renamed from: a */
    public final Object f3383a;

    /* renamed from: b */
    public final C0450b<InterfaceC1490s<? super T>, LiveData<T>.AbstractC1444c> f3384b;

    /* renamed from: c */
    public int f3385c;

    /* renamed from: d */
    public boolean f3386d;

    /* renamed from: e */
    public volatile Object f3387e;

    /* renamed from: f */
    public volatile Object f3388f;

    /* renamed from: g */
    public int f3389g;

    /* renamed from: h */
    public boolean f3390h;

    /* renamed from: i */
    public boolean f3391i;

    /* renamed from: j */
    public final RunnableC1442a f3392j;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.AbstractC1444c implements InterfaceC1479k {
        @NonNull

        /* renamed from: e */
        public final InterfaceC1483m f3393e;

        public LifecycleBoundObserver(@NonNull InterfaceC1483m interfaceC1483m, C2420c c2420c) {
            super(c2420c);
            this.f3393e = interfaceC1483m;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1444c
        /* renamed from: h */
        public final void mo10570h() {
            this.f3393e.getLifecycle().mo10537c(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1444c
        /* renamed from: i */
        public final boolean mo10569i(InterfaceC1483m interfaceC1483m) {
            return this.f3393e == interfaceC1483m;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1444c
        /* renamed from: j */
        public final boolean mo10568j() {
            return this.f3393e.getLifecycle().mo10538b().m10546a(AbstractC1464h.EnumC1468b.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC1479k
        public final void onStateChanged(@NonNull InterfaceC1483m interfaceC1483m, @NonNull AbstractC1464h.EnumC1465a enumC1465a) {
            InterfaceC1483m interfaceC1483m2 = this.f3393e;
            AbstractC1464h.EnumC1468b mo10538b = interfaceC1483m2.getLifecycle().mo10538b();
            if (mo10538b == AbstractC1464h.EnumC1468b.DESTROYED) {
                LiveData.this.mo10511h(this.f3396a);
                return;
            }
            AbstractC1464h.EnumC1468b enumC1468b = null;
            while (enumC1468b != mo10538b) {
                m10571g(mo10568j());
                enumC1468b = mo10538b;
                mo10538b = interfaceC1483m2.getLifecycle().mo10538b();
            }
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: classes.dex */
    public class RunnableC1442a implements Runnable {
        public RunnableC1442a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.f3383a) {
                obj = LiveData.this.f3388f;
                LiveData.this.f3388f = LiveData.f3382k;
            }
            LiveData.this.mo10510i(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: classes.dex */
    public class C1443b extends LiveData<T>.AbstractC1444c {
        public C1443b(LiveData liveData, InterfaceC1490s<? super T> interfaceC1490s) {
            super(interfaceC1490s);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1444c
        /* renamed from: j */
        public final boolean mo10568j() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    /* loaded from: classes.dex */
    public abstract class AbstractC1444c {

        /* renamed from: a */
        public final InterfaceC1490s<? super T> f3396a;

        /* renamed from: b */
        public boolean f3397b;

        /* renamed from: c */
        public int f3398c = -1;

        public AbstractC1444c(InterfaceC1490s<? super T> interfaceC1490s) {
            this.f3396a = interfaceC1490s;
        }

        /* renamed from: g */
        public final void m10571g(boolean z) {
            int i;
            boolean z2;
            boolean z3;
            if (z == this.f3397b) {
                return;
            }
            this.f3397b = z;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            LiveData liveData = LiveData.this;
            int i2 = liveData.f3385c;
            liveData.f3385c = i + i2;
            if (!liveData.f3386d) {
                liveData.f3386d = true;
                while (true) {
                    try {
                        int i3 = liveData.f3385c;
                        if (i2 == i3) {
                            break;
                        }
                        if (i2 == 0 && i3 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i2 > 0 && i3 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                            liveData.mo10513f();
                        } else if (z3) {
                            liveData.mo10512g();
                        }
                        i2 = i3;
                    } finally {
                        liveData.f3386d = false;
                    }
                }
            }
            if (this.f3397b) {
                liveData.m10574c(this);
            }
        }

        /* renamed from: h */
        public void mo10570h() {
        }

        /* renamed from: i */
        public boolean mo10569i(InterfaceC1483m interfaceC1483m) {
            return false;
        }

        /* renamed from: j */
        public abstract boolean mo10568j();
    }

    public LiveData() {
        this.f3383a = new Object();
        this.f3384b = new C0450b<>();
        this.f3385c = 0;
        Object obj = f3382k;
        this.f3388f = obj;
        this.f3392j = new RunnableC1442a();
        this.f3387e = obj;
        this.f3389g = -1;
    }

    public LiveData(Boolean bool) {
        this.f3383a = new Object();
        this.f3384b = new C0450b<>();
        this.f3385c = 0;
        this.f3388f = f3382k;
        this.f3392j = new RunnableC1442a();
        this.f3387e = bool;
        this.f3389g = 0;
    }

    /* renamed from: a */
    public static void m10576a(String str) {
        boolean z;
        C0444b.m12450a().f1439a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalStateException(C0663f.m12005a("Cannot invoke ", str, " on a background thread"));
    }

    /* renamed from: b */
    public final void m10575b(LiveData<T>.AbstractC1444c abstractC1444c) {
        if (abstractC1444c.f3397b) {
            if (!abstractC1444c.mo10568j()) {
                abstractC1444c.m10571g(false);
                return;
            }
            int i = abstractC1444c.f3398c;
            int i2 = this.f3389g;
            if (i >= i2) {
                return;
            }
            abstractC1444c.f3398c = i2;
            abstractC1444c.f3396a.onChanged((Object) this.f3387e);
        }
    }

    /* renamed from: c */
    public final void m10574c(@Nullable LiveData<T>.AbstractC1444c abstractC1444c) {
        if (this.f3390h) {
            this.f3391i = true;
            return;
        }
        this.f3390h = true;
        do {
            this.f3391i = false;
            if (abstractC1444c != null) {
                m10575b(abstractC1444c);
                abstractC1444c = null;
            } else {
                C0450b<InterfaceC1490s<? super T>, LiveData<T>.AbstractC1444c> c0450b = this.f3384b;
                c0450b.getClass();
                C0450b.C0454d c0454d = new C0450b.C0454d();
                c0450b.f1447c.put(c0454d, Boolean.FALSE);
                while (c0454d.hasNext()) {
                    m10575b((AbstractC1444c) ((Map.Entry) c0454d.next()).getValue());
                    if (this.f3391i) {
                        break;
                    }
                }
            }
        } while (this.f3391i);
        this.f3390h = false;
    }

    @MainThread
    /* renamed from: d */
    public final void m10573d(@NonNull InterfaceC1483m interfaceC1483m, @NonNull C2420c c2420c) {
        m10576a("observe");
        if (interfaceC1483m.getLifecycle().mo10538b() == AbstractC1464h.EnumC1468b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC1483m, c2420c);
        LiveData<T>.AbstractC1444c mo12445b = this.f3384b.mo12445b(c2420c, lifecycleBoundObserver);
        if (mo12445b != null && !mo12445b.mo10569i(interfaceC1483m)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo12445b != null) {
            return;
        }
        interfaceC1483m.getLifecycle().mo10539a(lifecycleBoundObserver);
    }

    @MainThread
    /* renamed from: e */
    public final void m10572e(@NonNull InterfaceC1490s<? super T> interfaceC1490s) {
        m10576a("observeForever");
        C1443b c1443b = new C1443b(this, interfaceC1490s);
        LiveData<T>.AbstractC1444c mo12445b = this.f3384b.mo12445b(interfaceC1490s, c1443b);
        if (mo12445b instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo12445b != null) {
            return;
        }
        c1443b.m10571g(true);
    }

    /* renamed from: f */
    public void mo10513f() {
    }

    /* renamed from: g */
    public void mo10512g() {
    }

    @MainThread
    /* renamed from: h */
    public void mo10511h(@NonNull InterfaceC1490s<? super T> interfaceC1490s) {
        m10576a("removeObserver");
        LiveData<T>.AbstractC1444c mo12444i = this.f3384b.mo12444i(interfaceC1490s);
        if (mo12444i == null) {
            return;
        }
        mo12444i.mo10570h();
        mo12444i.m10571g(false);
    }

    @MainThread
    /* renamed from: i */
    public abstract void mo10510i(T t);
}
