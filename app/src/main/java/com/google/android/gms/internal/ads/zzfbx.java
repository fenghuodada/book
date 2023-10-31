package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class zzfbx implements zzfbw {
    private final Object[] zza;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzfbx(com.google.android.gms.ads.internal.client.zzl r3, java.lang.String r4, int r5, java.lang.String r6, com.google.android.gms.ads.internal.client.zzw r7) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbx.<init>(com.google.android.gms.ads.internal.client.zzl, java.lang.String, int, java.lang.String, com.google.android.gms.ads.internal.client.zzw):void");
    }

    @Nullable
    private static String zza(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? zza((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final boolean equals(Object obj) {
        if (obj instanceof zzfbx) {
            return Arrays.equals(this.zza, ((zzfbx) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.zza);
        String arrays = Arrays.toString(this.zza);
        return "[PoolKey#" + hashCode + " " + arrays + "]";
    }
}
