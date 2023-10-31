package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzbwb {
    @Nullable
    public static final zzbvp zza(Context context, String str, zzbny zzbnyVar) {
        try {
            IBinder zze = ((zzbvt) zzbzx.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzbzv() { // from class: com.google.android.gms.internal.ads.zzbwa
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzv
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return queryLocalInterface instanceof zzbvt ? (zzbvt) queryLocalInterface : new zzbvt(obj);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzbnyVar, 231700000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzbvp ? (zzbvp) queryLocalInterface : new zzbvn(zze);
        } catch (RemoteException | zzbzw e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
