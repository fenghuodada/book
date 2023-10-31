package p060j$.time.format;

import p060j$.time.temporal.EnumC10286a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.k */
/* loaded from: classes2.dex */
public final class C10264k implements InterfaceC10260g {

    /* renamed from: c */
    static final String[] f20629c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

    /* renamed from: d */
    static final C10264k f20630d = new C10264k("+HH:MM:ss", "Z");

    /* renamed from: a */
    private final String f20631a;

    /* renamed from: b */
    private final int f20632b;

    static {
        new C10264k("+HH:MM:ss", "0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10264k(String str, String str2) {
        int i = 0;
        while (true) {
            String[] strArr = f20629c;
            if (i >= 9) {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
            if (strArr[i].equals(str)) {
                this.f20632b = i;
                this.f20631a = str2;
                return;
            }
            i++;
        }
    }

    @Override // p060j$.time.format.InterfaceC10260g
    /* renamed from: a */
    public final boolean mo1132a(C10271r c10271r, StringBuilder sb) {
        Long m1108e = c10271r.m1108e(EnumC10286a.OFFSET_SECONDS);
        if (m1108e == null) {
            return false;
        }
        long longValue = m1108e.longValue();
        int i = (int) longValue;
        if (longValue == i) {
            if (i != 0) {
                int abs = Math.abs((i / 3600) % 100);
                int abs2 = Math.abs((i / 60) % 60);
                int abs3 = Math.abs(i % 60);
                int length = sb.length();
                sb.append(i < 0 ? "-" : "+");
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i2 = this.f20632b;
                if (i2 >= 3 || (i2 >= 1 && abs2 > 0)) {
                    int i3 = i2 % 2;
                    sb.append(i3 == 0 ? ":" : "");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    if (i2 >= 7 || (i2 >= 5 && abs3 > 0)) {
                        sb.append(i3 != 0 ? "" : ":");
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                }
                return true;
            }
            sb.append(this.f20631a);
            return true;
        }
        throw new ArithmeticException();
    }

    public final String toString() {
        String replace = this.f20631a.replace("'", "''");
        return "Offset(" + f20629c[this.f20632b] + ",'" + replace + "')";
    }
}
