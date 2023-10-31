package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcjp implements zzcqm {
    private final zzcqn zza;
    private final zzcir zzb;
    private final zzcjh zzc;
    private final zzcjp zzd = this;
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
    private final zzgwb zzo;
    private final zzgwb zzp;
    private final zzgwb zzq;
    private final zzgwb zzr;
    private final zzgwb zzs;
    private final zzgwb zzt;

    public /* synthetic */ zzcjp(zzcir zzcirVar, zzcjh zzcjhVar, zzcru zzcruVar, zzcqn zzcqnVar, zzcjo zzcjoVar) {
        zzgwb zzgwbVar;
        this.zzb = zzcirVar;
        this.zzc = zzcjhVar;
        this.zza = zzcqnVar;
        zzcry zzcryVar = new zzcry(zzcruVar);
        this.zze = zzcryVar;
        zzcrv zzcrvVar = new zzcrv(zzcruVar);
        this.zzf = zzcrvVar;
        zzgvy zza = zzgvz.zza(0, 2);
        zza.zza(zzcjh.zzo(zzcjhVar));
        zza.zza(zzcjh.zzy(zzcjhVar));
        zzgvz zzc = zza.zzc();
        this.zzg = zzc;
        zzgwb zzc2 = zzgvn.zzc(new zzcwi(zzc));
        this.zzh = zzc2;
        zzgvy zza2 = zzgvz.zza(4, 3);
        zza2.zzb(zzcjh.zzv(zzcjhVar));
        zza2.zzb(zzcjh.zzG(zzcjhVar));
        zza2.zzb(zzcjh.zzI(zzcjhVar));
        zza2.zza(zzcjh.zzp(zzcjhVar));
        zza2.zza(zzcjh.zzN(zzcjhVar));
        zza2.zza(zzcjh.zzz(zzcjhVar));
        zza2.zzb(zzcjh.zzV(zzcjhVar));
        zzgvz zzc3 = zza2.zzc();
        this.zzi = zzc3;
        zzgwb zzc4 = zzgvn.zzc(new zzcwv(zzc3));
        this.zzj = zzc4;
        zzcrw zzcrwVar = new zzcrw(zzcruVar);
        this.zzk = zzcrwVar;
        zzcrx zzcrxVar = new zzcrx(zzcruVar);
        this.zzl = zzcrxVar;
        zzcvc zzcvcVar = new zzcvc(zzcrvVar, zzcrwVar, zzcjh.zzD(zzcjhVar), zzcrxVar, zzcjh.zzT(zzcjhVar));
        this.zzm = zzcvcVar;
        zzgwb zzc5 = zzgvn.zzc(zzczr.zza());
        this.zzn = zzc5;
        zzgvy zza3 = zzgvz.zza(1, 1);
        zza3.zza(zzcjh.zzO(zzcjhVar));
        zza3.zzb(zzcjh.zzA(zzcjhVar));
        zzgvz zzc6 = zza3.zzc();
        this.zzo = zzc6;
        zzcwz zzcwzVar = new zzcwz(zzc6);
        this.zzp = zzcwzVar;
        zzcte zzcteVar = new zzcte(zzcryVar, zzcrvVar, zzc2, zzc4, zzcjh.zzZ(zzcjhVar), zzcvcVar, zzc5, zzcwzVar);
        this.zzq = zzcteVar;
        zzcqp zzcqpVar = new zzcqp(zzcqnVar);
        this.zzr = zzcqpVar;
        zzcqo zzcqoVar = new zzcqo(zzcqnVar);
        this.zzs = zzcqoVar;
        zzgwbVar = zzcirVar.zzp;
        this.zzt = zzgvn.zzc(new zzcqq(zzcteVar, zzcqpVar, zzcqoVar, zzgwbVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcqm
    public final zzcpd zza() {
        zzcql zzcqlVar = (zzcql) this.zzt.zzb();
        zzgvw.zzb(zzcqlVar);
        return zzcqlVar;
    }
}
