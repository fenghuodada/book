package com.google.crypto.tink.subtle;

import androidx.constraintlayout.motion.widget.C0561g;
import com.google.crypto.tink.prf.InterfaceC8114a;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

@Immutable
/* renamed from: com.google.crypto.tink.subtle.o */
/* loaded from: classes3.dex */
public final class C8341o implements InterfaceC8114a {

    /* renamed from: a */
    public final SecretKeySpec f16177a;

    /* renamed from: b */
    public byte[] f16178b;

    /* renamed from: c */
    public byte[] f16179c;

    public C8341o(byte[] bArr) throws GeneralSecurityException {
        C8347s.m3418a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f16177a = secretKeySpec;
        Cipher m3426a = C8336l.f16173e.m3426a("AES/ECB/NoPadding");
        m3426a.init(1, secretKeySpec);
        byte[] m12178e = C0561g.m12178e(m3426a.doFinal(new byte[16]));
        this.f16178b = m12178e;
        this.f16179c = C0561g.m12178e(m12178e);
    }

    @Override // com.google.crypto.tink.prf.InterfaceC8114a
    /* renamed from: a */
    public final byte[] mo3422a(int i, byte[] bArr) throws GeneralSecurityException {
        byte[] m3437e;
        if (i <= 16) {
            Cipher m3426a = C8336l.f16173e.m3426a("AES/ECB/NoPadding");
            boolean z = true;
            m3426a.init(1, this.f16177a);
            int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
            if (max * 16 != bArr.length) {
                z = false;
            }
            if (z) {
                m3437e = C8330f.m3438d(bArr, (max - 1) * 16, this.f16178b, 0, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
                if (copyOfRange.length < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                    m3437e = C8330f.m3437e(copyOf, this.f16179c);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr2 = m3426a.doFinal(C8330f.m3438d(bArr2, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(m3426a.doFinal(C8330f.m3437e(m3437e, bArr2)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
