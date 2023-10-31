package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC6974h;
import com.google.android.exoplayer2.C6970g1;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7121n0;
import com.google.android.exoplayer2.text.InterfaceC7235f;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7421n;
import com.google.android.exoplayer2.util.C7424q;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.j */
/* loaded from: classes.dex */
public final class C7240j extends AbstractC6974h implements Handler.Callback {
    @Nullable

    /* renamed from: l */
    public final Handler f13155l;

    /* renamed from: m */
    public final InterfaceC7239i f13156m;

    /* renamed from: n */
    public final InterfaceC7235f f13157n;

    /* renamed from: o */
    public final C7121n0 f13158o;

    /* renamed from: p */
    public boolean f13159p;

    /* renamed from: q */
    public boolean f13160q;

    /* renamed from: r */
    public boolean f13161r;

    /* renamed from: s */
    public int f13162s;
    @Nullable

    /* renamed from: t */
    public C7003m0 f13163t;
    @Nullable

    /* renamed from: u */
    public InterfaceC7222d f13164u;
    @Nullable

    /* renamed from: v */
    public C7237g f13165v;
    @Nullable

    /* renamed from: w */
    public AbstractC7238h f13166w;
    @Nullable

    /* renamed from: x */
    public AbstractC7238h f13167x;

    /* renamed from: y */
    public int f13168y;

    /* renamed from: z */
    public long f13169z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7240j(C6970g1.SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b, @Nullable Looper looper) {
        super(3);
        Handler handler;
        InterfaceC7235f.C7236a c7236a = InterfaceC7235f.f13151a;
        this.f13156m = surfaceHolder$CallbackC6972b;
        if (looper == null) {
            handler = null;
        } else {
            int i = C7408g0.f13905a;
            handler = new Handler(looper, this);
        }
        this.f13155l = handler;
        this.f13157n = c7236a;
        this.f13158o = new C7121n0();
        this.f13169z = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: A */
    public final void mo4923A(long j, boolean z) {
        List<Cue> emptyList = Collections.emptyList();
        Handler handler = this.f13155l;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f13156m.mo5191z(emptyList);
        }
        this.f13159p = false;
        this.f13160q = false;
        this.f13169z = -9223372036854775807L;
        if (this.f13162s != 0) {
            m5333J();
            InterfaceC7222d interfaceC7222d = this.f13164u;
            interfaceC7222d.getClass();
            interfaceC7222d.release();
            this.f13164u = null;
            this.f13162s = 0;
            m5334I();
            return;
        }
        m5333J();
        InterfaceC7222d interfaceC7222d2 = this.f13164u;
        interfaceC7222d2.getClass();
        interfaceC7222d2.flush();
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: E */
    public final void mo4922E(C7003m0[] c7003m0Arr, long j, long j2) {
        this.f13163t = c7003m0Arr[0];
        if (this.f13164u != null) {
            this.f13162s = 1;
        } else {
            m5334I();
        }
    }

    /* renamed from: G */
    public final long m5336G() {
        if (this.f13168y == -1) {
            return Long.MAX_VALUE;
        }
        this.f13166w.getClass();
        if (this.f13168y >= this.f13166w.mo5280d()) {
            return Long.MAX_VALUE;
        }
        return this.f13166w.mo5282b(this.f13168y);
    }

    /* renamed from: H */
    public final void m5335H(C7234e c7234e) {
        String valueOf = String.valueOf(this.f13163t);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(valueOf);
        C7421n.m5056b("TextRenderer", sb.toString(), c7234e);
        List<Cue> emptyList = Collections.emptyList();
        Handler handler = this.f13155l;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f13156m.mo5191z(emptyList);
        }
        m5333J();
        InterfaceC7222d interfaceC7222d = this.f13164u;
        interfaceC7222d.getClass();
        interfaceC7222d.release();
        this.f13164u = null;
        this.f13162s = 0;
        m5334I();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
        if (r2.equals("application/pgs") == false) goto L52;
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5334I() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.C7240j.m5334I():void");
    }

    /* renamed from: J */
    public final void m5333J() {
        this.f13165v = null;
        this.f13168y = -1;
        AbstractC7238h abstractC7238h = this.f13166w;
        if (abstractC7238h != null) {
            abstractC7238h.mo5345h();
            this.f13166w = null;
        }
        AbstractC7238h abstractC7238h2 = this.f13167x;
        if (abstractC7238h2 != null) {
            abstractC7238h2.mo5345h();
            this.f13167x = null;
        }
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: a */
    public final int mo4921a(C7003m0 c7003m0) {
        boolean z;
        int i;
        ((InterfaceC7235f.C7236a) this.f13157n).getClass();
        String str = c7003m0.f12287l;
        if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (c7003m0.f12274E == null) {
                i = 4;
            } else {
                i = 2;
            }
            return i | 0 | 0;
        } else if (C7424q.m5041i(c7003m0.f12287l)) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: b */
    public final boolean mo4920b() {
        return this.f13160q;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: d */
    public final boolean mo4919d() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.f13156m.mo5191z((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: o */
    public final void mo4918o(long j, long j2) {
        boolean z;
        boolean z2;
        C7121n0 c7121n0 = this.f13158o;
        if (this.f12135j) {
            long j3 = this.f13169z;
            if (j3 != -9223372036854775807L && j >= j3) {
                m5333J();
                this.f13160q = true;
            }
        }
        if (this.f13160q) {
            return;
        }
        if (this.f13167x == null) {
            InterfaceC7222d interfaceC7222d = this.f13164u;
            interfaceC7222d.getClass();
            interfaceC7222d.mo5344a(j);
            try {
                InterfaceC7222d interfaceC7222d2 = this.f13164u;
                interfaceC7222d2.getClass();
                this.f13167x = interfaceC7222d2.mo5352b();
            } catch (C7234e e) {
                m5335H(e);
                return;
            }
        }
        if (this.f12130e != 2) {
            return;
        }
        if (this.f13166w != null) {
            long m5336G = m5336G();
            z = false;
            while (m5336G <= j) {
                this.f13168y++;
                m5336G = m5336G();
                z = true;
            }
        } else {
            z = false;
        }
        AbstractC7238h abstractC7238h = this.f13167x;
        if (abstractC7238h != null) {
            if (abstractC7238h.m6018f(4)) {
                if (!z && m5336G() == Long.MAX_VALUE) {
                    if (this.f13162s == 2) {
                        m5333J();
                        InterfaceC7222d interfaceC7222d3 = this.f13164u;
                        interfaceC7222d3.getClass();
                        interfaceC7222d3.release();
                        this.f13164u = null;
                        this.f13162s = 0;
                        m5334I();
                    } else {
                        m5333J();
                        this.f13160q = true;
                    }
                }
            } else if (abstractC7238h.f10929b <= j) {
                AbstractC7238h abstractC7238h2 = this.f13166w;
                if (abstractC7238h2 != null) {
                    abstractC7238h2.mo5345h();
                }
                this.f13168y = abstractC7238h.mo5283a(j);
                this.f13166w = abstractC7238h;
                this.f13167x = null;
                z = true;
            }
        }
        if (z) {
            this.f13166w.getClass();
            List<Cue> mo5281c = this.f13166w.mo5281c(j);
            Handler handler = this.f13155l;
            if (handler != null) {
                handler.obtainMessage(0, mo5281c).sendToTarget();
            } else {
                this.f13156m.mo5191z(mo5281c);
            }
        }
        if (this.f13162s == 2) {
            return;
        }
        while (!this.f13159p) {
            try {
                C7237g c7237g = this.f13165v;
                if (c7237g == null) {
                    InterfaceC7222d interfaceC7222d4 = this.f13164u;
                    interfaceC7222d4.getClass();
                    c7237g = interfaceC7222d4.mo5351c();
                    if (c7237g == null) {
                        return;
                    }
                    this.f13165v = c7237g;
                }
                if (this.f13162s == 1) {
                    c7237g.f10915a = 4;
                    InterfaceC7222d interfaceC7222d5 = this.f13164u;
                    interfaceC7222d5.getClass();
                    interfaceC7222d5.mo5350d(c7237g);
                    this.f13165v = null;
                    this.f13162s = 2;
                    return;
                }
                int m5710F = m5710F(c7121n0, c7237g, 0);
                if (m5710F == -4) {
                    if (c7237g.m6018f(4)) {
                        this.f13159p = true;
                        this.f13161r = false;
                    } else {
                        C7003m0 c7003m0 = c7121n0.f12634b;
                        if (c7003m0 == null) {
                            return;
                        }
                        c7237g.f13152i = c7003m0.f12291p;
                        c7237g.m6019k();
                        boolean z3 = this.f13161r;
                        if (!c7237g.m6018f(1)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f13161r = z3 & z2;
                    }
                    if (!this.f13161r) {
                        InterfaceC7222d interfaceC7222d6 = this.f13164u;
                        interfaceC7222d6.getClass();
                        interfaceC7222d6.mo5350d(c7237g);
                        this.f13165v = null;
                    }
                } else if (m5710F == -3) {
                    return;
                }
            } catch (C7234e e2) {
                m5335H(e2);
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6974h
    /* renamed from: y */
    public final void mo4916y() {
        this.f13163t = null;
        this.f13169z = -9223372036854775807L;
        List<Cue> emptyList = Collections.emptyList();
        Handler handler = this.f13155l;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f13156m.mo5191z(emptyList);
        }
        m5333J();
        InterfaceC7222d interfaceC7222d = this.f13164u;
        interfaceC7222d.getClass();
        interfaceC7222d.release();
        this.f13164u = null;
        this.f13162s = 0;
    }
}
