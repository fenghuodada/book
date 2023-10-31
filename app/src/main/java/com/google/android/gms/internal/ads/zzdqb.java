package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.Executor;
import p060j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzdqb {
    final /* synthetic */ zzdqc zza;
    private final Map zzb = new ConcurrentHashMap();

    @VisibleForTesting
    public zzdqb(zzdqc zzdqcVar) {
        this.zza = zzdqcVar;
    }

    public static /* bridge */ /* synthetic */ zzdqb zza(zzdqb zzdqbVar) {
        Map map;
        Map map2 = zzdqbVar.zzb;
        map = zzdqbVar.zza.zzc;
        map2.putAll(map);
        return zzdqbVar;
    }

    public final zzdqb zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdqb zzc(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdqb zzd(zzezf zzezfVar) {
        this.zzb.put("aai", zzezfVar.zzx);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgL)).booleanValue()) {
            zzc("rid", zzezfVar.zzao);
        }
        return this;
    }

    public final zzdqb zze(zzezi zzeziVar) {
        this.zzb.put("gqi", zzeziVar.zzb);
        return this;
    }

    public final String zzf() {
        zzdqh zzdqhVar;
        zzdqhVar = this.zza.zza;
        return zzdqhVar.zzb(this.zzb);
    }

    public final void zzg() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqa
            @Override // java.lang.Runnable
            public final void run() {
                zzdqb.this.zzi();
            }
        });
    }

    public final void zzh() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpz
            @Override // java.lang.Runnable
            public final void run() {
                zzdqb.this.zzj();
            }
        });
    }

    public final /* synthetic */ void zzi() {
        zzdqh zzdqhVar;
        zzdqhVar = this.zza.zza;
        zzdqhVar.zze(this.zzb);
    }

    public final /* synthetic */ void zzj() {
        zzdqh zzdqhVar;
        zzdqhVar = this.zza.zza;
        zzdqhVar.zzd(this.zzb);
    }
}
