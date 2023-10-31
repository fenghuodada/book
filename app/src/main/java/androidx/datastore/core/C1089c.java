package androidx.datastore.core;

/* renamed from: androidx.datastore.core.c */
/* loaded from: classes.dex */
public final class C1089c<T> extends AbstractC1088b0<T> {

    /* renamed from: a */
    public final T f2795a;

    /* renamed from: b */
    public final int f2796b;

    public C1089c(T t, int i) {
        this.f2795a = t;
        this.f2796b = i;
    }

    /* renamed from: a */
    public final void m11203a() {
        T t = this.f2795a;
        if (!((t != null ? t.hashCode() : 0) == this.f2796b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }
}
