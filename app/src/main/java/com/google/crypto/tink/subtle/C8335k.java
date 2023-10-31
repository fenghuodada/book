package com.google.crypto.tink.subtle;

import com.google.crypto.tink.InterfaceC8038a;
import com.google.crypto.tink.InterfaceC8096k;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.crypto.tink.subtle.k */
/* loaded from: classes3.dex */
public final class C8335k implements InterfaceC8038a {

    /* renamed from: a */
    public final InterfaceC8340n f16168a;

    /* renamed from: b */
    public final InterfaceC8096k f16169b;

    /* renamed from: c */
    public final int f16170c;

    public C8335k(InterfaceC8340n interfaceC8340n, InterfaceC8096k interfaceC8096k, int i) {
        this.f16168a = interfaceC8340n;
        this.f16169b = interfaceC8096k;
        this.f16170c = i;
    }

    @Override // com.google.crypto.tink.InterfaceC8038a
    /* renamed from: a */
    public final byte[] mo3428a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] mo3424a = this.f16168a.mo3424a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return C8330f.m3441a(mo3424a, this.f16169b.mo3420b(C8330f.m3441a(bArr2, mo3424a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // com.google.crypto.tink.InterfaceC8038a
    /* renamed from: b */
    public final byte[] mo3427b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f16170c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.f16169b.mo3421a(copyOfRange2, C8330f.m3441a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.f16168a.mo3423b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
