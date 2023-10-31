package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
abstract class zzfud extends zzfvh implements Runnable {
    @CheckForNull
    zzfwb zza;
    @CheckForNull
    Class zzb;
    @CheckForNull
    Object zzc;

    public zzfud(zzfwb zzfwbVar, Class cls, Object obj) {
        zzfwbVar.getClass();
        this.zza = zzfwbVar;
        this.zzb = cls;
        obj.getClass();
        this.zzc = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzfwb r0 = r10.zza
            java.lang.Class r1 = r10.zzb
            java.lang.Object r2 = r10.zzc
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = r3
            goto Ld
        Lc:
            r5 = r4
        Ld:
            if (r1 != 0) goto L11
            r6 = r3
            goto L12
        L11:
            r6 = r4
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = r4
        L17:
            r3 = r3 | r5
            if (r3 != 0) goto L92
            boolean r3 = r10.isCancelled()
            if (r3 == 0) goto L22
            goto L92
        L22:
            r3 = 0
            r10.zza = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfwu     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3d
            if (r4 == 0) goto L31
            r4 = r0
            com.google.android.gms.internal.ads.zzfwu r4 = (com.google.android.gms.internal.ads.zzfwu) r4     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3d
            java.lang.Throwable r4 = r4.zzm()     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3d
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L64
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzfvr.zzo(r0)     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3d
            goto L65
        L39:
            r4 = move-exception
            goto L64
        L3b:
            r4 = move-exception
            goto L64
        L3d:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L63
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r7 = "Future type "
            java.lang.String r8 = " threw "
            java.lang.String r9 = " without a cause"
            java.lang.String r4 = androidx.core.provider.C0761g.m11824a(r7, r6, r8, r4, r9)
            r5.<init>(r4)
        L63:
            r4 = r5
        L64:
            r5 = r3
        L65:
            if (r4 != 0) goto L6b
            r10.zzd(r5)
            return
        L6b:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L8f
            java.lang.Object r0 = r10.zzf(r2, r4)     // Catch: java.lang.Throwable -> L7d
            r10.zzb = r3
            r10.zzc = r3
            r10.zzg(r0)
            return
        L7d:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzfwj.zza(r0)     // Catch: java.lang.Throwable -> L89
            r10.zze(r0)     // Catch: java.lang.Throwable -> L89
            r10.zzb = r3
            r10.zzc = r3
            return
        L89:
            r0 = move-exception
            r10.zzb = r3
            r10.zzc = r3
            throw r0
        L8f:
            r10.zzt(r0)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfud.run():void");
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    @CheckForNull
    public final String zza() {
        String str;
        zzfwb zzfwbVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zza = super.zza();
        if (zzfwbVar != null) {
            str = C0663f.m12005a("inputFuture=[", zzfwbVar.toString(), "], ");
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            String obj2 = cls.toString();
            String obj3 = obj.toString();
            return str + "exceptionType=[" + obj2 + "], fallback=[" + obj3 + "]";
        } else if (zza != null) {
            return str.concat(zza);
        } else {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public abstract Object zzf(Object obj, Throwable th) throws Exception;

    public abstract void zzg(Object obj);
}
