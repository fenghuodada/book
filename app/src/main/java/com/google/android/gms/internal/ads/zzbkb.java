package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.C0235r;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbkb implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcal zza;
    final /* synthetic */ zzbkd zzb;

    public zzbkb(zzbkd zzbkdVar, zzcal zzcalVar) {
        this.zzb = zzbkdVar;
        this.zza = zzcalVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        zzbjq zzbjqVar;
        try {
            zzcal zzcalVar = this.zza;
            zzbjqVar = this.zzb.zza;
            zzcalVar.zzd(zzbjqVar.zzp());
        } catch (DeadObjectException e) {
            this.zza.zze(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zza.zze(new RuntimeException(C0235r.m12816a("onConnectionSuspended: ", i)));
    }
}
