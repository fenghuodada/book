package com.google.android.gms.internal.ads;

import com.adcolony.sdk.C2362x3;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzggg extends zzggo {
    private final int zza;
    private final int zzb;
    private final zzgge zzc;
    private final zzggd zzd;

    public /* synthetic */ zzggg(int i, int i2, zzgge zzggeVar, zzggd zzggdVar, zzggf zzggfVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzggeVar;
        this.zzd = zzggdVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzggg) {
            zzggg zzgggVar = (zzggg) obj;
            return zzgggVar.zza == this.zza && zzgggVar.zzb() == zzb() && zzgggVar.zzc == this.zzc && zzgggVar.zzd == this.zzd;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzggg.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        int i = this.zzb;
        int i2 = this.zza;
        StringBuilder m9460b = C2362x3.m9460b("HMAC Parameters (variant: ", valueOf, ", hashType: ", valueOf2, ", ");
        m9460b.append(i);
        m9460b.append("-byte tags, and ");
        m9460b.append(i2);
        m9460b.append("-byte key)");
        return m9460b.toString();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        zzgge zzggeVar = this.zzc;
        if (zzggeVar == zzgge.zzd) {
            return this.zzb;
        }
        if (zzggeVar == zzgge.zza || zzggeVar == zzgge.zzb || zzggeVar == zzgge.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgge zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzc != zzgge.zzd;
    }
}
