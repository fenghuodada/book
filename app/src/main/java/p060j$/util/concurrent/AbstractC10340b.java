package p060j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.b */
/* loaded from: classes2.dex */
public abstract class AbstractC10340b extends C10355q {

    /* renamed from: i */
    final ConcurrentHashMap f20790i;

    /* renamed from: j */
    C10351m f20791j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10340b(C10351m[] c10351mArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(c10351mArr, i, 0, i2);
        this.f20790i = concurrentHashMap;
        m967e();
    }

    public final boolean hasMoreElements() {
        return this.f20811b != null;
    }

    public final boolean hasNext() {
        return this.f20811b != null;
    }

    public final void remove() {
        C10351m c10351m = this.f20791j;
        if (c10351m == null) {
            throw new IllegalStateException();
        }
        this.f20791j = null;
        this.f20790i.m987i(c10351m.f20803b, null, null);
    }
}
