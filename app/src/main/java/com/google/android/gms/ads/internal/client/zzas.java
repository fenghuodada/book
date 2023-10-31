package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbzv;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzbzx;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzas extends zzax {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzaw zzd;

    public zzas(zzaw zzawVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzd = zzawVar;
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zzc, "native_ad_view_delegate");
        return new zzez();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzi(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbta zzbtaVar;
        zzbgp zzbgpVar;
        zzbbk.zza(this.zzc);
        if (!((Boolean) zzba.zzc().zzb(zzbbk.zzjl)).booleanValue()) {
            zzbgpVar = this.zzd.zzd;
            return zzbgpVar.zza(this.zzc, this.zza, this.zzb);
        }
        try {
            return zzbet.zzbx(((zzbex) zzbzx.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new zzbzv() { // from class: com.google.android.gms.ads.internal.client.zzar
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzv
                public final Object zza(Object obj) {
                    return zzbew.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 231700000));
        } catch (RemoteException | zzbzw | NullPointerException e) {
            this.zzd.zzh = zzbsy.zza(this.zzc);
            zzbtaVar = this.zzd.zzh;
            zzbtaVar.zzf(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
