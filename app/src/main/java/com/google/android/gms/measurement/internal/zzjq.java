package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjq implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzq zzd;
    final /* synthetic */ zzjz zze;

    public zzjq(zzjz zzjzVar, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar) {
        this.zze = zzjzVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjz zzjzVar;
        zzej zzejVar;
        AtomicReference atomicReference2;
        List zzg;
        synchronized (this.zza) {
            try {
                zzjzVar = this.zze;
                zzejVar = zzjzVar.zzb;
            } catch (RemoteException e) {
                this.zze.zzt.zzaA().zzd().zzd("(legacy) Failed to get conditional properties; remote exception", null, this.zzb, e);
                this.zza.set(Collections.emptyList());
                atomicReference = this.zza;
            }
            if (zzejVar == null) {
                zzjzVar.zzt.zzaA().zzd().zzd("(legacy) Failed to get conditional properties; not connected to service", null, this.zzb, this.zzc);
                this.zza.set(Collections.emptyList());
                this.zza.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.checkNotNull(this.zzd);
                atomicReference2 = this.zza;
                zzg = zzejVar.zzf(this.zzb, this.zzc, this.zzd);
            } else {
                atomicReference2 = this.zza;
                zzg = zzejVar.zzg(null, this.zzb, this.zzc);
            }
            atomicReference2.set(zzg);
            this.zze.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
