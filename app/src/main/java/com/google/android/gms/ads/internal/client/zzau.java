package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbez;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbzv;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzbzx;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzau extends zzax {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzaw zzd;

    public zzau(zzaw zzawVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzd = zzawVar;
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfa();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbta zzbtaVar;
        zzbgq zzbgqVar;
        zzbbk.zza(this.zza.getContext());
        if (!((Boolean) zzba.zzc().zzb(zzbbk.zzjl)).booleanValue()) {
            zzbgqVar = this.zzd.zzg;
            return zzbgqVar.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            return zzbez.zze(((zzbfd) zzbzx.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new zzbzv() { // from class: com.google.android.gms.ads.internal.client.zzat
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzv
                public final Object zza(Object obj) {
                    return zzbfc.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
        } catch (RemoteException | zzbzw | NullPointerException e) {
            this.zzd.zzh = zzbsy.zza(this.zza.getContext());
            zzbtaVar = this.zzd.zzh;
            zzbtaVar.zzf(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
