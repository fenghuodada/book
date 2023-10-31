package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzcnu {
    private final String zza;
    private final zzbnh zzb;
    private final Executor zzc;
    private zzcnz zzd;
    private final zzbii zze = new zzcnr(this);
    private final zzbii zzf = new zzcnt(this);

    public zzcnu(String str, zzbnh zzbnhVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbnhVar;
        this.zzc = executor;
    }

    public static /* bridge */ /* synthetic */ boolean zzg(zzcnu zzcnuVar, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcnuVar.zza);
    }

    public final void zzc(zzcnz zzcnzVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcnzVar;
    }

    public final void zzd(zzcfb zzcfbVar) {
        zzcfbVar.zzad("/updateActiveView", this.zze);
        zzcfbVar.zzad("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcfb zzcfbVar) {
        zzcfbVar.zzau("/updateActiveView", this.zze);
        zzcfbVar.zzau("/untrackActiveViewUnit", this.zzf);
    }
}
