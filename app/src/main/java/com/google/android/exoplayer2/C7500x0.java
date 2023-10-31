package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.C6642d0;
import com.google.android.exoplayer2.drm.InterfaceC6789n;
import com.google.android.exoplayer2.source.C7174j;
import com.google.android.exoplayer2.source.C7180l;
import com.google.android.exoplayer2.source.C7184m;
import com.google.android.exoplayer2.source.InterfaceC7167g0;
import com.google.android.exoplayer2.source.InterfaceC7185n;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.source.InterfaceC7196v;
import com.google.android.exoplayer2.upstream.InterfaceC7351c0;
import com.google.android.exoplayer2.util.C7408g0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.x0 */
/* loaded from: classes.dex */
public final class C7500x0 {

    /* renamed from: d */
    public final InterfaceC7504d f14230d;

    /* renamed from: e */
    public final InterfaceC7196v.C7197a f14231e;

    /* renamed from: f */
    public final InterfaceC6789n.C6790a f14232f;

    /* renamed from: g */
    public final HashMap<C7503c, C7502b> f14233g;

    /* renamed from: h */
    public final HashSet f14234h;

    /* renamed from: j */
    public boolean f14236j;
    @Nullable

    /* renamed from: k */
    public InterfaceC7351c0 f14237k;

    /* renamed from: i */
    public InterfaceC7167g0 f14235i = new InterfaceC7167g0.C7168a();

    /* renamed from: b */
    public final IdentityHashMap<InterfaceC7185n, C7503c> f14228b = new IdentityHashMap<>();

    /* renamed from: c */
    public final HashMap f14229c = new HashMap();

    /* renamed from: a */
    public final ArrayList f14227a = new ArrayList();

    /* renamed from: com.google.android.exoplayer2.x0$a */
    /* loaded from: classes.dex */
    public final class C7501a implements InterfaceC7196v, InterfaceC6789n {

        /* renamed from: a */
        public final C7503c f14238a;

        /* renamed from: b */
        public InterfaceC7196v.C7197a f14239b;

        /* renamed from: c */
        public InterfaceC6789n.C6790a f14240c;

        public C7501a(C7503c c7503c) {
            this.f14239b = C7500x0.this.f14231e;
            this.f14240c = C7500x0.this.f14232f;
            this.f14238a = c7503c;
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
        /* renamed from: E */
        public final void mo4884E(int i, @Nullable InterfaceC7188p.C7189a c7189a) {
            if (m4878a(i, c7189a)) {
                this.f14240c.m5992a();
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7196v
        /* renamed from: H */
        public final void mo4883H(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m) {
            if (m4878a(i, c7189a)) {
                this.f14239b.m5375d(c7174j, c7184m);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
        /* renamed from: L */
        public final void mo4882L(int i, @Nullable InterfaceC7188p.C7189a c7189a, int i2) {
            if (m4878a(i, c7189a)) {
                this.f14240c.m5989d(i2);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
        /* renamed from: M */
        public final void mo4881M(int i, @Nullable InterfaceC7188p.C7189a c7189a) {
            if (m4878a(i, c7189a)) {
                this.f14240c.m5987f();
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7196v
        /* renamed from: O */
        public final void mo4880O(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m, IOException iOException, boolean z) {
            if (m4878a(i, c7189a)) {
                this.f14239b.m5374e(c7174j, c7184m, iOException, z);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
        /* renamed from: P */
        public final void mo4879P(int i, @Nullable InterfaceC7188p.C7189a c7189a) {
            if (m4878a(i, c7189a)) {
                this.f14240c.m5990c();
            }
        }

        /* renamed from: a */
        public final boolean m4878a(int i, @Nullable InterfaceC7188p.C7189a c7189a) {
            C7503c c7503c = this.f14238a;
            InterfaceC7188p.C7189a c7189a2 = null;
            if (c7189a != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= c7503c.f14247c.size()) {
                        break;
                    } else if (((InterfaceC7188p.C7189a) c7503c.f14247c.get(i2)).f12931d == c7189a.f12931d) {
                        Object obj = c7503c.f14246b;
                        int i3 = AbstractC6631a.f10551e;
                        c7189a2 = c7189a.m5379b(Pair.create(obj, c7189a.f12928a));
                        break;
                    } else {
                        i2++;
                    }
                }
                if (c7189a2 == null) {
                    return false;
                }
            }
            int i4 = i + c7503c.f14248d;
            InterfaceC7196v.C7197a c7197a = this.f14239b;
            int i5 = c7197a.f12956a;
            C7500x0 c7500x0 = C7500x0.this;
            if (i5 != i4 || !C7408g0.m5105a(c7197a.f12957b, c7189a2)) {
                this.f14239b = new InterfaceC7196v.C7197a(c7500x0.f14231e.f12958c, i4, c7189a2);
            }
            InterfaceC6789n.C6790a c6790a = this.f14240c;
            if (c6790a.f11041a != i4 || !C7408g0.m5105a(c6790a.f11042b, c7189a2)) {
                this.f14240c = new InterfaceC6789n.C6790a(c7500x0.f14232f.f11043c, i4, c7189a2);
                return true;
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
        /* renamed from: g */
        public final /* synthetic */ void mo4877g() {
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7196v
        /* renamed from: l */
        public final void mo4876l(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7184m c7184m) {
            if (m4878a(i, c7189a)) {
                this.f14239b.m5377b(c7184m);
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7196v
        /* renamed from: m */
        public final void mo4875m(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m) {
            if (m4878a(i, c7189a)) {
                this.f14239b.m5376c(c7174j, c7184m);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
        /* renamed from: n */
        public final void mo4874n(int i, @Nullable InterfaceC7188p.C7189a c7189a, Exception exc) {
            if (m4878a(i, c7189a)) {
                this.f14240c.m5988e(exc);
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7196v
        /* renamed from: p */
        public final void mo4873p(int i, @Nullable InterfaceC7188p.C7189a c7189a, C7174j c7174j, C7184m c7184m) {
            if (m4878a(i, c7189a)) {
                this.f14239b.m5373f(c7174j, c7184m);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6789n
        /* renamed from: w */
        public final void mo4872w(int i, @Nullable InterfaceC7188p.C7189a c7189a) {
            if (m4878a(i, c7189a)) {
                this.f14240c.m5991b();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.x0$b */
    /* loaded from: classes.dex */
    public static final class C7502b {

        /* renamed from: a */
        public final InterfaceC7188p f14242a;

        /* renamed from: b */
        public final InterfaceC7188p.InterfaceC7190b f14243b;

        /* renamed from: c */
        public final C7501a f14244c;

        public C7502b(C7180l c7180l, C7498w0 c7498w0, C7501a c7501a) {
            this.f14242a = c7180l;
            this.f14243b = c7498w0;
            this.f14244c = c7501a;
        }
    }

    /* renamed from: com.google.android.exoplayer2.x0$c */
    /* loaded from: classes.dex */
    public static final class C7503c implements InterfaceC7443v0 {

        /* renamed from: a */
        public final C7180l f14245a;

        /* renamed from: d */
        public int f14248d;

        /* renamed from: e */
        public boolean f14249e;

        /* renamed from: c */
        public final ArrayList f14247c = new ArrayList();

        /* renamed from: b */
        public final Object f14246b = new Object();

        public C7503c(InterfaceC7188p interfaceC7188p, boolean z) {
            this.f14245a = new C7180l(interfaceC7188p, z);
        }

        @Override // com.google.android.exoplayer2.InterfaceC7443v0
        /* renamed from: a */
        public final Object mo4871a() {
            return this.f14246b;
        }

        @Override // com.google.android.exoplayer2.InterfaceC7443v0
        /* renamed from: b */
        public final AbstractC6984j1 mo4870b() {
            return this.f14245a.f12912n;
        }
    }

    /* renamed from: com.google.android.exoplayer2.x0$d */
    /* loaded from: classes.dex */
    public interface InterfaceC7504d {
    }

    public C7500x0(InterfaceC7504d interfaceC7504d, @Nullable C6642d0 c6642d0, Handler handler) {
        this.f14230d = interfaceC7504d;
        InterfaceC7196v.C7197a c7197a = new InterfaceC7196v.C7197a();
        this.f14231e = c7197a;
        InterfaceC6789n.C6790a c6790a = new InterfaceC6789n.C6790a();
        this.f14232f = c6790a;
        this.f14233g = new HashMap<>();
        this.f14234h = new HashSet();
        if (c6642d0 != null) {
            c7197a.f12958c.add(new InterfaceC7196v.C7197a.C7198a(handler, c6642d0));
            c6790a.f11043c.add(new InterfaceC6789n.C6790a.C6791a(handler, c6642d0));
        }
    }

    /* renamed from: a */
    public final AbstractC6984j1 m4890a(int i, List<C7503c> list, InterfaceC7167g0 interfaceC7167g0) {
        if (!list.isEmpty()) {
            this.f14235i = interfaceC7167g0;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C7503c c7503c = list.get(i2 - i);
                ArrayList arrayList = this.f14227a;
                if (i2 > 0) {
                    C7503c c7503c2 = (C7503c) arrayList.get(i2 - 1);
                    c7503c.f14248d = c7503c2.f14245a.f12912n.mo5409o() + c7503c2.f14248d;
                } else {
                    c7503c.f14248d = 0;
                }
                c7503c.f14249e = false;
                c7503c.f14247c.clear();
                int mo5409o = c7503c.f14245a.f12912n.mo5409o();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((C7503c) arrayList.get(i3)).f14248d += mo5409o;
                }
                arrayList.add(i2, c7503c);
                this.f14229c.put(c7503c.f14246b, c7503c);
                if (this.f14236j) {
                    m4886e(c7503c);
                    if (this.f14228b.isEmpty()) {
                        this.f14234h.add(c7503c);
                    } else {
                        C7502b c7502b = this.f14233g.get(c7503c);
                        if (c7502b != null) {
                            c7502b.f14242a.mo5390d(c7502b.f14243b);
                        }
                    }
                }
            }
        }
        return m4889b();
    }

    /* renamed from: b */
    public final AbstractC6984j1 m4889b() {
        ArrayList arrayList = this.f14227a;
        if (arrayList.isEmpty()) {
            return AbstractC6984j1.f12151a;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C7503c c7503c = (C7503c) arrayList.get(i2);
            c7503c.f14248d = i;
            i += c7503c.f14245a.f12912n.mo5409o();
        }
        return new C6737c1(arrayList, this.f14235i);
    }

    /* renamed from: c */
    public final void m4888c() {
        Iterator it = this.f14234h.iterator();
        while (it.hasNext()) {
            C7503c c7503c = (C7503c) it.next();
            if (c7503c.f14247c.isEmpty()) {
                C7502b c7502b = this.f14233g.get(c7503c);
                if (c7502b != null) {
                    c7502b.f14242a.mo5390d(c7502b.f14243b);
                }
                it.remove();
            }
        }
    }

    /* renamed from: d */
    public final void m4887d(C7503c c7503c) {
        if (c7503c.f14249e && c7503c.f14247c.isEmpty()) {
            C7502b remove = this.f14233g.remove(c7503c);
            remove.getClass();
            InterfaceC7188p.InterfaceC7190b interfaceC7190b = remove.f14243b;
            InterfaceC7188p interfaceC7188p = remove.f14242a;
            interfaceC7188p.mo5393a(interfaceC7190b);
            C7501a c7501a = remove.f14244c;
            interfaceC7188p.mo5391c(c7501a);
            interfaceC7188p.mo5387g(c7501a);
            this.f14234h.remove(c7503c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.exoplayer2.source.p$b, com.google.android.exoplayer2.w0] */
    /* renamed from: e */
    public final void m4886e(C7503c c7503c) {
        C7180l c7180l = c7503c.f14245a;
        ?? r1 = new InterfaceC7188p.InterfaceC7190b() { // from class: com.google.android.exoplayer2.w0
            @Override // com.google.android.exoplayer2.source.InterfaceC7188p.InterfaceC7190b
            /* renamed from: a */
            public final void mo4891a(AbstractC6984j1 abstractC6984j1) {
                ((C6989k0) C7500x0.this.f14230d).f12213g.mo5064i(22);
            }
        };
        C7501a c7501a = new C7501a(c7503c);
        this.f14233g.put(c7503c, new C7502b(c7180l, r1, c7501a));
        int i = C7408g0.f13905a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        c7180l.mo5392b(new Handler(myLooper, null), c7501a);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        c7180l.mo5388f(new Handler(myLooper2, null), c7501a);
        c7180l.mo5382l(r1, this.f14237k);
    }

    /* renamed from: f */
    public final void m4885f(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.f14227a;
            C7503c c7503c = (C7503c) arrayList.remove(i3);
            this.f14229c.remove(c7503c.f14246b);
            int i4 = -c7503c.f14245a.f12912n.mo5409o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((C7503c) arrayList.get(i5)).f14248d += i4;
            }
            c7503c.f14249e = true;
            if (this.f14236j) {
                m4887d(c7503c);
            }
        }
    }
}
