package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C8202b0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.k */
/* loaded from: classes3.dex */
public final class C8250k implements InterfaceC8216e1 {

    /* renamed from: a */
    public final AbstractC8244j f16036a;

    /* renamed from: b */
    public int f16037b;

    /* renamed from: c */
    public int f16038c;

    /* renamed from: d */
    public int f16039d = 0;

    public C8250k(AbstractC8244j abstractC8244j) {
        Charset charset = C8196a0.f15949a;
        if (abstractC8244j != null) {
            this.f16036a = abstractC8244j;
            abstractC8244j.f16025c = this;
            return;
        }
        throw new NullPointerException("input");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: A */
    public final void mo3764A(List<Float> list) throws IOException {
        int mo3768w;
        int mo3768w2;
        boolean z = list instanceof C8304w;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (!z) {
            int i = this.f16037b & 7;
            if (i == 2) {
                int mo3767x = abstractC8244j.mo3767x();
                m3745T(mo3767x);
                int mo3787d = abstractC8244j.mo3787d() + mo3767x;
                do {
                    list.add(Float.valueOf(abstractC8244j.mo3777n()));
                } while (abstractC8244j.mo3787d() < mo3787d);
                return;
            } else if (i != 5) {
                throw C8202b0.m3929b();
            } else {
                do {
                    list.add(Float.valueOf(abstractC8244j.mo3777n()));
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w = abstractC8244j.mo3768w();
                } while (mo3768w == this.f16037b);
                this.f16039d = mo3768w;
                return;
            }
        }
        C8304w c8304w = (C8304w) list;
        int i2 = this.f16037b & 7;
        if (i2 == 2) {
            int mo3767x2 = abstractC8244j.mo3767x();
            m3745T(mo3767x2);
            int mo3787d2 = abstractC8244j.mo3787d() + mo3767x2;
            do {
                c8304w.m3483b(abstractC8244j.mo3777n());
            } while (abstractC8244j.mo3787d() < mo3787d2);
        } else if (i2 != 5) {
            throw C8202b0.m3929b();
        } else {
            do {
                c8304w.m3483b(abstractC8244j.mo3777n());
                if (abstractC8244j.mo3786e()) {
                    return;
                }
                mo3768w2 = abstractC8244j.mo3768w();
            } while (mo3768w2 == this.f16037b);
            this.f16039d = mo3768w2;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: B */
    public final int mo3763B() throws IOException {
        m3746S(0);
        return this.f16036a.mo3776o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: C */
    public final boolean mo3762C() throws IOException {
        int i;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (abstractC8244j.mo3786e() || (i = this.f16037b) == this.f16038c) {
            return false;
        }
        return abstractC8244j.mo3765z(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: D */
    public final int mo3761D() throws IOException {
        m3746S(5);
        return this.f16036a.mo3774q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: E */
    public final void mo3760E(List<AbstractC8228i> list) throws IOException {
        int mo3768w;
        if ((this.f16037b & 7) != 2) {
            throw C8202b0.m3929b();
        }
        do {
            list.add(mo3718z());
            AbstractC8244j abstractC8244j = this.f16036a;
            if (abstractC8244j.mo3786e()) {
                return;
            }
            mo3768w = abstractC8244j.mo3768w();
        } while (mo3768w == this.f16037b);
        this.f16039d = mo3768w;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: F */
    public final void mo3759F(List<Double> list) throws IOException {
        int mo3768w;
        int mo3768w2;
        boolean z = list instanceof C8261n;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (!z) {
            int i = this.f16037b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(abstractC8244j.mo3781j()));
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w = abstractC8244j.mo3768w();
                } while (mo3768w == this.f16037b);
                this.f16039d = mo3768w;
                return;
            } else if (i != 2) {
                throw C8202b0.m3929b();
            } else {
                int mo3767x = abstractC8244j.mo3767x();
                m3744U(mo3767x);
                int mo3787d = abstractC8244j.mo3787d() + mo3767x;
                do {
                    list.add(Double.valueOf(abstractC8244j.mo3781j()));
                } while (abstractC8244j.mo3787d() < mo3787d);
                return;
            }
        }
        C8261n c8261n = (C8261n) list;
        int i2 = this.f16037b & 7;
        if (i2 == 1) {
            do {
                c8261n.m3646b(abstractC8244j.mo3781j());
                if (abstractC8244j.mo3786e()) {
                    return;
                }
                mo3768w2 = abstractC8244j.mo3768w();
            } while (mo3768w2 == this.f16037b);
            this.f16039d = mo3768w2;
        } else if (i2 != 2) {
            throw C8202b0.m3929b();
        } else {
            int mo3767x2 = abstractC8244j.mo3767x();
            m3744U(mo3767x2);
            int mo3787d2 = abstractC8244j.mo3787d() + mo3767x2;
            do {
                c8261n.m3646b(abstractC8244j.mo3781j());
            } while (abstractC8244j.mo3787d() < mo3787d2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: G */
    public final long mo3758G() throws IOException {
        m3746S(0);
        return this.f16036a.mo3775p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: H */
    public final String mo3757H() throws IOException {
        m3746S(2);
        return this.f16036a.mo3769v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: I */
    public final void mo3756I(List<Long> list) throws IOException {
        int mo3768w;
        int mo3768w2;
        boolean z = list instanceof C8236i0;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (!z) {
            int i = this.f16037b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC8244j.mo3778m()));
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w = abstractC8244j.mo3768w();
                } while (mo3768w == this.f16037b);
                this.f16039d = mo3768w;
                return;
            } else if (i != 2) {
                throw C8202b0.m3929b();
            } else {
                int mo3767x = abstractC8244j.mo3767x();
                m3744U(mo3767x);
                int mo3787d = abstractC8244j.mo3787d() + mo3767x;
                do {
                    list.add(Long.valueOf(abstractC8244j.mo3778m()));
                } while (abstractC8244j.mo3787d() < mo3787d);
                return;
            }
        }
        C8236i0 c8236i0 = (C8236i0) list;
        int i2 = this.f16037b & 7;
        if (i2 == 1) {
            do {
                c8236i0.m3808b(abstractC8244j.mo3778m());
                if (abstractC8244j.mo3786e()) {
                    return;
                }
                mo3768w2 = abstractC8244j.mo3768w();
            } while (mo3768w2 == this.f16037b);
            this.f16039d = mo3768w2;
        } else if (i2 != 2) {
            throw C8202b0.m3929b();
        } else {
            int mo3767x2 = abstractC8244j.mo3767x();
            m3744U(mo3767x2);
            int mo3787d2 = abstractC8244j.mo3787d() + mo3767x2;
            do {
                c8236i0.m3808b(abstractC8244j.mo3778m());
            } while (abstractC8244j.mo3787d() < mo3787d2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: J */
    public final <T> void mo3755J(List<T> list, InterfaceC8219f1<T> interfaceC8219f1, C8277q c8277q) throws IOException {
        int mo3768w;
        int i = this.f16037b;
        if ((i & 7) == 2) {
            do {
                list.add(m3749P(interfaceC8219f1, c8277q));
                AbstractC8244j abstractC8244j = this.f16036a;
                if (!abstractC8244j.mo3786e() && this.f16039d == 0) {
                    mo3768w = abstractC8244j.mo3768w();
                } else {
                    return;
                }
            } while (mo3768w == i);
            this.f16039d = mo3768w;
            return;
        }
        int i2 = C8202b0.f15951a;
        throw new C8202b0.C8203a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: K */
    public final void mo3754K() throws IOException {
        m3746S(2);
        AbstractC8244j abstractC8244j = this.f16036a;
        abstractC8244j.mo3784g(abstractC8244j.mo3767x());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: L */
    public final <T> T mo3753L(InterfaceC8219f1<T> interfaceC8219f1, C8277q c8277q) throws IOException {
        m3746S(3);
        return (T) m3750O(interfaceC8219f1, c8277q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: M */
    public final <T> T mo3752M(InterfaceC8219f1<T> interfaceC8219f1, C8277q c8277q) throws IOException {
        m3746S(2);
        return (T) m3749P(interfaceC8219f1, c8277q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: N */
    public final <T> void mo3751N(List<T> list, InterfaceC8219f1<T> interfaceC8219f1, C8277q c8277q) throws IOException {
        int mo3768w;
        int i = this.f16037b;
        if ((i & 7) == 3) {
            do {
                list.add(m3750O(interfaceC8219f1, c8277q));
                AbstractC8244j abstractC8244j = this.f16036a;
                if (!abstractC8244j.mo3786e() && this.f16039d == 0) {
                    mo3768w = abstractC8244j.mo3768w();
                } else {
                    return;
                }
            } while (mo3768w == i);
            this.f16039d = mo3768w;
            return;
        }
        int i2 = C8202b0.f15951a;
        throw new C8202b0.C8203a();
    }

    /* renamed from: O */
    public final <T> T m3750O(InterfaceC8219f1<T> interfaceC8219f1, C8277q c8277q) throws IOException {
        int i = this.f16038c;
        this.f16038c = ((this.f16037b >>> 3) << 3) | 4;
        try {
            T mo3489f = interfaceC8219f1.mo3489f();
            interfaceC8219f1.mo3485j(mo3489f, this, c8277q);
            interfaceC8219f1.mo3493b(mo3489f);
            if (this.f16037b == this.f16038c) {
                return mo3489f;
            }
            throw C8202b0.m3926e();
        } finally {
            this.f16038c = i;
        }
    }

    /* renamed from: P */
    public final <T> T m3749P(InterfaceC8219f1<T> interfaceC8219f1, C8277q c8277q) throws IOException {
        AbstractC8244j abstractC8244j = this.f16036a;
        int mo3767x = abstractC8244j.mo3767x();
        if (abstractC8244j.f16023a < abstractC8244j.f16024b) {
            int mo3784g = abstractC8244j.mo3784g(mo3767x);
            T mo3489f = interfaceC8219f1.mo3489f();
            abstractC8244j.f16023a++;
            interfaceC8219f1.mo3485j(mo3489f, this, c8277q);
            interfaceC8219f1.mo3493b(mo3489f);
            abstractC8244j.mo3788a(0);
            abstractC8244j.f16023a--;
            abstractC8244j.mo3785f(mo3784g);
            return mo3489f;
        }
        throw new C8202b0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: Q */
    public final void m3748Q(List<String> list, boolean z) throws IOException {
        int mo3768w;
        int mo3768w2;
        if ((this.f16037b & 7) != 2) {
            throw C8202b0.m3929b();
        }
        boolean z2 = list instanceof InterfaceC8221g0;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (!z2 || z) {
            do {
                list.add(z ? mo3757H() : mo3722v());
                if (abstractC8244j.mo3786e()) {
                    return;
                }
                mo3768w = abstractC8244j.mo3768w();
            } while (mo3768w == this.f16037b);
            this.f16039d = mo3768w;
            return;
        }
        InterfaceC8221g0 interfaceC8221g0 = (InterfaceC8221g0) list;
        do {
            interfaceC8221g0.mo3615x(mo3718z());
            if (abstractC8244j.mo3786e()) {
                return;
            }
            mo3768w2 = abstractC8244j.mo3768w();
        } while (mo3768w2 == this.f16037b);
        this.f16039d = mo3768w2;
    }

    /* renamed from: R */
    public final void m3747R(int i) throws IOException {
        if (this.f16036a.mo3787d() != i) {
            throw C8202b0.m3925f();
        }
    }

    /* renamed from: S */
    public final void m3746S(int i) throws IOException {
        if ((this.f16037b & 7) != i) {
            throw C8202b0.m3929b();
        }
    }

    /* renamed from: T */
    public final void m3745T(int i) throws IOException {
        if ((i & 3) != 0) {
            throw C8202b0.m3926e();
        }
    }

    /* renamed from: U */
    public final void m3744U(int i) throws IOException {
        if ((i & 7) != 0) {
            throw C8202b0.m3926e();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: a */
    public final int mo3743a() {
        return this.f16037b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: b */
    public final void mo3742b(List<Integer> list) throws IOException {
        int mo3768w;
        int mo3787d;
        int mo3768w2;
        boolean z = list instanceof C8316z;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (z) {
            C8316z c8316z = (C8316z) list;
            int i = this.f16037b & 7;
            if (i == 0) {
                do {
                    c8316z.m3454b(abstractC8244j.mo3772s());
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w2 = abstractC8244j.mo3768w();
                } while (mo3768w2 == this.f16037b);
                this.f16039d = mo3768w2;
                return;
            } else if (i != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    c8316z.m3454b(abstractC8244j.mo3772s());
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        } else {
            int i2 = this.f16037b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC8244j.mo3772s()));
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w = abstractC8244j.mo3768w();
                } while (mo3768w == this.f16037b);
                this.f16039d = mo3768w;
                return;
            } else if (i2 != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    list.add(Integer.valueOf(abstractC8244j.mo3772s()));
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        }
        m3747R(mo3787d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: c */
    public final long mo3741c() throws IOException {
        m3746S(0);
        return this.f16036a.mo3766y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: d */
    public final long mo3740d() throws IOException {
        m3746S(1);
        return this.f16036a.mo3778m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: e */
    public final void mo3739e(List<Integer> list) throws IOException {
        int mo3768w;
        int mo3768w2;
        boolean z = list instanceof C8316z;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (!z) {
            int i = this.f16037b & 7;
            if (i == 2) {
                int mo3767x = abstractC8244j.mo3767x();
                m3745T(mo3767x);
                int mo3787d = abstractC8244j.mo3787d() + mo3767x;
                do {
                    list.add(Integer.valueOf(abstractC8244j.mo3774q()));
                } while (abstractC8244j.mo3787d() < mo3787d);
                return;
            } else if (i != 5) {
                throw C8202b0.m3929b();
            } else {
                do {
                    list.add(Integer.valueOf(abstractC8244j.mo3774q()));
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w = abstractC8244j.mo3768w();
                } while (mo3768w == this.f16037b);
                this.f16039d = mo3768w;
                return;
            }
        }
        C8316z c8316z = (C8316z) list;
        int i2 = this.f16037b & 7;
        if (i2 == 2) {
            int mo3767x2 = abstractC8244j.mo3767x();
            m3745T(mo3767x2);
            int mo3787d2 = abstractC8244j.mo3787d() + mo3767x2;
            do {
                c8316z.m3454b(abstractC8244j.mo3774q());
            } while (abstractC8244j.mo3787d() < mo3787d2);
        } else if (i2 != 5) {
            throw C8202b0.m3929b();
        } else {
            do {
                c8316z.m3454b(abstractC8244j.mo3774q());
                if (abstractC8244j.mo3786e()) {
                    return;
                }
                mo3768w2 = abstractC8244j.mo3768w();
            } while (mo3768w2 == this.f16037b);
            this.f16039d = mo3768w2;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: f */
    public final void mo3738f(List<Long> list) throws IOException {
        int mo3768w;
        int mo3787d;
        int mo3768w2;
        boolean z = list instanceof C8236i0;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (z) {
            C8236i0 c8236i0 = (C8236i0) list;
            int i = this.f16037b & 7;
            if (i == 0) {
                do {
                    c8236i0.m3808b(abstractC8244j.mo3771t());
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w2 = abstractC8244j.mo3768w();
                } while (mo3768w2 == this.f16037b);
                this.f16039d = mo3768w2;
                return;
            } else if (i != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    c8236i0.m3808b(abstractC8244j.mo3771t());
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        } else {
            int i2 = this.f16037b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC8244j.mo3771t()));
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w = abstractC8244j.mo3768w();
                } while (mo3768w == this.f16037b);
                this.f16039d = mo3768w;
                return;
            } else if (i2 != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    list.add(Long.valueOf(abstractC8244j.mo3771t()));
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        }
        m3747R(mo3787d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: g */
    public final void mo3737g(List<Integer> list) throws IOException {
        int mo3768w;
        int mo3787d;
        int mo3768w2;
        boolean z = list instanceof C8316z;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (z) {
            C8316z c8316z = (C8316z) list;
            int i = this.f16037b & 7;
            if (i == 0) {
                do {
                    c8316z.m3454b(abstractC8244j.mo3767x());
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w2 = abstractC8244j.mo3768w();
                } while (mo3768w2 == this.f16037b);
                this.f16039d = mo3768w2;
                return;
            } else if (i != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    c8316z.m3454b(abstractC8244j.mo3767x());
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        } else {
            int i2 = this.f16037b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC8244j.mo3767x()));
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w = abstractC8244j.mo3768w();
                } while (mo3768w == this.f16037b);
                this.f16039d = mo3768w;
                return;
            } else if (i2 != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    list.add(Integer.valueOf(abstractC8244j.mo3767x()));
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        }
        m3747R(mo3787d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: h */
    public final int mo3736h() throws IOException {
        m3746S(5);
        return this.f16036a.mo3779l();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: i */
    public final boolean mo3735i() throws IOException {
        m3746S(0);
        return this.f16036a.mo3783h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: j */
    public final long mo3734j() throws IOException {
        m3746S(1);
        return this.f16036a.mo3773r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: k */
    public final void mo3733k(List<Long> list) throws IOException {
        int mo3768w;
        int mo3787d;
        int mo3768w2;
        boolean z = list instanceof C8236i0;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (z) {
            C8236i0 c8236i0 = (C8236i0) list;
            int i = this.f16037b & 7;
            if (i == 0) {
                do {
                    c8236i0.m3808b(abstractC8244j.mo3766y());
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w2 = abstractC8244j.mo3768w();
                } while (mo3768w2 == this.f16037b);
                this.f16039d = mo3768w2;
                return;
            } else if (i != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    c8236i0.m3808b(abstractC8244j.mo3766y());
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        } else {
            int i2 = this.f16037b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC8244j.mo3766y()));
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w = abstractC8244j.mo3768w();
                } while (mo3768w == this.f16037b);
                this.f16039d = mo3768w;
                return;
            } else if (i2 != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    list.add(Long.valueOf(abstractC8244j.mo3766y()));
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        }
        m3747R(mo3787d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: l */
    public final int mo3732l() throws IOException {
        m3746S(0);
        return this.f16036a.mo3767x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: m */
    public final void mo3731m(List<Long> list) throws IOException {
        int mo3768w;
        int mo3787d;
        int mo3768w2;
        boolean z = list instanceof C8236i0;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (z) {
            C8236i0 c8236i0 = (C8236i0) list;
            int i = this.f16037b & 7;
            if (i == 0) {
                do {
                    c8236i0.m3808b(abstractC8244j.mo3775p());
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w2 = abstractC8244j.mo3768w();
                } while (mo3768w2 == this.f16037b);
                this.f16039d = mo3768w2;
                return;
            } else if (i != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    c8236i0.m3808b(abstractC8244j.mo3775p());
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        } else {
            int i2 = this.f16037b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC8244j.mo3775p()));
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w = abstractC8244j.mo3768w();
                } while (mo3768w == this.f16037b);
                this.f16039d = mo3768w;
                return;
            } else if (i2 != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    list.add(Long.valueOf(abstractC8244j.mo3775p()));
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        }
        m3747R(mo3787d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: n */
    public final void mo3730n(List<Long> list) throws IOException {
        int mo3768w;
        int mo3768w2;
        boolean z = list instanceof C8236i0;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (!z) {
            int i = this.f16037b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC8244j.mo3773r()));
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w = abstractC8244j.mo3768w();
                } while (mo3768w == this.f16037b);
                this.f16039d = mo3768w;
                return;
            } else if (i != 2) {
                throw C8202b0.m3929b();
            } else {
                int mo3767x = abstractC8244j.mo3767x();
                m3744U(mo3767x);
                int mo3787d = abstractC8244j.mo3787d() + mo3767x;
                do {
                    list.add(Long.valueOf(abstractC8244j.mo3773r()));
                } while (abstractC8244j.mo3787d() < mo3787d);
                return;
            }
        }
        C8236i0 c8236i0 = (C8236i0) list;
        int i2 = this.f16037b & 7;
        if (i2 == 1) {
            do {
                c8236i0.m3808b(abstractC8244j.mo3773r());
                if (abstractC8244j.mo3786e()) {
                    return;
                }
                mo3768w2 = abstractC8244j.mo3768w();
            } while (mo3768w2 == this.f16037b);
            this.f16039d = mo3768w2;
        } else if (i2 != 2) {
            throw C8202b0.m3929b();
        } else {
            int mo3767x2 = abstractC8244j.mo3767x();
            m3744U(mo3767x2);
            int mo3787d2 = abstractC8244j.mo3787d() + mo3767x2;
            do {
                c8236i0.m3808b(abstractC8244j.mo3773r());
            } while (abstractC8244j.mo3787d() < mo3787d2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: o */
    public final void mo3729o(List<Integer> list) throws IOException {
        int mo3768w;
        int mo3787d;
        int mo3768w2;
        boolean z = list instanceof C8316z;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (z) {
            C8316z c8316z = (C8316z) list;
            int i = this.f16037b & 7;
            if (i == 0) {
                do {
                    c8316z.m3454b(abstractC8244j.mo3776o());
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w2 = abstractC8244j.mo3768w();
                } while (mo3768w2 == this.f16037b);
                this.f16039d = mo3768w2;
                return;
            } else if (i != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    c8316z.m3454b(abstractC8244j.mo3776o());
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        } else {
            int i2 = this.f16037b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC8244j.mo3776o()));
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w = abstractC8244j.mo3768w();
                } while (mo3768w == this.f16037b);
                this.f16039d = mo3768w;
                return;
            } else if (i2 != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    list.add(Integer.valueOf(abstractC8244j.mo3776o()));
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        }
        m3747R(mo3787d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: p */
    public final void mo3728p(List<Integer> list) throws IOException {
        int mo3768w;
        int mo3787d;
        int mo3768w2;
        boolean z = list instanceof C8316z;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (z) {
            C8316z c8316z = (C8316z) list;
            int i = this.f16037b & 7;
            if (i == 0) {
                do {
                    c8316z.m3454b(abstractC8244j.mo3780k());
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w2 = abstractC8244j.mo3768w();
                } while (mo3768w2 == this.f16037b);
                this.f16039d = mo3768w2;
                return;
            } else if (i != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    c8316z.m3454b(abstractC8244j.mo3780k());
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        } else {
            int i2 = this.f16037b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC8244j.mo3780k()));
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w = abstractC8244j.mo3768w();
                } while (mo3768w == this.f16037b);
                this.f16039d = mo3768w;
                return;
            } else if (i2 != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    list.add(Integer.valueOf(abstractC8244j.mo3780k()));
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        }
        m3747R(mo3787d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: q */
    public final int mo3727q() throws IOException {
        m3746S(0);
        return this.f16036a.mo3780k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: r */
    public final void mo3726r(List<Integer> list) throws IOException {
        int mo3768w;
        int mo3768w2;
        boolean z = list instanceof C8316z;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (!z) {
            int i = this.f16037b & 7;
            if (i == 2) {
                int mo3767x = abstractC8244j.mo3767x();
                m3745T(mo3767x);
                int mo3787d = abstractC8244j.mo3787d() + mo3767x;
                do {
                    list.add(Integer.valueOf(abstractC8244j.mo3779l()));
                } while (abstractC8244j.mo3787d() < mo3787d);
                return;
            } else if (i != 5) {
                throw C8202b0.m3929b();
            } else {
                do {
                    list.add(Integer.valueOf(abstractC8244j.mo3779l()));
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w = abstractC8244j.mo3768w();
                } while (mo3768w == this.f16037b);
                this.f16039d = mo3768w;
                return;
            }
        }
        C8316z c8316z = (C8316z) list;
        int i2 = this.f16037b & 7;
        if (i2 == 2) {
            int mo3767x2 = abstractC8244j.mo3767x();
            m3745T(mo3767x2);
            int mo3787d2 = abstractC8244j.mo3787d() + mo3767x2;
            do {
                c8316z.m3454b(abstractC8244j.mo3779l());
            } while (abstractC8244j.mo3787d() < mo3787d2);
        } else if (i2 != 5) {
            throw C8202b0.m3929b();
        } else {
            do {
                c8316z.m3454b(abstractC8244j.mo3779l());
                if (abstractC8244j.mo3786e()) {
                    return;
                }
                mo3768w2 = abstractC8244j.mo3768w();
            } while (mo3768w2 == this.f16037b);
            this.f16039d = mo3768w2;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    public final double readDouble() throws IOException {
        m3746S(1);
        return this.f16036a.mo3781j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    public final float readFloat() throws IOException {
        m3746S(5);
        return this.f16036a.mo3777n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: s */
    public final int mo3725s() throws IOException {
        m3746S(0);
        return this.f16036a.mo3772s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: t */
    public final long mo3724t() throws IOException {
        m3746S(0);
        return this.f16036a.mo3771t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: u */
    public final void mo3723u(List<Boolean> list) throws IOException {
        int mo3768w;
        int mo3787d;
        int mo3768w2;
        boolean z = list instanceof C8217f;
        AbstractC8244j abstractC8244j = this.f16036a;
        if (z) {
            C8217f c8217f = (C8217f) list;
            int i = this.f16037b & 7;
            if (i == 0) {
                do {
                    c8217f.m3876b(abstractC8244j.mo3783h());
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w2 = abstractC8244j.mo3768w();
                } while (mo3768w2 == this.f16037b);
                this.f16039d = mo3768w2;
                return;
            } else if (i != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    c8217f.m3876b(abstractC8244j.mo3783h());
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        } else {
            int i2 = this.f16037b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC8244j.mo3783h()));
                    if (abstractC8244j.mo3786e()) {
                        return;
                    }
                    mo3768w = abstractC8244j.mo3768w();
                } while (mo3768w == this.f16037b);
                this.f16039d = mo3768w;
                return;
            } else if (i2 != 2) {
                throw C8202b0.m3929b();
            } else {
                mo3787d = abstractC8244j.mo3787d() + abstractC8244j.mo3767x();
                do {
                    list.add(Boolean.valueOf(abstractC8244j.mo3783h()));
                } while (abstractC8244j.mo3787d() < mo3787d);
            }
        }
        m3747R(mo3787d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: v */
    public final String mo3722v() throws IOException {
        m3746S(2);
        return this.f16036a.mo3770u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: w */
    public final int mo3721w() throws IOException {
        int i = this.f16039d;
        if (i != 0) {
            this.f16037b = i;
            this.f16039d = 0;
        } else {
            this.f16037b = this.f16036a.mo3768w();
        }
        int i2 = this.f16037b;
        if (i2 == 0 || i2 == this.f16038c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: x */
    public final void mo3720x(List<String> list) throws IOException {
        m3748Q(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: y */
    public final void mo3719y(List<String> list) throws IOException {
        m3748Q(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1
    /* renamed from: z */
    public final AbstractC8228i mo3718z() throws IOException {
        m3746S(2);
        return this.f16036a.mo3782i();
    }
}
