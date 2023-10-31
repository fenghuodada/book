package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.extractor.C6835j;
import com.google.android.exoplayer2.extractor.mp4.AbstractC6865a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7424q;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.b */
/* loaded from: classes.dex */
public final class C6868b {

    /* renamed from: a */
    public static final byte[] f11468a = C7408g0.m5088r("OpusHead");

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.b$a */
    /* loaded from: classes.dex */
    public static final class C6869a {

        /* renamed from: a */
        public final int f11469a;

        /* renamed from: b */
        public int f11470b;

        /* renamed from: c */
        public int f11471c;

        /* renamed from: d */
        public long f11472d;

        /* renamed from: e */
        public final boolean f11473e;

        /* renamed from: f */
        public final C7436v f11474f;

        /* renamed from: g */
        public final C7436v f11475g;

        /* renamed from: h */
        public int f11476h;

        /* renamed from: i */
        public int f11477i;

        public C6869a(C7436v c7436v, C7436v c7436v2, boolean z) throws C7506y0 {
            this.f11475g = c7436v;
            this.f11474f = c7436v2;
            this.f11473e = z;
            c7436v2.m4992z(12);
            this.f11469a = c7436v2.m4999s();
            c7436v.m4992z(12);
            this.f11477i = c7436v.m4999s();
            C6835j.m5934a("first_chunk must be 1", c7436v.m5015c() == 1);
            this.f11470b = -1;
        }

        /* renamed from: a */
        public final boolean m5880a() {
            int i = this.f11470b + 1;
            this.f11470b = i;
            if (i == this.f11469a) {
                return false;
            }
            boolean z = this.f11473e;
            C7436v c7436v = this.f11474f;
            this.f11472d = z ? c7436v.m4998t() : c7436v.m5001q();
            if (this.f11470b == this.f11476h) {
                C7436v c7436v2 = this.f11475g;
                this.f11471c = c7436v2.m4999s();
                c7436v2.m5018A(4);
                int i2 = this.f11477i - 1;
                this.f11477i = i2;
                this.f11476h = i2 > 0 ? c7436v2.m4999s() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC6870b {
        /* renamed from: a */
        int mo5879a();

        /* renamed from: b */
        int mo5878b();

        /* renamed from: c */
        int mo5877c();
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.b$c */
    /* loaded from: classes.dex */
    public static final class C6871c implements InterfaceC6870b {

        /* renamed from: a */
        public final int f11478a;

        /* renamed from: b */
        public final int f11479b;

        /* renamed from: c */
        public final C7436v f11480c;

        public C6871c(AbstractC6865a.C6867b c6867b, C7003m0 c7003m0) {
            C7436v c7436v = c6867b.f11467b;
            this.f11480c = c7436v;
            c7436v.m4992z(12);
            int m4999s = c7436v.m4999s();
            if ("audio/raw".equals(c7003m0.f12287l)) {
                int m5091o = C7408g0.m5091o(c7003m0.f12270A, c7003m0.f12300y);
                if (m4999s == 0 || m4999s % m5091o != 0) {
                    StringBuilder sb = new StringBuilder(88);
                    sb.append("Audio sample size mismatch. stsd sample size: ");
                    sb.append(m5091o);
                    sb.append(", stsz sample size: ");
                    sb.append(m4999s);
                    Log.w("AtomParsers", sb.toString());
                    m4999s = m5091o;
                }
            }
            this.f11478a = m4999s == 0 ? -1 : m4999s;
            this.f11479b = c7436v.m4999s();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.C6868b.InterfaceC6870b
        /* renamed from: a */
        public final int mo5879a() {
            return this.f11478a;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.C6868b.InterfaceC6870b
        /* renamed from: b */
        public final int mo5878b() {
            return this.f11479b;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.C6868b.InterfaceC6870b
        /* renamed from: c */
        public final int mo5877c() {
            int i = this.f11478a;
            return i == -1 ? this.f11480c.m4999s() : i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.b$d */
    /* loaded from: classes.dex */
    public static final class C6872d implements InterfaceC6870b {

        /* renamed from: a */
        public final C7436v f11481a;

        /* renamed from: b */
        public final int f11482b;

        /* renamed from: c */
        public final int f11483c;

        /* renamed from: d */
        public int f11484d;

        /* renamed from: e */
        public int f11485e;

        public C6872d(AbstractC6865a.C6867b c6867b) {
            C7436v c7436v = c6867b.f11467b;
            this.f11481a = c7436v;
            c7436v.m4992z(12);
            this.f11483c = c7436v.m4999s() & 255;
            this.f11482b = c7436v.m4999s();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.C6868b.InterfaceC6870b
        /* renamed from: a */
        public final int mo5879a() {
            return -1;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.C6868b.InterfaceC6870b
        /* renamed from: b */
        public final int mo5878b() {
            return this.f11482b;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.C6868b.InterfaceC6870b
        /* renamed from: c */
        public final int mo5877c() {
            C7436v c7436v = this.f11481a;
            int i = this.f11483c;
            if (i == 8) {
                return c7436v.m5002p();
            }
            if (i == 16) {
                return c7436v.m4997u();
            }
            int i2 = this.f11484d;
            this.f11484d = i2 + 1;
            if (i2 % 2 == 0) {
                int m5002p = c7436v.m5002p();
                this.f11485e = m5002p;
                return (m5002p & 240) >> 4;
            }
            return this.f11485e & 15;
        }
    }

    /* renamed from: a */
    public static Pair m5885a(int i, C7436v c7436v) {
        c7436v.m4992z(i + 8 + 4);
        c7436v.m5018A(1);
        m5884b(c7436v);
        c7436v.m5018A(2);
        int m5002p = c7436v.m5002p();
        if ((m5002p & 128) != 0) {
            c7436v.m5018A(2);
        }
        if ((m5002p & 64) != 0) {
            c7436v.m5018A(c7436v.m4997u());
        }
        if ((m5002p & 32) != 0) {
            c7436v.m5018A(2);
        }
        c7436v.m5018A(1);
        m5884b(c7436v);
        String m5046d = C7424q.m5046d(c7436v.m5002p());
        if ("audio/mpeg".equals(m5046d) || "audio/vnd.dts".equals(m5046d) || "audio/vnd.dts.hd".equals(m5046d)) {
            return Pair.create(m5046d, null);
        }
        c7436v.m5018A(12);
        c7436v.m5018A(1);
        int m5884b = m5884b(c7436v);
        byte[] bArr = new byte[m5884b];
        c7436v.m5016b(0, bArr, m5884b);
        return Pair.create(m5046d, bArr);
    }

    /* renamed from: b */
    public static int m5884b(C7436v c7436v) {
        int m5002p = c7436v.m5002p();
        int i = m5002p & 127;
        while ((m5002p & 128) == 128) {
            m5002p = c7436v.m5002p();
            i = (i << 7) | (m5002p & 127);
        }
        return i;
    }

    @Nullable
    /* renamed from: c */
    public static Pair<Integer, C6881i> m5883c(C7436v c7436v, int i, int i2) throws C7506y0 {
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        C6881i c6881i;
        Pair<Integer, C6881i> create;
        int i3;
        int i4;
        boolean z4;
        byte[] bArr;
        int i5 = c7436v.f13979b;
        while (i5 - i < i2) {
            c7436v.m4992z(i5);
            int m5015c = c7436v.m5015c();
            boolean z5 = true;
            if (m5015c > 0) {
                z = true;
            } else {
                z = false;
            }
            C6835j.m5934a("childAtomSize must be positive", z);
            if (c7436v.m5015c() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < m5015c) {
                    c7436v.m4992z(i6);
                    int m5015c2 = c7436v.m5015c();
                    int m5015c3 = c7436v.m5015c();
                    if (m5015c3 == 1718775137) {
                        num2 = Integer.valueOf(c7436v.m5015c());
                    } else if (m5015c3 == 1935894637) {
                        c7436v.m5018A(4);
                        str = c7436v.m5005m(4);
                    } else if (m5015c3 == 1935894633) {
                        i8 = i6;
                        i7 = m5015c2;
                    }
                    i6 += m5015c2;
                }
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C6835j.m5934a("frma atom is mandatory", z2);
                    if (i8 != -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C6835j.m5934a("schi atom is mandatory", z3);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 < i7) {
                            c7436v.m4992z(i9);
                            int m5015c4 = c7436v.m5015c();
                            if (c7436v.m5015c() == 1952804451) {
                                int m5015c5 = (c7436v.m5015c() >> 24) & 255;
                                c7436v.m5018A(1);
                                if (m5015c5 == 0) {
                                    c7436v.m5018A(1);
                                    i3 = 0;
                                    i4 = 0;
                                } else {
                                    int m5002p = c7436v.m5002p();
                                    i3 = m5002p & 15;
                                    i4 = (m5002p & 240) >> 4;
                                }
                                if (c7436v.m5002p() == 1) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                int m5002p2 = c7436v.m5002p();
                                byte[] bArr2 = new byte[16];
                                c7436v.m5016b(0, bArr2, 16);
                                if (z4 && m5002p2 == 0) {
                                    int m5002p3 = c7436v.m5002p();
                                    byte[] bArr3 = new byte[m5002p3];
                                    c7436v.m5016b(0, bArr3, m5002p3);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                c6881i = new C6881i(z4, str, m5002p2, bArr2, i4, i3, bArr);
                            } else {
                                i9 += m5015c4;
                            }
                        } else {
                            num = num2;
                            c6881i = null;
                            break;
                        }
                    }
                    if (c6881i == null) {
                        z5 = false;
                    }
                    C6835j.m5934a("tenc atom is mandatory", z5);
                    int i10 = C7408g0.f13905a;
                    create = Pair.create(num, c6881i);
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += m5015c;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04ac  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.extractor.mp4.C6883k m5882d(com.google.android.exoplayer2.extractor.mp4.Track r41, com.google.android.exoplayer2.extractor.mp4.AbstractC6865a.C6866a r42, com.google.android.exoplayer2.extractor.C6901p r43) throws com.google.android.exoplayer2.C7506y0 {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.C6868b.m5882d(com.google.android.exoplayer2.extractor.mp4.Track, com.google.android.exoplayer2.extractor.mp4.a$a, com.google.android.exoplayer2.extractor.p):com.google.android.exoplayer2.extractor.mp4.k");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
        if (r12 == 0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:319:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0bd5  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0bd9  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList m5881e(com.google.android.exoplayer2.extractor.mp4.AbstractC6865a.C6866a r56, com.google.android.exoplayer2.extractor.C6901p r57, long r58, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.C6779g r60, boolean r61, boolean r62, com.google.common.base.InterfaceC7936e r63) throws com.google.android.exoplayer2.C7506y0 {
        /*
            Method dump skipped, instructions count: 3133
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.C6868b.m5881e(com.google.android.exoplayer2.extractor.mp4.a$a, com.google.android.exoplayer2.extractor.p, long, com.google.android.exoplayer2.drm.g, boolean, boolean, com.google.common.base.e):java.util.ArrayList");
    }
}
