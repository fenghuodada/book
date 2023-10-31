package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzevr implements zzejv {
    private final Context zza;
    private final Executor zzb;
    private final zzcgw zzc;
    private final zzejf zzd;
    private final zzejj zze;
    private final ViewGroup zzf;
    @Nullable
    private zzbci zzg;
    private final zzcxx zzh;
    private final zzfft zzi;
    private final zzdae zzj;
    private final zzezy zzk;
    private zzfwb zzl;

    public zzevr(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcgw zzcgwVar, zzejf zzejfVar, zzejj zzejjVar, zzezy zzezyVar, zzdae zzdaeVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgwVar;
        this.zzd = zzejfVar;
        this.zze = zzejjVar;
        this.zzk = zzezyVar;
        this.zzh = zzcgwVar.zze();
        this.zzi = zzcgwVar.zzy();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdaeVar;
        zzezyVar.zzr(zzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzejv
    public final boolean zza() {
        zzfwb zzfwbVar = this.zzl;
        return (zzfwbVar == null || zzfwbVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzejv
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, @Nullable zzejt zzejtVar, zzeju zzejuVar) throws RemoteException {
        zzcpz zzd;
        zzcpa zzcpaVar;
        zzffq zzffqVar;
        if (str == null) {
            zzbzt.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevn
                @Override // java.lang.Runnable
                public final void run() {
                    zzevr.this.zzm();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzir)).booleanValue() && zzlVar.zzf) {
                this.zzc.zzj().zzm(true);
            }
            zzezy zzezyVar = this.zzk;
            zzezyVar.zzs(str);
            zzezyVar.zzE(zzlVar);
            zzfaa zzG = zzezyVar.zzG();
            zzfff zzb = zzffe.zzb(this.zza, zzffp.zzf(zzG), 3, zzlVar);
            if (((Boolean) zzbdj.zzd.zze()).booleanValue() && this.zzk.zzg().zzk) {
                zzejf zzejfVar = this.zzd;
                if (zzejfVar != null) {
                    zzejfVar.zza(zzfba.zzd(7, null, null));
                }
                return false;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhH)).booleanValue()) {
                zzd = this.zzc.zzd();
                zzcuq zzcuqVar = new zzcuq();
                zzcuqVar.zze(this.zza);
                zzcuqVar.zzi(zzG);
                zzd.zzi(zzcuqVar.zzj());
                zzdat zzdatVar = new zzdat();
                zzdatVar.zzj(this.zzd, this.zzb);
                zzdatVar.zzk(this.zzd, this.zzb);
                zzd.zzf(zzdatVar.zzn());
                zzd.zze(new zzeho(this.zzg));
                zzd.zzd(new zzdfh(zzdhn.zza, null));
                zzd.zzg(new zzcqx(this.zzh, this.zzj));
                zzcpaVar = new zzcpa(this.zzf);
            } else {
                zzd = this.zzc.zzd();
                zzcuq zzcuqVar2 = new zzcuq();
                zzcuqVar2.zze(this.zza);
                zzcuqVar2.zzi(zzG);
                zzd.zzi(zzcuqVar2.zzj());
                zzdat zzdatVar2 = new zzdat();
                zzdatVar2.zzj(this.zzd, this.zzb);
                zzdatVar2.zza(this.zzd, this.zzb);
                zzdatVar2.zza(this.zze, this.zzb);
                zzdatVar2.zzl(this.zzd, this.zzb);
                zzdatVar2.zzd(this.zzd, this.zzb);
                zzdatVar2.zze(this.zzd, this.zzb);
                zzdatVar2.zzf(this.zzd, this.zzb);
                zzdatVar2.zzb(this.zzd, this.zzb);
                zzdatVar2.zzk(this.zzd, this.zzb);
                zzdatVar2.zzi(this.zzd, this.zzb);
                zzd.zzf(zzdatVar2.zzn());
                zzd.zze(new zzeho(this.zzg));
                zzd.zzd(new zzdfh(zzdhn.zza, null));
                zzd.zzg(new zzcqx(this.zzh, this.zzj));
                zzcpaVar = new zzcpa(this.zzf);
            }
            zzd.zzc(zzcpaVar);
            zzcqa zzk = zzd.zzk();
            if (((Boolean) zzbcw.zzc.zze()).booleanValue()) {
                zzffq zzj = zzk.zzj();
                zzj.zzh(3);
                zzj.zzb(zzlVar.zzp);
                zzffqVar = zzj;
            } else {
                zzffqVar = null;
            }
            zzcsm zzd2 = zzk.zzd();
            zzfwb zzi = zzd2.zzi(zzd2.zzj());
            this.zzl = zzi;
            zzfvr.zzq(zzi, new zzevq(this, zzejuVar, zzffqVar, zzb, zzk), this.zzb);
            return true;
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzezy zzi() {
        return this.zzk;
    }

    public final /* synthetic */ void zzm() {
        this.zzd.zza(zzfba.zzd(6, null, null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zze.zza(zzbeVar);
    }

    public final void zzp(zzcxy zzcxyVar) {
        this.zzh.zzm(zzcxyVar, this.zzb);
    }

    public final void zzq(zzbci zzbciVar) {
        this.zzg = zzbciVar;
    }

    public final boolean zzr() {
        ViewParent parent = this.zzf.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            com.google.android.gms.ads.internal.zzt.zzp();
            return com.google.android.gms.ads.internal.util.zzs.zzS(view, view.getContext());
        }
        return false;
    }
}
