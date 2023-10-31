package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* renamed from: com.google.android.exoplayer2.mediacodec.j */
/* loaded from: classes.dex */
public final class C7017j extends DecoderInputBuffer {

    /* renamed from: i */
    public long f12378i;

    /* renamed from: j */
    public int f12379j;

    /* renamed from: k */
    public int f12380k;

    public C7017j() {
        super(2);
        this.f12380k = 32;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer
    /* renamed from: h */
    public final void mo5603h() {
        super.mo5603h();
        this.f12379j = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if ((r0.remaining() + r3.position()) > 3072000) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m5602l(com.google.android.exoplayer2.decoder.DecoderInputBuffer r5) {
        /*
            r4 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r5.m6018f(r0)
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.C7394a.m5134a(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            boolean r0 = r5.m6018f(r0)
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.C7394a.m5134a(r0)
            r0 = 4
            boolean r0 = r5.m6018f(r0)
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.C7394a.m5134a(r0)
            int r0 = r4.f12379j
            r2 = 0
            if (r0 <= 0) goto L25
            r3 = r1
            goto L26
        L25:
            r3 = r2
        L26:
            if (r3 != 0) goto L29
            goto L51
        L29:
            int r3 = r4.f12380k
            if (r0 < r3) goto L2e
            goto L4f
        L2e:
            boolean r0 = r5.m6017g()
            boolean r3 = r4.m6017g()
            if (r0 == r3) goto L39
            goto L4f
        L39:
            java.nio.ByteBuffer r0 = r5.f10904c
            if (r0 == 0) goto L51
            java.nio.ByteBuffer r3 = r4.f10904c
            if (r3 == 0) goto L51
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L51
        L4f:
            r0 = r2
            goto L52
        L51:
            r0 = r1
        L52:
            if (r0 != 0) goto L55
            return r2
        L55:
            int r0 = r4.f12379j
            int r2 = r0 + 1
            r4.f12379j = r2
            if (r0 != 0) goto L69
            long r2 = r5.f10906e
            r4.f10906e = r2
            boolean r0 = r5.m6018f(r1)
            if (r0 == 0) goto L69
            r4.f10915a = r1
        L69:
            boolean r0 = r5.m6017g()
            if (r0 == 0) goto L73
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.f10915a = r0
        L73:
            java.nio.ByteBuffer r0 = r5.f10904c
            if (r0 == 0) goto L83
            int r2 = r0.remaining()
            r4.m6020j(r2)
            java.nio.ByteBuffer r2 = r4.f10904c
            r2.put(r0)
        L83:
            long r2 = r5.f10906e
            r4.f12378i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C7017j.m5602l(com.google.android.exoplayer2.decoder.DecoderInputBuffer):boolean");
    }
}
