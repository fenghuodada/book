package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AppSetIdRequestParamsCreator")
/* loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    @Nullable
    @SafeParcelable.Field(getter = "getVersion", m4845id = 1)
    private final String zza;
    @Nullable
    @SafeParcelable.Field(getter = "getClientAppPackageName", m4845id = 2)
    private final String zzb;

    @SafeParcelable.Constructor
    public zza(@Nullable @SafeParcelable.Param(m4844id = 1) String str, @Nullable @SafeParcelable.Param(m4844id = 2) String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
