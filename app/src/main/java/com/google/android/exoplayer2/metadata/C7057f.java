package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC6974h;
import com.google.android.exoplayer2.C6970g1;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7121n0;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.metadata.InterfaceC7046c;
import com.google.android.exoplayer2.util.C7408g0;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.metadata.f */
/* loaded from: classes.dex */
public final class C7057f extends AbstractC6974h implements Handler.Callback {

    /* renamed from: l */
    public final InterfaceC7046c f12505l;

    /* renamed from: m */
    public final InterfaceC7052e f12506m;
    @Nullable

    /* renamed from: n */
    public final Handler f12507n;

    /* renamed from: o */
    public final C7048d f12508o;
    @Nullable

    /* renamed from: p */
    public InterfaceC7045b f12509p;

    /* renamed from: q */
    public boolean f12510q;

    /* renamed from: r */
    public boolean f12511r;

    /* renamed from: s */
    public long f12512s;

    /* renamed from: t */
    public long f12513t;
    @Nullable

    /* renamed from: u */
    public C7042a f12514u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7057f(C6970g1.SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b, @Nullable Looper looper) {
        super(5);
        Handler handler;
        InterfaceC7046c.C7047a c7047a = InterfaceC7046c.f12491a;
        this.f12506m = surfaceHolder$CallbackC6972b;
        if (looper == null) {
            handler = null;
        } else {
            int i = C7408g0.f13905a;
            handler = new Handler(looper, this);
        }
        this.f12507n = handler;
        this.f12505l = c7047a;
        this.f12508o = new C7048d();
        this.f12513t = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: A */
    public final void mo4923A(long j, boolean z) {
        this.f12514u = null;
        this.f12513t = -9223372036854775807L;
        this.f12510q = false;
        this.f12511r = false;
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: E */
    public final void mo4922E(C7003m0[] c7003m0Arr, long j, long j2) {
        this.f12509p = this.f12505l.mo5537b(c7003m0Arr[0]);
    }

    /* renamed from: G */
    public final void m5536G(C7042a c7042a, ArrayList arrayList) {
        int i = 0;
        while (true) {
            C7042a.InterfaceC7044b[] interfaceC7044bArr = c7042a.f12490a;
            if (i < interfaceC7044bArr.length) {
                C7003m0 mo5508o = interfaceC7044bArr[i].mo5508o();
                if (mo5508o != null) {
                    InterfaceC7046c interfaceC7046c = this.f12505l;
                    if (interfaceC7046c.mo5538a(mo5508o)) {
                        AbstractC7062g mo5537b = interfaceC7046c.mo5537b(mo5508o);
                        byte[] mo5510G = interfaceC7044bArr[i].mo5510G();
                        mo5510G.getClass();
                        C7048d c7048d = this.f12508o;
                        c7048d.mo5603h();
                        c7048d.m6020j(mo5510G.length);
                        ByteBuffer byteBuffer = c7048d.f10904c;
                        int i2 = C7408g0.f13905a;
                        byteBuffer.put(mo5510G);
                        c7048d.m6019k();
                        C7042a mo5535a = mo5537b.mo5535a(c7048d);
                        if (mo5535a != null) {
                            m5536G(mo5535a, arrayList);
                        }
                        i++;
                    }
                }
                arrayList.add(interfaceC7044bArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: a */
    public final int mo4921a(C7003m0 c7003m0) {
        if (this.f12505l.mo5538a(c7003m0)) {
            return (c7003m0.f12274E == null ? 4 : 2) | 0 | 0;
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: b */
    public final boolean mo4920b() {
        return this.f12511r;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: d */
    public final boolean mo4919d() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.f12506m.mo5193r((C7042a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: o */
    public final void mo4918o(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.f12510q && this.f12514u == null) {
                C7048d c7048d = this.f12508o;
                c7048d.mo5603h();
                C7121n0 c7121n0 = this.f12127b;
                c7121n0.m5503a();
                int m5710F = m5710F(c7121n0, c7048d, 0);
                if (m5710F == -4) {
                    if (c7048d.m6018f(4)) {
                        this.f12510q = true;
                    } else {
                        c7048d.f12492i = this.f12512s;
                        c7048d.m6019k();
                        InterfaceC7045b interfaceC7045b = this.f12509p;
                        int i = C7408g0.f13905a;
                        C7042a mo5535a = interfaceC7045b.mo5535a(c7048d);
                        if (mo5535a != null) {
                            ArrayList arrayList = new ArrayList(mo5535a.f12490a.length);
                            m5536G(mo5535a, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f12514u = new C7042a(arrayList);
                                this.f12513t = c7048d.f10906e;
                            }
                        }
                    }
                } else if (m5710F == -5) {
                    C7003m0 c7003m0 = c7121n0.f12634b;
                    c7003m0.getClass();
                    this.f12512s = c7003m0.f12291p;
                }
            }
            C7042a c7042a = this.f12514u;
            if (c7042a != null && this.f12513t <= j) {
                Handler handler = this.f12507n;
                if (handler != null) {
                    handler.obtainMessage(0, c7042a).sendToTarget();
                } else {
                    this.f12506m.mo5193r(c7042a);
                }
                this.f12514u = null;
                this.f12513t = -9223372036854775807L;
                z = true;
            } else {
                z = false;
            }
            if (this.f12510q && this.f12514u == null) {
                this.f12511r = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: y */
    public final void mo4916y() {
        this.f12514u = null;
        this.f12513t = -9223372036854775807L;
        this.f12509p = null;
    }
}
