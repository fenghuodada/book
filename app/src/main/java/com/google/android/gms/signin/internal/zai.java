package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;

@SafeParcelable.Class(creator = "SignInRequestCreator")
/* loaded from: classes3.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new zaj();
    @SafeParcelable.VersionField(m4842id = 1)
    final int zaa;
    @SafeParcelable.Field(getter = "getResolveAccountRequest", m4845id = 2)
    final zat zab;

    @SafeParcelable.Constructor
    public zai(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) zat zatVar) {
        this.zaa = i;
        this.zab = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
