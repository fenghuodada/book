package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzaji {
    private final List zza;
    private final zzabr[] zzb;

    public zzaji(List list) {
        this.zza = list;
        this.zzb = new zzabr[list.size()];
    }

    public final void zza(long j, zzfd zzfdVar) {
        zzaab.zza(j, zzfdVar, this.zzb);
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
            String str2 = zzamVar.zzb;
            if (str2 == null) {
                str2 = zzajtVar.zzb();
            }
            zzak zzakVar = new zzak();
            zzakVar.zzH(str2);
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
