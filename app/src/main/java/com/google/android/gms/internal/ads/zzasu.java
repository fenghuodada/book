package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzasu extends zzatf {
    public zzasu(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2) {
        super(zzarrVar, "Y4VPax9NN/dKmqF+s9P1EMA+IqhcGIPpcbgTKYuHNMmPmp8MhTxur5CR0eiVwBHP", "Egu28ffoQSw9KOwYfG/AJmF7jqmf54ISsd5MNAePHGo=", zzanoVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzano zzanoVar = this.zze;
            if (true == booleanValue) {
                i = 2;
            }
            zzanoVar.zzaf(i);
        } catch (InvocationTargetException unused) {
            this.zze.zzaf(3);
        }
    }
}
