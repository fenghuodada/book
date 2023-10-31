package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import com.bumptech.glide.util.C3860j;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.i */
/* loaded from: classes.dex */
public final class C3491i implements InterfaceC3483b {

    /* renamed from: a */
    public final C3488g<C3492a, Object> f9242a = new C3488g<>();

    /* renamed from: b */
    public final C3493b f9243b = new C3493b();

    /* renamed from: c */
    public final HashMap f9244c = new HashMap();

    /* renamed from: d */
    public final HashMap f9245d = new HashMap();

    /* renamed from: e */
    public final int f9246e;

    /* renamed from: f */
    public int f9247f;

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.i$a */
    /* loaded from: classes.dex */
    public static final class C3492a implements InterfaceC3497l {

        /* renamed from: a */
        public final C3493b f9248a;

        /* renamed from: b */
        public int f9249b;

        /* renamed from: c */
        public Class<?> f9250c;

        public C3492a(C3493b c3493b) {
            this.f9248a = c3493b;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3497l
        /* renamed from: a */
        public final void mo6682a() {
            this.f9248a.m6711c(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C3492a) {
                C3492a c3492a = (C3492a) obj;
                return this.f9249b == c3492a.f9249b && this.f9250c == c3492a.f9250c;
            }
            return false;
        }

        public final int hashCode() {
            int i = this.f9249b * 31;
            Class<?> cls = this.f9250c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f9249b + "array=" + this.f9250c + '}';
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.i$b */
    /* loaded from: classes.dex */
    public static final class C3493b extends AbstractC3484c<C3492a> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.AbstractC3484c
        /* renamed from: a */
        public final C3492a mo6681a() {
            return new C3492a(this);
        }
    }

    public C3491i(int i) {
        this.f9246e = i;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b
    /* renamed from: a */
    public final synchronized void mo6704a(int i) {
        try {
            if (i >= 40) {
                mo6703b();
            } else if (i >= 20 || i == 15) {
                m6699f(this.f9246e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b
    /* renamed from: b */
    public final synchronized void mo6703b() {
        m6699f(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b
    /* renamed from: c */
    public final synchronized <T> T mo6702c(int i, Class<T> cls) {
        C3492a c3492a;
        boolean z;
        Integer ceilingKey = m6696i(cls).ceilingKey(Integer.valueOf(i));
        boolean z2 = false;
        if (ceilingKey != null) {
            int i2 = this.f9247f;
            if (i2 != 0 && this.f9246e / i2 < 2) {
                z = false;
                if (!z || ceilingKey.intValue() <= i * 8) {
                    z2 = true;
                }
            }
            z = true;
            if (!z) {
            }
            z2 = true;
        }
        if (z2) {
            C3493b c3493b = this.f9243b;
            int intValue = ceilingKey.intValue();
            c3492a = c3493b.m6712b();
            c3492a.f9249b = intValue;
            c3492a.f9250c = cls;
        } else {
            C3492a m6712b = this.f9243b.m6712b();
            m6712b.f9249b = i;
            m6712b.f9250c = cls;
            c3492a = m6712b;
        }
        return (T) m6697h(c3492a, cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b
    /* renamed from: d */
    public final synchronized Object mo6701d() {
        C3492a m6712b;
        m6712b = this.f9243b.m6712b();
        m6712b.f9249b = 8;
        m6712b.f9250c = byte[].class;
        return m6697h(m6712b, byte[].class);
    }

    /* renamed from: e */
    public final void m6700e(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> m6696i = m6696i(cls);
        Integer num = m6696i.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        }
        int intValue = num.intValue();
        Integer valueOf = Integer.valueOf(i);
        if (intValue == 1) {
            m6696i.remove(valueOf);
        } else {
            m6696i.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: f */
    public final void m6699f(int i) {
        while (this.f9247f > i) {
            Object m6708c = this.f9242a.m6708c();
            C3860j.m6404b(m6708c);
            InterfaceC3482a m6698g = m6698g(m6708c.getClass());
            this.f9247f -= m6698g.mo6706b() * m6698g.mo6705c(m6708c);
            m6700e(m6698g.mo6705c(m6708c), m6708c.getClass());
            if (Log.isLoggable(m6698g.mo6707a(), 2)) {
                Log.v(m6698g.mo6707a(), "evicted: " + m6698g.mo6705c(m6708c));
            }
        }
    }

    /* renamed from: g */
    public final <T> InterfaceC3482a<T> m6698g(Class<T> cls) {
        HashMap hashMap = this.f9245d;
        InterfaceC3482a<T> interfaceC3482a = (InterfaceC3482a) hashMap.get(cls);
        if (interfaceC3482a == null) {
            if (cls.equals(int[].class)) {
                interfaceC3482a = new C3490h();
            } else if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            } else {
                interfaceC3482a = new C3487f();
            }
            hashMap.put(cls, interfaceC3482a);
        }
        return interfaceC3482a;
    }

    /* renamed from: h */
    public final <T> T m6697h(C3492a c3492a, Class<T> cls) {
        InterfaceC3482a<T> m6698g = m6698g(cls);
        T t = (T) this.f9242a.m6710a(c3492a);
        if (t != null) {
            this.f9247f -= m6698g.mo6706b() * m6698g.mo6705c(t);
            m6700e(m6698g.mo6705c(t), cls);
        }
        if (t == null) {
            if (Log.isLoggable(m6698g.mo6707a(), 2)) {
                Log.v(m6698g.mo6707a(), "Allocated " + c3492a.f9249b + " bytes");
            }
            return m6698g.newArray(c3492a.f9249b);
        }
        return t;
    }

    /* renamed from: i */
    public final NavigableMap<Integer, Integer> m6696i(Class<?> cls) {
        HashMap hashMap = this.f9244c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b
    public final synchronized <T> void put(T t) {
        boolean z;
        Class<?> cls = t.getClass();
        InterfaceC3482a<T> m6698g = m6698g(cls);
        int mo6705c = m6698g.mo6705c(t);
        int mo6706b = m6698g.mo6706b() * mo6705c;
        int i = 1;
        if (mo6706b <= this.f9246e / 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        C3492a m6712b = this.f9243b.m6712b();
        m6712b.f9249b = mo6705c;
        m6712b.f9250c = cls;
        this.f9242a.m6709b(m6712b, t);
        NavigableMap<Integer, Integer> m6696i = m6696i(cls);
        Integer num = m6696i.get(Integer.valueOf(m6712b.f9249b));
        Integer valueOf = Integer.valueOf(m6712b.f9249b);
        if (num != null) {
            i = 1 + num.intValue();
        }
        m6696i.put(valueOf, Integer.valueOf(i));
        this.f9247f += mo6706b;
        m6699f(this.f9246e);
    }
}
