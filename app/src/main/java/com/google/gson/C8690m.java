package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.gson.m */
/* loaded from: classes3.dex */
public final class C8690m extends AbstractC8692o implements Iterable<AbstractC8692o> {

    /* renamed from: a */
    public final ArrayList f16514a;

    public C8690m() {
        this.f16514a = new ArrayList();
    }

    public C8690m(int i) {
        this.f16514a = new ArrayList(i);
    }

    @Override // com.google.gson.AbstractC8692o
    /* renamed from: a */
    public final AbstractC8692o mo3208a() {
        ArrayList arrayList = this.f16514a;
        if (arrayList.isEmpty()) {
            return new C8690m();
        }
        C8690m c8690m = new C8690m(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c8690m.m3224r(((AbstractC8692o) it.next()).mo3208a());
        }
        return c8690m;
    }

    @Override // com.google.gson.AbstractC8692o
    /* renamed from: b */
    public final boolean mo3207b() {
        ArrayList arrayList = this.f16514a;
        if (arrayList.size() == 1) {
            return ((AbstractC8692o) arrayList.get(0)).mo3207b();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C8690m) && ((C8690m) obj).f16514a.equals(this.f16514a));
    }

    public final int hashCode() {
        return this.f16514a.hashCode();
    }

    @Override // com.google.gson.AbstractC8692o
    /* renamed from: i */
    public final double mo3206i() {
        ArrayList arrayList = this.f16514a;
        if (arrayList.size() == 1) {
            return ((AbstractC8692o) arrayList.get(0)).mo3206i();
        }
        throw new IllegalStateException();
    }

    @Override // java.lang.Iterable
    public final Iterator<AbstractC8692o> iterator() {
        return this.f16514a.iterator();
    }

    @Override // com.google.gson.AbstractC8692o
    /* renamed from: j */
    public final float mo3205j() {
        ArrayList arrayList = this.f16514a;
        if (arrayList.size() == 1) {
            return ((AbstractC8692o) arrayList.get(0)).mo3205j();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.AbstractC8692o
    /* renamed from: k */
    public final int mo3204k() {
        ArrayList arrayList = this.f16514a;
        if (arrayList.size() == 1) {
            return ((AbstractC8692o) arrayList.get(0)).mo3204k();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.AbstractC8692o
    /* renamed from: o */
    public final long mo3203o() {
        ArrayList arrayList = this.f16514a;
        if (arrayList.size() == 1) {
            return ((AbstractC8692o) arrayList.get(0)).mo3203o();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.AbstractC8692o
    /* renamed from: p */
    public final String mo3202p() {
        ArrayList arrayList = this.f16514a;
        if (arrayList.size() == 1) {
            return ((AbstractC8692o) arrayList.get(0)).mo3202p();
        }
        throw new IllegalStateException();
    }

    /* renamed from: r */
    public final void m3224r(AbstractC8692o abstractC8692o) {
        if (abstractC8692o == null) {
            abstractC8692o = C8694q.f16515a;
        }
        this.f16514a.add(abstractC8692o);
    }

    /* renamed from: s */
    public final void m3223s(String str) {
        this.f16514a.add(str == null ? C8694q.f16515a : new C8700u(str));
    }

    public final int size() {
        return this.f16514a.size();
    }

    /* renamed from: t */
    public final AbstractC8692o m3222t(int i) {
        return (AbstractC8692o) this.f16514a.get(i);
    }
}
