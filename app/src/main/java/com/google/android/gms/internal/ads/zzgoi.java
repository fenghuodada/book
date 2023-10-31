package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgoi {
    static final zzgoi zza = new zzgoi(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgoi zzd;
    private final Map zze;

    public zzgoi() {
        this.zze = new HashMap();
    }

    public zzgoi(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzgoi zza() {
        return zza;
    }

    public static zzgoi zzb() {
        zzgoi zzgoiVar = zzd;
        if (zzgoiVar != null) {
            return zzgoiVar;
        }
        synchronized (zzgoi.class) {
            zzgoi zzgoiVar2 = zzd;
            if (zzgoiVar2 != null) {
                return zzgoiVar2;
            }
            zzgoi zzb2 = zzgoq.zzb(zzgoi.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzgou zzc(zzgqg zzgqgVar, int i) {
        return (zzgou) this.zze.get(new zzgoh(zzgqgVar, i));
    }
}
