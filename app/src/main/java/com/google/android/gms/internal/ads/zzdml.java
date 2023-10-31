package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* loaded from: classes.dex */
public final class zzdml implements zzbix {
    private final zzcwp zza;
    @Nullable
    private final zzbvi zzb;
    private final String zzc;
    private final String zzd;

    public zzdml(zzcwp zzcwpVar, zzezf zzezfVar) {
        this.zza = zzcwpVar;
        this.zzb = zzezfVar.zzm;
        this.zzc = zzezfVar.zzk;
        this.zzd = zzezfVar.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    @ParametersAreNonnullByDefault
    public final void zza(zzbvi zzbviVar) {
        int i;
        String str;
        zzbvi zzbviVar2 = this.zzb;
        if (zzbviVar2 != null) {
            zzbviVar = zzbviVar2;
        }
        if (zzbviVar != null) {
            str = zzbviVar.zza;
            i = zzbviVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzbut(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zzc() {
        this.zza.zzf();
    }
}
