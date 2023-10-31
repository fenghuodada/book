package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdfw implements zzbii {
    private final WeakReference zza;

    public /* synthetic */ zzdfw(zzdfz zzdfzVar, zzdfv zzdfvVar) {
        this.zza = new WeakReference(zzdfzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void zza(Object obj, Map map) {
        zzcvg zzcvgVar;
        zzdcu zzdcuVar;
        zzdcu zzdcuVar2;
        zzdfz zzdfzVar = (zzdfz) this.zza.get();
        if (zzdfzVar == null) {
            return;
        }
        zzcvgVar = zzdfzVar.zzh;
        zzcvgVar.onAdClicked();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjp)).booleanValue()) {
            zzdcuVar = zzdfzVar.zzi;
            zzdcuVar.zzr();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            zzdcuVar2 = zzdfzVar.zzi;
            zzdcuVar2.zzs();
        }
    }
}
