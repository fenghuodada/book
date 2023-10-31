package androidx.collection;

import java.util.Map;

/* renamed from: androidx.collection.a */
/* loaded from: classes.dex */
public final class C0469a extends AbstractC0476h<Object, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0470b f1489d;

    public C0469a(C0470b c0470b) {
        this.f1489d = c0470b;
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: a */
    public final void mo12417a() {
        this.f1489d.clear();
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: b */
    public final Object mo12416b(int i, int i2) {
        return this.f1489d.f1530b[(i << 1) + i2];
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: c */
    public final Map<Object, Object> mo12415c() {
        return this.f1489d;
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: d */
    public final int mo12414d() {
        return this.f1489d.f1531c;
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: e */
    public final int mo12413e(Object obj) {
        return this.f1489d.m12401e(obj);
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: f */
    public final int mo12412f(Object obj) {
        return this.f1489d.m12399g(obj);
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: g */
    public final void mo12411g(Object obj, Object obj2) {
        this.f1489d.put(obj, obj2);
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: h */
    public final void mo12410h(int i) {
        this.f1489d.mo6416j(i);
    }

    @Override // androidx.collection.AbstractC0476h
    /* renamed from: i */
    public final Object mo12409i(int i, Object obj) {
        return this.f1489d.mo6415k(i, obj);
    }
}
