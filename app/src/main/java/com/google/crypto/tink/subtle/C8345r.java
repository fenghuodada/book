package com.google.crypto.tink.subtle;

import java.security.SecureRandom;

/* renamed from: com.google.crypto.tink.subtle.r */
/* loaded from: classes3.dex */
public final class C8345r {

    /* renamed from: a */
    public static final C8346a f16187a = new C8346a();

    /* renamed from: com.google.crypto.tink.subtle.r$a */
    /* loaded from: classes3.dex */
    public class C8346a extends ThreadLocal<SecureRandom> {
        @Override // java.lang.ThreadLocal
        public final SecureRandom initialValue() {
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextLong();
            return secureRandom;
        }
    }

    /* renamed from: a */
    public static byte[] m3419a(int i) {
        byte[] bArr = new byte[i];
        f16187a.get().nextBytes(bArr);
        return bArr;
    }
}
