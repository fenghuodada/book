package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zztc {
    private static final AtomicLong zzd = new AtomicLong();
    public final zzgc zza;
    public final Uri zzb;
    public final Map zzc;

    public zztc(long j, zzgc zzgcVar, Uri uri, Map map, long j2, long j3, long j4) {
        this.zza = zzgcVar;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}
