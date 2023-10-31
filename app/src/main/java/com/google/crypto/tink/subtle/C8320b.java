package com.google.crypto.tink.subtle;

import com.google.crypto.tink.InterfaceC8038a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.crypto.tink.subtle.b */
/* loaded from: classes3.dex */
public final class C8320b implements InterfaceC8038a {

    /* renamed from: e */
    public static final C8321a f16147e = new C8321a();

    /* renamed from: f */
    public static final C8322b f16148f = new C8322b();

    /* renamed from: a */
    public final byte[] f16149a;

    /* renamed from: b */
    public final byte[] f16150b;

    /* renamed from: c */
    public final SecretKeySpec f16151c;

    /* renamed from: d */
    public final int f16152d;

    /* renamed from: com.google.crypto.tink.subtle.b$a */
    /* loaded from: classes3.dex */
    public class C8321a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return C8336l.f16173e.m3426a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: com.google.crypto.tink.subtle.b$b */
    /* loaded from: classes3.dex */
    public class C8322b extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return C8336l.f16173e.m3426a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C8320b(byte[] bArr, int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f16152d = i;
        C8347s.m3418a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f16151c = secretKeySpec;
        Cipher cipher = f16147e.get();
        cipher.init(1, secretKeySpec);
        byte[] m3450c = m3450c(cipher.doFinal(new byte[16]));
        this.f16149a = m3450c;
        this.f16150b = m3450c(m3450c);
    }

    /* renamed from: c */
    public static byte[] m3450c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        bArr2[15] = (byte) ((bArr[15] << 1) ^ ((bArr[0] & 128) != 0 ? 135 : 0));
        return bArr2;
    }

    /* renamed from: e */
    public static byte[] m3448e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // com.google.crypto.tink.InterfaceC8038a
    /* renamed from: a */
    public final byte[] mo3428a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f16152d;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr3 = new byte[bArr.length + i + 16];
            byte[] m3419a = C8345r.m3419a(i);
            System.arraycopy(m3419a, 0, bArr3, 0, i);
            Cipher cipher = f16147e.get();
            SecretKeySpec secretKeySpec = this.f16151c;
            cipher.init(1, secretKeySpec);
            byte[] m3449d = m3449d(cipher, 0, m3419a, 0, m3419a.length);
            byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
            byte[] m3449d2 = m3449d(cipher, 1, bArr4, 0, bArr4.length);
            Cipher cipher2 = f16148f.get();
            cipher2.init(1, secretKeySpec, new IvParameterSpec(m3449d));
            cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f16152d);
            byte[] m3449d3 = m3449d(cipher, 2, bArr3, this.f16152d, bArr.length);
            int length2 = bArr.length + i;
            for (int i2 = 0; i2 < 16; i2++) {
                bArr3[length2 + i2] = (byte) ((m3449d2[i2] ^ m3449d[i2]) ^ m3449d3[i2]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // com.google.crypto.tink.InterfaceC8038a
    /* renamed from: b */
    public final byte[] mo3427b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f16152d;
        int i2 = (length - i) - 16;
        if (i2 >= 0) {
            Cipher cipher = f16147e.get();
            SecretKeySpec secretKeySpec = this.f16151c;
            cipher.init(1, secretKeySpec);
            byte[] m3449d = m3449d(cipher, 0, bArr, 0, this.f16152d);
            byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
            byte[] m3449d2 = m3449d(cipher, 1, bArr3, 0, bArr3.length);
            byte[] m3449d3 = m3449d(cipher, 2, bArr, this.f16152d, i2);
            int length2 = bArr.length - 16;
            byte b = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                b = (byte) (b | (((bArr[length2 + i3] ^ m3449d2[i3]) ^ m3449d[i3]) ^ m3449d3[i3]));
            }
            if (b == 0) {
                Cipher cipher2 = f16148f.get();
                cipher2.init(1, secretKeySpec, new IvParameterSpec(m3449d));
                return cipher2.doFinal(bArr, i, i2);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: d */
    public final byte[] m3449d(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] copyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        byte[] bArr3 = this.f16149a;
        if (i3 == 0) {
            return cipher.doFinal(m3448e(bArr2, bArr3));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            doFinal = cipher.doFinal(doFinal);
            i4 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            copyOf = m3448e(copyOfRange, bArr3);
        } else {
            copyOf = Arrays.copyOf(this.f16150b, 16);
            for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
        }
        return cipher.doFinal(m3448e(doFinal, copyOf));
    }
}
