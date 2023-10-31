package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RequestConfigurationParcelCreator")
/* loaded from: classes.dex */
public final class zzff extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzff> CREATOR = new zzfg();
    @SafeParcelable.Field(m4845id = 1)
    public final int zza;
    @SafeParcelable.Field(m4845id = 2)
    public final int zzb;

    @SafeParcelable.Constructor
    public zzff(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public zzff(RequestConfiguration requestConfiguration) {
        this.zza = requestConfiguration.getTagForChildDirectedTreatment();
        this.zzb = requestConfiguration.getTagForUnderAgeOfConsent();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
