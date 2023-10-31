package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzepb implements zzeqp {
    @Nullable
    private final Bundle zza;

    public zzepb(@Nullable Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.zza;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
