package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzos {
    @Nullable
    private final Handler zza;
    @Nullable
    private final zzot zzb;

    public zzos(@Nullable Handler handler, @Nullable zzot zzotVar) {
        this.zza = zzotVar == null ? null : handler;
        this.zzb = zzotVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoi
                @Override // java.lang.Runnable
                public final void run() {
                    zzos.this.zzh(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoo
                @Override // java.lang.Runnable
                public final void run() {
                    zzos.this.zzi(exc);
                }
            });
        }
    }

    public final void zzc(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzon
                @Override // java.lang.Runnable
                public final void run() {
                    zzos.this.zzj(str, j, j2);
                }
            });
        }
    }

    public final void zzd(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzop
                @Override // java.lang.Runnable
                public final void run() {
                    zzos.this.zzk(str);
                }
            });
        }
    }

    public final void zze(final zzhs zzhsVar) {
        zzhsVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoj
                @Override // java.lang.Runnable
                public final void run() {
                    zzos.this.zzl(zzhsVar);
                }
            });
        }
    }

    public final void zzf(final zzhs zzhsVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzok
                @Override // java.lang.Runnable
                public final void run() {
                    zzos.this.zzm(zzhsVar);
                }
            });
        }
    }

    public final void zzg(final zzam zzamVar, @Nullable final zzht zzhtVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoq
                @Override // java.lang.Runnable
                public final void run() {
                    zzos.this.zzn(zzamVar, zzhtVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzh(Exception exc) {
        zzot zzotVar = this.zzb;
        int i = zzfn.zza;
        zzotVar.zzb(exc);
    }

    public final /* synthetic */ void zzi(Exception exc) {
        zzot zzotVar = this.zzb;
        int i = zzfn.zza;
        zzotVar.zzi(exc);
    }

    public final /* synthetic */ void zzj(String str, long j, long j2) {
        zzot zzotVar = this.zzb;
        int i = zzfn.zza;
        zzotVar.zzc(str, j, j2);
    }

    public final /* synthetic */ void zzk(String str) {
        zzot zzotVar = this.zzb;
        int i = zzfn.zza;
        zzotVar.zzd(str);
    }

    public final /* synthetic */ void zzl(zzhs zzhsVar) {
        zzhsVar.zza();
        zzot zzotVar = this.zzb;
        int i = zzfn.zza;
        zzotVar.zze(zzhsVar);
    }

    public final /* synthetic */ void zzm(zzhs zzhsVar) {
        zzot zzotVar = this.zzb;
        int i = zzfn.zza;
        zzotVar.zzf(zzhsVar);
    }

    public final /* synthetic */ void zzn(zzam zzamVar, zzht zzhtVar) {
        int i = zzfn.zza;
        this.zzb.zzg(zzamVar, zzhtVar);
    }

    public final /* synthetic */ void zzo(long j) {
        zzot zzotVar = this.zzb;
        int i = zzfn.zza;
        zzotVar.zzh(j);
    }

    public final /* synthetic */ void zzp(boolean z) {
        zzot zzotVar = this.zzb;
        int i = zzfn.zza;
        zzotVar.zzm(z);
    }

    public final /* synthetic */ void zzq(int i, long j, long j2) {
        zzot zzotVar = this.zzb;
        int i2 = zzfn.zza;
        zzotVar.zzj(i, j, j2);
    }

    public final void zzr(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzol
                @Override // java.lang.Runnable
                public final void run() {
                    zzos.this.zzo(j);
                }
            });
        }
    }

    public final void zzs(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzom
                @Override // java.lang.Runnable
                public final void run() {
                    zzos.this.zzp(z);
                }
            });
        }
    }

    public final void zzt(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzor
                @Override // java.lang.Runnable
                public final void run() {
                    zzos.this.zzq(i, j, j2);
                }
            });
        }
    }
}
