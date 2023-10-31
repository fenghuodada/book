package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzewb implements zzfch {
    public final zzewv zza;
    public final zzewx zzb;
    public final com.google.android.gms.ads.internal.client.zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzw zzf;
    public final zzfbw zzg;

    public zzewb(zzewv zzewvVar, zzewx zzewxVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzw zzwVar, zzfbw zzfbwVar) {
        this.zza = zzewvVar;
        this.zzb = zzewxVar;
        this.zzc = zzlVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzwVar;
        this.zzg = zzfbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfch
    public final zzfbw zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfch
    public final Executor zzb() {
        return this.zze;
    }
}
