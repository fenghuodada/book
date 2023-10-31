package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class zzdvt extends zzdvn {
    private String zzg;
    private int zzh = 1;

    public zzdvt(Context context) {
        this.zzf = new zzbtg(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        zzcal zzcalVar;
        zzdwc zzdwcVar;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i = this.zzh;
                    if (i == 2) {
                        this.zzf.zzp().zze(this.zze, new zzdvm(this));
                    } else if (i == 3) {
                        this.zzf.zzp().zzh(this.zzg, new zzdvm(this));
                    } else {
                        this.zza.zze(new zzdwc(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    zzcalVar = this.zza;
                    zzdwcVar = new zzdwc(1);
                    zzcalVar.zze(zzdwcVar);
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    zzcalVar = this.zza;
                    zzdwcVar = new zzdwc(1);
                    zzcalVar.zze(zzdwcVar);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvn, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zzbzt.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zze(new zzdwc(1));
    }

    public final zzfwb zzb(zzbug zzbugVar) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                return zzfvr.zzg(new zzdwc(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbugVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvs
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdvt.this.zza();
                    }
                }, zzcag.zzf);
                return this.zza;
            }
        }
    }

    public final zzfwb zzc(String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                return zzfvr.zzg(new zzdwc(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdvt.this.zza();
                    }
                }, zzcag.zzf);
                return this.zza;
            }
        }
    }
}
