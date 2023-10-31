package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzaey implements zzbz {
    public static final Parcelable.Creator<zzaey> CREATOR = new zzaew();
    public final float zza;
    public final float zzb;

    public zzaey(float f, float f2) {
        this.zza = f;
        this.zzb = f2;
    }

    public /* synthetic */ zzaey(Parcel parcel, zzaex zzaexVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaey.class == obj.getClass()) {
            zzaey zzaeyVar = (zzaey) obj;
            if (this.zza == zzaeyVar.zza && this.zzb == zzaeyVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + Float.valueOf(this.zzb).hashCode();
    }

    public final String toString() {
        float f = this.zza;
        float f2 = this.zzb;
        return "xyz: latitude=" + f + ", longitude=" + f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeFloat(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbz
    public final /* synthetic */ void zza(zzbu zzbuVar) {
    }
}
