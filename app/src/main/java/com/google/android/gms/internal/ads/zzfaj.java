package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfaj {
    private final zzezf zza;
    private final zzezi zzb;
    private final zzebc zzc;
    private final zzfgj zzd;
    private final zzffq zze;

    @VisibleForTesting
    public zzfaj(zzebc zzebcVar, zzfgj zzfgjVar, zzezf zzezfVar, zzezi zzeziVar, zzffq zzffqVar) {
        this.zza = zzezfVar;
        this.zzb = zzeziVar;
        this.zzc = zzebcVar;
        this.zzd = zzfgjVar;
        this.zze = zzffqVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i) {
        if (!this.zza.zzaj) {
            this.zzd.zzc(str, this.zze);
            return;
        }
        this.zzc.zzd(new zzebe(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzb.zzb, str, i));
    }

    public final void zzc(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), i);
        }
    }
}
