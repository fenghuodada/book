package com.facebook.ads.redexgen.p036X;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Pc */
/* loaded from: assets/audience_network.dex */
public final class C5439Pc extends FrameLayout {
    public static final int A08 = (int) (C5208Lr.A00 * 16.0f);
    public C4551Aj A00;
    @Nullable
    public C5460Px A01;
    @Nullable
    public C439889 A02;
    public C5125KS A03;
    public C43797m A04;
    public C43246p A05;
    public final C5953Xy A06;
    public final C5088Jp A07;

    public C5439Pc(C5953Xy c5953Xy, C5088Jp c5088Jp) {
        super(c5953Xy);
        this.A07 = c5088Jp;
        this.A06 = c5953Xy;
        setUpView(c5953Xy);
    }

    public final void A01() {
        this.A00.A0e(true, 10);
    }

    public final void A02() {
        C5460Px c5460Px = this.A01;
        if (c5460Px != null) {
            c5460Px.A0A();
            this.A01 = null;
        }
        C439889 c439889 = this.A02;
        if (c439889 != null) {
            c439889.A0g();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC44839c abstractC44839c) {
        this.A00.getEventBus().A05(abstractC44839c);
    }

    public final void A04(InterfaceC5080Jh interfaceC5080Jh, String str, Map<String, String> extraParams) {
        A02();
        this.A02 = new C439889(this.A06, interfaceC5080Jh, this.A00, str, extraParams);
        if (C5064JR.A1J(this.A06)) {
            this.A01 = new C5460Px(this.A06, interfaceC5080Jh, this.A00, str, extraParams);
        } else {
            this.A01 = null;
        }
    }

    public final void A05(EnumC5469Q6 enumC5469Q6) {
        this.A00.A0b(enumC5469Q6, 13);
    }

    public final boolean A06() {
        return this.A00.A0k();
    }

    public C5483QK getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return this.A00.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C5953Xy c5953Xy) {
        this.A00.A0X();
        this.A04 = new C43797m(c5953Xy);
        this.A00.A0c(this.A04);
        this.A03 = new C5125KS(c5953Xy, this.A07);
        this.A00.A0c(new C43857u(c5953Xy));
        this.A00.A0c(this.A03);
        this.A05 = new C43246p(c5953Xy, true, this.A07);
        this.A00.A0c(this.A05);
        this.A00.A0c(new C5126KT(this.A05, EnumC5482QJ.A03, true, true));
        if (!this.A00.A0g() && !C5064JR.A21(c5953Xy)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i = A08;
        layoutParams.setMargins(i, i, i, i);
        this.A03.setLayoutParams(layoutParams);
        this.A00.addView(this.A03);
    }

    private void setUpVideo(C5953Xy c5953Xy) {
        this.A00 = new C4551Aj(c5953Xy);
        this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        C5245MS.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new View$OnClickListenerC5438Pb(this));
    }

    private void setUpView(C5953Xy c5953Xy) {
        setUpVideo(c5953Xy);
        setUpPlugins(c5953Xy);
    }

    public void setVideoURI(String str) {
        this.A00.setVideoURI(str);
    }

    public void setVolume(float f) {
        this.A00.setVolume(f);
        this.A03.A09();
    }
}
