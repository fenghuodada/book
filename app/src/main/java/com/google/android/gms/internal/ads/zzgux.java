package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class zzgux extends zzguv {
    private int zza;

    public zzgux(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    public final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzamt.zzc(byteBuffer.get());
        zzamt.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
