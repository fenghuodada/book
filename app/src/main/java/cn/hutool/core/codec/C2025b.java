package cn.hutool.core.codec;

import java.io.Serializable;

/* renamed from: cn.hutool.core.codec.b */
/* loaded from: classes.dex */
public final class C2025b implements Serializable {

    /* renamed from: b */
    public static final byte[] f4895b = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: a */
    public final byte[] f4896a = new byte[256];

    public C2025b(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            this.f4896a[bArr[i]] = (byte) (i & 255);
        }
    }
}
