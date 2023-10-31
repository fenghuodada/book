package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StringToIntConverterEntryCreator")
/* loaded from: classes.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new zae();
    @SafeParcelable.VersionField(m4842id = 1)
    final int zaa;
    @SafeParcelable.Field(m4845id = 2)
    final String zab;
    @SafeParcelable.Field(m4845id = 3)
    final int zac;

    @SafeParcelable.Constructor
    public zac(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) String str, @SafeParcelable.Param(m4844id = 3) int i2) {
        this.zaa = i;
        this.zab = str;
        this.zac = i2;
    }

    public zac(String str, int i) {
        this.zaa = 1;
        this.zab = str;
        this.zac = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeString(parcel, 2, this.zab, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
