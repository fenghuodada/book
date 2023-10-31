package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzenl implements zzeqp {
    public final String zza;
    public final boolean zzb;

    public zzenl(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", "1");
        }
    }
}
