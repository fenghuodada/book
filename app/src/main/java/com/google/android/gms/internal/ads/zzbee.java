package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "NativeAdOptionsParcelCreator")
/* loaded from: classes.dex */
public final class zzbee extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbee> CREATOR = new zzbef();
    @SafeParcelable.Field(m4845id = 1)
    public final int zza;
    @SafeParcelable.Field(m4845id = 2)
    public final boolean zzb;
    @SafeParcelable.Field(m4845id = 3)
    public final int zzc;
    @SafeParcelable.Field(m4845id = 4)
    public final boolean zzd;
    @SafeParcelable.Field(m4845id = 5)
    public final int zze;
    @Nullable
    @SafeParcelable.Field(m4845id = 6)
    public final com.google.android.gms.ads.internal.client.zzfl zzf;
    @SafeParcelable.Field(m4845id = 7)
    public final boolean zzg;
    @SafeParcelable.Field(m4845id = 8)
    public final int zzh;
    @SafeParcelable.Field(m4845id = 9)
    public final int zzi;
    @SafeParcelable.Field(m4845id = 10)
    public final boolean zzj;

    @SafeParcelable.Constructor
    public zzbee(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) boolean z, @SafeParcelable.Param(m4844id = 3) int i2, @SafeParcelable.Param(m4844id = 4) boolean z2, @SafeParcelable.Param(m4844id = 5) int i3, @SafeParcelable.Param(m4844id = 6) com.google.android.gms.ads.internal.client.zzfl zzflVar, @SafeParcelable.Param(m4844id = 7) boolean z3, @SafeParcelable.Param(m4844id = 8) int i4, @SafeParcelable.Param(m4844id = 9) int i5, @SafeParcelable.Param(m4844id = 10) boolean z4) {
        this.zza = i;
        this.zzb = z;
        this.zzc = i2;
        this.zzd = z2;
        this.zze = i3;
        this.zzf = zzflVar;
        this.zzg = z3;
        this.zzh = i4;
        this.zzj = z4;
        this.zzi = i5;
    }

    @Deprecated
    public zzbee(@NonNull NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzfl(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false);
    }

    @NonNull
    public static com.google.android.gms.ads.nativead.NativeAdOptions zza(@Nullable zzbee zzbeeVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbeeVar == null) {
            return builder.build();
        }
        int i = zzbeeVar.zza;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzbeeVar.zzg);
                    builder.setMediaAspectRatio(zzbeeVar.zzh);
                    builder.enableCustomClickGestureDirection(zzbeeVar.zzi, zzbeeVar.zzj);
                }
                builder.setReturnUrlsForImageAssets(zzbeeVar.zzb);
                builder.setRequestMultipleImages(zzbeeVar.zzd);
                return builder.build();
            }
            com.google.android.gms.ads.internal.client.zzfl zzflVar = zzbeeVar.zzf;
            if (zzflVar != null) {
                builder.setVideoOptions(new VideoOptions(zzflVar));
            }
        }
        builder.setAdChoicesPlacement(zzbeeVar.zze);
        builder.setReturnUrlsForImageAssets(zzbeeVar.zzb);
        builder.setRequestMultipleImages(zzbeeVar.zzd);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
