package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.C0539e;
import com.adcolony.sdk.C2362x3;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzfyy extends zzfyi {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zzfyw zzd;
    private final zzfyv zze;

    public /* synthetic */ zzfyy(int i, int i2, int i3, zzfyw zzfywVar, zzfyv zzfyvVar, zzfyx zzfyxVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = zzfywVar;
        this.zze = zzfyvVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfyy) {
            zzfyy zzfyyVar = (zzfyy) obj;
            return zzfyyVar.zza == this.zza && zzfyyVar.zzb == this.zzb && zzfyyVar.zzb() == zzb() && zzfyyVar.zzd == this.zzd && zzfyyVar.zze == this.zze;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzfyy.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd, this.zze});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        String valueOf2 = String.valueOf(this.zze);
        int i = this.zzc;
        int i2 = this.zza;
        int i3 = this.zzb;
        StringBuilder m9460b = C2362x3.m9460b("AesCtrHmacAead Parameters (variant: ", valueOf, ", hashType: ", valueOf2, ", ");
        m9460b.append(i);
        m9460b.append("-byte tags, and ");
        m9460b.append(i2);
        m9460b.append("-byte AES key, and ");
        return C0539e.m12264b(m9460b, i3, "-byte HMAC key)");
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        zzfyw zzfywVar = this.zzd;
        if (zzfywVar == zzfyw.zzc) {
            return this.zzc + 16;
        }
        if (zzfywVar == zzfyw.zza || zzfywVar == zzfyw.zzb) {
            return this.zzc + 21;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final int zzc() {
        return this.zzb;
    }

    public final zzfyw zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zzd != zzfyw.zzc;
    }
}
