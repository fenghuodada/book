package com.google.android.exoplayer2.extractor.p037ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.util.C7404e0;
import com.google.android.exoplayer2.util.C7435u;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.ts.u */
/* loaded from: classes.dex */
public final class C6942u implements Extractor {

    /* renamed from: e */
    public boolean f11939e;

    /* renamed from: f */
    public boolean f11940f;

    /* renamed from: g */
    public boolean f11941g;

    /* renamed from: h */
    public long f11942h;
    @Nullable

    /* renamed from: i */
    public C6939s f11943i;

    /* renamed from: j */
    public InterfaceC6833i f11944j;

    /* renamed from: k */
    public boolean f11945k;

    /* renamed from: a */
    public final C7404e0 f11935a = new C7404e0(0);

    /* renamed from: c */
    public final C7436v f11937c = new C7436v(4096);

    /* renamed from: b */
    public final SparseArray<C6943a> f11936b = new SparseArray<>();

    /* renamed from: d */
    public final C6941t f11938d = new C6941t();

    /* renamed from: com.google.android.exoplayer2.extractor.ts.u$a */
    /* loaded from: classes.dex */
    public static final class C6943a {

        /* renamed from: a */
        public final InterfaceC6922h f11946a;

        /* renamed from: b */
        public final C7404e0 f11947b;

        /* renamed from: c */
        public final C7435u f11948c = new C7435u(new byte[64], 64);

        /* renamed from: d */
        public boolean f11949d;

        /* renamed from: e */
        public boolean f11950e;

        /* renamed from: f */
        public boolean f11951f;

        /* renamed from: g */
        public long f11952g;

        public C6943a(InterfaceC6922h interfaceC6922h, C7404e0 c7404e0) {
            this.f11946a = interfaceC6922h;
            this.f11947b = c7404e0;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException {
        byte[] bArr = new byte[14];
        C6820e c6820e = (C6820e) interfaceC6832h;
        c6820e.mo5928d(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c6820e.m5950l(bArr[13] & 7, false);
        c6820e.mo5928d(bArr, 0, 3, false);
        if (1 != (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01ee  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo5806e(com.google.android.exoplayer2.extractor.InterfaceC6832h r19, com.google.android.exoplayer2.extractor.C6904s r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p037ts.C6942u.mo5806e(com.google.android.exoplayer2.extractor.h, com.google.android.exoplayer2.extractor.s):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: f */
    public final void mo5805f(InterfaceC6833i interfaceC6833i) {
        this.f11944j = interfaceC6833i;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public final void mo5804g(long j, long j2) {
        boolean z;
        C7404e0 c7404e0 = this.f11935a;
        boolean z2 = true;
        if (c7404e0.m5109d() == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long m5110c = c7404e0.m5110c();
            if (m5110c == -9223372036854775807L || m5110c == 0 || m5110c == j2) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            c7404e0.m5108e(j2);
        }
        C6939s c6939s = this.f11943i;
        if (c6939s != null) {
            c6939s.m5957c(j2);
        }
        int i = 0;
        while (true) {
            SparseArray<C6943a> sparseArray = this.f11936b;
            if (i < sparseArray.size()) {
                C6943a valueAt = sparseArray.valueAt(i);
                valueAt.f11951f = false;
                valueAt.f11946a.mo5834c();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
