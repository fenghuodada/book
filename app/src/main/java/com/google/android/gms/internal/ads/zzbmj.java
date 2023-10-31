package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzbmj extends zzcas {
    private final com.google.android.gms.ads.internal.util.zzbb zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbmj(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zzb = zzbbVar;
    }

    public final zzbme zza() {
        zzbme zzbmeVar = new zzbme(this);
        synchronized (this.zza) {
            zzi(new zzbmf(this, zzbmeVar), new zzbmg(this, zzbmeVar));
            Preconditions.checkState(this.zzd >= 0);
            this.zzd++;
        }
        return zzbmeVar;
    }

    public final void zzb() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd >= 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
    }

    public final void zzc() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd >= 0);
            if (this.zzc && this.zzd == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("No reference is left (including root). Cleaning up engine.");
                zzi(new zzbmi(this), new zzcao());
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("There are still references to the engine. Not destroying.");
            }
        }
    }

    public final void zzd() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd > 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
    }
}
