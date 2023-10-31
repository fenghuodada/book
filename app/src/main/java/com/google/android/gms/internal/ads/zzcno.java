package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzcno implements zzcvi, zzcww, zzcwc, com.google.android.gms.ads.internal.client.zza, zzcvy {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzezr zze;
    private final zzezf zzf;
    private final zzfgf zzg;
    private final zzfaj zzh;
    private final zzaqq zzi;
    private final zzbcm zzj;
    private final zzffq zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    @Nullable
    private final zzcuk zzn;
    private boolean zzo;
    private final AtomicBoolean zzp = new AtomicBoolean();
    private final zzbco zzq;

    public zzcno(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzezr zzezrVar, zzezf zzezfVar, zzfgf zzfgfVar, zzfaj zzfajVar, @Nullable View view, @Nullable zzcfb zzcfbVar, zzaqq zzaqqVar, zzbcm zzbcmVar, zzbco zzbcoVar, zzffq zzffqVar, @Nullable zzcuk zzcukVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzezrVar;
        this.zzf = zzezfVar;
        this.zzg = zzfgfVar;
        this.zzh = zzfajVar;
        this.zzi = zzaqqVar;
        this.zzl = new WeakReference(view);
        this.zzm = new WeakReference(zzcfbVar);
        this.zzj = zzbcmVar;
        this.zzq = zzbcoVar;
        this.zzk = zzffqVar;
        this.zzn = zzcukVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs() {
        int i;
        List list;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjV)).booleanValue() && ((list = this.zzf.zzd) == null || list.isEmpty())) {
            return;
        }
        String zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdg)).booleanValue() ? this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), null) : null;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzao)).booleanValue() && this.zze.zzb.zzb.zzg) || !((Boolean) zzbdc.zzh.zze()).booleanValue()) {
            zzfaj zzfajVar = this.zzh;
            zzfgf zzfgfVar = this.zzg;
            zzezr zzezrVar = this.zze;
            zzezf zzezfVar = this.zzf;
            zzfajVar.zza(zzfgfVar.zzd(zzezrVar, zzezfVar, false, zzh, null, zzezfVar.zzd));
            return;
        }
        if (((Boolean) zzbdc.zzg.zze()).booleanValue() && ((i = this.zzf.zzb) == 1 || i == 2 || i == 5)) {
            zzcfb zzcfbVar = (zzcfb) this.zzm.get();
        }
        zzfvr.zzq((zzfvi) zzfvr.zzn(zzfvi.zzv(zzfvr.zzh(null)), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaS)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcnn(this, zzh), this.zzb);
    }

    private final void zzt(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzs();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnh
                @Override // java.lang.Runnable
                public final void run() {
                    zzcno.this.zzi(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzao)).booleanValue() && this.zze.zzb.zzb.zzg) && ((Boolean) zzbdc.zzd.zze()).booleanValue()) {
            zzfvr.zzq(zzfvr.zze(zzfvi.zzv(this.zzj.zza()), Throwable.class, new zzfon() { // from class: com.google.android.gms.internal.ads.zzcni
                @Override // com.google.android.gms.internal.ads.zzfon
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    return "failure_click_attok";
                }
            }, zzcag.zzf), new zzcnm(this), this.zzb);
            return;
        }
        zzfaj zzfajVar = this.zzh;
        zzfgf zzfgfVar = this.zzg;
        zzezr zzezrVar = this.zze;
        zzezf zzezfVar = this.zzf;
        zzfajVar.zzc(zzfgfVar.zzc(zzezrVar, zzezfVar, zzezfVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzbr() {
        zzfaj zzfajVar = this.zzh;
        zzfgf zzfgfVar = this.zzg;
        zzezr zzezrVar = this.zze;
        zzezf zzezfVar = this.zzf;
        zzfajVar.zza(zzfgfVar.zzc(zzezrVar, zzezfVar, zzezfVar.zzh));
    }

    public final /* synthetic */ void zzg() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnl
            @Override // java.lang.Runnable
            public final void run() {
                zzcno.this.zzs();
            }
        });
    }

    public final /* synthetic */ void zzh(int i, int i2) {
        zzt(i - 1, i2);
    }

    public final /* synthetic */ void zzi(final int i, final int i2) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnj
            @Override // java.lang.Runnable
            public final void run() {
                zzcno.this.zzh(i, i2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvy
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbr)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzfgf.zzf(2, zzeVar.zza, this.zzf.zzp)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzl() {
        if (this.zzp.compareAndSet(false, true)) {
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdp)).intValue();
            if (intValue > 0) {
                zzt(intValue, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdq)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdo)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcno.this.zzg();
                    }
                });
            } else {
                zzs();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzcww
    public final synchronized void zzn() {
        zzfaj zzfajVar;
        List zzc;
        zzcuk zzcukVar;
        if (this.zzo) {
            ArrayList arrayList = new ArrayList(this.zzf.zzd);
            arrayList.addAll(this.zzf.zzg);
            zzfajVar = this.zzh;
            zzc = this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList);
        } else {
            zzfaj zzfajVar2 = this.zzh;
            zzfgf zzfgfVar = this.zzg;
            zzezr zzezrVar = this.zze;
            zzezf zzezfVar = this.zzf;
            zzfajVar2.zza(zzfgfVar.zzc(zzezrVar, zzezfVar, zzezfVar.zzn));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdl)).booleanValue() && (zzcukVar = this.zzn) != null) {
                this.zzh.zza(this.zzg.zzc(this.zzn.zzc(), this.zzn.zzb(), zzfgf.zzg(zzcukVar.zzb().zzn, zzcukVar.zza().zzf())));
            }
            zzfajVar = this.zzh;
            zzfgf zzfgfVar2 = this.zzg;
            zzezr zzezrVar2 = this.zze;
            zzezf zzezfVar2 = this.zzf;
            zzc = zzfgfVar2.zzc(zzezrVar2, zzezfVar2, zzezfVar2.zzg);
        }
        zzfajVar.zza(zzc);
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzp(zzbuw zzbuwVar, String str, String str2) {
        zzfaj zzfajVar = this.zzh;
        zzfgf zzfgfVar = this.zzg;
        zzezf zzezfVar = this.zzf;
        zzfajVar.zza(zzfgfVar.zze(zzezfVar, zzezfVar.zzi, zzbuwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzq() {
        zzfaj zzfajVar = this.zzh;
        zzfgf zzfgfVar = this.zzg;
        zzezr zzezrVar = this.zze;
        zzezf zzezfVar = this.zzf;
        zzfajVar.zza(zzfgfVar.zzc(zzezrVar, zzezfVar, zzezfVar.zzj));
    }
}
