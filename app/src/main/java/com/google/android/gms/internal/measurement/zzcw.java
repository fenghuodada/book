package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcw extends zzdu {
    final /* synthetic */ long zza;
    final /* synthetic */ zzef zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(zzef zzefVar, long j) {
        super(zzefVar, true);
        this.zzb = zzefVar;
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        zzcc zzccVar;
        zzccVar = this.zzb.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setSessionTimeoutDuration(this.zza);
    }
}
