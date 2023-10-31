package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbpo extends zzatp implements zzbpp {
    public zzbpo() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzbon zzb = zzbom.zzb(parcel.readStrongBinder());
            zzatq.zzc(parcel);
            zzg(zzb);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzatq.zzc(parcel);
            zze(readString);
        } else if (i != 3) {
            return false;
        } else {
            zzatq.zzc(parcel);
            zzf((com.google.android.gms.ads.internal.client.zze) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
