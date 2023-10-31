package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzadq extends zzaef {
    public static final Parcelable.Creator<zzadq> CREATOR = new zzadp();
    public final String zza;
    @Nullable
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzadq(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = zzfn.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public zzadq(String str, @Nullable String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadq.class == obj.getClass()) {
            zzadq zzadqVar = (zzadq) obj;
            if (this.zzc == zzadqVar.zzc && zzfn.zzB(this.zza, zzadqVar.zza) && zzfn.zzB(this.zzb, zzadqVar.zzb) && Arrays.equals(this.zzd, zzadqVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzc + 527;
        String str = this.zza;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = i * 31;
        String str2 = this.zzb;
        return Arrays.hashCode(this.zzd) + ((((i2 + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        return str + ": mimeType=" + str2 + ", description=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaef, com.google.android.gms.internal.ads.zzbz
    public final void zza(zzbu zzbuVar) {
        zzbuVar.zza(this.zzd, this.zzc);
    }
}
