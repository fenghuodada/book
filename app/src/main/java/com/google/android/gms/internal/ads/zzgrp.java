package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgrp extends RuntimeException {
    public zzgrp(zzgqg zzgqgVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgpi zza() {
        return new zzgpi(getMessage());
    }
}
