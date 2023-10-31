package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Looper;
import androidx.arch.core.executor.C0444b;
import androidx.arch.core.internal.C0449a;
import androidx.arch.core.internal.C0450b;
import androidx.core.content.C0663f;
import androidx.lifecycle.AbstractC1464h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.lifecycle.n */
/* loaded from: classes.dex */
public final class C1484n extends AbstractC1464h {

    /* renamed from: a */
    public final boolean f3451a;
    @NotNull

    /* renamed from: b */
    public C0449a<InterfaceC1481l, C1485a> f3452b;
    @NotNull

    /* renamed from: c */
    public AbstractC1464h.EnumC1468b f3453c;
    @NotNull

    /* renamed from: d */
    public final WeakReference<InterfaceC1483m> f3454d;

    /* renamed from: e */
    public int f3455e;

    /* renamed from: f */
    public boolean f3456f;

    /* renamed from: g */
    public boolean f3457g;
    @NotNull

    /* renamed from: h */
    public final ArrayList<AbstractC1464h.EnumC1468b> f3458h;

    /* renamed from: androidx.lifecycle.n$a */
    /* loaded from: classes.dex */
    public static final class C1485a {
        @NotNull

        /* renamed from: a */
        public AbstractC1464h.EnumC1468b f3459a;
        @NotNull

        /* renamed from: b */
        public final InterfaceC1479k f3460b;

        public C1485a(@Nullable InterfaceC1481l interfaceC1481l, @NotNull AbstractC1464h.EnumC1468b enumC1468b) {
            InterfaceC1479k reflectiveGenericLifecycleObserver;
            C10843j.m433c(interfaceC1481l);
            HashMap hashMap = C1488q.f3462a;
            boolean z = interfaceC1481l instanceof InterfaceC1479k;
            boolean z2 = interfaceC1481l instanceof InterfaceC1452c;
            if (z && z2) {
                reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC1452c) interfaceC1481l, (InterfaceC1479k) interfaceC1481l);
            } else if (z2) {
                reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC1452c) interfaceC1481l, null);
            } else if (z) {
                reflectiveGenericLifecycleObserver = (InterfaceC1479k) interfaceC1481l;
            } else {
                Class<?> cls = interfaceC1481l.getClass();
                if (C1488q.m10528b(cls) == 2) {
                    Object obj = C1488q.f3463b.get(cls);
                    C10843j.m433c(obj);
                    List list = (List) obj;
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(C1488q.m10529a((Constructor) list.get(0), interfaceC1481l));
                    } else {
                        int size = list.size();
                        InterfaceC1456e[] interfaceC1456eArr = new InterfaceC1456e[size];
                        for (int i = 0; i < size; i++) {
                            interfaceC1456eArr[i] = C1488q.m10529a((Constructor) list.get(i), interfaceC1481l);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC1456eArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC1481l);
                }
            }
            this.f3460b = reflectiveGenericLifecycleObserver;
            this.f3459a = enumC1468b;
        }

        /* renamed from: a */
        public final void m10530a(@Nullable InterfaceC1483m interfaceC1483m, @NotNull AbstractC1464h.EnumC1465a enumC1465a) {
            AbstractC1464h.EnumC1468b m10549a = enumC1465a.m10549a();
            AbstractC1464h.EnumC1468b state1 = this.f3459a;
            C10843j.m430f(state1, "state1");
            if (m10549a.compareTo(state1) < 0) {
                state1 = m10549a;
            }
            this.f3459a = state1;
            this.f3460b.onStateChanged(interfaceC1483m, enumC1465a);
            this.f3459a = m10549a;
        }
    }

    public C1484n(@NotNull InterfaceC1483m provider) {
        C10843j.m430f(provider, "provider");
        this.f3451a = true;
        this.f3452b = new C0449a<>();
        this.f3453c = AbstractC1464h.EnumC1468b.INITIALIZED;
        this.f3458h = new ArrayList<>();
        this.f3454d = new WeakReference<>(provider);
    }

    @Override // androidx.lifecycle.AbstractC1464h
    /* renamed from: a */
    public final void mo10539a(@NotNull InterfaceC1481l observer) {
        InterfaceC1483m interfaceC1483m;
        boolean z;
        C10843j.m430f(observer, "observer");
        m10535e("addObserver");
        AbstractC1464h.EnumC1468b enumC1468b = this.f3453c;
        AbstractC1464h.EnumC1468b enumC1468b2 = AbstractC1464h.EnumC1468b.DESTROYED;
        if (enumC1468b != enumC1468b2) {
            enumC1468b2 = AbstractC1464h.EnumC1468b.INITIALIZED;
        }
        C1485a c1485a = new C1485a(observer, enumC1468b2);
        if (this.f3452b.mo12445b(observer, c1485a) != null || (interfaceC1483m = this.f3454d.get()) == null) {
            return;
        }
        if (this.f3455e == 0 && !this.f3456f) {
            z = false;
        } else {
            z = true;
        }
        AbstractC1464h.EnumC1468b m10536d = m10536d(observer);
        this.f3455e++;
        while (c1485a.f3459a.compareTo(m10536d) < 0 && this.f3452b.f1444e.containsKey(observer)) {
            AbstractC1464h.EnumC1468b enumC1468b3 = c1485a.f3459a;
            ArrayList<AbstractC1464h.EnumC1468b> arrayList = this.f3458h;
            arrayList.add(enumC1468b3);
            AbstractC1464h.EnumC1465a.C1466a c1466a = AbstractC1464h.EnumC1465a.Companion;
            AbstractC1464h.EnumC1468b enumC1468b4 = c1485a.f3459a;
            c1466a.getClass();
            AbstractC1464h.EnumC1465a m10547b = AbstractC1464h.EnumC1465a.C1466a.m10547b(enumC1468b4);
            if (m10547b != null) {
                c1485a.m10530a(interfaceC1483m, m10547b);
                arrayList.remove(arrayList.size() - 1);
                m10536d = m10536d(observer);
            } else {
                throw new IllegalStateException("no event up from " + c1485a.f3459a);
            }
        }
        if (!z) {
            m10531i();
        }
        this.f3455e--;
    }

    @Override // androidx.lifecycle.AbstractC1464h
    @NotNull
    /* renamed from: b */
    public final AbstractC1464h.EnumC1468b mo10538b() {
        return this.f3453c;
    }

    @Override // androidx.lifecycle.AbstractC1464h
    /* renamed from: c */
    public final void mo10537c(@NotNull InterfaceC1481l observer) {
        C10843j.m430f(observer, "observer");
        m10535e("removeObserver");
        this.f3452b.mo12444i(observer);
    }

    /* renamed from: d */
    public final AbstractC1464h.EnumC1468b m10536d(InterfaceC1481l interfaceC1481l) {
        C0450b.C0453c<InterfaceC1481l, C1485a> c0453c;
        AbstractC1464h.EnumC1468b enumC1468b;
        C1485a c1485a;
        C0449a<InterfaceC1481l, C1485a> c0449a = this.f3452b;
        AbstractC1464h.EnumC1468b enumC1468b2 = null;
        if (c0449a.f1444e.containsKey(interfaceC1481l)) {
            c0453c = c0449a.f1444e.get(interfaceC1481l).f1452d;
        } else {
            c0453c = null;
        }
        if (c0453c != null && (c1485a = c0453c.f1450b) != null) {
            enumC1468b = c1485a.f3459a;
        } else {
            enumC1468b = null;
        }
        ArrayList<AbstractC1464h.EnumC1468b> arrayList = this.f3458h;
        if (!arrayList.isEmpty()) {
            enumC1468b2 = arrayList.get(arrayList.size() - 1);
        }
        AbstractC1464h.EnumC1468b state1 = this.f3453c;
        C10843j.m430f(state1, "state1");
        if (enumC1468b == null || enumC1468b.compareTo(state1) >= 0) {
            enumC1468b = state1;
        }
        if (enumC1468b2 == null || enumC1468b2.compareTo(enumC1468b) >= 0) {
            return enumC1468b;
        }
        return enumC1468b2;
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: e */
    public final void m10535e(String str) {
        boolean z;
        if (this.f3451a) {
            C0444b.m12450a().f1439a.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException(C0663f.m12005a("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* renamed from: f */
    public final void m10534f(@NotNull AbstractC1464h.EnumC1465a event) {
        C10843j.m430f(event, "event");
        m10535e("handleLifecycleEvent");
        m10533g(event.m10549a());
    }

    /* renamed from: g */
    public final void m10533g(AbstractC1464h.EnumC1468b enumC1468b) {
        AbstractC1464h.EnumC1468b enumC1468b2 = this.f3453c;
        if (enumC1468b2 == enumC1468b) {
            return;
        }
        AbstractC1464h.EnumC1468b enumC1468b3 = AbstractC1464h.EnumC1468b.INITIALIZED;
        AbstractC1464h.EnumC1468b enumC1468b4 = AbstractC1464h.EnumC1468b.DESTROYED;
        if (!((enumC1468b2 == enumC1468b3 && enumC1468b == enumC1468b4) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f3453c + " in component " + this.f3454d.get()).toString());
        }
        this.f3453c = enumC1468b;
        if (this.f3456f || this.f3455e != 0) {
            this.f3457g = true;
            return;
        }
        this.f3456f = true;
        m10531i();
        this.f3456f = false;
        if (this.f3453c == enumC1468b4) {
            this.f3452b = new C0449a<>();
        }
    }

    /* renamed from: h */
    public final void m10532h(@NotNull AbstractC1464h.EnumC1468b state) {
        C10843j.m430f(state, "state");
        m10535e("setCurrentState");
        m10533g(state);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162 A[SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10531i() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1484n.m10531i():void");
    }
}
