package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbmk {
    private final Context zzb;
    private final String zzc;
    private final zzbzz zzd;
    @Nullable
    private final zzfft zze;
    private final com.google.android.gms.ads.internal.util.zzbb zzf;
    private final com.google.android.gms.ads.internal.util.zzbb zzg;
    @Nullable
    private zzbmj zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbmk(Context context, zzbzz zzbzzVar, String str, com.google.android.gms.ads.internal.util.zzbb zzbbVar, com.google.android.gms.ads.internal.util.zzbb zzbbVar2, @Nullable zzfft zzfftVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzbzzVar;
        this.zze = zzfftVar;
        this.zzf = zzbbVar;
        this.zzg = zzbbVar2;
    }

    public final zzbme zzb(@Nullable zzaqq zzaqqVar) {
        synchronized (this.zza) {
            synchronized (this.zza) {
                zzbmj zzbmjVar = this.zzh;
                if (zzbmjVar != null && this.zzi == 0) {
                    zzbmjVar.zzi(new zzcap() { // from class: com.google.android.gms.internal.ads.zzblp
                        @Override // com.google.android.gms.internal.ads.zzcap
                        public final void zza(Object obj) {
                            zzbmk.this.zzk((zzblf) obj);
                        }
                    }, new zzcan() { // from class: com.google.android.gms.internal.ads.zzblq
                        @Override // com.google.android.gms.internal.ads.zzcan
                        public final void zza() {
                        }
                    });
                }
            }
            zzbmj zzbmjVar2 = this.zzh;
            if (zzbmjVar2 != null && zzbmjVar2.zze() != -1) {
                int i = this.zzi;
                if (i == 0) {
                    return this.zzh.zza();
                } else if (i != 1) {
                    return this.zzh.zza();
                } else {
                    this.zzi = 2;
                    zzd(null);
                    return this.zzh.zza();
                }
            }
            this.zzi = 2;
            zzbmj zzd = zzd(null);
            this.zzh = zzd;
            return zzd.zza();
        }
    }

    public final zzbmj zzd(@Nullable zzaqq zzaqqVar) {
        zzfff zza = zzffe.zza(this.zzb, 6);
        zza.zzh();
        final zzbmj zzbmjVar = new zzbmj(this.zzg);
        zzcag.zze.execute(new Runnable(null, zzbmjVar) { // from class: com.google.android.gms.internal.ads.zzblt
            public final /* synthetic */ zzbmj zzb;

            {
                this.zzb = zzbmjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbmk.this.zzj(null, this.zzb);
            }
        });
        zzbmjVar.zzi(new zzblz(this, zzbmjVar, zza), new zzbma(this, zzbmjVar, zza));
        return zzbmjVar;
    }

    public final /* synthetic */ void zzi(zzbmj zzbmjVar, final zzblf zzblfVar, ArrayList arrayList, long j) {
        synchronized (this.zza) {
            if (zzbmjVar.zze() != -1 && zzbmjVar.zze() != 1) {
                zzbmjVar.zzg();
                zzcag.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzblf.this.zzc();
                    }
                });
                String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzc));
                int zze = zzbmjVar.zze();
                int i = this.zzi;
                String valueOf2 = String.valueOf(arrayList.get(0));
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - j;
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive /jsLoaded in " + valueOf + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zze + ". Update status(onEngLoadedTimeout) is " + i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + valueOf2 + " ms. Total latency(onEngLoadedTimeout) is " + currentTimeMillis + " ms. Rejecting.");
            }
        }
    }

    public final /* synthetic */ void zzj(zzaqq zzaqqVar, zzbmj zzbmjVar) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            zzbln zzblnVar = new zzbln(this.zzb, this.zzd, null, null);
            zzblnVar.zzk(new zzblu(this, arrayList, currentTimeMillis, zzbmjVar, zzblnVar));
            zzblnVar.zzq("/jsLoaded", new zzblv(this, currentTimeMillis, zzbmjVar, zzblnVar));
            com.google.android.gms.ads.internal.util.zzca zzcaVar = new com.google.android.gms.ads.internal.util.zzca();
            zzblw zzblwVar = new zzblw(this, null, zzblnVar, zzcaVar);
            zzcaVar.zzb(zzblwVar);
            zzblnVar.zzq("/requestReload", zzblwVar);
            if (this.zzc.endsWith(".js")) {
                zzblnVar.zzh(this.zzc);
            } else if (this.zzc.startsWith("<html>")) {
                zzblnVar.zzf(this.zzc);
            } else {
                zzblnVar.zzg(this.zzc);
            }
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbly(this, zzbmjVar, zzblnVar, arrayList, currentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzd)).intValue());
        } catch (Throwable th) {
            zzbzt.zzh("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbmjVar.zzg();
        }
    }

    public final /* synthetic */ void zzk(zzblf zzblfVar) {
        if (zzblfVar.zzi()) {
            this.zzi = 1;
        }
    }
}
