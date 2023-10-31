package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzgvd extends zzgvg {
    final Logger zza;

    public zzgvd(String str) {
        this.zza = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgvg
    public final void zza(String str) {
        this.zza.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
