package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbys implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcal zzb;

    public zzbys(zzbyt zzbytVar, Context context, zzcal zzcalVar) {
        this.zza = context;
        this.zzb = zzcalVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzd(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzb.zze(e);
            zzbzt.zzh("Exception while getting advertising Id info", e);
        }
    }
}
