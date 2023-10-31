package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzfhd {
    private static final zzfhd zza = new zzfhd();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfhd() {
    }

    public static zzfhd zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfgs zzfgsVar) {
        this.zzb.add(zzfgsVar);
    }

    public final void zze(zzfgs zzfgsVar) {
        boolean zzg = zzg();
        this.zzb.remove(zzfgsVar);
        this.zzc.remove(zzfgsVar);
        if (!zzg || zzg()) {
            return;
        }
        zzfhj.zzb().zzf();
    }

    public final void zzf(zzfgs zzfgsVar) {
        boolean zzg = zzg();
        this.zzc.add(zzfgsVar);
        if (zzg) {
            return;
        }
        zzfhj.zzb().zze();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
