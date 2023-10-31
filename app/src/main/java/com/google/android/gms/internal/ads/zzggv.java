package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzggv {
    private HashMap zza = new HashMap();

    public final zzggx zza() {
        if (this.zza != null) {
            zzggx zzggxVar = new zzggx(Collections.unmodifiableMap(this.zza), null);
            this.zza = null;
            return zzggxVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
