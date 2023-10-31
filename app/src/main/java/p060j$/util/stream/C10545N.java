package p060j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
import p060j$.util.InterfaceC10321P;

/* renamed from: j$.util.stream.N */
/* loaded from: classes2.dex */
final class C10545N extends AbstractC10611d {

    /* renamed from: j */
    private final C10518H f21044j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10545N(C10518H c10518h, AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P) {
        super(abstractC10707w0, interfaceC10321P);
        this.f21044j = c10518h;
    }

    C10545N(C10545N c10545n, InterfaceC10321P interfaceC10321P) {
        super(c10545n, interfaceC10321P);
        this.f21044j = c10545n.f21044j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10621f
    /* renamed from: a */
    public final Object mo606a() {
        boolean z;
        AbstractC10707w0 abstractC10707w0 = this.f21164a;
        InterfaceC10522H3 interfaceC10522H3 = (InterfaceC10522H3) this.f21044j.f21001d.get();
        abstractC10707w0.mo540y1(this.f21165b, interfaceC10522H3);
        Object obj = interfaceC10522H3.get();
        if (!this.f21044j.f20998a) {
            if (obj != null) {
                AtomicReference atomicReference = this.f21152h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        } else if (obj != null) {
            C10545N c10545n = this;
            while (true) {
                if (c10545n != null) {
                    AbstractC10621f m695c = c10545n.m695c();
                    if (m695c != null && m695c.f21167d != c10545n) {
                        z = false;
                        break;
                    }
                    c10545n = m695c;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                AtomicReference atomicReference2 = this.f21152h;
                while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                }
            } else {
                m717h();
            }
            return obj;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10621f
    /* renamed from: d */
    public final AbstractC10621f mo605d(InterfaceC10321P interfaceC10321P) {
        return new C10545N(this, interfaceC10321P);
    }

    @Override // p060j$.util.stream.AbstractC10611d
    /* renamed from: i */
    protected final Object mo604i() {
        return this.f21044j.f20999b;
    }

    @Override // p060j$.util.stream.AbstractC10621f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        boolean z;
        if (this.f21044j.f20998a) {
            C10545N c10545n = (C10545N) this.f21167d;
            C10545N c10545n2 = null;
            while (true) {
                if (c10545n == c10545n2) {
                    break;
                }
                Object mo696b = c10545n.mo696b();
                if (mo696b == null || !this.f21044j.f21000c.test(mo696b)) {
                    c10545n2 = c10545n;
                    c10545n = (C10545N) this.f21168e;
                } else {
                    mo694e(mo696b);
                    C10545N c10545n3 = this;
                    while (true) {
                        if (c10545n3 != null) {
                            AbstractC10621f m695c = c10545n3.m695c();
                            if (m695c != null && m695c.f21167d != c10545n3) {
                                z = false;
                                break;
                            }
                            c10545n3 = m695c;
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        AtomicReference atomicReference = this.f21152h;
                        while (!atomicReference.compareAndSet(null, mo696b) && atomicReference.get() == null) {
                        }
                    } else {
                        m717h();
                    }
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
