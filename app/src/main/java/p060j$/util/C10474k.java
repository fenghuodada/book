package p060j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.k */
/* loaded from: classes2.dex */
public final class C10474k {

    /* renamed from: c */
    private static final C10474k f20941c = new C10474k();

    /* renamed from: a */
    private final boolean f20942a;

    /* renamed from: b */
    private final double f20943b;

    private C10474k() {
        this.f20942a = false;
        this.f20943b = Double.NaN;
    }

    private C10474k(double d) {
        this.f20942a = true;
        this.f20943b = d;
    }

    /* renamed from: a */
    public static C10474k m836a() {
        return f20941c;
    }

    /* renamed from: d */
    public static C10474k m833d(double d) {
        return new C10474k(d);
    }

    /* renamed from: b */
    public final double m835b() {
        if (this.f20942a) {
            return this.f20943b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean m834c() {
        return this.f20942a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10474k) {
            C10474k c10474k = (C10474k) obj;
            boolean z = this.f20942a;
            if (z && c10474k.f20942a) {
                if (Double.compare(this.f20943b, c10474k.f20943b) == 0) {
                    return true;
                }
            } else if (z == c10474k.f20942a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f20942a) {
            long doubleToLongBits = Double.doubleToLongBits(this.f20943b);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
        return 0;
    }

    public final String toString() {
        return this.f20942a ? String.format("OptionalDouble[%s]", Double.valueOf(this.f20943b)) : "OptionalDouble.empty";
    }
}
