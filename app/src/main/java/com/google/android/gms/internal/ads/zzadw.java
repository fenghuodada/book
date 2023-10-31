package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzadw extends zzaef {
    public static final Parcelable.Creator<zzadw> CREATOR = new zzadv();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzaef[] zze;

    public zzadw(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = zzfn.zza;
        this.zza = readString;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.zze = new zzaef[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zze[i2] = (zzaef) parcel.readParcelable(zzaef.class.getClassLoader());
        }
    }

    public zzadw(String str, boolean z, boolean z2, String[] strArr, zzaef[] zzaefVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzaefVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadw.class == obj.getClass()) {
            zzadw zzadwVar = (zzadw) obj;
            if (this.zzb == zzadwVar.zzb && this.zzc == zzadwVar.zzc && zzfn.zzB(this.zza, zzadwVar.zza) && Arrays.equals(this.zzd, zzadwVar.zzd) && Arrays.equals(this.zze, zzadwVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0);
        String str = this.zza;
        return (i * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzaef zzaefVar : this.zze) {
            parcel.writeParcelable(zzaefVar, 0);
        }
    }
}
