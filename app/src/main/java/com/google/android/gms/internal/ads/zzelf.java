package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes.dex */
public final class zzelf implements zzeqp {
    private final Bundle zza;

    @VisibleForTesting
    public zzelf(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zza.isEmpty()) {
            return;
        }
        bundle.putBundle("installed_adapter_data", this.zza);
    }
}
