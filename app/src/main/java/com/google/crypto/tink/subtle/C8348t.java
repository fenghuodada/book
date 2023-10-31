package com.google.crypto.tink.subtle;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* renamed from: com.google.crypto.tink.subtle.t */
/* loaded from: classes3.dex */
public final class C8348t extends AbstractC8332h {
    public C8348t(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // com.google.crypto.tink.subtle.AbstractC8332h
    /* renamed from: d */
    public final int[] mo3415d(int i, int[] iArr) {
        if (iArr.length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = AbstractC8332h.f16163c;
            System.arraycopy(iArr3, 0, r0, 0, iArr3.length);
            System.arraycopy(this.f16164a, 0, r0, iArr3.length, 8);
            int[] iArr4 = {0, 0, 0, 0, iArr4[12], iArr4[13], iArr4[14], iArr4[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
            AbstractC8332h.m3431j(iArr4);
            int[] copyOf = Arrays.copyOf(iArr4, 8);
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            System.arraycopy(copyOf, 0, iArr2, iArr3.length, 8);
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    @Override // com.google.crypto.tink.subtle.AbstractC8332h
    /* renamed from: g */
    public final int mo3414g() {
        return 24;
    }
}
