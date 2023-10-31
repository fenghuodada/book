package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@SafeParcelable.Class(creator = "RtbVersionInfoParcelCreator")
/* loaded from: classes.dex */
public final class zzbqj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbqj> CREATOR = new zzbqk();
    @SafeParcelable.Field(m4845id = 1)
    public final int zza;
    @SafeParcelable.Field(m4845id = 2)
    public final int zzb;
    @SafeParcelable.Field(m4845id = 3)
    public final int zzc;

    @SafeParcelable.Constructor
    public zzbqj(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) int i2, @SafeParcelable.Param(m4844id = 3) int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzbqj zza(VersionInfo versionInfo) {
        return new zzbqj(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbqj)) {
            zzbqj zzbqjVar = (zzbqj) obj;
            if (zzbqjVar.zzc == this.zzc && zzbqjVar.zzb == this.zzb && zzbqjVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        return i + "." + i2 + "." + i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
