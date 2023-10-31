package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzblw implements zzbii {
    final /* synthetic */ zzblf zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzca zzb;
    final /* synthetic */ zzbmk zzc;

    public zzblw(zzbmk zzbmkVar, zzaqq zzaqqVar, zzblf zzblfVar, com.google.android.gms.ads.internal.util.zzca zzcaVar) {
        this.zzc = zzbmkVar;
        this.zza = zzblfVar;
        this.zzb = zzcaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbii, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        int i;
        zzbml zzbmlVar = (zzbml) obj;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            zzbzt.zzi("JS Engine is requesting an update");
            i = this.zzc.zzi;
            if (i == 0) {
                zzbzt.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", this.zzb.zza());
        }
    }
}
