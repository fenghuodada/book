package p060j$.util.stream;

import p060j$.util.InterfaceC10321P;
import p060j$.util.function.InterfaceC10397N;

/* renamed from: j$.util.stream.r2 */
/* loaded from: classes2.dex */
final class C10684r2 extends AbstractC10611d {

    /* renamed from: j */
    private final AbstractC10606c f21249j;

    /* renamed from: k */
    private final InterfaceC10397N f21250k;

    /* renamed from: l */
    private final long f21251l;

    /* renamed from: m */
    private final long f21252m;

    /* renamed from: n */
    private long f21253n;

    /* renamed from: o */
    private volatile boolean f21254o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10684r2(AbstractC10606c abstractC10606c, AbstractC10606c abstractC10606c2, InterfaceC10321P interfaceC10321P, InterfaceC10397N interfaceC10397N, long j, long j2) {
        super(abstractC10606c2, interfaceC10321P);
        this.f21249j = abstractC10606c;
        this.f21250k = interfaceC10397N;
        this.f21251l = j;
        this.f21252m = j2;
    }

    C10684r2(C10684r2 c10684r2, InterfaceC10321P interfaceC10321P) {
        super(c10684r2, interfaceC10321P);
        this.f21249j = c10684r2.f21249j;
        this.f21250k = c10684r2.f21250k;
        this.f21251l = c10684r2.f21251l;
        this.f21252m = c10684r2.f21252m;
    }

    /* renamed from: j */
    private long m624j(long j) {
        if (this.f21254o) {
            return this.f21253n;
        }
        C10684r2 c10684r2 = (C10684r2) this.f21167d;
        C10684r2 c10684r22 = (C10684r2) this.f21168e;
        if (c10684r2 == null || c10684r22 == null) {
            return this.f21253n;
        }
        long m624j = c10684r2.m624j(j);
        return m624j >= j ? m624j : m624j + c10684r22.m624j(j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10621f
    /* renamed from: a */
    public final Object mo606a() {
        if (m695c() == null) {
            InterfaceC10484A0 mo549t1 = this.f21249j.mo549t1(EnumC10587X2.SIZED.m758e(this.f21249j.f21141j) ? this.f21249j.mo570c1(this.f21165b) : -1L, this.f21250k);
            InterfaceC10634h2 mo525M1 = this.f21249j.mo525M1(this.f21164a.mo564i1(), mo549t1);
            AbstractC10707w0 abstractC10707w0 = this.f21164a;
            abstractC10707w0.mo574Y0(this.f21165b, abstractC10707w0.mo538z1(mo525M1));
            return mo549t1.build();
        }
        AbstractC10707w0 abstractC10707w02 = this.f21164a;
        InterfaceC10484A0 mo549t12 = abstractC10707w02.mo549t1(-1L, this.f21250k);
        abstractC10707w02.mo540y1(this.f21165b, mo549t12);
        InterfaceC10509F0 build = mo549t12.build();
        this.f21253n = build.count();
        this.f21254o = true;
        this.f21165b = null;
        return build;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10621f
    /* renamed from: d */
    public final AbstractC10621f mo605d(InterfaceC10321P interfaceC10321P) {
        return new C10684r2(this, interfaceC10321P);
    }

    @Override // p060j$.util.stream.AbstractC10611d
    /* renamed from: g */
    protected final void mo625g() {
        this.f21153i = true;
        if (this.f21254o) {
            mo694e(mo604i());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10611d
    /* renamed from: k */
    public final AbstractC10593Z0 mo604i() {
        return AbstractC10707w0.m571b1(this.f21249j.mo667F1());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    @Override // p060j$.util.stream.AbstractC10621f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r15) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p060j$.util.stream.C10684r2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
