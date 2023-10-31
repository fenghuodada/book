package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfmy extends zzfnp {
    final /* synthetic */ zzfms zza;
    final /* synthetic */ zzfng zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfnb zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfmy(zzfnb zzfnbVar, TaskCompletionSource taskCompletionSource, zzfms zzfmsVar, zzfng zzfngVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfnbVar;
        this.zza = zzfmsVar;
        this.zzb = zzfngVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfnl] */
    @Override // com.google.android.gms.internal.ads.zzfnp
    public final void zza() {
        zzfno zzfnoVar;
        String str;
        String str2;
        try {
            ?? zze = this.zzd.zza.zze();
            zzfms zzfmsVar = this.zza;
            str2 = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfmsVar.zzb());
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfmsVar.zza());
            zze.zze(bundle, new zzfna(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfnoVar = zzfnb.zzb;
            str = this.zzd.zzd;
            zzfnoVar.zzb(e, "dismiss overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
