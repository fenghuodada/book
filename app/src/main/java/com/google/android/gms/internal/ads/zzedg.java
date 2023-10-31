package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class zzedg implements zzecb {
    private final Context zza;
    private final zzcqa zzb;
    private View zzc;
    private zzboh zzd;

    public zzedg(Context context, zzcqa zzcqaVar) {
        this.zza = context;
        this.zzb = zzcqaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final /* bridge */ /* synthetic */ Object zza(zzezr zzezrVar, final zzezf zzezfVar, final zzeby zzebyVar) throws zzfaf, zzefn {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhq)).booleanValue() && zzezfVar.zzah) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfaf(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzfvr.zzm(zzfvr.zzh(null), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzedc
                            @Override // com.google.android.gms.internal.ads.zzfuy
                            public final zzfwb zza(Object obj) {
                                return zzedg.this.zzc(view, zzezfVar, obj);
                            }
                        }, zzcag.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfaf(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfaf(e2);
            }
        } else {
            view = this.zzc;
        }
        zzcpe zza = this.zzb.zza(new zzcru(zzezrVar, zzezfVar, zzebyVar.zza), new zzcpk(view, null, new zzcrd() { // from class: com.google.android.gms.internal.ads.zzedd
            @Override // com.google.android.gms.internal.ads.zzcrd
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                try {
                    return ((zzbpv) zzeby.this.zzb).zze();
                } catch (RemoteException e3) {
                    throw new zzfaf(e3);
                }
            }
        }, (zzezg) zzezfVar.zzv.get(0)));
        zza.zzg().zza(view);
        ((zzedr) zzebyVar.zzc).zzc(zza.zzi());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final void zzb(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf {
        try {
            ((zzbpv) zzebyVar.zzb).zzq(zzezfVar.zzaa);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhq)).booleanValue() && zzezfVar.zzah) {
                ((zzbpv) zzebyVar.zzb).zzk(zzezfVar.zzV, zzezfVar.zzw.toString(), zzezrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzedf(this, zzebyVar, null), (zzboe) zzebyVar.zzc, zzezrVar.zza.zza.zze);
            } else {
                ((zzbpv) zzebyVar.zzb).zzj(zzezfVar.zzV, zzezfVar.zzw.toString(), zzezrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzedf(this, zzebyVar, null), (zzboe) zzebyVar.zzc, zzezrVar.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzfaf(e);
        }
    }

    public final /* synthetic */ zzfwb zzc(View view, zzezf zzezfVar, Object obj) throws Exception {
        return zzfvr.zzh(zzcqr.zza(this.zza, view, zzezfVar));
    }
}
