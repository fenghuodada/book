package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzady extends zzaef {
    public static final Parcelable.Creator<zzady> CREATOR = new zzadx();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzady(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = zzfn.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public zzady(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzady.class == obj.getClass()) {
            zzady zzadyVar = (zzady) obj;
            if (zzfn.zzB(this.zzb, zzadyVar.zzb) && zzfn.zzB(this.zza, zzadyVar.zza) && zzfn.zzB(this.zzc, zzadyVar.zzc)) {
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
        return (((i * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        return str + ": language=" + str2 + ", description=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }
}
