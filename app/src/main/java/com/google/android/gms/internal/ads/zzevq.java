package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzevq implements zzfvn {
    final /* synthetic */ zzeju zza;
    final /* synthetic */ zzffq zzb;
    final /* synthetic */ zzfff zzc;
    final /* synthetic */ zzcqa zzd;
    final /* synthetic */ zzevr zze;

    public zzevq(zzevr zzevrVar, zzeju zzejuVar, zzffq zzffqVar, zzfff zzfffVar, zzcqa zzcqaVar) {
        this.zze = zzevrVar;
        this.zza = zzejuVar;
        this.zzb = zzffqVar;
        this.zzc = zzfffVar;
        this.zzd = zzcqaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzcxx zzcxxVar;
        zzdae zzdaeVar;
        zzfft zzfftVar;
        zzffq zzffqVar;
        Executor executor;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zza(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhH)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevp
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzejf zzejfVar;
                        zzevq zzevqVar = zzevq.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzejfVar = zzevqVar.zze.zzd;
                        zzejfVar.zza(zzeVar);
                    }
                });
            }
            zzevr zzevrVar = this.zze;
            zzcxxVar = zzevrVar.zzh;
            zzdaeVar = zzevrVar.zzj;
            zzcxxVar.zzd(zzdaeVar.zzc());
            zzfau.zzb(zza.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcw.zzc.zze()).booleanValue() || (zzffqVar = this.zzb) == null) {
                zzfftVar = this.zze.zzi;
                zzfff zzfffVar = this.zzc;
                zzfffVar.zza(zza);
                zzfffVar.zzg(th);
                zzfffVar.zzf(false);
                zzfftVar.zzb(zzfffVar.zzl());
            } else {
                zzffqVar.zzc(zza);
                zzfff zzfffVar2 = this.zzc;
                zzfffVar2.zzg(th);
                zzfffVar2.zzf(false);
                zzffqVar.zza(zzfffVar2);
                zzffqVar.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzcxx zzcxxVar;
        zzfft zzfftVar;
        zzffq zzffqVar;
        Executor executor;
        final zzejf zzejfVar;
        zzejf zzejfVar2;
        zzejj zzejjVar;
        zzcpd zzcpdVar = (zzcpd) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            viewGroup = this.zze.zzf;
            viewGroup.removeAllViews();
            if (zzcpdVar.zzc() != null) {
                ViewParent parent = zzcpdVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    String zzg = zzcpdVar.zzl() != null ? zzcpdVar.zzl().zzg() : "";
                    zzbzt.zzj("Banner view provided from " + zzg + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcpdVar.zzc());
                }
            }
            zzbbc zzbbcVar = zzbbk.zzhH;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).booleanValue()) {
                zzczn zzn = zzcpdVar.zzn();
                zzejfVar2 = this.zze.zzd;
                zzn.zza(zzejfVar2);
                zzejjVar = this.zze.zze;
                zzn.zzc(zzejjVar);
            }
            viewGroup2 = this.zze.zzf;
            viewGroup2.addView(zzcpdVar.zzc());
            this.zza.zzb(zzcpdVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).booleanValue()) {
                zzevr zzevrVar = this.zze;
                executor = zzevrVar.zzb;
                zzejfVar = zzevrVar.zzd;
                zzejfVar.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzejf.this.zzn();
                    }
                });
            }
            zzcxxVar = this.zze.zzh;
            zzcxxVar.zzd(zzcpdVar.zza());
            if (!((Boolean) zzbcw.zzc.zze()).booleanValue() || (zzffqVar = this.zzb) == null) {
                zzfftVar = this.zze.zzi;
                zzfff zzfffVar = this.zzc;
                zzfffVar.zzb(zzcpdVar.zzp().zzb);
                zzfffVar.zzd(zzcpdVar.zzl().zzg());
                zzfffVar.zzf(true);
                zzfftVar.zzb(zzfffVar.zzl());
            } else {
                zzffqVar.zzf(zzcpdVar.zzp().zzb);
                zzffqVar.zze(zzcpdVar.zzl().zzg());
                zzfff zzfffVar2 = this.zzc;
                zzfffVar2.zzf(true);
                zzffqVar.zza(zzfffVar2);
                zzffqVar.zzg();
            }
        }
    }
}
