package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcoj implements zzaty {
    private zzcfb zza;
    private final Executor zzb;
    private final zzcnv zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcny zzg = new zzcny();

    public zzcoj(Executor executor, zzcnv zzcnvVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcnvVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcoi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcoj.this.zzd(zzb);
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void zzc(zzatx zzatxVar) {
        zzcny zzcnyVar = this.zzg;
        zzcnyVar.zza = this.zzf ? false : zzatxVar.zzj;
        zzcnyVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzatxVar;
        if (this.zze) {
            zzg();
        }
    }

    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(zzcfb zzcfbVar) {
        this.zza = zzcfbVar;
    }
}
