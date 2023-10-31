package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzchd implements zzgvo {
    private final zzcgz zza;

    public zzchd(zzcgz zzcgzVar) {
        this.zza = zzcgzVar;
    }

    public final WeakReference zza() {
        WeakReference zzf = this.zza.zzf();
        zzgvw.zzb(zzf);
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* synthetic */ Object zzb() {
        WeakReference zzf = this.zza.zzf();
        zzgvw.zzb(zzf);
        return zzf;
    }
}
