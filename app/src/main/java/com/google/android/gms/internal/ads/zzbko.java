package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "MediationConfigurationParcelCreator")
/* loaded from: classes.dex */
public final class zzbko extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbko> CREATOR = new zzbkp();
    @SafeParcelable.Field(m4845id = 1)
    public final String zza;
    @SafeParcelable.Field(m4845id = 2)
    public final Bundle zzb;

    @SafeParcelable.Constructor
    public zzbko(@SafeParcelable.Param(m4844id = 1) String str, @SafeParcelable.Param(m4844id = 2) Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
