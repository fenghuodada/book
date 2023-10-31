package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.C7127q0;
import com.google.android.exoplayer2.drm.C6778f;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.InterfaceC6789n;
import com.google.android.exoplayer2.drm.InterfaceC6792o;
import com.google.android.exoplayer2.extractor.C6821f;
import com.google.android.exoplayer2.source.C7139a0;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.source.InterfaceC7196v;
import com.google.android.exoplayer2.source.InterfaceC7200x;
import com.google.android.exoplayer2.upstream.C7367l;
import com.google.android.exoplayer2.upstream.C7372p;
import com.google.android.exoplayer2.upstream.C7375r;
import com.google.android.exoplayer2.upstream.C7385z;
import com.google.android.exoplayer2.upstream.InterfaceC7351c0;
import com.google.android.exoplayer2.upstream.InterfaceC7363i;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.exoplayer2.source.b0 */
/* loaded from: classes.dex */
public final class C7147b0 extends AbstractC7138a implements C7139a0.InterfaceC7141b {

    /* renamed from: g */
    public final C7127q0 f12784g;

    /* renamed from: h */
    public final C7127q0.C7133f f12785h;

    /* renamed from: i */
    public final InterfaceC7363i.InterfaceC7364a f12786i;

    /* renamed from: j */
    public final InterfaceC7200x.InterfaceC7201a f12787j;

    /* renamed from: k */
    public final InterfaceC6792o f12788k;

    /* renamed from: l */
    public final LoadErrorHandlingPolicy f12789l;

    /* renamed from: m */
    public final int f12790m;

    /* renamed from: n */
    public boolean f12791n;

    /* renamed from: o */
    public long f12792o;

    /* renamed from: p */
    public boolean f12793p;

    /* renamed from: q */
    public boolean f12794q;
    @Nullable

    /* renamed from: r */
    public InterfaceC7351c0 f12795r;

    /* renamed from: com.google.android.exoplayer2.source.b0$a */
    /* loaded from: classes.dex */
    public class C7148a extends AbstractC7169h {
        public C7148a(C7170h0 c7170h0) {
            super(c7170h0);
        }

        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: f */
        public final AbstractC6984j1.C6986b mo5413f(int i, AbstractC6984j1.C6986b c6986b, boolean z) {
            this.f12872b.mo5413f(i, c6986b, z);
            c6986b.f12157f = true;
            return c6986b;
        }

        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: n */
        public final AbstractC6984j1.C6987c mo5410n(int i, AbstractC6984j1.C6987c c6987c, long j) {
            this.f12872b.mo5410n(i, c6987c, j);
            c6987c.f12172l = true;
            return c6987c;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.b0$b */
    /* loaded from: classes.dex */
    public static final class C7149b implements InterfaceC7199w {

        /* renamed from: a */
        public final InterfaceC7363i.InterfaceC7364a f12796a;

        public C7149b(C7372p c7372p, C6821f c6821f) {
            this.f12796a = c7372p;
            new C6778f();
            new C7375r();
        }
    }

    public C7147b0(C7127q0 c7127q0, InterfaceC7363i.InterfaceC7364a interfaceC7364a, InterfaceC7200x.InterfaceC7201a interfaceC7201a, InterfaceC6792o interfaceC6792o, C7375r c7375r, int i) {
        C7127q0.C7133f c7133f = c7127q0.f12642b;
        c7133f.getClass();
        this.f12785h = c7133f;
        this.f12784g = c7127q0;
        this.f12786i = interfaceC7364a;
        this.f12787j = interfaceC7201a;
        this.f12788k = interfaceC6792o;
        this.f12789l = c7375r;
        this.f12790m = i;
        this.f12791n = true;
        this.f12792o = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: e */
    public final C7127q0 mo5389e() {
        return this.f12784g;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: h */
    public final void mo5386h() {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: j */
    public final void mo5384j(InterfaceC7185n interfaceC7185n) {
        C7159e0[] c7159e0Arr;
        C7139a0 c7139a0 = (C7139a0) interfaceC7185n;
        if (c7139a0.f12739v) {
            for (C7159e0 c7159e0 : c7139a0.f12736s) {
                c7159e0.m5449g();
                DrmSession drmSession = c7159e0.f12844i;
                if (drmSession != null) {
                    drmSession.mo5977b(c7159e0.f12840e);
                    c7159e0.f12844i = null;
                    c7159e0.f12843h = null;
                }
            }
        }
        C7385z c7385z = c7139a0.f12728k;
        C7385z.HandlerC7388c<? extends C7385z.InterfaceC7389d> handlerC7388c = c7385z.f13856b;
        if (handlerC7388c != null) {
            handlerC7388c.m5138a(true);
        }
        C7385z.RunnableC7391f runnableC7391f = new C7385z.RunnableC7391f(c7139a0);
        ExecutorService executorService = c7385z.f13855a;
        executorService.execute(runnableC7391f);
        executorService.shutdown();
        c7139a0.f12733p.removeCallbacksAndMessages(null);
        c7139a0.f12734q = null;
        c7139a0.f12717L = true;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: n */
    public final InterfaceC7185n mo5380n(InterfaceC7188p.C7189a c7189a, C7367l c7367l, long j) {
        InterfaceC7363i mo5147a = this.f12786i.mo5147a();
        InterfaceC7351c0 interfaceC7351c0 = this.f12795r;
        if (interfaceC7351c0 != null) {
            mo5147a.mo5158c(interfaceC7351c0);
        }
        C7127q0.C7133f c7133f = this.f12785h;
        return new C7139a0(c7133f.f12667a, mo5147a, new C7146b(((C7152c0) this.f12787j).f12806a), this.f12788k, new InterfaceC6789n.C6790a(this.f12701d.f11043c, 0, c7189a), this.f12789l, new InterfaceC7196v.C7197a(this.f12700c.f12958c, 0, c7189a), this, c7367l, c7133f.f12670d, this.f12790m);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC7138a
    /* renamed from: q */
    public final void mo5418q(@Nullable InterfaceC7351c0 interfaceC7351c0) {
        this.f12795r = interfaceC7351c0;
        this.f12788k.prepare();
        m5468s();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC7138a
    /* renamed from: r */
    public final void mo5417r() {
        this.f12788k.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.exoplayer2.source.b0$a] */
    /* renamed from: s */
    public final void m5468s() {
        C7170h0 c7170h0 = new C7170h0(this.f12792o, this.f12793p, this.f12794q, this.f12784g);
        if (this.f12791n) {
            c7170h0 = new C7148a(c7170h0);
        }
        this.f12703f = c7170h0;
        Iterator<InterfaceC7188p.InterfaceC7190b> it = this.f12698a.iterator();
        while (it.hasNext()) {
            it.next().mo4891a(c7170h0);
        }
    }

    /* renamed from: t */
    public final void m5467t(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f12792o;
        }
        if (!this.f12791n && this.f12792o == j && this.f12793p == z && this.f12794q == z2) {
            return;
        }
        this.f12792o = j;
        this.f12793p = z;
        this.f12794q = z2;
        this.f12791n = false;
        m5468s();
    }
}
