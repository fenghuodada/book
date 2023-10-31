package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AdapterStatusParcelCreator")
/* loaded from: classes.dex */
public final class zzbke extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbke> CREATOR = new zzbkf();
    @SafeParcelable.Field(m4845id = 1)
    public final String zza;
    @SafeParcelable.Field(m4845id = 2)
    public final boolean zzb;
    @SafeParcelable.Field(m4845id = 3)
    public final int zzc;
    @SafeParcelable.Field(m4845id = 4)
    public final String zzd;

    @SafeParcelable.Constructor
    public zzbke(@SafeParcelable.Param(m4844id = 1) String str, @SafeParcelable.Param(m4844id = 2) boolean z, @SafeParcelable.Param(m4844id = 3) int i, @SafeParcelable.Param(m4844id = 4) String str2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
