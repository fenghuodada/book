package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzegr implements zzecb {
    private final Context zza;
    private final Executor zzb;
    private final zzdmt zzc;

    public zzegr(Context context, Executor executor, zzdmt zzdmtVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdmtVar;
    }

    public static /* bridge */ /* synthetic */ Executor zzc(zzegr zzegrVar) {
        return zzegrVar.zzb;
    }

    public static final void zze(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) {
        try {
            ((zzfav) zzebyVar.zzb).zzk(zzezrVar.zza.zza.zzd, zzezfVar.zzw.toString());
        } catch (Exception e) {
            zzbzt.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzebyVar.zza)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final /* bridge */ /* synthetic */ Object zza(zzezr zzezrVar, zzezf zzezfVar, final zzeby zzebyVar) throws zzfaf, zzefn {
        zzdmp zze = this.zzc.zze(new zzcru(zzezrVar, zzezfVar, zzebyVar.zza), new zzdmq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzegn
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(boolean z, Context context, zzcvv zzcvvVar) {
                zzeby zzebyVar2 = zzeby.this;
                try {
                    ((zzfav) zzebyVar2.zzb).zzv(z);
                    ((zzfav) zzebyVar2.zzb).zzA();
                } catch (zzfaf e) {
                    zzbzt.zzk("Cannot show rewarded video.", e);
                    throw new zzdex(e.getCause());
                }
            }
        }));
        zze.zzd().zzm(new zzcnf((zzfav) zzebyVar.zzb), this.zzb);
        zzcwp zze2 = zze.zze();
        zzcvg zzb = zze.zzb();
        ((zzeds) zzebyVar.zzc).zzc(new zzegq(this, zze.zza(), zzb, zze2, zze.zzg()));
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final void zzb(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf {
        if (((zzfav) zzebyVar.zzb).zzC()) {
            zze(zzezrVar, zzezfVar, zzebyVar);
            return;
        }
        ((zzeds) zzebyVar.zzc).zzd(new zzegp(this, zzezrVar, zzezfVar, zzebyVar));
        ((zzfav) zzebyVar.zzb).zzh(this.zza, zzezrVar.zza.zza.zzd, null, (zzbvh) zzebyVar.zzc, zzezfVar.zzw.toString());
    }
}
