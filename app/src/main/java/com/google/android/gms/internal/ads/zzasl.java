package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzasl extends zzatf {
    private final zzars zzi;

    public zzasl(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2, zzars zzarsVar) {
        super(zzarrVar, "1MAz8AsFFFR6PX7Q/aoiTCXDxA7Y87QD+tiULVUCjXhSqmeyoEv99dhFUigp84ha", "8+Gsu284Xz8VlJdhu6cTHCdcvCVVHyOiPBH/5JkF0bc=", zzanoVar, i, 85);
        this.zzi = zzarsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.zzf.invoke(null, Long.valueOf(this.zzi.zzd()), Long.valueOf(this.zzi.zzh()), Long.valueOf(this.zzi.zzb()), Long.valueOf(this.zzi.zzf()));
        synchronized (this.zze) {
            this.zze.zzv(jArr[0]);
            this.zze.zzu(jArr[1]);
        }
    }
}
