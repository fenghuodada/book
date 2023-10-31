package com.google.android.gms.internal.ads;

import androidx.constraintlayout.motion.widget.C0552c;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzams extends zzguz {
    private static final zzgvg zza = zzgvg.zzb(zzams.class);

    public zzams(zzgva zzgvaVar, zzamr zzamrVar) throws IOException {
        zzf(zzgvaVar, zzgvaVar.zzc(), zzamrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzguz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzguz
    public final String toString() {
        String obj = this.zzd.toString();
        StringBuilder sb = new StringBuilder(C0552c.m12193a(obj, 7));
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
