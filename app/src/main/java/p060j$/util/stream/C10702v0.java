package p060j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import p060j$.util.InterfaceC10321P;

/* renamed from: j$.util.stream.v0 */
/* loaded from: classes2.dex */
final class C10702v0 extends AbstractC10611d {

    /* renamed from: j */
    private final C10697u0 f21276j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10702v0(C10697u0 c10697u0, AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P) {
        super(abstractC10707w0, interfaceC10321P);
        this.f21276j = c10697u0;
    }

    C10702v0(C10702v0 c10702v0, InterfaceC10321P interfaceC10321P) {
        super(c10702v0, interfaceC10321P);
        this.f21276j = c10702v0.f21276j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10621f
    /* renamed from: a */
    public final Object mo606a() {
        boolean z;
        Boolean valueOf;
        AbstractC10707w0 abstractC10707w0 = this.f21164a;
        AbstractC10687s0 abstractC10687s0 = (AbstractC10687s0) this.f21276j.f21270b.get();
        abstractC10707w0.mo540y1(this.f21165b, abstractC10687s0);
        boolean z2 = abstractC10687s0.f21259b;
        z = this.f21276j.f21269a.f21265b;
        if (z2 == z && (valueOf = Boolean.valueOf(z2)) != null) {
            AtomicReference atomicReference = this.f21152h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10621f
    /* renamed from: d */
    public final AbstractC10621f mo605d(InterfaceC10321P interfaceC10321P) {
        return new C10702v0(this, interfaceC10321P);
    }

    @Override // p060j$.util.stream.AbstractC10611d
    /* renamed from: i */
    protected final Object mo604i() {
        boolean z;
        z = this.f21276j.f21269a.f21265b;
        return Boolean.valueOf(!z);
    }
}
