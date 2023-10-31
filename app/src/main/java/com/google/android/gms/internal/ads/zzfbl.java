package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfbl {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfck zzd = new zzfck();

    public zzfbl(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
    }

    private final void zzi() {
        while (!this.zza.isEmpty() && com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - ((zzfbv) this.zza.getFirst()).zzd >= this.zzc) {
            this.zzd.zzg();
            this.zza.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    @Nullable
    public final zzfbv zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzfbv zzfbvVar = (zzfbv) this.zza.remove();
        if (zzfbvVar != null) {
            this.zzd.zzh();
        }
        return zzfbvVar;
    }

    public final zzfcj zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfbv zzfbvVar) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfbvVar);
        return true;
    }
}
