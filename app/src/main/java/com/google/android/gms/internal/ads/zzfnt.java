package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfnt extends zzfnp {
    final /* synthetic */ zzfnz zza;

    public zzfnt(zzfnz zzfnzVar) {
        this.zza = zzfnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnp
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        zzfno zzfnoVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        zzfno zzfnoVar2;
        obj = this.zza.zzg;
        synchronized (obj) {
            atomicInteger = this.zza.zzl;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.zza.zzl;
                if (atomicInteger2.decrementAndGet() > 0) {
                    zzfnoVar2 = this.zza.zzc;
                    zzfnoVar2.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            zzfnz zzfnzVar = this.zza;
            iInterface = zzfnzVar.zzn;
            if (iInterface != null) {
                zzfnoVar = zzfnzVar.zzc;
                zzfnoVar.zzc("Unbind from service.", new Object[0]);
                zzfnz zzfnzVar2 = this.zza;
                context = zzfnzVar2.zzb;
                serviceConnection = zzfnzVar2.zzm;
                context.unbindService(serviceConnection);
                this.zza.zzh = false;
                this.zza.zzn = null;
                this.zza.zzm = null;
            }
            this.zza.zzw();
        }
    }
}
