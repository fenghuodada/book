package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjs implements zzkm {
    private final Object zza;
    private zzcx zzb;

    public zzjs(Object obj, zzcx zzcxVar) {
        this.zza = obj;
        this.zzb = zzcxVar;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzjs zzjsVar, zzcx zzcxVar) {
        zzjsVar.zzb = zzcxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final zzcx zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final Object zzb() {
        return this.zza;
    }
}
