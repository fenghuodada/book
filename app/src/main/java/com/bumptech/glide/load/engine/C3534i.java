package com.bumptech.glide.load.engine;

import com.bumptech.glide.C3424g;
import com.bumptech.glide.C3433j;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.InterfaceC3585m;
import com.bumptech.glide.load.engine.RunnableC3535j;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.load.resource.C3770i;
import com.bumptech.glide.provider.C3815c;
import com.bumptech.glide.util.C3859i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.i */
/* loaded from: classes.dex */
public final class C3534i<Transcode> {

    /* renamed from: a */
    public final ArrayList f9337a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f9338b = new ArrayList();

    /* renamed from: c */
    public C3424g f9339c;

    /* renamed from: d */
    public Object f9340d;

    /* renamed from: e */
    public int f9341e;

    /* renamed from: f */
    public int f9342f;

    /* renamed from: g */
    public Class<?> f9343g;

    /* renamed from: h */
    public RunnableC3535j.InterfaceC3539d f9344h;

    /* renamed from: i */
    public C3581i f9345i;

    /* renamed from: j */
    public Map<Class<?>, InterfaceC3585m<?>> f9346j;

    /* renamed from: k */
    public Class<Transcode> f9347k;

    /* renamed from: l */
    public boolean f9348l;

    /* renamed from: m */
    public boolean f9349m;

    /* renamed from: n */
    public InterfaceC3577g f9350n;

    /* renamed from: o */
    public EnumC3432i f9351o;

    /* renamed from: p */
    public AbstractC3543m f9352p;

    /* renamed from: q */
    public boolean f9353q;

    /* renamed from: r */
    public boolean f9354r;

    /* renamed from: a */
    public final ArrayList m6669a() {
        boolean z = this.f9349m;
        ArrayList arrayList = this.f9338b;
        if (!z) {
            this.f9349m = true;
            arrayList.clear();
            ArrayList m6668b = m6668b();
            int size = m6668b.size();
            for (int i = 0; i < size; i++) {
                InterfaceC3627o.C3628a c3628a = (InterfaceC3627o.C3628a) m6668b.get(i);
                if (!arrayList.contains(c3628a.f9565a)) {
                    arrayList.add(c3628a.f9565a);
                }
                int i2 = 0;
                while (true) {
                    List<InterfaceC3577g> list = c3628a.f9566b;
                    if (i2 < list.size()) {
                        if (!arrayList.contains(list.get(i2))) {
                            arrayList.add(list.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final ArrayList m6668b() {
        boolean z = this.f9348l;
        ArrayList arrayList = this.f9337a;
        if (!z) {
            this.f9348l = true;
            arrayList.clear();
            List m6741g = this.f9339c.f9077b.m6741g(this.f9340d);
            int size = m6741g.size();
            for (int i = 0; i < size; i++) {
                InterfaceC3627o.C3628a mo6573b = ((InterfaceC3627o) m6741g.get(i)).mo6573b(this.f9340d, this.f9341e, this.f9342f, this.f9345i);
                if (mo6573b != null) {
                    arrayList.add(mo6573b);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final <Data> C3570v<Data, ?, Transcode> m6667c(Class<Data> cls) {
        C3570v<Data, ?, Transcode> c3570v;
        C3433j c3433j = this.f9339c.f9077b;
        Class<?> cls2 = this.f9343g;
        Class cls3 = this.f9347k;
        C3815c c3815c = c3433j.f9147i;
        C3570v<Data, ?, Transcode> c3570v2 = null;
        C3859i andSet = c3815c.f9837b.getAndSet(null);
        if (andSet == null) {
            andSet = new C3859i();
        }
        andSet.f9953a = cls;
        andSet.f9954b = cls2;
        andSet.f9955c = cls3;
        synchronized (c3815c.f9836a) {
            c3570v = (C3570v<Data, ?, Transcode>) c3815c.f9836a.getOrDefault(andSet, null);
        }
        c3815c.f9837b.set(andSet);
        c3433j.f9147i.getClass();
        if (C3815c.f9835c.equals(c3570v)) {
            return null;
        }
        if (c3570v == null) {
            ArrayList m6743e = c3433j.m6743e(cls, cls2, cls3);
            if (!m6743e.isEmpty()) {
                c3570v2 = new C3570v<>(cls, cls2, cls3, m6743e, c3433j.f9148j);
            }
            c3433j.f9147i.m6476a(cls, cls2, cls3, c3570v2);
            return c3570v2;
        }
        return c3570v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        r1 = (com.bumptech.glide.load.InterfaceC3447d<X>) r3.f9833b;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <X> com.bumptech.glide.load.InterfaceC3447d<X> m6666d(X r6) throws com.bumptech.glide.C3433j.C3438e {
        /*
            r5 = this;
            com.bumptech.glide.g r0 = r5.f9339c
            com.bumptech.glide.j r0 = r0.f9077b
            com.bumptech.glide.provider.a r0 = r0.f9140b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.f9831a     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L38
        L11:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.provider.a$a r3 = (com.bumptech.glide.provider.C3812a.C3813a) r3     // Catch: java.lang.Throwable -> L38
            java.lang.Class<T> r4 = r3.f9832a     // Catch: java.lang.Throwable -> L38
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L11
            com.bumptech.glide.load.d<T> r1 = r3.f9833b     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)
            goto L2b
        L29:
            monitor-exit(r0)
            r1 = 0
        L2b:
            if (r1 == 0) goto L2e
            return r1
        L2e:
            com.bumptech.glide.j$e r0 = new com.bumptech.glide.j$e
            java.lang.Class r6 = r6.getClass()
            r0.<init>(r6)
            throw r0
        L38:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C3534i.m6666d(java.lang.Object):com.bumptech.glide.load.d");
    }

    /* renamed from: e */
    public final <Z> InterfaceC3585m<Z> m6665e(Class<Z> cls) {
        InterfaceC3585m<Z> interfaceC3585m = (InterfaceC3585m<Z>) this.f9346j.get(cls);
        if (interfaceC3585m == null) {
            Iterator<Map.Entry<Class<?>, InterfaceC3585m<?>>> it = this.f9346j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, InterfaceC3585m<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    interfaceC3585m = (InterfaceC3585m<Z>) next.getValue();
                    break;
                }
            }
        }
        if (interfaceC3585m == null) {
            if (this.f9346j.isEmpty() && this.f9353q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return C3770i.f9784b;
        }
        return interfaceC3585m;
    }
}
