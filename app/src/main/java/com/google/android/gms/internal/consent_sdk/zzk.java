package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.google.android.ump.C7925d;
import com.google.android.ump.InterfaceC7923b;
import com.google.android.ump.InterfaceC7924c;

/* loaded from: classes.dex */
public final class zzk {
    private final zzam zza;
    private final zzv zzb;
    private final zzba zzc;

    public zzk(zzam zzamVar, zzv zzvVar, zzba zzbaVar) {
        this.zza = zzamVar;
        this.zzb = zzvVar;
        this.zzc = zzbaVar;
    }

    public final int getConsentStatus() {
        return this.zza.zza();
    }

    public final boolean isConsentFormAvailable() {
        return this.zzc.zzc();
    }

    public final void requestConsentInfoUpdate(@Nullable Activity activity, C7925d c7925d, InterfaceC7924c interfaceC7924c, InterfaceC7923b interfaceC7923b) {
        this.zzb.zzc(activity, c7925d, interfaceC7924c, interfaceC7923b);
    }

    public final void reset() {
        this.zzc.zzb(null);
        this.zza.zzd();
    }
}
