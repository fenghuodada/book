package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzasn extends zzatf {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzasn(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2) {
        super(zzarrVar, "9B7JBIdZiMTsL9pGnqEcYgUaYpTzUoAB9RvGyrnjQF7CiisbO4+nhiSdhoC6VSqn", "YfHvCp/fIECQ9h2Dc66KvN7YWoaMnV2BSJeyfKAdgmQ=", zzanoVar, i, 22);
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
            this.zze.zzy(zzi.longValue());
        }
    }
}
