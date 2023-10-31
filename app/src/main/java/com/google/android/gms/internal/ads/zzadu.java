package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzadu extends zzaef {
    public static final Parcelable.Creator<zzadu> CREATOR = new zzadt();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzaef[] zzg;

    public zzadu(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = zzfn.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzaef[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zzg[i2] = (zzaef) parcel.readParcelable(zzaef.class.getClassLoader());
        }
    }

    public zzadu(String str, int i, int i2, long j, long j2, zzaef[] zzaefVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzaefVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaef, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadu.class == obj.getClass()) {
            zzadu zzaduVar = (zzadu) obj;
            if (this.zzb == zzaduVar.zzb && this.zzc == zzaduVar.zzc && this.zzd == zzaduVar.zzd && this.zze == zzaduVar.zze && zzfn.zzB(this.zza, zzaduVar.zza) && Arrays.equals(this.zzg, zzaduVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.zzb + 527) * 31) + this.zzc;
        int i2 = (int) this.zzd;
        int i3 = (int) this.zze;
        String str = this.zza;
        return (((((i * 31) + i2) * 31) + i3) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzaef zzaefVar : this.zzg) {
            parcel.writeParcelable(zzaefVar, 0);
        }
    }
}
