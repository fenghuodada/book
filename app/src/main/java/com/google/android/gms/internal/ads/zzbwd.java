package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@SafeParcelable.Class(creator = "ServerSideVerificationOptionsParcelCreator")
/* loaded from: classes.dex */
public final class zzbwd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbwd> CREATOR = new zzbwe();
    @SafeParcelable.Field(m4845id = 1)
    public final String zza;
    @SafeParcelable.Field(m4845id = 2)
    public final String zzb;

    public zzbwd(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    @SafeParcelable.Constructor
    public zzbwd(@SafeParcelable.Param(m4844id = 1) String str, @SafeParcelable.Param(m4844id = 2) String str2) {
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
