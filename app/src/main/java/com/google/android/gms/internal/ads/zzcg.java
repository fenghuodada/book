package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class zzcg extends Exception {
    public final int zzb;
    public final long zzc;
    private static final String zzd = Integer.toString(0, 36);
    private static final String zze = Integer.toString(1, 36);
    private static final String zzf = Integer.toString(2, 36);
    private static final String zzg = Integer.toString(3, 36);
    private static final String zzh = Integer.toString(4, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzcf
    };

    public zzcg(@Nullable String str, @Nullable Throwable th, int i, long j) {
        super(str, th);
        this.zzb = i;
        this.zzc = j;
    }
}
