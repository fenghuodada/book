package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzata extends zzatf {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzata(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2) {
        super(zzarrVar, "atxCXkhFC9Qo4zr+qQKStmlw+xq4VCpNksBYKhnncQoFPxOQrQVA0Q5Y3uEyrMy9", "7UZ/EsEPgF4ZRZ1chhiVPxgR+NfE5rqmZss2fiG1QT0=", zzanoVar, i, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzV(zzi.longValue());
        }
    }
}
