package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0406q1;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzac implements Parcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzab();
    public final UUID zza;
    @Nullable
    public final String zzb;
    public final String zzc;
    @Nullable
    public final byte[] zzd;
    private int zze;

    public zzac(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        int i = zzfn.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    public zzac(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzac) {
            if (obj == this) {
                return true;
            }
            zzac zzacVar = (zzac) obj;
            return zzfn.zzB(this.zzb, zzacVar.zzb) && zzfn.zzB(this.zzc, zzacVar.zzc) && zzfn.zzB(this.zza, zzacVar.zza) && Arrays.equals(this.zzd, zzacVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.zze;
        if (i == 0) {
            int hashCode2 = this.zza.hashCode() * 31;
            String str = this.zzb;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int m12537a = C0406q1.m12537a(this.zzc, (hashCode2 + hashCode) * 31, 31) + Arrays.hashCode(this.zzd);
            this.zze = m12537a;
            return m12537a;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }
}
