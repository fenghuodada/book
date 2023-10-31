package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.RewardData;

/* renamed from: com.facebook.ads.redexgen.X.OU */
/* loaded from: assets/audience_network.dex */
public final class C5370OU extends FrameLayout {
    public static String[] A07 = {"Lu0oG19N", "JNY", "Ev6F9eDhg42RHlCeRuJfEtiFO07AluFn", "qSbaO4FE34QcNqD1YWxCxyT8wr5s9kWw", "hZddA1hSD7Y", "v9TnLSaOxYneacolptRVdRHaZQ0ab06L", "iyW9tyIIQvF7WQz3LOxNHXxa074IcWbN", "vzh"};
    @Nullable
    public AbstractC5268Mp A00;
    public final AbstractC397518 A01;
    public final C5953Xy A02;
    public final InterfaceC5269Mq A03;
    public final InterfaceC5369OT A04;
    @Nullable
    public final C5483QK A05;
    public final View[] A06;

    public C5370OU(C5385Oj c5385Oj, AbstractC397518 abstractC397518, @Nullable C5483QK c5483qk, C5036Ix c5036Ix, AbstractC5359OJ abstractC5359OJ, InterfaceC5269Mq interfaceC5269Mq, InterfaceC5369OT interfaceC5369OT) {
        this(c5385Oj, abstractC397518, c5483qk, interfaceC5269Mq, interfaceC5369OT, c5036Ix, abstractC5359OJ);
    }

    public C5370OU(C5385Oj c5385Oj, AbstractC397518 abstractC397518, @Nullable C5483QK c5483qk, InterfaceC5269Mq interfaceC5269Mq, InterfaceC5369OT interfaceC5369OT, View... viewArr) {
        this(c5385Oj.A05(), c5385Oj.A08(), abstractC397518, c5483qk, interfaceC5269Mq, interfaceC5369OT, viewArr);
    }

    public C5370OU(C5953Xy c5953Xy, @Nullable AbstractC5268Mp abstractC5268Mp, AbstractC397518 abstractC397518, @Nullable C5483QK c5483qk, InterfaceC5269Mq interfaceC5269Mq, InterfaceC5369OT interfaceC5369OT, View... viewArr) {
        super(c5953Xy);
        this.A02 = c5953Xy;
        this.A00 = abstractC5268Mp;
        this.A01 = abstractC397518;
        this.A06 = viewArr;
        this.A03 = interfaceC5269Mq;
        this.A05 = c5483qk;
        this.A04 = interfaceC5369OT;
        A03();
    }

    private void A03() {
        String title;
        RewardData A0M = this.A01.A0M();
        if (A0M == null) {
            title = this.A01.A0Q().A05();
        } else {
            title = this.A01.A0Q().A06(A0M.getCurrency(), A0M.getQuantity());
        }
        C5278Mz c5278Mz = new C5278Mz(this.A02, -1, -16777216, title, null, this.A01.A0Q().A04(), this.A01.A0Q().A03(), C5254Mb.A01(EnumC5253Ma.REWARD_ICON));
        c5278Mz.A02.setOnClickListener(new View$OnClickListenerC5367OR(this));
        c5278Mz.A01.setOnClickListener(new View$OnClickListenerC5368OS(this));
        addView(c5278Mz, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        C5483QK c5483qk = this.A05;
        if (c5483qk != null) {
            c5483qk.A0a(EnumC5464Q1.A07);
        }
        this.A04.A9x();
        if (!this.A01.A0O().A0O()) {
            this.A01.A0h(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        View[] viewArr;
        C5483QK c5483qk = this.A05;
        if (c5483qk != null && !c5483qk.A0j()) {
            this.A05.A0f(false, false, 11);
            C5245MS.A0N(this.A05, 4);
        }
        AbstractC5268Mp abstractC5268Mp = this.A00;
        String[] strArr = A07;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A07[0] = "vGH3jzSu";
        if (abstractC5268Mp != null) {
            C5245MS.A0H(abstractC5268Mp);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            C5245MS.A0N(view, 4);
        }
        viewGroup.addView(this, new RelativeLayout.LayoutParams(-1, -1));
        this.A04.ABQ();
    }
}
