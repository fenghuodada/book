package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzarp implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzarr zzb;

    public zzarp(zzarr zzarrVar, int i, boolean z) {
        this.zzb = zzarrVar;
        this.zza = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaol zzaolVar;
        zzarr zzarrVar = this.zzb;
        int i = this.zza;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzarrVar.zza.getPackageManager().getPackageInfo(zzarrVar.zza.getPackageName(), 0);
            Context context = zzarrVar.zza;
            zzaolVar = zzfjb.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzaolVar = null;
        }
        this.zzb.zzm = zzaolVar;
        if (this.zza < 4) {
            if (zzaolVar != null && zzaolVar.zzaj() && !zzaolVar.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzaolVar.zzak() && zzaolVar.zzf().zze() && zzaolVar.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
