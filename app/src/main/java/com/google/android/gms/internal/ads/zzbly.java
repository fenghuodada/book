package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbly implements Runnable {
    final /* synthetic */ zzbmj zza;
    final /* synthetic */ zzblf zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbmk zze;

    public zzbly(zzbmk zzbmkVar, zzbmj zzbmjVar, zzblf zzblfVar, ArrayList arrayList, long j) {
        this.zze = zzbmkVar;
        this.zza = zzbmjVar;
        this.zzb = zzblfVar;
        this.zzc = arrayList;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i;
        obj = this.zze.zza;
        synchronized (obj) {
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                this.zza.zzg();
                zzfwc zzfwcVar = zzcag.zze;
                final zzblf zzblfVar = this.zzb;
                zzfwcVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzblf.this.zzc();
                    }
                });
                String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzd));
                int zze = this.zza.zze();
                i = this.zze.zzi;
                String concat = this.zzc.isEmpty() ? ". Still waiting for the engine to be loaded" : ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(this.zzc.get(0)));
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzd;
                com.google.android.gms.ads.internal.util.zze.zza("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + zze + ". Update status(fullLoadTimeout) is " + i + concat + " ms. Total latency(fullLoadTimeout) is " + currentTimeMillis + " ms at timeout. Rejecting.");
            }
        }
    }
}
