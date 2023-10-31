package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;

/* loaded from: classes.dex */
public abstract class zzbm extends zzatp implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String zze;
        if (i != 1) {
            if (i == 2) {
                zze = zze();
            } else if (i == 3) {
                boolean zzi = zzi();
                parcel2.writeNoException();
                int i3 = zzatq.zza;
                parcel2.writeInt(zzi ? 1 : 0);
                return true;
            } else if (i == 4) {
                zze = zzf();
            } else if (i != 5) {
                return false;
            } else {
                int readInt = parcel.readInt();
                zzatq.zzc(parcel);
                zzh((zzl) zzatq.zza(parcel, zzl.CREATOR), readInt);
            }
            parcel2.writeNoException();
            parcel2.writeString(zze);
            return true;
        }
        zzatq.zzc(parcel);
        zzg((zzl) zzatq.zza(parcel, zzl.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
