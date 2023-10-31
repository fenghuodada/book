package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;
import okhttp3.internal.http.StatusLine;

/* renamed from: com.google.android.exoplayer2.extractor.wav.a */
/* loaded from: classes.dex */
public final class C6956a implements Extractor {

    /* renamed from: a */
    public InterfaceC6833i f11990a;

    /* renamed from: b */
    public TrackOutput f11991b;

    /* renamed from: c */
    public InterfaceC6958b f11992c;

    /* renamed from: d */
    public int f11993d = -1;

    /* renamed from: e */
    public long f11994e = -1;

    /* renamed from: com.google.android.exoplayer2.extractor.wav.a$a */
    /* loaded from: classes.dex */
    public static final class C6957a implements InterfaceC6958b {

        /* renamed from: m */
        public static final int[] f11995m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        public static final int[] f11996n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        public final InterfaceC6833i f11997a;

        /* renamed from: b */
        public final TrackOutput f11998b;

        /* renamed from: c */
        public final C6960b f11999c;

        /* renamed from: d */
        public final int f12000d;

        /* renamed from: e */
        public final byte[] f12001e;

        /* renamed from: f */
        public final C7436v f12002f;

        /* renamed from: g */
        public final int f12003g;

        /* renamed from: h */
        public final C7003m0 f12004h;

        /* renamed from: i */
        public int f12005i;

        /* renamed from: j */
        public long f12006j;

        /* renamed from: k */
        public int f12007k;

        /* renamed from: l */
        public long f12008l;

        public C6957a(InterfaceC6833i interfaceC6833i, TrackOutput trackOutput, C6960b c6960b) throws C7506y0 {
            this.f11997a = interfaceC6833i;
            this.f11998b = trackOutput;
            this.f11999c = c6960b;
            int i = c6960b.f12019c;
            int max = Math.max(1, i / 10);
            this.f12003g = max;
            byte[] bArr = c6960b.f12022f;
            int length = bArr.length;
            byte b = bArr[0];
            byte b2 = bArr[1];
            int i2 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
            this.f12000d = i2;
            int i3 = c6960b.f12018b;
            int i4 = c6960b.f12020d;
            int i5 = (((i4 - (i3 * 4)) * 8) / (c6960b.f12021e * i3)) + 1;
            if (i2 == i5) {
                int i6 = C7408g0.f13905a;
                int i7 = ((max + i2) - 1) / i2;
                this.f12001e = new byte[i7 * i4];
                this.f12002f = new C7436v(i2 * 2 * i3 * i7);
                int i8 = ((i4 * i) * 8) / i2;
                C7003m0.C7005b c7005b = new C7003m0.C7005b();
                c7005b.f12316k = "audio/raw";
                c7005b.f12311f = i8;
                c7005b.f12312g = i8;
                c7005b.f12317l = max * 2 * i3;
                c7005b.f12329x = i3;
                c7005b.f12330y = i;
                c7005b.f12331z = 2;
                this.f12004h = new C7003m0(c7005b);
                return;
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(i5);
            sb.append("; got: ");
            sb.append(i2);
            throw C7506y0.m4869a(sb.toString(), null);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0166  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0049 -> B:12:0x004b). Please submit an issue!!! */
        @Override // com.google.android.exoplayer2.extractor.wav.C6956a.InterfaceC6958b
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean mo5802a(com.google.android.exoplayer2.extractor.C6820e r25, long r26) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 375
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.wav.C6956a.C6957a.mo5802a(com.google.android.exoplayer2.extractor.e, long):boolean");
        }

        @Override // com.google.android.exoplayer2.extractor.wav.C6956a.InterfaceC6958b
        /* renamed from: b */
        public final void mo5801b(long j) {
            this.f12005i = 0;
            this.f12006j = j;
            this.f12007k = 0;
            this.f12008l = 0L;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.C6956a.InterfaceC6958b
        /* renamed from: c */
        public final void mo5800c(int i, long j) {
            this.f11997a.mo5484a(new C6963d(this.f11999c, this.f12000d, i, j));
            this.f11998b.mo5451e(this.f12004h);
        }

        /* renamed from: d */
        public final void m5803d(int i) {
            long j = this.f12006j;
            long j2 = this.f12008l;
            C6960b c6960b = this.f11999c;
            long m5081y = j + C7408g0.m5081y(j2, 1000000L, c6960b.f12019c);
            int i2 = i * 2 * c6960b.f12018b;
            this.f11998b.mo5452d(m5081y, 1, i2, this.f12007k - i2, null);
            this.f12008l += i;
            this.f12007k -= i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.wav.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC6958b {
        /* renamed from: a */
        boolean mo5802a(C6820e c6820e, long j) throws IOException;

        /* renamed from: b */
        void mo5801b(long j);

        /* renamed from: c */
        void mo5800c(int i, long j) throws C7506y0;
    }

    /* renamed from: com.google.android.exoplayer2.extractor.wav.a$c */
    /* loaded from: classes.dex */
    public static final class C6959c implements InterfaceC6958b {

        /* renamed from: a */
        public final InterfaceC6833i f12009a;

        /* renamed from: b */
        public final TrackOutput f12010b;

        /* renamed from: c */
        public final C6960b f12011c;

        /* renamed from: d */
        public final C7003m0 f12012d;

        /* renamed from: e */
        public final int f12013e;

        /* renamed from: f */
        public long f12014f;

        /* renamed from: g */
        public int f12015g;

        /* renamed from: h */
        public long f12016h;

        public C6959c(InterfaceC6833i interfaceC6833i, TrackOutput trackOutput, C6960b c6960b, String str, int i) throws C7506y0 {
            this.f12009a = interfaceC6833i;
            this.f12010b = trackOutput;
            this.f12011c = c6960b;
            int i2 = c6960b.f12021e;
            int i3 = c6960b.f12018b;
            int i4 = (i2 * i3) / 8;
            int i5 = c6960b.f12020d;
            if (i5 == i4) {
                int i6 = c6960b.f12019c;
                int i7 = i6 * i4;
                int i8 = i7 * 8;
                int max = Math.max(i4, i7 / 10);
                this.f12013e = max;
                C7003m0.C7005b c7005b = new C7003m0.C7005b();
                c7005b.f12316k = str;
                c7005b.f12311f = i8;
                c7005b.f12312g = i8;
                c7005b.f12317l = max;
                c7005b.f12329x = i3;
                c7005b.f12330y = i6;
                c7005b.f12331z = i;
                this.f12012d = new C7003m0(c7005b);
                return;
            }
            StringBuilder sb = new StringBuilder(50);
            sb.append("Expected block size: ");
            sb.append(i4);
            sb.append("; got: ");
            sb.append(i5);
            throw C7506y0.m4869a(sb.toString(), null);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.C6956a.InterfaceC6958b
        /* renamed from: a */
        public final boolean mo5802a(C6820e c6820e, long j) throws IOException {
            int i;
            C6960b c6960b;
            int i2;
            int i3;
            long j2 = j;
            while (true) {
                i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (i <= 0 || (i2 = this.f12015g) >= (i3 = this.f12013e)) {
                    break;
                }
                int mo5455a = this.f12010b.mo5455a(c6820e, (int) Math.min(i3 - i2, j2), true);
                if (mo5455a == -1) {
                    j2 = 0;
                } else {
                    this.f12015g += mo5455a;
                    j2 -= mo5455a;
                }
            }
            int i4 = this.f12011c.f12020d;
            int i5 = this.f12015g / i4;
            if (i5 > 0) {
                int i6 = i5 * i4;
                int i7 = this.f12015g - i6;
                this.f12010b.mo5452d(this.f12014f + C7408g0.m5081y(this.f12016h, 1000000L, c6960b.f12019c), 1, i6, i7, null);
                this.f12016h += i5;
                this.f12015g = i7;
            }
            return i <= 0;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.C6956a.InterfaceC6958b
        /* renamed from: b */
        public final void mo5801b(long j) {
            this.f12014f = j;
            this.f12015g = 0;
            this.f12016h = 0L;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.C6956a.InterfaceC6958b
        /* renamed from: c */
        public final void mo5800c(int i, long j) {
            this.f12009a.mo5484a(new C6963d(this.f12011c, 1, i, j));
            this.f12010b.mo5451e(this.f12012d);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException {
        return C6961c.m5799a((C6820e) interfaceC6832h) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo5806e(com.google.android.exoplayer2.extractor.InterfaceC6832h r17, com.google.android.exoplayer2.extractor.C6904s r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.wav.C6956a.mo5806e(com.google.android.exoplayer2.extractor.h, com.google.android.exoplayer2.extractor.s):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: f */
    public final void mo5805f(InterfaceC6833i interfaceC6833i) {
        this.f11990a = interfaceC6833i;
        this.f11991b = interfaceC6833i.mo5482p(0, 1);
        interfaceC6833i.mo5483j();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public final void mo5804g(long j, long j2) {
        InterfaceC6958b interfaceC6958b = this.f11992c;
        if (interfaceC6958b != null) {
            interfaceC6958b.mo5801b(j2);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
