package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleSignInOptionsExtensionCreator")
/* loaded from: classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();
    @SafeParcelable.VersionField(m4842id = 1)
    final int zaa;
    @SafeParcelable.Field(getter = "getType", m4845id = 2)
    private int zab;
    @SafeParcelable.Field(getter = "getBundle", m4845id = 3)
    private Bundle zac;

    @SafeParcelable.Constructor
    public GoogleSignInOptionsExtensionParcelable(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) int i2, @SafeParcelable.Param(m4844id = 3) Bundle bundle) {
        this.zaa = i;
        this.zab = i2;
        this.zac = bundle;
    }

    public GoogleSignInOptionsExtensionParcelable(@NonNull GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        this(1, googleSignInOptionsExtension.getExtensionType(), googleSignInOptionsExtension.toBundle());
    }

    @KeepForSdk
    public int getType() {
        return this.zab;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeInt(parcel, 2, getType());
        SafeParcelWriter.writeBundle(parcel, 3, this.zac, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
