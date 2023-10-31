package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes.dex */
public final class zzbrs extends RemoteCreator {
    public zzbrs() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzbry ? (zzbry) queryLocalInterface : new zzbrw(iBinder);
    }

    @Nullable
    public final zzbrv zza(Activity activity) {
        try {
            IBinder zze = ((zzbry) getRemoteCreatorInstance(activity)).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzbrv ? (zzbrv) queryLocalInterface : new zzbrt(zze);
        } catch (RemoteException e) {
            zzbzt.zzk("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzbzt.zzk("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
