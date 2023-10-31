package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzblv implements zzbii {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbmj zzb;
    final /* synthetic */ zzblf zzc;
    final /* synthetic */ zzbmk zzd;

    public zzblv(zzbmk zzbmkVar, long j, zzbmj zzbmjVar, zzblf zzblfVar) {
        this.zzd = zzbmkVar;
        this.zza = j;
        this.zzb = zzbmjVar;
        this.zzc = zzblfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        zzbml zzbmlVar = (zzbml) obj;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zza;
        com.google.android.gms.ads.internal.util.zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + currentTimeMillis + " ms.");
        obj2 = this.zzd.zza;
        synchronized (obj2) {
            if (this.zzb.zze() != -1 && this.zzb.zze() != 1) {
                this.zzd.zzi = 0;
                zzblf zzblfVar = this.zzc;
                zzblfVar.zzq("/log", zzbih.zzg);
                zzblfVar.zzq("/result", zzbih.zzo);
                this.zzb.zzh(this.zzc);
                this.zzd.zzh = this.zzb;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
            }
        }
    }
}
