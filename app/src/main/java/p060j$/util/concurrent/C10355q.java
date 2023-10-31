package p060j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.q */
/* loaded from: classes2.dex */
public class C10355q {

    /* renamed from: a */
    C10351m[] f20810a;

    /* renamed from: b */
    C10351m f20811b = null;

    /* renamed from: c */
    C10354p f20812c;

    /* renamed from: d */
    C10354p f20813d;

    /* renamed from: e */
    int f20814e;

    /* renamed from: f */
    int f20815f;

    /* renamed from: g */
    int f20816g;

    /* renamed from: h */
    final int f20817h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10355q(C10351m[] c10351mArr, int i, int i2, int i3) {
        this.f20810a = c10351mArr;
        this.f20817h = i;
        this.f20814e = i2;
        this.f20815f = i2;
        this.f20816g = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final C10351m m967e() {
        C10351m[] c10351mArr;
        int length;
        int i;
        C10354p c10354p;
        C10351m c10351m = this.f20811b;
        if (c10351m != null) {
            c10351m = c10351m.f20805d;
        }
        while (c10351m == null) {
            if (this.f20815f >= this.f20816g || (c10351mArr = this.f20810a) == null || (length = c10351mArr.length) <= (i = this.f20814e) || i < 0) {
                this.f20811b = null;
                return null;
            }
            C10351m m983m = ConcurrentHashMap.m983m(c10351mArr, i);
            if (m983m == null || m983m.f20802a >= 0) {
                c10351m = m983m;
            } else if (m983m instanceof C10346h) {
                this.f20810a = ((C10346h) m983m).f20795e;
                C10354p c10354p2 = this.f20813d;
                if (c10354p2 != null) {
                    this.f20813d = c10354p2.f20809d;
                } else {
                    c10354p2 = new C10354p();
                }
                c10354p2.f20808c = c10351mArr;
                c10354p2.f20806a = length;
                c10354p2.f20807b = i;
                c10354p2.f20809d = this.f20812c;
                this.f20812c = c10354p2;
                c10351m = null;
            } else {
                c10351m = m983m instanceof C10356r ? ((C10356r) m983m).f20821f : null;
            }
            if (this.f20812c != null) {
                while (true) {
                    c10354p = this.f20812c;
                    if (c10354p == null) {
                        break;
                    }
                    int i2 = this.f20814e;
                    int i3 = c10354p.f20806a;
                    int i4 = i2 + i3;
                    this.f20814e = i4;
                    if (i4 < length) {
                        break;
                    }
                    this.f20814e = c10354p.f20807b;
                    this.f20810a = c10354p.f20808c;
                    c10354p.f20808c = null;
                    C10354p c10354p3 = c10354p.f20809d;
                    c10354p.f20809d = this.f20813d;
                    this.f20812c = c10354p3;
                    this.f20813d = c10354p;
                    length = i3;
                }
                if (c10354p == null) {
                    int i5 = this.f20814e + this.f20817h;
                    this.f20814e = i5;
                    if (i5 >= length) {
                        int i6 = this.f20815f + 1;
                        this.f20815f = i6;
                        this.f20814e = i6;
                    }
                }
            } else {
                int i7 = i + this.f20817h;
                this.f20814e = i7;
                if (i7 >= length) {
                    int i8 = this.f20815f + 1;
                    this.f20815f = i8;
                    this.f20814e = i8;
                }
            }
        }
        this.f20811b = c10351m;
        return c10351m;
    }
}
