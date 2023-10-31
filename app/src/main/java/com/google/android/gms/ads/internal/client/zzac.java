package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbzv;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzbzx;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzac extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbny zzb;

    public zzac(zzaw zzawVar, Context context, zzbny zzbnyVar) {
        this.zza = context;
        this.zzb = zzbnyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zza);
        zzbbk.zza(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbbk.zziO)).booleanValue()) {
            return zzceVar.zzh(wrap, this.zzb, 231700000);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zza);
        zzbbk.zza(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbbk.zziO)).booleanValue()) {
            try {
                return ((zzdk) zzbzx.zzb(this.zza, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new zzbzv() { // from class: com.google.android.gms.ads.internal.client.zzab
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzbzv
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        return queryLocalInterface instanceof zzdk ? (zzdk) queryLocalInterface : new zzdk(obj);
                    }
                })).zze(wrap, this.zzb, 231700000);
            } catch (RemoteException | zzbzw | NullPointerException e) {
                zzbsy.zza(this.zza).zzf(e, "ClientApiBroker.getOutOfContextTester");
                return null;
            }
        }
        return null;
    }
}
