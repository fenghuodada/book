package com.google.android.gms.internal.ads;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzbpc implements NativeMediationAdRequest {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbee zzg;
    private final boolean zzi;
    private final String zzk;
    private final List zzh = new ArrayList();
    private final Map zzj = new HashMap();

    public zzbpc(@Nullable Date date, int i, @Nullable Set set, @Nullable Location location, boolean z, int i2, zzbee zzbeeVar, List list, boolean z2, int i3, String str) {
        Map map;
        String str2;
        Boolean bool;
        this.zza = date;
        this.zzb = i;
        this.zzc = set;
        this.zze = location;
        this.zzd = z;
        this.zzf = i2;
        this.zzg = zzbeeVar;
        this.zzi = z2;
        this.zzk = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.startsWith("custom:")) {
                    String[] split = str3.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.zzj;
                            str2 = split[1];
                            bool = Boolean.TRUE;
                        } else if ("false".equals(split[2])) {
                            map = this.zzj;
                            str2 = split[1];
                            bool = Boolean.FALSE;
                        }
                        map.put(str2, bool);
                    }
                } else {
                    this.zzh.add(str3);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return com.google.android.gms.ads.internal.client.zzej.zzf().zza();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        zzbee zzbeeVar = this.zzg;
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbeeVar != null) {
            int i = zzbeeVar.zza;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        builder.setRequestCustomMuteThisAd(zzbeeVar.zzg);
                        builder.setMediaAspectRatio(zzbeeVar.zzh);
                    }
                    builder.setReturnUrlsForImageAssets(zzbeeVar.zzb);
                    builder.setImageOrientation(zzbeeVar.zzc);
                    builder.setRequestMultipleImages(zzbeeVar.zzd);
                }
                com.google.android.gms.ads.internal.client.zzfl zzflVar = zzbeeVar.zzf;
                if (zzflVar != null) {
                    builder.setVideoOptions(new VideoOptions(zzflVar));
                }
            }
            builder.setAdChoicesPlacement(zzbeeVar.zze);
            builder.setReturnUrlsForImageAssets(zzbeeVar.zzb);
            builder.setImageOrientation(zzbeeVar.zzc);
            builder.setRequestMultipleImages(zzbeeVar.zzd);
        }
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    @NonNull
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbee.zza(this.zzg);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return com.google.android.gms.ads.internal.client.zzej.zzf().zzx();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zza() {
        return this.zzj;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzb() {
        return this.zzh.contains("3");
    }
}
