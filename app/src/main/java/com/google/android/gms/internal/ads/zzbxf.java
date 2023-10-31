package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbxf extends zzbxz {
    private final Clock zzb;
    private final zzbxf zzc = this;
    private final zzgwb zzd;
    private final zzgwb zze;
    private final zzgwb zzf;
    private final zzgwb zzg;
    private final zzgwb zzh;
    private final zzgwb zzi;
    private final zzgwb zzj;
    private final zzgwb zzk;

    public /* synthetic */ zzbxf(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbxy zzbxyVar, zzbxe zzbxeVar) {
        this.zzb = clock;
        zzgvo zza = zzgvp.zza(context);
        this.zzd = zza;
        zzgvo zza2 = zzgvp.zza(zzgVar);
        this.zze = zza2;
        zzgvo zza3 = zzgvp.zza(zzbxyVar);
        this.zzf = zza3;
        this.zzg = zzgvn.zzc(new zzbwx(zza, zza2, zza3));
        zzgvo zza4 = zzgvp.zza(clock);
        this.zzh = zza4;
        zzgwb zzc = zzgvn.zzc(new zzbwz(zza4, zza2, zza3));
        this.zzi = zzc;
        zzbxb zzbxbVar = new zzbxb(zza4, zzc);
        this.zzj = zzbxbVar;
        this.zzk = zzgvn.zzc(new zzbye(zza, zzbxbVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbxz
    public final zzbww zza() {
        return (zzbww) this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbxz
    public final zzbxa zzb() {
        return new zzbxa(this.zzb, (zzbwy) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbxz
    public final zzbyd zzc() {
        return (zzbyd) this.zzk.zzb();
    }
}
