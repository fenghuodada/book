package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C6970g1;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.audio.InterfaceC6718s;
import com.google.android.exoplayer2.decoder.C6747e;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.audio.s */
/* loaded from: classes.dex */
public interface InterfaceC6718s {

    /* renamed from: com.google.android.exoplayer2.audio.s$a */
    /* loaded from: classes.dex */
    public static final class C6719a {
        @Nullable

        /* renamed from: a */
        public final Handler f10818a;
        @Nullable

        /* renamed from: b */
        public final InterfaceC6718s f10819b;

        public C6719a(@Nullable Handler handler, @Nullable C6970g1.SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b) {
            this.f10818a = handler;
            this.f10819b = surfaceHolder$CallbackC6972b;
        }

        /* renamed from: a */
        public final void m6051a(final C6747e c6747e) {
            synchronized (c6747e) {
            }
            Handler handler = this.f10818a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6718s.C6719a c6719a = InterfaceC6718s.C6719a.this;
                        C6747e c6747e2 = c6747e;
                        c6719a.getClass();
                        synchronized (c6747e2) {
                        }
                        InterfaceC6718s interfaceC6718s = c6719a.f10819b;
                        int i = C7408g0.f13905a;
                        interfaceC6718s.mo5716h(c6747e2);
                    }
                });
            }
        }
    }

    /* renamed from: D */
    void mo5720D(long j);

    /* renamed from: F */
    void mo5719F(Exception exc);

    /* renamed from: N */
    void mo5718N(int i, long j, long j2);

    /* renamed from: a */
    void mo5195a(boolean z);

    @Deprecated
    /* renamed from: d */
    void mo5717d();

    /* renamed from: h */
    void mo5716h(C6747e c6747e);

    /* renamed from: j */
    void mo5715j(C6747e c6747e);

    /* renamed from: q */
    void mo5714q(String str);

    /* renamed from: u */
    void mo5713u(C7003m0 c7003m0, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    /* renamed from: x */
    void mo5712x(long j, String str, long j2);

    /* renamed from: y */
    void mo5711y(Exception exc);
}
