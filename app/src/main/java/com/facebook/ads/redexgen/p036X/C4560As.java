package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.As */
/* loaded from: assets/audience_network.dex */
public final class C4560As {
    public int A00;
    public int A01;
    public Handler A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC4558Aq A0A;
    public final InterfaceC4559Ar A0B;
    public final AbstractC4569B1 A0C;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public C4560As(InterfaceC4558Aq interfaceC4558Aq, InterfaceC4559Ar interfaceC4559Ar, AbstractC4569B1 abstractC4569B1, int i, Handler handler) {
        this.A0A = interfaceC4558Aq;
        this.A0B = interfaceC4559Ar;
        this.A0C = abstractC4569B1;
        this.A03 = handler;
        this.A01 = i;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Handler A03() {
        return this.A03;
    }

    public final InterfaceC4559Ar A04() {
        return this.A0B;
    }

    public final C4560As A05() {
        C4997IK.A04(!this.A09);
        if (this.A02 == -9223372036854775807L) {
            C4997IK.A03(this.A05);
        }
        this.A09 = true;
        this.A0A.AET(this);
        return this;
    }

    public final C4560As A06(int i) {
        C4997IK.A04(!this.A09);
        this.A00 = i;
        return this;
    }

    public final C4560As A07(@Nullable Object obj) {
        C4997IK.A04(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final AbstractC4569B1 A08() {
        return this.A0C;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z) {
        this.A07 |= z;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        C4997IK.A04(this.A09);
        C4997IK.A04(this.A03.getLooper().getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
