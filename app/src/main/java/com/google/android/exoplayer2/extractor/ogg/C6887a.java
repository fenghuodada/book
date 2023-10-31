package com.google.android.exoplayer2.extractor.ogg;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.C6950u;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.extractor.ogg.a */
/* loaded from: classes.dex */
public final class C6887a implements InterfaceC6894f {

    /* renamed from: a */
    public final C6893e f11550a;

    /* renamed from: b */
    public final long f11551b;

    /* renamed from: c */
    public final long f11552c;

    /* renamed from: d */
    public final AbstractC6896h f11553d;

    /* renamed from: e */
    public int f11554e;

    /* renamed from: f */
    public long f11555f;

    /* renamed from: g */
    public long f11556g;

    /* renamed from: h */
    public long f11557h;

    /* renamed from: i */
    public long f11558i;

    /* renamed from: j */
    public long f11559j;

    /* renamed from: k */
    public long f11560k;

    /* renamed from: l */
    public long f11561l;

    /* renamed from: com.google.android.exoplayer2.extractor.ogg.a$a */
    /* loaded from: classes.dex */
    public final class C6888a implements InterfaceC6905t {
        public C6888a() {
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
        /* renamed from: c */
        public final boolean mo5796c() {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
        /* renamed from: h */
        public final InterfaceC6905t.C6906a mo5795h(long j) {
            C6887a c6887a = C6887a.this;
            long j2 = c6887a.f11551b;
            long j3 = c6887a.f11552c;
            C6950u c6950u = new C6950u(j, C7408g0.m5098h(((((j3 - j2) * ((c6887a.f11553d.f11594i * j) / 1000000)) / c6887a.f11555f) + j2) - 30000, j2, j3 - 1));
            return new InterfaceC6905t.C6906a(c6950u, c6950u);
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
        /* renamed from: i */
        public final long mo5794i() {
            C6887a c6887a = C6887a.this;
            return (c6887a.f11555f * 1000000) / c6887a.f11553d.f11594i;
        }
    }

    public C6887a(AbstractC6896h abstractC6896h, long j, long j2, long j3, long j4, boolean z) {
        C7394a.m5134a(j >= 0 && j2 > j);
        this.f11553d = abstractC6896h;
        this.f11551b = j;
        this.f11552c = j2;
        if (j3 == j2 - j || z) {
            this.f11555f = j4;
            this.f11554e = 4;
        } else {
            this.f11554e = 0;
        }
        this.f11550a = new C6893e();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    @Override // com.google.android.exoplayer2.extractor.ogg.InterfaceC6894f
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo5858a(com.google.android.exoplayer2.extractor.C6820e r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ogg.C6887a.mo5858a(com.google.android.exoplayer2.extractor.e):long");
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.InterfaceC6894f
    @Nullable
    /* renamed from: b */
    public final InterfaceC6905t mo5857b() {
        if (this.f11555f != 0) {
            return new C6888a();
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.InterfaceC6894f
    /* renamed from: c */
    public final void mo5856c(long j) {
        this.f11557h = C7408g0.m5098h(j, 0L, this.f11555f - 1);
        this.f11554e = 2;
        this.f11558i = this.f11551b;
        this.f11559j = this.f11552c;
        this.f11560k = 0L;
        this.f11561l = this.f11555f;
    }
}
