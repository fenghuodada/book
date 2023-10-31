package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.content.C0663f;
import com.applovin.impl.sdk.p033e.C3132a0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzca implements Parcelable {
    public static final Parcelable.Creator<zzca> CREATOR = new zzby();
    public final long zza;
    private final zzbz[] zzb;

    public zzca(long j, zzbz... zzbzVarArr) {
        this.zza = j;
        this.zzb = zzbzVarArr;
    }

    public zzca(Parcel parcel) {
        this.zzb = new zzbz[parcel.readInt()];
        int i = 0;
        while (true) {
            zzbz[] zzbzVarArr = this.zzb;
            if (i >= zzbzVarArr.length) {
                this.zza = parcel.readLong();
                return;
            } else {
                zzbzVarArr[i] = (zzbz) parcel.readParcelable(zzbz.class.getClassLoader());
                i++;
            }
        }
    }

    public zzca(List list) {
        this(-9223372036854775807L, (zzbz[]) list.toArray(new zzbz[0]));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzca.class == obj.getClass()) {
            zzca zzcaVar = (zzca) obj;
            if (Arrays.equals(this.zzb, zzcaVar.zzb) && this.zza == zzcaVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        return (Arrays.hashCode(this.zzb) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String m7696a;
        String arrays = Arrays.toString(this.zzb);
        long j = this.zza;
        if (j == -9223372036854775807L) {
            m7696a = "";
        } else {
            m7696a = C3132a0.m7696a(", presentationTimeUs=", j);
        }
        return C0663f.m12005a("entries=", arrays, m7696a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb.length);
        for (zzbz zzbzVar : this.zzb) {
            parcel.writeParcelable(zzbzVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzbz zzb(int i) {
        return this.zzb[i];
    }

    public final zzca zzc(zzbz... zzbzVarArr) {
        int length = zzbzVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.zza;
        zzbz[] zzbzVarArr2 = this.zzb;
        int i = zzfn.zza;
        int length2 = zzbzVarArr2.length;
        Object[] copyOf = Arrays.copyOf(zzbzVarArr2, length2 + length);
        System.arraycopy(zzbzVarArr, 0, copyOf, length2, length);
        return new zzca(j, (zzbz[]) copyOf);
    }

    public final zzca zzd(@Nullable zzca zzcaVar) {
        return zzcaVar == null ? this : zzc(zzcaVar.zzb);
    }
}
