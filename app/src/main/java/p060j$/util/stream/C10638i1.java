package p060j$.util.stream;

import java.util.ArrayDeque;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.stream.i1 */
/* loaded from: classes2.dex */
final class C10638i1 extends AbstractC10643j1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10638i1(InterfaceC10509F0 interfaceC10509F0) {
        super(interfaceC10509F0);
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final boolean mo534a(Consumer consumer) {
        InterfaceC10509F0 m679e;
        if (m677h()) {
            boolean mo534a = this.f21189d.mo534a(consumer);
            if (!mo534a) {
                if (this.f21188c == null && (m679e = AbstractC10643j1.m679e(this.f21190e)) != null) {
                    InterfaceC10321P spliterator = m679e.spliterator();
                    this.f21189d = spliterator;
                    return spliterator.mo534a(consumer);
                }
                this.f21186a = null;
            }
            return mo534a;
        }
        return false;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final void forEachRemaining(Consumer consumer) {
        if (this.f21186a == null) {
            return;
        }
        if (this.f21189d != null) {
            do {
            } while (mo534a(consumer));
            return;
        }
        InterfaceC10321P interfaceC10321P = this.f21188c;
        if (interfaceC10321P != null) {
            interfaceC10321P.forEachRemaining(consumer);
            return;
        }
        ArrayDeque m678g = m678g();
        while (true) {
            InterfaceC10509F0 m679e = AbstractC10643j1.m679e(m678g);
            if (m679e == null) {
                this.f21186a = null;
                return;
            }
            m679e.mo621a(consumer);
        }
    }
}
