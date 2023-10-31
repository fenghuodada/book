package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzflv;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzccd {
    private final Context zza;
    private final String zzb;
    private final zzbzz zzc;
    @Nullable
    private final zzbbz zzd;
    @Nullable
    private final zzbcc zze;
    private final com.google.android.gms.ads.internal.util.zzbf zzf;
    private final long[] zzg;
    private final String[] zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcbi zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;

    public zzccd(Context context, zzbzz zzbzzVar, String str, @Nullable zzbcc zzbccVar, @Nullable zzbbz zzbbzVar) {
        com.google.android.gms.ads.internal.util.zzbd zzbdVar = new com.google.android.gms.ads.internal.util.zzbd();
        zzbdVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbdVar.zza("1_5", 1.0d, 5.0d);
        zzbdVar.zza("5_10", 5.0d, 10.0d);
        zzbdVar.zza("10_20", 10.0d, 20.0d);
        zzbdVar.zza("20_30", 20.0d, 30.0d);
        zzbdVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzf = zzbdVar.zzb();
        this.zzi = false;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzq = -1L;
        this.zza = context;
        this.zzc = zzbzzVar;
        this.zzb = str;
        this.zze = zzbccVar;
        this.zzd = zzbbzVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzA);
        if (str2 == null) {
            this.zzh = new String[0];
            this.zzg = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzh = new String[length];
        this.zzg = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzg[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                zzbzt.zzk("Unable to parse frame hash target time number.", e);
                this.zzg[i] = -1;
            }
        }
    }

    public final void zza(zzcbi zzcbiVar) {
        zzbbu.zza(this.zze, this.zzd, "vpc2");
        this.zzi = true;
        this.zze.zzd("vpn", zzcbiVar.zzj());
        this.zzn = zzcbiVar;
    }

    public final void zzb() {
        if (!this.zzi || this.zzj) {
            return;
        }
        zzbbu.zza(this.zze, this.zzd, "vfr2");
        this.zzj = true;
    }

    public final void zzc() {
        this.zzm = true;
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbbu.zza(this.zze, this.zzd, "vfp2");
        this.zzk = true;
    }

    public final void zzd() {
        if (!((Boolean) zzbds.zza.zze()).booleanValue() || this.zzo) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzb);
        bundle.putString("player", this.zzn.zzj());
        for (com.google.android.gms.ads.internal.util.zzbc zzbcVar : this.zzf.zza()) {
            String valueOf = String.valueOf(zzbcVar.zza);
            bundle.putString("fps_c_".concat(valueOf), Integer.toString(zzbcVar.zze));
            String valueOf2 = String.valueOf(zzbcVar.zza);
            bundle.putString("fps_p_".concat(valueOf2), Double.toString(zzbcVar.zzd));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.zzg;
            if (i >= jArr.length) {
                com.google.android.gms.ads.internal.zzt.zzp();
                final Context context = this.zza;
                final String str = this.zzc.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                bundle.putString("device", com.google.android.gms.ads.internal.util.zzs.zzp());
                zzbbc zzbbcVar = zzbbk.zza;
                bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().zza()));
                com.google.android.gms.ads.internal.client.zzay.zzb();
                zzbzm.zzw(context, str, "gmob-apps", bundle, true, new zzbzl() { // from class: com.google.android.gms.ads.internal.util.zzk
                    @Override // com.google.android.gms.internal.ads.zzbzl
                    public final boolean zza(String str2) {
                        Context context2 = context;
                        String str3 = str;
                        zzflv zzflvVar = zzs.zza;
                        com.google.android.gms.ads.internal.zzt.zzp();
                        zzs.zzH(context2, str3, str2);
                        return true;
                    }
                });
                this.zzo = true;
                return;
            }
            String str2 = this.zzh[i];
            if (str2 != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str2);
            }
            i++;
        }
    }

    public final void zze() {
        this.zzm = false;
    }

    public final void zzf(zzcbi zzcbiVar) {
        if (this.zzk && !this.zzl) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzl) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbbu.zza(this.zze, this.zzd, "vff2");
            this.zzl = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzt.zzB().nanoTime();
        if (this.zzm && this.zzp && this.zzq != -1) {
            this.zzf.zzb(TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.zzq));
        }
        this.zzp = this.zzm;
        this.zzq = nanoTime;
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzB)).longValue();
        long zza = zzcbiVar.zza();
        int i = 0;
        while (true) {
            String[] strArr = this.zzh;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(zza - this.zzg[i])) {
                String[] strArr2 = this.zzh;
                int i2 = 8;
                Bitmap bitmap = zzcbiVar.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j);
                        j--;
                        i4++;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            i++;
        }
    }
}
