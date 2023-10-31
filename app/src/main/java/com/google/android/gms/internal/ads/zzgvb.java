package com.google.android.gms.internal.ads;

import android.util.Log;
import androidx.constraintlayout.motion.widget.C0552c;

/* loaded from: classes.dex */
public final class zzgvb extends zzgvg {
    final String zza;

    public zzgvb(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgvg
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(C0552c.m12193a(str, C0552c.m12193a(str2, 1)));
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
