package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzajn implements zzajg {
    final /* synthetic */ zzajp zza;
    private final zzfc zzb = new zzfc(new byte[4], 4);

    public zzajn(zzajp zzajpVar) {
        this.zza = zzajpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zza(zzfd zzfdVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i;
        if (zzfdVar.zzk() == 0 && (zzfdVar.zzk() & 128) != 0) {
            zzfdVar.zzG(6);
            int zza = zzfdVar.zza() / 4;
            for (int i2 = 0; i2 < zza; i2++) {
                zzfdVar.zzA(this.zzb, 4);
                int zzd = this.zzb.zzd(16);
                this.zzb.zzl(3);
                if (zzd == 0) {
                    this.zzb.zzl(13);
                } else {
                    int zzd2 = this.zzb.zzd(13);
                    sparseArray2 = this.zza.zzf;
                    if (sparseArray2.get(zzd2) == null) {
                        zzajp zzajpVar = this.zza;
                        sparseArray3 = zzajpVar.zzf;
                        sparseArray3.put(zzd2, new zzajh(new zzajo(zzajpVar, zzd2)));
                        zzajp zzajpVar2 = this.zza;
                        i = zzajpVar2.zzl;
                        zzajpVar2.zzl = i + 1;
                    }
                }
            }
            sparseArray = this.zza.zzf;
            sparseArray.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zzb(zzfl zzflVar, zzaar zzaarVar, zzajt zzajtVar) {
    }
}
