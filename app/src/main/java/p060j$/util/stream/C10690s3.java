package p060j$.util.stream;

import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10315J;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s3 */
/* loaded from: classes2.dex */
public final class C10690s3 extends AbstractC10695t3 implements InterfaceC10315J {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10690s3(InterfaceC10315J interfaceC10315J, long j, long j2) {
        super(interfaceC10315J, j, j2);
    }

    C10690s3(InterfaceC10315J interfaceC10315J, long j, long j2, long j3, long j4) {
        super(interfaceC10315J, j, j2, j3, j4);
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1007q(this, consumer);
    }

    @Override // p060j$.util.stream.AbstractC10705v3
    /* renamed from: e */
    protected final InterfaceC10321P mo601e(InterfaceC10321P interfaceC10321P, long j, long j2, long j3, long j4) {
        return new C10690s3((InterfaceC10315J) interfaceC10321P, j, j2, j3, j4);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1014h(this, consumer);
    }

    @Override // p060j$.util.stream.AbstractC10695t3
    /* renamed from: g */
    protected final Object mo609g() {
        return new C10685r3(0);
    }
}
