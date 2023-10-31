package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbra extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbra(zzbei zzbeiVar) {
        try {
            this.zzb = zzbeiVar.zzg();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbeiVar.zzh()) {
                zzbeq zzg = obj instanceof IBinder ? zzbep.zzg((IBinder) obj) : null;
                if (zzg != null) {
                    this.zza.add(new zzbrc(zzg));
                }
            }
        } catch (RemoteException e2) {
            zzbzt.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
