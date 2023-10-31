package com.google.android.exoplayer2.extractor.p037ts;

import com.google.android.exoplayer2.extractor.AbstractC6810a;
import com.google.android.exoplayer2.util.C7404e0;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.ts.s */
/* loaded from: classes.dex */
public final class C6939s extends AbstractC6810a {

    /* renamed from: com.google.android.exoplayer2.extractor.ts.s$a */
    /* loaded from: classes.dex */
    public static final class C6940a implements AbstractC6810a.InterfaceC6816f {

        /* renamed from: a */
        public final C7404e0 f11925a;

        /* renamed from: b */
        public final C7436v f11926b = new C7436v();

        public C6940a(C7404e0 c7404e0) {
            this.f11925a = c7404e0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
            return com.google.android.exoplayer2.extractor.AbstractC6810a.C6815e.m5955a(r5 + r1);
         */
        @Override // com.google.android.exoplayer2.extractor.AbstractC6810a.InterfaceC6816f
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.google.android.exoplayer2.extractor.AbstractC6810a.C6815e mo5815a(com.google.android.exoplayer2.extractor.C6820e r17, long r18) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 265
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p037ts.C6939s.C6940a.mo5815a(com.google.android.exoplayer2.extractor.e, long):com.google.android.exoplayer2.extractor.a$e");
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC6810a.InterfaceC6816f
        /* renamed from: b */
        public final void mo5814b() {
            byte[] bArr = C7408g0.f13910f;
            C7436v c7436v = this.f11926b;
            c7436v.getClass();
            c7436v.m4994x(bArr.length, bArr);
        }
    }

    public C6939s(C7404e0 c7404e0, long j, long j2) {
        super(new AbstractC6810a.C6812b(), new C6940a(c7404e0), j, j + 1, 0L, j2, 188L, 1000);
    }

    /* renamed from: d */
    public static int m5825d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
