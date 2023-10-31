package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzasb extends zzatf {
    private final Activity zzi;
    private final View zzj;

    public zzasb(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2, View view, Activity activity) {
        super(zzarrVar, "rhoJ7WIOJQxGmjA5T9dCA2qw7ruD40MW/EVYQ/j5n5OF0JkYdpr5BYWF1hK10B2d", "8FdD2h+EoXCjg5eQhtMlQE5LkOSf3AVqgJYbaqrJZgg=", zzanoVar, i, 62);
        this.zzj = view;
        this.zzi = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzj == null) {
            return;
        }
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcm)).booleanValue();
        Object[] objArr = (Object[]) this.zzf.invoke(null, this.zzj, this.zzi, Boolean.valueOf(booleanValue));
        synchronized (this.zze) {
            this.zze.zzc(((Long) objArr[0]).longValue());
            this.zze.zze(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.zze.zzd((String) objArr[2]);
            }
        }
    }
}
