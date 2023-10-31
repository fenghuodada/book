package com.google.android.exoplayer2.extractor.mp3;

import android.util.Pair;
import com.google.android.exoplayer2.C6622C;
import com.google.android.exoplayer2.extractor.C6950u;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.extractor.mp3.c */
/* loaded from: classes.dex */
public final class C6857c implements InterfaceC6858d {

    /* renamed from: a */
    public final long[] f11364a;

    /* renamed from: b */
    public final long[] f11365b;

    /* renamed from: c */
    public final long f11366c;

    public C6857c(long[] jArr, long[] jArr2, long j) {
        this.f11364a = jArr;
        this.f11365b = jArr2;
        this.f11366c = j == -9223372036854775807L ? C6622C.m6217b(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: b */
    public static Pair<Long, Long> m5899b(long j, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int m5101e = C7408g0.m5101e(jArr, j, true);
        long j2 = jArr[m5101e];
        long j3 = jArr2[m5101e];
        int i = m5101e + 1;
        if (i == jArr.length) {
            valueOf = Long.valueOf(j2);
            valueOf2 = Long.valueOf(j3);
        } else {
            long j4 = jArr[i];
            long j5 = jArr2[i];
            double d = j4 == j2 ? 0.0d : (j - j2) / (j4 - j2);
            valueOf = Long.valueOf(j);
            valueOf2 = Long.valueOf(((long) (d * (j5 - j3))) + j3);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.InterfaceC6858d
    /* renamed from: a */
    public final long mo5898a() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: c */
    public final boolean mo5796c() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.InterfaceC6858d
    /* renamed from: d */
    public final long mo5897d(long j) {
        return C6622C.m6217b(((Long) m5899b(j, this.f11364a, this.f11365b).second).longValue());
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: h */
    public final InterfaceC6905t.C6906a mo5795h(long j) {
        Pair<Long, Long> m5899b = m5899b(C6622C.m6216c(C7408g0.m5098h(j, 0L, this.f11366c)), this.f11365b, this.f11364a);
        C6950u c6950u = new C6950u(C6622C.m6217b(((Long) m5899b.first).longValue()), ((Long) m5899b.second).longValue());
        return new InterfaceC6905t.C6906a(c6950u, c6950u);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: i */
    public final long mo5794i() {
        return this.f11366c;
    }
}
