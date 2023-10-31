package com.google.android.exoplayer2.video;

import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.video.e */
/* loaded from: classes.dex */
public final class C7450e {

    /* renamed from: c */
    public boolean f14024c;

    /* renamed from: e */
    public int f14026e;

    /* renamed from: a */
    public C7451a f14022a = new C7451a();

    /* renamed from: b */
    public C7451a f14023b = new C7451a();

    /* renamed from: d */
    public long f14025d = -9223372036854775807L;

    /* renamed from: com.google.android.exoplayer2.video.e$a */
    /* loaded from: classes.dex */
    public static final class C7451a {

        /* renamed from: a */
        public long f14027a;

        /* renamed from: b */
        public long f14028b;

        /* renamed from: c */
        public long f14029c;

        /* renamed from: d */
        public long f14030d;

        /* renamed from: e */
        public long f14031e;

        /* renamed from: f */
        public long f14032f;

        /* renamed from: g */
        public final boolean[] f14033g = new boolean[15];

        /* renamed from: h */
        public int f14034h;

        /* renamed from: a */
        public final boolean m4971a() {
            return this.f14030d > 15 && this.f14034h == 0;
        }

        /* renamed from: b */
        public final void m4970b(long j) {
            int i;
            long j2 = this.f14030d;
            if (j2 == 0) {
                this.f14027a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f14027a;
                this.f14028b = j3;
                this.f14032f = j3;
                this.f14031e = 1L;
            } else {
                long j4 = j - this.f14029c;
                int i2 = (int) (j2 % 15);
                int i3 = (Math.abs(j4 - this.f14028b) > 1000000L ? 1 : (Math.abs(j4 - this.f14028b) == 1000000L ? 0 : -1));
                boolean[] zArr = this.f14033g;
                if (i3 <= 0) {
                    this.f14031e++;
                    this.f14032f += j4;
                    if (zArr[i2]) {
                        zArr[i2] = false;
                        i = this.f14034h - 1;
                        this.f14034h = i;
                    }
                } else if (!zArr[i2]) {
                    zArr[i2] = true;
                    i = this.f14034h + 1;
                    this.f14034h = i;
                }
            }
            this.f14030d++;
            this.f14029c = j;
        }

        /* renamed from: c */
        public final void m4969c() {
            this.f14030d = 0L;
            this.f14031e = 0L;
            this.f14032f = 0L;
            this.f14034h = 0;
            Arrays.fill(this.f14033g, false);
        }
    }

    /* renamed from: a */
    public final boolean m4972a() {
        return this.f14022a.m4971a();
    }
}
