package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzaan implements zzabr {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzabr
    public final /* synthetic */ int zze(zzt zztVar, int i, boolean z) {
        return zzabp.zza(this, zztVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final int zzf(zzt zztVar, int i, boolean z, int i2) throws IOException {
        int zza = zztVar.zza(this.zza, 0, Math.min(4096, i));
        if (zza == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzk(zzam zzamVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final /* synthetic */ void zzq(zzfd zzfdVar, int i) {
        zzabp.zzb(this, zzfdVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzr(zzfd zzfdVar, int i, int i2) {
        zzfdVar.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzs(long j, int i, int i2, int i3, @Nullable zzabq zzabqVar) {
    }
}
