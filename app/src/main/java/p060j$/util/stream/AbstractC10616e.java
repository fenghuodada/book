package p060j$.util.stream;

/* renamed from: j$.util.stream.e */
/* loaded from: classes2.dex */
abstract class AbstractC10616e {

    /* renamed from: a */
    protected final int f21156a;

    /* renamed from: b */
    protected int f21157b;

    /* renamed from: c */
    protected int f21158c;

    /* renamed from: d */
    protected long[] f21159d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10616e() {
        this.f21156a = 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10616e(int i) {
        if (i >= 0) {
            this.f21156a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
            return;
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i);
    }

    public abstract void clear();

    public final long count() {
        int i = this.f21158c;
        return i == 0 ? this.f21157b : this.f21159d[i] + this.f21157b;
    }
}
