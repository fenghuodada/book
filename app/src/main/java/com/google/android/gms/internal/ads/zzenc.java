package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final class zzenc implements zzeqp {
    private final String zza;
    private final String zzb;
    private final Bundle zzc;

    public /* synthetic */ zzenc(String str, String str2, Bundle bundle, zzenb zzenbVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.zza);
        bundle.putString("fc_consent", this.zzb);
        bundle.putBundle("iab_consent_info", this.zzc);
    }
}
