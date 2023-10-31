package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzbek implements NativeCustomTemplateAd.DisplayOpenMeasurement {
    private final zzbfk zza;

    public zzbek(zzbfk zzbfkVar) {
        this.zza = zzbfkVar;
        try {
            zzbfkVar.zzm();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.zza.zzp(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
            return false;
        }
    }
}
