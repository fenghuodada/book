package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbwb;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzav extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbny zzc;
    final /* synthetic */ zzaw zzd;

    public zzav(zzaw zzawVar, Context context, String str, zzbny zzbnyVar) {
        this.zzd = zzawVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbnyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "rewarded");
        return new zzfc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzo(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 231700000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return zzbwb.zza(this.zza, this.zzb, this.zzc);
    }
}
