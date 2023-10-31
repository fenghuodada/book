package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C6633a1;
import com.google.android.exoplayer2.C6740d1;
import com.google.android.exoplayer2.C6970g1;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7121n0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.InterfaceC6718s;
import com.google.android.exoplayer2.decoder.C6747e;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.AbstractC7025o;
import com.google.android.exoplayer2.mediacodec.C7024n;
import com.google.android.exoplayer2.mediacodec.C7030s;
import com.google.android.exoplayer2.mediacodec.C7031t;
import com.google.android.exoplayer2.mediacodec.C7032u;
import com.google.android.exoplayer2.mediacodec.InterfaceC7019l;
import com.google.android.exoplayer2.mediacodec.InterfaceC7028q;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7421n;
import com.google.android.exoplayer2.util.InterfaceC7423p;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.audio.f0 */
/* loaded from: classes.dex */
public final class C6694f0 extends AbstractC7025o implements InterfaceC7423p {

    /* renamed from: K0 */
    public final Context f10705K0;

    /* renamed from: L0 */
    public final InterfaceC6718s.C6719a f10706L0;

    /* renamed from: M0 */
    public final AudioSink f10707M0;

    /* renamed from: N0 */
    public int f10708N0;

    /* renamed from: O0 */
    public boolean f10709O0;
    @Nullable

    /* renamed from: P0 */
    public C7003m0 f10710P0;

    /* renamed from: Q0 */
    public long f10711Q0;

    /* renamed from: R0 */
    public boolean f10712R0;

    /* renamed from: S0 */
    public boolean f10713S0;

    /* renamed from: T0 */
    public boolean f10714T0;
    @Nullable

    /* renamed from: U0 */
    public Renderer.InterfaceC6630a f10715U0;

    /* renamed from: com.google.android.exoplayer2.audio.f0$a */
    /* loaded from: classes.dex */
    public final class C6695a implements AudioSink.InterfaceC6669c {
        public C6695a() {
        }

        /* renamed from: a */
        public final void m6066a(final Exception exc) {
            C7421n.m5056b("MediaCodecAudioRenderer", "Audio sink error", exc);
            final InterfaceC6718s.C6719a c6719a = C6694f0.this.f10706L0;
            Handler handler = c6719a.f10818a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6718s.C6719a c6719a2 = InterfaceC6718s.C6719a.this;
                        c6719a2.getClass();
                        int i = C7408g0.f13905a;
                        c6719a2.f10819b.mo5711y(exc);
                    }
                });
            }
        }
    }

    public C6694f0(Context context, @Nullable Handler handler, @Nullable C6970g1.SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b, DefaultAudioSink defaultAudioSink) {
        super(1, 44100.0f);
        this.f10705K0 = context.getApplicationContext();
        this.f10707M0 = defaultAudioSink;
        this.f10706L0 = new InterfaceC6718s.C6719a(handler, surfaceHolder$CallbackC6972b);
        defaultAudioSink.f10643p = new C6695a();
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o, com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: A */
    public final void mo4923A(long j, boolean z) throws ExoPlaybackException {
        super.mo4923A(j, z);
        this.f10707M0.flush();
        this.f10711Q0 = j;
        this.f10712R0 = true;
        this.f10713S0 = true;
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: B */
    public final void mo4966B() {
        AudioSink audioSink = this.f10707M0;
        try {
            m5593J();
            m5580k0();
            DrmSession drmSession = this.f12401C;
            if (drmSession != null) {
                drmSession.mo5977b(null);
            }
            this.f12401C = null;
        } finally {
            if (this.f10714T0) {
                this.f10714T0 = false;
                audioSink.reset();
            }
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: C */
    public final void mo4964C() {
        this.f10707M0.mo6099p();
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: D */
    public final void mo4962D() {
        m6067w0();
        this.f10707M0.pause();
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: H */
    public final DecoderReuseEvaluation mo4957H(C7024n c7024n, C7003m0 c7003m0, C7003m0 c7003m02) {
        DecoderReuseEvaluation m5600b = c7024n.m5600b(c7003m0, c7003m02);
        int m6068v0 = m6068v0(c7003m02, c7024n);
        int i = this.f10708N0;
        int i2 = m5600b.f10914e;
        if (m6068v0 > i) {
            i2 |= 64;
        }
        int i3 = i2;
        return new DecoderReuseEvaluation(c7024n.f12389a, c7003m0, c7003m02, i3 != 0 ? 0 : m5600b.f10913d, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: R */
    public final float mo4952R(float f, C7003m0[] c7003m0Arr) {
        int i = -1;
        for (C7003m0 c7003m0 : c7003m0Arr) {
            int i2 = c7003m0.f12301z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * i;
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: S */
    public final List<C7024n> mo4951S(InterfaceC7028q interfaceC7028q, C7003m0 c7003m0, boolean z) throws C7032u.C7034b {
        C7024n c7024n;
        String str = c7003m0.f12287l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f10707M0.mo6114a(c7003m0)) {
            List<C7024n> m5566d = C7032u.m5566d("audio/raw", false, false);
            if (m5566d.isEmpty()) {
                c7024n = null;
            } else {
                c7024n = m5566d.get(0);
            }
            if (c7024n != null) {
                return Collections.singletonList(c7024n);
            }
        }
        List<C7024n> mo5571a = interfaceC7028q.mo5571a(str, z, false);
        Pattern pattern = C7032u.f12477a;
        ArrayList arrayList = new ArrayList(mo5571a);
        Collections.sort(arrayList, new C7031t(new C7030s(c7003m0)));
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(interfaceC7028q.mo5571a("audio/eac3", z, false));
            arrayList = arrayList2;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0102  */
    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.mediacodec.InterfaceC7019l.C7020a mo4950U(com.google.android.exoplayer2.mediacodec.C7024n r9, com.google.android.exoplayer2.C7003m0 r10, @androidx.annotation.Nullable android.media.MediaCrypto r11, float r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C6694f0.mo4950U(com.google.android.exoplayer2.mediacodec.n, com.google.android.exoplayer2.m0, android.media.MediaCrypto, float):com.google.android.exoplayer2.mediacodec.l$a");
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: Z */
    public final void mo4948Z(final Exception exc) {
        C7421n.m5056b("MediaCodecAudioRenderer", "Audio codec error", exc);
        final InterfaceC6718s.C6719a c6719a = this.f10706L0;
        Handler handler = c6719a.f10818a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.o
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC6718s.C6719a c6719a2 = InterfaceC6718s.C6719a.this;
                    c6719a2.getClass();
                    int i = C7408g0.f13905a;
                    c6719a2.f10819b.mo5719F(exc);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: a0 */
    public final void mo4947a0(final long j, final String str, final long j2) {
        final InterfaceC6718s.C6719a c6719a = this.f10706L0;
        Handler handler = c6719a.f10818a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.p
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    InterfaceC6718s interfaceC6718s = InterfaceC6718s.C6719a.this.f10819b;
                    int i = C7408g0.f13905a;
                    interfaceC6718s.mo5712x(j3, str2, j4);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o, com.google.android.exoplayer2.Renderer
    /* renamed from: b */
    public final boolean mo4920b() {
        if (this.f12467y0 && this.f10707M0.mo6113b()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: b0 */
    public final void mo4946b0(final String str) {
        final InterfaceC6718s.C6719a c6719a = this.f10706L0;
        Handler handler = c6719a.f10818a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.i
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC6718s.C6719a c6719a2 = InterfaceC6718s.C6719a.this;
                    c6719a2.getClass();
                    int i = C7408g0.f13905a;
                    c6719a2.f10819b.mo5714q(str);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7423p
    /* renamed from: c */
    public final C6633a1 mo5052c() {
        return this.f10707M0.mo6112c();
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    @Nullable
    /* renamed from: c0 */
    public final DecoderReuseEvaluation mo4945c0(C7121n0 c7121n0) throws ExoPlaybackException {
        final DecoderReuseEvaluation mo4945c0 = super.mo4945c0(c7121n0);
        final C7003m0 c7003m0 = c7121n0.f12634b;
        final InterfaceC6718s.C6719a c6719a = this.f10706L0;
        Handler handler = c6719a.f10818a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.j
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC6718s.C6719a c6719a2 = InterfaceC6718s.C6719a.this;
                    c6719a2.getClass();
                    int i = C7408g0.f13905a;
                    InterfaceC6718s interfaceC6718s = c6719a2.f10819b;
                    interfaceC6718s.mo5717d();
                    interfaceC6718s.mo5713u(c7003m0, mo4945c0);
                }
            });
        }
        return mo4945c0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o, com.google.android.exoplayer2.Renderer
    /* renamed from: d */
    public final boolean mo4919d() {
        return this.f10707M0.mo6107h() || super.mo4919d();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[LOOP:0: B:30:0x0080->B:31:0x0082, LOOP_END] */
    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo4944d0(com.google.android.exoplayer2.C7003m0 r6, @androidx.annotation.Nullable android.media.MediaFormat r7) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r5 = this;
            com.google.android.exoplayer2.m0 r0 = r5.f10710P0
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L9
            r6 = r0
            goto L89
        L9:
            com.google.android.exoplayer2.mediacodec.l r0 = r5.f12413I
            if (r0 != 0) goto Lf
            goto L89
        Lf:
            java.lang.String r0 = r6.f12287l
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1a
            goto L46
        L1a:
            int r0 = com.google.android.exoplayer2.util.C7408g0.f13905a
            r4 = 24
            if (r0 < r4) goto L2d
            java.lang.String r0 = "pcm-encoding"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L2d
            int r0 = r7.getInteger(r0)
            goto L4a
        L2d:
            java.lang.String r0 = "v-bits-per-sample"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L3e
            int r0 = r7.getInteger(r0)
            int r0 = com.google.android.exoplayer2.util.C7408g0.m5092n(r0)
            goto L4a
        L3e:
            java.lang.String r0 = r6.f12287l
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L49
        L46:
            int r0 = r6.f12270A
            goto L4a
        L49:
            r0 = 2
        L4a:
            com.google.android.exoplayer2.m0$b r4 = new com.google.android.exoplayer2.m0$b
            r4.<init>()
            r4.f12316k = r3
            r4.f12331z = r0
            int r0 = r6.f12271B
            r4.f12302A = r0
            int r0 = r6.f12272C
            r4.f12303B = r0
            java.lang.String r0 = "channel-count"
            int r0 = r7.getInteger(r0)
            r4.f12329x = r0
            java.lang.String r0 = "sample-rate"
            int r7 = r7.getInteger(r0)
            r4.f12330y = r7
            com.google.android.exoplayer2.m0 r7 = new com.google.android.exoplayer2.m0
            r7.<init>(r4)
            boolean r0 = r5.f10709O0
            if (r0 == 0) goto L88
            int r0 = r7.f12300y
            r3 = 6
            if (r0 != r3) goto L88
            int r6 = r6.f12300y
            if (r6 >= r3) goto L88
            int[] r0 = new int[r6]
            r2 = r1
        L80:
            if (r2 >= r6) goto L87
            r0[r2] = r2
            int r2 = r2 + 1
            goto L80
        L87:
            r2 = r0
        L88:
            r6 = r7
        L89:
            com.google.android.exoplayer2.audio.AudioSink r7 = r5.f10707M0     // Catch: com.google.android.exoplayer2.audio.AudioSink.C6667a -> L8f
            r7.mo6105j(r6, r2)     // Catch: com.google.android.exoplayer2.audio.AudioSink.C6667a -> L8f
            return
        L8f:
            r6 = move-exception
            r7 = 5001(0x1389, float:7.008E-42)
            com.google.android.exoplayer2.m0 r0 = r6.f10597a
            com.google.android.exoplayer2.ExoPlaybackException r6 = r5.m5697w(r7, r0, r6, r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C6694f0.mo4944d0(com.google.android.exoplayer2.m0, android.media.MediaFormat):void");
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7423p
    /* renamed from: f */
    public final void mo5051f(C6633a1 c6633a1) {
        this.f10707M0.mo6109f(c6633a1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: f0 */
    public final void mo4942f0() {
        this.f10707M0.mo6101n();
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: g0 */
    public final void mo4941g0(DecoderInputBuffer decoderInputBuffer) {
        if (!this.f10712R0 || decoderInputBuffer.m6017g()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f10906e - this.f10711Q0) > 500000) {
            this.f10711Q0 = decoderInputBuffer.f10906e;
        }
        this.f10712R0 = false;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: i0 */
    public final boolean mo4940i0(long j, long j2, @Nullable InterfaceC7019l interfaceC7019l, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C7003m0 c7003m0) throws ExoPlaybackException {
        byteBuffer.getClass();
        if (this.f10710P0 != null && (i2 & 2) != 0) {
            interfaceC7019l.getClass();
            interfaceC7019l.mo5548h(i, false);
            return true;
        }
        AudioSink audioSink = this.f10707M0;
        if (z) {
            if (interfaceC7019l != null) {
                interfaceC7019l.mo5548h(i, false);
            }
            this.f12408F0.getClass();
            audioSink.mo6101n();
            return true;
        }
        try {
            if (audioSink.mo6098q(byteBuffer, j3, i3)) {
                if (interfaceC7019l != null) {
                    interfaceC7019l.mo5548h(i, false);
                }
                this.f12408F0.getClass();
                return true;
            }
            return false;
        } catch (AudioSink.C6668b e) {
            throw m5697w(5001, e.f10599b, e, e.f10598a);
        } catch (AudioSink.C6671e e2) {
            throw m5697w(5002, c7003m0, e2, e2.f10600a);
        }
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7423p
    /* renamed from: k */
    public final long mo5050k() {
        if (this.f12130e == 2) {
            m6067w0();
        }
        return this.f10711Q0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: l0 */
    public final void mo5579l0() throws ExoPlaybackException {
        try {
            this.f10707M0.mo6108g();
        } catch (AudioSink.C6671e e) {
            throw m5697w(5002, e.f10601b, e, e.f10600a);
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h, com.google.android.exoplayer2.C6733b1.InterfaceC6735b
    /* renamed from: p */
    public final void mo4917p(int i, @Nullable Object obj) throws ExoPlaybackException {
        AudioSink audioSink = this.f10707M0;
        if (i == 2) {
            audioSink.setVolume(((Float) obj).floatValue());
        } else if (i == 3) {
            audioSink.mo6102m((C6688d) obj);
        } else if (i == 5) {
            audioSink.mo6095t((C6724v) obj);
        } else {
            switch (i) {
                case 101:
                    audioSink.mo6096s(((Boolean) obj).booleanValue());
                    return;
                case 102:
                    audioSink.mo6106i(((Integer) obj).intValue());
                    return;
                case 103:
                    this.f10715U0 = (Renderer.InterfaceC6630a) obj;
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: q0 */
    public final boolean mo5575q0(C7003m0 c7003m0) {
        return this.f10707M0.mo6114a(c7003m0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (r4 != null) goto L25;
     */
    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo4936r0(com.google.android.exoplayer2.mediacodec.InterfaceC7028q r9, com.google.android.exoplayer2.C7003m0 r10) throws com.google.android.exoplayer2.mediacodec.C7032u.C7034b {
        /*
            r8 = this;
            java.lang.String r0 = r10.f12287l
            boolean r0 = com.google.android.exoplayer2.util.C7424q.m5042h(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            int r0 = com.google.android.exoplayer2.util.C7408g0.f13905a
            r2 = 21
            if (r0 < r2) goto L13
            r0 = 32
            goto L14
        L13:
            r0 = r1
        L14:
            r2 = 1
            java.lang.Class<? extends com.google.android.exoplayer2.drm.u> r3 = r10.f12274E
            if (r3 == 0) goto L1b
            r4 = r2
            goto L1c
        L1b:
            r4 = r1
        L1c:
            if (r3 == 0) goto L29
            java.lang.Class<com.google.android.exoplayer2.drm.v> r5 = com.google.android.exoplayer2.drm.C6801v.class
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L27
            goto L29
        L27:
            r3 = r1
            goto L2a
        L29:
            r3 = r2
        L2a:
            java.lang.String r5 = "audio/raw"
            com.google.android.exoplayer2.audio.AudioSink r6 = r8.f10707M0
            if (r3 == 0) goto L4f
            boolean r7 = r6.mo6114a(r10)
            if (r7 == 0) goto L4f
            if (r4 == 0) goto L4c
            java.util.List r4 = com.google.android.exoplayer2.mediacodec.C7032u.m5566d(r5, r1, r1)
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L44
            r4 = 0
            goto L4a
        L44:
            java.lang.Object r4 = r4.get(r1)
            com.google.android.exoplayer2.mediacodec.n r4 = (com.google.android.exoplayer2.mediacodec.C7024n) r4
        L4a:
            if (r4 == 0) goto L4f
        L4c:
            r9 = r0 | 12
            return r9
        L4f:
            java.lang.String r4 = r10.f12287l
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L5e
            boolean r4 = r6.mo6114a(r10)
            if (r4 != 0) goto L5e
            return r2
        L5e:
            com.google.android.exoplayer2.m0$b r4 = new com.google.android.exoplayer2.m0$b
            r4.<init>()
            r4.f12316k = r5
            int r5 = r10.f12300y
            r4.f12329x = r5
            int r5 = r10.f12301z
            r4.f12330y = r5
            r5 = 2
            r4.f12331z = r5
            com.google.android.exoplayer2.m0 r4 = r4.m5614a()
            boolean r4 = r6.mo6114a(r4)
            if (r4 != 0) goto L7b
            return r2
        L7b:
            java.util.List r9 = r8.mo4951S(r9, r10, r1)
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L86
            return r2
        L86:
            if (r3 != 0) goto L89
            return r5
        L89:
            java.lang.Object r9 = r9.get(r1)
            com.google.android.exoplayer2.mediacodec.n r9 = (com.google.android.exoplayer2.mediacodec.C7024n) r9
            boolean r1 = r9.m5599c(r10)
            if (r1 == 0) goto L9e
            boolean r9 = r9.m5598d(r10)
            if (r9 == 0) goto L9e
            r9 = 16
            goto La0
        L9e:
            r9 = 8
        La0:
            if (r1 == 0) goto La4
            r10 = 4
            goto La5
        La4:
            r10 = 3
        La5:
            r9 = r9 | r10
            r9 = r9 | r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C6694f0.mo4936r0(com.google.android.exoplayer2.mediacodec.q, com.google.android.exoplayer2.m0):int");
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h, com.google.android.exoplayer2.Renderer
    @Nullable
    /* renamed from: u */
    public final InterfaceC7423p mo5699u() {
        return this;
    }

    /* renamed from: v0 */
    public final int m6068v0(C7003m0 c7003m0, C7024n c7024n) {
        int i;
        if (!"OMX.google.raw.decoder".equals(c7024n.f12389a) || (i = C7408g0.f13905a) >= 24 || (i == 23 && C7408g0.m5085u(this.f10705K0))) {
            return c7003m0.f12288m;
        }
        return -1;
    }

    /* renamed from: w0 */
    public final void m6067w0() {
        long mo6104k = this.f10707M0.mo6104k(mo4920b());
        if (mo6104k != Long.MIN_VALUE) {
            if (!this.f10713S0) {
                mo6104k = Math.max(this.f10711Q0, mo6104k);
            }
            this.f10711Q0 = mo6104k;
            this.f10713S0 = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.AbstractC7025o, com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: y */
    public final void mo4916y() {
        InterfaceC6718s.C6719a c6719a = this.f10706L0;
        this.f10714T0 = true;
        try {
            this.f10707M0.flush();
            try {
                super.mo4916y();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo4916y();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: z */
    public final void mo4931z(boolean z, boolean z2) throws ExoPlaybackException {
        final C6747e c6747e = new C6747e();
        this.f12408F0 = c6747e;
        final InterfaceC6718s.C6719a c6719a = this.f10706L0;
        Handler handler = c6719a.f10818a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.m
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC6718s.C6719a c6719a2 = InterfaceC6718s.C6719a.this;
                    c6719a2.getClass();
                    int i = C7408g0.f13905a;
                    c6719a2.f10819b.mo5715j(c6747e);
                }
            });
        }
        C6740d1 c6740d1 = this.f12128c;
        c6740d1.getClass();
        boolean z3 = c6740d1.f10902a;
        AudioSink audioSink = this.f10707M0;
        if (z3) {
            audioSink.mo6100o();
        } else {
            audioSink.mo6103l();
        }
    }
}
