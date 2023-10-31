package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zzfig extends zzfih {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfig(zzfhz zzfhzVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfhzVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
