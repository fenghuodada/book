package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6843k;

/* renamed from: com.google.android.exoplayer2.source.b */
/* loaded from: classes.dex */
public final class C7146b implements InterfaceC7200x {

    /* renamed from: a */
    public final InterfaceC6843k f12781a;
    @Nullable

    /* renamed from: b */
    public Extractor f12782b;
    @Nullable

    /* renamed from: c */
    public C6820e f12783c;

    public C7146b(InterfaceC6843k interfaceC6843k) {
        this.f12781a = interfaceC6843k;
    }

    /* renamed from: a */
    public final long m5470a() {
        C6820e c6820e = this.f12783c;
        if (c6820e != null) {
            return c6820e.f11126d;
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r6.f11126d != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
        if (r6.f11126d != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
        r1 = false;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5469b(com.google.android.exoplayer2.upstream.InterfaceC7363i r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.exoplayer2.extractor.InterfaceC6833i r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.exoplayer2.extractor.e r6 = new com.google.android.exoplayer2.extractor.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f12783c = r6
            com.google.android.exoplayer2.extractor.Extractor r8 = r7.f12782b
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.exoplayer2.extractor.k r8 = r7.f12781a
            com.google.android.exoplayer2.extractor.Extractor[] r8 = r8.mo5492a(r9, r10)
            int r10 = r8.length
            r13 = 1
            r14 = 0
            if (r10 != r13) goto L21
            r8 = r8[r14]
            r7.f12782b = r8
            goto Lb7
        L21:
            int r10 = r8.length
            r0 = r14
        L23:
            if (r0 >= r10) goto L66
            r1 = r8[r0]
            boolean r2 = r1.mo5807b(r6)     // Catch: java.lang.Throwable -> L3d java.io.EOFException -> L50
            if (r2 == 0) goto L32
            r7.f12782b = r1     // Catch: java.lang.Throwable -> L3d java.io.EOFException -> L50
            r6.f11128f = r14
            goto L66
        L32:
            com.google.android.exoplayer2.extractor.Extractor r1 = r7.f12782b
            if (r1 != 0) goto L5d
            long r1 = r6.f11126d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L5b
            goto L5d
        L3d:
            r8 = move-exception
            com.google.android.exoplayer2.extractor.Extractor r9 = r7.f12782b
            if (r9 != 0) goto L4a
            long r9 = r6.f11126d
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L49
            goto L4a
        L49:
            r13 = r14
        L4a:
            com.google.android.exoplayer2.util.C7394a.m5131d(r13)
            r6.f11128f = r14
            throw r8
        L50:
            com.google.android.exoplayer2.extractor.Extractor r1 = r7.f12782b
            if (r1 != 0) goto L5d
            long r1 = r6.f11126d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L5b
            goto L5d
        L5b:
            r1 = r14
            goto L5e
        L5d:
            r1 = r13
        L5e:
            com.google.android.exoplayer2.util.C7394a.m5131d(r1)
            r6.f11128f = r14
            int r0 = r0 + 1
            goto L23
        L66:
            com.google.android.exoplayer2.extractor.Extractor r10 = r7.f12782b
            if (r10 != 0) goto Lb7
            com.google.android.exoplayer2.source.l0 r10 = new com.google.android.exoplayer2.source.l0
            int r11 = com.google.android.exoplayer2.util.C7408g0.f13905a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L73:
            int r12 = r8.length
            if (r14 >= r12) goto L90
            r12 = r8[r14]
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r11.append(r12)
            int r12 = r8.length
            int r12 = r12 + (-1)
            if (r14 >= r12) goto L8d
            java.lang.String r12 = ", "
            r11.append(r12)
        L8d:
            int r14 = r14 + 1
            goto L73
        L90:
            java.lang.String r8 = r11.toString()
            r11 = 58
            int r11 = androidx.constraintlayout.motion.widget.C0552c.m12193a(r8, r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "None of the available extractors ("
            r12.append(r11)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r9.getClass()
            r10.<init>(r8)
            throw r10
        Lb7:
            com.google.android.exoplayer2.extractor.Extractor r8 = r7.f12782b
            r8.mo5805f(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C7146b.m5469b(com.google.android.exoplayer2.upstream.i, android.net.Uri, java.util.Map, long, long, com.google.android.exoplayer2.extractor.i):void");
    }
}
