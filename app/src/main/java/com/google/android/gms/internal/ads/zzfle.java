package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class zzfle implements Closeable {
    public static zzflq zza() {
        return new zzflq();
    }

    public static zzflq zzb(final int i, zzflp zzflpVar) {
        return new zzflq(new zzfpp() { // from class: com.google.android.gms.internal.ads.zzflc
            @Override // com.google.android.gms.internal.ads.zzfpp
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        }, new zzfpp() { // from class: com.google.android.gms.internal.ads.zzfld
            @Override // com.google.android.gms.internal.ads.zzfpp
            public final Object zza() {
                return zzfle.zze();
            }
        }, zzflpVar);
    }

    public static zzflq zzc(zzfpp<Integer> zzfppVar, zzfpp<Integer> zzfppVar2, zzflp zzflpVar) {
        return new zzflq(zzfppVar, zzfppVar2, zzflpVar);
    }

    public static /* synthetic */ Integer zze() {
        return -1;
    }
}
