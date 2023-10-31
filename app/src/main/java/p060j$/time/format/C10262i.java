package p060j$.time.format;

import p060j$.time.AbstractC10240a;
import p060j$.time.LocalDateTime;
import p060j$.time.ZoneOffset;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.InterfaceC10296k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.i */
/* loaded from: classes2.dex */
public final class C10262i implements InterfaceC10260g {
    @Override // p060j$.time.format.InterfaceC10260g
    /* renamed from: a */
    public final boolean mo1132a(C10271r c10271r, StringBuilder sb) {
        Long m1108e = c10271r.m1108e(EnumC10286a.INSTANT_SECONDS);
        InterfaceC10296k m1109d = c10271r.m1109d();
        EnumC10286a enumC10286a = EnumC10286a.NANO_OF_SECOND;
        Long valueOf = m1109d.mo1067b(enumC10286a) ? Long.valueOf(c10271r.m1109d().mo1066c(enumC10286a)) : null;
        int i = 0;
        if (m1108e == null) {
            return false;
        }
        long longValue = m1108e.longValue();
        int m1087e = enumC10286a.m1087e(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j = (longValue - 315569520000L) + 62167219200L;
            long m1160g = AbstractC10240a.m1160g(j, 315569520000L) + 1;
            LocalDateTime m1175i = LocalDateTime.m1175i(AbstractC10240a.m1162e(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (m1160g > 0) {
                sb.append('+');
                sb.append(m1160g);
            }
            sb.append(m1175i);
            if (m1175i.m1177g() == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime m1175i2 = LocalDateTime.m1175i(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(m1175i2);
            if (m1175i2.m1177g() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (m1175i2.m1176h() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (m1087e > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (m1087e <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = m1087e / i2;
                sb.append((char) (i3 + 48));
                m1087e -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
