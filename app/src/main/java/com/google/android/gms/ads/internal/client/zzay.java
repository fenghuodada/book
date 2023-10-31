package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbwb;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzz;
import java.util.Random;

/* loaded from: classes.dex */
public final class zzay {
    private static final zzay zza = new zzay();
    private final zzbzm zzb;
    private final zzaw zzc;
    private final String zzd;
    private final zzbzz zze;
    private final Random zzf;

    public zzay() {
        zzbzm zzbzmVar = new zzbzm();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzeq(), new zzbgp(), new zzbwb(), new zzbrs(), new zzbgq());
        String zzd = zzbzm.zzd();
        zzbzz zzbzzVar = new zzbzz(0, 231700000, true, false, false);
        Random random = new Random();
        this.zzb = zzbzmVar;
        this.zzc = zzawVar;
        this.zzd = zzd;
        this.zze = zzbzzVar;
        this.zzf = random;
    }

    public static zzaw zza() {
        return zza.zzc;
    }

    public static zzbzm zzb() {
        return zza.zzb;
    }

    public static zzbzz zzc() {
        return zza.zze;
    }

    public static String zzd() {
        return zza.zzd;
    }

    public static Random zze() {
        return zza.zzf;
    }
}
