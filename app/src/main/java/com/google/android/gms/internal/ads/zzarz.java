package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzarz implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzasa zza;

    public zzarz(zzasa zzasaVar) {
        this.zza = zzasaVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        long j;
        zzasa zzasaVar;
        boolean z2;
        long j2;
        long j3;
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            zzasaVar = this.zza;
            z2 = true;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            zzasa zzasaVar2 = this.zza;
            j = zzasaVar2.zzc;
            if (j > 0) {
                j2 = zzasaVar2.zzc;
                if (currentTimeMillis >= j2) {
                    j3 = zzasaVar2.zzc;
                    zzasaVar2.zzd = currentTimeMillis - j3;
                }
            }
            zzasaVar = this.zza;
            z2 = false;
        }
        zzasaVar.zze = z2;
    }
}
