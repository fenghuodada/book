package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ResolveAccountRequestCreator")
/* loaded from: classes.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new zau();
    @SafeParcelable.VersionField(m4842id = 1)
    final int zaa;
    @SafeParcelable.Field(getter = "getAccount", m4845id = 2)
    private final Account zab;
    @SafeParcelable.Field(getter = "getSessionId", m4845id = 3)
    private final int zac;
    @Nullable
    @SafeParcelable.Field(getter = "getSignInAccountHint", m4845id = 4)
    private final GoogleSignInAccount zad;

    @SafeParcelable.Constructor
    public zat(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) Account account, @SafeParcelable.Param(m4844id = 3) int i2, @Nullable @SafeParcelable.Param(m4844id = 4) GoogleSignInAccount googleSignInAccount) {
        this.zaa = i;
        this.zab = account;
        this.zac = i2;
        this.zad = googleSignInAccount;
    }

    public zat(Account account, int i, @Nullable GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zad, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
