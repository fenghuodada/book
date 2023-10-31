package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzeev implements zzecb {
    private final Context zza;
    private final zzdfm zzb;
    private zzbon zzc;
    private final zzbzz zzd;

    public zzeev(Context context, zzdfm zzdfmVar, zzbzz zzbzzVar) {
        this.zza = context;
        this.zzb = zzdfmVar;
        this.zzd = zzbzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final /* bridge */ /* synthetic */ Object zza(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf, zzefn {
        if (zzezrVar.zza.zza.zzg.contains(Integer.toString(6))) {
            zzdhc zzs = zzdhc.zzs(this.zzc);
            if (zzezrVar.zza.zza.zzg.contains(Integer.toString(zzs.zzc()))) {
                zzdhe zze = this.zzb.zze(new zzcru(zzezrVar, zzezfVar, zzebyVar.zza), new zzdho(zzs), new zzdjd(null, null, this.zzc));
                ((zzedr) zzebyVar.zzc).zzc(zze.zzi());
                return zze.zza();
            }
            throw new zzefn(1, "No corresponding native ad listener");
        }
        throw new zzefn(2, "Unified must be used for RTB.");
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final void zzb(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf {
        try {
            ((zzbpv) zzebyVar.zzb).zzq(zzezfVar.zzaa);
            if (this.zzd.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbB)).intValue()) {
                ((zzbpv) zzebyVar.zzb).zzm(zzezfVar.zzV, zzezfVar.zzw.toString(), zzezrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeeu(this, zzebyVar, null), (zzboe) zzebyVar.zzc);
            } else {
                ((zzbpv) zzebyVar.zzb).zzn(zzezfVar.zzV, zzezfVar.zzw.toString(), zzezrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeeu(this, zzebyVar, null), (zzboe) zzebyVar.zzc, zzezrVar.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzfaf(e);
        }
    }
}
