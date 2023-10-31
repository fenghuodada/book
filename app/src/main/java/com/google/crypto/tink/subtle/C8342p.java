package com.google.crypto.tink.subtle;

import com.google.crypto.tink.prf.InterfaceC8114a;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

@Immutable
/* renamed from: com.google.crypto.tink.subtle.p */
/* loaded from: classes3.dex */
public final class C8342p implements InterfaceC8114a {

    /* renamed from: a */
    public final C8343a f16180a;

    /* renamed from: b */
    public final String f16181b;

    /* renamed from: c */
    public final Key f16182c;

    /* renamed from: d */
    public final int f16183d;

    /* renamed from: com.google.crypto.tink.subtle.p$a */
    /* loaded from: classes3.dex */
    public class C8343a extends ThreadLocal<Mac> {
        public C8343a() {
        }

        @Override // java.lang.ThreadLocal
        public final Mac initialValue() {
            C8342p c8342p = C8342p.this;
            try {
                Mac m3426a = C8336l.f16174f.m3426a(c8342p.f16181b);
                m3426a.init(c8342p.f16182c);
                return m3426a;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C8342p(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        int i;
        C8343a c8343a = new C8343a();
        this.f16180a = c8343a;
        this.f16181b = str;
        this.f16182c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c = 0;
                    break;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c = 1;
                    break;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c = 2;
                    break;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                i = 20;
                break;
            case 1:
                i = 32;
                break;
            case 2:
                i = 48;
                break;
            case 3:
                i = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        this.f16183d = i;
        c8343a.get();
    }

    @Override // com.google.crypto.tink.prf.InterfaceC8114a
    /* renamed from: a */
    public final byte[] mo3422a(int i, byte[] bArr) throws GeneralSecurityException {
        if (i <= this.f16183d) {
            C8343a c8343a = this.f16180a;
            c8343a.get().update(bArr);
            return Arrays.copyOf(c8343a.get().doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
