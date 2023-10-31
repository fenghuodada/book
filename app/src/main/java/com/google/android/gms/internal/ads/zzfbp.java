package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.C0539e;

/* loaded from: classes.dex */
final class zzfbp {
    private final zzfbo zza = new zzfbo();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final zzfbo zza() {
        zzfbo clone = this.zza.clone();
        zzfbo zzfboVar = this.zza;
        zzfboVar.zza = false;
        zzfboVar.zzb = false;
        return clone;
    }

    public final String zzb() {
        StringBuilder sb = new StringBuilder("\n\tPool does not exist: ");
        sb.append(this.zzd);
        sb.append("\n\tNew pools created: ");
        sb.append(this.zzb);
        sb.append("\n\tPools removed: ");
        sb.append(this.zzc);
        sb.append("\n\tEntries added: ");
        sb.append(this.zzf);
        sb.append("\n\tNo entries retrieved: ");
        return C0539e.m12264b(sb, this.zze, "\n");
    }

    public final void zzc() {
        this.zzf++;
    }

    public final void zzd() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zze() {
        this.zze++;
    }

    public final void zzf() {
        this.zzd++;
    }

    public final void zzg() {
        this.zzc++;
        this.zza.zzb = true;
    }
}
