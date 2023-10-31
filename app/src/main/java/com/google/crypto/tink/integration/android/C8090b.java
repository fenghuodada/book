package com.google.crypto.tink.integration.android;

import android.util.Log;
import androidx.constraintlayout.motion.widget.C0552c;
import com.google.crypto.tink.InterfaceC8038a;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: com.google.crypto.tink.integration.android.b */
/* loaded from: classes3.dex */
public final class C8090b implements InterfaceC8038a {

    /* renamed from: a */
    public final SecretKey f15889a;

    public C8090b(String str, KeyStore keyStore) throws GeneralSecurityException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f15889a = secretKey;
        if (secretKey != null) {
            return;
        }
        throw new InvalidKeyException(C0552c.m12192b("Keystore cannot load the key with ID: ", str));
    }

    @Override // com.google.crypto.tink.InterfaceC8038a
    /* renamed from: a */
    public final byte[] mo3428a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return m4188d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return m4188d(bArr, bArr2);
        }
    }

    @Override // com.google.crypto.tink.InterfaceC8038a
    /* renamed from: b */
    public final byte[] mo3427b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return m4189c(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return m4189c(bArr, bArr2);
        }
    }

    /* renamed from: c */
    public final byte[] m4189c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, this.f15889a, gCMParameterSpec);
            cipher.updateAAD(bArr2);
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: d */
    public final byte[] m4188d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 12 + 16];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.f15889a);
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
