package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes.dex */
public final class zzbj implements zzch<zzbi> {
    private final zzcl<Application> zza;

    public zzbj(zzcl<Application> zzclVar) {
        this.zza = zzclVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbi(this.zza.zzb());
    }
}
