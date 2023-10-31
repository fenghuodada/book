package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Ul */
/* loaded from: assets/audience_network.dex */
public final class C5757Ul extends C4985I8 {
    public static byte[] A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{120, 86, 14, 75, 86, 29, 0, 23, 39, 81, 87, 82, 80, 37, 87, 81, 37, 29, 82, 80, 37, 87, 81, 37, 29, 82, 80, 37, 87, 15, 72, 37, 87, 28, 1, 22, 93, 107, 29, 27, 30, 28, 105, 27, 29, 105, 81, 30, 28, 105, 27, 29, 105, 81, 30, 28, 105, 27, 67, 7, 105, 27, 80, 77, 90, 17, 85, 35, 87, 111, 32, 34, 87, 37, 35, 87, 111, 32, 34, 87, 37, 35, 87, 111, 32, 34, 87, 37, 125, 56, 87, 37, 110, 115, 100, 47};
    }

    static {
        A07();
        A01 = Pattern.compile(A06(8, 29, 107), 32);
        A02 = Pattern.compile(A06(37, 29, 39), 32);
        A03 = Pattern.compile(A06(66, 30, 25), 32);
    }

    public C5757Ul(String str, long j, long j2, long j3, @Nullable File file) {
        super(str, j, j2, j3, file);
    }

    @Nullable
    public static C5757Ul A00(File file, C4989IC c4989ic) {
        String name = file.getName();
        if (!name.endsWith(A06(1, 7, 106))) {
            file = A05(file, c4989ic);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        Matcher matcher = A03.matcher(name);
        if (matcher.matches()) {
            long length = file.length();
            int id = Integer.parseInt(matcher.group(1));
            String A0C = c4989ic.A0C(id);
            if (A0C == null) {
                return null;
            }
            String key = matcher.group(2);
            long parseLong = Long.parseLong(key);
            String key2 = matcher.group(3);
            return new C5757Ul(A0C, parseLong, length, Long.parseLong(key2), file);
        }
        return null;
    }

    public static C5757Ul A01(String str, long j) {
        return new C5757Ul(str, j, -1L, -9223372036854775807L, null);
    }

    public static C5757Ul A02(String str, long j) {
        return new C5757Ul(str, j, -1L, -9223372036854775807L, null);
    }

    public static C5757Ul A03(String str, long j, long j2) {
        return new C5757Ul(str, j, j2, -9223372036854775807L, null);
    }

    public static File A04(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        String A06 = A06(0, 1, 68);
        sb.append(A06);
        sb.append(j);
        sb.append(A06);
        sb.append(j2);
        sb.append(A06(1, 7, 106));
        return new File(file, sb.toString());
    }

    @Nullable
    public static File A05(File file, C4989IC c4989ic) {
        String group;
        String name = file.getName();
        Matcher matcher = A02.matcher(name);
        if (matcher.matches()) {
            group = C5038Iz.A0O(matcher.group(1));
            if (group == null) {
                return null;
            }
        } else {
            matcher = A01.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            group = matcher.group(1);
        }
        File A04 = A04(file.getParentFile(), c4989ic.A08(group), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
        if (file.renameTo(A04)) {
            return A04;
        }
        return null;
    }

    public final C5757Ul A08(int i) {
        C4997IK.A04(this.A05);
        long now = System.currentTimeMillis();
        return new C5757Ul(this.A04, this.A02, this.A01, now, A04(this.A03.getParentFile(), i, this.A02, now));
    }
}
