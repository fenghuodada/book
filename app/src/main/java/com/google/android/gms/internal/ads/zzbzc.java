package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbzc {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzbzg zzc;
    private boolean zzd;
    private Context zze;
    private zzbzz zzf;
    private String zzg;
    @Nullable
    private zzbbs zzh;
    @Nullable
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final zzbzb zzk;
    private final Object zzl;
    @GuardedBy("grantedPermissionLock")
    private zzfwb zzm;
    private final AtomicBoolean zzn;

    public zzbzc() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzbzg(com.google.android.gms.ads.internal.client.zzay.zzd(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new zzbzb(null);
        this.zzl = new Object();
        this.zzn = new AtomicBoolean();
    }

    public final int zza() {
        return this.zzj.get();
    }

    @Nullable
    public final Context zzc() {
        return this.zze;
    }

    @Nullable
    public final Resources zzd() {
        if (this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjr)).booleanValue()) {
                return zzbzx.zza(this.zze).getResources();
            }
            zzbzx.zza(this.zze).getResources();
            return null;
        } catch (zzbzw e) {
            zzbzt.zzk("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    @Nullable
    public final zzbbs zzf() {
        zzbbs zzbbsVar;
        synchronized (this.zza) {
            zzbbsVar = this.zzh;
        }
        return zzbbsVar;
    }

    public final zzbzg zzg() {
        return this.zzc;
    }

    public final com.google.android.gms.ads.internal.util.zzg zzh() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final zzfwb zzj() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzct)).booleanValue()) {
                synchronized (this.zzl) {
                    zzfwb zzfwbVar = this.zzm;
                    if (zzfwbVar != null) {
                        return zzfwbVar;
                    }
                    zzfwb zzb = zzcag.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzbyx
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzbzc.this.zzn();
                        }
                    });
                    this.zzm = zzb;
                    return zzb;
                }
            }
        }
        return zzfvr.zzh(new ArrayList());
    }

    public final Boolean zzk() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzm() {
        return this.zzg;
    }

    public final /* synthetic */ ArrayList zzn() throws Exception {
        Context zza = zzbuu.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(zza).getPackageInfo(zza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzp() {
        this.zzk.zza();
    }

    public final void zzq() {
        this.zzj.decrementAndGet();
    }

    public final void zzr() {
        this.zzj.incrementAndGet();
    }

    @TargetApi(23)
    public final void zzs(Context context, zzbzz zzbzzVar) {
        zzbbs zzbbsVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = zzbzzVar;
                com.google.android.gms.ads.internal.zzt.zzb().zzc(this.zzc);
                this.zzb.zzr(this.zze);
                zzbsy.zzb(this.zze, this.zzf);
                com.google.android.gms.ads.internal.zzt.zze();
                if (((Boolean) zzbcx.zzc.zze()).booleanValue()) {
                    zzbbsVar = new zzbbs();
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbbsVar = null;
                }
                this.zzh = zzbbsVar;
                if (zzbbsVar != null) {
                    zzcaj.zza(new zzbyy(this).zzb(), "AppState.registerCsiReporter");
                }
                if (PlatformVersion.isAtLeastO()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhU)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbyz(this));
                    }
                }
                this.zzd = true;
                zzj();
            }
        }
        com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzbzzVar.zza);
    }

    public final void zzt(Throwable th, String str) {
        zzbsy.zzb(this.zze, this.zzf).zzg(th, str, ((Double) zzbdm.zzg.zze()).floatValue());
    }

    public final void zzu(Throwable th, String str) {
        zzbsy.zzb(this.zze, this.zzf).zzf(th, str);
    }

    public final void zzv(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzw(String str) {
        this.zzg = str;
    }

    public final boolean zzx(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhU)).booleanValue()) {
                return this.zzn.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
