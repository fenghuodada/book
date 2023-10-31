package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjr implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzq zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzd;
    final /* synthetic */ zzjz zze;

    public zzjr(zzjz zzjzVar, String str, String str2, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zze = zzjzVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzjz zzjzVar = this.zze;
                zzejVar = zzjzVar.zzb;
                if (zzejVar == null) {
                    zzjzVar.zzt.zzaA().zzd().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                } else {
                    Preconditions.checkNotNull(this.zzc);
                    arrayList = zzlp.zzH(zzejVar.zzf(this.zza, this.zzb, this.zzc));
                    this.zze.zzQ();
                }
            } catch (RemoteException e) {
                this.zze.zzt.zzaA().zzd().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e);
            }
        } finally {
            this.zze.zzt.zzv().zzR(this.zzd, arrayList);
        }
    }
}
