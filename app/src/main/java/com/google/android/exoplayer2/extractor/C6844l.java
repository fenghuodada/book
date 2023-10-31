package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.l */
/* loaded from: classes.dex */
public final class C6844l {

    /* renamed from: com.google.android.exoplayer2.extractor.l$a */
    /* loaded from: classes.dex */
    public static final class C6845a {

        /* renamed from: a */
        public long f11206a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0098, code lost:
        if (r7 == r18.f11541f) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a5, code lost:
        if ((r17.m5002p() * 1000) == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b4, code lost:
        if (r4 == r3) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m5921a(com.google.android.exoplayer2.util.C7436v r17, com.google.android.exoplayer2.extractor.C6885o r18, int r19, com.google.android.exoplayer2.extractor.C6844l.C6845a r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.C6844l.m5921a(com.google.android.exoplayer2.util.v, com.google.android.exoplayer2.extractor.o, int, com.google.android.exoplayer2.extractor.l$a):boolean");
    }

    /* renamed from: b */
    public static int m5920b(int i, C7436v c7436v) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c7436v.m5002p() + 1;
            case 7:
                return c7436v.m4997u() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
