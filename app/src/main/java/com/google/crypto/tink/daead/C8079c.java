package com.google.crypto.tink.daead;

import com.google.crypto.tink.C8072b;
import com.google.crypto.tink.C8097l;
import com.google.crypto.tink.InterfaceC8073c;
import com.google.crypto.tink.InterfaceC8100m;
import com.google.crypto.tink.subtle.C8330f;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.daead.c */
/* loaded from: classes3.dex */
public final class C8079c implements InterfaceC8100m<InterfaceC8073c, InterfaceC8073c> {

    /* renamed from: a */
    public static final Logger f15870a = Logger.getLogger(C8079c.class.getName());

    /* renamed from: com.google.crypto.tink.daead.c$a */
    /* loaded from: classes3.dex */
    public static class C8080a implements InterfaceC8073c {

        /* renamed from: a */
        public final C8097l<InterfaceC8073c> f15871a;

        public C8080a(C8097l<InterfaceC8073c> c8097l) {
            this.f15871a = c8097l;
        }

        @Override // com.google.crypto.tink.InterfaceC8073c
        /* renamed from: a */
        public final byte[] mo3446a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            C8097l<InterfaceC8073c> c8097l = this.f15871a;
            return C8330f.m3441a(c8097l.f15899b.m4180a(), c8097l.f15899b.f15901a.mo3446a(bArr, bArr2));
        }

        @Override // com.google.crypto.tink.InterfaceC8073c
        /* renamed from: b */
        public final byte[] mo3445b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int length = bArr.length;
            C8097l<InterfaceC8073c> c8097l = this.f15871a;
            if (length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C8097l.C8098a<InterfaceC8073c> c8098a : c8097l.m4181a(copyOfRange)) {
                    try {
                        return c8098a.f15901a.mo3445b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        Logger logger = C8079c.f15870a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            for (C8097l.C8098a<InterfaceC8073c> c8098a2 : c8097l.m4181a(C8072b.f15865a)) {
                try {
                    return c8098a2.f15901a.mo3445b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    @Override // com.google.crypto.tink.InterfaceC8100m
    /* renamed from: a */
    public final Class<InterfaceC8073c> mo4167a() {
        return InterfaceC8073c.class;
    }

    @Override // com.google.crypto.tink.InterfaceC8100m
    /* renamed from: b */
    public final Class<InterfaceC8073c> mo4166b() {
        return InterfaceC8073c.class;
    }

    @Override // com.google.crypto.tink.InterfaceC8100m
    /* renamed from: c */
    public final InterfaceC8073c mo4165c(C8097l<InterfaceC8073c> c8097l) throws GeneralSecurityException {
        return new C8080a(c8097l);
    }
}
