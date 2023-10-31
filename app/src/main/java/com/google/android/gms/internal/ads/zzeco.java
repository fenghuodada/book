package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzeco implements zzecb {
    private final Context zza;
    private final zzcor zzb;

    public zzeco(Context context, zzcor zzcorVar) {
        this.zza = context;
        this.zzb = zzcorVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final /* bridge */ /* synthetic */ Object zza(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf, zzefn {
        zzeea zzeeaVar = new zzeea(zzezfVar, (zzbpv) zzebyVar.zzb, AdFormat.APP_OPEN_AD);
        zzcoo zza = this.zzb.zza(new zzcru(zzezrVar, zzezfVar, zzebyVar.zza), new zzddt(zzeeaVar, null), new zzcop(zzezfVar.zzab));
        zzeeaVar.zzb(zza.zzc());
        ((zzedr) zzebyVar.zzc).zzc(zza.zzi());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final void zzb(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf {
        try {
            ((zzbpv) zzebyVar.zzb).zzq(zzezfVar.zzaa);
            ((zzbpv) zzebyVar.zzb).zzi(zzezfVar.zzV, zzezfVar.zzw.toString(), zzezrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzecn(zzebyVar, null), (zzboe) zzebyVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfaf(e);
        }
    }
}
