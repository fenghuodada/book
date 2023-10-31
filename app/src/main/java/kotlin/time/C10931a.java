package kotlin.time;

import androidx.core.p003os.C0740h;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C10877b;
import kotlin.ranges.C10878c;
import kotlin.ranges.C10881f;
import kotlin.ranges.C10882g;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.6")
@JvmInline
@WasExperimental(markerClass = {ExperimentalTime.class})
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1484:1\n38#1:1485\n38#1:1486\n38#1:1487\n38#1:1488\n38#1:1489\n672#1,2:1490\n689#1,2:1499\n163#2,6:1492\n1#3:1498\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1485\n40#1:1486\n458#1:1487\n478#1:1488\n651#1:1489\n968#1:1490,2\n1059#1:1499,2\n1010#1:1492,6\n*E\n"})
/* renamed from: kotlin.time.a */
/* loaded from: classes3.dex */
public final class C10931a implements Comparable<C10931a> {

    /* renamed from: b */
    public static final long f21477b;

    /* renamed from: c */
    public static final long f21478c;

    /* renamed from: d */
    public static final /* synthetic */ int f21479d = 0;

    /* renamed from: a */
    public final long f21480a;

    static {
        int i = C10932b.f21481a;
        f21477b = C10933c.m359a(4611686018427387903L);
        f21478c = C10933c.m359a(-4611686018427387903L);
    }

    /* renamed from: a */
    public static final long m363a(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (new C10881f(-4611686018426L, 4611686018426L).m414a(j5)) {
            long j6 = ((j5 * j3) + (j2 - (j4 * j3))) << 1;
            int i = C10932b.f21481a;
            return j6;
        }
        return C10933c.m359a(C10882g.m413a(j5));
    }

    /* renamed from: b */
    public static int m362b(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            return j < 0 ? -i : i;
        }
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        return i2 == 0 ? 0 : 1;
    }

    /* renamed from: c */
    public static final boolean m361c(long j) {
        return j == f21477b || j == f21478c;
    }

    /* renamed from: d */
    public static final long m360d(long j, @NotNull EnumC10934d unit) {
        EnumC10934d sourceUnit;
        C10843j.m430f(unit, "unit");
        if (j == f21477b) {
            return Long.MAX_VALUE;
        }
        if (j == f21478c) {
            return Long.MIN_VALUE;
        }
        boolean z = true;
        long j2 = j >> 1;
        if ((((int) j) & 1) != 0) {
            z = false;
        }
        if (z) {
            sourceUnit = EnumC10934d.NANOSECONDS;
        } else {
            sourceUnit = EnumC10934d.MILLISECONDS;
        }
        C10843j.m430f(sourceUnit, "sourceUnit");
        return unit.f21489a.convert(j2, sourceUnit.f21489a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C10931a c10931a) {
        return m362b(this.f21480a, c10931a.f21480a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10931a)) {
            return false;
        }
        if (this.f21480a != ((C10931a) obj).f21480a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f21480a;
        return (int) (j ^ (j >>> 32));
    }

    @NotNull
    public final String toString() {
        boolean z;
        boolean z2;
        int m360d;
        int m360d2;
        int m360d3;
        boolean z3;
        long j;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i2;
        int i3;
        String str;
        CharSequence charSequence;
        boolean z8;
        long j2 = this.f21480a;
        int i4 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i4 == 0) {
            return "0s";
        }
        if (j2 == f21477b) {
            return "Infinity";
        }
        if (j2 == f21478c) {
            return "-Infinity";
        }
        if (i4 < 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (i4 < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            j2 = (((int) j2) & 1) + ((-(j2 >> 1)) << 1);
            int i5 = C10932b.f21481a;
        }
        long m360d4 = m360d(j2, EnumC10934d.DAYS);
        if (m361c(j2)) {
            m360d = 0;
        } else {
            m360d = (int) (m360d(j2, EnumC10934d.HOURS) % 24);
        }
        if (m361c(j2)) {
            m360d2 = 0;
        } else {
            m360d2 = (int) (m360d(j2, EnumC10934d.MINUTES) % 60);
        }
        if (m361c(j2)) {
            m360d3 = 0;
        } else {
            m360d3 = (int) (m360d(j2, EnumC10934d.SECONDS) % 60);
        }
        if (m361c(j2)) {
            i = 0;
        } else {
            if ((((int) j2) & 1) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            long j3 = j2 >> 1;
            if (z3) {
                j = (j3 % 1000) * 1000000;
            } else {
                j = j3 % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
            }
            i = (int) j;
        }
        if (m360d4 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (m360d != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (m360d2 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (m360d3 == 0 && i == 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z4) {
            sb.append(m360d4);
            sb.append('d');
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (z5 || (z4 && (z6 || z7))) {
            int i6 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(m360d);
            sb.append('h');
            i2 = i6;
        }
        if (z6 || (z7 && (z5 || z4))) {
            int i7 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(m360d2);
            sb.append('m');
            i2 = i7;
        }
        if (z7) {
            int i8 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (m360d3 == 0 && !z4 && !z5 && !z6) {
                if (i >= 1000000) {
                    m360d3 = i / 1000000;
                    i %= 1000000;
                    i3 = 6;
                    str = "ms";
                } else if (i >= 1000) {
                    m360d3 = i / 1000;
                    i %= 1000;
                    str = "us";
                    i3 = 3;
                } else {
                    sb.append(i);
                    sb.append("ns");
                    i2 = i8;
                }
            } else {
                i3 = 9;
                str = "s";
            }
            sb.append(m360d3);
            if (i != 0) {
                sb.append('.');
                String valueOf = String.valueOf(i);
                C10843j.m430f(valueOf, "<this>");
                if (i3 >= 0) {
                    if (i3 <= valueOf.length()) {
                        charSequence = valueOf.subSequence(0, valueOf.length());
                    } else {
                        StringBuilder sb2 = new StringBuilder(i3);
                        C10878c c10878c = new C10878c(1, i3 - valueOf.length());
                        C10877b c10877b = new C10877b(1, c10878c.f21423b, c10878c.f21424c);
                        while (c10877b.f21427c) {
                            c10877b.nextInt();
                            sb2.append('0');
                        }
                        sb2.append((CharSequence) valueOf);
                        charSequence = sb2;
                    }
                    String obj = charSequence.toString();
                    int i9 = -1;
                    int length = obj.length() - 1;
                    if (length >= 0) {
                        while (true) {
                            int i10 = length - 1;
                            if (obj.charAt(length) != '0') {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                i9 = length;
                                break;
                            } else if (i10 < 0) {
                                break;
                            } else {
                                length = i10;
                            }
                        }
                    }
                    int i11 = i9 + 1;
                    if (i11 >= 3) {
                        i11 = ((i11 + 2) / 3) * 3;
                    }
                    sb.append((CharSequence) obj, 0, i11);
                } else {
                    throw new IllegalArgumentException(C0740h.m11849a("Desired length ", i3, " is less than zero."));
                }
            }
            sb.append(str);
            i2 = i8;
        }
        if (z && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb3 = sb.toString();
        C10843j.m431e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
