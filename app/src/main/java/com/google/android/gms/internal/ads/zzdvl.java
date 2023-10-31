package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class zzdvl extends zzdvn {
    public zzdvl(Context context) {
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
                    this.zzf.zzp().zzg(this.zze, new zzdvm(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    zzcalVar = this.zza;
                    zzdwcVar = new zzdwc(1);
                    zzcalVar.zze(zzdwcVar);
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteAdRequestClientTask.onConnected");
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
}
