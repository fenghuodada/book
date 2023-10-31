package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzca;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbgh;

@SafeParcelable.Class(creator = "PublisherAdViewOptionsCreator")
@Deprecated
/* loaded from: classes.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzf();
    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", m4845id = 1)
    private final boolean zza;
    @Nullable
    @SafeParcelable.Field(getter = "getAppEventListenerBinder", m4845id = 2, type = "android.os.IBinder")
    private final zzcb zzb;
    @Nullable
    @SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", m4845id = 3)
    private final IBinder zzc;

    @Deprecated
    /* loaded from: classes.dex */
    public static final class Builder {
        @Nullable
        private ShouldDelayBannerRenderingListener zza;

        @NonNull
        @KeepForSdk
        public Builder setShouldDelayBannerRenderingListener(@NonNull ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.zza = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public PublisherAdViewOptions(@SafeParcelable.Param(m4844id = 1) boolean z, @Nullable @SafeParcelable.Param(m4844id = 2) IBinder iBinder, @Nullable @SafeParcelable.Param(m4844id = 3) IBinder iBinder2) {
        this.zza = z;
        this.zzb = iBinder != null ? zzca.zzd(iBinder) : null;
        this.zzc = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        zzcb zzcbVar = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, zzcbVar == null ? null : zzcbVar.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final zzcb zza() {
        return this.zzb;
    }

    @Nullable
    public final zzbgh zzb() {
        IBinder iBinder = this.zzc;
        if (iBinder == null) {
            return null;
        }
        return zzbgg.zzc(iBinder);
    }

    public final boolean zzc() {
        return this.zza;
    }
}
