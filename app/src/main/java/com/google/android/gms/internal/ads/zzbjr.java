package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "HttpRequestParcelCreator")
/* loaded from: classes.dex */
public final class zzbjr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbjr> CREATOR = new zzbjs();
    @SafeParcelable.Field(m4845id = 1)
    public final String zza;
    @SafeParcelable.Field(m4845id = 2)
    public final String[] zzb;
    @SafeParcelable.Field(m4845id = 3)
    public final String[] zzc;

    @SafeParcelable.Constructor
    public zzbjr(@SafeParcelable.Param(m4844id = 1) String str, @SafeParcelable.Param(m4844id = 2) String[] strArr, @SafeParcelable.Param(m4844id = 3) String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
