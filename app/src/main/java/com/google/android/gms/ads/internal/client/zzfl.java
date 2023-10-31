package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "VideoOptionsParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzfl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfl> CREATOR = new zzfm();
    @SafeParcelable.Field(m4845id = 2)
    public final boolean zza;
    @SafeParcelable.Field(m4845id = 3)
    public final boolean zzb;
    @SafeParcelable.Field(m4845id = 4)
    public final boolean zzc;

    public zzfl(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    @SafeParcelable.Constructor
    public zzfl(@SafeParcelable.Param(m4844id = 2) boolean z, @SafeParcelable.Param(m4844id = 3) boolean z2, @SafeParcelable.Param(m4844id = 4) boolean z3) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
