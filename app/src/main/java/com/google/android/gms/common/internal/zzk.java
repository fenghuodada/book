package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConnectionInfoCreator")
/* loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    @SafeParcelable.Field(m4845id = 1)
    Bundle zza;
    @SafeParcelable.Field(m4845id = 2)
    Feature[] zzb;
    @SafeParcelable.Field(defaultValue = "0", m4845id = 3)
    int zzc;
    @Nullable
    @SafeParcelable.Field(m4845id = 4)
    ConnectionTelemetryConfiguration zzd;

    public zzk() {
    }

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(m4844id = 1) Bundle bundle, @SafeParcelable.Param(m4844id = 2) Feature[] featureArr, @SafeParcelable.Param(m4844id = 3) int i, @Nullable @SafeParcelable.Param(m4844id = 4) ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.zza = bundle;
        this.zzb = featureArr;
        this.zzc = i;
        this.zzd = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
