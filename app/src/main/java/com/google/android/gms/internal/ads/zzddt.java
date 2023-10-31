package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class zzddt {
    private final zzdey zza;
    @Nullable
    private final zzcfb zzb;

    public zzddt(zzdey zzdeyVar, @Nullable zzcfb zzcfbVar) {
        this.zza = zzdeyVar;
        this.zzb = zzcfbVar;
    }

    public static final zzdco zzh(zzffc zzffcVar) {
        return new zzdco(zzffcVar, zzcag.zzf);
    }

    public static final zzdco zzi(zzdfd zzdfdVar) {
        return new zzdco(zzdfdVar, zzcag.zzf);
    }

    @Nullable
    public final View zza() {
        zzcfb zzcfbVar = this.zzb;
        if (zzcfbVar == null) {
            return null;
        }
        return zzcfbVar.zzG();
    }

    @Nullable
    public final View zzb() {
        zzcfb zzcfbVar = this.zzb;
        if (zzcfbVar != null) {
            return zzcfbVar.zzG();
        }
        return null;
    }

    @Nullable
    public final zzcfb zzc() {
        return this.zzb;
    }

    public final zzdco zzd(Executor executor) {
        final zzcfb zzcfbVar = this.zzb;
        return new zzdco(new zzczv() { // from class: com.google.android.gms.internal.ads.zzddr
            @Override // com.google.android.gms.internal.ads.zzczv
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.zzl zzL;
                zzcfb zzcfbVar2 = zzcfb.this;
                if (zzcfbVar2 == null || (zzL = zzcfbVar2.zzL()) == null) {
                    return;
                }
                zzL.zzb();
            }
        }, executor);
    }

    public final zzdey zze() {
        return this.zza;
    }

    public Set zzf(zzcuf zzcufVar) {
        return Collections.singleton(new zzdco(zzcufVar, zzcag.zzf));
    }

    public Set zzg(zzcuf zzcufVar) {
        return Collections.singleton(new zzdco(zzcufVar, zzcag.zzf));
    }
}
