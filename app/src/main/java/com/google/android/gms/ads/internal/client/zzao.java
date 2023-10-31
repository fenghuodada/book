package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbzv;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzbzx;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzao extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbny zzc;
    final /* synthetic */ zzaw zzd;

    public zzao(zzaw zzawVar, Context context, String str, zzbny zzbnyVar) {
        this.zzd = zzawVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbnyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "native_ad");
        return new zzeu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 231700000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzi zziVar;
        zzbta zzbtaVar;
        zzbbk.zza(this.zza);
        if (!((Boolean) zzba.zzc().zzb(zzbbk.zzjl)).booleanValue()) {
            zziVar = this.zzd.zzb;
            return zziVar.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            IBinder zze = ((zzbr) zzbzx.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new zzbzv() { // from class: com.google.android.gms.ads.internal.client.zzan
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzv
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return queryLocalInterface instanceof zzbr ? (zzbr) queryLocalInterface : new zzbr(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 231700000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(zze);
        } catch (RemoteException | zzbzw | NullPointerException e) {
            this.zzd.zzh = zzbsy.zza(this.zza);
            zzbtaVar = this.zzd.zzh;
            zzbtaVar.zzf(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
