package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzv;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzbzx;

/* loaded from: classes.dex */
public final class zzk extends RemoteCreator {
    private zzbta zza;

    @VisibleForTesting
    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzbv ? (zzbv) queryLocalInterface : new zzbv(iBinder);
    }

    @Nullable
    public final zzbu zza(Context context, zzq zzqVar, String str, zzbny zzbnyVar, int i) {
        zzbbk.zza(context);
        if (!((Boolean) zzba.zzc().zzb(zzbbk.zzjl)).booleanValue()) {
            try {
                IBinder zze = ((zzbv) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzqVar, str, zzbnyVar, 231700000, i);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(zze);
            } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
                zzbzt.zzf("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzbv) zzbzx.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new zzbzv() { // from class: com.google.android.gms.ads.internal.client.zzj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzv
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return queryLocalInterface2 instanceof zzbv ? (zzbv) queryLocalInterface2 : new zzbv(obj);
                }
            })).zze(ObjectWrapper.wrap(context), zzqVar, str, zzbnyVar, 231700000, i);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof zzbu ? (zzbu) queryLocalInterface2 : new zzbs(zze2);
        } catch (RemoteException | zzbzw | NullPointerException e2) {
            zzbta zza = zzbsy.zza(context);
            this.zza = zza;
            zza.zzf(e2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            zzbzt.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
