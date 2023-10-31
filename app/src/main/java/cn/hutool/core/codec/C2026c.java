package cn.hutool.core.codec;

import android.os.Bundle;
import cn.hutool.core.util.C2031b;
import com.vungle.warren.AdConfig;
import java.nio.charset.Charset;

/* renamed from: cn.hutool.core.codec.c */
/* loaded from: classes.dex */
public final class C2026c {
    /* renamed from: a */
    public static AdConfig m9722a(Bundle bundle, boolean z) {
        AdConfig adConfig = new AdConfig();
        adConfig.m1422d(z);
        if (bundle != null) {
            adConfig.m1422d(bundle.getBoolean("startMuted", z));
            adConfig.m1649h(bundle.getInt("ordinalViewCount", 0));
            adConfig.m1650g(bundle.getInt("adOrientation", 2));
        }
        return adConfig;
    }

    /* renamed from: b */
    public static String m9721b(String str) {
        return C2031b.m9714d(C2027d.m9719a(str), C2027d.f4897a);
    }

    /* renamed from: c */
    public static String m9720c(String str) {
        byte[] bArr;
        byte[] bArr2;
        byte b;
        Charset charset = C2028e.f4899a;
        byte[] m9717a = C2031b.m9717a(str, charset);
        if (m9717a == null) {
            bArr2 = null;
        } else {
            int length = m9717a.length;
            int i = 0;
            if (length == 0) {
                bArr2 = new byte[0];
            } else {
                int i2 = (length / 3) * 3;
                int i3 = length - 1;
                int i4 = (((i3 / 3) + 1) << 2) + 0;
                byte[] bArr3 = new byte[i4];
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    bArr = C2028e.f4900b;
                    if (i5 >= i2) {
                        break;
                    }
                    int i7 = i5 + 1;
                    int i8 = i7 + 1;
                    int i9 = ((m9717a[i5] & 255) << 16) | ((m9717a[i7] & 255) << 8);
                    int i10 = i8 + 1;
                    int i11 = i9 | (m9717a[i8] & 255);
                    int i12 = i6 + 1;
                    bArr3[i6] = bArr[(i11 >>> 18) & 63];
                    int i13 = i12 + 1;
                    bArr3[i12] = bArr[(i11 >>> 12) & 63];
                    int i14 = i13 + 1;
                    bArr3[i13] = bArr[(i11 >>> 6) & 63];
                    i6 = i14 + 1;
                    bArr3[i14] = bArr[i11 & 63];
                    i5 = i10;
                }
                int i15 = length - i2;
                if (i15 > 0) {
                    int i16 = (m9717a[i2] & 255) << 10;
                    if (i15 == 2) {
                        i = (m9717a[i3] & 255) << 2;
                    }
                    int i17 = i | i16;
                    bArr3[i4 - 4] = bArr[i17 >> 12];
                    bArr3[i4 - 3] = bArr[(i17 >>> 6) & 63];
                    int i18 = i4 - 2;
                    if (i15 == 2) {
                        b = bArr[i17 & 63];
                    } else {
                        b = 61;
                    }
                    bArr3[i18] = b;
                    bArr3[i4 - 1] = 61;
                }
                bArr2 = bArr3;
            }
        }
        return C2031b.m9714d(bArr2, charset);
    }
}
