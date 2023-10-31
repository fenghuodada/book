package p060j$.time;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* renamed from: j$.time.Duration */
/* loaded from: classes2.dex */
public final class Duration implements Comparable<Duration>, Serializable {

    /* renamed from: c */
    public static final Duration f20575c = new Duration(0, 0);

    /* renamed from: a */
    private final long f20576a;

    /* renamed from: b */
    private final int f20577b;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private Duration(long j, int i) {
        this.f20576a = j;
        this.f20577b = i;
    }

    /* renamed from: a */
    private static Duration m1187a(long j, int i) {
        return (((long) i) | j) == 0 ? f20575c : new Duration(j, i);
    }

    /* renamed from: b */
    public static Duration m1186b(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return m1187a(j2, i);
    }

    /* renamed from: c */
    public static Duration m1185c() {
        return m1187a(AbstractC10240a.m1163d(Long.MAX_VALUE, AbstractC10240a.m1160g(999999999L, 1000000000L)), (int) AbstractC10240a.m1162e(999999999L, 1000000000L));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int compare = Long.compare(this.f20576a, duration2.f20576a);
        return compare != 0 ? compare : this.f20577b - duration2.f20577b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            return this.f20576a == duration.f20576a && this.f20577b == duration.f20577b;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f20576a;
        return (this.f20577b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public long toMillis() {
        return AbstractC10240a.m1163d(AbstractC10240a.m1161f(this.f20576a), this.f20577b / 1000000);
    }

    public final String toString() {
        if (this == f20575c) {
            return "PT0S";
        }
        long j = this.f20576a;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        int i3 = this.f20577b;
        if (i2 == 0 && i3 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || i3 <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (i3 > 0) {
            int length = sb.length();
            sb.append(i2 < 0 ? 2000000000 - i3 : i3 + 1000000000);
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
