package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzss implements zztv, zzqm {
    final /* synthetic */ zzsu zza;
    private final Object zzb;
    private zztu zzc;
    private zzql zzd;

    public zzss(zzsu zzsuVar, Object obj) {
        this.zza = zzsuVar;
        this.zzc = zzsuVar.zze(null);
        this.zzd = zzsuVar.zzc(null);
        this.zzb = obj;
    }

    private final zzth zzf(zzth zzthVar) {
        zzsu zzsuVar = this.zza;
        Object obj = this.zzb;
        long j = zzthVar.zzc;
        zzsuVar.zzw(obj, j);
        zzsu zzsuVar2 = this.zza;
        Object obj2 = this.zzb;
        long j2 = zzthVar.zzd;
        zzsuVar2.zzw(obj2, j2);
        return (j == zzthVar.zzc && j2 == zzthVar.zzd) ? zzthVar : new zzth(1, zzthVar.zza, zzthVar.zzb, 0, null, j, j2);
    }

    private final boolean zzg(int i, @Nullable zztl zztlVar) {
        zztl zztlVar2;
        if (zztlVar != null) {
            zztlVar2 = this.zza.zzx(this.zzb, zztlVar);
            if (zztlVar2 == null) {
                return false;
            }
        } else {
            zztlVar2 = null;
        }
        this.zza.zzv(this.zzb, 0);
        zztu zztuVar = this.zzc;
        int i2 = zztuVar.zza;
        if (!zzfn.zzB(zztuVar.zzb, zztlVar2)) {
            this.zzc = this.zza.zzf(0, zztlVar2);
        }
        zzql zzqlVar = this.zzd;
        int i3 = zzqlVar.zza;
        if (zzfn.zzB(zzqlVar.zzb, zztlVar2)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zztlVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzaf(int i, @Nullable zztl zztlVar, zzth zzthVar) {
        if (zzg(0, zztlVar)) {
            this.zzc.zzc(zzf(zzthVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzag(int i, @Nullable zztl zztlVar, zztc zztcVar, zzth zzthVar) {
        if (zzg(0, zztlVar)) {
            this.zzc.zzd(zztcVar, zzf(zzthVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzah(int i, @Nullable zztl zztlVar, zztc zztcVar, zzth zzthVar) {
        if (zzg(0, zztlVar)) {
            this.zzc.zze(zztcVar, zzf(zzthVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzai(int i, @Nullable zztl zztlVar, zztc zztcVar, zzth zzthVar, IOException iOException, boolean z) {
        if (zzg(0, zztlVar)) {
            this.zzc.zzf(zztcVar, zzf(zzthVar), iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzaj(int i, @Nullable zztl zztlVar, zztc zztcVar, zzth zzthVar) {
        if (zzg(0, zztlVar)) {
            this.zzc.zzg(zztcVar, zzf(zzthVar));
        }
    }
}
