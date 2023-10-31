package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzasd extends zzatf {
    public zzasd(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2) {
        super(zzarrVar, "ZkhLHPiP7Uf4DooNt/1kizZNADm1b+h8tAhXSPwcPrPbN3t+Jx06DZwzXlYEhSXE", "dE9eOZLY1eX3llTY4h0xyyrKD5UgCxwXxmUW3B3njYU=", zzanoVar, i, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzaa(3);
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzano zzanoVar = this.zze;
            if (true == booleanValue) {
                i = 2;
            }
            zzanoVar.zzaa(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
