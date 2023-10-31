package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzasx extends zzatf {
    private final StackTraceElement[] zzi;

    public zzasx(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzarrVar, "T+InekJlJ8RmIDkSOxSdVK3n60x123LKQKipAj90olVt6NWqXHdtrKrCRV+MIFdG", "K1BE5iDLpIxaZZJp7C4O3DsdHGbDPO0C9L+hxNcDxpM=", zzanoVar, i, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzari zzariVar = new zzari((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                this.zze.zzF(zzariVar.zza.longValue());
                if (zzariVar.zzb.booleanValue()) {
                    this.zze.zzac(true != zzariVar.zzc.booleanValue() ? 2 : 1);
                } else {
                    this.zze.zzac(3);
                }
            }
        }
    }
}
