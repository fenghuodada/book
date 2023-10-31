package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbpi extends zzatp implements zzbpj {
    public zzbpi() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzatq.zzc(parcel);
            zzg(asInterface);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzatq.zzc(parcel);
            zze(readString);
        } else if (i == 3) {
            zzatq.zzc(parcel);
            zzf((com.google.android.gms.ads.internal.client.zze) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            zzboh zzb = zzbog.zzb(parcel.readStrongBinder());
            zzatq.zzc(parcel);
            zzh(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
