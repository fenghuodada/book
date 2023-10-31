package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "HttpResponseParcelCreator")
/* loaded from: classes.dex */
public final class zzbjt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbjt> CREATOR = new zzbju();
    @SafeParcelable.Field(m4845id = 1)
    public final boolean zza;
    @SafeParcelable.Field(m4845id = 2)
    public final String zzb;
    @SafeParcelable.Field(m4845id = 3)
    public final int zzc;
    @SafeParcelable.Field(m4845id = 4)
    public final byte[] zzd;
    @SafeParcelable.Field(m4845id = 5)
    public final String[] zze;
    @SafeParcelable.Field(m4845id = 6)
    public final String[] zzf;
    @SafeParcelable.Field(m4845id = 7)
    public final boolean zzg;
    @SafeParcelable.Field(m4845id = 8)
    public final long zzh;

    @SafeParcelable.Constructor
    public zzbjt(@SafeParcelable.Param(m4844id = 1) boolean z, @SafeParcelable.Param(m4844id = 2) String str, @SafeParcelable.Param(m4844id = 3) int i, @SafeParcelable.Param(m4844id = 4) byte[] bArr, @SafeParcelable.Param(m4844id = 5) String[] strArr, @SafeParcelable.Param(m4844id = 6) String[] strArr2, @SafeParcelable.Param(m4844id = 7) boolean z2, @SafeParcelable.Param(m4844id = 8) long j) {
        this.zza = z;
        this.zzb = str;
        this.zzc = i;
        this.zzd = bArr;
        this.zze = strArr;
        this.zzf = strArr2;
        this.zzg = z2;
        this.zzh = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.zze, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
