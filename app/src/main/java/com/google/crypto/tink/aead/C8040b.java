package com.google.crypto.tink.aead;

import com.google.crypto.tink.C8072b;
import com.google.crypto.tink.C8097l;
import com.google.crypto.tink.InterfaceC8038a;
import com.google.crypto.tink.InterfaceC8100m;
import com.google.crypto.tink.subtle.C8330f;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.aead.b */
/* loaded from: classes3.dex */
public final class C8040b implements InterfaceC8100m<InterfaceC8038a, InterfaceC8038a> {

    /* renamed from: a */
    public static final Logger f15849a = Logger.getLogger(C8040b.class.getName());

    /* renamed from: com.google.crypto.tink.aead.b$a */
    /* loaded from: classes3.dex */
    public static class C8041a implements InterfaceC8038a {

        /* renamed from: a */
        public final C8097l<InterfaceC8038a> f15850a;

        public C8041a(C8097l c8097l) {
            this.f15850a = c8097l;
        }

        @Override // com.google.crypto.tink.InterfaceC8038a
        /* renamed from: a */
        public final byte[] mo3428a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            C8097l<InterfaceC8038a> c8097l = this.f15850a;
            return C8330f.m3441a(c8097l.f15899b.m4180a(), c8097l.f15899b.f15901a.mo3428a(bArr, bArr2));
        }

        @Override // com.google.crypto.tink.InterfaceC8038a
        /* renamed from: b */
        public final byte[] mo3427b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int length = bArr.length;
            C8097l<InterfaceC8038a> c8097l = this.f15850a;
            if (length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C8097l.C8098a<InterfaceC8038a> c8098a : c8097l.m4181a(copyOfRange)) {
                    try {
                        return c8098a.f15901a.mo3427b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        Logger logger = C8040b.f15849a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            for (C8097l.C8098a<InterfaceC8038a> c8098a2 : c8097l.m4181a(C8072b.f15865a)) {
                try {
                    return c8098a2.f15901a.mo3427b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    @Override // com.google.crypto.tink.InterfaceC8100m
    /* renamed from: a */
    public final Class<InterfaceC8038a> mo4167a() {
        return InterfaceC8038a.class;
    }

    @Override // com.google.crypto.tink.InterfaceC8100m
    /* renamed from: b */
    public final Class<InterfaceC8038a> mo4166b() {
        return InterfaceC8038a.class;
    }

    @Override // com.google.crypto.tink.InterfaceC8100m
    /* renamed from: c */
    public final InterfaceC8038a mo4165c(C8097l<InterfaceC8038a> c8097l) throws GeneralSecurityException {
        return new C8041a(c8097l);
    }
}
