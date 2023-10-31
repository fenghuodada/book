package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzzi {
    @Nullable
    private final Handler zza;
    @Nullable
    private final zzzj zzb;

    public zzzi(@Nullable Handler handler, @Nullable zzzj zzzjVar) {
        this.zza = zzzjVar == null ? null : handler;
        this.zzb = zzzjVar;
    }

    public final void zza(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzze
                @Override // java.lang.Runnable
                public final void run() {
                    zzzi.this.zzg(str, j, j2);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzh
                @Override // java.lang.Runnable
                public final void run() {
                    zzzi.this.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzhs zzhsVar) {
        zzhsVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzd
                @Override // java.lang.Runnable
                public final void run() {
                    zzzi.this.zzi(zzhsVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyy
                @Override // java.lang.Runnable
                public final void run() {
                    zzzi.this.zzj(i, j);
                }
            });
        }
    }

    public final void zze(final zzhs zzhsVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzc
                @Override // java.lang.Runnable
                public final void run() {
                    zzzi.this.zzk(zzhsVar);
                }
            });
        }
    }

    public final void zzf(final zzam zzamVar, @Nullable final zzht zzhtVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzf
                @Override // java.lang.Runnable
                public final void run() {
                    zzzi.this.zzl(zzamVar, zzhtVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzg(String str, long j, long j2) {
        zzzj zzzjVar = this.zzb;
        int i = zzfn.zza;
        zzzjVar.zzo(str, j, j2);
    }

    public final /* synthetic */ void zzh(String str) {
        zzzj zzzjVar = this.zzb;
        int i = zzfn.zza;
        zzzjVar.zzp(str);
    }

    public final /* synthetic */ void zzi(zzhs zzhsVar) {
        zzhsVar.zza();
        zzzj zzzjVar = this.zzb;
        int i = zzfn.zza;
        zzzjVar.zzq(zzhsVar);
    }

    public final /* synthetic */ void zzj(int i, long j) {
        zzzj zzzjVar = this.zzb;
        int i2 = zzfn.zza;
        zzzjVar.zzk(i, j);
    }

    public final /* synthetic */ void zzk(zzhs zzhsVar) {
        zzzj zzzjVar = this.zzb;
        int i = zzfn.zza;
        zzzjVar.zzr(zzhsVar);
    }

    public final /* synthetic */ void zzl(zzam zzamVar, zzht zzhtVar) {
        int i = zzfn.zza;
        this.zzb.zzt(zzamVar, zzhtVar);
    }

    public final /* synthetic */ void zzm(Object obj, long j) {
        zzzj zzzjVar = this.zzb;
        int i = zzfn.zza;
        zzzjVar.zzl(obj, j);
    }

    public final /* synthetic */ void zzn(long j, int i) {
        zzzj zzzjVar = this.zzb;
        int i2 = zzfn.zza;
        zzzjVar.zzs(j, i);
    }

    public final /* synthetic */ void zzo(Exception exc) {
        zzzj zzzjVar = this.zzb;
        int i = zzfn.zza;
        zzzjVar.zzn(exc);
    }

    public final /* synthetic */ void zzp(zzdn zzdnVar) {
        zzzj zzzjVar = this.zzb;
        int i = zzfn.zza;
        zzzjVar.zzu(zzdnVar);
    }

    public final void zzq(final Object obj) {
        if (this.zza != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyz
                @Override // java.lang.Runnable
                public final void run() {
                    zzzi.this.zzm(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzb
                @Override // java.lang.Runnable
                public final void run() {
                    zzzi.this.zzn(j, i);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzza
                @Override // java.lang.Runnable
                public final void run() {
                    zzzi.this.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzdn zzdnVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzg
                @Override // java.lang.Runnable
                public final void run() {
                    zzzi.this.zzp(zzdnVar);
                }
            });
        }
    }
}
