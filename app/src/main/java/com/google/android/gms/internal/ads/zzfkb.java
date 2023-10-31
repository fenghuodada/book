package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GassRequestParcelCreator")
/* loaded from: classes.dex */
public final class zzfkb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfkb> CREATOR = new zzfkc();
    @SafeParcelable.VersionField(m4842id = 1)
    public final int zza;
    @SafeParcelable.Field(m4845id = 2)
    public final String zzb;
    @SafeParcelable.Field(m4845id = 3)
    public final String zzc;

    @SafeParcelable.Constructor
    public zzfkb(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) String str, @SafeParcelable.Param(m4844id = 3) String str2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
    }

    public zzfkb(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
