package com.google.crypto.tink.subtle;

import androidx.appcompat.view.menu.C0235r;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.crypto.tink.subtle.a */
/* loaded from: classes3.dex */
public final class C8318a implements InterfaceC8340n {

    /* renamed from: d */
    public static final C8319a f16143d = new C8319a();

    /* renamed from: a */
    public final SecretKeySpec f16144a;

    /* renamed from: b */
    public final int f16145b;

    /* renamed from: c */
    public final int f16146c;

    /* renamed from: com.google.crypto.tink.subtle.a$a */
    /* loaded from: classes3.dex */
    public class C8319a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return C8336l.f16173e.m3426a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C8318a(byte[] bArr, int i) throws GeneralSecurityException {
        C8347s.m3418a(bArr.length);
        this.f16144a = new SecretKeySpec(bArr, "AES");
        int blockSize = f16143d.get().getBlockSize();
        this.f16146c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f16145b = i;
    }

    @Override // com.google.crypto.tink.subtle.InterfaceC8340n
    /* renamed from: a */
    public final byte[] mo3424a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f16145b;
        int i2 = Integer.MAX_VALUE - i;
        if (length <= i2) {
            byte[] bArr2 = new byte[bArr.length + i];
            byte[] m3419a = C8345r.m3419a(i);
            System.arraycopy(m3419a, 0, bArr2, 0, i);
            m3451c(bArr, 0, bArr.length, bArr2, this.f16145b, m3419a, true);
            return bArr2;
        }
        throw new GeneralSecurityException(C0235r.m12816a("plaintext length can not exceed ", i2));
    }

    @Override // com.google.crypto.tink.subtle.InterfaceC8340n
    /* renamed from: b */
    public final byte[] mo3423b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f16145b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int length2 = bArr.length;
            int i2 = this.f16145b;
            byte[] bArr3 = new byte[length2 - i2];
            m3451c(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: c */
    public final void m3451c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = f16143d.get();
        byte[] bArr4 = new byte[this.f16146c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f16145b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        cipher.init(z ? 1 : 2, this.f16144a, ivParameterSpec);
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
