package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcdl implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzcdn zzd;

    public zzcdl(zzcdn zzcdnVar, String str, String str2, long j) {
        this.zzd = zzcdnVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalDuration", Long.toString(this.zzc));
        zzcdn.zze(this.zzd, "onPrecacheEvent", hashMap);
    }
}
