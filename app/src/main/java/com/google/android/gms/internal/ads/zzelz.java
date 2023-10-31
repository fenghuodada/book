package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzelz implements zzeqq {
    private static final Object zza = new Object();
    private final String zzb;
    private final String zzc;
    private final zzcsw zzd;
    private final zzfbg zze;
    private final zzfaa zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();
    private final zzdpx zzh;

    public zzelz(String str, String str2, zzcsw zzcswVar, zzfbg zzfbgVar, zzfaa zzfaaVar, zzdpx zzdpxVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzcswVar;
        this.zze = zzfbgVar;
        this.zzf = zzfaaVar;
        this.zzh = zzdpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhj)).booleanValue()) {
            this.zzh.zza().put("seq_num", this.zzb);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfn)).booleanValue()) {
            this.zzd.zzg(this.zzf.zzd);
            bundle.putAll(this.zze.zzb());
        }
        return zzfvr.zzh(new zzeqp() { // from class: com.google.android.gms.internal.ads.zzely
            @Override // com.google.android.gms.internal.ads.zzeqp
            public final void zzh(Object obj) {
                zzelz.this.zzc(bundle, (Bundle) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzc(android.os.Bundle r3, android.os.Bundle r4) {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.zzbbc r0 = com.google.android.gms.internal.ads.zzbbk.zzfn
            com.google.android.gms.internal.ads.zzbbi r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L18
        L12:
            java.lang.String r0 = "quality_signals"
            r4.putBundle(r0, r3)
            goto L56
        L18:
            com.google.android.gms.internal.ads.zzbbc r3 = com.google.android.gms.internal.ads.zzbbk.zzfm
            com.google.android.gms.internal.ads.zzbbi r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r3 = r0.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L46
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzelz.zza
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzcsw r0 = r2.zzd     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.internal.ads.zzfaa r1 = r2.zzf     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.ads.internal.client.zzl r1 = r1.zzd     // Catch: java.lang.Throwable -> L43
            r0.zzg(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "quality_signals"
            com.google.android.gms.internal.ads.zzfbg r1 = r2.zze     // Catch: java.lang.Throwable -> L43
            android.os.Bundle r1 = r1.zzb()     // Catch: java.lang.Throwable -> L43
            r4.putBundle(r0, r1)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            goto L56
        L43:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            throw r4
        L46:
            com.google.android.gms.internal.ads.zzcsw r3 = r2.zzd
            com.google.android.gms.internal.ads.zzfaa r0 = r2.zzf
            com.google.android.gms.ads.internal.client.zzl r0 = r0.zzd
            r3.zzg(r0)
            com.google.android.gms.internal.ads.zzfbg r3 = r2.zze
            android.os.Bundle r3 = r3.zzb()
            goto L12
        L56:
            java.lang.String r3 = r2.zzb
            java.lang.String r0 = "seq_num"
            r4.putString(r0, r3)
            com.google.android.gms.ads.internal.util.zzg r3 = r2.zzg
            boolean r3 = r3.zzP()
            if (r3 != 0) goto L6c
            java.lang.String r3 = r2.zzc
            java.lang.String r0 = "session_id"
            r4.putString(r0, r3)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelz.zzc(android.os.Bundle, android.os.Bundle):void");
    }
}
