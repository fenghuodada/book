package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class zzaqj implements zzaqm {
    @Nullable
    private static zzaqj zzb;
    private final Context zzc;
    private final zzfki zzd;
    private final zzfkp zze;
    private final zzfkr zzf;
    private final zzarl zzg;
    private final zzfit zzh;
    private final Executor zzi;
    private final zzfko zzj;
    private final zzasa zzl;
    @Nullable
    private final zzars zzm;
    @Nullable
    private final zzarj zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    @VisibleForTesting
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    @VisibleForTesting
    public zzaqj(@NonNull Context context, @NonNull zzfit zzfitVar, @NonNull zzfki zzfkiVar, @NonNull zzfkp zzfkpVar, @NonNull zzfkr zzfkrVar, @NonNull zzarl zzarlVar, @NonNull Executor executor, @NonNull zzfio zzfioVar, int i, @Nullable zzasa zzasaVar, @Nullable zzars zzarsVar, @Nullable zzarj zzarjVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzfitVar;
        this.zzd = zzfkiVar;
        this.zze = zzfkpVar;
        this.zzf = zzfkrVar;
        this.zzg = zzarlVar;
        this.zzi = executor;
        this.zzr = i;
        this.zzl = zzasaVar;
        this.zzm = zzarsVar;
        this.zzn = zzarjVar;
        this.zzq = false;
        this.zzj = new zzaqh(this, zzfioVar);
    }

    public static synchronized zzaqj zza(@NonNull String str, @NonNull Context context, boolean z, boolean z2) {
        zzaqj zzb2;
        synchronized (zzaqj.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzaqj zzb(@NonNull String str, @NonNull Context context, @NonNull Executor executor, boolean z, boolean z2) {
        zzaqj zzaqjVar;
        synchronized (zzaqj.class) {
            if (zzb == null) {
                zzfiu zza = zzfiv.zza();
                zza.zza(str);
                zza.zzc(z);
                zzfiv zzd = zza.zzd();
                zzfit zza2 = zzfit.zza(context, executor, z2);
                zzaqu zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcZ)).booleanValue() ? zzaqu.zzc(context) : null;
                zzasa zzd2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzda)).booleanValue() ? zzasa.zzd(context, executor) : null;
                zzars zzarsVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcp)).booleanValue() ? new zzars() : null;
                zzarj zzarjVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcr)).booleanValue() ? new zzarj() : null;
                zzfjm zze = zzfjm.zze(context, executor, zza2, zzd);
                zzark zzarkVar = new zzark(context);
                zzarl zzarlVar = new zzarl(zzd, zze, new zzary(context, zzarkVar), zzarkVar, zzc, zzd2, zzarsVar, zzarjVar);
                int zzb2 = zzfjv.zzb(context, zza2);
                zzfio zzfioVar = new zzfio();
                zzaqj zzaqjVar2 = new zzaqj(context, zza2, new zzfki(context, zzb2), new zzfkp(context, zzb2, new zzaqg(zza2), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbY)).booleanValue()), new zzfkr(context, zzarlVar, zza2, zzfioVar), zzarlVar, executor, zzfioVar, zzb2, zzd2, zzarsVar, zzarjVar);
                zzb = zzaqjVar2;
                zzaqjVar2.zzm();
                zzb.zzp();
            }
            zzaqjVar = zzb;
        }
        return zzaqjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzaqj r12) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqj.zzj(com.google.android.gms.internal.ads.zzaqj):void");
    }

    private final void zzs() {
        zzasa zzasaVar = this.zzl;
        if (zzasaVar != null) {
            zzasaVar.zzh();
        }
    }

    private final zzfkh zzt(int i) {
        if (zzfjv.zza(this.zzr)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbW)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final String zze(Context context, @Nullable String str, @Nullable View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final String zzf(Context context, String str, @Nullable View view, @Nullable Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcp)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfiw zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza2 = zza.zza(context, null, str, view, activity);
            this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza2, null);
            return zza2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final String zzg(Context context) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcp)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfiw zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzc = zza.zzc(context, null);
            this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
            return zzc;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final String zzh(Context context, @Nullable View view, @Nullable Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcp)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfiw zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb2 = zza.zzb(context, null, view, activity);
            this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
            return zzb2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zzk(@Nullable MotionEvent motionEvent) {
        zzfiw zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzfkq e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zzl(int i, int i2, int i3) {
    }

    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfkh zzt = zzt(1);
        if (zzt == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zzc(zzt)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzarj zzarjVar = this.zzn;
        if (zzarjVar != null) {
            zzarjVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zzo(@Nullable View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzp) {
            return;
        }
        synchronized (this.zzo) {
            if (!this.zzp) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfkh zzb2 = this.zzf.zzb();
                if ((zzb2 == null || zzb2.zzd(3600L)) && zzfjv.zza(this.zzr)) {
                    this.zzi.execute(new zzaqi(this));
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
