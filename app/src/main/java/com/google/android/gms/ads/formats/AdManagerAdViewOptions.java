package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzfj;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbgh;

@SafeParcelable.Class(creator = "AdManagerAdViewOptionsCreator")
/* loaded from: classes.dex */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", m4845id = 1)
    private final boolean zza;
    @Nullable
    @SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", m4845id = 2)
    private final IBinder zzb;

    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean zza = false;
        @Nullable
        private ShouldDelayBannerRenderingListener zzb;

        @NonNull
        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this, (zzb) null);
        }

        @NonNull
        public Builder setManualImpressionsEnabled(boolean z) {
            this.zza = z;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setShouldDelayBannerRenderingListener(@NonNull ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.zzb = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    public /* synthetic */ AdManagerAdViewOptions(Builder builder, zzb zzbVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb != null ? new zzfj(builder.zzb) : null;
    }

    @SafeParcelable.Constructor
    public AdManagerAdViewOptions(@SafeParcelable.Param(m4844id = 1) boolean z, @Nullable @SafeParcelable.Param(m4844id = 2) IBinder iBinder) {
        this.zza = z;
        this.zzb = iBinder;
    }

    public boolean getManualImpressionsEnabled() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getManualImpressionsEnabled());
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final zzbgh zza() {
        IBinder iBinder = this.zzb;
        if (iBinder == null) {
            return null;
        }
        return zzbgg.zzc(iBinder);
    }
}
