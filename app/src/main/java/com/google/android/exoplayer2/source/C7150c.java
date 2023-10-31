package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C6966f1;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7121n0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.InterfaceC7185n;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.c */
/* loaded from: classes.dex */
public final class C7150c implements InterfaceC7185n, InterfaceC7185n.InterfaceC7186a {

    /* renamed from: a */
    public final InterfaceC7185n f12797a;
    @Nullable

    /* renamed from: b */
    public InterfaceC7185n.InterfaceC7186a f12798b;

    /* renamed from: c */
    public C7151a[] f12799c = new C7151a[0];

    /* renamed from: d */
    public long f12800d = 0;

    /* renamed from: e */
    public long f12801e = 0;

    /* renamed from: f */
    public long f12802f;

    /* renamed from: com.google.android.exoplayer2.source.c$a */
    /* loaded from: classes.dex */
    public final class C7151a implements SampleStream {

        /* renamed from: a */
        public final SampleStream f12803a;

        /* renamed from: b */
        public boolean f12804b;

        public C7151a(SampleStream sampleStream) {
            this.f12803a = sampleStream;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: a */
        public final int mo5436a(C7121n0 c7121n0, DecoderInputBuffer decoderInputBuffer, int i) {
            C7150c c7150c = C7150c.this;
            if (c7150c.m5466d()) {
                return -3;
            }
            if (this.f12804b) {
                decoderInputBuffer.f10915a = 4;
                return -4;
            }
            int mo5436a = this.f12803a.mo5436a(c7121n0, decoderInputBuffer, i);
            if (mo5436a == -5) {
                C7003m0 c7003m0 = c7121n0.f12634b;
                c7003m0.getClass();
                int i2 = c7003m0.f12271B;
                int i3 = c7003m0.f12272C;
                if (i2 != 0 || i3 != 0) {
                    if (c7150c.f12801e != 0) {
                        i2 = 0;
                    }
                    if (c7150c.f12802f != Long.MIN_VALUE) {
                        i3 = 0;
                    }
                    C7003m0.C7005b m5616b = c7003m0.m5616b();
                    m5616b.f12302A = i2;
                    m5616b.f12303B = i3;
                    c7121n0.f12634b = m5616b.m5614a();
                }
                return -5;
            }
            long j = c7150c.f12802f;
            if (j != Long.MIN_VALUE && ((mo5436a == -4 && decoderInputBuffer.f10906e >= j) || (mo5436a == -3 && c7150c.mo5398q() == Long.MIN_VALUE && !decoderInputBuffer.f10905d))) {
                decoderInputBuffer.mo5603h();
                decoderInputBuffer.f10915a = 4;
                this.f12804b = true;
                return -4;
            }
            return mo5436a;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: b */
        public final void mo5435b() throws IOException {
            this.f12803a.mo5435b();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: c */
        public final int mo5434c(long j) {
            if (C7150c.this.m5466d()) {
                return -3;
            }
            return this.f12803a.mo5434c(j);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: d */
        public final boolean mo5433d() {
            return !C7150c.this.m5466d() && this.f12803a.mo5433d();
        }
    }

    public C7150c(C7177k c7177k, long j) {
        this.f12797a = c7177k;
        this.f12802f = j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7164f0.InterfaceC7165a
    /* renamed from: a */
    public final void mo5420a(InterfaceC7185n interfaceC7185n) {
        InterfaceC7185n.InterfaceC7186a interfaceC7186a = this.f12798b;
        interfaceC7186a.getClass();
        interfaceC7186a.mo5420a(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n.InterfaceC7186a
    /* renamed from: b */
    public final void mo5395b(InterfaceC7185n interfaceC7185n) {
        InterfaceC7185n.InterfaceC7186a interfaceC7186a = this.f12798b;
        interfaceC7186a.getClass();
        interfaceC7186a.mo5395b(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: c */
    public final long mo5408c() {
        long mo5408c = this.f12797a.mo5408c();
        if (mo5408c != Long.MIN_VALUE) {
            long j = this.f12802f;
            if (j == Long.MIN_VALUE || mo5408c < j) {
                return mo5408c;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: d */
    public final boolean m5466d() {
        return this.f12800d != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: e */
    public final void mo5407e() throws IOException {
        this.f12797a.mo5407e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0 > r6) goto L18;
     */
    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo5406f(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f12800d = r0
            com.google.android.exoplayer2.source.c$a[] r0 = r5.f12799c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f12804b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            com.google.android.exoplayer2.source.n r0 = r5.f12797a
            long r0 = r0.mo5406f(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f12801e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f12802f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            com.google.android.exoplayer2.util.C7394a.m5131d(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C7150c.mo5406f(long):long");
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: g */
    public final boolean mo5405g(long j) {
        return this.f12797a.mo5405g(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: h */
    public final boolean mo5404h() {
        return this.f12797a.mo5404h();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: i */
    public final long mo5403i(long j, C6966f1 c6966f1) {
        long j2;
        long j3 = this.f12801e;
        if (j == j3) {
            return j3;
        }
        long m5098h = C7408g0.m5098h(c6966f1.f12032a, 0L, j - j3);
        long j4 = c6966f1.f12033b;
        long j5 = this.f12802f;
        if (j5 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j5 - j;
        }
        long m5098h2 = C7408g0.m5098h(j4, 0L, j2);
        if (m5098h != c6966f1.f12032a || m5098h2 != c6966f1.f12033b) {
            c6966f1 = new C6966f1(m5098h, m5098h2);
        }
        return this.f12797a.mo5403i(j, c6966f1);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: k */
    public final long mo5402k() {
        if (m5466d()) {
            long j = this.f12800d;
            this.f12800d = -9223372036854775807L;
            long mo5402k = mo5402k();
            return mo5402k != -9223372036854775807L ? mo5402k : j;
        }
        long mo5402k2 = this.f12797a.mo5402k();
        if (mo5402k2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C7394a.m5131d(mo5402k2 >= this.f12801e);
        long j2 = this.f12802f;
        if (j2 != Long.MIN_VALUE && mo5402k2 > j2) {
            z = false;
        }
        C7394a.m5131d(z);
        return mo5402k2;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: l */
    public final void mo5401l(InterfaceC7185n.InterfaceC7186a interfaceC7186a, long j) {
        this.f12798b = interfaceC7186a;
        this.f12797a.mo5401l(this, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r1 > r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo5400m(com.google.android.exoplayer2.trackselection.InterfaceC7296g[] r16, boolean[] r17, com.google.android.exoplayer2.source.SampleStream[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            com.google.android.exoplayer2.source.c$a[] r1 = new com.google.android.exoplayer2.source.C7150c.C7151a[r1]
            r0.f12799c = r1
            int r1 = r9.length
            com.google.android.exoplayer2.source.SampleStream[] r10 = new com.google.android.exoplayer2.source.SampleStream[r1]
            r11 = 0
            r1 = r11
        Lf:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L24
            com.google.android.exoplayer2.source.c$a[] r2 = r0.f12799c
            r3 = r9[r1]
            com.google.android.exoplayer2.source.c$a r3 = (com.google.android.exoplayer2.source.C7150c.C7151a) r3
            r2[r1] = r3
            if (r3 == 0) goto L1f
            com.google.android.exoplayer2.source.SampleStream r12 = r3.f12803a
        L1f:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Lf
        L24:
            com.google.android.exoplayer2.source.n r1 = r0.f12797a
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.mo5400m(r2, r3, r4, r5, r6)
            boolean r3 = r15.m5466d()
            r4 = 1
            if (r3 == 0) goto L66
            long r5 = r0.f12801e
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L66
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L61
            int r3 = r8.length
            r5 = r11
        L48:
            if (r5 >= r3) goto L61
            r6 = r8[r5]
            if (r6 == 0) goto L5e
            com.google.android.exoplayer2.m0 r6 = r6.mo5264i()
            java.lang.String r7 = r6.f12287l
            java.lang.String r6 = r6.f12284i
            boolean r6 = com.google.android.exoplayer2.util.C7424q.m5049a(r7, r6)
            if (r6 != 0) goto L5e
            r3 = r4
            goto L62
        L5e:
            int r5 = r5 + 1
            goto L48
        L61:
            r3 = r11
        L62:
            if (r3 == 0) goto L66
            r5 = r1
            goto L6b
        L66:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6b:
            r0.f12800d = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L85
            long r5 = r0.f12801e
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L84
            long r5 = r0.f12802f
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L85
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L84
            goto L85
        L84:
            r4 = r11
        L85:
            com.google.android.exoplayer2.util.C7394a.m5131d(r4)
        L88:
            int r3 = r9.length
            if (r11 >= r3) goto Lae
            r3 = r10[r11]
            if (r3 != 0) goto L94
            com.google.android.exoplayer2.source.c$a[] r3 = r0.f12799c
            r3[r11] = r12
            goto La5
        L94:
            com.google.android.exoplayer2.source.c$a[] r4 = r0.f12799c
            r5 = r4[r11]
            if (r5 == 0) goto L9e
            com.google.android.exoplayer2.source.SampleStream r5 = r5.f12803a
            if (r5 == r3) goto La5
        L9e:
            com.google.android.exoplayer2.source.c$a r5 = new com.google.android.exoplayer2.source.c$a
            r5.<init>(r3)
            r4[r11] = r5
        La5:
            com.google.android.exoplayer2.source.c$a[] r3 = r0.f12799c
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L88
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C7150c.mo5400m(com.google.android.exoplayer2.trackselection.g[], boolean[], com.google.android.exoplayer2.source.SampleStream[], boolean[], long):long");
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: n */
    public final C7178k0 mo5399n() {
        return this.f12797a.mo5399n();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: q */
    public final long mo5398q() {
        long mo5398q = this.f12797a.mo5398q();
        if (mo5398q != Long.MIN_VALUE) {
            long j = this.f12802f;
            if (j == Long.MIN_VALUE || mo5398q < j) {
                return mo5398q;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: r */
    public final void mo5397r(long j, boolean z) {
        this.f12797a.mo5397r(j, z);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: s */
    public final void mo5396s(long j) {
        this.f12797a.mo5396s(j);
    }
}
