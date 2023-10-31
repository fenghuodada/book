package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzast extends zzatf {
    public zzast(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2) {
        super(zzarrVar, "par+dwhNOqYERCSr3oGtYtDVSGtZjjivKpppvR62Z9a5oLpkQQBW7bLTBnuHswur", "mgC3WGYZcRZZUEO15izZ6XddH7Xv5j+uOXn1fcHyPpA=", zzanoVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaqx zzaqxVar = new zzaqx((String) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcs)).booleanValue())));
        synchronized (this.zze) {
            this.zze.zzj(zzaqxVar.zza);
            this.zze.zzC(zzaqxVar.zzb);
        }
    }
}
