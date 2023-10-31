package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbny;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzak extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbny zzd;
    final /* synthetic */ zzaw zze;

    public zzak(zzaw zzawVar, Context context, zzq zzqVar, String str, zzbny zzbnyVar) {
        this.zze = zzawVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        this.zzd = zzbnyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, FirebaseAnalytics.Event.APP_OPEN);
        return new zzew();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzc(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 231700000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.zze.zza;
        return zzkVar.zza(this.zza, this.zzb, this.zzc, this.zzd, 4);
    }
}
