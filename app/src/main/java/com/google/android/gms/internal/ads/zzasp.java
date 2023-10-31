package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzasp extends zzatf {
    private final zzarj zzi;

    public zzasp(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2, zzarj zzarjVar) {
        super(zzarrVar, "u0deiS9oYmD364nfSsTKCoaogh75qkGLLRLBySCBi52jAL+3CKcuH0JuOgAzQyxJ", "All9dLPTMel/eCIBoDimh2kew7aPoVe9eZ80kN1esN4=", zzanoVar, i, 94);
        this.zzi = zzarjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int intValue = ((Integer) this.zzf.invoke(null, this.zzi.zza())).intValue();
        synchronized (this.zze) {
            this.zze.zzae(zzaoc.zza(intValue));
        }
    }
}
