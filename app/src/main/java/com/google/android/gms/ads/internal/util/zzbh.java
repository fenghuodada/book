package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzalm;
import com.google.android.gms.internal.ads.zzalr;
import com.google.android.gms.internal.ads.zzbzt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbh implements zzalm {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbl zzb;

    public zzbh(zzbo zzboVar, String str, zzbl zzblVar) {
        this.zza = str;
        this.zzb = zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zza(zzalr zzalrVar) {
        String str = this.zza;
        String obj = zzalrVar.toString();
        zzbzt.zzj("Failed to load URL: " + str + "\n" + obj);
        this.zzb.zza((Object) null);
    }
}
