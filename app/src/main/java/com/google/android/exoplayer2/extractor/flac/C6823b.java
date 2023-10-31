package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.AbstractC6810a;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.C6844l;
import com.google.android.exoplayer2.extractor.C6885o;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.flac.b */
/* loaded from: classes.dex */
public final class C6823b extends AbstractC6810a {

    /* renamed from: com.google.android.exoplayer2.extractor.flac.b$a */
    /* loaded from: classes.dex */
    public static final class C6824a implements AbstractC6810a.InterfaceC6816f {

        /* renamed from: a */
        public final C6885o f11147a;

        /* renamed from: b */
        public final int f11148b;

        /* renamed from: c */
        public final C6844l.C6845a f11149c = new C6844l.C6845a();

        public C6824a(C6885o c6885o, int i) {
            this.f11147a = c6885o;
            this.f11148b = i;
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC6810a.InterfaceC6816f
        /* renamed from: a */
        public final AbstractC6810a.C6815e mo5815a(C6820e c6820e, long j) throws IOException {
            long j2 = c6820e.f11126d;
            long m5942c = m5942c(c6820e);
            long mo5927e = c6820e.mo5927e();
            c6820e.m5950l(Math.max(6, this.f11147a.f11538c), false);
            long m5942c2 = m5942c(c6820e);
            long mo5927e2 = c6820e.mo5927e();
            if (m5942c <= j && m5942c2 > j) {
                return AbstractC6810a.C6815e.m5955a(mo5927e);
            }
            if (m5942c2 <= j) {
                return new AbstractC6810a.C6815e(-2, m5942c2, mo5927e2);
            }
            return new AbstractC6810a.C6815e(-1, m5942c, j2);
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC6810a.InterfaceC6816f
        /* renamed from: b */
        public final /* synthetic */ void mo5814b() {
        }

        /* renamed from: c */
        public final long m5942c(C6820e c6820e) throws IOException {
            long j;
            C6844l.C6845a c6845a;
            C6885o c6885o;
            boolean m5921a;
            int m5948n;
            while (true) {
                long mo5927e = c6820e.mo5927e();
                j = c6820e.f11125c;
                int i = (mo5927e > (j - 6) ? 1 : (mo5927e == (j - 6) ? 0 : -1));
                c6845a = this.f11149c;
                c6885o = this.f11147a;
                if (i >= 0) {
                    break;
                }
                long mo5927e2 = c6820e.mo5927e();
                byte[] bArr = new byte[2];
                c6820e.mo5928d(bArr, 0, 2, false);
                int i2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                int i3 = this.f11148b;
                if (i2 != i3) {
                    c6820e.f11128f = 0;
                    c6820e.m5950l((int) (mo5927e2 - c6820e.f11126d), false);
                    m5921a = false;
                } else {
                    C7436v c7436v = new C7436v(16);
                    System.arraycopy(bArr, 0, c7436v.f13978a, 0, 2);
                    byte[] bArr2 = c7436v.f13978a;
                    int i4 = 0;
                    for (int i5 = 2; i4 < 14 && (m5948n = c6820e.m5948n(i5 + i4, bArr2, 14 - i4)) != -1; i5 = 2) {
                        i4 += m5948n;
                    }
                    c7436v.m4993y(i4);
                    c6820e.f11128f = 0;
                    c6820e.m5950l((int) (mo5927e2 - c6820e.f11126d), false);
                    m5921a = C6844l.m5921a(c7436v, c6885o, i3, c6845a);
                }
                if (m5921a) {
                    break;
                }
                c6820e.m5950l(1, false);
            }
            if (c6820e.mo5927e() >= j - 6) {
                c6820e.m5950l((int) (j - c6820e.mo5927e()), false);
                return c6885o.f11545j;
            }
            return c6845a.f11206a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6823b(com.google.android.exoplayer2.extractor.C6885o r15, int r16, long r17, long r19) {
        /*
            r14 = this;
            r0 = r15
            java.util.Objects.requireNonNull(r15)
            com.google.android.exoplayer2.extractor.flac.a r1 = new com.google.android.exoplayer2.extractor.flac.a
            r1.<init>(r15)
            com.google.android.exoplayer2.extractor.flac.b$a r2 = new com.google.android.exoplayer2.extractor.flac.b$a
            r3 = r16
            r2.<init>(r15, r3)
            long r3 = r15.m5865c()
            long r5 = r0.f11545j
            int r7 = r0.f11538c
            int r8 = r0.f11539d
            if (r8 <= 0) goto L25
            long r8 = (long) r8
            long r10 = (long) r7
            long r8 = r8 + r10
            r10 = 2
            long r8 = r8 / r10
            r10 = 1
            goto L3e
        L25:
            int r8 = r0.f11537b
            int r9 = r0.f11536a
            if (r9 != r8) goto L2f
            if (r9 <= 0) goto L2f
            long r8 = (long) r9
            goto L31
        L2f:
            r8 = 4096(0x1000, double:2.0237E-320)
        L31:
            int r10 = r0.f11542g
            long r10 = (long) r10
            long r8 = r8 * r10
            int r0 = r0.f11543h
            long r10 = (long) r0
            long r8 = r8 * r10
            r10 = 8
            long r8 = r8 / r10
            r10 = 64
        L3e:
            long r11 = r8 + r10
            r0 = 6
            int r13 = java.lang.Math.max(r0, r7)
            r0 = r14
            r7 = r17
            r9 = r19
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.flac.C6823b.<init>(com.google.android.exoplayer2.extractor.o, int, long, long):void");
    }
}
