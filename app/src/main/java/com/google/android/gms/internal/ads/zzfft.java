package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfft implements Runnable {
    @GuardedBy("enabledLock")
    @VisibleForTesting
    public static Boolean zzb;
    private final Context zze;
    private final zzbzz zzf;
    private int zzi;
    private final zzdnu zzj;
    private final List zzk;
    private final zzdyy zzm;
    private final zzbus zzn;
    @VisibleForTesting
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    @GuardedBy("protoLock")
    private final zzffy zzg = zzfgb.zzc();
    private String zzh = "";
    @GuardedBy("initLock")
    private boolean zzl = false;

    public zzfft(Context context, zzbzz zzbzzVar, zzdnu zzdnuVar, zzdyy zzdyyVar, zzbus zzbusVar) {
        this.zze = context;
        this.zzf = zzbzzVar;
        this.zzj = zzdnuVar;
        this.zzm = zzdyyVar;
        this.zzn = zzbusVar;
        this.zzk = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzin)).booleanValue() ? com.google.android.gms.ads.internal.util.zzs.zzd() : zzfrr.zzl();
    }

    public static boolean zza() {
        boolean booleanValue;
        Boolean valueOf;
        synchronized (zza) {
            if (zzb == null) {
                if (((Boolean) zzbcw.zzb.zze()).booleanValue()) {
                    valueOf = Boolean.valueOf(Math.random() < ((Double) zzbcw.zza.zze()).doubleValue());
                } else {
                    valueOf = Boolean.FALSE;
                }
                zzb = valueOf;
            }
            booleanValue = zzb.booleanValue();
        }
        return booleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] zzax;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        zzax = ((zzfgb) this.zzg.zzal()).zzax();
                        this.zzg.zzc();
                    }
                    new zzdyx(this.zze, this.zzf.zza, this.zzn, Binder.getCallingUid()).zza(new zzdyv((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzih), 60000, new HashMap(), zzax, "application/x-protobuf", false));
                } catch (Exception e) {
                    if ((e instanceof zzdtz) && ((zzdtz) e).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(@Nullable final zzffj zzffjVar) {
        zzcag.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffs
            @Override // java.lang.Runnable
            public final void run() {
                zzfft.this.zzc(zzffjVar);
            }
        });
    }

    public final /* synthetic */ void zzc(zzffj zzffjVar) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    this.zzh = com.google.android.gms.ads.internal.util.zzs.zzn(this.zze);
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzii)).intValue();
                    zzcag.zzd.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
                }
            }
        }
        if (zza() && zzffjVar != null) {
            synchronized (zzc) {
                if (this.zzg.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzij)).intValue()) {
                    return;
                }
                zzffv zza2 = zzffw.zza();
                zza2.zzt(zzffjVar.zzl());
                zza2.zzp(zzffjVar.zzk());
                zza2.zzg(zzffjVar.zzb());
                zza2.zzv(3);
                zza2.zzm(this.zzf.zza);
                zza2.zzb(this.zzh);
                zza2.zzk(Build.VERSION.RELEASE);
                zza2.zzq(Build.VERSION.SDK_INT);
                zza2.zzu(zzffjVar.zzn());
                zza2.zzj(zzffjVar.zza());
                zza2.zze(this.zzi);
                zza2.zzs(zzffjVar.zzm());
                zza2.zzc(zzffjVar.zzd());
                zza2.zzf(zzffjVar.zzf());
                zza2.zzh(zzffjVar.zzg());
                zza2.zzi(this.zzj.zzc(zzffjVar.zzg()));
                zza2.zzl(zzffjVar.zzh());
                zza2.zzd(zzffjVar.zze());
                zza2.zzr(zzffjVar.zzj());
                zza2.zzn(zzffjVar.zzi());
                zza2.zzo(zzffjVar.zzc());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzin)).booleanValue()) {
                    zza2.zza(this.zzk);
                }
                zzffy zzffyVar = this.zzg;
                zzffz zza3 = zzfga.zza();
                zza3.zza(zza2);
                zzffyVar.zzb(zza3);
            }
        }
    }
}
