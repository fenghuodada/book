package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzejf implements AppEventListener, zzcyd, zzcww, zzcvl, zzcwc, com.google.android.gms.ads.internal.client.zza, zzcvi, zzcxt, zzcvy, zzdcw {
    @Nullable
    private final zzfen zzj;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicBoolean zzg = new AtomicBoolean(true);
    private final AtomicBoolean zzh = new AtomicBoolean(false);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    @VisibleForTesting
    final BlockingQueue zza = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzio)).intValue());

    public zzejf(@Nullable zzfen zzfenVar) {
        this.zzj = zzfenVar;
    }

    private final void zzu() {
        if (this.zzh.get() && this.zzi.get()) {
            for (final Pair pair : this.zza) {
                zzewk.zza(this.zzc, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeiw
                    @Override // com.google.android.gms.internal.ads.zzewj
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcb) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zza.clear();
            this.zzg.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjp)).booleanValue()) {
            return;
        }
        zzewk.zza(this.zzb, zzeix.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzg.get()) {
            zzewk.zza(this.zzc, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeis
                @Override // com.google.android.gms.internal.ads.zzewj
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzcb) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.zza.offer(new Pair(str, str2))) {
            zzbzt.zze("The queue for app events is full, dropping the new event.");
            zzfen zzfenVar = this.zzj;
            if (zzfenVar != null) {
                zzfem zzb = zzfem.zzb("dae_action");
                zzb.zza("dae_name", str);
                zzb.zza("dae_data", str2);
                zzfenVar.zzb(zzb);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzewk.zza(this.zzb, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeiz
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzewk.zza(this.zzb, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeja
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zze(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
        zzewk.zza(this.zze, new zzewj() { // from class: com.google.android.gms.internal.ads.zzejb
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzb(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        this.zzg.set(false);
        this.zza.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzb(zzezr zzezrVar) {
        this.zzg.set(true);
        this.zzi.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzbA(zzbug zzbugVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzbr() {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbh zzc() {
        return (com.google.android.gms.ads.internal.client.zzbh) this.zzb.get();
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcb zzd() {
        return (com.google.android.gms.ads.internal.client.zzcb) this.zzc.get();
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.set(zzbhVar);
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zze.set(zzbkVar);
    }

    public final void zzg(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzd.set(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzh(@NonNull final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzewk.zza(this.zzd, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeiu
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        this.zzc.set(zzcbVar);
        this.zzh.set(true);
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzj() {
        zzewk.zza(this.zzb, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeje
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzd();
            }
        });
        zzewk.zza(this.zzf, new zzewj() { // from class: com.google.android.gms.internal.ads.zzein
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvy
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzewk.zza(this.zzf, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeit
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzl() {
        zzewk.zza(this.zzb, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeim
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzm() {
        zzewk.zza(this.zzb, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeiv
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcww
    public final synchronized void zzn() {
        zzewk.zza(this.zzb, new zzewj() { // from class: com.google.android.gms.internal.ads.zzejc
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzi();
            }
        });
        zzewk.zza(this.zze, new zzewj() { // from class: com.google.android.gms.internal.ads.zzejd
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzc();
            }
        });
        this.zzi.set(true);
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzo() {
        zzewk.zza(this.zzb, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeip
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzj();
            }
        });
        zzewk.zza(this.zzf, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeiq
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzf();
            }
        });
        zzewk.zza(this.zzf, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeir
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzp(zzbuw zzbuwVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzr() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjp)).booleanValue()) {
            zzewk.zza(this.zzb, zzeix.zza);
        }
        zzewk.zza(this.zzf, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeiy
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzs() {
        zzewk.zza(this.zzb, new zzewj() { // from class: com.google.android.gms.internal.ads.zzeio
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzk();
            }
        });
    }

    public final void zzt(com.google.android.gms.ads.internal.client.zzci zzciVar) {
        this.zzf.set(zzciVar);
    }
}
