package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class zznz implements zzod {
    public static final zzfpp zza = new zzfpp() { // from class: com.google.android.gms.internal.ads.zznx
        @Override // com.google.android.gms.internal.ads.zzfpp
        public final Object zza() {
            String zzl;
            zzl = zznz.zzl();
            return zzl;
        }
    };
    private static final Random zzb = new Random();
    private final zzcw zzc;
    private final zzcu zzd;
    private final HashMap zze;
    private final zzfpp zzf;
    private zzoc zzg;
    private zzcx zzh;
    @Nullable
    private String zzi;

    public zznz() {
        throw null;
    }

    public zznz(zzfpp zzfppVar) {
        this.zzf = zzfppVar;
        this.zzc = new zzcw();
        this.zzd = new zzcu();
        this.zze = new HashMap();
        this.zzh = zzcx.zza;
    }

    private final zzny zzk(int i, @Nullable zztl zztlVar) {
        long j;
        int i2;
        zztl zztlVar2;
        zztl zztlVar3;
        long j2 = Long.MAX_VALUE;
        zzny zznyVar = null;
        for (zzny zznyVar2 : this.zze.values()) {
            zznyVar2.zzg(i, zztlVar);
            if (zznyVar2.zzj(i, zztlVar)) {
                j = zznyVar2.zzd;
                if (j == -1 || j < j2) {
                    zznyVar = zznyVar2;
                    j2 = j;
                } else if (i2 == 0) {
                    int i3 = zzfn.zza;
                    zztlVar2 = zznyVar.zze;
                    if (zztlVar2 != null) {
                        zztlVar3 = zznyVar2.zze;
                        if (zztlVar3 != null) {
                            zznyVar = zznyVar2;
                        }
                    }
                }
            }
        }
        if (zznyVar == null) {
            String zzl = zzl();
            zzny zznyVar3 = new zzny(this, zzl, i, zztlVar);
            this.zze.put(zzl, zznyVar3);
            return zznyVar3;
        }
        return zznyVar;
    }

    public static String zzl() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzm(zzlt zzltVar) {
        String str;
        long j;
        zztl zztlVar;
        zztl zztlVar2;
        zztl zztlVar3;
        String unused;
        String unused2;
        if (zzltVar.zzb.zzo()) {
            this.zzi = null;
            return;
        }
        zzny zznyVar = (zzny) this.zze.get(this.zzi);
        zzny zzk = zzk(zzltVar.zzc, zzltVar.zzd);
        str = zzk.zzb;
        this.zzi = str;
        zzh(zzltVar);
        zztl zztlVar4 = zzltVar.zzd;
        if (zztlVar4 == null || !zztlVar4.zzb()) {
            return;
        }
        if (zznyVar != null) {
            j = zznyVar.zzd;
            if (j == zzltVar.zzd.zzd) {
                zztlVar = zznyVar.zze;
                if (zztlVar != null) {
                    zztlVar2 = zznyVar.zze;
                    if (zztlVar2.zzb == zzltVar.zzd.zzb) {
                        zztlVar3 = zznyVar.zze;
                        if (zztlVar3.zzc == zzltVar.zzd.zzc) {
                            return;
                        }
                    }
                }
            }
        }
        zztl zztlVar5 = zzltVar.zzd;
        unused = zzk(zzltVar.zzc, new zztl(zztlVar5.zza, zztlVar5.zzd)).zzb;
        unused2 = zzk.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzod
    @Nullable
    public final synchronized String zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzod
    public final synchronized String zze(zzcx zzcxVar, zztl zztlVar) {
        String str;
        str = zzk(zzcxVar.zzn(zztlVar.zza, this.zzd).zzd, zztlVar).zzb;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzod
    public final synchronized void zzf(zzlt zzltVar) {
        boolean z;
        zzoc zzocVar;
        String str;
        this.zzi = null;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzny zznyVar = (zzny) it.next();
            it.remove();
            z = zznyVar.zzf;
            if (z && (zzocVar = this.zzg) != null) {
                str = zznyVar.zzb;
                zzocVar.zzd(zzltVar, str, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzod
    public final void zzg(zzoc zzocVar) {
        this.zzg = zzocVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x003d, code lost:
        if (r1 < r3) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzh(com.google.android.gms.internal.ads.zzlt r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzoc r0 = r9.zzg     // Catch: java.lang.Throwable -> Lcb
            r0.getClass()
            com.google.android.gms.internal.ads.zzcx r0 = r10.zzb     // Catch: java.lang.Throwable -> Lcb
            boolean r0 = r0.zzo()     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto L10
            monitor-exit(r9)
            return
        L10:
            java.util.HashMap r0 = r9.zze     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r9.zzi     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzny r0 = (com.google.android.gms.internal.ads.zzny) r0     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zztl r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto L41
            if (r0 == 0) goto L41
            long r1 = com.google.android.gms.internal.ads.zzny.zzb(r0)     // Catch: java.lang.Throwable -> Lcb
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L33
            int r0 = com.google.android.gms.internal.ads.zzny.zza(r0)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lcb
            if (r0 != r1) goto L3f
            goto L41
        L33:
            com.google.android.gms.internal.ads.zztl r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            long r1 = r1.zzd     // Catch: java.lang.Throwable -> Lcb
            long r3 = com.google.android.gms.internal.ads.zzny.zzb(r0)     // Catch: java.lang.Throwable -> Lcb
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L41
        L3f:
            monitor-exit(r9)
            return
        L41:
            int r0 = r10.zzc     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zztl r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzny r0 = r9.zzk(r0, r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r9.zzi     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto L53
            java.lang.String r1 = com.google.android.gms.internal.ads.zzny.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
            r9.zzi = r1     // Catch: java.lang.Throwable -> Lcb
        L53:
            com.google.android.gms.internal.ads.zztl r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            r2 = 1
            if (r1 == 0) goto L9d
            boolean r3 = r1.zzb()     // Catch: java.lang.Throwable -> Lcb
            if (r3 == 0) goto L9d
            com.google.android.gms.internal.ads.zztl r3 = new com.google.android.gms.internal.ads.zztl     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r4 = r1.zza     // Catch: java.lang.Throwable -> Lcb
            long r5 = r1.zzd     // Catch: java.lang.Throwable -> Lcb
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> Lcb
            r3.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzny r1 = r9.zzk(r1, r3)     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = com.google.android.gms.internal.ads.zzny.zzi(r1)     // Catch: java.lang.Throwable -> Lcb
            if (r3 != 0) goto L9d
            com.google.android.gms.internal.ads.zzny.zzf(r1, r2)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzcx r3 = r10.zzb     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zztl r4 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r4 = r4.zza     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzcu r5 = r9.zzd     // Catch: java.lang.Throwable -> Lcb
            r3.zzn(r4, r5)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzcu r3 = r9.zzd     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zztl r4 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            int r4 = r4.zzb     // Catch: java.lang.Throwable -> Lcb
            r3.zzi(r4)     // Catch: java.lang.Throwable -> Lcb
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzfn.zzq(r3)     // Catch: java.lang.Throwable -> Lcb
            long r7 = com.google.android.gms.internal.ads.zzfn.zzq(r3)     // Catch: java.lang.Throwable -> Lcb
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzny.zzd(r1)     // Catch: java.lang.Throwable -> Lcb
        L9d:
            boolean r1 = com.google.android.gms.internal.ads.zzny.zzi(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto La9
            com.google.android.gms.internal.ads.zzny.zzf(r0, r2)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzny.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
        La9:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzny.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = r9.zzi     // Catch: java.lang.Throwable -> Lcb
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto Lc9
            boolean r1 = com.google.android.gms.internal.ads.zzny.zzh(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto Lc9
            com.google.android.gms.internal.ads.zzny.zze(r0, r2)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzoc r1 = r9.zzg     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = com.google.android.gms.internal.ads.zzny.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
            r1.zzc(r10, r0)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r9)
            return
        Lc9:
            monitor-exit(r9)
            return
        Lcb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznz.zzh(com.google.android.gms.internal.ads.zzlt):void");
    }

    @Override // com.google.android.gms.internal.ads.zzod
    public final synchronized void zzi(zzlt zzltVar, int i) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        this.zzg.getClass();
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzny zznyVar = (zzny) it.next();
            if (zznyVar.zzk(zzltVar)) {
                it.remove();
                z = zznyVar.zzf;
                if (z) {
                    str = zznyVar.zzb;
                    boolean equals = str.equals(this.zzi);
                    boolean z3 = false;
                    if (i == 0 && equals) {
                        z2 = zznyVar.zzg;
                        if (z2) {
                            z3 = true;
                        }
                    }
                    if (equals) {
                        this.zzi = null;
                    }
                    zzoc zzocVar = this.zzg;
                    str2 = zznyVar.zzb;
                    zzocVar.zzd(zzltVar, str2, z3);
                }
            }
        }
        zzm(zzltVar);
    }

    @Override // com.google.android.gms.internal.ads.zzod
    public final synchronized void zzj(zzlt zzltVar) {
        boolean z;
        String str;
        String str2;
        this.zzg.getClass();
        zzcx zzcxVar = this.zzh;
        this.zzh = zzltVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzny zznyVar = (zzny) it.next();
            if (!zznyVar.zzl(zzcxVar, this.zzh) || zznyVar.zzk(zzltVar)) {
                it.remove();
                z = zznyVar.zzf;
                if (z) {
                    str = zznyVar.zzb;
                    if (str.equals(this.zzi)) {
                        this.zzi = null;
                    }
                    zzoc zzocVar = this.zzg;
                    str2 = zznyVar.zzb;
                    zzocVar.zzd(zzltVar, str2, false);
                }
            }
        }
        zzm(zzltVar);
    }
}
