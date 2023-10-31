package com.google.crypto.tink.integration.android;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import com.google.crypto.tink.InterfaceC8087i;
import com.google.crypto.tink.subtle.C8345r;
import com.google.crypto.tink.subtle.C8347s;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
import javax.crypto.KeyGenerator;

/* renamed from: com.google.crypto.tink.integration.android.c */
/* loaded from: classes3.dex */
public final class C8091c implements InterfaceC8087i {

    /* renamed from: b */
    public static final /* synthetic */ int f15890b = 0;
    @GuardedBy("this")

    /* renamed from: a */
    public KeyStore f15891a;

    /* renamed from: com.google.crypto.tink.integration.android.c$a */
    /* loaded from: classes3.dex */
    public static final class C8092a {

        /* renamed from: a */
        public KeyStore f15892a;

        public C8092a() {
            this.f15892a = null;
            int i = C8091c.f15890b;
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f15892a = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C8091c() throws GeneralSecurityException {
        this(new C8092a());
    }

    public C8091c(C8092a c8092a) {
        this.f15891a = c8092a.f15892a;
    }

    /* renamed from: c */
    public static void m4185c(String str) throws GeneralSecurityException {
        if (new C8091c().m4184d(str)) {
            throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
        }
        String m3417b = C8347s.m3417b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(m3417b, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    @Override // com.google.crypto.tink.InterfaceC8087i
    /* renamed from: a */
    public final synchronized boolean mo4187a(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    @Override // com.google.crypto.tink.InterfaceC8087i
    /* renamed from: b */
    public final synchronized C8090b mo4186b(String str) throws GeneralSecurityException {
        C8090b c8090b;
        c8090b = new C8090b(C8347s.m3417b(str), this.f15891a);
        byte[] m3419a = C8345r.m3419a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(m3419a, c8090b.mo3427b(c8090b.mo3428a(m3419a, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return c8090b;
    }

    /* renamed from: d */
    public final synchronized boolean m4184d(String str) throws GeneralSecurityException {
        String str2;
        try {
        } catch (NullPointerException unused) {
            Log.w("c", "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f15891a = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.f15891a.containsAlias(str2);
        }
        return this.f15891a.containsAlias(C8347s.m3417b(str));
    }
}
