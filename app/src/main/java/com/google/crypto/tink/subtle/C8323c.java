package com.google.crypto.tink.subtle;

import com.google.crypto.tink.InterfaceC8038a;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.crypto.tink.subtle.c */
/* loaded from: classes3.dex */
public final class C8323c implements InterfaceC8038a {

    /* renamed from: b */
    public static final C8324a f16153b = new C8324a();

    /* renamed from: a */
    public final SecretKeySpec f16154a;

    /* renamed from: com.google.crypto.tink.subtle.c$a */
    /* loaded from: classes3.dex */
    public class C8324a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return C8336l.f16173e.m3426a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C8323c(byte[] bArr) throws GeneralSecurityException {
        C8347s.m3418a(bArr.length);
        this.f16154a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: c */
    public static AlgorithmParameterSpec m3447c(byte[] bArr, int i) throws GeneralSecurityException {
        boolean z;
        int i2;
        try {
            Class.forName("android.app.Application", false, null);
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            try {
                i2 = Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused2) {
                i2 = -1;
            }
            if (i2 <= 19) {
                return new IvParameterSpec(bArr, 0, i);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, i);
    }

    @Override // com.google.crypto.tink.InterfaceC8038a
    /* renamed from: a */
    public final byte[] mo3428a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 12 + 16];
            byte[] m3419a = C8345r.m3419a(12);
            System.arraycopy(m3419a, 0, bArr3, 0, 12);
            AlgorithmParameterSpec m3447c = m3447c(m3419a, m3419a.length);
            C8324a c8324a = f16153b;
            c8324a.get().init(1, this.f16154a, m3447c);
            if (bArr2 != null && bArr2.length != 0) {
                c8324a.get().updateAAD(bArr2);
            }
            int doFinal = c8324a.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // com.google.crypto.tink.InterfaceC8038a
    /* renamed from: b */
    public final byte[] mo3427b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec m3447c = m3447c(bArr, 12);
            C8324a c8324a = f16153b;
            c8324a.get().init(2, this.f16154a, m3447c);
            if (bArr2 != null && bArr2.length != 0) {
                c8324a.get().updateAAD(bArr2);
            }
            return c8324a.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
