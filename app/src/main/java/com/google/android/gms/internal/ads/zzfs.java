package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzfs extends zzfr {
    private final byte[] zza;
    @Nullable
    private Uri zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    public zzfs(byte[] bArr) {
        super(false);
        bArr.getClass();
        zzdy.zzd(bArr.length > 0);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.zza, this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws IOException {
        this.zzb = zzgcVar.zza;
        zzi(zzgcVar);
        long j = zzgcVar.zzf;
        int length = this.zza.length;
        if (j <= length) {
            int i = (int) j;
            this.zzc = i;
            int i2 = length - i;
            this.zzd = i2;
            long j2 = zzgcVar.zzg;
            if (j2 != -1) {
                this.zzd = (int) Math.min(i2, j2);
            }
            this.zze = true;
            zzj(zzgcVar);
            long j3 = zzgcVar.zzg;
            return j3 != -1 ? j3 : this.zzd;
        }
        throw new zzfy(AdError.REMOTE_ADS_SERVICE_ERROR);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zzb = null;
    }
}
