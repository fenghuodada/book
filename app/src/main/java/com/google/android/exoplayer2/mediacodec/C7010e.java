package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.audio.C6702h0;
import com.google.android.exoplayer2.decoder.C6744c;
import com.google.android.exoplayer2.mediacodec.C7013g;
import com.google.android.exoplayer2.mediacodec.InterfaceC7019l;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7401d;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.video.C7454h;
import com.google.common.base.InterfaceC7946m;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Objects;

@RequiresApi(23)
/* renamed from: com.google.android.exoplayer2.mediacodec.e */
/* loaded from: classes.dex */
public final class C7010e implements InterfaceC7019l {

    /* renamed from: a */
    public final MediaCodec f12337a;

    /* renamed from: b */
    public final C7016i f12338b;

    /* renamed from: c */
    public final C7013g f12339c;

    /* renamed from: d */
    public final boolean f12340d;

    /* renamed from: e */
    public boolean f12341e;

    /* renamed from: f */
    public int f12342f = 0;

    /* renamed from: com.google.android.exoplayer2.mediacodec.e$a */
    /* loaded from: classes.dex */
    public static final class C7011a implements InterfaceC7019l.InterfaceC7021b {

        /* renamed from: b */
        public final InterfaceC7946m<HandlerThread> f12343b;

        /* renamed from: c */
        public final InterfaceC7946m<HandlerThread> f12344c;

        /* renamed from: d */
        public final boolean f12345d;

        /* renamed from: e */
        public final boolean f12346e;

        public C7011a(final int i, boolean z, boolean z2) {
            InterfaceC7946m<HandlerThread> interfaceC7946m = new InterfaceC7946m() { // from class: com.google.android.exoplayer2.mediacodec.c
                @Override // com.google.common.base.InterfaceC7946m
                public final Object get() {
                    return new HandlerThread(C7010e.m5611p(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
                }
            };
            InterfaceC7946m<HandlerThread> interfaceC7946m2 = new InterfaceC7946m() { // from class: com.google.android.exoplayer2.mediacodec.d
                @Override // com.google.common.base.InterfaceC7946m
                public final Object get() {
                    return new HandlerThread(C7010e.m5611p(i, "ExoPlayer:MediaCodecQueueingThread:"));
                }
            };
            this.f12343b = interfaceC7946m;
            this.f12344c = interfaceC7946m2;
            this.f12345d = z;
            this.f12346e = z2;
        }

        @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l.InterfaceC7021b
        /* renamed from: b */
        public final C7010e mo5541a(InterfaceC7019l.C7020a c7020a) throws IOException {
            MediaCodec mediaCodec;
            C7010e c7010e;
            String str = c7020a.f12384a.f12389a;
            C7010e c7010e2 = null;
            try {
                String valueOf = String.valueOf(str);
                C6702h0.m6062a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    c7010e = new C7010e(mediaCodec, this.f12343b.get(), this.f12344c.get(), this.f12345d, this.f12346e);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                mediaCodec = null;
            }
            try {
                C6702h0.m6060c();
                C7010e.m5612o(c7010e, c7020a.f12385b, c7020a.f12386c, c7020a.f12387d, 0);
                return c7010e;
            } catch (Exception e3) {
                e = e3;
                c7010e2 = c7010e;
                if (c7010e2 != null) {
                    c7010e2.release();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }
    }

    public C7010e(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.f12337a = mediaCodec;
        this.f12338b = new C7016i(handlerThread);
        this.f12339c = new C7013g(mediaCodec, handlerThread2, z);
        this.f12340d = z2;
    }

    /* renamed from: o */
    public static void m5612o(C7010e c7010e, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        boolean z;
        C7016i c7016i = c7010e.f12338b;
        if (c7016i.f12367c == null) {
            z = true;
        } else {
            z = false;
        }
        C7394a.m5131d(z);
        HandlerThread handlerThread = c7016i.f12366b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = c7010e.f12337a;
        mediaCodec.setCallback(c7016i, handler);
        c7016i.f12367c = handler;
        C6702h0.m6062a("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        C6702h0.m6060c();
        C7013g c7013g = c7010e.f12339c;
        if (!c7013g.f12356g) {
            HandlerThread handlerThread2 = c7013g.f12351b;
            handlerThread2.start();
            c7013g.f12352c = new HandlerC7012f(c7013g, handlerThread2.getLooper());
            c7013g.f12356g = true;
        }
        C6702h0.m6062a("startCodec");
        mediaCodec.start();
        C6702h0.m6060c();
        c7010e.f12342f = 1;
    }

    /* renamed from: p */
    public static String m5611p(int i, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            str2 = "Audio";
        } else if (i == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: a */
    public final void mo5555a() {
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: b */
    public final MediaFormat mo5554b() {
        MediaFormat mediaFormat;
        C7016i c7016i = this.f12338b;
        synchronized (c7016i.f12365a) {
            mediaFormat = c7016i.f12372h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: c */
    public final void mo5553c(Bundle bundle) {
        m5610q();
        this.f12337a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: d */
    public final void mo5552d(int i, long j) {
        this.f12337a.releaseOutputBuffer(i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[Catch: all -> 0x0050, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000f, B:25:0x0040, B:14:0x001b, B:16:0x0020, B:18:0x0024, B:24:0x0030, B:27:0x0042, B:28:0x0047, B:29:0x0048, B:30:0x004a, B:31:0x004b, B:32:0x004d), top: B:37:0x0005 }] */
    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo5551e() {
        /*
            r7 = this;
            com.google.android.exoplayer2.mediacodec.i r0 = r7.f12338b
            java.lang.Object r1 = r0.f12365a
            monitor-enter(r1)
            long r2 = r0.f12375k     // Catch: java.lang.Throwable -> L50
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L16
            boolean r2 = r0.f12376l     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L14
            goto L16
        L14:
            r2 = r3
            goto L17
        L16:
            r2 = r4
        L17:
            r5 = -1
            if (r2 == 0) goto L1b
            goto L40
        L1b:
            java.lang.IllegalStateException r2 = r0.f12377m     // Catch: java.lang.Throwable -> L50
            r6 = 0
            if (r2 != 0) goto L4b
            android.media.MediaCodec$CodecException r2 = r0.f12374j     // Catch: java.lang.Throwable -> L50
            if (r2 != 0) goto L48
            com.google.android.exoplayer2.util.j r0 = r0.f12368d     // Catch: java.lang.Throwable -> L50
            int r2 = r0.f13921c     // Catch: java.lang.Throwable -> L50
            if (r2 != 0) goto L2b
            r3 = r4
        L2b:
            if (r3 == 0) goto L2e
            goto L40
        L2e:
            if (r2 == 0) goto L42
            int[] r3 = r0.f13922d     // Catch: java.lang.Throwable -> L50
            int r6 = r0.f13919a     // Catch: java.lang.Throwable -> L50
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L50
            int r6 = r6 + r4
            int r4 = r0.f13923e     // Catch: java.lang.Throwable -> L50
            r4 = r4 & r6
            r0.f13919a = r4     // Catch: java.lang.Throwable -> L50
            int r2 = r2 + r5
            r0.f13921c = r2     // Catch: java.lang.Throwable -> L50
            r5 = r3
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            return r5
        L42:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L50
            throw r0     // Catch: java.lang.Throwable -> L50
        L48:
            r0.f12374j = r6     // Catch: java.lang.Throwable -> L50
            throw r2     // Catch: java.lang.Throwable -> L50
        L4b:
            r0.f12377m = r6     // Catch: java.lang.Throwable -> L50
            throw r2     // Catch: java.lang.Throwable -> L50
        L4e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            throw r0
        L50:
            r0 = move-exception
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C7010e.mo5551e():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[Catch: all -> 0x0079, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000f, B:31:0x0069, B:14:0x001b, B:16:0x0020, B:18:0x0024, B:24:0x0030, B:26:0x0041, B:29:0x005e, B:33:0x006b, B:34:0x0070, B:35:0x0071, B:36:0x0073, B:37:0x0074, B:38:0x0076), top: B:43:0x0005 }] */
    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo5550f(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            com.google.android.exoplayer2.mediacodec.i r0 = r10.f12338b
            java.lang.Object r1 = r0.f12365a
            monitor-enter(r1)
            long r2 = r0.f12375k     // Catch: java.lang.Throwable -> L79
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L16
            boolean r2 = r0.f12376l     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L14
            goto L16
        L14:
            r2 = r3
            goto L17
        L16:
            r2 = r4
        L17:
            r5 = -1
            if (r2 == 0) goto L1b
            goto L69
        L1b:
            java.lang.IllegalStateException r2 = r0.f12377m     // Catch: java.lang.Throwable -> L79
            r6 = 0
            if (r2 != 0) goto L74
            android.media.MediaCodec$CodecException r2 = r0.f12374j     // Catch: java.lang.Throwable -> L79
            if (r2 != 0) goto L71
            com.google.android.exoplayer2.util.j r2 = r0.f12369e     // Catch: java.lang.Throwable -> L79
            int r6 = r2.f13921c     // Catch: java.lang.Throwable -> L79
            if (r6 != 0) goto L2b
            r3 = r4
        L2b:
            if (r3 == 0) goto L2e
            goto L69
        L2e:
            if (r6 == 0) goto L6b
            int[] r3 = r2.f13922d     // Catch: java.lang.Throwable -> L79
            int r7 = r2.f13919a     // Catch: java.lang.Throwable -> L79
            r3 = r3[r7]     // Catch: java.lang.Throwable -> L79
            int r7 = r7 + r4
            int r4 = r2.f13923e     // Catch: java.lang.Throwable -> L79
            r4 = r4 & r7
            r2.f13919a = r4     // Catch: java.lang.Throwable -> L79
            int r6 = r6 + r5
            r2.f13921c = r6     // Catch: java.lang.Throwable -> L79
            if (r3 < 0) goto L5b
            android.media.MediaFormat r2 = r0.f12372h     // Catch: java.lang.Throwable -> L79
            com.google.android.exoplayer2.util.C7394a.m5130e(r2)     // Catch: java.lang.Throwable -> L79
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r0 = r0.f12370f     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L79
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L79
            int r5 = r0.offset     // Catch: java.lang.Throwable -> L79
            int r6 = r0.size     // Catch: java.lang.Throwable -> L79
            long r7 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L79
            int r9 = r0.flags     // Catch: java.lang.Throwable -> L79
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L79
            goto L68
        L5b:
            r11 = -2
            if (r3 != r11) goto L68
            java.util.ArrayDeque<android.media.MediaFormat> r11 = r0.f12371g     // Catch: java.lang.Throwable -> L79
            java.lang.Object r11 = r11.remove()     // Catch: java.lang.Throwable -> L79
            android.media.MediaFormat r11 = (android.media.MediaFormat) r11     // Catch: java.lang.Throwable -> L79
            r0.f12372h = r11     // Catch: java.lang.Throwable -> L79
        L68:
            r5 = r3
        L69:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L79
            return r5
        L6b:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L79
            r11.<init>()     // Catch: java.lang.Throwable -> L79
            throw r11     // Catch: java.lang.Throwable -> L79
        L71:
            r0.f12374j = r6     // Catch: java.lang.Throwable -> L79
            throw r2     // Catch: java.lang.Throwable -> L79
        L74:
            r0.f12377m = r6     // Catch: java.lang.Throwable -> L79
            throw r2     // Catch: java.lang.Throwable -> L79
        L77:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L79
            throw r11
        L79:
            r11 = move-exception
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C7010e.mo5550f(android.media.MediaCodec$BufferInfo):int");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.exoplayer2.mediacodec.b] */
    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    public final void flush() {
        this.f12339c.m5608a();
        this.f12337a.flush();
        final C7016i c7016i = this.f12338b;
        final MediaCodec mediaCodec = this.f12337a;
        Objects.requireNonNull(mediaCodec);
        final ?? r2 = new Runnable() { // from class: com.google.android.exoplayer2.mediacodec.b
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        };
        synchronized (c7016i.f12365a) {
            c7016i.f12375k++;
            Handler handler = c7016i.f12367c;
            int i = C7408g0.f13905a;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.mediacodec.h
                @Override // java.lang.Runnable
                public final void run() {
                    C7016i c7016i2 = C7016i.this;
                    Runnable runnable = r2;
                    synchronized (c7016i2.f12365a) {
                        if (!c7016i2.f12376l) {
                            long j = c7016i2.f12375k - 1;
                            c7016i2.f12375k = j;
                            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                            if (i2 <= 0) {
                                if (i2 < 0) {
                                    e = new IllegalStateException();
                                } else {
                                    c7016i2.m5605a();
                                    try {
                                        runnable.run();
                                    } catch (IllegalStateException e) {
                                        e = e;
                                    } catch (Exception e2) {
                                        c7016i2.m5604b(new IllegalStateException(e2));
                                    }
                                }
                                c7016i2.m5604b(e);
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: g */
    public final void mo5549g(final InterfaceC7019l.InterfaceC7022c interfaceC7022c, Handler handler) {
        m5610q();
        this.f12337a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C7010e.this.getClass();
                C7454h.C7456b c7456b = (C7454h.C7456b) interfaceC7022c;
                c7456b.getClass();
                if (C7408g0.f13905a < 30) {
                    Handler handler2 = c7456b.f14079a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                }
                C7454h c7454h = c7456b.f14080b;
                if (c7456b == c7454h.f14074r1) {
                    if (j == Long.MAX_VALUE) {
                        c7454h.f12398A0 = true;
                        return;
                    }
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
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: h */
    public final void mo5548h(int i, boolean z) {
        this.f12337a.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: i */
    public final void mo5547i(int i) {
        m5610q();
        this.f12337a.setVideoScalingMode(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: j */
    public final void mo5546j(int i, C6744c c6744c, long j) {
        this.f12339c.m5607b(i, c6744c, j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    @Nullable
    /* renamed from: k */
    public final ByteBuffer mo5545k(int i) {
        return this.f12337a.getInputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: l */
    public final void mo5544l(Surface surface) {
        m5610q();
        this.f12337a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    @Nullable
    /* renamed from: m */
    public final ByteBuffer mo5543m(int i) {
        return this.f12337a.getOutputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: n */
    public final void mo5542n(int i, int i2, long j, int i3) {
        C7013g.C7014a removeFirst;
        C7013g c7013g = this.f12339c;
        RuntimeException andSet = c7013g.f12353d.getAndSet(null);
        if (andSet == null) {
            ArrayDeque<C7013g.C7014a> arrayDeque = C7013g.f12348h;
            synchronized (arrayDeque) {
                if (arrayDeque.isEmpty()) {
                    removeFirst = new C7013g.C7014a();
                } else {
                    removeFirst = arrayDeque.removeFirst();
                }
            }
            removeFirst.f12357a = i;
            removeFirst.f12358b = 0;
            removeFirst.f12359c = i2;
            removeFirst.f12361e = j;
            removeFirst.f12362f = i3;
            HandlerC7012f handlerC7012f = c7013g.f12352c;
            int i4 = C7408g0.f13905a;
            handlerC7012f.obtainMessage(0, removeFirst).sendToTarget();
            return;
        }
        throw andSet;
    }

    /* renamed from: q */
    public final void m5610q() {
        if (this.f12340d) {
            try {
                C7013g c7013g = this.f12339c;
                C7401d c7401d = c7013g.f12354e;
                synchronized (c7401d) {
                    c7401d.f13891a = false;
                }
                HandlerC7012f handlerC7012f = c7013g.f12352c;
                int i = C7408g0.f13905a;
                handlerC7012f.obtainMessage(2).sendToTarget();
                c7401d.m5121a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    public final void release() {
        try {
            if (this.f12342f == 1) {
                C7013g c7013g = this.f12339c;
                if (c7013g.f12356g) {
                    c7013g.m5608a();
                    c7013g.f12351b.quit();
                }
                c7013g.f12356g = false;
                C7016i c7016i = this.f12338b;
                synchronized (c7016i.f12365a) {
                    c7016i.f12376l = true;
                    c7016i.f12366b.quit();
                    c7016i.m5605a();
                }
            }
            this.f12342f = 2;
        } finally {
            if (!this.f12341e) {
                this.f12337a.release();
                this.f12341e = true;
            }
        }
    }
}
