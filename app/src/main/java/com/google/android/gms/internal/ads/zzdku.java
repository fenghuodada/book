package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdku {
    private final Executor zza;
    private final zzcoj zzb;
    private final zzdcq zzc;

    public zzdku(Executor executor, zzcoj zzcojVar, zzdcq zzdcqVar) {
        this.zza = executor;
        this.zzc = zzdcqVar;
        this.zzb = zzcojVar;
    }

    public final void zza(final zzcfb zzcfbVar) {
        if (zzcfbVar == null) {
            return;
        }
        this.zzc.zza(zzcfbVar.zzF());
        this.zzc.zzm(new zzaty() { // from class: com.google.android.gms.internal.ads.zzdkq
            @Override // com.google.android.gms.internal.ads.zzaty
            public final void zzc(zzatx zzatxVar) {
                zzcgo zzN = zzcfb.this.zzN();
                Rect rect = zzatxVar.zzd;
                zzN.zzp(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzm(new zzaty() { // from class: com.google.android.gms.internal.ads.zzdkr
            @Override // com.google.android.gms.internal.ads.zzaty
            public final void zzc(zzatx zzatxVar) {
                zzcfb zzcfbVar2 = zzcfb.this;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != zzatxVar.zzj ? "0" : "1");
                zzcfbVar2.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzm(this.zzb, this.zza);
        this.zzb.zzf(zzcfbVar);
        zzcfbVar.zzad("/trackActiveViewUnit", new zzbii() { // from class: com.google.android.gms.internal.ads.zzdks
            @Override // com.google.android.gms.internal.ads.zzbii
            public final void zza(Object obj, Map map) {
                zzdku.this.zzb((zzcfb) obj, map);
            }
        });
        zzcfbVar.zzad("/untrackActiveViewUnit", new zzbii() { // from class: com.google.android.gms.internal.ads.zzdkt
            @Override // com.google.android.gms.internal.ads.zzbii
            public final void zza(Object obj, Map map) {
                zzdku.this.zzc((zzcfb) obj, map);
            }
        });
    }

    public final /* synthetic */ void zzb(zzcfb zzcfbVar, Map map) {
        this.zzb.zzb();
    }

    public final /* synthetic */ void zzc(zzcfb zzcfbVar, Map map) {
        this.zzb.zza();
    }
}
