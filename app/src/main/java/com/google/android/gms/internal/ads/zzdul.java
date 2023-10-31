package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* loaded from: classes.dex */
public final class zzdul implements zzgvo {
    private final zzgwb zza;

    public zzdul(zzgwb zzgwbVar) {
        this.zza = zzgwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.zza.zzb()).getApplicationInfo();
        zzgvw.zzb(applicationInfo);
        return applicationInfo;
    }
}
