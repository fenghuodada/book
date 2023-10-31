package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.a */
/* loaded from: classes.dex */
public abstract class AbstractC6810a {

    /* renamed from: a */
    public final C6811a f11071a;

    /* renamed from: b */
    public final InterfaceC6816f f11072b;
    @Nullable

    /* renamed from: c */
    public C6813c f11073c;

    /* renamed from: d */
    public final int f11074d;

    /* renamed from: com.google.android.exoplayer2.extractor.a$a */
    /* loaded from: classes.dex */
    public static class C6811a implements InterfaceC6905t {

        /* renamed from: a */
        public final InterfaceC6814d f11075a;

        /* renamed from: b */
        public final long f11076b;

        /* renamed from: c */
        public final long f11077c = 0;

        /* renamed from: d */
        public final long f11078d;

        /* renamed from: e */
        public final long f11079e;

        /* renamed from: f */
        public final long f11080f;

        /* renamed from: g */
        public final long f11081g;

        public C6811a(InterfaceC6814d interfaceC6814d, long j, long j2, long j3, long j4, long j5) {
            this.f11075a = interfaceC6814d;
            this.f11076b = j;
            this.f11078d = j2;
            this.f11079e = j3;
            this.f11080f = j4;
            this.f11081g = j5;
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
        /* renamed from: c */
        public final boolean mo5796c() {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
        /* renamed from: h */
        public final InterfaceC6905t.C6906a mo5795h(long j) {
            C6950u c6950u = new C6950u(j, C6813c.m5956a(this.f11075a.mo5943a(j), this.f11077c, this.f11078d, this.f11079e, this.f11080f, this.f11081g));
            return new InterfaceC6905t.C6906a(c6950u, c6950u);
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
        /* renamed from: i */
        public final long mo5794i() {
            return this.f11076b;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.a$b */
    /* loaded from: classes.dex */
    public static final class C6812b implements InterfaceC6814d {
        @Override // com.google.android.exoplayer2.extractor.AbstractC6810a.InterfaceC6814d
        /* renamed from: a */
        public final long mo5943a(long j) {
            return j;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.a$c */
    /* loaded from: classes.dex */
    public static class C6813c {

        /* renamed from: a */
        public final long f11082a;

        /* renamed from: b */
        public final long f11083b;

        /* renamed from: c */
        public final long f11084c;

        /* renamed from: d */
        public long f11085d;

        /* renamed from: e */
        public long f11086e;

        /* renamed from: f */
        public long f11087f;

        /* renamed from: g */
        public long f11088g;

        /* renamed from: h */
        public long f11089h;

        public C6813c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f11082a = j;
            this.f11083b = j2;
            this.f11085d = j3;
            this.f11086e = j4;
            this.f11087f = j5;
            this.f11088g = j6;
            this.f11084c = j7;
            this.f11089h = m5956a(j2, j3, j4, j5, j6, j7);
        }

        /* renamed from: a */
        public static long m5956a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
            return C7408g0.m5098h(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.a$d */
    /* loaded from: classes.dex */
    public interface InterfaceC6814d {
        /* renamed from: a */
        long mo5943a(long j);
    }

    /* renamed from: com.google.android.exoplayer2.extractor.a$e */
    /* loaded from: classes.dex */
    public static final class C6815e {

        /* renamed from: d */
        public static final C6815e f11090d = new C6815e(-3, -9223372036854775807L, -1);

        /* renamed from: a */
        public final int f11091a;

        /* renamed from: b */
        public final long f11092b;

        /* renamed from: c */
        public final long f11093c;

        public C6815e(int i, long j, long j2) {
            this.f11091a = i;
            this.f11092b = j;
            this.f11093c = j2;
        }

        /* renamed from: a */
        public static C6815e m5955a(long j) {
            return new C6815e(0, -9223372036854775807L, j);
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.a$f */
    /* loaded from: classes.dex */
    public interface InterfaceC6816f {
        /* renamed from: a */
        C6815e mo5815a(C6820e c6820e, long j) throws IOException;

        /* renamed from: b */
        void mo5814b();
    }

    public AbstractC6810a(InterfaceC6814d interfaceC6814d, InterfaceC6816f interfaceC6816f, long j, long j2, long j3, long j4, long j5, int i) {
        this.f11072b = interfaceC6816f;
        this.f11074d = i;
        this.f11071a = new C6811a(interfaceC6814d, j, j2, j3, j4, j5);
    }

    /* renamed from: b */
    public static int m5958b(C6820e c6820e, long j, C6904s c6904s) {
        if (j == c6820e.f11126d) {
            return 0;
        }
        c6904s.f11618a = j;
        return 1;
    }

    /* renamed from: a */
    public final int m5959a(C6820e c6820e, C6904s c6904s) throws IOException {
        boolean z;
        while (true) {
            C6813c c6813c = this.f11073c;
            C7394a.m5130e(c6813c);
            long j = c6813c.f11087f;
            long j2 = c6813c.f11088g;
            long j3 = c6813c.f11089h;
            int i = ((j2 - j) > this.f11074d ? 1 : ((j2 - j) == this.f11074d ? 0 : -1));
            InterfaceC6816f interfaceC6816f = this.f11072b;
            if (i <= 0) {
                this.f11073c = null;
                interfaceC6816f.mo5814b();
                return m5958b(c6820e, j, c6904s);
            }
            long j4 = j3 - c6820e.f11126d;
            if (j4 >= 0 && j4 <= 262144) {
                c6820e.mo5924j((int) j4);
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return m5958b(c6820e, j3, c6904s);
            }
            c6820e.f11128f = 0;
            C6815e mo5815a = interfaceC6816f.mo5815a(c6820e, c6813c.f11083b);
            int i2 = mo5815a.f11091a;
            if (i2 != -3) {
                long j5 = mo5815a.f11092b;
                long j6 = mo5815a.f11093c;
                if (i2 != -2) {
                    if (i2 != -1) {
                        if (i2 == 0) {
                            long j7 = j6 - c6820e.f11126d;
                            if (j7 >= 0 && j7 <= 262144) {
                                c6820e.mo5924j((int) j7);
                            }
                            this.f11073c = null;
                            interfaceC6816f.mo5814b();
                            return m5958b(c6820e, j6, c6904s);
                        }
                        throw new IllegalStateException("Invalid case");
                    }
                    c6813c.f11086e = j5;
                    c6813c.f11088g = j6;
                    c6813c.f11089h = C6813c.m5956a(c6813c.f11083b, c6813c.f11085d, j5, c6813c.f11087f, j6, c6813c.f11084c);
                } else {
                    c6813c.f11085d = j5;
                    c6813c.f11087f = j6;
                    c6813c.f11089h = C6813c.m5956a(c6813c.f11083b, j5, c6813c.f11086e, j6, c6813c.f11088g, c6813c.f11084c);
                }
            } else {
                this.f11073c = null;
                interfaceC6816f.mo5814b();
                return m5958b(c6820e, j3, c6904s);
            }
        }
    }

    /* renamed from: c */
    public final void m5957c(long j) {
        C6813c c6813c = this.f11073c;
        if (c6813c != null && c6813c.f11082a == j) {
            return;
        }
        C6811a c6811a = this.f11071a;
        this.f11073c = new C6813c(j, c6811a.f11075a.mo5943a(j), c6811a.f11077c, c6811a.f11078d, c6811a.f11079e, c6811a.f11080f, c6811a.f11081g);
    }
}
