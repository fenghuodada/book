package com.google.android.exoplayer2.source;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.C6744c;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.C7159e0;
import com.google.android.exoplayer2.upstream.C7344a;
import com.google.android.exoplayer2.upstream.C7367l;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.source.d0 */
/* loaded from: classes.dex */
public final class C7154d0 {

    /* renamed from: a */
    public final C7367l f12809a;

    /* renamed from: b */
    public final int f12810b;

    /* renamed from: c */
    public final C7436v f12811c;

    /* renamed from: d */
    public C7155a f12812d;

    /* renamed from: e */
    public C7155a f12813e;

    /* renamed from: f */
    public C7155a f12814f;

    /* renamed from: g */
    public long f12815g;

    /* renamed from: com.google.android.exoplayer2.source.d0$a */
    /* loaded from: classes.dex */
    public static final class C7155a {

        /* renamed from: a */
        public final long f12816a;

        /* renamed from: b */
        public final long f12817b;

        /* renamed from: c */
        public boolean f12818c;
        @Nullable

        /* renamed from: d */
        public C7344a f12819d;
        @Nullable

        /* renamed from: e */
        public C7155a f12820e;

        public C7155a(long j, int i) {
            this.f12816a = j;
            this.f12817b = j + i;
        }
    }

    public C7154d0(C7367l c7367l) {
        this.f12809a = c7367l;
        int i = c7367l.f13778b;
        this.f12810b = i;
        this.f12811c = new C7436v(32);
        C7155a c7155a = new C7155a(0L, i);
        this.f12812d = c7155a;
        this.f12813e = c7155a;
        this.f12814f = c7155a;
    }

    /* renamed from: c */
    public static C7155a m5463c(C7155a c7155a, long j, ByteBuffer byteBuffer, int i) {
        while (j >= c7155a.f12817b) {
            c7155a = c7155a.f12820e;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (c7155a.f12817b - j));
            C7344a c7344a = c7155a.f12819d;
            byteBuffer.put(c7344a.f13722a, ((int) (j - c7155a.f12816a)) + c7344a.f13723b, min);
            i -= min;
            j += min;
            if (j == c7155a.f12817b) {
                c7155a = c7155a.f12820e;
            }
        }
        return c7155a;
    }

    /* renamed from: d */
    public static C7155a m5462d(C7155a c7155a, long j, byte[] bArr, int i) {
        while (j >= c7155a.f12817b) {
            c7155a = c7155a.f12820e;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (c7155a.f12817b - j));
            C7344a c7344a = c7155a.f12819d;
            System.arraycopy(c7344a.f13722a, ((int) (j - c7155a.f12816a)) + c7344a.f13723b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == c7155a.f12817b) {
                c7155a = c7155a.f12820e;
            }
        }
        return c7155a;
    }

    /* renamed from: e */
    public static C7155a m5461e(C7155a c7155a, DecoderInputBuffer decoderInputBuffer, C7159e0.C7160a c7160a, C7436v c7436v) {
        long j;
        ByteBuffer byteBuffer;
        boolean z;
        if (decoderInputBuffer.m6018f(1073741824)) {
            long j2 = c7160a.f12863b;
            int i = 1;
            c7436v.m4995w(1);
            C7155a m5462d = m5462d(c7155a, j2, c7436v.f13978a, 1);
            long j3 = j2 + 1;
            byte b = c7436v.f13978a[0];
            if ((b & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = b & Byte.MAX_VALUE;
            C6744c c6744c = decoderInputBuffer.f10903b;
            byte[] bArr = c6744c.f10916a;
            if (bArr == null) {
                c6744c.f10916a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c7155a = m5462d(m5462d, j3, c6744c.f10916a, i2);
            long j4 = j3 + i2;
            if (z) {
                c7436v.m4995w(2);
                c7155a = m5462d(c7155a, j4, c7436v.f13978a, 2);
                j4 += 2;
                i = c7436v.m4997u();
            }
            int[] iArr = c6744c.f10919d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = c6744c.f10920e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                c7436v.m4995w(i3);
                c7155a = m5462d(c7155a, j4, c7436v.f13978a, i3);
                j4 += i3;
                c7436v.m4992z(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = c7436v.m4997u();
                    iArr2[i4] = c7436v.m4999s();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c7160a.f12862a - ((int) (j4 - c7160a.f12863b));
            }
            TrackOutput.C6809a c6809a = c7160a.f12864c;
            int i5 = C7408g0.f13905a;
            byte[] bArr2 = c6809a.f11068b;
            byte[] bArr3 = c6744c.f10916a;
            c6744c.f10921f = i;
            c6744c.f10919d = iArr;
            c6744c.f10920e = iArr2;
            c6744c.f10917b = bArr2;
            c6744c.f10916a = bArr3;
            int i6 = c6809a.f11067a;
            c6744c.f10918c = i6;
            int i7 = c6809a.f11069c;
            c6744c.f10922g = i7;
            int i8 = c6809a.f11070d;
            c6744c.f10923h = i8;
            MediaCodec.CryptoInfo cryptoInfo = c6744c.f10924i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i6;
            if (C7408g0.f13905a >= 24) {
                C6744c.C6745a c6745a = c6744c.f10925j;
                c6745a.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = c6745a.f10927b;
                pattern.set(i7, i8);
                c6745a.f10926a.setPattern(pattern);
            }
            long j5 = c7160a.f12863b;
            int i9 = (int) (j4 - j5);
            c7160a.f12863b = j5 + i9;
            c7160a.f12862a -= i9;
        }
        if (decoderInputBuffer.m6018f(268435456)) {
            c7436v.m4995w(4);
            C7155a m5462d2 = m5462d(c7155a, c7160a.f12863b, c7436v.f13978a, 4);
            int m4999s = c7436v.m4999s();
            c7160a.f12863b += 4;
            c7160a.f12862a -= 4;
            decoderInputBuffer.m6020j(m4999s);
            c7155a = m5463c(m5462d2, c7160a.f12863b, decoderInputBuffer.f10904c, m4999s);
            c7160a.f12863b += m4999s;
            int i10 = c7160a.f12862a - m4999s;
            c7160a.f12862a = i10;
            ByteBuffer byteBuffer2 = decoderInputBuffer.f10907f;
            if (byteBuffer2 != null && byteBuffer2.capacity() >= i10) {
                decoderInputBuffer.f10907f.clear();
            } else {
                decoderInputBuffer.f10907f = ByteBuffer.allocate(i10);
            }
            j = c7160a.f12863b;
            byteBuffer = decoderInputBuffer.f10907f;
        } else {
            decoderInputBuffer.m6020j(c7160a.f12862a);
            j = c7160a.f12863b;
            byteBuffer = decoderInputBuffer.f10904c;
        }
        return m5463c(c7155a, j, byteBuffer, c7160a.f12862a);
    }

    /* renamed from: a */
    public final void m5465a(long j) {
        C7155a c7155a;
        if (j == -1) {
            return;
        }
        while (true) {
            c7155a = this.f12812d;
            if (j < c7155a.f12817b) {
                break;
            }
            C7367l c7367l = this.f12809a;
            C7344a c7344a = c7155a.f12819d;
            synchronized (c7367l) {
                C7344a[] c7344aArr = c7367l.f13779c;
                c7344aArr[0] = c7344a;
                c7367l.m5171a(c7344aArr);
            }
            C7155a c7155a2 = this.f12812d;
            c7155a2.f12819d = null;
            C7155a c7155a3 = c7155a2.f12820e;
            c7155a2.f12820e = null;
            this.f12812d = c7155a3;
        }
        if (this.f12813e.f12816a < c7155a.f12816a) {
            this.f12813e = c7155a;
        }
    }

    /* renamed from: b */
    public final int m5464b(int i) {
        C7344a c7344a;
        C7155a c7155a = this.f12814f;
        if (!c7155a.f12818c) {
            C7367l c7367l = this.f12809a;
            synchronized (c7367l) {
                c7367l.f13781e++;
                int i2 = c7367l.f13782f;
                if (i2 > 0) {
                    C7344a[] c7344aArr = c7367l.f13783g;
                    int i3 = i2 - 1;
                    c7367l.f13782f = i3;
                    c7344a = c7344aArr[i3];
                    c7344a.getClass();
                    c7367l.f13783g[c7367l.f13782f] = null;
                } else {
                    c7344a = new C7344a(new byte[c7367l.f13778b], 0);
                }
            }
            C7155a c7155a2 = new C7155a(this.f12814f.f12817b, this.f12810b);
            c7155a.f12819d = c7344a;
            c7155a.f12820e = c7155a2;
            c7155a.f12818c = true;
        }
        return Math.min(i, (int) (this.f12814f.f12817b - this.f12815g));
    }
}
