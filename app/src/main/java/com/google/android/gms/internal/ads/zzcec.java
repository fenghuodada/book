package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
final class zzcec implements zzfx {
    private final zzfx zza;
    private final long zzb;
    private final zzfx zzc;
    private long zzd;
    private Uri zze;

    public zzcec(zzfx zzfxVar, int i, zzfx zzfxVar2) {
        this.zza = zzfxVar;
        this.zzb = i;
        this.zzc = zzfxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + zza;
            this.zzd = j3;
            i3 = zza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j >= this.zzb) {
            int zza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
            int i4 = i3 + zza2;
            this.zzd += zza2;
            return i4;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws IOException {
        zzgc zzgcVar2;
        this.zze = zzgcVar.zza;
        long j = zzgcVar.zzf;
        long j2 = this.zzb;
        zzgc zzgcVar3 = null;
        if (j >= j2) {
            zzgcVar2 = null;
        } else {
            long j3 = zzgcVar.zzg;
            long j4 = j2 - j;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            zzgcVar2 = new zzgc(zzgcVar.zza, null, j, j, j4, null, 0);
        }
        long j5 = zzgcVar.zzg;
        if (j5 == -1 || zzgcVar.zzf + j5 > this.zzb) {
            long max = Math.max(this.zzb, zzgcVar.zzf);
            long j6 = zzgcVar.zzg;
            zzgcVar3 = new zzgc(zzgcVar.zza, null, max, max, j6 != -1 ? Math.min(j6, (zzgcVar.zzf + j6) - this.zzb) : -1L, null, 0);
        }
        long zzb = zzgcVar2 != null ? this.zza.zzb(zzgcVar2) : 0L;
        long zzb2 = zzgcVar3 != null ? this.zzc.zzb(zzgcVar3) : 0L;
        this.zzd = zzgcVar.zzf;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Map zze() {
        return zzfru.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzf(zzgz zzgzVar) {
    }
}
