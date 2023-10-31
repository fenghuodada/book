package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.m1 */
/* loaded from: classes.dex */
public final class C0387m1 {

    /* renamed from: a */
    public int f1318a = 0;

    /* renamed from: b */
    public int f1319b = 0;

    /* renamed from: c */
    public int f1320c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f1321d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f1322e = 0;

    /* renamed from: f */
    public int f1323f = 0;

    /* renamed from: g */
    public boolean f1324g = false;

    /* renamed from: h */
    public boolean f1325h = false;

    /* renamed from: a */
    public final void m12566a(int i, int i2) {
        this.f1320c = i;
        this.f1321d = i2;
        this.f1325h = true;
        if (this.f1324g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1318a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1319b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1318a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1319b = i2;
        }
    }
}
