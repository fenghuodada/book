package com.google.android.exoplayer2.audio;

import com.facebook.ads.AdError;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.audio.b */
/* loaded from: classes.dex */
public final class C6683b {

    /* renamed from: a */
    public static final int[] f10685a = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: com.google.android.exoplayer2.audio.b$a */
    /* loaded from: classes.dex */
    public static final class C6684a {

        /* renamed from: a */
        public final int f10686a;

        /* renamed from: b */
        public final int f10687b;

        /* renamed from: c */
        public final int f10688c;

        public C6684a(int i, int i2, int i3) {
            this.f10686a = i;
            this.f10687b = i2;
            this.f10688c = i3;
        }
    }

    /* renamed from: a */
    public static void m6076a(int i, C7436v c7436v) {
        c7436v.m4995w(7);
        byte[] bArr = c7436v.f13978a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
        if (r9 != 8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.audio.C6683b.C6684a m6075b(com.google.android.exoplayer2.util.C7435u r9) {
        /*
            r0 = 16
            int r1 = r9.m5026f(r0)
            int r0 = r9.m5026f(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.m5026f(r0)
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
            r1 = 2
            int r2 = r9.m5026f(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.m5026f(r1)
            boolean r2 = r9.m5027e()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.m5026f(r2)
            boolean r5 = r9.m5027e()
            if (r5 == 0) goto L47
            int r5 = r9.m5026f(r4)
            if (r5 <= 0) goto L47
            r9.m5020l(r1)
        L47:
            boolean r5 = r9.m5027e()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L55
            r5 = r6
            goto L56
        L55:
            r5 = r7
        L56:
            int r9 = r9.m5026f(r3)
            int[] r8 = com.google.android.exoplayer2.audio.C6683b.f10685a
            if (r5 != r7) goto L65
            r7 = 13
            if (r9 != r7) goto L65
            r9 = r8[r9]
            goto L92
        L65:
            if (r5 != r6) goto L91
            r6 = 14
            if (r9 >= r6) goto L91
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L89
            r7 = 11
            if (r2 == r1) goto L84
            if (r2 == r4) goto L89
            if (r2 == r3) goto L7d
            goto L8f
        L7d:
            if (r9 == r4) goto L8d
            if (r9 == r8) goto L8d
            if (r9 != r7) goto L8f
            goto L8d
        L84:
            if (r9 == r8) goto L8d
            if (r9 != r7) goto L8f
            goto L8d
        L89:
            if (r9 == r4) goto L8d
            if (r9 != r8) goto L8f
        L8d:
            int r6 = r6 + 1
        L8f:
            r9 = r6
            goto L92
        L91:
            r9 = 0
        L92:
            com.google.android.exoplayer2.audio.b$a r1 = new com.google.android.exoplayer2.audio.b$a
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C6683b.m6075b(com.google.android.exoplayer2.util.u):com.google.android.exoplayer2.audio.b$a");
    }
}
