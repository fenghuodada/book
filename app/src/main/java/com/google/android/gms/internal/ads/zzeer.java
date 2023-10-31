package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeer implements zzecb {
    private final Context zza;
    private final zzdfm zzb;
    private final Executor zzc;

    public zzeer(Context context, zzdfm zzdfmVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdfmVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzezr zzezrVar, int i) {
        return zzezrVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final /* bridge */ /* synthetic */ Object zza(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf, zzefn {
        zzdhc zzaf;
        zzboj zzD = ((zzfav) zzebyVar.zzb).zzD();
        zzbok zzE = ((zzfav) zzebyVar.zzb).zzE();
        zzbon zzd = ((zzfav) zzebyVar.zzb).zzd();
        if (zzd != null && zzc(zzezrVar, 6)) {
            zzaf = zzdhc.zzs(zzd);
        } else if (zzD != null && zzc(zzezrVar, 6)) {
            zzaf = zzdhc.zzag(zzD);
        } else if (zzD != null && zzc(zzezrVar, 2)) {
            zzaf = zzdhc.zzae(zzD);
        } else if (zzE != null && zzc(zzezrVar, 6)) {
            zzaf = zzdhc.zzah(zzE);
        } else if (zzE == null || !zzc(zzezrVar, 1)) {
            throw new zzefn(1, "No native ad mappers");
        } else {
            zzaf = zzdhc.zzaf(zzE);
        }
        if (zzezrVar.zza.zza.zzg.contains(Integer.toString(zzaf.zzc()))) {
            zzdhe zze = this.zzb.zze(new zzcru(zzezrVar, zzezfVar, zzebyVar.zza), new zzdho(zzaf), new zzdjd(zzE, zzD, zzd));
            ((zzedr) zzebyVar.zzc).zzc(zze.zzj());
            zze.zzd().zzm(new zzcnf((zzfav) zzebyVar.zzb), this.zzc);
            return zze.zza();
        }
        throw new zzefn(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final void zzb(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf {
        zzfaa zzfaaVar = zzezrVar.zza.zza;
        ((zzfav) zzebyVar.zzb).zzp(this.zza, zzezrVar.zza.zza.zzd, zzezfVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzezfVar.zzt), (zzboe) zzebyVar.zzc, zzfaaVar.zzi, zzfaaVar.zzg);
    }
}
