package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzcrm {
    public final List zza;

    public zzcrm(zzcrf zzcrfVar) {
        this.zza = Collections.singletonList(zzfvr.zzh(zzcrfVar));
    }

    public zzcrm(List list) {
        this.zza = list;
    }

    public static zzebv zza(@NonNull zzebv zzebvVar) {
        return new zzebw(zzebvVar, new zzfon() { // from class: com.google.android.gms.internal.ads.zzcrl
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                return new zzcrm((zzcrf) obj);
            }
        });
    }
}
