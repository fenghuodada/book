package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdll implements zzbii {
    @Nullable
    private final zzbfu zza;
    private final zzdlz zzb;
    private final zzgvi zzc;

    public zzdll(zzdhn zzdhnVar, zzdhc zzdhcVar, zzdlz zzdlzVar, zzgvi zzgviVar) {
        this.zza = zzdhnVar.zzc(zzdhcVar.zzz());
        this.zzb = zzdlzVar;
        this.zzc = zzgviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbfk) this.zzc.zzb(), str);
        } catch (RemoteException e) {
            zzbzt.zzk("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzi("/nativeAdCustomClick", this);
    }
}
