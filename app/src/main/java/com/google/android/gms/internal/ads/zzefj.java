package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzefj implements zzfvn {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzezf zzc;
    final /* synthetic */ zzezi zzd;
    final /* synthetic */ zzfgf zze;
    final /* synthetic */ zzezr zzf;
    final /* synthetic */ zzefk zzg;

    public zzefj(zzefk zzefkVar, long j, String str, zzezf zzezfVar, zzezi zzeziVar, zzfgf zzfgfVar, zzezr zzezrVar) {
        this.zzg = zzefkVar;
        this.zza = j;
        this.zzb = str;
        this.zzc = zzezfVar;
        this.zzd = zzeziVar;
        this.zze = zzfgfVar;
        this.zzf = zzezrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    @Override // com.google.android.gms.internal.ads.zzfvn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Throwable r13) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefj.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        zzeca zzecaVar;
        zzefl zzeflVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        zzefk.zzg(this.zzg, this.zzb, 0, elapsedRealtime, this.zzc.zzag, null);
        zzefk zzefkVar = this.zzg;
        z = zzefkVar.zze;
        if (z) {
            zzeflVar = zzefkVar.zzb;
            zzeflVar.zza(this.zzd, this.zzc, 0, null, elapsedRealtime);
        }
        zzecaVar = this.zzg.zzf;
        zzecaVar.zzf(this.zzc, elapsedRealtime, null);
    }
}
