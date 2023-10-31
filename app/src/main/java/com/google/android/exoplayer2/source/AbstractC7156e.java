package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.InterfaceC6789n;
import com.google.android.exoplayer2.source.C7180l;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.source.InterfaceC7196v;
import com.google.android.exoplayer2.upstream.InterfaceC7351c0;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.UnknownNull;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.google.android.exoplayer2.source.e */
/* loaded from: classes.dex */
public abstract class AbstractC7156e<T> extends AbstractC7138a {

    /* renamed from: g */
    public final HashMap<T, C7158b<T>> f12823g = new HashMap<>();
    @Nullable

    /* renamed from: h */
    public Handler f12824h;
    @Nullable

    /* renamed from: i */
    public InterfaceC7351c0 f12825i;

    /* renamed from: com.google.android.exoplayer2.source.e$a */
    /* loaded from: classes.dex */
    public final class C7157a implements InterfaceC7196v, InterfaceC6789n {
        @UnknownNull

        /* renamed from: a */
        public final T f12826a = null;

        /* renamed from: b */
        public InterfaceC7196v.C7197a f12827b;

        /* renamed from: c */
        public InterfaceC6789n.C6790a f12828c;

        public C7157a() {
            this.f12827b = new InterfaceC7196v.C7197a(AbstractC7156e.this.f12700c.f12958c, 0, null);
            this.f12828c = new InterfaceC6789n.C6790a(AbstractC7156e.this.f12701d.f11043c, 0, null);
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
        /* renamed from: E */
        public final void mo4884E(int i, @Nullable InterfaceC7188p.C7189a c7189a) {
            m5457a(i, c7189a);
            this.f12828c.m5992a();
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7196v
        /* renamed from: H */
        public final void mo4883H(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m) {
            m5457a(i, c7189a);
            this.f12827b.m5375d(c7174j, m5456b(c7184m));
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
        /* renamed from: L */
        public final void mo4882L(int i, @Nullable InterfaceC7188p.C7189a c7189a, int i2) {
            m5457a(i, c7189a);
            this.f12828c.m5989d(i2);
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
        /* renamed from: M */
        public final void mo4881M(int i, @Nullable InterfaceC7188p.C7189a c7189a) {
            m5457a(i, c7189a);
            this.f12828c.m5987f();
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7196v
        /* renamed from: O */
        public final void mo4880O(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m, IOException iOException, boolean z) {
            m5457a(i, c7189a);
            this.f12827b.m5374e(c7174j, m5456b(c7184m), iOException, z);
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
        /* renamed from: P */
        public final void mo4879P(int i, @Nullable InterfaceC7188p.C7189a c7189a) {
            m5457a(i, c7189a);
            this.f12828c.m5990c();
        }

        /* renamed from: a */
        public final boolean m5457a(int i, @Nullable InterfaceC7188p.C7189a c7189a) {
            InterfaceC7188p.C7189a c7189a2;
            AbstractC7156e abstractC7156e = AbstractC7156e.this;
            if (c7189a != null) {
                C7180l c7180l = (C7180l) abstractC7156e;
                c7180l.getClass();
                Void r2 = (Void) this.f12826a;
                Object obj = c7180l.f12912n.f12919d;
                Object obj2 = c7189a.f12928a;
                if (obj != null && obj.equals(obj2)) {
                    obj2 = C7180l.C7181a.f12917e;
                }
                c7189a2 = c7189a.m5379b(obj2);
            } else {
                c7189a2 = null;
            }
            abstractC7156e.getClass();
            InterfaceC7196v.C7197a c7197a = this.f12827b;
            if (c7197a.f12956a != i || !C7408g0.m5105a(c7197a.f12957b, c7189a2)) {
                this.f12827b = new InterfaceC7196v.C7197a(abstractC7156e.f12700c.f12958c, i, c7189a2);
            }
            InterfaceC6789n.C6790a c6790a = this.f12828c;
            if (c6790a.f11041a != i || !C7408g0.m5105a(c6790a.f11042b, c7189a2)) {
                this.f12828c = new InterfaceC6789n.C6790a(abstractC7156e.f12701d.f11043c, i, c7189a2);
                return true;
            }
            return true;
        }

        /* renamed from: b */
        public final C7184m m5456b(C7184m c7184m) {
            long j = c7184m.f12926f;
            AbstractC7156e abstractC7156e = AbstractC7156e.this;
            abstractC7156e.getClass();
            long j2 = c7184m.f12927g;
            abstractC7156e.getClass();
            return (j == c7184m.f12926f && j2 == c7184m.f12927g) ? c7184m : new C7184m(c7184m.f12921a, c7184m.f12922b, c7184m.f12923c, c7184m.f12924d, c7184m.f12925e, j, j2);
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
        /* renamed from: g */
        public final /* synthetic */ void mo4877g() {
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7196v
        /* renamed from: l */
        public final void mo4876l(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7184m c7184m) {
            m5457a(i, c7189a);
            this.f12827b.m5377b(m5456b(c7184m));
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7196v
        /* renamed from: m */
        public final void mo4875m(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m) {
            m5457a(i, c7189a);
            this.f12827b.m5376c(c7174j, m5456b(c7184m));
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
        /* renamed from: n */
        public final void mo4874n(int i, @Nullable InterfaceC7188p.C7189a c7189a, Exception exc) {
            m5457a(i, c7189a);
            this.f12828c.m5988e(exc);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7196v
        /* renamed from: p */
        public final void mo4873p(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m) {
            m5457a(i, c7189a);
            this.f12827b.m5373f(c7174j, m5456b(c7184m));
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
        /* renamed from: w */
        public final void mo4872w(int i, @Nullable InterfaceC7188p.C7189a c7189a) {
            m5457a(i, c7189a);
            this.f12828c.m5991b();
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.e$b */
    /* loaded from: classes.dex */
    public static final class C7158b<T> {

        /* renamed from: a */
        public final InterfaceC7188p f12830a;

        /* renamed from: b */
        public final InterfaceC7188p.InterfaceC7190b f12831b;

        /* renamed from: c */
        public final AbstractC7156e<T>.C7157a f12832c;

        public C7158b(InterfaceC7188p interfaceC7188p, C7153d c7153d, C7157a c7157a) {
            this.f12830a = interfaceC7188p;
            this.f12831b = c7153d;
            this.f12832c = c7157a;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC7138a
    @CallSuper
    /* renamed from: o */
    public final void mo5460o() {
        for (C7158b<T> c7158b : this.f12823g.values()) {
            c7158b.f12830a.mo5390d(c7158b.f12831b);
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC7138a
    @CallSuper
    /* renamed from: p */
    public final void mo5459p() {
        for (C7158b<T> c7158b : this.f12823g.values()) {
            c7158b.f12830a.mo5381m(c7158b.f12831b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.exoplayer2.source.p$b, com.google.android.exoplayer2.source.d] */
    /* renamed from: s */
    public final void m5458s(InterfaceC7188p interfaceC7188p) {
        HashMap<T, C7158b<T>> hashMap = this.f12823g;
        C7394a.m5134a(!hashMap.containsKey(null));
        ?? r2 = new InterfaceC7188p.InterfaceC7190b() { // from class: com.google.android.exoplayer2.source.d

            /* renamed from: b */
            public final /* synthetic */ Object f12808b = null;

            /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00dd A[LOOP:0: B:34:0x00d7->B:36:0x00dd, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
            /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
            @Override // com.google.android.exoplayer2.source.InterfaceC7188p.InterfaceC7190b
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void mo4891a(com.google.android.exoplayer2.AbstractC6984j1 r11) {
                /*
                    Method dump skipped, instructions count: 273
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C7153d.mo4891a(com.google.android.exoplayer2.j1):void");
            }
        };
        C7157a c7157a = new C7157a();
        hashMap.put(null, new C7158b<>(interfaceC7188p, r2, c7157a));
        Handler handler = this.f12824h;
        handler.getClass();
        interfaceC7188p.mo5392b(handler, c7157a);
        Handler handler2 = this.f12824h;
        handler2.getClass();
        interfaceC7188p.mo5388f(handler2, c7157a);
        interfaceC7188p.mo5382l(r2, this.f12825i);
        if (!(!this.f12699b.isEmpty())) {
            interfaceC7188p.mo5390d(r2);
        }
    }
}
