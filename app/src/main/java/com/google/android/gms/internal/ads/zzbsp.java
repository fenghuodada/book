package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzbsp extends zzbsj {
    final /* synthetic */ List zza;

    public zzbsp(zzbss zzbssVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbsk
    public final void zze(String str) {
        zzbzt.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbsk
    public final void zzf(List list) {
        zzbzt.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
