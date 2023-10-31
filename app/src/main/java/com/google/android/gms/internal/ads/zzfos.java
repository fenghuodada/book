package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class zzfos {
    private final String zza;
    private final zzfoq zzb;
    private zzfoq zzc;

    public /* synthetic */ zzfos(String str, zzfor zzforVar) {
        zzfoq zzfoqVar = new zzfoq(null);
        this.zzb = zzfoqVar;
        this.zzc = zzfoqVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfoq zzfoqVar = this.zzb.zzb;
        String str = "";
        while (zzfoqVar != null) {
            Object obj = zzfoqVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            zzfoqVar = zzfoqVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfos zza(@CheckForNull Object obj) {
        zzfoq zzfoqVar = new zzfoq(null);
        this.zzc.zzb = zzfoqVar;
        this.zzc = zzfoqVar;
        zzfoqVar.zza = obj;
        return this;
    }
}
