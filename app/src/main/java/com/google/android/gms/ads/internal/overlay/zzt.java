package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzt extends zzl {
    public zzt(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzl, com.google.android.gms.internal.ads.zzbrv
    public final void zzk(@Nullable Bundle bundle) {
        com.google.android.gms.ads.internal.util.zze.zza("AdOverlayParcel is null or does not contain valid overlay type.");
        this.zzn = 4;
        this.zzb.finish();
    }
}
