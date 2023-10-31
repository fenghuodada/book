package androidx.databinding;

import cn.hutool.core.util.C2030a;
import cn.hutool.core.util.C2031b;
import java.nio.charset.Charset;

/* renamed from: androidx.databinding.a */
/* loaded from: classes.dex */
public class C1082a {

    /* renamed from: a */
    public static final int[] f2790a = {255, 255, 26, 27, 28, 29, 30, 31, 255, 255, 255, 255, 255, 255, 255, 255, 255, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 255, 255, 255, 255, 255, 255, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 255, 255, 255, 255, 255};

    /* renamed from: a */
    public static String m11204a(String str) {
        int i;
        Charset charset = C2030a.f4901a;
        int length = (str.length() * 5) / 8;
        byte[] bArr = new byte[length];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            int charAt = str.charAt(i4) - '0';
            if (charAt >= 0 && charAt < 80 && (i = f2790a[charAt]) != 255) {
                if (i2 <= 3) {
                    i2 = (i2 + 5) % 8;
                    if (i2 == 0) {
                        bArr[i3] = (byte) (i | bArr[i3]);
                        i3++;
                        if (i3 >= length) {
                            break;
                        }
                    } else {
                        bArr[i3] = (byte) ((i << (8 - i2)) | bArr[i3]);
                    }
                } else {
                    i2 = (i2 + 5) % 8;
                    bArr[i3] = (byte) (bArr[i3] | (i >>> i2));
                    i3++;
                    if (i3 >= length) {
                        break;
                    }
                    bArr[i3] = (byte) ((i << (8 - i2)) | bArr[i3]);
                }
            }
        }
        return C2031b.m9714d(bArr, charset);
    }
}
