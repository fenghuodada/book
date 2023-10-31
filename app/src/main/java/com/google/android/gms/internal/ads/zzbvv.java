package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbvv extends zzatp implements zzbvw {
    public zzbvv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzg();
        } else if (i == 2) {
            int readInt = parcel.readInt();
            zzatq.zzc(parcel);
            zze(readInt);
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
