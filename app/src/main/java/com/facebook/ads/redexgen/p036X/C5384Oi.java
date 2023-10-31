package com.facebook.ads.redexgen.p036X;

import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Oi */
/* loaded from: assets/audience_network.dex */
public class C5384Oi {
    @Nullable
    public View A02;
    @Nullable
    public C5721UB A03;
    @Nullable
    public AbstractC5268Mp A04;
    @Nullable
    public C5036Ix A05;
    @Nullable
    public final View A06;
    public final AbstractC397518 A07;
    public final C5953Xy A08;
    public final InterfaceC5080Jh A09;
    public final C5237MK A0A;
    public final InterfaceC5269Mq A0B;
    public final C5521Qw A0C;
    public int A01 = 0;
    public int A00 = 1;

    public C5384Oi(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, InterfaceC5269Mq interfaceC5269Mq, AbstractC397518 abstractC397518, @Nullable View view, C5521Qw c5521Qw, C5237MK c5237mk) {
        this.A08 = c5953Xy;
        this.A09 = interfaceC5080Jh;
        this.A0B = interfaceC5269Mq;
        this.A07 = abstractC397518;
        this.A06 = view;
        this.A0C = c5521Qw;
        this.A0A = c5237mk;
    }

    public final C5384Oi A0D(int i) {
        this.A00 = i;
        return this;
    }

    public final C5384Oi A0E(int i) {
        this.A01 = i;
        return this;
    }

    public final C5384Oi A0F(View view) {
        this.A02 = view;
        return this;
    }

    public final C5384Oi A0G(C5721UB c5721ub) {
        this.A03 = c5721ub;
        return this;
    }

    public final C5384Oi A0H(AbstractC5268Mp abstractC5268Mp) {
        this.A04 = abstractC5268Mp;
        return this;
    }

    public final C5384Oi A0I(C5036Ix c5036Ix) {
        this.A05 = c5036Ix;
        return this;
    }

    public final C5385Oj A0J() {
        return new C5385Oj(this);
    }
}
