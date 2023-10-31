package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "ProgramResponseCreator")
/* loaded from: classes.dex */
public final class zzfkm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfkm> CREATOR = new zzfkn();
    @SafeParcelable.VersionField(m4842id = 1)
    public final int zza;
    @SafeParcelable.Field(m4845id = 2)
    public final byte[] zzb;
    @SafeParcelable.Field(m4845id = 3)
    public final int zzc;

    @SafeParcelable.Constructor
    public zzfkm(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) byte[] bArr, @SafeParcelable.Param(m4844id = 3) int i2) {
        this.zza = i;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i2;
    }

    public zzfkm(byte[] bArr, int i) {
        this(1, null, 1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
