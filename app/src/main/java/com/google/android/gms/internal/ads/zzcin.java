package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class zzcin extends zzerz {
    private final zzern zza;
    private final zzcir zzb;
    private final zzcin zzc = this;
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

    public /* synthetic */ zzcin(zzcir zzcirVar, zzern zzernVar, zzcim zzcimVar) {
        zzgwb zzgwbVar;
        zzgwb zzgwbVar2;
        zzgwb zzgwbVar3;
        this.zzb = zzcirVar;
        this.zza = zzernVar;
        zzgwbVar = zzcirVar.zzH;
        this.zzd = zzgvn.zzc(new zzffr(zzgwbVar));
        zzerv zzervVar = new zzerv(zzernVar);
        this.zze = zzervVar;
        zzgwb zzc = zzgvn.zzc(zzdpb.zza());
        this.zzf = zzc;
        zzgwb zzc2 = zzgvn.zzc(zzdoz.zza());
        this.zzg = zzc2;
        zzgwb zzc3 = zzgvn.zzc(zzdpd.zza());
        this.zzh = zzc3;
        zzgwb zzc4 = zzgvn.zzc(zzdpf.zza());
        this.zzi = zzc4;
        zzgvr zzc5 = zzgvs.zzc(4);
        zzc5.zzb(zzfdx.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfdx.BUILD_URL, zzc2);
        zzc5.zzb(zzfdx.HTTP, zzc3);
        zzc5.zzb(zzfdx.PRE_PROCESS, zzc4);
        zzgvs zzc6 = zzc5.zzc();
        this.zzj = zzc6;
        zzgwbVar2 = zzcirVar.zzh;
        zzgwb zzc7 = zzgvn.zzc(new zzdpg(zzervVar, zzgwbVar2, zzfcy.zza(), zzc6));
        this.zzk = zzc7;
        zzgvy zza = zzgvz.zza(0, 1);
        zza.zza(zzc7);
        zzgvz zzc8 = zza.zzc();
        this.zzl = zzc8;
        zzfeg zzfegVar = new zzfeg(zzc8);
        this.zzm = zzfegVar;
        zzfcy zza2 = zzfcy.zza();
        zzgwbVar3 = zzcirVar.zzn;
        this.zzn = zzgvn.zzc(new zzfef(zza2, zzgwbVar3, zzfegVar));
    }

    @Override // com.google.android.gms.internal.ads.zzerz
    public final zzeqt zza() {
        zzcgz zzcgzVar;
        zzgwb zzgwbVar;
        zzgwb zzgwbVar2;
        zzcgz zzcgzVar2;
        zzgwb zzgwbVar3;
        zzcgz zzcgzVar3;
        zzgwb zzgwbVar4;
        zzgwb zzgwbVar5;
        zzgwb zzgwbVar6;
        zzcgz zzcgzVar4;
        zzcgz zzcgzVar5;
        zzcgz zzcgzVar6;
        zzgwb zzgwbVar7;
        zzgwb zzgwbVar8;
        zzgwb zzgwbVar9;
        zzgwb zzgwbVar10;
        zzgwb zzgwbVar11;
        zzgwb zzgwbVar12;
        zzcgzVar = this.zzb.zza;
        Context zza = zzcgzVar.zza();
        zzgvw.zzb(zza);
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        zzbyq zzbyqVar = new zzbyq();
        zzgvw.zzb(zzfwcVar);
        zzesx zzesxVar = new zzesx(zzbyqVar, zzfwcVar, zzero.zza(this.zza));
        zzeoo zza2 = zzeoq.zza();
        zzgwbVar = this.zzb.zzn;
        zzeqq zza3 = zzett.zza(zzesxVar, zza2, (ScheduledExecutorService) zzgwbVar.zzb(), 0);
        zzbrz zzbrzVar = new zzbrz();
        zzgwbVar2 = this.zzb.zzn;
        zzcgzVar2 = this.zzb.zza;
        Context zza4 = zzcgzVar2.zza();
        zzgvw.zzb(zza4);
        zzeth zzethVar = new zzeth(zzbrzVar, (ScheduledExecutorService) zzgwbVar2.zzb(), zza4);
        zzgwbVar3 = this.zzb.zzn;
        zzeqq zzb = zzett.zzb(zzethVar, (ScheduledExecutorService) zzgwbVar3.zzb());
        zzbyt zzbytVar = new zzbyt();
        zzcgzVar3 = this.zzb.zza;
        Context zza5 = zzcgzVar3.zza();
        zzgvw.zzb(zza5);
        zzgwbVar4 = this.zzb.zzn;
        zzgvw.zzb(zzfwcVar);
        zzerf zza6 = zzerh.zza(zzbytVar, zza5, (ScheduledExecutorService) zzgwbVar4.zzb(), zzfwcVar, zzerp.zza(this.zza), zzerr.zza(this.zza), zzers.zza(this.zza));
        zzgwbVar5 = this.zzb.zzn;
        zzeqq zza7 = zzetu.zza(zza6, (ScheduledExecutorService) zzgwbVar5.zzb());
        zzgvw.zzb(zzfwcVar);
        zzeuc zzeucVar = new zzeuc(zzfwcVar);
        zzgwbVar6 = this.zzb.zzn;
        zzeqq zzc = zzett.zzc(zzeucVar, (ScheduledExecutorService) zzgwbVar6.zzb());
        zzetr zzetrVar = zzetr.zza;
        zzcgzVar4 = this.zzb.zza;
        Context zza8 = zzcgzVar4.zza();
        zzgvw.zzb(zza8);
        String zza9 = zzero.zza(this.zza);
        zzgvw.zzb(zzfwcVar);
        zzesb zzesbVar = new zzesb(null, zza8, zza9, zzfwcVar);
        zzawm zzawmVar = new zzawm();
        zzgvw.zzb(zzfwcVar);
        zzcgzVar5 = this.zzb.zza;
        Context zza10 = zzcgzVar5.zza();
        zzgvw.zzb(zza10);
        zzbav zzbavVar = new zzbav();
        zzgvw.zzb(zzfwcVar);
        zzbyt zzbytVar2 = new zzbyt();
        zzgvw.zzb(zzfwcVar);
        zzbyt zzbytVar3 = new zzbyt();
        int zza11 = zzerp.zza(this.zza);
        zzcgzVar6 = this.zzb.zza;
        Context zza12 = zzcgzVar6.zza();
        zzgvw.zzb(zza12);
        zzgwbVar7 = this.zzb.zzag;
        zzbzc zzbzcVar = (zzbzc) zzgwbVar7.zzb();
        zzgwbVar8 = this.zzb.zzn;
        zzgvw.zzb(zzfwcVar);
        zzgwbVar9 = this.zzb.zzaI;
        String zza13 = zzero.zza(this.zza);
        zzawa zzawaVar = new zzawa();
        zzgwbVar10 = this.zzb.zzag;
        zzgwbVar11 = this.zzb.zzn;
        zzgvw.zzb(zzfwcVar);
        zzfrw zzp = zzfrw.zzp(zza3, zzb, zza7, zzc, zzetrVar, zzesbVar, new zzesq(zzawmVar, zzfwcVar, zza10), new zzetb(zzbavVar, zzfwcVar, zzerq.zza(this.zza)), new zzerl(zzbytVar2, zzfwcVar, zzert.zza(this.zza), zzeru.zza(this.zza), zzerp.zza(this.zza)), new zzesm(zzbytVar3, zza11, zza12, zzbzcVar, (ScheduledExecutorService) zzgwbVar8.zzb(), zzfwcVar, zzero.zza(this.zza)), (zzeqq) zzgwbVar9.zzb(), zzesi.zza(zza13, zzawaVar, (zzbzc) zzgwbVar10.zzb(), (ScheduledExecutorService) zzgwbVar11.zzb(), zzfwcVar));
        zzffq zzffqVar = (zzffq) this.zzd.zzb();
        zzgwbVar12 = this.zzb.zzZ;
        return new zzeqt(zza, zzfwcVar, zzp, zzffqVar, (zzdqc) zzgwbVar12.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzerz
    public final zzfed zzb() {
        return (zzfed) this.zzn.zzb();
    }
}
