package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzakd {
    public final int zza;
    public final long zzb;

    private zzakd(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzakd zza(zzaap zzaapVar, zzfd zzfdVar) throws IOException {
        ((zzaae) zzaapVar).zzm(zzfdVar.zzH(), 0, 8, false);
        zzfdVar.zzF(0);
        return new zzakd(zzfdVar.zze(), zzfdVar.zzq());
    }
}
