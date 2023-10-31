package p060j$.time.temporal;

import java.io.Serializable;
import p060j$.time.C10241b;

/* renamed from: j$.time.temporal.q */
/* loaded from: classes2.dex */
public final class C10302q implements Serializable {

    /* renamed from: a */
    private final long f20696a;

    /* renamed from: b */
    private final long f20697b;

    /* renamed from: c */
    private final long f20698c;

    /* renamed from: d */
    private final long f20699d;

    private C10302q(long j, long j2, long j3, long j4) {
        this.f20696a = j;
        this.f20697b = j2;
        this.f20698c = j3;
        this.f20699d = j4;
    }

    /* renamed from: c */
    private String m1056c(long j, InterfaceC10297l interfaceC10297l) {
        if (interfaceC10297l == null) {
            return "Invalid value (valid values " + this + "): " + j;
        }
        return "Invalid value for " + interfaceC10297l + " (valid values " + this + "): " + j;
    }

    /* renamed from: i */
    public static C10302q m1050i(long j, long j2) {
        if (j <= j2) {
            return new C10302q(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* renamed from: j */
    public static C10302q m1049j(long j, long j2) {
        if (j <= j2) {
            if (1 <= j2) {
                return new C10302q(1L, 1L, j, j2);
            }
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
    }

    /* renamed from: a */
    public final int m1058a(long j, InterfaceC10297l interfaceC10297l) {
        if (m1052g() && m1051h(j)) {
            return (int) j;
        }
        throw new C10241b(m1056c(j, interfaceC10297l));
    }

    /* renamed from: b */
    public final void m1057b(long j, InterfaceC10297l interfaceC10297l) {
        if (!m1051h(j)) {
            throw new C10241b(m1056c(j, interfaceC10297l));
        }
    }

    /* renamed from: d */
    public final long m1055d() {
        return this.f20699d;
    }

    /* renamed from: e */
    public final long m1054e() {
        return this.f20696a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10302q) {
            C10302q c10302q = (C10302q) obj;
            return this.f20696a == c10302q.f20696a && this.f20697b == c10302q.f20697b && this.f20698c == c10302q.f20698c && this.f20699d == c10302q.f20699d;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m1053f() {
        return this.f20696a == this.f20697b && this.f20698c == this.f20699d;
    }

    /* renamed from: g */
    public final boolean m1052g() {
        return this.f20696a >= -2147483648L && this.f20699d <= 2147483647L;
    }

    /* renamed from: h */
    public final boolean m1051h(long j) {
        return j >= this.f20696a && j <= this.f20699d;
    }

    public final int hashCode() {
        long j = this.f20697b;
        long j2 = this.f20696a + (j << 16) + (j >> 48);
        long j3 = this.f20698c;
        long j4 = j2 + (j3 << 32) + (j3 >> 32);
        long j5 = this.f20699d;
        long j6 = j4 + (j5 << 48) + (j5 >> 16);
        return (int) ((j6 >>> 32) ^ j6);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.f20696a;
        sb.append(j);
        long j2 = this.f20697b;
        if (j != j2) {
            sb.append('/');
            sb.append(j2);
        }
        sb.append(" - ");
        long j3 = this.f20698c;
        sb.append(j3);
        long j4 = this.f20699d;
        if (j3 != j4) {
            sb.append('/');
            sb.append(j4);
        }
        return sb.toString();
    }
}
