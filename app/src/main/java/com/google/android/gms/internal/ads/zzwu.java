package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzwu extends zzwr {
    private final boolean zze;
    private final zzwj zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:139:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzwu(int r5, com.google.android.gms.internal.ads.zzcz r6, int r7, com.google.android.gms.internal.ads.zzwj r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwu.<init>(int, com.google.android.gms.internal.ads.zzcz, int, com.google.android.gms.internal.ads.zzwj, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzwu zzwuVar, zzwu zzwuVar2) {
        zzfta zzftaVar;
        zzfta zza;
        zzfta zzftaVar2;
        if (zzwuVar.zze && zzwuVar.zzh) {
            zza = zzwv.zzc;
        } else {
            zzftaVar = zzwv.zzc;
            zza = zzftaVar.zza();
        }
        zzfrg zzj = zzfrg.zzj();
        Integer valueOf = Integer.valueOf(zzwuVar.zzi);
        Integer valueOf2 = Integer.valueOf(zzwuVar2.zzi);
        boolean z = zzwuVar.zzf.zzz;
        zzftaVar2 = zzwv.zzd;
        return zzj.zzc(valueOf, valueOf2, zzftaVar2).zzc(Integer.valueOf(zzwuVar.zzj), Integer.valueOf(zzwuVar2.zzj), zza).zzc(Integer.valueOf(zzwuVar.zzi), Integer.valueOf(zzwuVar2.zzi), zza).zza();
    }

    public static /* synthetic */ int zzd(zzwu zzwuVar, zzwu zzwuVar2) {
        zzfrg zzc = zzfrg.zzj().zzd(zzwuVar.zzh, zzwuVar2.zzh).zzb(zzwuVar.zzl, zzwuVar2.zzl).zzd(true, true).zzd(zzwuVar.zze, zzwuVar2.zze).zzd(zzwuVar.zzg, zzwuVar2.zzg).zzc(Integer.valueOf(zzwuVar.zzk), Integer.valueOf(zzwuVar2.zzk), zzfta.zzc().zza());
        boolean z = zzwuVar.zzo;
        zzfrg zzd = zzc.zzd(z, zzwuVar2.zzo);
        boolean z2 = zzwuVar.zzp;
        zzfrg zzd2 = zzd.zzd(z2, zzwuVar2.zzp);
        if (z && z2) {
            zzd2 = zzd2.zzb(zzwuVar.zzq, zzwuVar2.zzq);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final /* bridge */ /* synthetic */ boolean zzc(zzwr zzwrVar) {
        zzwu zzwuVar = (zzwu) zzwrVar;
        if (zzfn.zzB(this.zzd.zzm, zzwuVar.zzd.zzm)) {
            boolean z = this.zzf.zzJ;
            return this.zzo == zzwuVar.zzo && this.zzp == zzwuVar.zzp;
        }
        return false;
    }
}
