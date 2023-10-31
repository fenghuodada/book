package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzafb implements zzbz {
    public static final Parcelable.Creator<zzafb> CREATOR = new zzaez();
    public final float zza;
    public final int zzb;

    public zzafb(float f, int i) {
        this.zza = f;
        this.zzb = i;
    }

    public /* synthetic */ zzafb(Parcel parcel, zzafa zzafaVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafb.class == obj.getClass()) {
            zzafb zzafbVar = (zzafb) obj;
            if (this.zza == zzafbVar.zza && this.zzb == zzafbVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + this.zzb;
    }

    public final String toString() {
        float f = this.zza;
        int i = this.zzb;
        return "smta: captureFrameRate=" + f + ", svcTemporalLayerCount=" + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbz
    public final /* synthetic */ void zza(zzbu zzbuVar) {
    }
}
