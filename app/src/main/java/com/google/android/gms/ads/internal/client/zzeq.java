package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbzt;

/* loaded from: classes.dex */
public final class zzeq extends RemoteCreator {
    public zzeq() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof zzcp ? (zzcp) queryLocalInterface : new zzcp(iBinder);
    }

    @Nullable
    public final zzco zza(Context context) {
        try {
            IBinder zze = ((zzcp) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), 231700000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(zze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzbzt.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
