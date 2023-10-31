package com.google.android.exoplayer2.video;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C6970g1;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.decoder.C6747e;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;

/* renamed from: com.google.android.exoplayer2.video.v */
/* loaded from: classes.dex */
public interface InterfaceC7494v {

    /* renamed from: com.google.android.exoplayer2.video.v$a */
    /* loaded from: classes.dex */
    public static final class C7495a {
        @Nullable

        /* renamed from: a */
        public final Handler f14216a;
        @Nullable

        /* renamed from: b */
        public final InterfaceC7494v f14217b;

        public C7495a(@Nullable Handler handler, @Nullable C6970g1.SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b) {
            this.f14216a = handler;
            this.f14217b = surfaceHolder$CallbackC6972b;
        }

        /* renamed from: a */
        public final void m4892a(C6747e c6747e) {
            synchronized (c6747e) {
            }
            Handler handler = this.f14216a;
            if (handler != null) {
                handler.post(new RunnableC7466m(this, c6747e));
            }
        }
    }

    /* renamed from: B */
    void mo4903B(C6747e c6747e);

    /* renamed from: C */
    void mo4902C(C7003m0 c7003m0, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    /* renamed from: G */
    void mo4901G(Exception exc);

    /* renamed from: I */
    void mo4900I(long j, Object obj);

    /* renamed from: J */
    void mo4899J(C6747e c6747e);

    /* renamed from: c */
    void mo4898c(C7496w c7496w);

    @Deprecated
    /* renamed from: e */
    void mo4897e();

    /* renamed from: i */
    void mo4896i(String str);

    /* renamed from: k */
    void mo4895k(int i, long j);

    /* renamed from: s */
    void mo4894s(int i, long j);

    /* renamed from: t */
    void mo4893t(long j, String str, long j2);
}
