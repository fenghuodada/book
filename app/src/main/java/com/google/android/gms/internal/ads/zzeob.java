package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzeob implements zzeqp {
    public final Bundle zza;

    public zzeob(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzfal.zza(bundle, "device");
        zza.putBundle("android_mem_info", this.zza);
        bundle.putBundle("device", zza);
    }
}
