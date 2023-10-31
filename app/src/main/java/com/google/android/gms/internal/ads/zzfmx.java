package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfmx extends zzfnp {
    final /* synthetic */ zzfnd zza;
    final /* synthetic */ zzfng zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfnb zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfmx(zzfnb zzfnbVar, TaskCompletionSource taskCompletionSource, zzfnd zzfndVar, zzfng zzfngVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfnbVar;
        this.zza = zzfndVar;
        this.zzb = zzfngVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfnl] */
    @Override // com.google.android.gms.internal.ads.zzfnp
    public final void zza() {
        zzfno zzfnoVar;
        String str;
        String str2;
        String str3;
        try {
            ?? zze = this.zzd.zza.zze();
            zzfnb zzfnbVar = this.zzd;
            str2 = zzfnbVar.zzd;
            zzfnd zzfndVar = this.zza;
            str3 = zzfnbVar.zzd;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzfndVar.zze());
            bundle.putString("adFieldEnifd", zzfndVar.zzf());
            bundle.putInt("layoutGravity", zzfndVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfndVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", zzfndVar.zzd());
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str3);
            if (zzfndVar.zzg() != null) {
                bundle.putString("appId", zzfndVar.zzg());
            }
            zze.zzf(str2, bundle, new zzfna(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfnoVar = zzfnb.zzb;
            str = this.zzd.zzd;
            zzfnoVar.zzb(e, "show overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
