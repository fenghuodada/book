package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.C6950u;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp4.AbstractC6865a;
import com.google.android.exoplayer2.metadata.mp4.C7096b;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7427r;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Mp4Extractor implements Extractor, InterfaceC6905t {

    /* renamed from: a */
    public final int f11424a;

    /* renamed from: b */
    public final C7436v f11425b;

    /* renamed from: c */
    public final C7436v f11426c;

    /* renamed from: d */
    public final C7436v f11427d;

    /* renamed from: e */
    public final C7436v f11428e;

    /* renamed from: f */
    public final ArrayDeque<AbstractC6865a.C6866a> f11429f;

    /* renamed from: g */
    public final C6878g f11430g;

    /* renamed from: h */
    public final ArrayList f11431h;

    /* renamed from: i */
    public int f11432i;

    /* renamed from: j */
    public int f11433j;

    /* renamed from: k */
    public long f11434k;

    /* renamed from: l */
    public int f11435l;
    @Nullable

    /* renamed from: m */
    public C7436v f11436m;

    /* renamed from: n */
    public int f11437n;

    /* renamed from: o */
    public int f11438o;

    /* renamed from: p */
    public int f11439p;

    /* renamed from: q */
    public int f11440q;

    /* renamed from: r */
    public InterfaceC6833i f11441r;

    /* renamed from: s */
    public C6864a[] f11442s;

    /* renamed from: t */
    public long[][] f11443t;

    /* renamed from: u */
    public int f11444u;

    /* renamed from: v */
    public long f11445v;

    /* renamed from: w */
    public int f11446w;
    @Nullable

    /* renamed from: x */
    public C7096b f11447x;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$a */
    /* loaded from: classes.dex */
    public static final class C6864a {

        /* renamed from: a */
        public final Track f11448a;

        /* renamed from: b */
        public final C6883k f11449b;

        /* renamed from: c */
        public final TrackOutput f11450c;

        /* renamed from: d */
        public int f11451d;

        public C6864a(Track track, C6883k c6883k, TrackOutput trackOutput) {
            this.f11448a = track;
            this.f11449b = c6883k;
            this.f11450c = trackOutput;
        }
    }

    public Mp4Extractor() {
        this(0);
    }

    public Mp4Extractor(int i) {
        this.f11424a = 0;
        this.f11432i = 0;
        this.f11430g = new C6878g();
        this.f11431h = new ArrayList();
        this.f11428e = new C7436v(16);
        this.f11429f = new ArrayDeque<>();
        this.f11425b = new C7436v(C7427r.f13945a);
        this.f11426c = new C7436v(4);
        this.f11427d = new C7436v();
        this.f11437n = -1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException {
        boolean z;
        if ((this.f11424a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return C6880h.m5869a(interfaceC6832h, false, z);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: c */
    public final boolean mo5796c() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0445 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x063e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0640 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo5806e(com.google.android.exoplayer2.extractor.InterfaceC6832h r40, com.google.android.exoplayer2.extractor.C6904s r41) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.Mp4Extractor.mo5806e(com.google.android.exoplayer2.extractor.h, com.google.android.exoplayer2.extractor.s):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: f */
    public final void mo5805f(InterfaceC6833i interfaceC6833i) {
        this.f11441r = interfaceC6833i;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public final void mo5804g(long j, long j2) {
        this.f11429f.clear();
        this.f11435l = 0;
        this.f11437n = -1;
        this.f11438o = 0;
        this.f11439p = 0;
        this.f11440q = 0;
        if (j == 0) {
            if (this.f11432i != 3) {
                this.f11432i = 0;
                this.f11435l = 0;
                return;
            }
            C6878g c6878g = this.f11430g;
            c6878g.f11497a.clear();
            c6878g.f11498b = 0;
            this.f11431h.clear();
            return;
        }
        C6864a[] c6864aArr = this.f11442s;
        if (c6864aArr != null) {
            for (C6864a c6864a : c6864aArr) {
                C6883k c6883k = c6864a.f11449b;
                int m5101e = C7408g0.m5101e(c6883k.f11531f, j2, false);
                while (true) {
                    if (m5101e >= 0) {
                        if ((c6883k.f11532g[m5101e] & 1) != 0) {
                            break;
                        }
                        m5101e--;
                    } else {
                        m5101e = -1;
                        break;
                    }
                }
                if (m5101e == -1) {
                    m5101e = c6883k.m5868a(j2);
                }
                c6864a.f11451d = m5101e;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: h */
    public final InterfaceC6905t.C6906a mo5795h(long j) {
        long j2;
        long j3;
        long j4;
        int i;
        boolean z;
        long j5;
        int m5868a;
        long j6 = j;
        C6864a[] c6864aArr = this.f11442s;
        c6864aArr.getClass();
        int length = c6864aArr.length;
        C6950u c6950u = C6950u.f11974c;
        if (length == 0) {
            return new InterfaceC6905t.C6906a(c6950u, c6950u);
        }
        int i2 = this.f11444u;
        boolean z2 = false;
        int i3 = -1;
        if (i2 != -1) {
            C6883k c6883k = this.f11442s[i2].f11449b;
            int m5101e = C7408g0.m5101e(c6883k.f11531f, j6, false);
            while (true) {
                if (m5101e >= 0) {
                    if ((c6883k.f11532g[m5101e] & 1) != 0) {
                        break;
                    }
                    m5101e--;
                } else {
                    m5101e = -1;
                    break;
                }
            }
            if (m5101e == -1) {
                m5101e = c6883k.m5868a(j6);
            }
            if (m5101e == -1) {
                return new InterfaceC6905t.C6906a(c6950u, c6950u);
            }
            long[] jArr = c6883k.f11531f;
            long j7 = jArr[m5101e];
            long[] jArr2 = c6883k.f11528c;
            j2 = jArr2[m5101e];
            if (j7 < j6 && m5101e < c6883k.f11527b - 1 && (m5868a = c6883k.m5868a(j6)) != -1 && m5868a != m5101e) {
                j5 = jArr[m5868a];
                j4 = jArr2[m5868a];
            } else {
                j5 = -9223372036854775807L;
                j4 = -1;
            }
            j3 = j5;
            j6 = j7;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
            j4 = -1;
        }
        int i4 = 0;
        long j8 = j2;
        while (true) {
            C6864a[] c6864aArr2 = this.f11442s;
            if (i4 >= c6864aArr2.length) {
                break;
            }
            if (i4 != this.f11444u) {
                C6883k c6883k2 = c6864aArr2[i4].f11449b;
                int m5101e2 = C7408g0.m5101e(c6883k2.f11531f, j6, z2);
                while (true) {
                    if (m5101e2 >= 0) {
                        if ((c6883k2.f11532g[m5101e2] & 1) != 0) {
                            break;
                        }
                        m5101e2--;
                    } else {
                        m5101e2 = i3;
                        break;
                    }
                }
                if (m5101e2 == i3) {
                    m5101e2 = c6883k2.m5868a(j6);
                }
                if (m5101e2 != i3) {
                    j8 = Math.min(c6883k2.f11528c[m5101e2], j8);
                }
                if (j3 != -9223372036854775807L) {
                    z = false;
                    int m5101e3 = C7408g0.m5101e(c6883k2.f11531f, j3, false);
                    while (true) {
                        if (m5101e3 >= 0) {
                            if ((c6883k2.f11532g[m5101e3] & 1) != 0) {
                                break;
                            }
                            m5101e3--;
                        } else {
                            m5101e3 = -1;
                            break;
                        }
                    }
                    i = -1;
                    if (m5101e3 == -1) {
                        m5101e3 = c6883k2.m5868a(j3);
                    }
                    if (m5101e3 != -1) {
                        j4 = Math.min(c6883k2.f11528c[m5101e3], j4);
                    }
                } else {
                    z = false;
                    i = -1;
                }
            } else {
                i = i3;
                z = z2;
            }
            i4++;
            z2 = z;
            i3 = i;
        }
        C6950u c6950u2 = new C6950u(j6, j8);
        if (j3 == -9223372036854775807L) {
            return new InterfaceC6905t.C6906a(c6950u2, c6950u2);
        }
        return new InterfaceC6905t.C6906a(c6950u2, new C6950u(j3, j4));
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: i */
    public final long mo5794i() {
        return this.f11445v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01dd, code lost:
        if (r6 != 1885823344) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01df, code lost:
        r7 = com.google.android.exoplayer2.extractor.mp4.C6875e.m5873d(r6, "ITUNESGAPLESS", r4, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e7, code lost:
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ee, code lost:
        if (r6 != 1936683886) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f0, code lost:
        r0 = "TVSHOWSORT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f6, code lost:
        if (r6 != 1953919848) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f8, code lost:
        r0 = "TVSHOW";
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01fe, code lost:
        if (r6 != 757935405) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0200, code lost:
        r7 = -1;
        r6 = -1;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0205, code lost:
        r10 = r4.f13979b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0207, code lost:
        if (r10 >= r8) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0209, code lost:
        r12 = r4.m5015c();
        r10 = r4.m5015c();
        r20 = r9;
        r4.m5018A(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x021c, code lost:
        if (r10 != 1835360622) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021e, code lost:
        r0 = r4.m5006l(r12 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0228, code lost:
        if (r10 != 1851878757) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x022a, code lost:
        r2 = r4.m5006l(r12 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0234, code lost:
        if (r10 != 1684108385) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0236, code lost:
        r7 = r12;
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0239, code lost:
        r4.m5018A(r12 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x023e, code lost:
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0241, code lost:
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0243, code lost:
        if (r0 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0245, code lost:
        if (r2 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0248, code lost:
        if (r6 != (-1)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024c, code lost:
        r4.m4992z(r6);
        r4.m5018A(16);
        r7 = new com.google.android.exoplayer2.metadata.id3.C7084i(r0, r2, r4.m5006l(r7 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0261, code lost:
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0265, code lost:
        r18 = r2;
        r20 = r9;
        r2 = 16777215 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0270, code lost:
        if (r2 != 6516084) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0272, code lost:
        r7 = com.google.android.exoplayer2.extractor.mp4.C6875e.m5876a(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0278, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x027e, code lost:
        if (r2 == 7233901) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0283, code lost:
        if (r2 != 7631467) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x028a, code lost:
        if (r2 == 6516589) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x028f, code lost:
        if (r2 != 7828084) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0295, code lost:
        if (r2 != 6578553) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0297, code lost:
        r0 = "TDRC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x029d, code lost:
        if (r2 != 4280916) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x029f, code lost:
        r0 = "TPE1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02a5, code lost:
        if (r2 != 7630703) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02a7, code lost:
        r0 = "TSSE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02ad, code lost:
        if (r2 != 6384738) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02af, code lost:
        r0 = "TALB";
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02b5, code lost:
        if (r2 != 7108978) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02b7, code lost:
        r0 = "USLT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02bd, code lost:
        if (r2 != 6776174) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02bf, code lost:
        r7 = com.google.android.exoplayer2.extractor.mp4.C6875e.m5874c(r6, r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02c7, code lost:
        if (r2 != 6779504) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02c9, code lost:
        r0 = "TIT1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02cc, code lost:
        r2 = java.lang.String.valueOf(com.google.android.exoplayer2.extractor.mp4.AbstractC6865a.m5888a(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02da, code lost:
        if (r2.length() == 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02dc, code lost:
        r0 = "Skipped unknown metadata entry: ".concat(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e1, code lost:
        r0 = new java.lang.String("Skipped unknown metadata entry: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02e7, code lost:
        android.util.Log.d("MetadataUtil", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02ea, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02ec, code lost:
        r0 = "TCOM";
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02ef, code lost:
        r0 = "TIT2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02f5, code lost:
        if (r7 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02f7, code lost:
        r5.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02fa, code lost:
        r7 = r16;
        r0 = r17;
        r2 = r18;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0304, code lost:
        r4.m4992z(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0307, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0308, code lost:
        r17 = r0;
        r18 = r2;
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0312, code lost:
        if (r5.isEmpty() == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0315, code lost:
        r0 = new com.google.android.exoplayer2.metadata.C7042a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        r4.m4992z(r7);
        r7 = r7 + r8;
        r4.m5018A(r10);
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
        r6 = r4.f13979b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
        if (r6 >= r7) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
        r8 = r4.m5015c() + r6;
        r6 = r4.m5015c();
        r10 = (r6 >> 24) & 255;
        r16 = r7;
        r17 = r0;
        r0 = "TCON";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
        if (r10 == 169) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
        if (r10 != 253) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
        if (r6 != 1735291493) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
        r6 = com.google.android.exoplayer2.extractor.mp4.C6875e.m5872e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        if (r6 <= 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
        if (r6 > 192) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
        r6 = com.google.android.exoplayer2.extractor.mp4.C6875e.f11491a[r6 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
        if (r6 == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
        r7 = new com.google.android.exoplayer2.metadata.id3.C7090l("TCON", null, r6);
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
        android.util.Log.w("MetadataUtil", "Failed to parse standard genre code");
        r18 = r2;
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
        if (r6 != 1684632427) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f2, code lost:
        r0 = "TPOS";
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
        if (r6 != 1953655662) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fa, code lost:
        r0 = "TRCK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
        r7 = r4.m5015c();
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0109, code lost:
        if (r4.m5015c() != 1684108385) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010d, code lost:
        if (r7 < 22) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010f, code lost:
        r4.m5018A(10);
        r2 = r4.m4997u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
        if (r2 <= 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011a, code lost:
        r6 = new java.lang.StringBuilder(11);
        r6.append(r2);
        r2 = r6.toString();
        r6 = r4.m4997u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012c, code lost:
        if (r6 <= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012e, code lost:
        r2 = java.lang.String.valueOf(r2);
        r10 = new java.lang.StringBuilder(r2.length() + 12);
        r10.append(r2);
        r10.append(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING);
        r10.append(r6);
        r2 = r10.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014c, code lost:
        r7 = new com.google.android.exoplayer2.metadata.id3.C7090l(r0, null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0155, code lost:
        r2 = java.lang.String.valueOf(com.google.android.exoplayer2.extractor.mp4.AbstractC6865a.m5888a(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0164, code lost:
        if (r2.length() == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0166, code lost:
        r2 = "Failed to parse index/count attribute: ".concat(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016b, code lost:
        r2 = new java.lang.String("Failed to parse index/count attribute: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
        android.util.Log.w("MetadataUtil", r2);
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0176, code lost:
        r18 = r2;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017c, code lost:
        if (r6 != 1953329263) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017e, code lost:
        r7 = com.google.android.exoplayer2.extractor.mp4.C6875e.m5873d(r6, "TBPM", r4, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018a, code lost:
        if (r6 != 1668311404) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018c, code lost:
        r0 = "TCMP";
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0193, code lost:
        if (r6 != 1668249202) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0195, code lost:
        r7 = com.google.android.exoplayer2.extractor.mp4.C6875e.m5875b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019d, code lost:
        if (r6 != 1631670868) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019f, code lost:
        r0 = "TPE2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a1, code lost:
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a8, code lost:
        if (r6 != 1936682605) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01aa, code lost:
        r0 = "TSOT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b0, code lost:
        if (r6 != 1936679276) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b2, code lost:
        r0 = "TSO2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
        if (r6 != 1936679282) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ba, code lost:
        r0 = "TSOA";
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c0, code lost:
        if (r6 != 1936679265) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c2, code lost:
        r0 = "TSOP";
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c8, code lost:
        if (r6 != 1936679791) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ca, code lost:
        r0 = "TSOC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d0, code lost:
        if (r6 != 1920233063) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d2, code lost:
        r0 = "ITUNESADVISORY";
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d5, code lost:
        r7 = com.google.android.exoplayer2.extractor.mp4.C6875e.m5873d(r6, r0, r4, r2, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x060f A[LOOP:12: B:323:0x060c->B:325:0x060f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x062d  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5889j(long r26) throws com.google.android.exoplayer2.C7506y0 {
        /*
            Method dump skipped, instructions count: 1692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.Mp4Extractor.m5889j(long):void");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
