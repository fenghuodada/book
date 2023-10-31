package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzepr implements zzeqp {
    private final String zza;
    private final Bundle zzb;

    public zzepr(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.zza);
        if (this.zzb.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", this.zzb);
    }
}
