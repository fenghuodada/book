package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.InterfaceC7926e;
import com.google.android.ump.InterfaceC7927f;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzba {
    private final zzcl<zzas> zza;
    private final AtomicReference<zzbc> zzb = new AtomicReference<>();

    public zzba(zzcl<zzas> zzclVar) {
        this.zza = zzclVar;
    }

    public final void zza(InterfaceC7927f interfaceC7927f, InterfaceC7926e interfaceC7926e) {
        zzcd.zza();
        zzbc zzbcVar = this.zzb.get();
        if (zzbcVar == null) {
            interfaceC7926e.onConsentFormLoadFailure(new zzj(3, "No available form can be built.").zza());
            return;
        }
        zzas zzb = this.zza.zzb();
        zzb.zza(zzbcVar);
        zzb.zzb().zza().zzb(interfaceC7927f, interfaceC7926e);
    }

    public final void zzb(zzbc zzbcVar) {
        this.zzb.set(zzbcVar);
    }

    public final boolean zzc() {
        return this.zzb.get() != null;
    }
}
