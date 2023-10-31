package com.facebook.ads.redexgen.p036X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Gx */
/* loaded from: assets/audience_network.dex */
public final class C4914Gx {
    public static byte[] A00;
    public static String[] A01 = {"gehgTzpUAqg89EXiGGasdpNXUtk8k2dp", "VbYmpptfSIV8qdRodswF8V1n59zym7XK", "E44YX0wg", "TCU5yEG5ZIofchF4EQjDHlsQntmp46Yu", "EkmeYw2kQLbBECw2eANnaw7CzESY", "H", "OFssNajfj", "bi8IHmxX7dNFBPIWLmj9QBiFjZgAYPjN"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{60, 12, 11, 53, 27, 17, 49, 27, 17, 100, 31, 54, 99, 71, 15, 125, 51, 50, 98, 20};
    }

    static {
        A03();
    }

    public static C4918H1 A00(C4918H1 c4918h1, String[] strArr, Map<String, C4918H1> map) {
        if (c4918h1 == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (c4918h1 == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (c4918h1 == null && strArr.length > 1) {
            C4918H1 c4918h12 = new C4918H1();
            int length = strArr.length;
            while (i < length) {
                String id = strArr[i];
                c4918h12.A0E(map.get(id));
                i++;
            }
            return c4918h12;
        } else if (c4918h1 != null && strArr != null && strArr.length == 1) {
            return c4918h1.A0E(map.get(strArr[0]));
        } else {
            if (c4918h1 != null && strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c4918h1.A0E(map.get(strArr[i]));
                    i++;
                }
                return c4918h1;
            }
            return c4918h1;
        }
    }

    public static String A02(String str) {
        String A012 = A01(0, 1, 106);
        String replaceAll = str.replaceAll(A01(1, 2, 93), A012).replaceAll(A01(4, 5, 103), A012);
        String A013 = A01(3, 1, 73);
        return replaceAll.replaceAll(A012, A013).replaceAll(A01(9, 11, 99), A013);
    }

    public static void A04(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, int i, int i2, C4918H1 c4918h1) {
        if (c4918h1.A07() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(c4918h1.A07()), i, i2, 33);
        }
        if (c4918h1.A0P()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c4918h1.A0Q()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c4918h1.A0O()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(c4918h1.A05()), i, i2, 33);
        }
        if (c4918h1.A0N()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(c4918h1.A04()), i, i2, 33);
        }
        if (c4918h1.A0L() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(c4918h1.A0L()), i, i2, 33);
        }
        Layout.Alignment A08 = c4918h1.A08();
        String[] strArr = A01;
        if (strArr[0].charAt(0) == strArr[1].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "m";
        strArr2[2] = "ujiHtYdg";
        if (A08 != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(c4918h1.A08()), i, i2, 33);
        }
        int A06 = c4918h1.A06();
        if (A06 == 1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c4918h1.A03(), true), i, i2, 33);
        } else if (A06 == 2) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(c4918h1.A03()), i, i2, 33);
        } else if (A06 != 3) {
        } else {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(c4918h1.A03() / 100.0f), i, i2, 33);
        }
    }
}
