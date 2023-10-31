package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbry;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbzv;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzbzx;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaa extends zzax {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzaw zzb;

    public zzaa(zzaw zzawVar, Activity activity) {
        this.zzb = zzawVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzm(ObjectWrapper.wrap(this.zza));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbta zzbtaVar;
        zzbrs zzbrsVar;
        zzbbk.zza(this.zza);
        if (!((Boolean) zzba.zzc().zzb(zzbbk.zzjl)).booleanValue()) {
            zzbrsVar = this.zzb.zzf;
            return zzbrsVar.zza(this.zza);
        }
        try {
            return zzbru.zzG(((zzbry) zzbzx.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new zzbzv() { // from class: com.google.android.gms.ads.internal.client.zzz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzv
                public final Object zza(Object obj) {
                    return zzbrx.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza)));
        } catch (RemoteException | zzbzw | NullPointerException e) {
            this.zzb.zzh = zzbsy.zza(this.zza.getApplicationContext());
            zzbtaVar = this.zzb.zzh;
            zzbtaVar.zzf(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
