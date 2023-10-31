package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzatu {
    private final String zza;
    @Nullable
    private final JSONObject zzb;
    private final String zzc;
    private final String zzd;
    private final boolean zze;

    public zzatu(String str, zzbzz zzbzzVar, String str2, @Nullable JSONObject jSONObject, boolean z, boolean z2) {
        this.zzd = zzbzzVar.zza;
        this.zzb = jSONObject;
        this.zzc = str;
        this.zza = str2;
        this.zze = z2;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzc;
    }

    @Nullable
    public final JSONObject zzd() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zze;
    }
}
