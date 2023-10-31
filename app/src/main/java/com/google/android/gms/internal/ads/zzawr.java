package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzawr implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzawj zza;
    final /* synthetic */ zzcal zzb;
    final /* synthetic */ zzawt zzc;

    public zzawr(zzawt zzawtVar, zzawj zzawjVar, zzcal zzcalVar) {
        this.zzc = zzawtVar;
        this.zza = zzawjVar;
        this.zzb = zzcalVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        Object obj;
        boolean z;
        final zzawi zzawiVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            zzawt zzawtVar = this.zzc;
            z = zzawtVar.zzb;
            if (z) {
                return;
            }
            zzawtVar.zzb = true;
            zzawiVar = this.zzc.zza;
            if (zzawiVar == null) {
                return;
            }
            zzfwc zzfwcVar = zzcag.zza;
            final zzawj zzawjVar = this.zza;
            final zzcal zzcalVar = this.zzb;
            final zzfwb zza = zzfwcVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzawo
                @Override // java.lang.Runnable
                public final void run() {
                    zzawr zzawrVar = zzawr.this;
                    zzawi zzawiVar2 = zzawiVar;
                    zzawj zzawjVar2 = zzawjVar;
                    zzcal zzcalVar2 = zzcalVar;
                    try {
                        zzawl zzq = zzawiVar2.zzq();
                        zzawg zzg = zzawiVar2.zzp() ? zzq.zzg(zzawjVar2) : zzq.zzf(zzawjVar2);
                        if (!zzg.zze()) {
                            zzcalVar2.zze(new RuntimeException("No entry contents."));
                            zzawt.zze(zzawrVar.zzc);
                            return;
                        }
                        zzawq zzawqVar = new zzawq(zzawrVar, zzg.zzc(), 1);
                        int read = zzawqVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzawqVar.unread(read);
                        zzcalVar2.zzd(zzawv.zzb(zzawqVar, zzg.zzd(), zzg.zzg(), zzg.zza(), zzg.zzf()));
                    } catch (RemoteException | IOException e) {
                        zzbzt.zzh("Unable to obtain a cache service instance.", e);
                        zzcalVar2.zze(e);
                        zzawt.zze(zzawrVar.zzc);
                    }
                }
            });
            final zzcal zzcalVar2 = this.zzb;
            zzcalVar2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzawp
                @Override // java.lang.Runnable
                public final void run() {
                    zzcal zzcalVar3 = zzcal.this;
                    Future future = zza;
                    if (zzcalVar3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzcag.zzf);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
