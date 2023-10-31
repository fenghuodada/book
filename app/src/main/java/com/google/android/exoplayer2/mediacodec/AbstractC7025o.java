package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.AbstractC6974h;
import com.google.android.exoplayer2.C6622C;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7121n0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.audio.C6697g0;
import com.google.android.exoplayer2.decoder.C6744c;
import com.google.android.exoplayer2.decoder.C6747e;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.C6801v;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.InterfaceC6800u;
import com.google.android.exoplayer2.mediacodec.C7032u;
import com.google.android.exoplayer2.mediacodec.C7040w;
import com.google.android.exoplayer2.mediacodec.InterfaceC7019l;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7402d0;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7421n;
import com.google.android.exoplayer2.util.C7427r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.mediacodec.o */
/* loaded from: classes.dex */
public abstract class AbstractC7025o extends AbstractC6974h {

    /* renamed from: J0 */
    public static final byte[] f12396J0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    @Nullable

    /* renamed from: A */
    public C7003m0 f12397A;

    /* renamed from: A0 */
    public boolean f12398A0;
    @Nullable

    /* renamed from: B */
    public DrmSession f12399B;

    /* renamed from: B0 */
    public boolean f12400B0;
    @Nullable

    /* renamed from: C */
    public DrmSession f12401C;

    /* renamed from: C0 */
    public boolean f12402C0;
    @Nullable

    /* renamed from: D */
    public MediaCrypto f12403D;

    /* renamed from: D0 */
    public boolean f12404D0;

    /* renamed from: E */
    public boolean f12405E;
    @Nullable

    /* renamed from: E0 */
    public ExoPlaybackException f12406E0;

    /* renamed from: F */
    public final long f12407F;

    /* renamed from: F0 */
    public C6747e f12408F0;

    /* renamed from: G */
    public float f12409G;

    /* renamed from: G0 */
    public long f12410G0;

    /* renamed from: H */
    public float f12411H;

    /* renamed from: H0 */
    public long f12412H0;
    @Nullable

    /* renamed from: I */
    public InterfaceC7019l f12413I;

    /* renamed from: I0 */
    public int f12414I0;
    @Nullable

    /* renamed from: J */
    public C7003m0 f12415J;
    @Nullable

    /* renamed from: K */
    public MediaFormat f12416K;

    /* renamed from: L */
    public boolean f12417L;

    /* renamed from: M */
    public float f12418M;
    @Nullable

    /* renamed from: N */
    public ArrayDeque<C7024n> f12419N;
    @Nullable

    /* renamed from: O */
    public C7026a f12420O;
    @Nullable

    /* renamed from: P */
    public C7024n f12421P;

    /* renamed from: Q */
    public int f12422Q;

    /* renamed from: R */
    public boolean f12423R;

    /* renamed from: S */
    public boolean f12424S;

    /* renamed from: T */
    public boolean f12425T;

    /* renamed from: U */
    public boolean f12426U;

    /* renamed from: V */
    public boolean f12427V;

    /* renamed from: W */
    public boolean f12428W;

    /* renamed from: X */
    public boolean f12429X;

    /* renamed from: Y */
    public boolean f12430Y;

    /* renamed from: Z */
    public boolean f12431Z;

    /* renamed from: d0 */
    public boolean f12432d0;
    @Nullable

    /* renamed from: e0 */
    public C7018k f12433e0;

    /* renamed from: f0 */
    public long f12434f0;

    /* renamed from: g0 */
    public int f12435g0;

    /* renamed from: h0 */
    public int f12436h0;
    @Nullable

    /* renamed from: i0 */
    public ByteBuffer f12437i0;

    /* renamed from: j0 */
    public boolean f12438j0;

    /* renamed from: k0 */
    public boolean f12439k0;

    /* renamed from: l */
    public final InterfaceC7019l.InterfaceC7021b f12440l;

    /* renamed from: l0 */
    public boolean f12441l0;

    /* renamed from: m */
    public final InterfaceC7028q f12442m;

    /* renamed from: m0 */
    public boolean f12443m0;

    /* renamed from: n */
    public final boolean f12444n;

    /* renamed from: n0 */
    public boolean f12445n0;

    /* renamed from: o */
    public final float f12446o;

    /* renamed from: o0 */
    public boolean f12447o0;

    /* renamed from: p */
    public final DecoderInputBuffer f12448p;

    /* renamed from: p0 */
    public int f12449p0;

    /* renamed from: q */
    public final DecoderInputBuffer f12450q;

    /* renamed from: q0 */
    public int f12451q0;

    /* renamed from: r */
    public final DecoderInputBuffer f12452r;

    /* renamed from: r0 */
    public int f12453r0;

    /* renamed from: s */
    public final C7017j f12454s;

    /* renamed from: s0 */
    public boolean f12455s0;

    /* renamed from: t */
    public final C7402d0<C7003m0> f12456t;

    /* renamed from: t0 */
    public boolean f12457t0;

    /* renamed from: u */
    public final ArrayList<Long> f12458u;

    /* renamed from: u0 */
    public boolean f12459u0;

    /* renamed from: v */
    public final MediaCodec.BufferInfo f12460v;

    /* renamed from: v0 */
    public long f12461v0;

    /* renamed from: w */
    public final long[] f12462w;

    /* renamed from: w0 */
    public long f12463w0;

    /* renamed from: x */
    public final long[] f12464x;

    /* renamed from: x0 */
    public boolean f12465x0;

    /* renamed from: y */
    public final long[] f12466y;

    /* renamed from: y0 */
    public boolean f12467y0;
    @Nullable

    /* renamed from: z */
    public C7003m0 f12468z;

    /* renamed from: z0 */
    public boolean f12469z0;

    /* renamed from: com.google.android.exoplayer2.mediacodec.o$a */
    /* loaded from: classes.dex */
    public static class C7026a extends Exception {

        /* renamed from: a */
        public final String f12470a;

        /* renamed from: b */
        public final boolean f12471b;
        @Nullable

        /* renamed from: c */
        public final C7024n f12472c;
        @Nullable

        /* renamed from: d */
        public final String f12473d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C7026a(int r11, com.google.android.exoplayer2.C7003m0 r12, @androidx.annotation.Nullable com.google.android.exoplayer2.mediacodec.C7032u.C7034b r13, boolean r14) {
            /*
                r10 = this;
                java.lang.String r0 = java.lang.String.valueOf(r12)
                int r1 = r0.length()
                int r1 = r1 + 36
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Decoder init failed: ["
                r2.append(r1)
                r2.append(r11)
                java.lang.String r1 = "], "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                java.lang.String r6 = r12.f12287l
                r8 = 0
                if (r11 >= 0) goto L2b
                java.lang.String r12 = "neg_"
                goto L2d
            L2b:
                java.lang.String r12 = ""
            L2d:
                int r11 = java.lang.Math.abs(r11)
                int r0 = r12.length()
                int r0 = r0 + 71
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
                r1.append(r0)
                r1.append(r12)
                r1.append(r11)
                java.lang.String r9 = r1.toString()
                r3 = r10
                r5 = r13
                r7 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.AbstractC7025o.C7026a.<init>(int, com.google.android.exoplayer2.m0, com.google.android.exoplayer2.mediacodec.u$b, boolean):void");
        }

        public C7026a(String str, @Nullable Throwable th, String str2, boolean z, @Nullable C7024n c7024n, @Nullable String str3) {
            super(str, th);
            this.f12470a = str2;
            this.f12471b = z;
            this.f12472c = c7024n;
            this.f12473d = str3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7025o(int i, float f) {
        super(i);
        C7040w.C7041a c7041a = InterfaceC7019l.InterfaceC7021b.f12388a;
        C7027p c7027p = InterfaceC7028q.f12474a;
        this.f12440l = c7041a;
        this.f12442m = c7027p;
        this.f12444n = false;
        this.f12446o = f;
        this.f12448p = new DecoderInputBuffer(0);
        this.f12450q = new DecoderInputBuffer(0);
        this.f12452r = new DecoderInputBuffer(2);
        C7017j c7017j = new C7017j();
        this.f12454s = c7017j;
        this.f12456t = new C7402d0<>();
        this.f12458u = new ArrayList<>();
        this.f12460v = new MediaCodec.BufferInfo();
        this.f12409G = 1.0f;
        this.f12411H = 1.0f;
        this.f12407F = -9223372036854775807L;
        this.f12462w = new long[10];
        this.f12464x = new long[10];
        this.f12466y = new long[10];
        this.f12410G0 = -9223372036854775807L;
        this.f12412H0 = -9223372036854775807L;
        c7017j.m6020j(0);
        c7017j.f10904c.order(ByteOrder.nativeOrder());
        this.f12418M = -1.0f;
        this.f12422Q = 0;
        this.f12449p0 = 0;
        this.f12435g0 = -1;
        this.f12436h0 = -1;
        this.f12434f0 = -9223372036854775807L;
        this.f12461v0 = -9223372036854775807L;
        this.f12463w0 = -9223372036854775807L;
        this.f12451q0 = 0;
        this.f12453r0 = 0;
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: A */
    public void mo4923A(long j, boolean z) throws ExoPlaybackException {
        int i;
        this.f12465x0 = false;
        this.f12467y0 = false;
        this.f12398A0 = false;
        if (this.f12441l0) {
            this.f12454s.mo5603h();
            this.f12452r.mo5603h();
            this.f12443m0 = false;
        } else if (m5588O()) {
            m5584X();
        }
        C7402d0<C7003m0> c7402d0 = this.f12456t;
        synchronized (c7402d0) {
            i = c7402d0.f13895d;
        }
        if (i > 0) {
            this.f12469z0 = true;
        }
        this.f12456t.m5117b();
        int i2 = this.f12414I0;
        if (i2 != 0) {
            this.f12412H0 = this.f12464x[i2 - 1];
            this.f12410G0 = this.f12462w[i2 - 1];
            this.f12414I0 = 0;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: E */
    public final void mo4922E(C7003m0[] c7003m0Arr, long j, long j2) throws ExoPlaybackException {
        boolean z = true;
        if (this.f12412H0 == -9223372036854775807L) {
            if (this.f12410G0 != -9223372036854775807L) {
                z = false;
            }
            C7394a.m5131d(z);
            this.f12410G0 = j;
            this.f12412H0 = j2;
            return;
        }
        int i = this.f12414I0;
        long[] jArr = this.f12464x;
        if (i == jArr.length) {
            long j3 = jArr[i - 1];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.f12414I0 = i + 1;
        }
        int i2 = this.f12414I0;
        int i3 = i2 - 1;
        this.f12462w[i3] = j;
        jArr[i3] = j2;
        this.f12466y[i2 - 1] = this.f12461v0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* renamed from: G */
    public final boolean m5594G(long j, long j2) throws ExoPlaybackException {
        boolean z;
        ?? r1;
        C7017j c7017j;
        boolean z2;
        boolean z3;
        boolean z4;
        C7394a.m5131d(!this.f12467y0);
        C7017j c7017j2 = this.f12454s;
        int i = c7017j2.f12379j;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (mo4940i0(j, j2, null, c7017j2.f10904c, this.f12436h0, 0, i, c7017j2.f10906e, c7017j2.m6017g(), c7017j2.m6018f(4), this.f12397A)) {
                c7017j = c7017j2;
                mo4943e0(c7017j.f12378i);
                c7017j.mo5603h();
                r1 = 0;
            } else {
                return false;
            }
        } else {
            r1 = 0;
            c7017j = c7017j2;
        }
        if (this.f12465x0) {
            this.f12467y0 = true;
            return r1;
        }
        boolean z5 = this.f12443m0;
        DecoderInputBuffer decoderInputBuffer = this.f12452r;
        if (z5) {
            C7394a.m5131d(c7017j.m5602l(decoderInputBuffer));
            this.f12443m0 = r1;
        }
        if (this.f12445n0) {
            if (c7017j.f12379j > 0) {
                z4 = true;
            } else {
                z4 = r1;
            }
            if (z4) {
                return true;
            }
            m5593J();
            this.f12445n0 = r1;
            m5584X();
            if (!this.f12441l0) {
                return r1;
            }
        }
        C7394a.m5131d(!this.f12465x0);
        C7121n0 c7121n0 = this.f12127b;
        c7121n0.m5503a();
        decoderInputBuffer.mo5603h();
        while (true) {
            decoderInputBuffer.mo5603h();
            int m5710F = m5710F(c7121n0, decoderInputBuffer, r1);
            if (m5710F != -5) {
                if (m5710F != -4) {
                    if (m5710F != -3) {
                        throw new IllegalStateException();
                    }
                } else if (decoderInputBuffer.m6018f(4)) {
                    this.f12465x0 = true;
                    break;
                } else {
                    if (this.f12469z0) {
                        C7003m0 c7003m0 = this.f12468z;
                        c7003m0.getClass();
                        this.f12397A = c7003m0;
                        mo4944d0(c7003m0, null);
                        this.f12469z0 = r1;
                    }
                    decoderInputBuffer.m6019k();
                    if (!c7017j.m5602l(decoderInputBuffer)) {
                        this.f12443m0 = true;
                        break;
                    }
                }
            } else {
                mo4945c0(c7121n0);
                break;
            }
        }
        if (c7017j.f12379j > 0) {
            z2 = true;
        } else {
            z2 = r1;
        }
        if (z2) {
            c7017j.m6019k();
        }
        if (c7017j.f12379j > 0) {
            z3 = true;
        } else {
            z3 = r1;
        }
        if (z3 || this.f12465x0 || this.f12445n0) {
            return true;
        }
        return r1;
    }

    /* renamed from: H */
    public abstract DecoderReuseEvaluation mo4957H(C7024n c7024n, C7003m0 c7003m0, C7003m0 c7003m02);

    /* renamed from: I */
    public C7023m mo4955I(IllegalStateException illegalStateException, @Nullable C7024n c7024n) {
        return new C7023m(illegalStateException, c7024n);
    }

    /* renamed from: J */
    public final void m5593J() {
        this.f12445n0 = false;
        this.f12454s.mo5603h();
        this.f12452r.mo5603h();
        this.f12443m0 = false;
        this.f12441l0 = false;
    }

    @TargetApi(23)
    /* renamed from: K */
    public final boolean m5592K() throws ExoPlaybackException {
        if (this.f12455s0) {
            this.f12451q0 = 1;
            if (this.f12424S || this.f12426U) {
                this.f12453r0 = 3;
                return false;
            }
            this.f12453r0 = 2;
        } else {
            m5573t0();
        }
        return true;
    }

    /* renamed from: L */
    public final boolean m5591L(long j, long j2) throws ExoPlaybackException {
        boolean z;
        boolean z2;
        boolean z3;
        MediaCodec.BufferInfo bufferInfo;
        boolean mo4940i0;
        boolean z4;
        int mo5550f;
        boolean z5;
        boolean z6;
        if (this.f12436h0 >= 0) {
            z = true;
        } else {
            z = false;
        }
        MediaCodec.BufferInfo bufferInfo2 = this.f12460v;
        if (!z) {
            if (this.f12427V && this.f12457t0) {
                try {
                    mo5550f = this.f12413I.mo5550f(bufferInfo2);
                } catch (IllegalStateException unused) {
                    m5582h0();
                    if (this.f12467y0) {
                        m5580k0();
                    }
                    return false;
                }
            } else {
                mo5550f = this.f12413I.mo5550f(bufferInfo2);
            }
            if (mo5550f < 0) {
                if (mo5550f == -2) {
                    this.f12459u0 = true;
                    MediaFormat mo5554b = this.f12413I.mo5554b();
                    if (this.f12422Q != 0 && mo5554b.getInteger("width") == 32 && mo5554b.getInteger("height") == 32) {
                        this.f12431Z = true;
                    } else {
                        if (this.f12429X) {
                            mo5554b.setInteger("channel-count", 1);
                        }
                        this.f12416K = mo5554b;
                        this.f12417L = true;
                    }
                    return true;
                }
                if (this.f12432d0 && (this.f12465x0 || this.f12451q0 == 2)) {
                    m5582h0();
                }
                return false;
            } else if (this.f12431Z) {
                this.f12431Z = false;
                this.f12413I.mo5548h(mo5550f, false);
                return true;
            } else if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m5582h0();
                return false;
            } else {
                this.f12436h0 = mo5550f;
                ByteBuffer mo5543m = this.f12413I.mo5543m(mo5550f);
                this.f12437i0 = mo5543m;
                if (mo5543m != null) {
                    mo5543m.position(bufferInfo2.offset);
                    this.f12437i0.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                if (this.f12428W && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                    long j3 = this.f12461v0;
                    if (j3 != -9223372036854775807L) {
                        bufferInfo2.presentationTimeUs = j3;
                    }
                }
                long j4 = bufferInfo2.presentationTimeUs;
                ArrayList<Long> arrayList = this.f12458u;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        if (arrayList.get(i).longValue() == j4) {
                            arrayList.remove(i);
                            z5 = true;
                            break;
                        }
                        i++;
                    } else {
                        z5 = false;
                        break;
                    }
                }
                this.f12438j0 = z5;
                long j5 = this.f12463w0;
                long j6 = bufferInfo2.presentationTimeUs;
                if (j5 == j6) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.f12439k0 = z6;
                m5572u0(j6);
            }
        }
        if (this.f12427V && this.f12457t0) {
            try {
                z2 = true;
                z3 = false;
                try {
                    mo4940i0 = mo4940i0(j, j2, this.f12413I, this.f12437i0, this.f12436h0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f12438j0, this.f12439k0, this.f12397A);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    m5582h0();
                    if (this.f12467y0) {
                        m5580k0();
                    }
                    return z3;
                }
            } catch (IllegalStateException unused3) {
                z3 = false;
            }
        } else {
            z2 = true;
            z3 = false;
            bufferInfo = bufferInfo2;
            mo4940i0 = mo4940i0(j, j2, this.f12413I, this.f12437i0, this.f12436h0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f12438j0, this.f12439k0, this.f12397A);
        }
        if (mo4940i0) {
            mo4943e0(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z4 = z2;
            } else {
                z4 = z3;
            }
            this.f12436h0 = -1;
            this.f12437i0 = null;
            if (!z4) {
                return z2;
            }
            m5582h0();
        }
        return z3;
    }

    /* renamed from: M */
    public final boolean m5590M() throws ExoPlaybackException {
        boolean z;
        C6744c c6744c;
        InterfaceC7019l interfaceC7019l = this.f12413I;
        if (interfaceC7019l == null || this.f12451q0 == 2 || this.f12465x0) {
            return false;
        }
        int i = this.f12435g0;
        DecoderInputBuffer decoderInputBuffer = this.f12450q;
        if (i < 0) {
            int mo5551e = interfaceC7019l.mo5551e();
            this.f12435g0 = mo5551e;
            if (mo5551e < 0) {
                return false;
            }
            decoderInputBuffer.f10904c = this.f12413I.mo5545k(mo5551e);
            decoderInputBuffer.mo5603h();
        }
        if (this.f12451q0 == 1) {
            if (!this.f12432d0) {
                this.f12457t0 = true;
                this.f12413I.mo5542n(this.f12435g0, 0, 0L, 4);
                this.f12435g0 = -1;
                decoderInputBuffer.f10904c = null;
            }
            this.f12451q0 = 2;
            return false;
        } else if (this.f12430Y) {
            this.f12430Y = false;
            decoderInputBuffer.f10904c.put(f12396J0);
            this.f12413I.mo5542n(this.f12435g0, 38, 0L, 0);
            this.f12435g0 = -1;
            decoderInputBuffer.f10904c = null;
            this.f12455s0 = true;
            return true;
        } else {
            if (this.f12449p0 == 1) {
                for (int i2 = 0; i2 < this.f12415J.f12289n.size(); i2++) {
                    decoderInputBuffer.f10904c.put(this.f12415J.f12289n.get(i2));
                }
                this.f12449p0 = 2;
            }
            int position = decoderInputBuffer.f10904c.position();
            C7121n0 c7121n0 = this.f12127b;
            c7121n0.m5503a();
            try {
                int m5710F = m5710F(c7121n0, decoderInputBuffer, 0);
                if (mo5708g()) {
                    this.f12463w0 = this.f12461v0;
                }
                if (m5710F == -3) {
                    return false;
                }
                if (m5710F == -5) {
                    if (this.f12449p0 == 2) {
                        decoderInputBuffer.mo5603h();
                        this.f12449p0 = 1;
                    }
                    mo4945c0(c7121n0);
                    return true;
                }
                if (decoderInputBuffer.m6018f(4)) {
                    if (this.f12449p0 == 2) {
                        decoderInputBuffer.mo5603h();
                        this.f12449p0 = 1;
                    }
                    this.f12465x0 = true;
                    if (!this.f12455s0) {
                        m5582h0();
                        return false;
                    }
                    try {
                        if (!this.f12432d0) {
                            this.f12457t0 = true;
                            this.f12413I.mo5542n(this.f12435g0, 0, 0L, 4);
                            this.f12435g0 = -1;
                            decoderInputBuffer.f10904c = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw m5697w(C6622C.m6218a(e.getErrorCode()), this.f12468z, e, false);
                    }
                } else if (!this.f12455s0 && !decoderInputBuffer.m6018f(1)) {
                    decoderInputBuffer.mo5603h();
                    if (this.f12449p0 == 2) {
                        this.f12449p0 = 1;
                    }
                    return true;
                } else {
                    boolean m6018f = decoderInputBuffer.m6018f(1073741824);
                    C6744c c6744c2 = decoderInputBuffer.f10903b;
                    if (m6018f) {
                        if (position == 0) {
                            c6744c2.getClass();
                        } else {
                            if (c6744c2.f10919d == null) {
                                int[] iArr = new int[1];
                                c6744c2.f10919d = iArr;
                                c6744c2.f10924i.numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = c6744c2.f10919d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.f12423R && !m6018f) {
                        ByteBuffer byteBuffer = decoderInputBuffer.f10904c;
                        byte[] bArr = C7427r.f13945a;
                        int position2 = byteBuffer.position();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int i5 = i3 + 1;
                            if (i5 < position2) {
                                int i6 = byteBuffer.get(i3) & 255;
                                if (i4 == 3) {
                                    if (i6 == 1 && (byteBuffer.get(i5) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i3 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                } else if (i6 == 0) {
                                    i4++;
                                }
                                if (i6 != 0) {
                                    i4 = 0;
                                }
                                i3 = i5;
                            } else {
                                byteBuffer.clear();
                                break;
                            }
                        }
                        if (decoderInputBuffer.f10904c.position() == 0) {
                            return true;
                        }
                        this.f12423R = false;
                    }
                    long j = decoderInputBuffer.f10906e;
                    C7018k c7018k = this.f12433e0;
                    if (c7018k != null) {
                        C7003m0 c7003m0 = this.f12468z;
                        if (c7018k.f12382b == 0) {
                            c7018k.f12381a = j;
                        }
                        if (!c7018k.f12383c) {
                            ByteBuffer byteBuffer2 = decoderInputBuffer.f10904c;
                            byteBuffer2.getClass();
                            int i7 = 0;
                            int i8 = 0;
                            for (int i9 = 4; i7 < i9; i9 = 4) {
                                i8 = (i8 << 8) | (byteBuffer2.get(i7) & 255);
                                i7++;
                            }
                            int m6064b = C6697g0.m6064b(i8);
                            if (m6064b == -1) {
                                c7018k.f12383c = true;
                                c7018k.f12382b = 0L;
                                c7018k.f12381a = decoderInputBuffer.f10906e;
                                Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                j = decoderInputBuffer.f10906e;
                            } else {
                                z = m6018f;
                                long max = Math.max(0L, ((c7018k.f12382b - 529) * 1000000) / c7003m0.f12301z) + c7018k.f12381a;
                                c7018k.f12382b += m6064b;
                                j = max;
                                long j2 = this.f12461v0;
                                C7018k c7018k2 = this.f12433e0;
                                C7003m0 c7003m02 = this.f12468z;
                                c7018k2.getClass();
                                c6744c = c6744c2;
                                this.f12461v0 = Math.max(j2, Math.max(0L, ((c7018k2.f12382b - 529) * 1000000) / c7003m02.f12301z) + c7018k2.f12381a);
                            }
                        }
                        z = m6018f;
                        long j22 = this.f12461v0;
                        C7018k c7018k22 = this.f12433e0;
                        C7003m0 c7003m022 = this.f12468z;
                        c7018k22.getClass();
                        c6744c = c6744c2;
                        this.f12461v0 = Math.max(j22, Math.max(0L, ((c7018k22.f12382b - 529) * 1000000) / c7003m022.f12301z) + c7018k22.f12381a);
                    } else {
                        z = m6018f;
                        c6744c = c6744c2;
                    }
                    if (decoderInputBuffer.m6017g()) {
                        this.f12458u.add(Long.valueOf(j));
                    }
                    if (this.f12469z0) {
                        this.f12456t.m5118a(j, this.f12468z);
                        this.f12469z0 = false;
                    }
                    this.f12461v0 = Math.max(this.f12461v0, j);
                    decoderInputBuffer.m6019k();
                    if (decoderInputBuffer.m6018f(268435456)) {
                        mo4949V(decoderInputBuffer);
                    }
                    mo4941g0(decoderInputBuffer);
                    try {
                        if (z) {
                            this.f12413I.mo5546j(this.f12435g0, c6744c, j);
                        } else {
                            this.f12413I.mo5542n(this.f12435g0, decoderInputBuffer.f10904c.limit(), j, 0);
                        }
                        this.f12435g0 = -1;
                        decoderInputBuffer.f10904c = null;
                        this.f12455s0 = true;
                        this.f12449p0 = 0;
                        this.f12408F0.getClass();
                        return true;
                    } catch (MediaCodec.CryptoException e2) {
                        throw m5697w(C6622C.m6218a(e2.getErrorCode()), this.f12468z, e2, false);
                    }
                }
            } catch (DecoderInputBuffer.C6741a e3) {
                mo4948Z(e3);
                m5581j0(0);
                m5589N();
                return true;
            }
        }
    }

    /* renamed from: N */
    public final void m5589N() {
        try {
            this.f12413I.flush();
        } finally {
            mo4938m0();
        }
    }

    /* renamed from: O */
    public final boolean m5588O() {
        if (this.f12413I == null) {
            return false;
        }
        if (this.f12453r0 == 3 || this.f12424S || ((this.f12425T && !this.f12459u0) || (this.f12426U && this.f12457t0))) {
            m5580k0();
            return true;
        }
        m5589N();
        return false;
    }

    /* renamed from: P */
    public final List<C7024n> m5587P(boolean z) throws C7032u.C7034b {
        C7003m0 c7003m0 = this.f12468z;
        InterfaceC7028q interfaceC7028q = this.f12442m;
        List<C7024n> mo4951S = mo4951S(interfaceC7028q, c7003m0, z);
        if (mo4951S.isEmpty() && z) {
            mo4951S = mo4951S(interfaceC7028q, this.f12468z, false);
            if (!mo4951S.isEmpty()) {
                String str = this.f12468z.f12287l;
                String valueOf = String.valueOf(mo4951S);
                StringBuilder m9043a = C2745h.m9043a(valueOf.length() + C0552c.m12193a(str, 99), "Drm session requires secure decoder for ", str, ", but no secure decoder available. Trying to proceed with ", valueOf);
                m9043a.append(".");
                Log.w("MediaCodecRenderer", m9043a.toString());
            }
        }
        return mo4951S;
    }

    /* renamed from: Q */
    public boolean mo4953Q() {
        return false;
    }

    /* renamed from: R */
    public abstract float mo4952R(float f, C7003m0[] c7003m0Arr);

    /* renamed from: S */
    public abstract List<C7024n> mo4951S(InterfaceC7028q interfaceC7028q, C7003m0 c7003m0, boolean z) throws C7032u.C7034b;

    @Nullable
    /* renamed from: T */
    public final C6801v m5586T(DrmSession drmSession) throws ExoPlaybackException {
        InterfaceC6800u mo5974e = drmSession.mo5974e();
        if (mo5974e != null && !(mo5974e instanceof C6801v)) {
            String valueOf = String.valueOf(mo5974e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 42);
            sb.append("Expecting FrameworkMediaCrypto but found: ");
            sb.append(valueOf);
            throw m5697w(AdError.MEDIAVIEW_MISSING_ERROR_CODE, this.f12468z, new IllegalArgumentException(sb.toString()), false);
        }
        return (C6801v) mo5974e;
    }

    @Nullable
    /* renamed from: U */
    public abstract InterfaceC7019l.C7020a mo4950U(C7024n c7024n, C7003m0 c7003m0, @Nullable MediaCrypto mediaCrypto, float f);

    /* renamed from: V */
    public void mo4949V(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x015d, code lost:
        if ("stvm8".equals(r4) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016d, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r3) == false) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0176  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5585W(com.google.android.exoplayer2.mediacodec.C7024n r17, android.media.MediaCrypto r18) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.AbstractC7025o.m5585W(com.google.android.exoplayer2.mediacodec.n, android.media.MediaCrypto):void");
    }

    /* renamed from: X */
    public final void m5584X() throws ExoPlaybackException {
        C7003m0 c7003m0;
        boolean z;
        if (this.f12413I == null && !this.f12441l0 && (c7003m0 = this.f12468z) != null) {
            if (this.f12401C == null && mo5575q0(c7003m0)) {
                C7003m0 c7003m02 = this.f12468z;
                m5593J();
                String str = c7003m02.f12287l;
                boolean equals = "audio/mp4a-latm".equals(str);
                C7017j c7017j = this.f12454s;
                if (!equals && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
                    c7017j.getClass();
                    c7017j.f12380k = 1;
                } else {
                    c7017j.getClass();
                    c7017j.f12380k = 32;
                }
                this.f12441l0 = true;
                return;
            }
            m5576o0(this.f12401C);
            String str2 = this.f12468z.f12287l;
            DrmSession drmSession = this.f12399B;
            if (drmSession != null) {
                if (this.f12403D == null) {
                    C6801v m5586T = m5586T(drmSession);
                    if (m5586T == null) {
                        if (this.f12399B.getError() == null) {
                            return;
                        }
                    } else {
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(m5586T.f11050a, m5586T.f11051b);
                            this.f12403D = mediaCrypto;
                            if (!m5586T.f11052c && mediaCrypto.requiresSecureDecoderComponent(str2)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.f12405E = z;
                        } catch (MediaCryptoException e) {
                            throw m5697w(6006, this.f12468z, e, false);
                        }
                    }
                }
                if (C6801v.f11049d) {
                    int state = this.f12399B.getState();
                    if (state != 1) {
                        if (state != 4) {
                            return;
                        }
                    } else {
                        DrmSession.C6760a error = this.f12399B.getError();
                        error.getClass();
                        throw m5697w(error.f10978a, this.f12468z, error, false);
                    }
                }
            }
            try {
                m5583Y(this.f12403D, this.f12405E);
            } catch (C7026a e2) {
                throw m5697w(4001, this.f12468z, e2, false);
            }
        }
    }

    /* renamed from: Y */
    public final void m5583Y(MediaCrypto mediaCrypto, boolean z) throws C7026a {
        String str;
        if (this.f12419N == null) {
            try {
                List<C7024n> m5587P = m5587P(z);
                ArrayDeque<C7024n> arrayDeque = new ArrayDeque<>();
                this.f12419N = arrayDeque;
                if (this.f12444n) {
                    arrayDeque.addAll(m5587P);
                } else if (!m5587P.isEmpty()) {
                    this.f12419N.add(m5587P.get(0));
                }
                this.f12420O = null;
            } catch (C7032u.C7034b e) {
                throw new C7026a(-49998, this.f12468z, e, z);
            }
        }
        if (!this.f12419N.isEmpty()) {
            while (this.f12413I == null) {
                C7024n peekFirst = this.f12419N.peekFirst();
                if (!mo4937p0(peekFirst)) {
                    return;
                }
                try {
                    m5585W(peekFirst, mediaCrypto);
                } catch (Exception e2) {
                    String valueOf = String.valueOf(peekFirst);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 30);
                    sb.append("Failed to initialize decoder: ");
                    sb.append(valueOf);
                    C7421n.m5055c("MediaCodecRenderer", sb.toString(), e2);
                    this.f12419N.removeFirst();
                    C7003m0 c7003m0 = this.f12468z;
                    String str2 = peekFirst.f12389a;
                    String valueOf2 = String.valueOf(c7003m0);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + C0552c.m12193a(str2, 23));
                    sb2.append("Decoder init failed: ");
                    sb2.append(str2);
                    sb2.append(", ");
                    sb2.append(valueOf2);
                    String sb3 = sb2.toString();
                    String str3 = c7003m0.f12287l;
                    if (C7408g0.f13905a >= 21 && (e2 instanceof MediaCodec.CodecException)) {
                        str = ((MediaCodec.CodecException) e2).getDiagnosticInfo();
                    } else {
                        str = null;
                    }
                    C7026a c7026a = new C7026a(sb3, e2, str3, z, peekFirst, str);
                    mo4948Z(c7026a);
                    C7026a c7026a2 = this.f12420O;
                    if (c7026a2 != null) {
                        c7026a = new C7026a(c7026a2.getMessage(), c7026a2.getCause(), c7026a2.f12470a, c7026a2.f12471b, c7026a2.f12472c, c7026a2.f12473d);
                    }
                    this.f12420O = c7026a;
                    if (this.f12419N.isEmpty()) {
                        throw this.f12420O;
                    }
                }
            }
            this.f12419N = null;
            return;
        }
        throw new C7026a(-49999, this.f12468z, null, z);
    }

    /* renamed from: Z */
    public abstract void mo4948Z(Exception exc);

    @Override // com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: a */
    public final int mo4921a(C7003m0 c7003m0) throws ExoPlaybackException {
        try {
            return mo4936r0(this.f12442m, c7003m0);
        } catch (C7032u.C7034b e) {
            throw m5696x(e, c7003m0);
        }
    }

    /* renamed from: a0 */
    public abstract void mo4947a0(long j, String str, long j2);

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: b */
    public boolean mo4920b() {
        return this.f12467y0;
    }

    /* renamed from: b0 */
    public abstract void mo4946b0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0115, code lost:
        if (m5592K() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0129, code lost:
        if (m5592K() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0141, code lost:
        if (r0 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0143, code lost:
        r12 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0088, code lost:
        if (r12 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e2, code lost:
        if (m5592K() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0107, code lost:
        if (r4.f12293r == r6.f12293r) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.decoder.DecoderReuseEvaluation mo4945c0(com.google.android.exoplayer2.C7121n0 r12) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.AbstractC7025o.mo4945c0(com.google.android.exoplayer2.n0):com.google.android.exoplayer2.decoder.DecoderReuseEvaluation");
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: d */
    public boolean mo4919d() {
        boolean mo5433d;
        boolean z;
        if (this.f12468z == null) {
            return false;
        }
        if (mo5708g()) {
            mo5433d = this.f12135j;
        } else {
            SampleStream sampleStream = this.f12131f;
            sampleStream.getClass();
            mo5433d = sampleStream.mo5433d();
        }
        if (!mo5433d) {
            if (this.f12436h0 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (this.f12434f0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f12434f0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d0 */
    public abstract void mo4944d0(C7003m0 c7003m0, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException;

    @CallSuper
    /* renamed from: e0 */
    public void mo4943e0(long j) {
        while (true) {
            int i = this.f12414I0;
            if (i == 0) {
                return;
            }
            long[] jArr = this.f12466y;
            if (j < jArr[0]) {
                return;
            }
            long[] jArr2 = this.f12462w;
            this.f12410G0 = jArr2[0];
            long[] jArr3 = this.f12464x;
            this.f12412H0 = jArr3[0];
            int i2 = i - 1;
            this.f12414I0 = i2;
            System.arraycopy(jArr2, 1, jArr2, 0, i2);
            System.arraycopy(jArr3, 1, jArr3, 0, this.f12414I0);
            System.arraycopy(jArr, 1, jArr, 0, this.f12414I0);
            mo4942f0();
        }
    }

    /* renamed from: f0 */
    public abstract void mo4942f0();

    /* renamed from: g0 */
    public abstract void mo4941g0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException;

    @TargetApi(23)
    /* renamed from: h0 */
    public final void m5582h0() throws ExoPlaybackException {
        int i = this.f12453r0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.f12467y0 = true;
                    mo5579l0();
                    return;
                }
                m5580k0();
                m5584X();
                return;
            }
            m5589N();
            m5573t0();
            return;
        }
        m5589N();
    }

    /* renamed from: i0 */
    public abstract boolean mo4940i0(long j, long j2, @Nullable InterfaceC7019l interfaceC7019l, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C7003m0 c7003m0) throws ExoPlaybackException;

    /* renamed from: j0 */
    public final boolean m5581j0(int i) throws ExoPlaybackException {
        C7121n0 c7121n0 = this.f12127b;
        c7121n0.m5503a();
        DecoderInputBuffer decoderInputBuffer = this.f12448p;
        decoderInputBuffer.mo5603h();
        int m5710F = m5710F(c7121n0, decoderInputBuffer, i | 4);
        if (m5710F == -5) {
            mo4945c0(c7121n0);
            return true;
        } else if (m5710F == -4 && decoderInputBuffer.m6018f(4)) {
            this.f12465x0 = true;
            m5582h0();
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.drm.DrmSession, android.media.MediaCrypto] */
    /* renamed from: k0 */
    public final void m5580k0() {
        try {
            InterfaceC7019l interfaceC7019l = this.f12413I;
            if (interfaceC7019l != null) {
                interfaceC7019l.release();
                this.f12408F0.getClass();
                mo4946b0(this.f12421P.f12389a);
            }
            this.f12413I = null;
            try {
                MediaCrypto mediaCrypto = this.f12403D;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f12413I = null;
            try {
                MediaCrypto mediaCrypto2 = this.f12403D;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h, com.google.android.exoplayer2.Renderer
    /* renamed from: l */
    public void mo4939l(float f, float f2) throws ExoPlaybackException {
        this.f12409G = f;
        this.f12411H = f2;
        m5574s0(this.f12415J);
    }

    /* renamed from: l0 */
    public void mo5579l0() throws ExoPlaybackException {
    }

    @CallSuper
    /* renamed from: m0 */
    public void mo4938m0() {
        this.f12435g0 = -1;
        this.f12450q.f10904c = null;
        this.f12436h0 = -1;
        this.f12437i0 = null;
        this.f12434f0 = -9223372036854775807L;
        this.f12457t0 = false;
        this.f12455s0 = false;
        this.f12430Y = false;
        this.f12431Z = false;
        this.f12438j0 = false;
        this.f12439k0 = false;
        this.f12458u.clear();
        this.f12461v0 = -9223372036854775807L;
        this.f12463w0 = -9223372036854775807L;
        C7018k c7018k = this.f12433e0;
        if (c7018k != null) {
            c7018k.f12381a = 0L;
            c7018k.f12382b = 0L;
            c7018k.f12383c = false;
        }
        this.f12451q0 = 0;
        this.f12453r0 = 0;
        this.f12449p0 = this.f12447o0 ? 1 : 0;
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h, com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: n */
    public final int mo5578n() {
        return 8;
    }

    @CallSuper
    /* renamed from: n0 */
    public final void m5577n0() {
        mo4938m0();
        this.f12406E0 = null;
        this.f12433e0 = null;
        this.f12419N = null;
        this.f12421P = null;
        this.f12415J = null;
        this.f12416K = null;
        this.f12417L = false;
        this.f12459u0 = false;
        this.f12418M = -1.0f;
        this.f12422Q = 0;
        this.f12423R = false;
        this.f12424S = false;
        this.f12425T = false;
        this.f12426U = false;
        this.f12427V = false;
        this.f12428W = false;
        this.f12429X = false;
        this.f12432d0 = false;
        this.f12447o0 = false;
        this.f12449p0 = 0;
        this.f12405E = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0063 A[LOOP:1: B:26:0x0043->B:36:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f A[LOOP:2: B:37:0x0064->B:47:0x007f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a A[Catch: IllegalStateException -> 0x009c, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x009c, blocks: (B:8:0x000f, B:10:0x0013, B:12:0x0017, B:14:0x001b, B:17:0x0023, B:19:0x002a, B:20:0x002f, B:48:0x0080, B:50:0x0097, B:51:0x0099, B:52:0x009a, B:23:0x0036, B:25:0x003a, B:26:0x0043, B:28:0x004e, B:30:0x0054, B:37:0x0064, B:39:0x006a, B:41:0x0070, B:49:0x0084), top: B:82:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0064 A[EDGE_INSN: B:84:0x0064->B:88:0x0064 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0080 A[EDGE_INSN: B:87:0x0080->B:48:0x0080 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo4918o(long r12, long r14) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.AbstractC7025o.mo4918o(long, long):void");
    }

    /* renamed from: o0 */
    public final void m5576o0(@Nullable DrmSession drmSession) {
        DrmSession drmSession2 = this.f12399B;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.mo5978a(null);
            }
            if (drmSession2 != null) {
                drmSession2.mo5977b(null);
            }
        }
        this.f12399B = drmSession;
    }

    /* renamed from: p0 */
    public boolean mo4937p0(C7024n c7024n) {
        return true;
    }

    /* renamed from: q0 */
    public boolean mo5575q0(C7003m0 c7003m0) {
        return false;
    }

    /* renamed from: r0 */
    public abstract int mo4936r0(InterfaceC7028q interfaceC7028q, C7003m0 c7003m0) throws C7032u.C7034b;

    /* renamed from: s0 */
    public final boolean m5574s0(C7003m0 c7003m0) throws ExoPlaybackException {
        if (C7408g0.f13905a >= 23 && this.f12413I != null && this.f12453r0 != 3 && this.f12130e != 0) {
            float f = this.f12411H;
            C7003m0[] c7003m0Arr = this.f12132g;
            c7003m0Arr.getClass();
            float mo4952R = mo4952R(f, c7003m0Arr);
            float f2 = this.f12418M;
            if (f2 == mo4952R) {
                return true;
            }
            if (mo4952R == -1.0f) {
                if (this.f12455s0) {
                    this.f12451q0 = 1;
                    this.f12453r0 = 3;
                    return false;
                }
                m5580k0();
                m5584X();
                return false;
            } else if (f2 == -1.0f && mo4952R <= this.f12446o) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", mo4952R);
                this.f12413I.mo5553c(bundle);
                this.f12418M = mo4952R;
            }
        }
        return true;
    }

    @RequiresApi(23)
    /* renamed from: t0 */
    public final void m5573t0() throws ExoPlaybackException {
        try {
            this.f12403D.setMediaDrmSession(m5586T(this.f12401C).f11051b);
            m5576o0(this.f12401C);
            this.f12451q0 = 0;
            this.f12453r0 = 0;
        } catch (MediaCryptoException e) {
            throw m5697w(6006, this.f12468z, e, false);
        }
    }

    /* renamed from: u0 */
    public final void m5572u0(long j) throws ExoPlaybackException {
        boolean z;
        C7003m0 m5113f;
        C7003m0 m5114e = this.f12456t.m5114e(j);
        if (m5114e == null && this.f12417L) {
            C7402d0<C7003m0> c7402d0 = this.f12456t;
            synchronized (c7402d0) {
                if (c7402d0.f13895d == 0) {
                    m5113f = null;
                } else {
                    m5113f = c7402d0.m5113f();
                }
            }
            m5114e = m5113f;
        }
        if (m5114e != null) {
            this.f12397A = m5114e;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.f12417L && this.f12397A != null)) {
            mo4944d0(this.f12397A, this.f12416K);
            this.f12417L = false;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: y */
    public void mo4916y() {
        this.f12468z = null;
        this.f12410G0 = -9223372036854775807L;
        this.f12412H0 = -9223372036854775807L;
        this.f12414I0 = 0;
        m5588O();
    }
}
