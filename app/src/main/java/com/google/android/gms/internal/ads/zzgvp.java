package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgvp implements zzgvo, zzgvi {
    private static final zzgvp zza = new zzgvp(null);
    private final Object zzb;

    private zzgvp(Object obj) {
        this.zzb = obj;
    }

    public static zzgvo zza(Object obj) {
        zzgvw.zza(obj, "instance cannot be null");
        return new zzgvp(obj);
    }

    public static zzgvo zzc(Object obj) {
        return obj == null ? zza : new zzgvp(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final Object zzb() {
        return this.zzb;
    }
}
