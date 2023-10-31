package p060j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.m */
/* loaded from: classes2.dex */
public final class C10476m {

    /* renamed from: c */
    private static final C10476m f20947c = new C10476m();

    /* renamed from: a */
    private final boolean f20948a;

    /* renamed from: b */
    private final long f20949b;

    private C10476m() {
        this.f20948a = false;
        this.f20949b = 0L;
    }

    private C10476m(long j) {
        this.f20948a = true;
        this.f20949b = j;
    }

    /* renamed from: a */
    public static C10476m m828a() {
        return f20947c;
    }

    /* renamed from: d */
    public static C10476m m825d(long j) {
        return new C10476m(j);
    }

    /* renamed from: b */
    public final long m827b() {
        if (this.f20948a) {
            return this.f20949b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean m826c() {
        return this.f20948a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10476m) {
            C10476m c10476m = (C10476m) obj;
            boolean z = this.f20948a;
            if (z && c10476m.f20948a) {
                if (this.f20949b == c10476m.f20949b) {
                    return true;
                }
            } else if (z == c10476m.f20948a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f20948a) {
            long j = this.f20949b;
            return (int) (j ^ (j >>> 32));
        }
        return 0;
    }

    public final String toString() {
        return this.f20948a ? String.format("OptionalLong[%s]", Long.valueOf(this.f20949b)) : "OptionalLong.empty";
    }
}
