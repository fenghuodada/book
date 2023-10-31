package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzatb extends zzatf {
    public zzatb(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2) {
        super(zzarrVar, "CJ1WRc1PE+xR6/6qo7i2DCIPFySihC2gOkB+O3ToQfek8u0n5+HTKTUaxwoTaOup", "MdKUmuf6DBtYuVjgv6h8BEjHuBvX5PE/R2XdoeGNJT0=", zzanoVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzag(3);
        boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
        synchronized (this.zze) {
            if (booleanValue) {
                this.zze.zzag(2);
            } else {
                this.zze.zzag(1);
            }
        }
    }
}
