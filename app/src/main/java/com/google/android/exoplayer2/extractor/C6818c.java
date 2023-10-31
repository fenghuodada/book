package com.google.android.exoplayer2.extractor;

import androidx.concurrent.futures.C0484a;
import androidx.constraintlayout.motion.widget.C0552c;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.c */
/* loaded from: classes.dex */
public final class C6818c implements InterfaceC6905t {

    /* renamed from: a */
    public final int f11111a;

    /* renamed from: b */
    public final int[] f11112b;

    /* renamed from: c */
    public final long[] f11113c;

    /* renamed from: d */
    public final long[] f11114d;

    /* renamed from: e */
    public final long[] f11115e;

    /* renamed from: f */
    public final long f11116f;

    public C6818c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f11112b = iArr;
        this.f11113c = jArr;
        this.f11114d = jArr2;
        this.f11115e = jArr3;
        int length = iArr.length;
        this.f11111a = length;
        if (length > 0) {
            this.f11116f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f11116f = 0L;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: c */
    public final boolean mo5796c() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: h */
    public final InterfaceC6905t.C6906a mo5795h(long j) {
        long[] jArr = this.f11115e;
        int m5101e = C7408g0.m5101e(jArr, j, true);
        long j2 = jArr[m5101e];
        long[] jArr2 = this.f11113c;
        C6950u c6950u = new C6950u(j2, jArr2[m5101e]);
        if (j2 < j && m5101e != this.f11111a - 1) {
            int i = m5101e + 1;
            return new InterfaceC6905t.C6906a(c6950u, new C6950u(jArr[i], jArr2[i]));
        }
        return new InterfaceC6905t.C6906a(c6950u, c6950u);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: i */
    public final long mo5794i() {
        return this.f11116f;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f11112b);
        String arrays2 = Arrays.toString(this.f11113c);
        String arrays3 = Arrays.toString(this.f11115e);
        String arrays4 = Arrays.toString(this.f11114d);
        StringBuilder sb = new StringBuilder(C0552c.m12193a(arrays4, C0552c.m12193a(arrays3, C0552c.m12193a(arrays2, C0552c.m12193a(arrays, 71)))));
        sb.append("ChunkIndex(length=");
        sb.append(this.f11111a);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        return C0484a.m12392a(sb, arrays4, ")");
    }
}
