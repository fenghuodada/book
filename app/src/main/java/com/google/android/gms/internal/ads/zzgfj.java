package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.C0539e;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgfj extends zzggo {
    private final int zza;
    private final int zzb;
    private final zzgfh zzc;

    public /* synthetic */ zzgfj(int i, int i2, zzgfh zzgfhVar, zzgfi zzgfiVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgfhVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgfj) {
            zzgfj zzgfjVar = (zzgfj) obj;
            return zzgfjVar.zza == this.zza && zzgfjVar.zzb() == zzb() && zzgfjVar.zzc == this.zzc;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgfj.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        int i = this.zzb;
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte tags, and ");
        return C0539e.m12264b(sb, i2, "-byte key)");
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        zzgfh zzgfhVar = this.zzc;
        if (zzgfhVar == zzgfh.zzd) {
            return this.zzb;
        }
        if (zzgfhVar == zzgfh.zza || zzgfhVar == zzgfh.zzb || zzgfhVar == zzgfh.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgfh zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzc != zzgfh.zzd;
    }
}
