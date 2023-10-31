package com.google.android.gms.measurement.internal;

import com.google.android.exoplayer2.analytics.C6652m;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjc implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzlk zzc;
    final /* synthetic */ zzjz zzd;

    public zzjc(zzjz zzjzVar, zzq zzqVar, boolean z, zzlk zzlkVar) {
        this.zzd = zzjzVar;
        this.zza = zzqVar;
        this.zzb = z;
        this.zzc = zzlkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzlk zzlkVar;
        zzjz zzjzVar = this.zzd;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            C6652m.m6131a(zzjzVar.zzt, "Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjz zzjzVar2 = this.zzd;
        if (this.zzb) {
            zzlkVar = null;
        } else {
            zzlkVar = this.zzc;
        }
        zzjzVar2.zzD(zzejVar, zzlkVar, this.zza);
        this.zzd.zzQ();
    }
}
