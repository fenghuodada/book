package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzasg extends zzatf {
    public zzasg(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2) {
        super(zzarrVar, "rrjLlsla978gQsd21zlsNlBlI2LX695vD5/bR0YoarWUKt9pBHEKqU2V70kXmeqs", "pQ8JnVS7yUZANCXtBVm35/Ifx7Qa6SIA2WAFLNMh0sw=", zzanoVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzm(-1L);
        this.zze.zzl(-1L);
        int[] iArr = (int[]) this.zzf.invoke(null, this.zzb.zzb());
        synchronized (this.zze) {
            this.zze.zzm(iArr[0]);
            this.zze.zzl(iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                this.zze.zzk(i);
            }
        }
    }
}
