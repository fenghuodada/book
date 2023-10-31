package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzcdf extends com.google.android.gms.ads.internal.util.zzb {
    final zzccc zza;
    final zzcdn zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcdf(zzccc zzcccVar, zzcdn zzcdnVar, String str, String[] strArr) {
        this.zza = zzcccVar;
        this.zzb = zzcdnVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzy().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcde(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final zzfwb zzb() {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbP)).booleanValue() && (this.zzb instanceof zzcdw)) ? zzcag.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcdd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcdf.this.zzd();
            }
        }) : super.zzb();
    }

    public final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
