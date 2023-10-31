package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdzx implements zzcww, zzcvl {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzeah zzd;

    public zzdzx(zzeah zzeahVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzeahVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z) {
        int i;
        int intValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfU)).booleanValue() && !this.zzc.zzP()) {
            Object obj = zza;
            synchronized (obj) {
                i = zzb;
                intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfV)).intValue();
            }
            if (i >= intValue) {
                return;
            }
            this.zzd.zzd(z);
            synchronized (obj) {
                zzb++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcww
    public final void zzn() {
        zzb(true);
    }
}
