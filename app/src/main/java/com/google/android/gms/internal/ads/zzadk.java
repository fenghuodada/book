package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.provider.C0758e;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzadk implements zzbz {
    public static final Parcelable.Creator<zzadk> CREATOR = new zzadj();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzadk(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    public zzadk(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i = zzfn.zza;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }

    public static zzadk zzb(zzfd zzfdVar) {
        int zze = zzfdVar.zze();
        String zzx = zzfdVar.zzx(zzfdVar.zze(), zzfol.zza);
        String zzx2 = zzfdVar.zzx(zzfdVar.zze(), zzfol.zzc);
        int zze2 = zzfdVar.zze();
        int zze3 = zzfdVar.zze();
        int zze4 = zzfdVar.zze();
        int zze5 = zzfdVar.zze();
        int zze6 = zzfdVar.zze();
        byte[] bArr = new byte[zze6];
        zzfdVar.zzB(bArr, 0, zze6);
        return new zzadk(zze, zzx, zzx2, zze2, zze3, zze4, zze5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadk.class == obj.getClass()) {
            zzadk zzadkVar = (zzadk) obj;
            if (this.zza == zzadkVar.zza && this.zzb.equals(zzadkVar.zzb) && this.zzc.equals(zzadkVar.zzc) && this.zzd == zzadkVar.zzd && this.zze == zzadkVar.zze && this.zzf == zzadkVar.zzf && this.zzg == zzadkVar.zzg && Arrays.equals(this.zzh, zzadkVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        return C0758e.m11827a("Picture: mimeType=", this.zzb, ", description=", this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzbz
    public final void zza(zzbu zzbuVar) {
        zzbuVar.zza(this.zzh, this.zza);
    }
}
