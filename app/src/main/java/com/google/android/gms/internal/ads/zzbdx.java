package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbdx {
    private final Context zza;

    public zzbdx(Context context) {
        this.zza = context;
    }

    public final void zza(zzbtf zzbtfVar) {
        String valueOf;
        String str;
        try {
            ((zzbdy) zzbzx.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new zzbzv() { // from class: com.google.android.gms.internal.ads.zzbdw
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzv
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return queryLocalInterface instanceof zzbdy ? (zzbdy) queryLocalInterface : new zzbdy(obj);
                }
            })).zze(zzbtfVar);
        } catch (RemoteException e) {
            valueOf = String.valueOf(e.getMessage());
            str = "Error calling setFlagsAccessedBeforeInitializedListener: ";
            zzbzt.zzj(str.concat(valueOf));
        } catch (zzbzw e2) {
            valueOf = String.valueOf(e2.getMessage());
            str = "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:";
            zzbzt.zzj(str.concat(valueOf));
        }
    }
}
