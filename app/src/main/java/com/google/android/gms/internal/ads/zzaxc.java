package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzaxc {
    final /* synthetic */ zzaxd zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzaxc(zzaxd zzaxdVar, byte[] bArr, zzaxb zzaxbVar) {
        this.zza = zzaxdVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzaxd zzaxdVar = this.zza;
            if (zzaxdVar.zzb) {
                zzaxdVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            zzbzt.zzf("Clearcut log failed", e);
        }
    }

    public final zzaxc zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        ExecutorService executorService;
        executorService = this.zza.zzc;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaxa
            @Override // java.lang.Runnable
            public final void run() {
                zzaxc.this.zzd();
            }
        });
    }
}
