package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@SafeParcelable.Class(creator = "LiteSdkVersionsParcelCreator")
/* loaded from: classes.dex */
public final class zzen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzen> CREATOR = new zzeo();
    @SafeParcelable.Field(getter = "getAdsDynamiteVersion", m4845id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getSdkVersionLite", m4845id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getGranularVersion", m4845id = 3)
    private final String zzc;

    public zzen() {
        this(ModuleDescriptor.MODULE_VERSION, 231700000, "22.2.0");
    }

    @SafeParcelable.Constructor
    public zzen(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) int i2, @SafeParcelable.Param(m4844id = 3) String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }
}
