package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.C7032u;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.InterfaceC7423p;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.h */
/* loaded from: classes.dex */
public abstract class AbstractC6974h implements Renderer, RendererCapabilities {

    /* renamed from: a */
    public final int f12126a;
    @Nullable

    /* renamed from: c */
    public C6740d1 f12128c;

    /* renamed from: d */
    public int f12129d;

    /* renamed from: e */
    public int f12130e;
    @Nullable

    /* renamed from: f */
    public SampleStream f12131f;
    @Nullable

    /* renamed from: g */
    public C7003m0[] f12132g;

    /* renamed from: h */
    public long f12133h;

    /* renamed from: j */
    public boolean f12135j;

    /* renamed from: k */
    public boolean f12136k;

    /* renamed from: b */
    public final C7121n0 f12127b = new C7121n0();

    /* renamed from: i */
    public long f12134i = Long.MIN_VALUE;

    public AbstractC6974h(int i) {
        this.f12126a = i;
    }

    /* renamed from: A */
    public abstract void mo4923A(long j, boolean z) throws ExoPlaybackException;

    /* renamed from: B */
    public void mo4966B() {
    }

    /* renamed from: C */
    public void mo4964C() throws ExoPlaybackException {
    }

    /* renamed from: D */
    public void mo4962D() {
    }

    /* renamed from: E */
    public abstract void mo4922E(C7003m0[] c7003m0Arr, long j, long j2) throws ExoPlaybackException;

    /* renamed from: F */
    public final int m5710F(C7121n0 c7121n0, DecoderInputBuffer decoderInputBuffer, int i) {
        SampleStream sampleStream = this.f12131f;
        sampleStream.getClass();
        int mo5436a = sampleStream.mo5436a(c7121n0, decoderInputBuffer, i);
        if (mo5436a == -4) {
            if (decoderInputBuffer.m6018f(4)) {
                this.f12134i = Long.MIN_VALUE;
                if (this.f12135j) {
                    return -4;
                }
                return -3;
            }
            long j = decoderInputBuffer.f10906e + this.f12133h;
            decoderInputBuffer.f10906e = j;
            this.f12134i = Math.max(this.f12134i, j);
        } else if (mo5436a == -5) {
            C7003m0 c7003m0 = c7121n0.f12634b;
            c7003m0.getClass();
            if (c7003m0.f12291p != Long.MAX_VALUE) {
                C7003m0.C7005b m5616b = c7003m0.m5616b();
                m5616b.f12320o = c7003m0.f12291p + this.f12133h;
                c7121n0.f12634b = m5616b.m5614a();
            }
        }
        return mo5436a;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: e */
    public final void mo5709e() {
        C7394a.m5131d(this.f12130e == 1);
        this.f12127b.m5503a();
        this.f12130e = 0;
        this.f12131f = null;
        this.f12132g = null;
        this.f12135j = false;
        mo4916y();
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: g */
    public final boolean mo5708g() {
        return this.f12134i == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final int getState() {
        return this.f12130e;
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    public final SampleStream getStream() {
        return this.f12131f;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: h */
    public final void mo5707h(C7003m0[] c7003m0Arr, SampleStream sampleStream, long j, long j2) throws ExoPlaybackException {
        C7394a.m5131d(!this.f12135j);
        this.f12131f = sampleStream;
        if (this.f12134i == Long.MIN_VALUE) {
            this.f12134i = j;
        }
        this.f12132g = c7003m0Arr;
        this.f12133h = j2;
        mo4922E(c7003m0Arr, j, j2);
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: i */
    public final void mo5706i() {
        this.f12135j = true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: j */
    public final AbstractC6974h mo5705j() {
        return this;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: l */
    public /* synthetic */ void mo4939l(float f, float f2) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: m */
    public final void mo5704m(C6740d1 c6740d1, C7003m0[] c7003m0Arr, SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException {
        C7394a.m5131d(this.f12130e == 0);
        this.f12128c = c6740d1;
        this.f12130e = 1;
        mo4931z(z, z2);
        mo5707h(c7003m0Arr, sampleStream, j2, j3);
        mo4923A(j, z);
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: n */
    public int mo5578n() throws ExoPlaybackException {
        return 0;
    }

    @Override // com.google.android.exoplayer2.C6733b1.InterfaceC6735b
    /* renamed from: p */
    public void mo4917p(int i, @Nullable Object obj) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: q */
    public final void mo5703q() throws IOException {
        SampleStream sampleStream = this.f12131f;
        sampleStream.getClass();
        sampleStream.mo5435b();
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: r */
    public final long mo5702r() {
        return this.f12134i;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void reset() {
        C7394a.m5131d(this.f12130e == 0);
        this.f12127b.m5503a();
        mo4966B();
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: s */
    public final void mo5701s(long j) throws ExoPlaybackException {
        this.f12135j = false;
        this.f12134i = j;
        mo4923A(j, false);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void setIndex(int i) {
        this.f12129d = i;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void start() throws ExoPlaybackException {
        C7394a.m5131d(this.f12130e == 1);
        this.f12130e = 2;
        mo4964C();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void stop() {
        C7394a.m5131d(this.f12130e == 2);
        this.f12130e = 1;
        mo4962D();
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: t */
    public final boolean mo5700t() {
        return this.f12135j;
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    /* renamed from: u */
    public InterfaceC7423p mo5699u() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: v */
    public final int mo5698v() {
        return this.f12126a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.ExoPlaybackException m5697w(int r13, @androidx.annotation.Nullable com.google.android.exoplayer2.C7003m0 r14, java.lang.Exception r15, boolean r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.f12136k
            if (r3 != 0) goto L1d
            r3 = 1
            r1.f12136k = r3
            r3 = 0
            int r4 = r12.mo4921a(r14)     // Catch: java.lang.Throwable -> L16 com.google.android.exoplayer2.ExoPlaybackException -> L1b
            r4 = r4 & 7
            r1.f12136k = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.f12136k = r3
            throw r2
        L1b:
            r1.f12136k = r3
        L1d:
            r4 = r2
        L1e:
            java.lang.String r6 = r12.getName()
            int r7 = r1.f12129d
            com.google.android.exoplayer2.ExoPlaybackException r11 = new com.google.android.exoplayer2.ExoPlaybackException
            r3 = 1
            if (r0 != 0) goto L2b
            r9 = r2
            goto L2c
        L2b:
            r9 = r4
        L2c:
            r2 = r11
            r4 = r15
            r5 = r13
            r8 = r14
            r10 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.AbstractC6974h.m5697w(int, com.google.android.exoplayer2.m0, java.lang.Exception, boolean):com.google.android.exoplayer2.ExoPlaybackException");
    }

    /* renamed from: x */
    public final ExoPlaybackException m5696x(C7032u.C7034b c7034b, @Nullable C7003m0 c7003m0) {
        return m5697w(4002, c7003m0, c7034b, false);
    }

    /* renamed from: y */
    public abstract void mo4916y();

    /* renamed from: z */
    public void mo4931z(boolean z, boolean z2) throws ExoPlaybackException {
    }
}
