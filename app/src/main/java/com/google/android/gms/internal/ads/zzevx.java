package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzevx implements zzeww {
    private zzcup zza;
    private final Executor zzb = zzfwi.zzb();

    public final zzcup zza() {
        return this.zza;
    }

    public final zzfwb zzb(zzewx zzewxVar, zzewv zzewvVar, @Nullable zzcup zzcupVar) {
        zzcuo zza = zzewvVar.zza(zzewxVar.zzb);
        zza.zzb(new zzexa(true));
        zzcup zzcupVar2 = (zzcup) zza.zzh();
        this.zza = zzcupVar2;
        final zzcsm zzb = zzcupVar2.zzb();
        final zzfbv zzfbvVar = new zzfbv();
        return zzfvr.zzl(zzfvr.zzm(zzfvi.zzv(zzb.zzj()), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzevv
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                zzfbv zzfbvVar2 = zzfbvVar;
                zzcsm zzcsmVar = zzb;
                zzezr zzezrVar = (zzezr) obj;
                zzfbvVar2.zzb = zzezrVar;
                Iterator it = zzezrVar.zzb.zza.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        for (String str : ((zzezf) it.next()).zza) {
                            if (!str.contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return zzcsmVar.zzi(zzfvr.zzh(zzezrVar));
                    }
                }
                return zzfvr.zzh(null);
            }
        }, this.zzb), new zzfon() { // from class: com.google.android.gms.internal.ads.zzevw
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                zzfbv zzfbvVar2 = zzfbv.this;
                zzfbvVar2.zzc = (zzcrf) obj;
                return zzfbvVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeww
    public final /* bridge */ /* synthetic */ zzfwb zzc(zzewx zzewxVar, zzewv zzewvVar, @Nullable Object obj) {
        return zzb(zzewxVar, zzewvVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeww
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
