package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzasm extends zzatf {
    private final Map zzi;
    private final View zzj;
    private final Context zzk;

    public zzasm(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2, Map map, View view, Context context) {
        super(zzarrVar, "saBI+3h2Lt3SmMRiIzkSzE+qZwwlCo+f51BVnuQZD0hVVNns8vrAQWZ7UlWn/0b0", "BoYdDgxF0J4Z6qBFEz0Y0ptcEBy4vkae+v/aE6rWTPA=", zzanoVar, i, 85);
        this.zzi = map;
        this.zzj = view;
        this.zzk = context;
    }

    private final long zzc(int i) {
        Map map = this.zzi;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return ((Long) this.zzi.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzc(1), zzc(2)};
        Context context = this.zzk;
        if (context == null) {
            context = this.zzb.zzb();
        }
        long[] jArr2 = (long[]) this.zzf.invoke(null, jArr, context, this.zzj);
        long j = jArr2[0];
        this.zzi.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        this.zzi.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.zze) {
            this.zze.zzv(j);
            this.zze.zzu(j2);
        }
    }
}
