package com.google.android.gms.internal.ads;

import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.p039h5.OnH5AdsEventListener;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public final class zzbjc extends zzbje {
    private final OnH5AdsEventListener zza;

    public zzbjc(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
