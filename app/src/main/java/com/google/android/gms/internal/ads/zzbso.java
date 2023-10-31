package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* loaded from: classes.dex */
final class zzbso extends zzbsj {
    final /* synthetic */ UpdateClickUrlCallback zza;

    public zzbso(zzbss zzbssVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbsk
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsk
    public final void zzf(List list) {
        this.zza.onSuccess((Uri) list.get(0));
    }
}
