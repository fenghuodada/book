package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class zzdxs extends zzbty {
    final /* synthetic */ zzdxt zza;

    public zzdxs(zzdxt zzdxtVar) {
        this.zza = zzdxtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) {
        this.zza.zza.zze(zzazVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
