package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzbsq extends zzbsj {
    final /* synthetic */ List zza;

    public zzbsq(zzbss zzbssVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbsk
    public final void zze(String str) {
        zzbzt.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbsk
    public final void zzf(List list) {
        zzbzt.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
