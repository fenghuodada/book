package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgy implements zzfx {
    private final zzfx zza;
    private long zzb;
    private Uri zzc;
    private Map zzd;

    public zzgy(zzfx zzfxVar) {
        zzfxVar.getClass();
        this.zza = zzfxVar;
        this.zzc = Uri.EMPTY;
        this.zzd = Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int zza = this.zza.zza(bArr, i, i2);
        if (zza != -1) {
            this.zzb += zza;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws IOException {
        this.zzc = zzgcVar.zza;
        this.zzd = Collections.emptyMap();
        long zzb = this.zza.zzb(zzgcVar);
        Uri zzc = zzc();
        zzc.getClass();
        this.zzc = zzc;
        this.zzd = zze();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    @Nullable
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzf(zzgz zzgzVar) {
        zzgzVar.getClass();
        this.zza.zzf(zzgzVar);
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }
}
