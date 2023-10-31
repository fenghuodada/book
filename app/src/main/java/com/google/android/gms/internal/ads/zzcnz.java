package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcnz implements zzaty, zzcwd, com.google.android.gms.ads.internal.overlay.zzo, zzcwc {
    private final zzcnu zza;
    private final zzcnv zzb;
    private final zzbnk zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcny zzh = new zzcny();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcnz(zzbnh zzbnhVar, zzcnv zzcnvVar, Executor executor, zzcnu zzcnuVar, Clock clock) {
        this.zza = zzcnuVar;
        zzbms zzbmsVar = zzbmv.zza;
        this.zzd = zzbnhVar.zza("google.afma.activeView.handleUpdate", zzbmsVar, zzbmsVar);
        this.zzb = zzcnvVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        for (zzcfb zzcfbVar : this.zzc) {
            this.zza.zzf(zzcfbVar);
        }
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbF() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final synchronized void zzbn(@Nullable Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbo() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final synchronized void zzbp(@Nullable Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final synchronized void zzbq(@Nullable Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final synchronized void zzc(zzatx zzatxVar) {
        zzcny zzcnyVar = this.zzh;
        zzcnyVar.zza = zzatxVar.zzj;
        zzcnyVar.zzf = zzatxVar;
        zzg();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
    }

    public final synchronized void zzg() {
        if (this.zzj.get() == null) {
            zzj();
        } else if (!this.zzi && this.zzg.get()) {
            try {
                this.zzh.zzd = this.zzf.elapsedRealtime();
                final JSONObject zzb = this.zzb.zzb(this.zzh);
                for (final zzcfb zzcfbVar : this.zzc) {
                    this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnx
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcfb.this.zzl("AFMA_updateActiveView", zzb);
                        }
                    });
                }
                zzcaj.zzb(this.zzd.zzb(zzb), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e);
            }
        }
    }

    public final synchronized void zzh(zzcfb zzcfbVar) {
        this.zzc.add(zzcfbVar);
        this.zza.zzd(zzcfbVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final synchronized void zzl() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }
}
