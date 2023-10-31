package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzerf implements zzeqq {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbyt zzg;

    public zzerf(zzbyt zzbytVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzbytVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaR)).booleanValue()) {
            return zzfvr.zze((zzfvi) zzfvr.zzn(zzfvr.zzl(zzfvi.zzv(this.zzg.zza(this.zza, this.zzd)), new zzfon() { // from class: com.google.android.gms.internal.ads.zzerd
                @Override // com.google.android.gms.internal.ads.zzfon
                public final Object apply(Object obj) {
                    return zzerf.this.zzc((AdvertisingIdClient.Info) obj);
                }
            }, this.zzc), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaS)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfon() { // from class: com.google.android.gms.internal.ads.zzere
                @Override // com.google.android.gms.internal.ads.zzfon
                public final Object apply(Object obj) {
                    return zzerf.this.zzd((Throwable) obj);
                }
            }, this.zzc);
        }
        return zzfvr.zzg(new Exception("Did not ad Ad ID into query param."));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        r1 = com.google.android.gms.internal.ads.zzflz.zzj(r7.zza);
        r8.getClass();
        r2 = r8.getId();
        r2.getClass();
        r0 = r1.zzi(r2, r7.zza.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbk.zzcP)).longValue(), r7.zzf);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
        com.google.android.gms.ads.internal.zzt.zzo().zzu(r0, "AdIdInfoSignalSource.getPaidV1");
        r0 = new com.google.android.gms.internal.ads.zzflw();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbk.zzcJ)).booleanValue() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbk.zzcK)).booleanValue() != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzerg zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzflw r0 = new com.google.android.gms.internal.ads.zzflw
            r0.<init>()
            boolean r1 = r7.zze
            if (r1 != 0) goto L1b
            com.google.android.gms.internal.ads.zzbbc r1 = com.google.android.gms.internal.ads.zzbbk.zzcJ
            com.google.android.gms.internal.ads.zzbbi r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31
        L1b:
            boolean r1 = r7.zze
            if (r1 == 0) goto L6f
            com.google.android.gms.internal.ads.zzbbc r1 = com.google.android.gms.internal.ads.zzbbk.zzcK
            com.google.android.gms.internal.ads.zzbbi r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6f
        L31:
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzflz r1 = com.google.android.gms.internal.ads.zzflz.zzj(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            r8.getClass()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r2 = r8.getId()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzbbc r0 = com.google.android.gms.internal.ads.zzbbk.zzcP     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzbbi r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Object r0 = r4.zzb(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            boolean r6 = r7.zzf     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzflw r0 = r1.zzi(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            goto L6f
        L5e:
            r0 = move-exception
            goto L61
        L60:
            r0 = move-exception
        L61:
            java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
            com.google.android.gms.internal.ads.zzbzc r2 = com.google.android.gms.ads.internal.zzt.zzo()
            r2.zzu(r0, r1)
            com.google.android.gms.internal.ads.zzflw r0 = new com.google.android.gms.internal.ads.zzflw
            r0.<init>()
        L6f:
            com.google.android.gms.internal.ads.zzerg r1 = new com.google.android.gms.internal.ads.zzerg
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzerf.zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.google.android.gms.internal.ads.zzerg");
    }

    public final /* synthetic */ zzerg zzd(Throwable th) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzerg(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzflw());
    }
}
