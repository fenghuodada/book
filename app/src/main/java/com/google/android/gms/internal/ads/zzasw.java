package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzasw extends zzatf {
    private final boolean zzi;

    public zzasw(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2) {
        super(zzarrVar, "6CULVgyWOH82iLGcKn5rh8N75AqCrKeqiHuFUWI8W3RSLolOGMDqAOnKtNTX1AFe", "R2RBJfxfdXZyH4kWmH3CYK5g20DhfXioszVJ9FTqzrY=", zzanoVar, i, 61);
        this.zzi = zzarrVar.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(this.zzi))).longValue();
        synchronized (this.zze) {
            this.zze.zzE(longValue);
        }
    }
}
