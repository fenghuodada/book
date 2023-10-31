package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfai implements zzfvn {
    final /* synthetic */ zzcfb zza;
    final /* synthetic */ zzfgj zzb;
    final /* synthetic */ zzebc zzc;

    public zzfai(zzcfb zzcfbVar, zzfgj zzfgjVar, zzebc zzebcVar) {
        this.zza = zzcfbVar;
        this.zzb = zzfgjVar;
        this.zzc = zzebcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.zza.zzD().zzaj) {
            this.zzb.zzc(str, null);
            return;
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        String str2 = this.zza.zzP().zzb;
        int i = 2;
        if (!com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza.getContext())) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfZ)).booleanValue() || !this.zza.zzD().zzT) {
                i = 1;
            }
        }
        this.zzc.zzd(new zzebe(currentTimeMillis, str2, str, i));
    }
}
