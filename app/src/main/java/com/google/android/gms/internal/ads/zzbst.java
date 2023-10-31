package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@SafeParcelable.Class(creator = "NativeAdLayoutInfoParcelCreator")
/* loaded from: classes.dex */
public final class zzbst extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbst> CREATOR = new zzbsu();
    @SafeParcelable.Field(getter = "getAdViewAsBinder", m4845id = 1, type = "android.os.IBinder")
    public final View zza;
    @SafeParcelable.Field(getter = "getAssetViewMapAsBinder", m4845id = 2, type = "android.os.IBinder")
    public final Map zzb;

    @SafeParcelable.Constructor
    public zzbst(@SafeParcelable.Param(m4844id = 1) IBinder iBinder, @SafeParcelable.Param(m4844id = 2) IBinder iBinder2) {
        this.zza = (View) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzb = (Map) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, ObjectWrapper.wrap(this.zza).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 2, ObjectWrapper.wrap(this.zzb).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
