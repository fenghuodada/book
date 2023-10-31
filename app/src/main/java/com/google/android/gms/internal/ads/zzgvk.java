package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzgvk implements zzgvo {
    private final Map zza;

    public zzgvk(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    public final Map zza() {
        return this.zza;
    }
}
