package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzefv implements zzecb {
    private final Context zza;
    private final Executor zzb;
    private final zzdmt zzc;

    public zzefv(Context context, Executor executor, zzdmt zzdmtVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdmtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final /* bridge */ /* synthetic */ Object zza(zzezr zzezrVar, zzezf zzezfVar, final zzeby zzebyVar) throws zzfaf, zzefn {
        zzdmp zze = this.zzc.zze(new zzcru(zzezrVar, zzezfVar, zzebyVar.zza), new zzdmq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzefu
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(boolean z, Context context, zzcvv zzcvvVar) {
                zzeby zzebyVar2 = zzeby.this;
                try {
                    ((zzfav) zzebyVar2.zzb).zzv(z);
                    ((zzfav) zzebyVar2.zzb).zzz(context);
                } catch (zzfaf e) {
                    throw new zzdex(e.getCause());
                }
            }
        }));
        zze.zzd().zzm(new zzcnf((zzfav) zzebyVar.zzb), this.zzb);
        ((zzedr) zzebyVar.zzc).zzc(zze.zzm());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final void zzb(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf {
        try {
            zzfaa zzfaaVar = zzezrVar.zza.zza;
            if (zzfaaVar.zzo.zza == 3) {
                ((zzfav) zzebyVar.zzb).zzr(this.zza, zzfaaVar.zzd, zzezfVar.zzw.toString(), (zzboe) zzebyVar.zzc);
            } else {
                ((zzfav) zzebyVar.zzb).zzq(this.zza, zzfaaVar.zzd, zzezfVar.zzw.toString(), (zzboe) zzebyVar.zzc);
            }
        } catch (Exception e) {
            zzbzt.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzebyVar.zza)), e);
        }
    }
}
