package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzepe implements zzeqq {
    private final Context zza;
    private final zzfwc zzb;
    private final zzfaa zzc;
    private final zzbzz zzd;

    public zzepe(Context context, zzfwc zzfwcVar, zzfaa zzfaaVar, zzbzz zzbzzVar) {
        this.zza = context;
        this.zzb = zzfwcVar;
        this.zzc = zzfaaVar;
        this.zzd = zzbzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepe.this.zzc();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbk.zzcE)).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
        r1 = com.google.android.gms.internal.ads.zzflz.zzj(r0).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbk.zzcP)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbk.zzcD)).booleanValue() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cf, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbk.zzcF)).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d1, code lost:
        r0 = com.google.android.gms.internal.ads.zzfma.zzi(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
        if (r8.zzd.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbk.zzcM)).intValue()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
        r2 = r0.zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbk.zzcQ)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
        r3 = r0.zzo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010f, code lost:
        r6 = r0.zzp();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbk.zzcC)).booleanValue() == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzepf zzc() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzepe.zzc():com.google.android.gms.internal.ads.zzepf");
    }
}
