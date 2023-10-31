package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzdib implements zzbed {
    final /* synthetic */ zzdiy zza;
    final /* synthetic */ ViewGroup zzb;

    public zzdib(zzdiy zzdiyVar, ViewGroup viewGroup) {
        this.zza = zzdiyVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final void zzc() {
        zzdiy zzdiyVar = this.zza;
        zzfrr zzfrrVar = zzdhy.zza;
        Map zzm = zzdiyVar.zzm();
        if (zzm == null) {
            return;
        }
        int size = zzfrrVar.size();
        int i = 0;
        while (i < size) {
            Object obj = zzm.get((String) zzfrrVar.get(i));
            i++;
            if (obj != null) {
                this.zza.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
