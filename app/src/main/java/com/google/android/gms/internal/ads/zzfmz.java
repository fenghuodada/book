package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfmz extends zzfnp {
    final /* synthetic */ zzfni zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfng zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzfnb zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfmz(zzfnb zzfnbVar, TaskCompletionSource taskCompletionSource, zzfni zzfniVar, int i, zzfng zzfngVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zze = zzfnbVar;
        this.zza = zzfniVar;
        this.zzb = i;
        this.zzc = zzfngVar;
        this.zzd = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfnl] */
    @Override // com.google.android.gms.internal.ads.zzfnp
    public final void zza() {
        zzfno zzfnoVar;
        String str;
        String str2;
        try {
            ?? zze = this.zze.zza.zze();
            zzfni zzfniVar = this.zza;
            str2 = this.zze.zzd;
            int i = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfniVar.zzb());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfniVar.zza());
            zze.zzg(bundle, new zzfna(this.zze, this.zzc));
        } catch (RemoteException e) {
            zzfnoVar = zzfnb.zzb;
            str = this.zze.zzd;
            zzfnoVar.zzb(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.zzb), str);
            this.zzd.trySetException(new RuntimeException(e));
        }
    }
}
