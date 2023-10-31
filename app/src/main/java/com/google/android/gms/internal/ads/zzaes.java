package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.provider.C0758e;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaes implements zzbz {
    public static final Parcelable.Creator<zzaes> CREATOR = new zzaeq();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public /* synthetic */ zzaes(Parcel parcel, zzaer zzaerVar) {
        String readString = parcel.readString();
        int i = zzfn.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }

    public zzaes(String str, byte[] bArr, int i, int i2) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaes.class == obj.getClass()) {
            zzaes zzaesVar = (zzaes) obj;
            if (this.zza.equals(zzaesVar.zza) && Arrays.equals(this.zzb, zzaesVar.zzb) && this.zzc == zzaesVar.zzc && this.zzd == zzaesVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        String str = this.zza;
        byte[] bArr = this.zzb;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i] & 15, 16));
        }
        return C0758e.m11827a("mdta: key=", str, ", value=", sb.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbz
    public final /* synthetic */ void zza(zzbu zzbuVar) {
    }
}
