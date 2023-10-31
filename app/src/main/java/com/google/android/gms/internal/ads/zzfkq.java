package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfkq extends Exception {
    private final int zza;

    public zzfkq(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzfkq(int i, Throwable th) {
        super(th);
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }
}
