package p060j$.time.format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import p060j$.time.temporal.C10302q;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.InterfaceC10297l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.h */
/* loaded from: classes2.dex */
public final class C10261h implements InterfaceC10260g {

    /* renamed from: a */
    private final InterfaceC10297l f20619a;

    /* renamed from: b */
    private final int f20620b;

    /* renamed from: c */
    private final int f20621c;

    /* renamed from: d */
    private final boolean f20622d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10261h(EnumC10286a enumC10286a) {
        if (enumC10286a == null) {
            throw new NullPointerException("field");
        }
        if (!enumC10286a.mo1061c().m1053f()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + enumC10286a);
        }
        this.f20619a = enumC10286a;
        this.f20620b = 0;
        this.f20621c = 9;
        this.f20622d = true;
    }

    @Override // p060j$.time.format.InterfaceC10260g
    /* renamed from: a */
    public final boolean mo1132a(C10271r c10271r, StringBuilder sb) {
        InterfaceC10297l interfaceC10297l = this.f20619a;
        Long m1108e = c10271r.m1108e(interfaceC10297l);
        if (m1108e == null) {
            return false;
        }
        C10273t m1111b = c10271r.m1111b();
        long longValue = m1108e.longValue();
        C10302q mo1061c = interfaceC10297l.mo1061c();
        mo1061c.m1057b(longValue, interfaceC10297l);
        BigDecimal valueOf = BigDecimal.valueOf(mo1061c.m1054e());
        BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(mo1061c.m1055d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        int scale = stripTrailingZeros.scale();
        boolean z = this.f20622d;
        int i = this.f20620b;
        if (scale != 0) {
            String substring = stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), i), this.f20621c), RoundingMode.FLOOR).toPlainString().substring(2);
            m1111b.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        } else if (i > 0) {
            if (z) {
                m1111b.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                m1111b.getClass();
                sb.append('0');
            }
            return true;
        } else {
            return true;
        }
    }

    public final String toString() {
        String str = this.f20622d ? ",DecimalPoint" : "";
        return "Fraction(" + this.f20619a + "," + this.f20620b + "," + this.f20621c + str + ")";
    }
}
