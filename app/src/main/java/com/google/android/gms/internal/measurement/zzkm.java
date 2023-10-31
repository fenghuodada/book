package com.google.android.gms.internal.measurement;

import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
final class zzkm {
    private final Object zza;
    private final int zzb;

    public zzkm(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkm) {
            zzkm zzkmVar = (zzkm) obj;
            return this.zza == zzkmVar.zza && this.zzb == zzkmVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
