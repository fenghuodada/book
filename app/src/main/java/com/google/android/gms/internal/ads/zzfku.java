package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class zzfku {
    final /* synthetic */ zzfkv zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfku(zzfkv zzfkvVar, byte[] bArr, zzfkt zzfktVar) {
        this.zza = zzfkvVar;
        this.zzb = bArr;
    }

    public final zzfku zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfku zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfkv zzfkvVar = this.zza;
            if (zzfkvVar.zzb) {
                zzfkvVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
