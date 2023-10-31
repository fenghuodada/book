package com.google.crypto.tink.aead.subtle;

import com.google.crypto.tink.InterfaceC8038a;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.subtle.C8336l;
import com.google.crypto.tink.subtle.C8345r;
import com.google.crypto.tink.subtle.C8347s;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

@Alpha
/* renamed from: com.google.crypto.tink.aead.subtle.a */
/* loaded from: classes3.dex */
public final class C8070a implements InterfaceC8038a {

    /* renamed from: b */
    public static final C8071a f15863b = new C8071a();

    /* renamed from: a */
    public final SecretKeySpec f15864a;

    /* renamed from: com.google.crypto.tink.aead.subtle.a$a */
    /* loaded from: classes3.dex */
    public class C8071a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return C8336l.f16173e.m3426a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C8070a(byte[] bArr) throws GeneralSecurityException {
        C8347s.m3418a(bArr.length);
        this.f15864a = new SecretKeySpec(bArr, "AES");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.spec.AlgorithmParameterSpec m4208c(byte[] r3, int r4) throws java.security.GeneralSecurityException {
        /*
            r0 = 0
            java.lang.String r1 = "javax.crypto.spec.GCMParameterSpec"
            java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> Le
            javax.crypto.spec.GCMParameterSpec r1 = new javax.crypto.spec.GCMParameterSpec     // Catch: java.lang.ClassNotFoundException -> Le
            r2 = 128(0x80, float:1.8E-43)
            r1.<init>(r2, r3, r0, r4)     // Catch: java.lang.ClassNotFoundException -> Le
            return r1
        Le:
            java.lang.String r1 = "android.app.Application"
            r2 = 0
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.Exception -> L16
            r1 = 1
            goto L17
        L16:
            r1 = r0
        L17:
            if (r1 == 0) goto L1f
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec
            r1.<init>(r3, r0, r4)
            return r1
        L1f:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.aead.subtle.C8070a.m4208c(byte[], int):java.security.spec.AlgorithmParameterSpec");
    }

    @Override // com.google.crypto.tink.InterfaceC8038a
    /* renamed from: a */
    public final byte[] mo3428a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 12 + 16];
            byte[] m3419a = C8345r.m3419a(12);
            System.arraycopy(m3419a, 0, bArr3, 0, 12);
            AlgorithmParameterSpec m4208c = m4208c(m3419a, m3419a.length);
            C8071a c8071a = f15863b;
            c8071a.get().init(1, this.f15864a, m4208c);
            if (bArr2 != null && bArr2.length != 0) {
                c8071a.get().updateAAD(bArr2);
            }
            int doFinal = c8071a.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
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
            AlgorithmParameterSpec m4208c = m4208c(bArr, 12);
            C8071a c8071a = f15863b;
            c8071a.get().init(2, this.f15864a, m4208c);
            if (bArr2 != null && bArr2.length != 0) {
                c8071a.get().updateAAD(bArr2);
            }
            return c8071a.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
