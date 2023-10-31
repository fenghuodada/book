package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcfg implements zzfvn {
    final /* synthetic */ List zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Uri zzc;
    final /* synthetic */ zzcfi zzd;

    public zzcfg(zzcfi zzcfiVar, List list, String str, Uri uri) {
        this.zzd = zzcfiVar;
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzbzt.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.zzc)));
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzd.zzP((Map) obj, this.zza, this.zzb);
    }
}
