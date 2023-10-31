package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;

/* loaded from: classes3.dex */
public final class zzkp extends zzf {
    protected final zzko zza;
    protected final zzkn zzb;
    protected final zzkl zzc;
    private Handler zzd;
    private boolean zze;

    public zzkp(zzgd zzgdVar) {
        super(zzgdVar);
        this.zze = true;
        this.zza = new zzko(this);
        this.zzb = new zzkn(this);
        this.zzc = new zzkl(this);
    }

    public static /* bridge */ /* synthetic */ void zzj(zzkp zzkpVar, long j) {
        zzkpVar.zzg();
        zzkpVar.zzp();
        zzkpVar.zzt.zzaA().zzj().zzb("Activity paused, time", Long.valueOf(j));
        zzkpVar.zzc.zza(j);
        if (zzkpVar.zzt.zzf().zzu()) {
            zzkpVar.zzb.zzb(j);
        }
    }

    public static /* bridge */ /* synthetic */ void zzl(zzkp zzkpVar, long j) {
        zzkpVar.zzg();
        zzkpVar.zzp();
        zzkpVar.zzt.zzaA().zzj().zzb("Activity resumed, time", Long.valueOf(j));
        if (!zzkpVar.zzt.zzf().zzs(null, zzeg.zzaG) ? zzkpVar.zzt.zzf().zzu() || zzkpVar.zzt.zzm().zzm.zzb() : zzkpVar.zzt.zzf().zzu() || zzkpVar.zze) {
            zzkpVar.zzb.zzc(j);
        }
        zzkpVar.zzc.zzb();
        zzko zzkoVar = zzkpVar.zza;
        zzkoVar.zza.zzg();
        if (zzkoVar.zza.zzt.zzJ()) {
            zzkoVar.zzb(zzkoVar.zza.zzt.zzax().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzp() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    @WorkerThread
    public final void zzm(boolean z) {
        zzg();
        this.zze = z;
    }

    @WorkerThread
    public final boolean zzo() {
        zzg();
        return this.zze;
    }
}
