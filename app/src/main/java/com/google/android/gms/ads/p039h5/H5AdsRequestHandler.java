package com.google.android.gms.ads.p039h5;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.gms.internal.ads.zzbjm;

@RequiresApi(api = 21)
/* renamed from: com.google.android.gms.ads.h5.H5AdsRequestHandler */
/* loaded from: classes.dex */
public final class H5AdsRequestHandler {
    private final zzbjm zza;

    public H5AdsRequestHandler(@NonNull Context context, @NonNull OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new zzbjm(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    public boolean handleH5AdsRequest(@NonNull String str) {
        return this.zza.zzb(str);
    }

    public boolean shouldInterceptRequest(@NonNull String str) {
        return zzbjm.zzc(str);
    }
}
