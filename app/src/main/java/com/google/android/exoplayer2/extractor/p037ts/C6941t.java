package com.google.android.exoplayer2.extractor.p037ts;

import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.util.C7404e0;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.ts.t */
/* loaded from: classes.dex */
public final class C6941t {

    /* renamed from: c */
    public boolean f11929c;

    /* renamed from: d */
    public boolean f11930d;

    /* renamed from: e */
    public boolean f11931e;

    /* renamed from: a */
    public final C7404e0 f11927a = new C7404e0(0);

    /* renamed from: f */
    public long f11932f = -9223372036854775807L;

    /* renamed from: g */
    public long f11933g = -9223372036854775807L;

    /* renamed from: h */
    public long f11934h = -9223372036854775807L;

    /* renamed from: b */
    public final C7436v f11928b = new C7436v();

    /* renamed from: b */
    public static int m5823b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: c */
    public static long m5822c(C7436v c7436v) {
        int i = c7436v.f13979b;
        if (c7436v.f13980c - i < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        boolean z = false;
        c7436v.m5016b(0, bArr, 9);
        c7436v.m4992z(i);
        byte b = bArr[0];
        if ((b & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            z = true;
        }
        if (!z) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j3 = bArr[2];
        return j2 | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    /* renamed from: a */
    public final void m5824a(C6820e c6820e) {
        byte[] bArr = C7408g0.f13910f;
        C7436v c7436v = this.f11928b;
        c7436v.getClass();
        c7436v.m4994x(bArr.length, bArr);
        this.f11929c = true;
        c6820e.f11128f = 0;
    }
}
