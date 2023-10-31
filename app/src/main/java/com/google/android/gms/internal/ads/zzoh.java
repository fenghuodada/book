package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.content.C0663f;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzoh {
    public static final zzoh zza = new zzoh(new int[]{2}, 8);
    private static final zzoh zzb = new zzoh(new int[]{2, 5, 6}, 8);
    private static final zzfru zzc;
    private final int[] zzd;
    private final int zze;

    static {
        zzfrt zzfrtVar = new zzfrt();
        zzfrtVar.zza(5, 6);
        zzfrtVar.zza(17, 6);
        zzfrtVar.zza(7, 6);
        zzfrtVar.zza(18, 6);
        zzfrtVar.zza(6, 8);
        zzfrtVar.zza(8, 8);
        zzfrtVar.zza(14, 8);
        zzc = zzfrtVar.zzc();
    }

    public zzoh(@Nullable int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzd = copyOf;
        Arrays.sort(copyOf);
        this.zze = 8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzoh) && Arrays.equals(this.zzd, ((zzoh) obj).zzd);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzd) * 31) + 8;
    }

    public final String toString() {
        return C0663f.m12005a("AudioCapabilities[maxChannelCount=8, supportedEncodings=", Arrays.toString(this.zzd), "]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
        if (r7 != 5) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair zza(com.google.android.gms.internal.ads.zzam r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.zzm
            r0.getClass()
            java.lang.String r1 = r10.zzj
            int r0 = com.google.android.gms.internal.ads.zzcd.zza(r0, r1)
            com.google.android.gms.internal.ads.zzfru r1 = com.google.android.gms.internal.ads.zzoh.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L19
            return r3
        L19:
            r2 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            if (r0 != r6) goto L2a
            boolean r0 = r9.zzc(r6)
            if (r0 != 0) goto L29
            r0 = r4
            goto L33
        L29:
            r0 = r6
        L2a:
            if (r0 != r5) goto L33
            boolean r7 = r9.zzc(r5)
            if (r7 != 0) goto L33
            r0 = r2
        L33:
            boolean r7 = r9.zzc(r0)
            if (r7 != 0) goto L3a
            return r3
        L3a:
            int r7 = r10.zzz
            r8 = -1
            if (r7 == r8) goto L45
            if (r0 != r6) goto L42
            goto L45
        L42:
            if (r7 <= r5) goto L6d
            return r3
        L45:
            int r10 = r10.zzA
            if (r10 != r8) goto L4c
            r10 = 48000(0xbb80, float:6.7262E-41)
        L4c:
            int r6 = com.google.android.gms.internal.ads.zzfn.zza
            r7 = 29
            if (r6 < r7) goto L57
            int r7 = com.google.android.gms.internal.ads.zzog.zza(r0, r10)
            goto L6d
        L57:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r10 = r1.getOrDefault(r10, r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            int r7 = r10.intValue()
        L6d:
            int r10 = com.google.android.gms.internal.ads.zzfn.zza
            r1 = 28
            if (r10 > r1) goto L81
            if (r7 != r2) goto L77
            r4 = r5
            goto L82
        L77:
            r1 = 3
            if (r7 == r1) goto L82
            r1 = 4
            if (r7 == r1) goto L82
            r1 = 5
            if (r7 != r1) goto L81
            goto L82
        L81:
            r4 = r7
        L82:
            r1 = 26
            if (r10 > r1) goto L94
            java.lang.String r10 = "fugu"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfn.zzb
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L94
            r10 = 1
            if (r4 != r10) goto L94
            r4 = 2
        L94:
            int r10 = com.google.android.gms.internal.ads.zzfn.zzf(r4)
            if (r10 != 0) goto L9b
            return r3
        L9b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoh.zza(com.google.android.gms.internal.ads.zzam):android.util.Pair");
    }

    public final boolean zzc(int i) {
        return Arrays.binarySearch(this.zzd, i) >= 0;
    }
}
