package com.adcolony.sdk;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.adcolony.sdk.d4 */
/* loaded from: classes.dex */
public final class C2083d4 implements InterfaceC2356w5<C2061b4> {

    /* renamed from: a */
    public final /* synthetic */ C2061b4[] f5070a;

    /* renamed from: b */
    public final /* synthetic */ CountDownLatch f5071b;

    public C2083d4(C2061b4[] c2061b4Arr, CountDownLatch countDownLatch) {
        this.f5070a = c2061b4Arr;
        this.f5071b = countDownLatch;
    }

    @Override // com.adcolony.sdk.InterfaceC2356w5
    /* renamed from: a */
    public final void mo9462a(C2061b4 c2061b4) {
        this.f5070a[0] = c2061b4;
        this.f5071b.countDown();
    }
}
