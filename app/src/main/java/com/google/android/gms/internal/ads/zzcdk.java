package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcdk implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzcdn zzd;

    public zzcdk(zzcdn zzcdnVar, String str, String str2, int i) {
        this.zzd = zzcdnVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalBytes", Integer.toString(this.zzc));
        zzcdn.zze(this.zzd, "onPrecacheEvent", hashMap);
    }
}
