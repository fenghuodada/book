package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0484a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaea extends zzaef {
    public static final Parcelable.Creator<zzaea> CREATOR = new zzadz();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzaea(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = zzfn.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.createByteArray();
    }

    public zzaea(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaea.class == obj.getClass()) {
            zzaea zzaeaVar = (zzaea) obj;
            if (zzfn.zzB(this.zza, zzaeaVar.zza) && zzfn.zzB(this.zzb, zzaeaVar.zzb) && zzfn.zzB(this.zzc, zzaeaVar.zzc) && Arrays.equals(this.zzd, zzaeaVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = hashCode + 527;
        String str3 = this.zzc;
        return Arrays.hashCode(this.zzd) + (((((i * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        String str4 = this.zzc;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        return C0484a.m12392a(sb, ", description=", str4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }
}
