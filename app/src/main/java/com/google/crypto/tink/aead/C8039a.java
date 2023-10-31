package com.google.crypto.tink.aead;

import com.google.crypto.tink.C8112p;
import com.google.crypto.tink.mac.C8101a;
import com.google.crypto.tink.mac.C8104b;
import com.google.crypto.tink.mac.C8107c;
import com.google.crypto.tink.mac.C8108d;
import com.google.crypto.tink.proto.C8156j0;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.crypto.tink.aead.a */
/* loaded from: classes3.dex */
public final class C8039a {
    static {
        new C8042c();
        new C8051f();
        new C8054g();
        new C8048e();
        new C8060i();
        new C8064k();
        new C8057h();
        new C8067l();
        int i = C8156j0.CONFIG_NAME_FIELD_NUMBER;
        try {
            m4209a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m4209a() throws GeneralSecurityException {
        boolean z;
        int i = C8107c.f15907a;
        C8112p.m4160e(new C8104b(), true);
        C8112p.m4160e(new C8101a(), true);
        C8112p.m4159f(new C8108d());
        C8112p.m4160e(new C8042c(), true);
        C8112p.m4160e(new C8048e(), true);
        C8112p.m4160e(new C8051f(), true);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            z = true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            z = false;
        }
        if (z) {
            C8112p.m4160e(new C8054g(), true);
        }
        C8112p.m4160e(new C8057h(), true);
        C8112p.m4160e(new C8060i(), true);
        C8112p.m4160e(new C8064k(), true);
        C8112p.m4160e(new C8067l(), true);
        C8112p.m4159f(new C8040b());
    }
}
