package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes.dex */
final class zzag {
    private Application zza;

    private zzag() {
    }

    public /* synthetic */ zzag(zzaf zzafVar) {
    }

    public final zzd zza() {
        zzck.zzb(this.zza, Application.class);
        return new zzaj(this.zza, null);
    }

    public final zzag zzb(Application application) {
        application.getClass();
        this.zza = application;
        return this;
    }
}
