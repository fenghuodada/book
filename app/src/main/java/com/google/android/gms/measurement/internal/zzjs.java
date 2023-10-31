package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjs implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzq zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zzjz zzf;

    public zzjs(zzjz zzjzVar, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar, boolean z) {
        this.zzf = zzjzVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzqVar;
        this.zze = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjz zzjzVar;
        zzej zzejVar;
        AtomicReference atomicReference2;
        List zzi;
        synchronized (this.zza) {
            try {
                zzjzVar = this.zzf;
                zzejVar = zzjzVar.zzb;
            } catch (RemoteException e) {
                this.zzf.zzt.zzaA().zzd().zzd("(legacy) Failed to get user properties; remote exception", null, this.zzb, e);
                this.zza.set(Collections.emptyList());
                atomicReference = this.zza;
            }
            if (zzejVar == null) {
                zzjzVar.zzt.zzaA().zzd().zzd("(legacy) Failed to get user properties; not connected to service", null, this.zzb, this.zzc);
                this.zza.set(Collections.emptyList());
                this.zza.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.checkNotNull(this.zzd);
                atomicReference2 = this.zza;
                zzi = zzejVar.zzh(this.zzb, this.zzc, this.zze, this.zzd);
            } else {
                atomicReference2 = this.zza;
                zzi = zzejVar.zzi(null, this.zzb, this.zzc, this.zze);
            }
            atomicReference2.set(zzi);
            this.zzf.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
