package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzdnu {
    private final Map zza = new HashMap();

    @Nullable
    public final synchronized zzdnt zza(String str) {
        return (zzdnt) this.zza.get(str);
    }

    @Nullable
    public final zzdnt zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdnt zza = zza((String) it.next());
            if (zza != null) {
                return zza;
            }
        }
        return null;
    }

    public final String zzc(String str) {
        zzbqj zzbqjVar;
        zzdnt zza = zza(str);
        return (zza == null || (zzbqjVar = zza.zzb) == null) ? "" : zzbqjVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzd(java.lang.String r6, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzfav r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.zza     // Catch: java.lang.Throwable -> L43
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            com.google.android.gms.internal.ads.zzdnt r0 = new com.google.android.gms.internal.ads.zzdnt     // Catch: java.lang.Throwable -> L43
            r1 = 0
            if (r7 != 0) goto L12
        L10:
            r2 = r1
            goto L16
        L12:
            com.google.android.gms.internal.ads.zzbqj r2 = r7.zze()     // Catch: com.google.android.gms.internal.ads.zzfaf -> L10 java.lang.Throwable -> L43
        L16:
            if (r7 != 0) goto L19
            goto L1d
        L19:
            com.google.android.gms.internal.ads.zzbqj r1 = r7.zzf()     // Catch: com.google.android.gms.internal.ads.zzfaf -> L1d java.lang.Throwable -> L43
        L1d:
            com.google.android.gms.internal.ads.zzbbc r3 = com.google.android.gms.internal.ads.zzbbk.zziM     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.internal.ads.zzbbi r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r3 = r4.zzb(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L43
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L43
            r4 = 1
            if (r3 != 0) goto L31
            goto L39
        L31:
            r3 = 0
            if (r7 != 0) goto L36
        L34:
            r4 = r3
            goto L39
        L36:
            r7.zzC()     // Catch: com.google.android.gms.internal.ads.zzfaf -> L34 java.lang.Throwable -> L43
        L39:
            r0.<init>(r6, r2, r1, r4)     // Catch: java.lang.Throwable -> L43
            java.util.Map r7 = r5.zza     // Catch: java.lang.Throwable -> L43
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r5)
            return
        L43:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdnu.zzd(java.lang.String, com.google.android.gms.internal.ads.zzfav):void");
    }

    public final synchronized void zze(String str, zzbpv zzbpvVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdnt(str, zzbpvVar.zzf(), zzbpvVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
