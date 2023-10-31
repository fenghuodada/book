package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfhz {
    private JSONObject zza;
    private final zzfii zzb;

    public zzfhz(zzfii zzfiiVar) {
        this.zzb = zzfiiVar;
    }

    @VisibleForTesting
    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfij(this));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfik(this, hashSet, jSONObject, j));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfil(this, hashSet, jSONObject, j));
    }

    @VisibleForTesting
    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
