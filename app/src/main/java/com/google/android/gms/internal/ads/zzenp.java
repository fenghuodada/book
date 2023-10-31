package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzenp implements zzeqp {
    private final boolean zza;

    public zzenp(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.zza);
    }
}
