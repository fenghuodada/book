package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import libv2ray.V2rayConfig;

/* loaded from: classes3.dex */
final class zzlb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb = "_err";
    final /* synthetic */ Bundle zzc;
    final /* synthetic */ zzlc zzd;

    public zzlb(zzlc zzlcVar, String str, String str2, Bundle bundle) {
        this.zzd = zzlcVar;
        this.zza = str;
        this.zzc = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zza.zzF((zzau) Preconditions.checkNotNull(this.zzd.zza.zzv().zzz(this.zza, this.zzb, this.zzc, V2rayConfig.DEFAULT_SECURITY, this.zzd.zza.zzax().currentTimeMillis(), false, true)), this.zza);
    }
}
