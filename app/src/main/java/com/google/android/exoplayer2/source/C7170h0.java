package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.C7127q0;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.C7394a;

/* renamed from: com.google.android.exoplayer2.source.h0 */
/* loaded from: classes.dex */
public final class C7170h0 extends AbstractC6984j1 {

    /* renamed from: l */
    public static final Object f12873l = new Object();

    /* renamed from: b */
    public final long f12874b;

    /* renamed from: c */
    public final long f12875c;

    /* renamed from: d */
    public final long f12876d;

    /* renamed from: e */
    public final long f12877e;

    /* renamed from: f */
    public final long f12878f;

    /* renamed from: g */
    public final boolean f12879g;

    /* renamed from: h */
    public final boolean f12880h;
    @Nullable

    /* renamed from: i */
    public final Object f12881i;
    @Nullable

    /* renamed from: j */
    public final C7127q0 f12882j;
    @Nullable

    /* renamed from: k */
    public final C7127q0.C7132e f12883k;

    static {
        C7127q0.C7129b c7129b = new C7127q0.C7129b();
        c7129b.f12646a = "SinglePeriodTimeline";
        c7129b.f12647b = Uri.EMPTY;
        c7129b.m5501a();
    }

    public C7170h0(long j, boolean z, boolean z2, C7127q0 c7127q0) {
        C7127q0.C7132e c7132e;
        if (z2) {
            c7132e = c7127q0.f12643c;
        } else {
            c7132e = null;
        }
        this.f12874b = -9223372036854775807L;
        this.f12875c = -9223372036854775807L;
        this.f12876d = -9223372036854775807L;
        this.f12877e = j;
        this.f12878f = j;
        this.f12879g = z;
        this.f12880h = false;
        this.f12881i = null;
        c7127q0.getClass();
        this.f12882j = c7127q0;
        this.f12883k = c7132e;
    }

    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: b */
    public final int mo5414b(Object obj) {
        return f12873l.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: f */
    public final AbstractC6984j1.C6986b mo5413f(int i, AbstractC6984j1.C6986b c6986b, boolean z) {
        Object obj;
        C7394a.m5132c(i, 1);
        if (z) {
            obj = f12873l;
        } else {
            obj = null;
        }
        c6986b.getClass();
        AdPlaybackState adPlaybackState = AdPlaybackState.f12766g;
        c6986b.f12152a = null;
        c6986b.f12153b = obj;
        c6986b.f12154c = 0;
        c6986b.f12155d = this.f12877e;
        c6986b.f12156e = 0L;
        c6986b.f12158g = adPlaybackState;
        c6986b.f12157f = false;
        return c6986b;
    }

    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: h */
    public final int mo5412h() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: l */
    public final Object mo5411l(int i) {
        C7394a.m5132c(i, 1);
        return f12873l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r1 > r3) goto L9;
     */
    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.AbstractC6984j1.C6987c mo5410n(int r21, com.google.android.exoplayer2.AbstractC6984j1.C6987c r22, long r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = 1
            r2 = r21
            com.google.android.exoplayer2.util.C7394a.m5132c(r2, r1)
            boolean r12 = r0.f12880h
            r1 = 0
            if (r12 == 0) goto L26
            int r3 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r3 == 0) goto L26
            long r3 = r0.f12878f
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1e
            goto L24
        L1e:
            long r1 = r1 + r23
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L26
        L24:
            r14 = r5
            goto L27
        L26:
            r14 = r1
        L27:
            java.lang.Object r1 = com.google.android.exoplayer2.AbstractC6984j1.C6987c.f12159r
            com.google.android.exoplayer2.q0 r3 = r0.f12882j
            java.lang.Object r4 = r0.f12881i
            long r5 = r0.f12874b
            long r7 = r0.f12875c
            long r9 = r0.f12876d
            boolean r11 = r0.f12879g
            com.google.android.exoplayer2.q0$e r13 = r0.f12883k
            long r1 = r0.f12878f
            r16 = r1
            r18 = 0
            r2 = r22
            r2.m5679b(r3, r4, r5, r7, r9, r11, r12, r13, r14, r16, r18)
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C7170h0.mo5410n(int, com.google.android.exoplayer2.j1$c, long):com.google.android.exoplayer2.j1$c");
    }

    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: o */
    public final int mo5409o() {
        return 1;
    }
}
