package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class zzik {
    final Context zza;
    zzdz zzb;
    zzfpp zzc;
    zzfpp zzd;
    zzfpp zze;
    zzfpp zzf;
    zzfpp zzg;
    zzfon zzh;
    Looper zzi;
    zzk zzj;
    int zzk;
    boolean zzl;
    zzlh zzm;
    long zzn;
    long zzo;
    boolean zzp;
    boolean zzq;
    zzhv zzr;

    public zzik(final Context context, zzcek zzcekVar) {
        zzie zzieVar = new zzie(zzcekVar);
        zzif zzifVar = new zzif(context);
        zzfpp zzfppVar = new zzfpp() { // from class: com.google.android.gms.internal.ads.zzig
            @Override // com.google.android.gms.internal.ads.zzfpp
            public final Object zza() {
                return new zzwv(context);
            }
        };
        zzih zzihVar = new zzfpp() { // from class: com.google.android.gms.internal.ads.zzih
            @Override // com.google.android.gms.internal.ads.zzfpp
            public final Object zza() {
                return new zzhw();
            }
        };
        zzii zziiVar = new zzii(context);
        zzij zzijVar = new zzfon() { // from class: com.google.android.gms.internal.ads.zzij
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                return new zznw((zzdz) obj);
            }
        };
        context.getClass();
        this.zza = context;
        this.zzc = zzieVar;
        this.zzd = zzifVar;
        this.zze = zzfppVar;
        this.zzf = zzihVar;
        this.zzg = zziiVar;
        this.zzh = zzijVar;
        this.zzi = zzfn.zzt();
        this.zzj = zzk.zza;
        this.zzk = 1;
        this.zzl = true;
        this.zzm = zzlh.zze;
        this.zzr = new zzhv(0.97f, 1.03f, 1000L, 1.0E-7f, zzfn.zzo(20L), zzfn.zzo(500L), 0.999f, null);
        this.zzb = zzdz.zza;
        this.zzn = 500L;
        this.zzo = 2000L;
        this.zzp = true;
    }

    public static /* synthetic */ zztk zza(Context context) {
        return new zzsy(context, new zzaaj());
    }
}
