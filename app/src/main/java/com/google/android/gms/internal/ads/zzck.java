package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzck {
    private final zzaf zza = new zzaf();

    public final zzck zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzck zzb(zzcm zzcmVar) {
        zzah zzahVar;
        zzaf zzafVar = this.zza;
        zzahVar = zzcmVar.zzd;
        for (int i = 0; i < zzahVar.zzb(); i++) {
            zzafVar.zza(zzahVar.zza(i));
        }
        return this;
    }

    public final zzck zzc(int... iArr) {
        zzaf zzafVar = this.zza;
        for (int i = 0; i < 24; i++) {
            zzafVar.zza(iArr[i]);
        }
        return this;
    }

    public final zzck zzd(int i, boolean z) {
        zzaf zzafVar = this.zza;
        if (z) {
            zzafVar.zza(i);
        }
        return this;
    }

    public final zzcm zze() {
        return new zzcm(this.zza.zzb(), null);
    }
}
