package com.google.android.gms.internal.ads;

import androidx.fragment.app.C1431t;
import com.adcolony.sdk.C2362x3;

/* loaded from: classes.dex */
final class zzfrs {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzfrs(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return new IllegalArgumentException(C1431t.m10577a(C2362x3.m9460b("Multiple entries with same key: ", valueOf, "=", valueOf2, " and "), String.valueOf(this.zza), "=", String.valueOf(this.zzc)));
    }
}
