package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzamy extends zzguv {
    ByteBuffer zza;

    public zzamy(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzguv
    public final void zzf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer;
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
