package androidx.collection;

import java.util.Map;

/* renamed from: androidx.collection.c */
/* loaded from: classes.dex */
public final class C0471c extends AbstractC0476h<Object, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0472d f1491d;

    public C0471c(C0472d c0472d) {
        this.f1491d = c0472d;
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: a */
    public final void mo12417a() {
        this.f1491d.clear();
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: b */
    public final Object mo12416b(int i, int i2) {
        return this.f1491d.f1499b[i];
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: c */
    public final Map<Object, Object> mo12415c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: d */
    public final int mo12414d() {
        return this.f1491d.f1500c;
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: e */
    public final int mo12413e(Object obj) {
        return this.f1491d.indexOf(obj);
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: f */
    public final int mo12412f(Object obj) {
        return this.f1491d.indexOf(obj);
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: g */
    public final void mo12411g(Object obj, Object obj2) {
        this.f1491d.add(obj);
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: h */
    public final void mo12410h(int i) {
        this.f1491d.m12427k(i);
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: i */
    public final Object mo12409i(int i, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}
