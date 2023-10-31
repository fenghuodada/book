package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcfn {
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.zzcfb, java.lang.Object] */
    public static final zzcfb zza(final Context context, final zzcgq zzcgqVar, final String str, final boolean z, final boolean z2, @Nullable final zzaqq zzaqqVar, @Nullable final zzbcm zzbcmVar, final zzbzz zzbzzVar, @Nullable zzbcc zzbccVar, @Nullable final com.google.android.gms.ads.internal.zzl zzlVar, @Nullable final com.google.android.gms.ads.internal.zza zzaVar, final zzawx zzawxVar, @Nullable final zzezf zzezfVar, @Nullable final zzezi zzeziVar) throws zzcfm {
        zzbbk.zza(context);
        try {
            zzfpp zzfppVar = new zzfpp(context, zzcgqVar, str, z, z2, zzaqqVar, zzbcmVar, zzbzzVar, null, zzlVar, zzaVar, zzawxVar, zzezfVar, zzeziVar) { // from class: com.google.android.gms.internal.ads.zzcfj
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcgq zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzaqq zzf;
                public final /* synthetic */ zzbcm zzg;
                public final /* synthetic */ zzbzz zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzl zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzawx zzk;
                public final /* synthetic */ zzezf zzl;
                public final /* synthetic */ zzezi zzm;

                {
                    this.zzi = zzlVar;
                    this.zzj = zzaVar;
                    this.zzk = zzawxVar;
                    this.zzl = zzezfVar;
                    this.zzm = zzeziVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfpp
                public final Object zza() {
                    Context context2 = this.zza;
                    zzcgq zzcgqVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    boolean z4 = this.zze;
                    zzaqq zzaqqVar2 = this.zzf;
                    zzbcm zzbcmVar2 = this.zzg;
                    zzbzz zzbzzVar2 = this.zzh;
                    com.google.android.gms.ads.internal.zzl zzlVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzawx zzawxVar2 = this.zzk;
                    zzezf zzezfVar2 = this.zzl;
                    zzezi zzeziVar2 = this.zzm;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzcfu.zza;
                        zzcfq zzcfqVar = new zzcfq(new zzcfu(new zzcgp(context2), zzcgqVar2, str2, z3, z4, zzaqqVar2, zzbcmVar2, zzbzzVar2, null, zzlVar2, zzaVar2, zzawxVar2, zzezfVar2, zzeziVar2));
                        zzcfqVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzq().zzd(zzcfqVar, zzawxVar2, z4));
                        zzcfqVar.setWebChromeClient(new zzcfa(zzcfqVar));
                        return zzcfqVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ?? zza = zzfppVar.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th) {
            throw new zzcfm("Webview initialization failed.", th);
        }
    }
}
