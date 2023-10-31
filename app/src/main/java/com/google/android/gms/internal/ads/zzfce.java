package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfce implements zzfvn {
    final /* synthetic */ zzfch zza;
    final /* synthetic */ zzfci zzb;

    public zzfce(zzfci zzfciVar, zzfch zzfchVar) {
        this.zzb = zzfciVar;
        this.zza = zzfchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i;
        Void r4 = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzfci zzfciVar = this.zzb;
            i = zzfciVar.zzf;
            if (i == 1) {
                zzfciVar.zzh();
            }
        }
    }
}
