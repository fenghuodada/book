package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcok implements zzgvo {
    private final zzgwb zza;

    public zzcok(zzgwb zzgwbVar) {
        this.zza = zzgwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcrv) this.zza).zza().zzA);
        } catch (JSONException unused) {
            return null;
        }
    }
}
