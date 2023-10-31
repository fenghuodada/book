package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzajw {
    private final List zza;
    private final zzabr[] zzb;

    public zzajw(List list) {
        this.zza = list;
        this.zzb = new zzabr[list.size()];
    }

    public final void zza(long j, zzfd zzfdVar) {
        if (zzfdVar.zza() < 9) {
            return;
        }
        int zze = zzfdVar.zze();
        int zze2 = zzfdVar.zze();
        int zzk = zzfdVar.zzk();
        if (zze == 434 && zze2 == 1195456820 && zzk == 3) {
            zzaab.zzb(j, zzfdVar, this.zzb);
        }
    }

    public final void zzb(zzaar zzaarVar, zzajt zzajtVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzajtVar.zzc();
            zzabr zzv = zzaarVar.zzv(zzajtVar.zza(), 3);
            zzam zzamVar = (zzam) this.zza.get(i);
            String str = zzamVar.zzm;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzdy.zze(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            zzak zzakVar = new zzak();
            zzakVar.zzH(zzajtVar.zzb());
            zzakVar.zzS(str);
            zzakVar.zzU(zzamVar.zze);
            zzakVar.zzK(zzamVar.zzd);
            zzakVar.zzu(zzamVar.zzE);
            zzakVar.zzI(zzamVar.zzo);
            zzv.zzk(zzakVar.zzY());
            this.zzb[i] = zzv;
        }
    }
}
