package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.adcolony.sdk.C2362x3;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();
    @SafeParcelable.Field(m4845id = 2)
    public final String zza;
    @SafeParcelable.Field(m4845id = 3)
    public final zzas zzb;
    @SafeParcelable.Field(m4845id = 4)
    public final String zzc;
    @SafeParcelable.Field(m4845id = 5)
    public final long zzd;

    public zzau(zzau zzauVar, long j) {
        Preconditions.checkNotNull(zzauVar);
        this.zza = zzauVar.zza;
        this.zzb = zzauVar.zzb;
        this.zzc = zzauVar.zzc;
        this.zzd = j;
    }

    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param(m4844id = 2) String str, @SafeParcelable.Param(m4844id = 3) zzas zzasVar, @SafeParcelable.Param(m4844id = 4) String str2, @SafeParcelable.Param(m4844id = 5) long j) {
        this.zza = str;
        this.zzb = zzasVar;
        this.zzc = str2;
        this.zzd = j;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        StringBuilder m9460b = C2362x3.m9460b("origin=", str, ",name=", str2, ",params=");
        m9460b.append(valueOf);
        return m9460b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzav.zza(this, parcel, i);
    }
}
