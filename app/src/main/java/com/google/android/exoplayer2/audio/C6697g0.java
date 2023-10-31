package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.C1169e;

/* renamed from: com.google.android.exoplayer2.audio.g0 */
/* loaded from: classes.dex */
public final class C6697g0 {

    /* renamed from: a */
    public static final String[] f10717a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    public static final int[] f10718b = {44100, 48000, 32000};

    /* renamed from: c */
    public static final int[] f10719c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    public static final int[] f10720d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    public static final int[] f10721e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    public static final int[] f10722f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    public static final int[] f10723g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: com.google.android.exoplayer2.audio.g0$a */
    /* loaded from: classes.dex */
    public static final class C6698a {

        /* renamed from: a */
        public int f10724a;
        @Nullable

        /* renamed from: b */
        public String f10725b;

        /* renamed from: c */
        public int f10726c;

        /* renamed from: d */
        public int f10727d;

        /* renamed from: e */
        public int f10728e;

        /* renamed from: f */
        public int f10729f;

        /* renamed from: g */
        public int f10730g;

        /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00ae  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean m6063a(int r9) {
            /*
                Method dump skipped, instructions count: 179
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C6697g0.C6698a.m6063a(int):boolean");
        }
    }

    /* renamed from: a */
    public static int m6065a(int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i & (-2097152)) == -2097152) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = f10718b[i5];
        if (i2 == 2) {
            i8 /= 2;
        } else if (i2 == 0) {
            i8 /= 4;
        }
        int i9 = (i >>> 9) & 1;
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = f10719c[i4 - 1];
            } else {
                i7 = f10720d[i4 - 1];
            }
            return (((i7 * 12) / i8) + i9) * 4;
        }
        if (i2 == 3) {
            if (i3 == 2) {
                i6 = f10721e[i4 - 1];
            } else {
                i6 = f10722f[i4 - 1];
            }
        } else {
            i6 = f10723g[i4 - 1];
        }
        int i10 = 144;
        if (i2 == 3) {
            return C1169e.m11131a(i6, 144, i8, i9);
        }
        if (i3 == 1) {
            i10 = 72;
        }
        return C1169e.m11131a(i10, i6, i8, i9);
    }

    /* renamed from: b */
    public static int m6064b(int i) {
        int i2;
        int i3;
        if (!((i & (-2097152)) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        if (i3 == 1) {
            return i2 == 3 ? 1152 : 576;
        } else if (i3 != 2) {
            if (i3 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else {
            return 1152;
        }
    }
}
