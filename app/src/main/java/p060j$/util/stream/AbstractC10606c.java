package p060j$.util.stream;

import p060j$.util.InterfaceC10321P;
import p060j$.util.function.InterfaceC10397N;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c */
/* loaded from: classes2.dex */
public abstract class AbstractC10606c extends AbstractC10707w0 implements InterfaceC10636i {

    /* renamed from: h */
    private final AbstractC10606c f21139h;

    /* renamed from: i */
    private final AbstractC10606c f21140i;

    /* renamed from: j */
    protected final int f21141j;

    /* renamed from: k */
    private AbstractC10606c f21142k;

    /* renamed from: l */
    private int f21143l;

    /* renamed from: m */
    private int f21144m;

    /* renamed from: n */
    private InterfaceC10321P f21145n;

    /* renamed from: o */
    private boolean f21146o;

    /* renamed from: p */
    private boolean f21147p;

    /* renamed from: q */
    private Runnable f21148q;

    /* renamed from: r */
    private boolean f21149r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10606c(InterfaceC10321P interfaceC10321P, int i, boolean z) {
        this.f21140i = null;
        this.f21145n = interfaceC10321P;
        this.f21139h = this;
        int i2 = EnumC10587X2.f21098g & i;
        this.f21141j = i2;
        this.f21144m = (~(i2 << 1)) & EnumC10587X2.f21103l;
        this.f21143l = 0;
        this.f21149r = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10606c(AbstractC10606c abstractC10606c, int i) {
        if (abstractC10606c.f21146o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC10606c.f21146o = true;
        abstractC10606c.f21142k = this;
        this.f21140i = abstractC10606c;
        this.f21141j = EnumC10587X2.f21099h & i;
        this.f21144m = EnumC10587X2.m762a(i, abstractC10606c.f21144m);
        AbstractC10606c abstractC10606c2 = abstractC10606c.f21139h;
        this.f21139h = abstractC10606c2;
        if (mo680L1()) {
            abstractC10606c2.f21147p = true;
        }
        this.f21143l = abstractC10606c.f21143l + 1;
    }

    /* renamed from: N1 */
    private InterfaceC10321P m720N1(int i) {
        int i2;
        int i3;
        AbstractC10606c abstractC10606c = this.f21139h;
        InterfaceC10321P interfaceC10321P = abstractC10606c.f21145n;
        if (interfaceC10321P != null) {
            abstractC10606c.f21145n = null;
            if (abstractC10606c.f21149r && abstractC10606c.f21147p) {
                AbstractC10606c abstractC10606c2 = abstractC10606c.f21142k;
                int i4 = 1;
                while (abstractC10606c != this) {
                    int i5 = abstractC10606c2.f21141j;
                    if (abstractC10606c2.mo680L1()) {
                        if (EnumC10587X2.SHORT_CIRCUIT.m759d(i5)) {
                            i5 &= ~EnumC10587X2.f21112u;
                        }
                        interfaceC10321P = abstractC10606c2.mo628K1(abstractC10606c, interfaceC10321P);
                        if (interfaceC10321P.hasCharacteristics(64)) {
                            i2 = (~EnumC10587X2.f21111t) & i5;
                            i3 = EnumC10587X2.f21110s;
                        } else {
                            i2 = (~EnumC10587X2.f21110s) & i5;
                            i3 = EnumC10587X2.f21111t;
                        }
                        i5 = i3 | i2;
                        i4 = 0;
                    }
                    abstractC10606c2.f21143l = i4;
                    abstractC10606c2.f21144m = EnumC10587X2.m762a(i5, abstractC10606c.f21144m);
                    i4++;
                    AbstractC10606c abstractC10606c3 = abstractC10606c2;
                    abstractC10606c2 = abstractC10606c2.f21142k;
                    abstractC10606c = abstractC10606c3;
                }
            }
            if (i != 0) {
                this.f21144m = EnumC10587X2.m762a(i, this.f21144m);
            }
            return interfaceC10321P;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A1 */
    public final InterfaceC10509F0 m726A1(InterfaceC10321P interfaceC10321P, boolean z, InterfaceC10397N interfaceC10397N) {
        if (this.f21139h.f21149r) {
            return mo669D1(this, interfaceC10321P, z, interfaceC10397N);
        }
        InterfaceC10484A0 mo549t1 = mo549t1(mo570c1(interfaceC10321P), interfaceC10397N);
        mo540y1(interfaceC10321P, mo549t1);
        return mo549t1.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B1 */
    public final Object m725B1(InterfaceC10517G3 interfaceC10517G3) {
        if (this.f21146o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f21146o = true;
        return this.f21139h.f21149r ? interfaceC10517G3.mo600A(this, m720N1(interfaceC10517G3.mo582R())) : interfaceC10517G3.mo557p0(this, m720N1(interfaceC10517G3.mo582R()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C1 */
    public final InterfaceC10509F0 m724C1(InterfaceC10397N interfaceC10397N) {
        AbstractC10606c abstractC10606c;
        if (this.f21146o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f21146o = true;
        if (this.f21139h.f21149r && (abstractC10606c = this.f21140i) != null && mo680L1()) {
            this.f21143l = 0;
            return mo526J1(abstractC10606c.m720N1(0), interfaceC10397N, abstractC10606c);
        }
        return m726A1(m720N1(0), true, interfaceC10397N);
    }

    /* renamed from: D1 */
    abstract InterfaceC10509F0 mo669D1(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, boolean z, InterfaceC10397N interfaceC10397N);

    /* renamed from: E1 */
    abstract void mo668E1(InterfaceC10321P interfaceC10321P, InterfaceC10634h2 interfaceC10634h2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F1 */
    public abstract EnumC10591Y2 mo667F1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G1 */
    public final EnumC10591Y2 m723G1() {
        AbstractC10606c abstractC10606c = this;
        while (abstractC10606c.f21143l > 0) {
            abstractC10606c = abstractC10606c.f21140i;
        }
        return abstractC10606c.mo667F1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H1 */
    public final boolean m722H1() {
        return EnumC10587X2.ORDERED.m759d(this.f21144m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I1 */
    public final /* synthetic */ InterfaceC10321P m721I1() {
        return m720N1(0);
    }

    /* renamed from: J1 */
    InterfaceC10509F0 mo526J1(InterfaceC10321P interfaceC10321P, InterfaceC10397N interfaceC10397N, AbstractC10606c abstractC10606c) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    /* renamed from: K1 */
    InterfaceC10321P mo628K1(AbstractC10606c abstractC10606c, InterfaceC10321P interfaceC10321P) {
        return mo526J1(interfaceC10321P, new C10601b(0), abstractC10606c).spliterator();
    }

    /* renamed from: L1 */
    abstract boolean mo680L1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M1 */
    public abstract InterfaceC10634h2 mo525M1(int i, InterfaceC10634h2 interfaceC10634h2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O1 */
    public final InterfaceC10321P m719O1() {
        AbstractC10606c abstractC10606c = this.f21139h;
        if (this == abstractC10606c) {
            if (this.f21146o) {
                throw new IllegalStateException("stream has already been operated upon or closed");
            }
            this.f21146o = true;
            InterfaceC10321P interfaceC10321P = abstractC10606c.f21145n;
            if (interfaceC10321P != null) {
                abstractC10606c.f21145n = null;
                return interfaceC10321P;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        throw new IllegalStateException();
    }

    /* renamed from: P1 */
    abstract InterfaceC10321P mo666P1(AbstractC10707w0 abstractC10707w0, C10596a c10596a, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q1 */
    public final InterfaceC10321P m718Q1(InterfaceC10321P interfaceC10321P) {
        return this.f21143l == 0 ? interfaceC10321P : mo666P1(this, new C10596a(interfaceC10321P, 0), this.f21139h.f21149r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: X0 */
    public final void mo575X0(InterfaceC10321P interfaceC10321P, InterfaceC10634h2 interfaceC10634h2) {
        interfaceC10634h2.getClass();
        if (EnumC10587X2.SHORT_CIRCUIT.m759d(this.f21144m)) {
            mo574Y0(interfaceC10321P, interfaceC10634h2);
            return;
        }
        interfaceC10634h2.mo531g(interfaceC10321P.getExactSizeIfKnown());
        interfaceC10321P.forEachRemaining(interfaceC10634h2);
        interfaceC10634h2.end();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: Y0 */
    public final void mo574Y0(InterfaceC10321P interfaceC10321P, InterfaceC10634h2 interfaceC10634h2) {
        AbstractC10606c abstractC10606c = this;
        while (abstractC10606c.f21143l > 0) {
            abstractC10606c = abstractC10606c.f21140i;
        }
        interfaceC10634h2.mo531g(interfaceC10321P.getExactSizeIfKnown());
        abstractC10606c.mo668E1(interfaceC10321P, interfaceC10634h2);
        interfaceC10634h2.end();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: c1 */
    public final long mo570c1(InterfaceC10321P interfaceC10321P) {
        if (EnumC10587X2.SIZED.m759d(this.f21144m)) {
            return interfaceC10321P.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // p060j$.util.stream.InterfaceC10636i, java.lang.AutoCloseable
    public final void close() {
        this.f21146o = true;
        this.f21145n = null;
        AbstractC10606c abstractC10606c = this.f21139h;
        Runnable runnable = abstractC10606c.f21148q;
        if (runnable != null) {
            abstractC10606c.f21148q = null;
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: i1 */
    public final int mo564i1() {
        return this.f21144m;
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final boolean isParallel() {
        return this.f21139h.f21149r;
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final InterfaceC10636i onClose(Runnable runnable) {
        AbstractC10606c abstractC10606c = this.f21139h;
        Runnable runnable2 = abstractC10606c.f21148q;
        if (runnable2 != null) {
            runnable = new RunnableC10512F3(runnable2, runnable);
        }
        abstractC10606c.f21148q = runnable;
        return this;
    }

    public final InterfaceC10636i parallel() {
        this.f21139h.f21149r = true;
        return this;
    }

    public final InterfaceC10636i sequential() {
        this.f21139h.f21149r = false;
        return this;
    }

    public InterfaceC10321P spliterator() {
        if (this.f21146o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f21146o = true;
        AbstractC10606c abstractC10606c = this.f21139h;
        if (this == abstractC10606c) {
            InterfaceC10321P interfaceC10321P = abstractC10606c.f21145n;
            if (interfaceC10321P != null) {
                abstractC10606c.f21145n = null;
                return interfaceC10321P;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return mo666P1(this, new C10596a(this, 1), abstractC10606c.f21149r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: y1 */
    public final InterfaceC10634h2 mo540y1(InterfaceC10321P interfaceC10321P, InterfaceC10634h2 interfaceC10634h2) {
        interfaceC10634h2.getClass();
        mo575X0(interfaceC10321P, mo538z1(interfaceC10634h2));
        return interfaceC10634h2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: z1 */
    public final InterfaceC10634h2 mo538z1(InterfaceC10634h2 interfaceC10634h2) {
        interfaceC10634h2.getClass();
        AbstractC10606c abstractC10606c = this;
        while (abstractC10606c.f21143l > 0) {
            AbstractC10606c abstractC10606c2 = abstractC10606c.f21140i;
            interfaceC10634h2 = abstractC10606c.mo525M1(abstractC10606c2.f21144m, interfaceC10634h2);
            abstractC10606c = abstractC10606c2;
        }
        return interfaceC10634h2;
    }
}
