package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes.dex */
public final class zzbgp extends RemoteCreator {
    @VisibleForTesting
    public zzbgp() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof zzbex ? (zzbex) queryLocalInterface : new zzbev(iBinder);
    }

    @Nullable
    public final zzbeu zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder zze = ((zzbex) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(frameLayout), ObjectWrapper.wrap(frameLayout2), 231700000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof zzbeu ? (zzbeu) queryLocalInterface : new zzbes(zze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzbzt.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
