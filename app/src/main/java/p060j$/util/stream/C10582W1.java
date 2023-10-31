package p060j$.util.stream;

import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.W1 */
/* loaded from: classes2.dex */
public final class C10582W1 extends AbstractC10594Z1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10582W1(InterfaceC10321P interfaceC10321P, int i, boolean z) {
        super(interfaceC10321P, i, z);
    }

    @Override // p060j$.util.stream.AbstractC10594Z1, p060j$.util.stream.InterfaceC10575U2
    /* renamed from: J */
    public final void mo752J(Consumer consumer) {
        if (isParallel()) {
            super.mo752J(consumer);
        } else {
            m719O1().forEachRemaining(consumer);
        }
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: L1 */
    final boolean mo680L1() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: M1 */
    public final InterfaceC10634h2 mo525M1(int i, InterfaceC10634h2 interfaceC10634h2) {
        throw new UnsupportedOperationException();
    }

    @Override // p060j$.util.stream.AbstractC10594Z1, p060j$.util.stream.InterfaceC10575U2
    /* renamed from: a */
    public final void mo746a(Consumer consumer) {
        if (isParallel()) {
            super.mo746a(consumer);
        } else {
            m719O1().forEachRemaining(consumer);
        }
    }
}
