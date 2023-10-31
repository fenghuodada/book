package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes.dex */
public final class zzbzd {
    @VisibleForTesting
    final String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    @VisibleForTesting
    long zza = -1;
    @VisibleForTesting
    long zzb = -1;
    @VisibleForTesting
    int zzc = -1;
    @VisibleForTesting
    int zzd = -1;
    @VisibleForTesting
    long zze = 0;
    private final Object zzi = new Object();
    @VisibleForTesting
    int zzg = 0;
    @VisibleForTesting
    int zzh = 0;

    public zzbzd(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzj = zzgVar;
    }

    private final void zzg() {
        if (((Boolean) zzbdk.zza.zze()).booleanValue()) {
            synchronized (this.zzi) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final Bundle zza(Context context, String str) {
        Bundle bundle;
        String str2;
        synchronized (this.zzi) {
            bundle = new Bundle();
            if (!this.zzj.zzP()) {
                bundle.putString("session_id", this.zzf);
            }
            bundle.putLong("basets", this.zzb);
            bundle.putLong("currts", this.zza);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzc);
            bundle.putInt("preqs_in_session", this.zzd);
            bundle.putLong("time_in_session", this.zze);
            bundle.putInt("pclick", this.zzg);
            bundle.putInt("pimp", this.zzh);
            Context zza = zzbuu.zza(context);
            int identifier = zza.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z = false;
            if (identifier == 0) {
                str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
            } else {
                try {
                    if (identifier == zza.getPackageManager().getActivityInfo(new ComponentName(zza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                        z = true;
                    } else {
                        zzbzt.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zzbzt.zzj("Fail to fetch AdActivity theme");
                    str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
                }
                bundle.putBoolean("support_transparent_background", z);
            }
            zzbzt.zzi(str2);
            bundle.putBoolean("support_transparent_background", z);
        }
        return bundle;
    }

    public final void zzb() {
        synchronized (this.zzi) {
            this.zzg++;
        }
    }

    public final void zzc() {
        synchronized (this.zzi) {
            this.zzh++;
        }
    }

    public final void zzd() {
        zzg();
    }

    public final void zze() {
        zzg();
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, long j) {
        Bundle bundle;
        synchronized (this.zzi) {
            long zzd = this.zzj.zzd();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            if (this.zzb == -1) {
                if (currentTimeMillis - zzd > ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaQ)).longValue()) {
                    this.zzd = -1;
                } else {
                    this.zzd = this.zzj.zzc();
                }
                this.zzb = j;
            }
            this.zza = j;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdk)).booleanValue() && (bundle = zzlVar.zzc) != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.zzc++;
            int i = this.zzd + 1;
            this.zzd = i;
            if (i == 0) {
                this.zze = 0L;
                this.zzj.zzD(currentTimeMillis);
            } else {
                this.zze = currentTimeMillis - this.zzj.zze();
            }
        }
    }
}
