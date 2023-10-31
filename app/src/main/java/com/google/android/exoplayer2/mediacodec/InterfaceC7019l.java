package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.decoder.C6744c;
import com.google.android.exoplayer2.mediacodec.C7040w;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.mediacodec.l */
/* loaded from: classes.dex */
public interface InterfaceC7019l {

    /* renamed from: com.google.android.exoplayer2.mediacodec.l$a */
    /* loaded from: classes.dex */
    public static final class C7020a {

        /* renamed from: a */
        public final C7024n f12384a;

        /* renamed from: b */
        public final MediaFormat f12385b;
        @Nullable

        /* renamed from: c */
        public final Surface f12386c;
        @Nullable

        /* renamed from: d */
        public final MediaCrypto f12387d;

        public C7020a(C7024n c7024n, MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
            this.f12384a = c7024n;
            this.f12385b = mediaFormat;
            this.f12386c = surface;
            this.f12387d = mediaCrypto;
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.l$b */
    /* loaded from: classes.dex */
    public interface InterfaceC7021b {

        /* renamed from: a */
        public static final C7040w.C7041a f12388a = new C7040w.C7041a();

        /* renamed from: a */
        InterfaceC7019l mo5541a(C7020a c7020a) throws IOException;
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.l$c */
    /* loaded from: classes.dex */
    public interface InterfaceC7022c {
    }

    /* renamed from: a */
    void mo5555a();

    /* renamed from: b */
    MediaFormat mo5554b();

    @RequiresApi(19)
    /* renamed from: c */
    void mo5553c(Bundle bundle);

    @RequiresApi(21)
    /* renamed from: d */
    void mo5552d(int i, long j);

    /* renamed from: e */
    int mo5551e();

    /* renamed from: f */
    int mo5550f(MediaCodec.BufferInfo bufferInfo);

    void flush();

    @RequiresApi(23)
    /* renamed from: g */
    void mo5549g(InterfaceC7022c interfaceC7022c, Handler handler);

    /* renamed from: h */
    void mo5548h(int i, boolean z);

    /* renamed from: i */
    void mo5547i(int i);

    /* renamed from: j */
    void mo5546j(int i, C6744c c6744c, long j);

    @Nullable
    /* renamed from: k */
    ByteBuffer mo5545k(int i);

    @RequiresApi(23)
    /* renamed from: l */
    void mo5544l(Surface surface);

    @Nullable
    /* renamed from: m */
    ByteBuffer mo5543m(int i);

    /* renamed from: n */
    void mo5542n(int i, int i2, long j, int i3);

    void release();
}
