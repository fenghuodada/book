package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzbgq extends RemoteCreator {
    @VisibleForTesting
    public zzbgq() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof zzbfd ? (zzbfd) queryLocalInterface : new zzbfb(iBinder);
    }

    @Nullable
    public final zzbfa zza(View view, HashMap hashMap, HashMap hashMap2) {
        try {
            IBinder zze = ((zzbfd) getRemoteCreatorInstance(view.getContext())).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(hashMap), ObjectWrapper.wrap(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof zzbfa ? (zzbfa) queryLocalInterface : new zzbey(zze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzbzt.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
