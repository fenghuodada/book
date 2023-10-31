package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
final class zzfuv extends zzfus {
    private zzfuv() {
        super(null);
    }

    public /* synthetic */ zzfuv(zzfuu zzfuuVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    public final int zza(zzfuw zzfuwVar) {
        int i;
        int i2;
        synchronized (zzfuwVar) {
            i = zzfuwVar.remaining;
            i2 = i - 1;
            zzfuwVar.remaining = i2;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    public final void zzb(zzfuw zzfuwVar, @CheckForNull Set set, Set set2) {
        Set set3;
        synchronized (zzfuwVar) {
            set3 = zzfuwVar.seenExceptions;
            if (set3 == null) {
                zzfuwVar.seenExceptions = set2;
            }
        }
    }
}
