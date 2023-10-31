package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.ogg.d */
/* loaded from: classes.dex */
public final class C6892d {

    /* renamed from: a */
    public final C6893e f11572a = new C6893e();

    /* renamed from: b */
    public final C7436v f11573b = new C7436v(new byte[65025], 0);

    /* renamed from: c */
    public int f11574c = -1;

    /* renamed from: d */
    public int f11575d;

    /* renamed from: e */
    public boolean f11576e;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
        return false;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m5861a(com.google.android.exoplayer2.extractor.C6820e r11) throws java.io.IOException {
        /*
            r10 = this;
            boolean r0 = r10.f11576e
            r1 = 0
            com.google.android.exoplayer2.util.v r2 = r10.f11573b
            if (r0 == 0) goto Lc
            r10.f11576e = r1
            r2.m4995w(r1)
        Lc:
            boolean r0 = r10.f11576e
            r3 = 1
            if (r0 != 0) goto La9
            int r0 = r10.f11574c
            r4 = 255(0xff, float:3.57E-43)
            com.google.android.exoplayer2.extractor.ogg.e r5 = r10.f11572a
            if (r0 >= 0) goto L5c
            r6 = -1
            boolean r0 = r5.m5859b(r11, r6)
            if (r0 == 0) goto L5b
            boolean r0 = r5.m5860a(r11, r3)
            if (r0 != 0) goto L28
            goto L5b
        L28:
            int r0 = r5.f11580d
            int r6 = r5.f11577a
            r6 = r6 & r3
            if (r6 != r3) goto L4e
            int r6 = r2.f13980c
            if (r6 != 0) goto L4e
            r10.f11575d = r1
            r6 = r1
        L36:
            int r7 = r10.f11575d
            int r8 = r1 + r7
            int r9 = r5.f11579c
            if (r8 >= r9) goto L49
            int r7 = r7 + 1
            r10.f11575d = r7
            int[] r7 = r5.f11582f
            r7 = r7[r8]
            int r6 = r6 + r7
            if (r7 == r4) goto L36
        L49:
            int r0 = r0 + r6
            int r6 = r10.f11575d
            int r6 = r6 + r1
            goto L4f
        L4e:
            r6 = r1
        L4f:
            r11.mo5924j(r0)     // Catch: java.io.EOFException -> L54
            r0 = r3
            goto L55
        L54:
            r0 = r1
        L55:
            if (r0 != 0) goto L58
            return r1
        L58:
            r10.f11574c = r6
            goto L5c
        L5b:
            return r1
        L5c:
            int r0 = r10.f11574c
            r10.f11575d = r1
            r6 = r1
        L61:
            int r7 = r10.f11575d
            int r8 = r0 + r7
            int r9 = r5.f11579c
            if (r8 >= r9) goto L74
            int r7 = r7 + 1
            r10.f11575d = r7
            int[] r7 = r5.f11582f
            r7 = r7[r8]
            int r6 = r6 + r7
            if (r7 == r4) goto L61
        L74:
            int r0 = r10.f11574c
            int r7 = r10.f11575d
            int r0 = r0 + r7
            if (r6 <= 0) goto La0
            int r7 = r2.f13980c
            int r7 = r7 + r6
            r2.m5017a(r7)
            byte[] r7 = r2.f13978a
            int r8 = r2.f13980c
            r11.mo5930a(r7, r8, r6, r1)     // Catch: java.io.EOFException -> L8a
            r7 = r3
            goto L8b
        L8a:
            r7 = r1
        L8b:
            if (r7 != 0) goto L8e
            return r1
        L8e:
            int r7 = r2.f13980c
            int r7 = r7 + r6
            r2.m4993y(r7)
            int[] r6 = r5.f11582f
            int r7 = r0 + (-1)
            r6 = r6[r7]
            if (r6 == r4) goto L9d
            goto L9e
        L9d:
            r3 = r1
        L9e:
            r10.f11576e = r3
        La0:
            int r3 = r5.f11579c
            if (r0 != r3) goto La5
            r0 = -1
        La5:
            r10.f11574c = r0
            goto Lc
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ogg.C6892d.m5861a(com.google.android.exoplayer2.extractor.e):boolean");
    }
}
