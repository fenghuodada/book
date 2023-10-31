package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p060j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class zzdqj {
    protected final Executor zzc;
    protected final zzbzy zzd;
    private final zzfex zzf;
    protected final String zza = (String) zzbcx.zzb.zze();
    protected final Map zzb = new HashMap();
    protected final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbQ)).booleanValue();
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbT)).booleanValue();
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgM)).booleanValue();

    public zzdqj(Executor executor, zzbzy zzbzyVar, zzfex zzfexVar) {
        this.zzc = executor;
        this.zzd = zzbzyVar;
        this.zzf = zzfexVar;
    }

    private final void zza(Map map, boolean z) {
        if (map.isEmpty()) {
            zzbzt.zze("Empty paramMap.");
            return;
        }
        final String zza = this.zzf.zza(map);
        com.google.android.gms.ads.internal.util.zze.zza(zza);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.zze) {
            if (!z || this.zzg) {
                if (!parseBoolean || this.zzh) {
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdqj zzdqjVar = zzdqj.this;
                            zzdqjVar.zzd.zza(zza);
                        }
                    });
                }
            }
        }
    }

    public final String zzb(Map map) {
        return this.zzf.zza(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zzb);
    }

    public final void zzd(Map map) {
        zza(map, true);
    }

    public final void zze(Map map) {
        zza(map, false);
    }
}
