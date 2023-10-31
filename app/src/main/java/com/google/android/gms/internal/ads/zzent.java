package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzent implements zzeqp {
    private final Boolean zza;

    public zzent(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        Boolean bool = this.zza;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
