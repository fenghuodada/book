package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class zzzs {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        if (r12 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
        if (r12 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
        if (r12 != 8) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzzr zza(com.google.android.gms.internal.ads.zzfc r12) {
        /*
            r0 = 16
            int r1 = r12.zzd(r0)
            int r0 = r12.zzd(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r12.zzd(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r12.zzd(r0)
            r2 = 0
            r4 = 3
            if (r1 != r4) goto L3e
            r1 = r2
        L2c:
            int r5 = r12.zzd(r0)
            int r5 = r5 + r1
            boolean r1 = r12.zzn()
            if (r1 != 0) goto L39
            int r5 = r5 + r4
            goto L3f
        L39:
            int r5 = r5 + 1
            int r1 = r5 << 2
            goto L2c
        L3e:
            r5 = r1
        L3f:
            r1 = 10
            int r1 = r12.zzd(r1)
            boolean r6 = r12.zzn()
            if (r6 == 0) goto L54
            int r6 = r12.zzd(r4)
            if (r6 <= 0) goto L54
            r12.zzl(r0)
        L54:
            boolean r6 = r12.zzn()
            r7 = 44100(0xac44, float:6.1797E-41)
            r9 = 48000(0xbb80, float:6.7262E-41)
            r10 = 1
            if (r10 == r6) goto L63
            r11 = r7
            goto L64
        L63:
            r11 = r9
        L64:
            int r12 = r12.zzd(r3)
            if (r11 != r7) goto L74
            r6 = 13
            if (r12 != r6) goto L74
            int[] r12 = com.google.android.gms.internal.ads.zzzs.zzb
            r12 = r12[r6]
            r9 = r12
            goto La0
        L74:
            if (r11 != r9) goto L9f
            r6 = 14
            if (r12 >= r6) goto L9f
            int[] r2 = com.google.android.gms.internal.ads.zzzs.zzb
            r2 = r2[r12]
            int r1 = r1 % 5
            r6 = 8
            if (r1 == r10) goto L99
            r7 = 11
            if (r1 == r0) goto L94
            if (r1 == r4) goto L99
            if (r1 == r3) goto L8d
            goto L9f
        L8d:
            if (r12 == r4) goto L9d
            if (r12 == r6) goto L9d
            if (r12 != r7) goto L9f
            goto L9d
        L94:
            if (r12 == r6) goto L9d
            if (r12 != r7) goto L9f
            goto L9d
        L99:
            if (r12 == r4) goto L9d
            if (r12 != r6) goto L9f
        L9d:
            int r2 = r2 + 1
        L9f:
            r9 = r2
        La0:
            com.google.android.gms.internal.ads.zzzr r12 = new com.google.android.gms.internal.ads.zzzr
            r6 = 2
            r10 = 0
            r4 = r12
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzs.zza(com.google.android.gms.internal.ads.zzfc):com.google.android.gms.internal.ads.zzzr");
    }

    public static void zzb(int i, zzfd zzfdVar) {
        zzfdVar.zzC(7);
        byte[] zzH = zzfdVar.zzH();
        zzH[0] = -84;
        zzH[1] = 64;
        zzH[2] = -1;
        zzH[3] = -1;
        zzH[4] = (byte) ((i >> 16) & 255);
        zzH[5] = (byte) ((i >> 8) & 255);
        zzH[6] = (byte) (i & 255);
    }
}
