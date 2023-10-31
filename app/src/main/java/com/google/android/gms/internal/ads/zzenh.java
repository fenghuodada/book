package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzenh implements zzeqp {
    public final Bundle zza;

    public zzenh(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        ((Bundle) obj).putBundle("content_info", this.zza);
    }
}
