package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class zzfbg implements zzcvl {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzbzg zzc;

    public zzfbg(Context context, zzbzg zzbzgVar) {
        this.zzb = context;
        this.zzc = zzbzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final synchronized void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.zzc.zzj(this.zza);
        }
    }

    public final Bundle zzb() {
        return this.zzc.zzl(this.zzb, this);
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }
}
