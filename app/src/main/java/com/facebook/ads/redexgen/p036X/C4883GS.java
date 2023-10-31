package com.facebook.ads.redexgen.p036X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.GS */
/* loaded from: assets/audience_network.dex */
public class C4883GS implements InterfaceC5528R3 {
    public final /* synthetic */ C41343j A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public C4883GS(C41343j c41343j, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c41343j;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5528R3
    public final void AAM(InterfaceC5526R1 interfaceC5526R1) {
        C41343j.A06(interfaceC5526R1.A5p(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5528R3
    public final void AAj(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
