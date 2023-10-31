package com.facebook.ads.redexgen.p036X;

import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.NN */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC5301NN extends FrameLayout {
    public int A00;
    public EnumC40442F A01;
    public C40452G A02;
    @Nullable
    public C40462H A03;
    public final C40422D A04;
    public final C5953Xy A05;
    public final InterfaceC5080Jh A06;
    @Nullable
    public final InterfaceC5269Mq A07;
    @Nullable
    public final InterfaceC5270Mr A08;
    public final String A09;
    @Nullable
    public final C39971U A0A;
    public final InterfaceC5303NP A0B;

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N(C40462H c40462h, EnumC40442F enumC40442F);

    public abstract void A0O(C40462H c40462h, EnumC40442F enumC40442F);

    public abstract boolean A0P();

    public AbstractC5301NN(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, String str) {
        this(c5953Xy, interfaceC5080Jh, str, null, null, null);
    }

    public AbstractC5301NN(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, String str, @Nullable C39971U c39971u, @Nullable InterfaceC5270Mr interfaceC5270Mr, @Nullable InterfaceC5269Mq interfaceC5269Mq) {
        super(c5953Xy);
        this.A00 = 0;
        this.A01 = EnumC40442F.A04;
        this.A03 = null;
        this.A0B = new C5668TJ(this);
        this.A05 = c5953Xy;
        this.A06 = interfaceC5080Jh;
        this.A08 = interfaceC5270Mr;
        this.A07 = interfaceC5269Mq;
        this.A09 = str;
        this.A0A = c39971u;
        this.A04 = C40432E.A00(this.A05.A00());
    }

    public static /* synthetic */ int A00(AbstractC5301NN abstractC5301NN) {
        int i = abstractC5301NN.A00;
        abstractC5301NN.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A01(AbstractC5301NN abstractC5301NN) {
        int i = abstractC5301NN.A00;
        abstractC5301NN.A00 = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A02.A0A()) {
            this.A06.A8q(this.A09, this.A02.A02());
            this.A02.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A03 = null;
        this.A02.A05();
        A0L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C40462H c40462h) {
        this.A02.A08(this.A01);
        A0N(c40462h, this.A01);
        C39610u.A01(this.A05).A0L();
        if (A0P()) {
            A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C40462H c40462h) {
        this.A03 = c40462h;
        this.A02.A09(this.A01, this.A00);
        A0O(c40462h, this.A01);
    }

    public final void A0J() {
        A0B();
    }

    public final void A0K() {
        this.A02 = new C40452G(new C5088Jp(this.A09, this.A06));
        InterfaceC5270Mr interfaceC5270Mr = this.A08;
        if (interfaceC5270Mr != null) {
            interfaceC5270Mr.ABj(true);
        }
        A0C();
    }
}
