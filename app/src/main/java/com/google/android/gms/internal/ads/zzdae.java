package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdae implements zzcyd {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbd)).intValue();

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final synchronized void zzb(zzezr zzezrVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbe)).booleanValue()) {
            try {
                this.zza = zzezrVar.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzbA(zzbug zzbugVar) {
    }

    public final synchronized int zzc() {
        return this.zza;
    }
}
