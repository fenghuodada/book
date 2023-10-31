package com.google.crypto.tink.subtle;

import com.google.crypto.tink.InterfaceC8096k;
import com.google.crypto.tink.prf.InterfaceC8114a;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

@Immutable
/* renamed from: com.google.crypto.tink.subtle.q */
/* loaded from: classes3.dex */
public final class C8344q implements InterfaceC8096k {

    /* renamed from: a */
    public final InterfaceC8114a f16185a;

    /* renamed from: b */
    public final int f16186b;

    public C8344q(InterfaceC8114a interfaceC8114a, int i) throws GeneralSecurityException {
        this.f16185a = interfaceC8114a;
        this.f16186b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        interfaceC8114a.mo3422a(i, new byte[0]);
    }

    @Override // com.google.crypto.tink.InterfaceC8096k
    /* renamed from: a */
    public final void mo3421a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!C8330f.m3440b(mo3420b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.google.crypto.tink.InterfaceC8096k
    /* renamed from: b */
    public final byte[] mo3420b(byte[] bArr) throws GeneralSecurityException {
        return this.f16185a.mo3422a(this.f16186b, bArr);
    }
}
