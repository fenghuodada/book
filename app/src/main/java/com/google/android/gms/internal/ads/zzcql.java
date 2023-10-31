package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.WorkerThread;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzcql extends zzcpd {
    private final zzbgh zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcql(zzcre zzcreVar, zzbgh zzbghVar, Runnable runnable, Executor executor) {
        super(zzcreVar);
        this.zzc = zzbghVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    public static /* synthetic */ void zzi(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final View zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final com.google.android.gms.ads.internal.client.zzdq zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final zzezg zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final zzezg zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcrf
    @WorkerThread
    public final void zzj() {
        final zzcqj zzcqjVar = new zzcqj(new AtomicReference(this.zzd));
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqk
            @Override // java.lang.Runnable
            public final void run() {
                zzcql.this.zzk(zzcqjVar);
            }
        });
    }

    public final /* synthetic */ void zzk(Runnable runnable) {
        try {
            if (this.zzc.zzb(ObjectWrapper.wrap(runnable))) {
                return;
            }
            zzi(((zzcqj) runnable).zza);
        } catch (RemoteException unused) {
            zzi(((zzcqj) runnable).zza);
        }
    }
}
