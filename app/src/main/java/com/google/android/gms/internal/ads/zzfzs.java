package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.C0539e;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzfzs extends zzfyi {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzfzq zzd;

    public /* synthetic */ zzfzs(int i, int i2, int i3, zzfzq zzfzqVar, zzfzr zzfzrVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzfzqVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfzs) {
            zzfzs zzfzsVar = (zzfzs) obj;
            return zzfzsVar.zza == this.zza && zzfzsVar.zzb == this.zzb && zzfzsVar.zzd == this.zzd;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzfzs.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int i = this.zzb;
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte IV, 16-byte tag, and ");
        return C0539e.m12264b(sb, i2, "-byte key)");
    }

    public final int zza() {
        return this.zza;
    }

    public final zzfzq zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd != zzfzq.zzc;
    }
}
