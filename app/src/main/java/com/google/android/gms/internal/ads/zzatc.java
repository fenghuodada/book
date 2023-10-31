package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzatc extends zzatf {
    private final View zzi;

    public zzatc(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2, View view) {
        super(zzarrVar, "sZcaWvHk5YMGi5Y+Upjcj5xXN/uJAE5+o93AJh0tgcKgvaqPrd4dFC6HKBJZfNCh", "Sax58YmBV76Rsz+gTyIxls7MHtcGZGY5FRuTBSGuOW4=", zzanoVar, i, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdb);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjv);
            zzarv zzarvVar = new zzarv((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzaoj zza = zzaok.zza();
            zza.zzb(zzarvVar.zza.longValue());
            zza.zzd(zzarvVar.zzb.longValue());
            zza.zze(zzarvVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzarvVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzarvVar.zzd.longValue());
            }
            this.zze.zzY((zzaok) zza.zzal());
        }
    }
}
