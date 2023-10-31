package com.google.android.gms.internal.ads;

import io.reactivex.rxjava3.annotations.SchedulerSupport;

/* loaded from: classes.dex */
public enum zzfgw {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(SchedulerSupport.NONE);
    
    private final String zze;

    zzfgw(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
