package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzcuc implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzcuc(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final zzbzz zza = ((zzchn) this.zzb).zza();
        final zzfaa zza2 = ((zzcuz) this.zzc).zza();
        return new zzfon() { // from class: com.google.android.gms.internal.ads.zzcub
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                Context context2 = context;
                zzbzz zzbzzVar = zza;
                zzfaa zzfaaVar = zza2;
                zzezf zzezfVar = (zzezf) obj;
                com.google.android.gms.ads.internal.util.zzas zzasVar = new com.google.android.gms.ads.internal.util.zzas(context2);
                zzasVar.zzp(zzezfVar.zzC);
                zzasVar.zzq(zzezfVar.zzD.toString());
                zzasVar.zzo(zzbzzVar.zza);
                zzasVar.zzn(zzfaaVar.zzf);
                return zzasVar;
            }
        };
    }
}
