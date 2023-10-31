package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.crypto.tink.subtle.s */
/* loaded from: classes3.dex */
public final class C8347s {
    static {
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);
    }

    /* renamed from: a */
    public static void m3418a(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
    }

    /* renamed from: b */
    public static String m3417b(String str) {
        if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return str.substring(19);
        }
        throw new IllegalArgumentException(String.format("key URI must start with %s", "android-keystore://"));
    }

    /* renamed from: c */
    public static void m3416c(int i) throws GeneralSecurityException {
        if (i < 0 || i > 0) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(i), 0));
        }
    }
}
