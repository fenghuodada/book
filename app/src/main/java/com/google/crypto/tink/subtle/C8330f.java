package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.subtle.f */
/* loaded from: classes3.dex */
public final class C8330f {
    /* renamed from: a */
    public static byte[] m3441a(byte[]... bArr) throws GeneralSecurityException {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            if (i > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
            i2 += bArr4.length;
        }
        return bArr3;
    }

    /* renamed from: b */
    public static final boolean m3440b(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    /* renamed from: c */
    public static final void m3439c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* renamed from: d */
    public static final byte[] m3438d(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    /* renamed from: e */
    public static final byte[] m3437e(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return m3438d(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }
}
