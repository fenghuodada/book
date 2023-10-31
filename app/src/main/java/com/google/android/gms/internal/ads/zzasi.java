package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzasi extends zzatf {
    private final long zzi;

    public zzasi(zzarr zzarrVar, String str, String str2, zzano zzanoVar, long j, int i, int i2) {
        super(zzarrVar, "jg02i/nmjOtojnLha7JcDbUziDuBiOjLYE3MteO5yoaAgj1btcenznNGCOsuwWch", "4CrOyliF592Vc7D7JV+aPXCWH2JLB6HWAiQnf8iH090=", zzanoVar, i, 25);
        this.zzi = j;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzt(longValue);
            long j = this.zzi;
            if (j != 0) {
                this.zze.zzT(longValue - j);
                this.zze.zzU(this.zzi);
            }
        }
    }
}
