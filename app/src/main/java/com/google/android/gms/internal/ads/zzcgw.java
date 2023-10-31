package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class zzcgw implements zzcmi {
    @Nullable
    private static zzcgw zza;

    private static synchronized zzcgw zzC(Context context, @Nullable zzbny zzbnyVar, int i, boolean z, int i2, zzchz zzchzVar) {
        synchronized (zzcgw.class) {
            zzcgw zzcgwVar = zza;
            if (zzcgwVar != null) {
                return zzcgwVar;
            }
            zzbbk.zza(context);
            zzfat zzd = zzfat.zzd(context);
            zzbzz zzc = zzd.zzc(231700000, false, i2);
            zzd.zze(zzbnyVar);
            zzcjn zzcjnVar = new zzcjn(null);
            zzcgx zzcgxVar = new zzcgx();
            zzcgxVar.zzd(zzc);
            zzcgxVar.zzc(context);
            zzcjnVar.zzb(new zzcgz(zzcgxVar, null));
            zzcjnVar.zzc(new zzcla(zzchzVar));
            zzcgw zza2 = zzcjnVar.zza();
            com.google.android.gms.ads.internal.zzt.zzo().zzs(context, zzc);
            com.google.android.gms.ads.internal.zzt.zzc().zzi(context);
            com.google.android.gms.ads.internal.zzt.zzp().zzj(context);
            com.google.android.gms.ads.internal.zzt.zzp().zzi(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzt.zzb().zzd(context);
            com.google.android.gms.ads.internal.zzt.zzv().zzb(context);
            zzbxz.zzd(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfU)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzav)).booleanValue()) {
                    zzawx zzawxVar = new zzawx(new zzaxd(context));
                    zzdzv zzdzvVar = new zzdzv(new zzdzr(context), zza2.zzz());
                    com.google.android.gms.ads.internal.zzt.zzp();
                    new zzear(context, zzc, zzawxVar, zzdzvVar, UUID.randomUUID().toString(), zza2.zzx()).zzb(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzcgw zza(Context context, @Nullable zzbny zzbnyVar, int i) {
        return zzC(context, zzbnyVar, 231700000, false, i, new zzchz());
    }

    public abstract Executor zzA();

    public abstract ScheduledExecutorService zzB();

    public abstract zzcll zzb();

    public abstract zzcoq zzc();

    public abstract zzcpz zzd();

    public abstract zzcxx zze();

    public abstract zzdep zzf();

    public abstract zzdfl zzg();

    public abstract zzdms zzh();

    public abstract zzdrk zzi();

    public abstract zzdsz zzj();

    public abstract zzdtt zzk();

    public abstract zzebn zzl();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzc zzm();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzg zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzaa zzo();

    @Override // com.google.android.gms.internal.ads.zzcmi
    public final zzeri zzp(zzbug zzbugVar, int i) {
        return zzq(new zzetk(zzbugVar, i));
    }

    public abstract zzeri zzq(zzetk zzetkVar);

    public abstract zzeuf zzr();

    public abstract zzevt zzs();

    public abstract zzexk zzt();

    public abstract zzeyy zzu();

    public abstract zzfam zzv();

    public abstract zzfaw zzw();

    public abstract zzfen zzx();

    public abstract zzfft zzy();

    public abstract zzfwc zzz();
}
