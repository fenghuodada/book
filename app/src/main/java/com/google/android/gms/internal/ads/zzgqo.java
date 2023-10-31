package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentMap;
import p060j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgqo {
    private static final zzgqo zza = new zzgqo();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzgra zzb = new zzgpy();

    private zzgqo() {
    }

    public static zzgqo zza() {
        return zza;
    }

    public final zzgqz zzb(Class cls) {
        zzgpg.zzc(cls, "messageType");
        zzgqz zzgqzVar = (zzgqz) this.zzc.get(cls);
        if (zzgqzVar == null) {
            zzgqzVar = this.zzb.zza(cls);
            zzgpg.zzc(cls, "messageType");
            zzgpg.zzc(zzgqzVar, "schema");
            zzgqz zzgqzVar2 = (zzgqz) this.zzc.putIfAbsent(cls, zzgqzVar);
            if (zzgqzVar2 != null) {
                return zzgqzVar2;
            }
        }
        return zzgqzVar;
    }
}
