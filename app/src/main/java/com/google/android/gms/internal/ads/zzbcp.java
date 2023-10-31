package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzbcp {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbcp(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbcp zza(String str, double d) {
        return new zzbcp(str, Double.valueOf(d), 3);
    }

    public static zzbcp zzb(String str, long j) {
        return new zzbcp(str, Long.valueOf(j), 2);
    }

    public static zzbcp zzc(String str, String str2) {
        return new zzbcp(str, str2, 4);
    }

    public static zzbcp zzd(String str, boolean z) {
        return new zzbcp(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbdt zza = zzbdv.zza();
        if (zza != null) {
            int i = this.zzc - 1;
            return i != 0 ? i != 1 ? i != 2 ? zza.zzd(this.zza, (String) this.zzb) : zza.zzb(this.zza, ((Double) this.zzb).doubleValue()) : zza.zzc(this.zza, ((Long) this.zzb).longValue()) : zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzbdv.zzb() != null) {
            zzbdv.zzb().zza();
        }
        return this.zzb;
    }
}
