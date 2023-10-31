package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0486c;

/* loaded from: classes.dex */
public final class zzaev implements zzbz {
    public static final Parcelable.Creator<zzaev> CREATOR = new zzaet();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzaev(long j, long j2, long j3, long j4, long j5) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
    }

    public /* synthetic */ zzaev(Parcel parcel, zzaeu zzaeuVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaev.class == obj.getClass()) {
            zzaev zzaevVar = (zzaev) obj;
            if (this.zza == zzaevVar.zza && this.zzb == zzaevVar.zzb && this.zzc == zzaevVar.zzc && this.zzd == zzaevVar.zzd && this.zze == zzaevVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        long j2 = j ^ (j >>> 32);
        long j3 = this.zzb;
        long j4 = j3 ^ (j3 >>> 32);
        long j5 = this.zzc;
        long j6 = j5 ^ (j5 >>> 32);
        long j7 = this.zzd;
        long j8 = j7 ^ (j7 >>> 32);
        long j9 = this.zze;
        return ((((((((((int) j2) + 527) * 31) + ((int) j4)) * 31) + ((int) j6)) * 31) + ((int) j8)) * 31) + ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        long j = this.zza;
        long j2 = this.zzb;
        long j3 = this.zzc;
        long j4 = this.zzd;
        long j5 = this.zze;
        StringBuilder m12390a = C0486c.m12390a("Motion photo metadata: photoStartPosition=", j, ", photoSize=");
        m12390a.append(j2);
        m12390a.append(", photoPresentationTimestampUs=");
        m12390a.append(j3);
        m12390a.append(", videoStartPosition=");
        m12390a.append(j4);
        m12390a.append(", videoSize=");
        m12390a.append(j5);
        return m12390a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbz
    public final /* synthetic */ void zza(zzbu zzbuVar) {
    }
}
