package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class zzaem implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        String readString2 = parcel.readString();
        String[] createStringArray = parcel.createStringArray();
        createStringArray.getClass();
        return new zzaen(readString, readString2, zzfrr.zzk(createStringArray));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaen[i];
    }
}
