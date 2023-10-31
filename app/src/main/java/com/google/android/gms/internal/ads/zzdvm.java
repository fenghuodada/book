package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class zzdvm extends zzbub {
    final /* synthetic */ zzdvn zza;

    public zzdvm(zzdvn zzdvnVar) {
        this.zza = zzdvnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) {
        this.zza.zza.zze(zzazVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
