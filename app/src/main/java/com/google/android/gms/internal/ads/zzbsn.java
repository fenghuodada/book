package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* loaded from: classes.dex */
final class zzbsn extends zzbsj {
    final /* synthetic */ UpdateImpressionUrlsCallback zza;

    public zzbsn(zzbss zzbssVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbsk
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsk
    public final void zzf(List list) {
        this.zza.onSuccess(list);
    }
}
