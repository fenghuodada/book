package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzeeg implements zzecb {
    private final Context zza;
    private final zzdeq zzb;

    public zzeeg(Context context, zzdeq zzdeqVar) {
        this.zza = context;
        this.zzb = zzdeqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final /* bridge */ /* synthetic */ Object zza(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf, zzefn {
        zzeea zzeeaVar = new zzeea(zzezfVar, (zzbpv) zzebyVar.zzb, AdFormat.INTERSTITIAL);
        zzddq zze = this.zzb.zze(new zzcru(zzezrVar, zzezfVar, zzebyVar.zza), new zzddt(zzeeaVar, null));
        zzeeaVar.zzb(zze.zzc());
        ((zzedr) zzebyVar.zzc).zzc(zze.zzi());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final void zzb(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf {
        try {
            ((zzbpv) zzebyVar.zzb).zzq(zzezfVar.zzaa);
            ((zzbpv) zzebyVar.zzb).zzl(zzezfVar.zzV, zzezfVar.zzw.toString(), zzezrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeef(this, zzebyVar, null), (zzboe) zzebyVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new zzfaf(e);
        }
    }
}
