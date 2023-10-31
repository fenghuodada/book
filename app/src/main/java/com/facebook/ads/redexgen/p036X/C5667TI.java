package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.TI */
/* loaded from: assets/audience_network.dex */
public final class C5667TI extends AbstractC5301NN {
    public static final int A03 = (int) (C5208Lr.A00 * 8.0f);
    public final RelativeLayout A00;
    public final C40422D A01;
    public final C5953Xy A02;

    public C5667TI(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, String str, C39971U c39971u, InterfaceC5270Mr interfaceC5270Mr, InterfaceC5269Mq interfaceC5269Mq) {
        super(c5953Xy, interfaceC5080Jh, str, c39971u, interfaceC5270Mr, interfaceC5269Mq);
        this.A02 = c5953Xy;
        this.A01 = C40432E.A00(c5953Xy.A00());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        C5245MS.A0M(this.A00, -1728053248);
        this.A00.setOnClickListener(new View$OnClickListenerC5306NS(this));
    }

    public static RelativeLayout.LayoutParams A0B(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0C() {
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            C5245MS.A0V(this, transitionSet);
            return;
        }
        C5245MS.A0T(this);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5301NN
    public final void A0L() {
        C40462H reportingReason = this.A01.A0A();
        C5316Nc adChoicesView = new C5316Nc(this.A02);
        adChoicesView.setInfo(EnumC5253Ma.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        adChoicesView.setOnClickListener(new View$OnClickListenerC5307NT(this));
        C40462H A0B = this.A01.A0B();
        C5316Nc c5316Nc = new C5316Nc(this.A02);
        c5316Nc.setInfo(EnumC5253Ma.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c5316Nc.setOnClickListener(new View$OnClickListenerC5308NU(this));
        C5316Nc c5316Nc2 = new C5316Nc(this.A02);
        c5316Nc2.setInfo(EnumC5253Ma.AD_CHOICES_ICON, this.A01.A0M(), "");
        c5316Nc2.setOnClickListener(new View$OnClickListenerC5309NV(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        int i = A03;
        linearLayout.setPadding(i * 2, i, i * 2, i);
        C5245MS.A0M(linearLayout, -1);
        if (!reportingReason.A05().isEmpty()) {
            linearLayout.addView(adChoicesView, layoutParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(c5316Nc, layoutParams);
        }
        linearLayout.addView(c5316Nc2, layoutParams);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5301NN
    public final void A0M() {
        C5245MS.A0I(this);
        this.A00.removeAllViews();
        C5245MS.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5301NN
    public final void A0N(C40462H c40462h, EnumC40442F enumC40442F) {
        String A0E;
        int i;
        if (enumC40442F == EnumC40442F.A04) {
            return;
        }
        boolean z = enumC40442F == EnumC40442F.A05;
        C5299NL c5299nl = new C5299NL(this.A02, this.A0B);
        if (z) {
            A0E = this.A01.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        C5299NL A0E2 = c5299nl.A0I(A0E).A0H(this.A01.A0D()).A0F(c40462h.A04()).A0E(z ? EnumC5253Ma.REPORT_AD : EnumC5253Ma.HIDE_AD);
        if (z) {
            i = -552389;
        } else {
            i = -13272859;
        }
        C5300NM A0M = A0E2.A0D(i).A0G(this.A0A != null ? this.A0A.A01() : "").A0M();
        C5245MS.A0M(A0M, -1);
        C5245MS.A0T(this);
        this.A00.removeAllViews();
        this.A00.addView(A0M, A0B(true));
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5301NN
    public final void A0O(C40462H c40462h, EnumC40442F enumC40442F) {
        String A0H;
        boolean z = enumC40442F == EnumC40442F.A05;
        C5953Xy c5953Xy = this.A02;
        InterfaceC5303NP interfaceC5303NP = this.A0B;
        if (z) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        C5319Nf c5319Nf = new C5319Nf(c5953Xy, c40462h, interfaceC5303NP, A0H, z ? EnumC5253Ma.REPORT_AD : EnumC5253Ma.HIDE_AD);
        c5319Nf.setClickable(true);
        C5245MS.A0M(c5319Nf, -1);
        int i = A03;
        c5319Nf.setPadding(i * 2, i, i * 2, i);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(c5319Nf, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5301NN
    public final boolean A0P() {
        return false;
    }
}
