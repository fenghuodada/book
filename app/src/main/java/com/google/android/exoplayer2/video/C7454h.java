package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.coordinatorlayout.C0585a;
import com.google.android.exoplayer2.C6740d1;
import com.google.android.exoplayer2.C6970g1;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7121n0;
import com.google.android.exoplayer2.C7124p;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.RunnableC7442v;
import com.google.android.exoplayer2.audio.C6702h0;
import com.google.android.exoplayer2.decoder.C6747e;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.C6801v;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.InterfaceC6800u;
import com.google.android.exoplayer2.mediacodec.AbstractC7025o;
import com.google.android.exoplayer2.mediacodec.C7023m;
import com.google.android.exoplayer2.mediacodec.C7024n;
import com.google.android.exoplayer2.mediacodec.C7030s;
import com.google.android.exoplayer2.mediacodec.C7031t;
import com.google.android.exoplayer2.mediacodec.C7032u;
import com.google.android.exoplayer2.mediacodec.InterfaceC7019l;
import com.google.android.exoplayer2.mediacodec.InterfaceC7028q;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7421n;
import com.google.android.exoplayer2.util.C7424q;
import com.google.android.exoplayer2.video.C7459k;
import com.google.android.exoplayer2.video.InterfaceC7494v;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.video.h */
/* loaded from: classes.dex */
public final class C7454h extends AbstractC7025o {

    /* renamed from: t1 */
    public static final int[] f14038t1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: u1 */
    public static boolean f14039u1;

    /* renamed from: v1 */
    public static boolean f14040v1;

    /* renamed from: K0 */
    public final Context f14041K0;

    /* renamed from: L0 */
    public final C7459k f14042L0;

    /* renamed from: M0 */
    public final InterfaceC7494v.C7495a f14043M0;

    /* renamed from: N0 */
    public final long f14044N0;

    /* renamed from: O0 */
    public final int f14045O0;

    /* renamed from: P0 */
    public final boolean f14046P0;

    /* renamed from: Q0 */
    public C7455a f14047Q0;

    /* renamed from: R0 */
    public boolean f14048R0;

    /* renamed from: S0 */
    public boolean f14049S0;
    @Nullable

    /* renamed from: T0 */
    public Surface f14050T0;
    @Nullable

    /* renamed from: U0 */
    public C7448d f14051U0;

    /* renamed from: V0 */
    public boolean f14052V0;

    /* renamed from: W0 */
    public int f14053W0;

    /* renamed from: X0 */
    public boolean f14054X0;

    /* renamed from: Y0 */
    public boolean f14055Y0;

    /* renamed from: Z0 */
    public boolean f14056Z0;

    /* renamed from: a1 */
    public long f14057a1;

    /* renamed from: b1 */
    public long f14058b1;

    /* renamed from: c1 */
    public long f14059c1;

    /* renamed from: d1 */
    public int f14060d1;

    /* renamed from: e1 */
    public int f14061e1;

    /* renamed from: f1 */
    public int f14062f1;

    /* renamed from: g1 */
    public long f14063g1;

    /* renamed from: h1 */
    public long f14064h1;

    /* renamed from: i1 */
    public long f14065i1;

    /* renamed from: j1 */
    public int f14066j1;

    /* renamed from: k1 */
    public int f14067k1;

    /* renamed from: l1 */
    public int f14068l1;

    /* renamed from: m1 */
    public int f14069m1;

    /* renamed from: n1 */
    public float f14070n1;
    @Nullable

    /* renamed from: o1 */
    public C7496w f14071o1;

    /* renamed from: p1 */
    public boolean f14072p1;

    /* renamed from: q1 */
    public int f14073q1;
    @Nullable

    /* renamed from: r1 */
    public C7456b f14074r1;
    @Nullable

    /* renamed from: s1 */
    public InterfaceC7458j f14075s1;

    /* renamed from: com.google.android.exoplayer2.video.h$a */
    /* loaded from: classes.dex */
    public static final class C7455a {

        /* renamed from: a */
        public final int f14076a;

        /* renamed from: b */
        public final int f14077b;

        /* renamed from: c */
        public final int f14078c;

        public C7455a(int i, int i2, int i3) {
            this.f14076a = i;
            this.f14077b = i2;
            this.f14078c = i3;
        }
    }

    @RequiresApi(23)
    /* renamed from: com.google.android.exoplayer2.video.h$b */
    /* loaded from: classes.dex */
    public final class C7456b implements InterfaceC7019l.InterfaceC7022c, Handler.Callback {

        /* renamed from: a */
        public final Handler f14079a;

        public C7456b(InterfaceC7019l interfaceC7019l) {
            Handler m5097i = C7408g0.m5097i(this);
            this.f14079a = m5097i;
            interfaceC7019l.mo5549g(this, m5097i);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i = message.arg1;
            int i2 = message.arg2;
            int i3 = C7408g0.f13905a;
            long j = ((i & 4294967295L) << 32) | (4294967295L & i2);
            C7454h c7454h = C7454h.this;
            if (this == c7454h.f14074r1) {
                if (j == Long.MAX_VALUE) {
                    c7454h.f12398A0 = true;
                } else {
                    try {
                        c7454h.m5572u0(j);
                        c7454h.m4963C0();
                        c7454h.f12408F0.getClass();
                        c7454h.m4965B0();
                        c7454h.mo4943e0(j);
                    } catch (ExoPlaybackException e) {
                        c7454h.f12406E0 = e;
                    }
                }
            }
            return true;
        }
    }

    public C7454h(Context context, @Nullable Handler handler, @Nullable C6970g1.SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b) {
        super(2, 30.0f);
        this.f14044N0 = 5000L;
        this.f14045O0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f14041K0 = applicationContext;
        this.f14042L0 = new C7459k(applicationContext);
        this.f14043M0 = new InterfaceC7494v.C7495a(handler, surfaceHolder$CallbackC6972b);
        this.f14046P0 = "NVIDIA".equals(C7408g0.f13907c);
        this.f14058b1 = -9223372036854775807L;
        this.f14067k1 = -1;
        this.f14068l1 = -1;
        this.f14070n1 = -1.0f;
        this.f14053W0 = 1;
        this.f14073q1 = 0;
        this.f14071o1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x07dc, code lost:
        if (r1.equals("NX573J") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x083e, code lost:
        if (r1.equals("AFTN") == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:632:0x085a A[FALL_THROUGH] */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m4934w0(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 3068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.C7454h.m4934w0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
        if (r4.equals("video/hevc") == false) goto L17;
     */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m4933x0(com.google.android.exoplayer2.C7003m0 r10, com.google.android.exoplayer2.mediacodec.C7024n r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.C7454h.m4933x0(com.google.android.exoplayer2.m0, com.google.android.exoplayer2.mediacodec.n):int");
    }

    /* renamed from: y0 */
    public static List<C7024n> m4932y0(InterfaceC7028q interfaceC7028q, C7003m0 c7003m0, boolean z, boolean z2) throws C7032u.C7034b {
        Pair<Integer, Integer> m5567c;
        String str;
        String str2 = c7003m0.f12287l;
        if (str2 == null) {
            return Collections.emptyList();
        }
        List<C7024n> mo5571a = interfaceC7028q.mo5571a(str2, z, z2);
        Pattern pattern = C7032u.f12477a;
        ArrayList arrayList = new ArrayList(mo5571a);
        Collections.sort(arrayList, new C7031t(new C7030s(c7003m0)));
        if ("video/dolby-vision".equals(str2) && (m5567c = C7032u.m5567c(c7003m0)) != null) {
            int intValue = ((Integer) m5567c.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    str = "video/avc";
                }
            } else {
                str = "video/hevc";
            }
            arrayList.addAll(interfaceC7028q.mo5571a(str, z, z2));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: z0 */
    public static int m4930z0(C7003m0 c7003m0, C7024n c7024n) {
        if (c7003m0.f12288m != -1) {
            List<byte[]> list = c7003m0.f12289n;
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += list.get(i2).length;
            }
            return c7003m0.f12288m + i;
        }
        return m4933x0(c7003m0, c7024n);
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o, com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: A */
    public final void mo4923A(long j, boolean z) throws ExoPlaybackException {
        super.mo4923A(j, z);
        m4935v0();
        C7459k c7459k = this.f14042L0;
        c7459k.f14092l = 0L;
        c7459k.f14095o = -1L;
        c7459k.f14093m = -1L;
        long j2 = -9223372036854775807L;
        this.f14063g1 = -9223372036854775807L;
        this.f14057a1 = -9223372036854775807L;
        this.f14061e1 = 0;
        if (z) {
            long j3 = this.f14044N0;
            if (j3 > 0) {
                j2 = SystemClock.elapsedRealtime() + j3;
            }
            this.f14058b1 = j2;
            return;
        }
        this.f14058b1 = -9223372036854775807L;
    }

    /* renamed from: A0 */
    public final void m4967A0() {
        if (this.f14060d1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j = elapsedRealtime - this.f14059c1;
            final int i = this.f14060d1;
            final InterfaceC7494v.C7495a c7495a = this.f14043M0;
            Handler handler = c7495a.f14216a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC7494v.C7495a c7495a2 = c7495a;
                        c7495a2.getClass();
                        int i2 = C7408g0.f13905a;
                        c7495a2.f14217b.mo4894s(i, j);
                    }
                });
            }
            this.f14060d1 = 0;
            this.f14059c1 = elapsedRealtime;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    @TargetApi(17)
    /* renamed from: B */
    public final void mo4966B() {
        try {
            m5593J();
            m5580k0();
            DrmSession drmSession = this.f12401C;
            if (drmSession != null) {
                drmSession.mo5977b(null);
            }
            this.f12401C = null;
        } finally {
            C7448d c7448d = this.f14051U0;
            if (c7448d != null) {
                if (this.f14050T0 == c7448d) {
                    this.f14050T0 = null;
                }
                c7448d.release();
                this.f14051U0 = null;
            }
        }
    }

    /* renamed from: B0 */
    public final void m4965B0() {
        this.f14056Z0 = true;
        if (!this.f14054X0) {
            this.f14054X0 = true;
            Surface surface = this.f14050T0;
            InterfaceC7494v.C7495a c7495a = this.f14043M0;
            Handler handler = c7495a.f14216a;
            if (handler != null) {
                handler.post(new RunnableC7472s(c7495a, surface, SystemClock.elapsedRealtime()));
            }
            this.f14052V0 = true;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: C */
    public final void mo4964C() {
        this.f14060d1 = 0;
        this.f14059c1 = SystemClock.elapsedRealtime();
        this.f14064h1 = SystemClock.elapsedRealtime() * 1000;
        this.f14065i1 = 0L;
        this.f14066j1 = 0;
        C7459k c7459k = this.f14042L0;
        c7459k.f14084d = true;
        c7459k.f14092l = 0L;
        c7459k.f14095o = -1L;
        c7459k.f14093m = -1L;
        c7459k.m4928b(false);
    }

    /* renamed from: C0 */
    public final void m4963C0() {
        int i = this.f14067k1;
        if (i != -1 || this.f14068l1 != -1) {
            C7496w c7496w = this.f14071o1;
            if (c7496w == null || c7496w.f14219a != i || c7496w.f14220b != this.f14068l1 || c7496w.f14221c != this.f14069m1 || c7496w.f14222d != this.f14070n1) {
                C7496w c7496w2 = new C7496w(i, this.f14068l1, this.f14069m1, this.f14070n1);
                this.f14071o1 = c7496w2;
                InterfaceC7494v.C7495a c7495a = this.f14043M0;
                Handler handler = c7495a.f14216a;
                if (handler != null) {
                    handler.post(new RunnableC7469p(c7495a, c7496w2));
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: D */
    public final void mo4962D() {
        Surface surface;
        this.f14058b1 = -9223372036854775807L;
        m4967A0();
        final int i = this.f14066j1;
        if (i != 0) {
            final long j = this.f14065i1;
            final InterfaceC7494v.C7495a c7495a = this.f14043M0;
            Handler handler = c7495a.f14216a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC7494v.C7495a c7495a2 = c7495a;
                        c7495a2.getClass();
                        int i2 = C7408g0.f13905a;
                        c7495a2.f14217b.mo4895k(i, j);
                    }
                });
            }
            this.f14065i1 = 0L;
            this.f14066j1 = 0;
        }
        C7459k c7459k = this.f14042L0;
        c7459k.f14084d = false;
        if (C7408g0.f13905a >= 30 && (surface = c7459k.f14085e) != null && c7459k.f14088h != 0.0f) {
            c7459k.f14088h = 0.0f;
            try {
                surface.setFrameRate(0.0f, 0);
            } catch (IllegalStateException e) {
                C7421n.m5056b("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* renamed from: D0 */
    public final void m4961D0(InterfaceC7019l interfaceC7019l, int i) {
        m4963C0();
        C6702h0.m6062a("releaseOutputBuffer");
        interfaceC7019l.mo5548h(i, true);
        C6702h0.m6060c();
        this.f14064h1 = SystemClock.elapsedRealtime() * 1000;
        this.f12408F0.getClass();
        this.f14061e1 = 0;
        m4965B0();
    }

    @RequiresApi(21)
    /* renamed from: E0 */
    public final void m4960E0(InterfaceC7019l interfaceC7019l, int i, long j) {
        m4963C0();
        C6702h0.m6062a("releaseOutputBuffer");
        interfaceC7019l.mo5552d(i, j);
        C6702h0.m6060c();
        this.f14064h1 = SystemClock.elapsedRealtime() * 1000;
        this.f12408F0.getClass();
        this.f14061e1 = 0;
        m4965B0();
    }

    /* renamed from: F0 */
    public final boolean m4959F0(C7024n c7024n) {
        return C7408g0.f13905a >= 23 && !this.f14072p1 && !m4934w0(c7024n.f12389a) && (!c7024n.f12394f || C7448d.m4976c(this.f14041K0));
    }

    /* renamed from: G0 */
    public final void m4958G0(InterfaceC7019l interfaceC7019l, int i) {
        C6702h0.m6062a("skipVideoBuffer");
        interfaceC7019l.mo5548h(i, false);
        C6702h0.m6060c();
        this.f12408F0.getClass();
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: H */
    public final DecoderReuseEvaluation mo4957H(C7024n c7024n, C7003m0 c7003m0, C7003m0 c7003m02) {
        DecoderReuseEvaluation m5600b = c7024n.m5600b(c7003m0, c7003m02);
        C7455a c7455a = this.f14047Q0;
        int i = c7455a.f14076a;
        int i2 = c7003m02.f12292q;
        int i3 = m5600b.f10914e;
        if (i2 > i || c7003m02.f12293r > c7455a.f14077b) {
            i3 |= 256;
        }
        if (m4930z0(c7003m02, c7024n) > this.f14047Q0.f14078c) {
            i3 |= 64;
        }
        int i4 = i3;
        return new DecoderReuseEvaluation(c7024n.f12389a, c7003m0, c7003m02, i4 != 0 ? 0 : m5600b.f10913d, i4);
    }

    /* renamed from: H0 */
    public final void m4956H0(int i) {
        C6747e c6747e = this.f12408F0;
        c6747e.getClass();
        this.f14060d1 += i;
        int i2 = this.f14061e1 + i;
        this.f14061e1 = i2;
        c6747e.f10928a = Math.max(i2, c6747e.f10928a);
        int i3 = this.f14045O0;
        if (i3 <= 0 || this.f14060d1 < i3) {
            return;
        }
        m4967A0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: I */
    public final C7023m mo4955I(IllegalStateException illegalStateException, @Nullable C7024n c7024n) {
        return new C7453g(illegalStateException, c7024n, this.f14050T0);
    }

    /* renamed from: I0 */
    public final void m4954I0(long j) {
        this.f12408F0.getClass();
        this.f14065i1 += j;
        this.f14066j1++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: Q */
    public final boolean mo4953Q() {
        return this.f14072p1 && C7408g0.f13905a < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: R */
    public final float mo4952R(float f, C7003m0[] c7003m0Arr) {
        float f2 = -1.0f;
        for (C7003m0 c7003m0 : c7003m0Arr) {
            float f3 = c7003m0.f12294s;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: S */
    public final List<C7024n> mo4951S(InterfaceC7028q interfaceC7028q, C7003m0 c7003m0, boolean z) throws C7032u.C7034b {
        return m4932y0(interfaceC7028q, c7003m0, z, this.f14072p1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    @TargetApi(17)
    /* renamed from: U */
    public final InterfaceC7019l.C7020a mo4950U(C7024n c7024n, C7003m0 c7003m0, @Nullable MediaCrypto mediaCrypto, float f) {
        String str;
        int i;
        int i2;
        C7445b c7445b;
        C7455a c7455a;
        boolean z;
        int i3;
        int i4;
        Point point;
        float f2;
        int i5;
        int i6;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i7;
        boolean z2;
        int i8;
        boolean z3;
        Pair<Integer, Integer> m5567c;
        int m4933x0;
        C7448d c7448d = this.f14051U0;
        if (c7448d != null && c7448d.f14014a != c7024n.f12394f) {
            c7448d.release();
            this.f14051U0 = null;
        }
        String str2 = c7024n.f12391c;
        C7003m0[] c7003m0Arr = this.f12132g;
        c7003m0Arr.getClass();
        int i9 = c7003m0.f12292q;
        int m4930z0 = m4930z0(c7003m0, c7024n);
        int length = c7003m0Arr.length;
        float f3 = c7003m0.f12294s;
        int i10 = c7003m0.f12292q;
        C7445b c7445b2 = c7003m0.f12299x;
        int i11 = c7003m0.f12293r;
        if (length == 1) {
            if (m4930z0 != -1 && (m4933x0 = m4933x0(c7003m0, c7024n)) != -1) {
                m4930z0 = Math.min((int) (m4930z0 * 1.5f), m4933x0);
            }
            c7455a = new C7455a(i9, i11, m4930z0);
            str = str2;
            i = i11;
            i2 = i10;
            c7445b = c7445b2;
        } else {
            int length2 = c7003m0Arr.length;
            int i12 = i11;
            int i13 = 0;
            boolean z4 = false;
            while (i13 < length2) {
                C7003m0 c7003m02 = c7003m0Arr[i13];
                C7003m0[] c7003m0Arr2 = c7003m0Arr;
                if (c7445b2 != null && c7003m02.f12299x == null) {
                    C7003m0.C7005b c7005b = new C7003m0.C7005b(c7003m02);
                    c7005b.f12328w = c7445b2;
                    c7003m02 = new C7003m0(c7005b);
                }
                if (c7024n.m5600b(c7003m0, c7003m02).f10913d != 0) {
                    int i14 = c7003m02.f12293r;
                    i7 = length2;
                    int i15 = c7003m02.f12292q;
                    if (i15 != -1 && i14 != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    z4 |= z2;
                    int max = Math.max(i9, i15);
                    i12 = Math.max(i12, i14);
                    i9 = max;
                    m4930z0 = Math.max(m4930z0, m4930z0(c7003m02, c7024n));
                } else {
                    i7 = length2;
                }
                i13++;
                c7003m0Arr = c7003m0Arr2;
                length2 = i7;
            }
            if (z4) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i9);
                sb.append("x");
                sb.append(i12);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                if (i11 > i10) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i3 = i11;
                } else {
                    i3 = i10;
                }
                if (z) {
                    i4 = i10;
                } else {
                    i4 = i11;
                }
                c7445b = c7445b2;
                i = i11;
                float f4 = i4 / i3;
                int[] iArr = f14038t1;
                str = str2;
                i2 = i10;
                int i16 = 0;
                while (i16 < 9) {
                    int i17 = iArr[i16];
                    int[] iArr2 = iArr;
                    int i18 = (int) (i17 * f4);
                    if (i17 <= i3 || i18 <= i4) {
                        break;
                    }
                    int i19 = i3;
                    int i20 = i4;
                    if (C7408g0.f13905a >= 21) {
                        if (z) {
                            i6 = i18;
                        } else {
                            i6 = i17;
                        }
                        if (!z) {
                            i17 = i18;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = c7024n.f12392d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f2 = f4;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f2 = f4;
                            point2 = new Point((((i6 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i17 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                        }
                        if (c7024n.m5597e(point2.x, point2.y, f3)) {
                            point = point2;
                            break;
                        }
                        i16++;
                        iArr = iArr2;
                        i3 = i19;
                        i4 = i20;
                        f4 = f2;
                    } else {
                        f2 = f4;
                        try {
                            int i21 = (((i17 + 16) - 1) / 16) * 16;
                            int i22 = (((i18 + 16) - 1) / 16) * 16;
                            if (i21 * i22 <= C7032u.m5562h()) {
                                if (z) {
                                    i5 = i22;
                                } else {
                                    i5 = i21;
                                }
                                if (!z) {
                                    i21 = i22;
                                }
                                point = new Point(i5, i21);
                            } else {
                                i16++;
                                iArr = iArr2;
                                i3 = i19;
                                i4 = i20;
                                f4 = f2;
                            }
                        } catch (C7032u.C7034b unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i9 = Math.max(i9, point.x);
                    i12 = Math.max(i12, point.y);
                    C7003m0.C7005b c7005b2 = new C7003m0.C7005b(c7003m0);
                    c7005b2.f12321p = i9;
                    c7005b2.f12322q = i12;
                    m4930z0 = Math.max(m4930z0, m4933x0(new C7003m0(c7005b2), c7024n));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i9);
                    sb2.append("x");
                    sb2.append(i12);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            } else {
                str = str2;
                i = i11;
                i2 = i10;
                c7445b = c7445b2;
            }
            c7455a = new C7455a(i9, i12, m4930z0);
        }
        this.f14047Q0 = c7455a;
        if (this.f14072p1) {
            i8 = this.f14073q1;
        } else {
            i8 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        C0585a.m12129c(mediaFormat, c7003m0.f12289n);
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        C0585a.m12130b(mediaFormat, "rotation-degrees", c7003m0.f12295t);
        if (c7445b != null) {
            C7445b c7445b3 = c7445b;
            C0585a.m12130b(mediaFormat, "color-transfer", c7445b3.f14008c);
            C0585a.m12130b(mediaFormat, "color-standard", c7445b3.f14006a);
            C0585a.m12130b(mediaFormat, "color-range", c7445b3.f14007b);
            byte[] bArr = c7445b3.f14009d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c7003m0.f12287l) && (m5567c = C7032u.m5567c(c7003m0)) != null) {
            C0585a.m12130b(mediaFormat, Scopes.PROFILE, ((Integer) m5567c.first).intValue());
        }
        mediaFormat.setInteger("max-width", c7455a.f14076a);
        mediaFormat.setInteger("max-height", c7455a.f14077b);
        C0585a.m12130b(mediaFormat, "max-input-size", c7455a.f14078c);
        if (C7408g0.f13905a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.f14046P0) {
            z3 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z3 = true;
        }
        if (i8 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z3);
            mediaFormat.setInteger("audio-session-id", i8);
        }
        if (this.f14050T0 == null) {
            if (m4959F0(c7024n)) {
                if (this.f14051U0 == null) {
                    this.f14051U0 = C7448d.m4975d(this.f14041K0, c7024n.f12394f);
                }
                this.f14050T0 = this.f14051U0;
            } else {
                throw new IllegalStateException();
            }
        }
        return new InterfaceC7019l.C7020a(c7024n, mediaFormat, this.f14050T0, mediaCrypto);
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    @TargetApi(29)
    /* renamed from: V */
    public final void mo4949V(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (!this.f14049S0) {
            return;
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f10907f;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b = byteBuffer.get();
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            byteBuffer.position(0);
            if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                byteBuffer.position(0);
                InterfaceC7019l interfaceC7019l = this.f12413I;
                Bundle bundle = new Bundle();
                bundle.putByteArray("hdr10-plus-info", bArr);
                interfaceC7019l.mo5553c(bundle);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: Z */
    public final void mo4948Z(Exception exc) {
        C7421n.m5056b("MediaCodecVideoRenderer", "Video codec error", exc);
        InterfaceC7494v.C7495a c7495a = this.f14043M0;
        Handler handler = c7495a.f14216a;
        if (handler != null) {
            handler.post(new RunnableC7442v(1, c7495a, exc));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: a0 */
    public final void mo4947a0(final long j, final String str, final long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        final InterfaceC7494v.C7495a c7495a = this.f14043M0;
        Handler handler = c7495a.f14216a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.u
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    InterfaceC7494v interfaceC7494v = InterfaceC7494v.C7495a.this.f14217b;
                    int i = C7408g0.f13905a;
                    interfaceC7494v.mo4893t(j3, str2, j4);
                }
            });
        }
        this.f14048R0 = m4934w0(str);
        C7024n c7024n = this.f12421P;
        c7024n.getClass();
        boolean z = false;
        if (C7408g0.f13905a >= 29 && "video/x-vnd.on2.vp9".equals(c7024n.f12390b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c7024n.f12392d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f14049S0 = z;
        if (C7408g0.f13905a >= 23 && this.f14072p1) {
            InterfaceC7019l interfaceC7019l = this.f12413I;
            interfaceC7019l.getClass();
            this.f14074r1 = new C7456b(interfaceC7019l);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: b0 */
    public final void mo4946b0(final String str) {
        final InterfaceC7494v.C7495a c7495a = this.f14043M0;
        Handler handler = c7495a.f14216a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.o
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC7494v.C7495a c7495a2 = InterfaceC7494v.C7495a.this;
                    c7495a2.getClass();
                    int i = C7408g0.f13905a;
                    c7495a2.f14217b.mo4896i(str);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    @Nullable
    /* renamed from: c0 */
    public final DecoderReuseEvaluation mo4945c0(C7121n0 c7121n0) throws ExoPlaybackException {
        final DecoderReuseEvaluation mo4945c0 = super.mo4945c0(c7121n0);
        final C7003m0 c7003m0 = c7121n0.f12634b;
        final InterfaceC7494v.C7495a c7495a = this.f14043M0;
        Handler handler = c7495a.f14216a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.r
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC7494v.C7495a c7495a2 = InterfaceC7494v.C7495a.this;
                    c7495a2.getClass();
                    int i = C7408g0.f13905a;
                    InterfaceC7494v interfaceC7494v = c7495a2.f14217b;
                    interfaceC7494v.mo4897e();
                    interfaceC7494v.mo4902C(c7003m0, mo4945c0);
                }
            });
        }
        return mo4945c0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o, com.google.android.exoplayer2.Renderer
    /* renamed from: d */
    public final boolean mo4919d() {
        C7448d c7448d;
        if (super.mo4919d() && (this.f14054X0 || (((c7448d = this.f14051U0) != null && this.f14050T0 == c7448d) || this.f12413I == null || this.f14072p1))) {
            this.f14058b1 = -9223372036854775807L;
            return true;
        } else if (this.f14058b1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f14058b1) {
                return true;
            }
            this.f14058b1 = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: d0 */
    public final void mo4944d0(C7003m0 c7003m0, @Nullable MediaFormat mediaFormat) {
        boolean z;
        int integer;
        int integer2;
        InterfaceC7019l interfaceC7019l = this.f12413I;
        if (interfaceC7019l != null) {
            interfaceC7019l.mo5547i(this.f14053W0);
        }
        if (this.f14072p1) {
            this.f14067k1 = c7003m0.f12292q;
            this.f14068l1 = c7003m0.f12293r;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f14067k1 = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f14068l1 = integer2;
        }
        float f = c7003m0.f12296u;
        this.f14070n1 = f;
        int i = C7408g0.f13905a;
        int i2 = c7003m0.f12295t;
        if (i >= 21) {
            if (i2 == 90 || i2 == 270) {
                int i3 = this.f14067k1;
                this.f14067k1 = this.f14068l1;
                this.f14068l1 = i3;
                this.f14070n1 = 1.0f / f;
            }
        } else {
            this.f14069m1 = i2;
        }
        C7459k c7459k = this.f14042L0;
        c7459k.f14086f = c7003m0.f12294s;
        C7450e c7450e = c7459k.f14081a;
        c7450e.f14022a.m4969c();
        c7450e.f14023b.m4969c();
        c7450e.f14024c = false;
        c7450e.f14025d = -9223372036854775807L;
        c7450e.f14026e = 0;
        c7459k.m4929a();
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    @CallSuper
    /* renamed from: e0 */
    public final void mo4943e0(long j) {
        super.mo4943e0(j);
        if (this.f14072p1) {
            return;
        }
        this.f14062f1--;
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: f0 */
    public final void mo4942f0() {
        m4935v0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    @CallSuper
    /* renamed from: g0 */
    public final void mo4941g0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z = this.f14072p1;
        if (!z) {
            this.f14062f1++;
        }
        if (C7408g0.f13905a < 23 && z) {
            long j = decoderInputBuffer.f10906e;
            m5572u0(j);
            m4963C0();
            this.f12408F0.getClass();
            m4965B0();
            mo4943e0(j);
        }
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
        if ((r9 == 0 ? false : r1.f14033g[(int) ((r9 - 1) % 15)]) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0131, code lost:
        if ((((r5 > (-30000) ? 1 : (r5 == (-30000) ? 0 : -1)) < 0) && r11 > 100000) != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015f  */
    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo4940i0(long r27, long r29, @androidx.annotation.Nullable com.google.android.exoplayer2.mediacodec.InterfaceC7019l r31, @androidx.annotation.Nullable java.nio.ByteBuffer r32, int r33, int r34, int r35, long r36, boolean r38, boolean r39, com.google.android.exoplayer2.C7003m0 r40) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.C7454h.mo4940i0(long, long, com.google.android.exoplayer2.mediacodec.l, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.exoplayer2.m0):boolean");
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o, com.google.android.exoplayer2.AbstractC6974h, com.google.android.exoplayer2.Renderer
    /* renamed from: l */
    public final void mo4939l(float f, float f2) throws ExoPlaybackException {
        super.mo4939l(f, f2);
        C7459k c7459k = this.f14042L0;
        c7459k.f14089i = f;
        c7459k.f14092l = 0L;
        c7459k.f14095o = -1L;
        c7459k.f14093m = -1L;
        c7459k.m4928b(false);
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    @CallSuper
    /* renamed from: m0 */
    public final void mo4938m0() {
        super.mo4938m0();
        this.f14062f1 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [android.view.Surface] */
    @Override // com.google.android.exoplayer2.AbstractC6974h, com.google.android.exoplayer2.C6733b1.InterfaceC6735b
    /* renamed from: p */
    public final void mo4917p(int i, @Nullable Object obj) throws ExoPlaybackException {
        C7448d c7448d;
        Handler handler;
        C7448d c7448d2;
        long j;
        Handler handler2;
        int intValue;
        if (i != 1) {
            if (i != 4) {
                if (i != 6) {
                    if (i == 102 && this.f14073q1 != (intValue = ((Integer) obj).intValue())) {
                        this.f14073q1 = intValue;
                        if (this.f14072p1) {
                            m5580k0();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f14075s1 = (InterfaceC7458j) obj;
                return;
            }
            int intValue2 = ((Integer) obj).intValue();
            this.f14053W0 = intValue2;
            InterfaceC7019l interfaceC7019l = this.f12413I;
            if (interfaceC7019l != null) {
                interfaceC7019l.mo5547i(intValue2);
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            c7448d = (Surface) obj;
        } else {
            c7448d = null;
        }
        if (c7448d == null) {
            C7448d c7448d3 = this.f14051U0;
            if (c7448d3 != null) {
                c7448d = c7448d3;
            } else {
                C7024n c7024n = this.f12421P;
                if (c7024n != null && m4959F0(c7024n)) {
                    c7448d = C7448d.m4975d(this.f14041K0, c7024n.f12394f);
                    this.f14051U0 = c7448d;
                }
            }
        }
        Surface surface = this.f14050T0;
        InterfaceC7494v.C7495a c7495a = this.f14043M0;
        if (surface != c7448d) {
            this.f14050T0 = c7448d;
            C7459k c7459k = this.f14042L0;
            c7459k.getClass();
            if (c7448d instanceof C7448d) {
                c7448d2 = null;
            } else {
                c7448d2 = c7448d;
            }
            Surface surface2 = c7459k.f14085e;
            if (surface2 != c7448d2) {
                if (C7408g0.f13905a >= 30 && surface2 != null && c7459k.f14088h != 0.0f) {
                    c7459k.f14088h = 0.0f;
                    try {
                        surface2.setFrameRate(0.0f, 0);
                    } catch (IllegalStateException e) {
                        C7421n.m5056b("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
                    }
                }
                c7459k.f14085e = c7448d2;
                c7459k.m4928b(true);
            }
            this.f14052V0 = false;
            int i2 = this.f12130e;
            InterfaceC7019l interfaceC7019l2 = this.f12413I;
            if (interfaceC7019l2 != null) {
                if (C7408g0.f13905a >= 23 && c7448d != null && !this.f14048R0) {
                    interfaceC7019l2.mo5544l(c7448d);
                } else {
                    m5580k0();
                    m5584X();
                }
            }
            if (c7448d != null && c7448d != this.f14051U0) {
                C7496w c7496w = this.f14071o1;
                if (c7496w != null && (handler2 = c7495a.f14216a) != null) {
                    handler2.post(new RunnableC7469p(c7495a, c7496w));
                }
                m4935v0();
                if (i2 == 2) {
                    long j2 = this.f14044N0;
                    if (j2 > 0) {
                        j = SystemClock.elapsedRealtime() + j2;
                    } else {
                        j = -9223372036854775807L;
                    }
                    this.f14058b1 = j;
                    return;
                }
                return;
            }
            this.f14071o1 = null;
            m4935v0();
        } else if (c7448d != null && c7448d != this.f14051U0) {
            C7496w c7496w2 = this.f14071o1;
            if (c7496w2 != null && (handler = c7495a.f14216a) != null) {
                handler.post(new RunnableC7469p(c7495a, c7496w2));
            }
            if (this.f14052V0) {
                Surface surface3 = this.f14050T0;
                Handler handler3 = c7495a.f14216a;
                if (handler3 != null) {
                    handler3.post(new RunnableC7472s(c7495a, surface3, SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: p0 */
    public final boolean mo4937p0(C7024n c7024n) {
        return this.f14050T0 != null || m4959F0(c7024n);
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: r0 */
    public final int mo4936r0(InterfaceC7028q interfaceC7028q, C7003m0 c7003m0) throws C7032u.C7034b {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3 = 0;
        if (!C7424q.m5040j(c7003m0.f12287l)) {
            return 0;
        }
        if (c7003m0.f12290o != null) {
            z = true;
        } else {
            z = false;
        }
        List<C7024n> m4932y0 = m4932y0(interfaceC7028q, c7003m0, z, false);
        if (z && m4932y0.isEmpty()) {
            m4932y0 = m4932y0(interfaceC7028q, c7003m0, false, false);
        }
        if (m4932y0.isEmpty()) {
            return 1;
        }
        Class<? extends InterfaceC6800u> cls = c7003m0.f12274E;
        if (cls != null && !C6801v.class.equals(cls)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return 2;
        }
        C7024n c7024n = m4932y0.get(0);
        boolean m5599c = c7024n.m5599c(c7003m0);
        if (c7024n.m5598d(c7003m0)) {
            i = 16;
        } else {
            i = 8;
        }
        if (m5599c) {
            List<C7024n> m4932y02 = m4932y0(interfaceC7028q, c7003m0, z, true);
            if (!m4932y02.isEmpty()) {
                C7024n c7024n2 = m4932y02.get(0);
                if (c7024n2.m5599c(c7003m0) && c7024n2.m5598d(c7003m0)) {
                    i3 = 32;
                }
            }
        }
        if (m5599c) {
            i2 = 4;
        } else {
            i2 = 3;
        }
        return i2 | i | i3;
    }

    /* renamed from: v0 */
    public final void m4935v0() {
        InterfaceC7019l interfaceC7019l;
        this.f14054X0 = false;
        if (C7408g0.f13905a >= 23 && this.f14072p1 && (interfaceC7019l = this.f12413I) != null) {
            this.f14074r1 = new C7456b(interfaceC7019l);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o, com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: y */
    public final void mo4916y() {
        InterfaceC7494v.C7495a c7495a = this.f14043M0;
        this.f14071o1 = null;
        m4935v0();
        this.f14052V0 = false;
        C7459k c7459k = this.f14042L0;
        C7459k.InterfaceC7460a interfaceC7460a = c7459k.f14082b;
        if (interfaceC7460a != null) {
            interfaceC7460a.unregister();
            C7459k.Choreographer$FrameCallbackC7464d choreographer$FrameCallbackC7464d = c7459k.f14083c;
            choreographer$FrameCallbackC7464d.getClass();
            choreographer$FrameCallbackC7464d.f14102b.sendEmptyMessage(2);
        }
        this.f14074r1 = null;
        try {
            super.mo4916y();
            C6747e c6747e = this.f12408F0;
            c7495a.getClass();
            synchronized (c6747e) {
            }
            Handler handler = c7495a.f14216a;
            if (handler != null) {
                handler.post(new RunnableC7466m(c7495a, c6747e));
            }
        } catch (Throwable th) {
            c7495a.m4892a(this.f12408F0);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: z */
    public final void mo4931z(boolean z, boolean z2) throws ExoPlaybackException {
        boolean z3;
        this.f12408F0 = new C6747e();
        C6740d1 c6740d1 = this.f12128c;
        c6740d1.getClass();
        boolean z4 = c6740d1.f10902a;
        if (z4 && this.f14073q1 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        C7394a.m5131d(z3);
        if (this.f14072p1 != z4) {
            this.f14072p1 = z4;
            m5580k0();
        }
        final C6747e c6747e = this.f12408F0;
        final InterfaceC7494v.C7495a c7495a = this.f14043M0;
        Handler handler = c7495a.f14216a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.n
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC7494v.C7495a c7495a2 = InterfaceC7494v.C7495a.this;
                    c7495a2.getClass();
                    int i = C7408g0.f13905a;
                    c7495a2.f14217b.mo4903B(c6747e);
                }
            });
        }
        C7459k c7459k = this.f14042L0;
        C7459k.InterfaceC7460a interfaceC7460a = c7459k.f14082b;
        if (interfaceC7460a != null) {
            C7459k.Choreographer$FrameCallbackC7464d choreographer$FrameCallbackC7464d = c7459k.f14083c;
            choreographer$FrameCallbackC7464d.getClass();
            choreographer$FrameCallbackC7464d.f14102b.sendEmptyMessage(1);
            interfaceC7460a.mo4927a(new C7124p(c7459k));
        }
        this.f14055Y0 = z2;
        this.f14056Z0 = false;
    }
}
