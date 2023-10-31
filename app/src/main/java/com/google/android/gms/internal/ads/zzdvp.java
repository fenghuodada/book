package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzdvp extends zzdvn {
    public zzdvp(Context context) {
        this.zzf = new zzbtg(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzcal zzcalVar;
        zzdwc zzdwcVar;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, new zzdvm(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    zzcalVar = this.zza;
                    zzdwcVar = new zzdwc(1);
                    zzcalVar.zze(zzdwcVar);
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteSignalsClientTask.onConnected");
                    zzcalVar = this.zza;
                    zzdwcVar = new zzdwc(1);
                    zzcalVar.zze(zzdwcVar);
                }
            }
        }
    }

    public final zzfwb zzb(zzbug zzbugVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbugVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvo
                @Override // java.lang.Runnable
                public final void run() {
                    zzdvp.this.zza();
                }
            }, zzcag.zzf);
            return this.zza;
        }
    }
}
