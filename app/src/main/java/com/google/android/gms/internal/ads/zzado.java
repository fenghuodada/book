package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.adcolony.sdk.C2362x3;

/* loaded from: classes.dex */
public final class zzado implements zzbz {
    public static final Parcelable.Creator<zzado> CREATOR = new zzadn();
    public final int zza;
    @Nullable
    public final String zzb;
    @Nullable
    public final String zzc;
    @Nullable
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzado(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        zzdy.zzd(z2);
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = i2;
    }

    public zzado(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        int i = zzfn.zza;
        this.zze = parcel.readInt() != 0;
        this.zzf = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzado.class == obj.getClass()) {
            zzado zzadoVar = (zzado) obj;
            if (this.zza == zzadoVar.zza && zzfn.zzB(this.zzb, zzadoVar.zzb) && zzfn.zzB(this.zzc, zzadoVar.zzc) && zzfn.zzB(this.zzd, zzadoVar.zzd) && this.zze == zzadoVar.zze && this.zzf == zzadoVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza + 527;
        String str = this.zzb;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = i * 31;
        String str2 = this.zzc;
        int hashCode2 = (((i2 + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.zzd;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zzb;
        int i = this.zza;
        int i2 = this.zzf;
        StringBuilder m9460b = C2362x3.m9460b("IcyHeaders: name=\"", str, "\", genre=\"", str2, "\", bitrate=");
        m9460b.append(i);
        m9460b.append(", metadataInterval=");
        m9460b.append(i2);
        return m9460b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        boolean z = this.zze;
        int i2 = zzfn.zza;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbz
    public final void zza(zzbu zzbuVar) {
        String str = this.zzc;
        if (str != null) {
            zzbuVar.zzp(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzbuVar.zzi(str2);
        }
    }
}
