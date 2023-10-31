package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzfr implements zzfx {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    @Nullable
    private zzgc zzd;

    public zzfr(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzf(zzgz zzgzVar) {
        zzgzVar.getClass();
        if (this.zzb.contains(zzgzVar)) {
            return;
        }
        this.zzb.add(zzgzVar);
        this.zzc++;
    }

    public final void zzg(int i) {
        zzgc zzgcVar = this.zzd;
        int i2 = zzfn.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzgz) this.zzb.get(i3)).zza(this, zzgcVar, this.zza, i);
        }
    }

    public final void zzh() {
        zzgc zzgcVar = this.zzd;
        int i = zzfn.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzgz) this.zzb.get(i2)).zzb(this, zzgcVar, this.zza);
        }
        this.zzd = null;
    }

    public final void zzi(zzgc zzgcVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzgz) this.zzb.get(i)).zzc(this, zzgcVar, this.zza);
        }
    }

    public final void zzj(zzgc zzgcVar) {
        this.zzd = zzgcVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzgz) this.zzb.get(i)).zzd(this, zzgcVar, this.zza);
        }
    }
}
