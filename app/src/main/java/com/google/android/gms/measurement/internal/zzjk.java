package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjk implements Runnable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzc;
    final /* synthetic */ zzjz zzd;

    public zzjk(zzjz zzjzVar, zzau zzauVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzjzVar;
        this.zza = zzauVar;
        this.zzb = str;
        this.zzc = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        byte[] bArr = null;
        try {
            try {
                zzjz zzjzVar = this.zzd;
                zzejVar = zzjzVar.zzb;
                if (zzejVar == null) {
                    zzjzVar.zzt.zzaA().zzd().zza("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArr = zzejVar.zzu(this.zza, this.zzb);
                    this.zzd.zzQ();
                }
            } catch (RemoteException e) {
                this.zzd.zzt.zzaA().zzd().zzb("Failed to send event to the service to bundle", e);
            }
        } finally {
            this.zzd.zzt.zzv().zzT(this.zzc, bArr);
        }
    }
}
