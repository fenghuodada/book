package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzadh implements zzbz {
    public static final Parcelable.Creator<zzadh> CREATOR;
    private static final zzam zzf;
    private static final zzam zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zzS("application/id3");
        zzf = zzakVar.zzY();
        zzak zzakVar2 = new zzak();
        zzakVar2.zzS("application/x-scte35");
        zzg = zzakVar2.zzY();
        CREATOR = new zzadg();
    }

    public zzadh(Parcel parcel) {
        String readString = parcel.readString();
        int i = zzfn.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }

    public zzadh(String str, String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadh.class == obj.getClass()) {
            zzadh zzadhVar = (zzadh) obj;
            if (this.zzc == zzadhVar.zzc && this.zzd == zzadhVar.zzd && zzfn.zzB(this.zza, zzadhVar.zza) && zzfn.zzB(this.zzb, zzadhVar.zzb) && Arrays.equals(this.zze, zzadhVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i == 0) {
            String str = this.zza;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.zzb;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.zzc;
            long j2 = this.zzd;
            int hashCode3 = ((((((((hashCode + 527) * 31) + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.zze);
            this.zzh = hashCode3;
            return hashCode3;
        }
        return i;
    }

    public final String toString() {
        String str = this.zza;
        long j = this.zzd;
        long j2 = this.zzc;
        String str2 = this.zzb;
        return "EMSG: scheme=" + str + ", id=" + j + ", durationMs=" + j2 + ", value=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbz
    public final /* synthetic */ void zza(zzbu zzbuVar) {
    }
}
