package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzal implements zzch<zzak> {
    private final zzcl<Application> zza;
    private final zzcl<zzam> zzb;
    private final zzcl<Executor> zzc;

    public zzal(zzcl<Application> zzclVar, zzcl<zzam> zzclVar2, zzcl<Executor> zzclVar3) {
        this.zza = zzclVar;
        this.zzb = zzclVar2;
        this.zzc = zzclVar3;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcl
    /* renamed from: zza */
    public final zzak zzb() {
        Executor executor = zzcd.zzb;
        zzck.zza(executor);
        return new zzak(this.zza.zzb(), this.zzb.zzb(), executor);
    }
}
