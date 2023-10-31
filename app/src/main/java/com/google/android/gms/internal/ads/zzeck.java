package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeck implements zzecb {
    private final Context zza;
    private final zzcor zzb;
    private final Executor zzc;

    public zzeck(Context context, zzcor zzcorVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcorVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final /* bridge */ /* synthetic */ Object zza(zzezr zzezrVar, zzezf zzezfVar, final zzeby zzebyVar) throws zzfaf, zzefn {
        zzcoo zza = this.zzb.zza(new zzcru(zzezrVar, zzezfVar, zzebyVar.zza), new zzddt(new zzdey() { // from class: com.google.android.gms.internal.ads.zzecj
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(boolean z, Context context, zzcvv zzcvvVar) {
                zzeby zzebyVar2 = zzeby.this;
                try {
                    ((zzfav) zzebyVar2.zzb).zzv(z);
                    ((zzfav) zzebyVar2.zzb).zzw(context);
                } catch (zzfaf e) {
                    throw new zzdex(e.getCause());
                }
            }
        }, null), new zzcop(zzezfVar.zzab));
        zza.zzd().zzm(new zzcnf((zzfav) zzebyVar.zzb), this.zzc);
        ((zzedr) zzebyVar.zzc).zzc(zza.zzj());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final void zzb(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf {
        ((zzfav) zzebyVar.zzb).zzl(this.zza, zzezrVar.zza.zza.zzd, zzezfVar.zzw.toString(), (zzboe) zzebyVar.zzc);
    }
}
