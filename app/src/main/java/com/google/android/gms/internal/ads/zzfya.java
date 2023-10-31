package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzfya {
    private final ConcurrentMap zza;
    private final List zzb;
    private final zzfxw zzc;
    private final Class zzd;
    private final zzggx zze;

    public /* synthetic */ zzfya(ConcurrentMap concurrentMap, List list, zzfxw zzfxwVar, zzggx zzggxVar, Class cls, zzfxz zzfxzVar) {
        this.zza = concurrentMap;
        this.zzb = list;
        this.zzc = zzfxwVar;
        this.zzd = cls;
        this.zze = zzggxVar;
    }

    @Nullable
    public final zzfxw zza() {
        return this.zzc;
    }

    public final zzggx zzb() {
        return this.zze;
    }

    public final Class zzc() {
        return this.zzd;
    }

    public final Collection zzd() {
        return this.zza.values();
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzfxy(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean zzf() {
        return !this.zze.zza().isEmpty();
    }
}
