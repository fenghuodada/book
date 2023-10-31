package p060j$.util.stream;

import java.util.ArrayDeque;
import p060j$.util.InterfaceC10318M;
import p060j$.util.InterfaceC10321P;

/* renamed from: j$.util.stream.h1 */
/* loaded from: classes2.dex */
abstract class AbstractC10633h1 extends AbstractC10643j1 implements InterfaceC10318M {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10633h1(InterfaceC10504E0 interfaceC10504E0) {
        super(interfaceC10504E0);
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: forEachRemaining */
    public final void m686d(Object obj) {
        if (this.f21186a == null) {
            return;
        }
        if (this.f21189d != null) {
            do {
            } while (m683p(obj));
            return;
        }
        InterfaceC10321P interfaceC10321P = this.f21188c;
        if (interfaceC10321P != null) {
            ((InterfaceC10318M) interfaceC10321P).forEachRemaining(obj);
            return;
        }
        ArrayDeque m678g = m678g();
        while (true) {
            InterfaceC10504E0 interfaceC10504E0 = (InterfaceC10504E0) AbstractC10643j1.m679e(m678g);
            if (interfaceC10504E0 == null) {
                this.f21186a = null;
                return;
            }
            interfaceC10504E0.mo653f(obj);
        }
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: tryAdvance */
    public final boolean m683p(Object obj) {
        InterfaceC10504E0 interfaceC10504E0;
        if (m677h()) {
            boolean tryAdvance = ((InterfaceC10318M) this.f21189d).tryAdvance(obj);
            if (!tryAdvance) {
                if (this.f21188c == null && (interfaceC10504E0 = (InterfaceC10504E0) AbstractC10643j1.m679e(this.f21190e)) != null) {
                    InterfaceC10318M spliterator = interfaceC10504E0.spliterator();
                    this.f21189d = spliterator;
                    return spliterator.tryAdvance(obj);
                }
                this.f21186a = null;
            }
            return tryAdvance;
        }
        return false;
    }
}
