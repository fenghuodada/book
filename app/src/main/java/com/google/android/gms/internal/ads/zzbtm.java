package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@SafeParcelable.Class(creator = "AutoClickProtectionConfigurationParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzbtm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtm> CREATOR = new zzbtn();
    @SafeParcelable.Field(m4845id = 2)
    public final boolean zza;
    @Nullable
    @SafeParcelable.Field(m4845id = 3)
    public final List zzb;

    public zzbtm() {
        this(false, Collections.emptyList());
    }

    @SafeParcelable.Constructor
    public zzbtm(@SafeParcelable.Param(m4844id = 2) boolean z, @SafeParcelable.Param(m4844id = 3) List list) {
        this.zza = z;
        this.zzb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zza);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
