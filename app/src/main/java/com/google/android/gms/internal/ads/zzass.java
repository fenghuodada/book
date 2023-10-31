package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzass extends zzatf {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzass(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2) {
        super(zzarrVar, "pOQv/ncF1LaNtzYOMl87UsR5TvsuG5ecw6dyIcJCym+lewlOBw6IZhtgwF1qNMNH", "0G0hVgzYtuXNuzEKOxAON/a0c4+sHPmbkckIOa2TK0w=", zzanoVar, i, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzB("E");
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (String) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzB(zzi);
        }
    }
}
