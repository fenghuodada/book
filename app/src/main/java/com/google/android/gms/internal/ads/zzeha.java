package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzeha implements zzebv {
    private final zzebx zza;
    private final zzecb zzb;
    private final zzfed zzc;
    private final zzfwc zzd;

    public zzeha(zzfed zzfedVar, zzfwc zzfwcVar, zzebx zzebxVar, zzecb zzecbVar) {
        this.zzc = zzfedVar;
        this.zzd = zzfwcVar;
        this.zzb = zzecbVar;
        this.zza = zzebxVar;
    }

    @VisibleForTesting
    public static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final zzfwb zza(final zzezr zzezrVar, final zzezf zzezfVar) {
        final zzeby zzebyVar;
        Iterator it = zzezfVar.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzebyVar = null;
                break;
            }
            try {
                zzebyVar = this.zza.zza((String) it.next(), zzezfVar.zzw);
                break;
            } catch (zzfaf unused) {
            }
        }
        if (zzebyVar == null) {
            return zzfvr.zzg(new zzeex("Unable to instantiate mediation adapter class."));
        }
        zzcal zzcalVar = new zzcal();
        zzebyVar.zzc.zza(new zzegz(this, zzebyVar, zzcalVar));
        if (zzezfVar.zzN) {
            Bundle bundle = zzezrVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfed zzfedVar = this.zzc;
        return zzfdn.zzd(new zzfdh() { // from class: com.google.android.gms.internal.ads.zzegx
            @Override // com.google.android.gms.internal.ads.zzfdh
            public final void zza() {
                zzeha.this.zzd(zzezrVar, zzezfVar, zzebyVar);
            }
        }, this.zzd, zzfdx.ADAPTER_LOAD_AD_SYN, zzfedVar).zzb(zzfdx.ADAPTER_LOAD_AD_ACK).zzd(zzcalVar).zzb(zzfdx.ADAPTER_WRAP_ADAPTER).zze(new zzfdg() { // from class: com.google.android.gms.internal.ads.zzegy
            @Override // com.google.android.gms.internal.ads.zzfdg
            public final Object zza(Object obj) {
                return zzeha.this.zzc(zzezrVar, zzezfVar, zzebyVar, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final boolean zzb(zzezr zzezrVar, zzezf zzezfVar) {
        return !zzezfVar.zzu.isEmpty();
    }

    public final /* synthetic */ Object zzc(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar, Void r4) throws Exception {
        return this.zzb.zza(zzezrVar, zzezfVar, zzebyVar);
    }

    public final /* synthetic */ void zzd(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws Exception {
        this.zzb.zzb(zzezrVar, zzezfVar, zzebyVar);
    }
}
