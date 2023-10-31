package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
final class zzfrj {
    public static int zza(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int zzb(@CheckForNull Object obj) {
        return zza(obj == null ? 0 : obj.hashCode());
    }
}
