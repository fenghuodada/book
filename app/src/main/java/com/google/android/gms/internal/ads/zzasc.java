package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzasc extends zzatf {
    public zzasc(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2) {
        super(zzarrVar, "r9vC7hAii/auIXsvdkZY1/L1Y60EZEfieXk6UMkf1Mt6AMxWfMB7bOWsIxsUn/Ml", "P/btXaRlOFRy+52+xT89ipfUbwbrznHOdZP9Kk/W7I4=", zzanoVar, i, 89);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        String str = (String) this.zzf.invoke(null, new Object[0]);
        synchronized (this.zze) {
            this.zze.zzg(str);
        }
    }
}
