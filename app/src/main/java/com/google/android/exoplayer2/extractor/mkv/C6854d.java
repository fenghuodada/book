package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.C6820e;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.mkv.d */
/* loaded from: classes.dex */
public final class C6854d {

    /* renamed from: d */
    public static final long[] f11335d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f11336a = new byte[8];

    /* renamed from: b */
    public int f11337b;

    /* renamed from: c */
    public int f11338c;

    /* renamed from: a */
    public static long m5906a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f11335d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    /* renamed from: b */
    public final long m5905b(C6820e c6820e, boolean z, boolean z2, int i) throws IOException {
        int i2 = this.f11337b;
        byte[] bArr = this.f11336a;
        if (i2 == 0) {
            if (!c6820e.mo5930a(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            while (true) {
                if (i4 < 8) {
                    int i5 = ((f11335d[i4] & i3) > 0L ? 1 : ((f11335d[i4] & i3) == 0L ? 0 : -1));
                    i4++;
                    if (i5 != 0) {
                        break;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            this.f11338c = i4;
            if (i4 != -1) {
                this.f11337b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i6 = this.f11338c;
        if (i6 > i) {
            this.f11337b = 0;
            return -2L;
        }
        if (i6 != 1) {
            c6820e.mo5930a(bArr, 1, i6 - 1, false);
        }
        this.f11337b = 0;
        return m5906a(bArr, this.f11338c, z2);
    }
}
