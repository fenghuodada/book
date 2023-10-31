package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zzdcq extends zzdas implements zzaty {
    private final Map zzb;
    private final Context zzc;
    private final zzezf zzd;

    public zzdcq(Context context, Set set, zzezf zzezfVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzezfVar;
    }

    public final synchronized void zza(View view) {
        zzatz zzatzVar = (zzatz) this.zzb.get(view);
        if (zzatzVar == null) {
            zzatzVar = new zzatz(this.zzc, view);
            zzatzVar.zzc(this);
            this.zzb.put(view, zzatzVar);
        }
        if (this.zzd.zzY) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbk)).booleanValue()) {
                zzatzVar.zzg(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbj)).longValue());
                return;
            }
        }
        zzatzVar.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzatz) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final synchronized void zzc(final zzatx zzatxVar) {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzdcp
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzaty) obj).zzc(zzatx.this);
            }
        });
    }
}
