package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.C7414j;
import java.util.ArrayDeque;

@RequiresApi(23)
/* renamed from: com.google.android.exoplayer2.mediacodec.i */
/* loaded from: classes.dex */
public final class C7016i extends MediaCodec.Callback {

    /* renamed from: b */
    public final HandlerThread f12366b;

    /* renamed from: c */
    public Handler f12367c;
    @Nullable
    @GuardedBy("lock")

    /* renamed from: h */
    public MediaFormat f12372h;
    @Nullable
    @GuardedBy("lock")

    /* renamed from: i */
    public MediaFormat f12373i;
    @Nullable
    @GuardedBy("lock")

    /* renamed from: j */
    public MediaCodec.CodecException f12374j;
    @GuardedBy("lock")

    /* renamed from: k */
    public long f12375k;
    @GuardedBy("lock")

    /* renamed from: l */
    public boolean f12376l;
    @Nullable
    @GuardedBy("lock")

    /* renamed from: m */
    public IllegalStateException f12377m;

    /* renamed from: a */
    public final Object f12365a = new Object();
    @GuardedBy("lock")

    /* renamed from: d */
    public final C7414j f12368d = new C7414j();
    @GuardedBy("lock")

    /* renamed from: e */
    public final C7414j f12369e = new C7414j();
    @GuardedBy("lock")

    /* renamed from: f */
    public final ArrayDeque<MediaCodec.BufferInfo> f12370f = new ArrayDeque<>();
    @GuardedBy("lock")

    /* renamed from: g */
    public final ArrayDeque<MediaFormat> f12371g = new ArrayDeque<>();

    public C7016i(HandlerThread handlerThread) {
        this.f12366b = handlerThread;
    }

    @GuardedBy("lock")
    /* renamed from: a */
    public final void m5605a() {
        ArrayDeque<MediaFormat> arrayDeque = this.f12371g;
        if (!arrayDeque.isEmpty()) {
            this.f12373i = arrayDeque.getLast();
        }
        C7414j c7414j = this.f12368d;
        c7414j.f13919a = 0;
        c7414j.f13920b = -1;
        c7414j.f13921c = 0;
        C7414j c7414j2 = this.f12369e;
        c7414j2.f13919a = 0;
        c7414j2.f13920b = -1;
        c7414j2.f13921c = 0;
        this.f12370f.clear();
        arrayDeque.clear();
        this.f12374j = null;
    }

    /* renamed from: b */
    public final void m5604b(IllegalStateException illegalStateException) {
        synchronized (this.f12365a) {
            this.f12377m = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(@NonNull MediaCodec mediaCodec, @NonNull MediaCodec.CodecException codecException) {
        synchronized (this.f12365a) {
            this.f12374j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(@NonNull MediaCodec mediaCodec, int i) {
        synchronized (this.f12365a) {
            this.f12368d.m5062a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(@NonNull MediaCodec mediaCodec, int i, @NonNull MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f12365a) {
            MediaFormat mediaFormat = this.f12373i;
            if (mediaFormat != null) {
                this.f12369e.m5062a(-2);
                this.f12371g.add(mediaFormat);
                this.f12373i = null;
            }
            this.f12369e.m5062a(i);
            this.f12370f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(@NonNull MediaCodec mediaCodec, @NonNull MediaFormat mediaFormat) {
        synchronized (this.f12365a) {
            this.f12369e.m5062a(-2);
            this.f12371g.add(mediaFormat);
            this.f12373i = null;
        }
    }
}
