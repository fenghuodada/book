package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "InterstitialAdParameterParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    @SafeParcelable.Field(m4845id = 2)
    public final boolean zza;
    @SafeParcelable.Field(m4845id = 3)
    public final boolean zzb;
    @SafeParcelable.Field(m4845id = 4)
    public final String zzc;
    @SafeParcelable.Field(m4845id = 5)
    public final boolean zzd;
    @SafeParcelable.Field(m4845id = 6)
    public final float zze;
    @SafeParcelable.Field(m4845id = 7)
    public final int zzf;
    @SafeParcelable.Field(m4845id = 8)
    public final boolean zzg;
    @SafeParcelable.Field(m4845id = 9)
    public final boolean zzh;
    @SafeParcelable.Field(m4845id = 10)
    public final boolean zzi;

    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param(m4844id = 2) boolean z, @SafeParcelable.Param(m4844id = 3) boolean z2, @SafeParcelable.Param(m4844id = 4) String str, @SafeParcelable.Param(m4844id = 5) boolean z3, @SafeParcelable.Param(m4844id = 6) float f, @SafeParcelable.Param(m4844id = 7) int i, @SafeParcelable.Param(m4844id = 8) boolean z4, @SafeParcelable.Param(m4844id = 9) boolean z5, @SafeParcelable.Param(m4844id = 10) boolean z6) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = f;
        this.zzf = i;
        this.zzg = z4;
        this.zzh = z5;
        this.zzi = z6;
    }

    public zzj(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, -1, z4, z5, z6);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeFloat(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
