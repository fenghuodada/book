package com.google.crypto.tink.subtle;

import java.security.InvalidKeyException;

/* renamed from: com.google.crypto.tink.subtle.g */
/* loaded from: classes3.dex */
public final class C8331g extends AbstractC8332h {
    public C8331g(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // com.google.crypto.tink.subtle.AbstractC8332h
    /* renamed from: d */
    public final int[] mo3415d(int i, int[] iArr) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            int[] iArr3 = AbstractC8332h.f16163c;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            System.arraycopy(this.f16164a, 0, iArr2, iArr3.length, 8);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    @Override // com.google.crypto.tink.subtle.AbstractC8332h
    /* renamed from: g */
    public final int mo3414g() {
        return 12;
    }
}
