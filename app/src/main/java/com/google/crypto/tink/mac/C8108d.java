package com.google.crypto.tink.mac;

import com.google.crypto.tink.C8072b;
import com.google.crypto.tink.C8097l;
import com.google.crypto.tink.InterfaceC8096k;
import com.google.crypto.tink.InterfaceC8100m;
import com.google.crypto.tink.proto.EnumC8153i0;
import com.google.crypto.tink.subtle.C8330f;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.mac.d */
/* loaded from: classes3.dex */
public final class C8108d implements InterfaceC8100m<InterfaceC8096k, InterfaceC8096k> {

    /* renamed from: a */
    public static final Logger f15908a = Logger.getLogger(C8108d.class.getName());

    /* renamed from: com.google.crypto.tink.mac.d$a */
    /* loaded from: classes3.dex */
    public static class C8109a implements InterfaceC8096k {

        /* renamed from: a */
        public final C8097l<InterfaceC8096k> f15909a;

        /* renamed from: b */
        public final byte[] f15910b = {0};

        public C8109a(C8097l c8097l) {
            this.f15909a = c8097l;
        }

        @Override // com.google.crypto.tink.InterfaceC8096k
        /* renamed from: a */
        public final void mo3421a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                C8097l<InterfaceC8096k> c8097l = this.f15909a;
                for (C8097l.C8098a<InterfaceC8096k> c8098a : c8097l.m4181a(copyOf)) {
                    try {
                        boolean equals = c8098a.f15904d.equals(EnumC8153i0.LEGACY);
                        InterfaceC8096k interfaceC8096k = c8098a.f15901a;
                        if (equals) {
                            interfaceC8096k.mo3421a(copyOfRange, C8330f.m3441a(bArr2, this.f15910b));
                            return;
                        } else {
                            interfaceC8096k.mo3421a(copyOfRange, bArr2);
                            return;
                        }
                    } catch (GeneralSecurityException e) {
                        Logger logger = C8108d.f15908a;
                        logger.info("tag prefix matches a key, but cannot verify: " + e);
                    }
                }
                for (C8097l.C8098a<InterfaceC8096k> c8098a2 : c8097l.m4181a(C8072b.f15865a)) {
                    try {
                        c8098a2.f15901a.mo3421a(bArr, bArr2);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("tag too short");
        }

        @Override // com.google.crypto.tink.InterfaceC8096k
        /* renamed from: b */
        public final byte[] mo3420b(byte[] bArr) throws GeneralSecurityException {
            C8097l<InterfaceC8096k> c8097l = this.f15909a;
            if (c8097l.f15899b.f15904d.equals(EnumC8153i0.LEGACY)) {
                return C8330f.m3441a(c8097l.f15899b.m4180a(), c8097l.f15899b.f15901a.mo3420b(C8330f.m3441a(bArr, this.f15910b)));
            }
            return C8330f.m3441a(c8097l.f15899b.m4180a(), c8097l.f15899b.f15901a.mo3420b(bArr));
        }
    }

    @Override // com.google.crypto.tink.InterfaceC8100m
    /* renamed from: a */
    public final Class<InterfaceC8096k> mo4167a() {
        return InterfaceC8096k.class;
    }

    @Override // com.google.crypto.tink.InterfaceC8100m
    /* renamed from: b */
    public final Class<InterfaceC8096k> mo4166b() {
        return InterfaceC8096k.class;
    }

    @Override // com.google.crypto.tink.InterfaceC8100m
    /* renamed from: c */
    public final InterfaceC8096k mo4165c(C8097l<InterfaceC8096k> c8097l) throws GeneralSecurityException {
        return new C8109a(c8097l);
    }
}
