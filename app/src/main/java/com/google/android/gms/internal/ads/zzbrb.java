package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzbrb implements NativeCustomFormatAd.DisplayOpenMeasurement {
    private final zzbfk zza;

    public zzbrb(zzbfk zzbfkVar) {
        this.zza = zzbfkVar;
        try {
            zzbfkVar.zzm();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.zza.zzp(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
            return false;
        }
    }
}
