package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class zzehv {
    private final zzdeq zza;

    public zzehv(zzdeq zzdeqVar) {
        this.zza = zzdeqVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzezr zzezrVar, zzezf zzezfVar, View view, zzehr zzehrVar) {
        zzddq zze = this.zza.zze(new zzcru(zzezrVar, zzezfVar, null), new zzeht(this, new zzdey() { // from class: com.google.android.gms.internal.ads.zzehs
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(boolean z, Context context, zzcvv zzcvvVar) {
            }
        }));
        zzehrVar.zzd(new zzehu(this, zze));
        return zze.zzg();
    }
}
