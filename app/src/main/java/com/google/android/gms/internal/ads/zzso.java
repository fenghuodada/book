package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzso implements zzue {
    private final zzaav zza;
    @Nullable
    private zzaao zzb;
    @Nullable
    private zzaap zzc;

    public zzso(zzaav zzaavVar) {
        this.zza = zzaavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final int zza(zzabk zzabkVar) throws IOException {
        zzaao zzaaoVar = this.zzb;
        zzaaoVar.getClass();
        zzaap zzaapVar = this.zzc;
        zzaapVar.getClass();
        return zzaaoVar.zza(zzaapVar, zzabkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzb() {
        zzaap zzaapVar = this.zzc;
        if (zzaapVar != null) {
            return zzaapVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzc() {
        zzaao zzaaoVar = this.zzb;
        if (zzaaoVar instanceof zzafv) {
            ((zzafv) zzaaoVar).zze();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r6.zzf() != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r6.zzf() != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        r1 = false;
     */
    @Override // com.google.android.gms.internal.ads.zzue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzt r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzaar r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzaae r6 = new com.google.android.gms.internal.ads.zzaae
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzaao r8 = r7.zzb
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.zzaav r8 = r7.zza
            com.google.android.gms.internal.ads.zzaao[] r8 = r8.zza(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L21
            r8 = r8[r13]
            r7.zzb = r8
            goto La7
        L21:
            r0 = r13
        L22:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.zzd(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.zzb = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            com.google.android.gms.internal.ads.zzdy.zzf(r14)
            r6.zzj()
            goto L70
        L35:
            com.google.android.gms.internal.ads.zzaao r1 = r7.zzb
            if (r1 != 0) goto L66
            long r1 = r6.zzf()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L42:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzaao r9 = r7.zzb
            if (r9 != 0) goto L4f
            long r9 = r6.zzf()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
        L4f:
            r13 = r14
        L50:
            com.google.android.gms.internal.ads.zzdy.zzf(r13)
            r6.zzj()
            throw r8
        L57:
            com.google.android.gms.internal.ads.zzaao r1 = r7.zzb
            if (r1 != 0) goto L66
            long r1 = r6.zzf()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L64:
            r1 = r13
            goto L67
        L66:
            r1 = r14
        L67:
            com.google.android.gms.internal.ads.zzdy.zzf(r1)
            r6.zzj()
            int r0 = r0 + 1
            goto L22
        L70:
            com.google.android.gms.internal.ads.zzaao r10 = r7.zzb
            if (r10 != 0) goto La7
            com.google.android.gms.internal.ads.zzvl r10 = new com.google.android.gms.internal.ads.zzvl
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L7b:
            int r12 = r8.length
            if (r13 >= r12) goto L97
            r14 = r8[r13]
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getSimpleName()
            r11.append(r14)
            int r12 = r12 + (-1)
            if (r13 >= r12) goto L94
            java.lang.String r12 = ", "
            r11.append(r12)
        L94:
            int r13 = r13 + 1
            goto L7b
        L97:
            java.lang.String r8 = r11.toString()
            java.lang.String r11 = "None of the available extractors ("
            java.lang.String r12 = ") could read the stream."
            java.lang.String r8 = androidx.core.content.C0663f.m12005a(r11, r8, r12)
            r10.<init>(r8, r9)
            throw r10
        La7:
            com.google.android.gms.internal.ads.zzaao r8 = r7.zzb
            r8.zzb(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzso.zzd(com.google.android.gms.internal.ads.zzt, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzaar):void");
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzf(long j, long j2) {
        zzaao zzaaoVar = this.zzb;
        zzaaoVar.getClass();
        zzaaoVar.zzc(j, j2);
    }
}
