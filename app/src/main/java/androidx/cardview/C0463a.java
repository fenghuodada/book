package androidx.cardview;

import android.text.TextUtils;
import android.util.Log;
import com.ambrose.overwall.R;
import com.iab.omid.library.adcolony.C8708a;

/* renamed from: androidx.cardview.a */
/* loaded from: classes.dex */
public final class C0463a {

    /* renamed from: a */
    public static final int[] f1466a = {16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};

    /* renamed from: a */
    public static void m12440a(String str, Exception exc) {
        if (C8708a.f16522a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
        Log.e("OMIDLIB", str, exc);
    }

    /* renamed from: b */
    public static byte[] m12439b(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                int digit = Character.digit(str.charAt(i2), 16);
                int digit2 = Character.digit(str.charAt(i2 + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
                bArr[i] = (byte) ((digit * 16) + digit2);
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }

    /* renamed from: c */
    public static String m12438c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }
}
