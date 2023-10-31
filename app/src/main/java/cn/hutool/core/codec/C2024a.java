package cn.hutool.core.codec;

import cn.hutool.core.util.C2030a;
import cn.hutool.core.util.C2031b;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* renamed from: cn.hutool.core.codec.a */
/* loaded from: classes.dex */
public final class C2024a {

    /* renamed from: a */
    public static final Charset f4893a = C2030a.f4901a;

    /* renamed from: b */
    public static final C2025b f4894b = new C2025b(C2025b.f4895b);

    /* renamed from: a */
    public static String m9723a(CharSequence charSequence) {
        boolean z;
        Charset charset = f4893a;
        byte[] m9717a = C2031b.m9717a(charSequence, charset);
        C2025b c2025b = f4894b;
        c2025b.getClass();
        int length = m9717a.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < m9717a.length; i++) {
            bArr[i] = c2025b.f4896a[m9717a[i]];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) Math.ceil((Math.log(62) / Math.log(256)) * length));
        byte[] bArr2 = bArr;
        while (bArr2.length > 0) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(bArr2.length);
            int i2 = 0;
            int i3 = 0;
            while (i2 < bArr2.length) {
                int i4 = (i3 * 62) + (bArr2[i2] & 255);
                int i5 = i4 % 256;
                int i6 = (i4 - i5) / 256;
                if (byteArrayOutputStream2.size() > 0 || i6 > 0) {
                    byteArrayOutputStream2.write(i6);
                }
                i2++;
                i3 = i5;
            }
            byteArrayOutputStream.write(i3);
            bArr2 = byteArrayOutputStream2.toByteArray();
        }
        for (int i7 = 0; i7 < length - 1 && bArr[i7] == 0; i7++) {
            byteArrayOutputStream.write(0);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length2 = byteArray.length;
        if (byteArray.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int min = Math.min(byteArray.length, length2) - 1;
            for (int max = Math.max(0, 0); min > max; max++) {
                byte b = byteArray[min];
                byteArray[min] = byteArray[max];
                byteArray[max] = b;
                min--;
            }
        }
        return C2031b.m9714d(byteArray, charset);
    }
}
