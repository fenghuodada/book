package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbee;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    @Nullable
    private final zzbee zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, @Nullable Location location, int i, int i2, @Nullable String str2, String str3, @Nullable zzbee zzbeeVar) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.zza = zzbeeVar;
    }

    @NonNull
    public NativeAdOptions getNativeAdOptions() {
        return zzbee.zza(this.zza);
    }
}
