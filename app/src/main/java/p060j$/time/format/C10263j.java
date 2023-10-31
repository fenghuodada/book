package p060j$.time.format;

import okhttp3.internal.connection.RealConnection;
import p060j$.time.C10241b;
import p060j$.time.temporal.InterfaceC10297l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.j */
/* loaded from: classes2.dex */
public final class C10263j implements InterfaceC10260g {

    /* renamed from: f */
    static final long[] f20623f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS};

    /* renamed from: a */
    final InterfaceC10297l f20624a;

    /* renamed from: b */
    final int f20625b;

    /* renamed from: c */
    final int f20626c;

    /* renamed from: d */
    private final EnumC10275v f20627d;

    /* renamed from: e */
    final int f20628e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10263j(InterfaceC10297l interfaceC10297l, int i, int i2, EnumC10275v enumC10275v) {
        this.f20624a = interfaceC10297l;
        this.f20625b = i;
        this.f20626c = i2;
        this.f20627d = enumC10275v;
        this.f20628e = 0;
    }

    protected C10263j(InterfaceC10297l interfaceC10297l, int i, int i2, EnumC10275v enumC10275v, int i3) {
        this.f20624a = interfaceC10297l;
        this.f20625b = i;
        this.f20626c = i2;
        this.f20627d = enumC10275v;
        this.f20628e = i3;
    }

    @Override // p060j$.time.format.InterfaceC10260g
    /* renamed from: a */
    public final boolean mo1132a(C10271r c10271r, StringBuilder sb) {
        InterfaceC10297l interfaceC10297l = this.f20624a;
        Long m1108e = c10271r.m1108e(interfaceC10297l);
        if (m1108e == null) {
            return false;
        }
        long longValue = m1108e.longValue();
        C10273t m1111b = c10271r.m1111b();
        String l = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l.length();
        int i = this.f20626c;
        if (length > i) {
            throw new C10241b("Field " + interfaceC10297l + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i);
        }
        m1111b.getClass();
        int i2 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
        int i3 = this.f20625b;
        EnumC10275v enumC10275v = this.f20627d;
        if (i2 >= 0) {
            int i4 = AbstractC10257d.f20615a[enumC10275v.ordinal()];
            if (i4 == 1 ? !(i3 >= 19 || longValue < f20623f[i3]) : i4 == 2) {
                sb.append('+');
            }
        } else {
            int i5 = AbstractC10257d.f20615a[enumC10275v.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                sb.append('-');
            } else if (i5 == 4) {
                throw new C10241b("Field " + interfaceC10297l + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i6 = 0; i6 < i3 - l.length(); i6++) {
            sb.append('0');
        }
        sb.append(l);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C10263j m1134c() {
        return this.f20628e == -1 ? this : new C10263j(this.f20624a, this.f20625b, this.f20626c, this.f20627d, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final C10263j m1133d(int i) {
        return new C10263j(this.f20624a, this.f20625b, this.f20626c, this.f20627d, this.f20628e + i);
    }

    public final String toString() {
        EnumC10275v enumC10275v = this.f20627d;
        InterfaceC10297l interfaceC10297l = this.f20624a;
        int i = this.f20626c;
        int i2 = this.f20625b;
        if (i2 == 1 && i == 19 && enumC10275v == EnumC10275v.NORMAL) {
            return "Value(" + interfaceC10297l + ")";
        } else if (i2 == i && enumC10275v == EnumC10275v.NOT_NEGATIVE) {
            return "Value(" + interfaceC10297l + "," + i2 + ")";
        } else {
            return "Value(" + interfaceC10297l + "," + i2 + "," + i + "," + enumC10275v + ")";
        }
    }
}
