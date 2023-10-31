package com.google.crypto.tink.subtle;

import androidx.constraintlayout.core.widgets.C0539e;
import androidx.constraintlayout.motion.widget.C0561g;
import com.google.crypto.tink.InterfaceC8073c;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.crypto.tink.subtle.d */
/* loaded from: classes3.dex */
public final class C8325d implements InterfaceC8073c {

    /* renamed from: c */
    public static final List f16155c = Arrays.asList(64);

    /* renamed from: d */
    public static final byte[] f16156d = new byte[16];

    /* renamed from: e */
    public static final byte[] f16157e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a */
    public final C8341o f16158a;

    /* renamed from: b */
    public final byte[] f16159b;

    public C8325d(byte[] bArr) throws GeneralSecurityException {
        if (f16155c.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f16159b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f16158a = new C8341o(copyOfRange);
            return;
        }
        throw new InvalidKeyException(C0539e.m12264b(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
    }

    @Override // com.google.crypto.tink.InterfaceC8073c
    /* renamed from: a */
    public final byte[] mo3446a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483631) {
            Cipher m3426a = C8336l.f16173e.m3426a("AES/CTR/NoPadding");
            byte[] m3444c = m3444c(bArr2, bArr);
            byte[] bArr3 = (byte[]) m3444c.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            m3426a.init(1, new SecretKeySpec(this.f16159b, "AES"), new IvParameterSpec(bArr3));
            return C8330f.m3441a(m3444c, m3426a.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // com.google.crypto.tink.InterfaceC8073c
    /* renamed from: b */
    public final byte[] mo3445b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean z;
        if (bArr.length >= 16) {
            Cipher m3426a = C8336l.f16173e.m3426a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            m3426a.init(2, new SecretKeySpec(this.f16159b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = m3426a.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null) {
                try {
                    Class.forName("android.app.Application", false, null);
                    z = true;
                } catch (Exception unused) {
                    z = false;
                }
                if (z) {
                    doFinal = new byte[0];
                }
            }
            if (C8330f.m3440b(copyOfRange, m3444c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    /* renamed from: c */
    public final byte[] m3444c(byte[]... bArr) throws GeneralSecurityException {
        byte[] m3437e;
        int length = bArr.length;
        C8341o c8341o = this.f16158a;
        if (length == 0) {
            return c8341o.mo3422a(16, f16157e);
        }
        byte[] mo3422a = c8341o.mo3422a(16, f16156d);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            mo3422a = C8330f.m3437e(C0561g.m12178e(mo3422a), c8341o.mo3422a(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length >= mo3422a.length) {
                int length2 = bArr3.length - mo3422a.length;
                m3437e = Arrays.copyOf(bArr3, bArr3.length);
                for (int i2 = 0; i2 < mo3422a.length; i2++) {
                    int i3 = length2 + i2;
                    m3437e[i3] = (byte) (m3437e[i3] ^ mo3422a[i2]);
                }
            } else {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
        } else if (bArr3.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr3, 16);
            copyOf[bArr3.length] = Byte.MIN_VALUE;
            m3437e = C8330f.m3437e(copyOf, C0561g.m12178e(mo3422a));
        } else {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        return c8341o.mo3422a(16, m3437e);
    }
}
