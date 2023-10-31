package com.google.crypto.tink.subtle;

import java.security.InvalidKeyException;

/* renamed from: com.google.crypto.tink.subtle.i */
/* loaded from: classes3.dex */
public final class C8333i extends AbstractC8334j {
    public C8333i(byte[] bArr) throws InvalidKeyException {
        super(bArr);
    }

    @Override // com.google.crypto.tink.subtle.AbstractC8334j
    /* renamed from: d */
    public final AbstractC8332h mo3413d(int i, byte[] bArr) throws InvalidKeyException {
        return new C8331g(bArr, i);
    }
}
