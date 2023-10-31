package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcrh implements zzcri {
    private final Map zza;

    public zzcrh(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcri
    @Nullable
    public final zzebv zza(int i, String str) {
        return (zzebv) this.zza.get(str);
    }
}
