package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.C7127q0;
import com.google.android.exoplayer2.drm.InterfaceC6789n;
import com.google.android.exoplayer2.upstream.C7367l;
import com.google.android.exoplayer2.upstream.InterfaceC7351c0;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.p */
/* loaded from: classes.dex */
public interface InterfaceC7188p {

    /* renamed from: com.google.android.exoplayer2.source.p$a */
    /* loaded from: classes.dex */
    public static final class C7189a extends C7187o {
        public C7189a(C7187o c7187o) {
            super(c7187o);
        }

        public C7189a(Object obj) {
            super(obj, -1, -1, -1L, -1);
        }

        /* renamed from: b */
        public final C7189a m5379b(Object obj) {
            C7187o c7187o;
            if (this.f12928a.equals(obj)) {
                c7187o = this;
            } else {
                c7187o = new C7187o(obj, this.f12929b, this.f12930c, this.f12931d, this.f12932e);
            }
            return new C7189a(c7187o);
        }

        public C7189a(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j, -1);
        }

        public C7189a(Object obj, long j, int i) {
            super(obj, -1, -1, j, i);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.p$b */
    /* loaded from: classes.dex */
    public interface InterfaceC7190b {
        /* renamed from: a */
        void mo4891a(AbstractC6984j1 abstractC6984j1);
    }

    /* renamed from: a */
    void mo5393a(InterfaceC7190b interfaceC7190b);

    /* renamed from: b */
    void mo5392b(Handler handler, InterfaceC7196v interfaceC7196v);

    /* renamed from: c */
    void mo5391c(InterfaceC7196v interfaceC7196v);

    /* renamed from: d */
    void mo5390d(InterfaceC7190b interfaceC7190b);

    /* renamed from: e */
    C7127q0 mo5389e();

    /* renamed from: f */
    void mo5388f(Handler handler, InterfaceC6789n interfaceC6789n);

    /* renamed from: g */
    void mo5387g(InterfaceC6789n interfaceC6789n);

    /* renamed from: h */
    void mo5386h() throws IOException;

    /* renamed from: i */
    void mo5385i();

    /* renamed from: j */
    void mo5384j(InterfaceC7185n interfaceC7185n);

    @Nullable
    /* renamed from: k */
    void mo5383k();

    /* renamed from: l */
    void mo5382l(InterfaceC7190b interfaceC7190b, @Nullable InterfaceC7351c0 interfaceC7351c0);

    /* renamed from: m */
    void mo5381m(InterfaceC7190b interfaceC7190b);

    /* renamed from: n */
    InterfaceC7185n mo5380n(C7189a c7189a, C7367l c7367l, long j);
}
