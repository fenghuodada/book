package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@SafeParcelable.Class(creator = "SignalConfigurationParcelCreator")
/* loaded from: classes.dex */
public final class zzbyo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbyo> CREATOR = new zzbyp();
    @SafeParcelable.Field(m4845id = 1)
    @Deprecated
    public final String zza;
    @SafeParcelable.Field(m4845id = 2)
    public final String zzb;
    @SafeParcelable.Field(m4845id = 3)
    @Deprecated
    public final com.google.android.gms.ads.internal.client.zzq zzc;
    @SafeParcelable.Field(m4845id = 4)
    public final com.google.android.gms.ads.internal.client.zzl zzd;

    @SafeParcelable.Constructor
    public zzbyo(@SafeParcelable.Param(m4844id = 1) String str, @SafeParcelable.Param(m4844id = 2) String str2, @SafeParcelable.Param(m4844id = 3) com.google.android.gms.ads.internal.client.zzq zzqVar, @SafeParcelable.Param(m4844id = 4) com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = zzlVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
