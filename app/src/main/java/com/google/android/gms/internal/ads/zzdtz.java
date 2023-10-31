package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzdtz extends Exception {
    private final int zza;

    public zzdtz(int i) {
        this.zza = i;
    }

    public zzdtz(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzdtz(int i, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }

    public final int zza() {
        return this.zza;
    }
}
