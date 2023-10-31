package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.crypto.tink.subtle.h */
/* loaded from: classes3.dex */
public abstract class AbstractC8332h implements InterfaceC8340n {

    /* renamed from: c */
    public static final int[] f16163c = m3430k(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    public final int[] f16164a;

    /* renamed from: b */
    public final int f16165b;

    public AbstractC8332h(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f16164a = m3430k(bArr);
        this.f16165b = i;
    }

    /* renamed from: i */
    public static void m3432i(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 >>> (-16)) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 >>> (-12)) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 >>> (-8)) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 >>> (-7)) | (i15 << 7);
    }

    /* renamed from: j */
    public static void m3431j(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            m3432i(0, 4, 8, 12, iArr);
            m3432i(1, 5, 9, 13, iArr);
            m3432i(2, 6, 10, 14, iArr);
            m3432i(3, 7, 11, 15, iArr);
            m3432i(0, 5, 10, 15, iArr);
            m3432i(1, 6, 11, 12, iArr);
            m3432i(2, 7, 8, 13, iArr);
            m3432i(3, 4, 9, 14, iArr);
        }
    }

    /* renamed from: k */
    public static int[] m3430k(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    @Override // com.google.crypto.tink.subtle.InterfaceC8340n
    /* renamed from: a */
    public final byte[] mo3424a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length <= Integer.MAX_VALUE - mo3414g()) {
            ByteBuffer allocate = ByteBuffer.allocate(mo3414g() + bArr.length);
            m3434f(bArr, allocate);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // com.google.crypto.tink.subtle.InterfaceC8340n
    /* renamed from: b */
    public final byte[] mo3423b(byte[] bArr) throws GeneralSecurityException {
        return m3435e(ByteBuffer.wrap(bArr));
    }

    /* renamed from: c */
    public final ByteBuffer m3436c(int i, byte[] bArr) {
        int[] mo3415d = mo3415d(i, m3430k(bArr));
        int[] iArr = (int[]) mo3415d.clone();
        m3431j(iArr);
        for (int i2 = 0; i2 < mo3415d.length; i2++) {
            mo3415d[i2] = mo3415d[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(mo3415d, 0, 16);
        return order;
    }

    /* renamed from: d */
    public abstract int[] mo3415d(int i, int[] iArr);

    /* renamed from: e */
    public final byte[] m3435e(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= mo3414g()) {
            byte[] bArr = new byte[mo3414g()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            m3433h(bArr, allocate, byteBuffer);
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: f */
    public final void m3434f(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() - mo3414g() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] m3419a = C8345r.m3419a(mo3414g());
        byteBuffer.put(m3419a);
        m3433h(m3419a, byteBuffer, ByteBuffer.wrap(bArr));
    }

    /* renamed from: g */
    public abstract int mo3414g();

    /* renamed from: h */
    public final void m3433h(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        int remaining = byteBuffer2.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer m3436c = m3436c(this.f16165b + i2, bArr);
            if (i2 == i - 1) {
                C8330f.m3439c(byteBuffer, byteBuffer2, m3436c, remaining % 64);
            } else {
                C8330f.m3439c(byteBuffer, byteBuffer2, m3436c, 64);
            }
        }
    }
}
