package com.google.android.gms.internal.ads;

import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
final class zzgoh {
    private final Object zza;
    private final int zzb;

    public zzgoh(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgoh) {
            zzgoh zzgohVar = (zzgoh) obj;
            return this.zza == zzgohVar.zza && this.zzb == zzgohVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
