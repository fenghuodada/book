package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.audio.C6702h0;
import com.google.android.exoplayer2.decoder.C6744c;
import com.google.android.exoplayer2.mediacodec.InterfaceC7019l;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.video.C7454h;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.mediacodec.w */
/* loaded from: classes.dex */
public final class C7040w implements InterfaceC7019l {

    /* renamed from: a */
    public final MediaCodec f12487a;
    @Nullable

    /* renamed from: b */
    public ByteBuffer[] f12488b;
    @Nullable

    /* renamed from: c */
    public ByteBuffer[] f12489c;

    /* renamed from: com.google.android.exoplayer2.mediacodec.w$a */
    /* loaded from: classes.dex */
    public static class C7041a implements InterfaceC7019l.InterfaceC7021b {
        /* renamed from: b */
        public static MediaCodec m5540b(InterfaceC7019l.C7020a c7020a) throws IOException {
            String str;
            c7020a.f12384a.getClass();
            String str2 = c7020a.f12384a.f12389a;
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                str = "createCodec:".concat(valueOf);
            } else {
                str = new String("createCodec:");
            }
            C6702h0.m6062a(str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str2);
            C6702h0.m6060c();
            return createByCodecName;
        }

        @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l.InterfaceC7021b
        /* renamed from: a */
        public final InterfaceC7019l mo5541a(InterfaceC7019l.C7020a c7020a) throws IOException {
            MediaCodec mediaCodec = null;
            try {
                mediaCodec = m5540b(c7020a);
                C6702h0.m6062a("configureCodec");
                mediaCodec.configure(c7020a.f12385b, c7020a.f12386c, c7020a.f12387d, 0);
                C6702h0.m6060c();
                C6702h0.m6062a("startCodec");
                mediaCodec.start();
                C6702h0.m6060c();
                return new C7040w(mediaCodec);
            } catch (IOException | RuntimeException e) {
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }
    }

    public C7040w(MediaCodec mediaCodec) {
        this.f12487a = mediaCodec;
        if (C7408g0.f13905a < 21) {
            this.f12488b = mediaCodec.getInputBuffers();
            this.f12489c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: a */
    public final void mo5555a() {
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: b */
    public final MediaFormat mo5554b() {
        return this.f12487a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    @RequiresApi(19)
    /* renamed from: c */
    public final void mo5553c(Bundle bundle) {
        this.f12487a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    @RequiresApi(21)
    /* renamed from: d */
    public final void mo5552d(int i, long j) {
        this.f12487a.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: e */
    public final int mo5551e() {
        return this.f12487a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: f */
    public final int mo5550f(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f12487a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && C7408g0.f13905a < 21) {
                this.f12489c = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    public final void flush() {
        this.f12487a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    @RequiresApi(23)
    /* renamed from: g */
    public final void mo5549g(final InterfaceC7019l.InterfaceC7022c interfaceC7022c, Handler handler) {
        this.f12487a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.v
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C7040w.this.getClass();
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
        this.f12487a.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: i */
    public final void mo5547i(int i) {
        this.f12487a.setVideoScalingMode(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: j */
    public final void mo5546j(int i, C6744c c6744c, long j) {
        this.f12487a.queueSecureInputBuffer(i, 0, c6744c.f10924i, j, 0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    @Nullable
    /* renamed from: k */
    public final ByteBuffer mo5545k(int i) {
        return C7408g0.f13905a >= 21 ? this.f12487a.getInputBuffer(i) : this.f12488b[i];
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    @RequiresApi(23)
    /* renamed from: l */
    public final void mo5544l(Surface surface) {
        this.f12487a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    @Nullable
    /* renamed from: m */
    public final ByteBuffer mo5543m(int i) {
        return C7408g0.f13905a >= 21 ? this.f12487a.getOutputBuffer(i) : this.f12489c[i];
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    /* renamed from: n */
    public final void mo5542n(int i, int i2, long j, int i3) {
        this.f12487a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC7019l
    public final void release() {
        this.f12488b = null;
        this.f12489c = null;
        this.f12487a.release();
    }
}
