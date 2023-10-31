package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class zzfv extends zzfr {
    @Nullable
    private zzgc zza;
    @Nullable
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfv() {
        super(false);
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
        byte[] bArr2 = this.zzb;
        int i4 = zzfn.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws IOException {
        zzi(zzgcVar);
        this.zza = zzgcVar;
        Uri uri = zzgcVar.zza;
        String scheme = uri.getScheme();
        zzdy.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = zzfn.zza;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw zzce.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
                }
            } else {
                this.zzb = URLDecoder.decode(str, zzfol.zza.name()).getBytes(zzfol.zzc);
            }
            long j = zzgcVar.zzf;
            int length = this.zzb.length;
            if (j > length) {
                this.zzb = null;
                throw new zzfy(AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            int i2 = (int) j;
            this.zzc = i2;
            int i3 = length - i2;
            this.zzd = i3;
            long j2 = zzgcVar.zzg;
            if (j2 != -1) {
                this.zzd = (int) Math.min(i3, j2);
            }
            zzj(zzgcVar);
            long j3 = zzgcVar.zzg;
            return j3 != -1 ? j3 : this.zzd;
        }
        throw zzce.zzb("Unexpected URI format: ".concat(String.valueOf(uri)), null);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    @Nullable
    public final Uri zzc() {
        zzgc zzgcVar = this.zza;
        if (zzgcVar != null) {
            return zzgcVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
