package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzefz implements zzecb {
    private final Context zza;
    private final zzdmt zzb;

    public zzefz(Context context, zzdmt zzdmtVar) {
        this.zza = context;
        this.zzb = zzdmtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final /* bridge */ /* synthetic */ Object zza(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf, zzefn {
        zzeea zzeeaVar = new zzeea(zzezfVar, (zzbpv) zzebyVar.zzb, AdFormat.REWARDED);
        zzdmp zze = this.zzb.zze(new zzcru(zzezrVar, zzezfVar, zzebyVar.zza), new zzdmq(zzeeaVar));
        zzeeaVar.zzb(zze.zzc());
        ((zzedr) zzebyVar.zzc).zzc(zze.zzn());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final void zzb(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf {
        try {
            ((zzbpv) zzebyVar.zzb).zzq(zzezfVar.zzaa);
            if (zzezrVar.zza.zza.zzo.zza == 3) {
                ((zzbpv) zzebyVar.zzb).zzo(zzezfVar.zzV, zzezfVar.zzw.toString(), zzezrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefy(this, zzebyVar, null), (zzboe) zzebyVar.zzc);
            } else {
                ((zzbpv) zzebyVar.zzb).zzp(zzezfVar.zzV, zzezfVar.zzw.toString(), zzezrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefy(this, zzebyVar, null), (zzboe) zzebyVar.zzc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
