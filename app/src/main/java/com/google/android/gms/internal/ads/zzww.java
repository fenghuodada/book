package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzww {
    public final zzcz zza;
    public final int[] zzb;

    public zzww(zzcz zzczVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzer.zzc("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzczVar;
        this.zzb = iArr;
    }
}
