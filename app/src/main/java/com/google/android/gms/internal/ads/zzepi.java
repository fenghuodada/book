package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzepi implements zzeqp {
    private final String zza;
    private final String zzb;

    public zzepi(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        ((Bundle) obj).putString("request_id", ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgH)).booleanValue() ? this.zzb : this.zza);
    }
}
