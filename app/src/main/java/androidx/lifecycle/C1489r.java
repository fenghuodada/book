package androidx.lifecycle;

/* renamed from: androidx.lifecycle.r */
/* loaded from: classes.dex */
public class C1489r<T> extends LiveData<T> {
    public C1489r() {
    }

    public C1489r(Boolean bool) {
        super(bool);
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: i */
    public void mo10510i(T t) {
        LiveData.m10576a("setValue");
        this.f3389g++;
        this.f3387e = t;
        m10574c(null);
    }
}
