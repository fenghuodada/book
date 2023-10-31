package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzeke implements zzeqp {
    private final boolean zza;

    public zzeke(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.zza ? "0" : "1");
    }
}
