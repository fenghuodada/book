package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class zzcij extends zzerx {
    private final zzetd zza;
    private final zzcir zzb;
    private final zzcij zzc = this;
    private final zzgwb zzd;
    private final zzgwb zze;
    private final zzgwb zzf;
    private final zzgwb zzg;
    private final zzgwb zzh;
    private final zzgwb zzi;
    private final zzgwb zzj;
    private final zzgwb zzk;
    private final zzgwb zzl;
    private final zzgwb zzm;
    private final zzgwb zzn;

    public /* synthetic */ zzcij(zzcir zzcirVar, zzetd zzetdVar, zzcii zzciiVar) {
        zzgwb zzgwbVar;
        zzgwb zzgwbVar2;
        zzgwb zzgwbVar3;
        this.zzb = zzcirVar;
        this.zza = zzetdVar;
        zzetf zzetfVar = new zzetf(zzetdVar);
        this.zzd = zzetfVar;
        zzgwb zzc = zzgvn.zzc(zzdpb.zza());
        this.zze = zzc;
        zzgwb zzc2 = zzgvn.zzc(zzdoz.zza());
        this.zzf = zzc2;
        zzgwb zzc3 = zzgvn.zzc(zzdpd.zza());
        this.zzg = zzc3;
        zzgwb zzc4 = zzgvn.zzc(zzdpf.zza());
        this.zzh = zzc4;
        zzgvr zzc5 = zzgvs.zzc(4);
        zzc5.zzb(zzfdx.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfdx.BUILD_URL, zzc2);
        zzc5.zzb(zzfdx.HTTP, zzc3);
        zzc5.zzb(zzfdx.PRE_PROCESS, zzc4);
        zzgvs zzc6 = zzc5.zzc();
        this.zzi = zzc6;
        zzgwbVar = zzcirVar.zzh;
        zzgwb zzc7 = zzgvn.zzc(new zzdpg(zzetfVar, zzgwbVar, zzfcy.zza(), zzc6));
        this.zzj = zzc7;
        zzgvy zza = zzgvz.zza(0, 1);
        zza.zza(zzc7);
        zzgvz zzc8 = zza.zzc();
        this.zzk = zzc8;
        zzfeg zzfegVar = new zzfeg(zzc8);
        this.zzl = zzfegVar;
        zzfcy zza2 = zzfcy.zza();
        zzgwbVar2 = zzcirVar.zzn;
        this.zzm = zzgvn.zzc(new zzfef(zza2, zzgwbVar2, zzfegVar));
        zzgwbVar3 = zzcirVar.zzH;
        this.zzn = zzgvn.zzc(new zzffr(zzgwbVar3));
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final zzeqt zza() {
        zzcgz zzcgzVar;
        zzgwb zzgwbVar;
        zzgwb zzgwbVar2;
        zzcgzVar = this.zzb.zza;
        Context zza = zzcgzVar.zza();
        zzgvw.zzb(zza);
        zzbyq zzbyqVar = new zzbyq();
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        zzesx zzesxVar = new zzesx(zzbyqVar, zzfwcVar, zzete.zza(this.zza));
        zzgvw.zzb(zzfwcVar);
        zzgwbVar = this.zzb.zzn;
        zzffq zzffqVar = (zzffq) this.zzn.zzb();
        zzgwbVar2 = this.zzb.zzZ;
        zzdqc zzdqcVar = (zzdqc) zzgwbVar2.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzeow(zzesxVar, 0L, (ScheduledExecutorService) zzgwbVar.zzb()));
        return new zzeqt(zza, zzfwcVar, hashSet, zzffqVar, zzdqcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final zzfed zzb() {
        return (zzfed) this.zzm.zzb();
    }
}
