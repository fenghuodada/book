package com.facebook.ads.redexgen.p036X;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.9D */
/* loaded from: assets/audience_network.dex */
public final class C44599D extends AbstractC5613SQ {
    @Nullable
    public AbstractC5381Of A00;
    public final ImageView A01;
    public final InterfaceC421957 A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;

    public C44599D(C5953Xy c5953Xy, InterfaceC5296NI interfaceC5296NI, InterfaceC5080Jh interfaceC5080Jh, AbstractC397518 abstractC397518, C43657U c43657u, InterfaceC5269Mq interfaceC5269Mq) {
        super(c5953Xy, interfaceC5296NI, interfaceC5080Jh, abstractC397518, c43657u, interfaceC5269Mq);
        this.A02 = new C5612SP(this);
        this.A04 = new AtomicBoolean(false);
        this.A03 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
        this.A01 = new ImageView(getContext());
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setAdjustViewBounds(true);
        new AsyncTaskC5652T3(this.A01, super.A03).A05(super.A01.A0O().A0D().A00(), super.A01.A0O().A0D().A01()).A06(new C5611SO(this)).A07(super.A01.A0O().A0D().A07());
    }

    private AbstractC5381Of A01(int i) {
        if (this.A01.getParent() != null) {
            C5245MS.A0J(this.A01);
        }
        return C5382Og.A00(new C5384Oi(super.A03, super.A04, this.A08, super.A01, this.A01, this.A0A, this.A06).A0E(this.A07.getToolbarHeight()).A0H(this.A07).A0D(i).A0J(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A04.get() && this.A03.get()) {
            A0P();
        }
    }

    private void A06(int i) {
        C5245MS.A0J(this.A00);
        this.A00 = A01(i);
        C39871K colors = this.A00.getColors();
        AbstractC5381Of abstractC5381Of = this.A00;
        boolean z = true;
        C5245MS.A0M(this, colors.A07(abstractC5381Of != null && (abstractC5381Of.A0c() || (this.A00 instanceof AbstractC5645Sw))));
        this.A07.A04(colors, this.A00.A0c());
        addView(this.A00, 0, AbstractC5613SQ.A0D);
        AbstractC5381Of abstractC5381Of2 = this.A00;
        setUpFullscreenMode((abstractC5381Of2 == null || !abstractC5381Of2.A0c()) ? false : false);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5613SQ
    public final void A0Q() {
        C5245MS.A0L(this.A00);
        C5245MS.A0L(this.A07);
        this.A03.set(true);
        A05();
        int A03 = super.A01.A0O().A0D().A03();
        if (A03 > 0) {
            AbstractC5381Of abstractC5381Of = this.A00;
            if (abstractC5381Of != null) {
                abstractC5381Of.A0a();
            }
            A0R(A03, new C5610SN(this));
            return;
        }
        this.A05.set(true);
        this.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5613SQ
    public final void A0S(C422159 c422159) {
        c422159.A0K(this.A02);
        A06(c422159.A0H().getResources().getConfiguration().orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        C5245MS.A0H(this.A00);
        C5245MS.A0H(this.A07);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5613SQ
    public final boolean A0T() {
        AbstractC5381Of abstractC5381Of = this.A00;
        return abstractC5381Of != null && abstractC5381Of.A0d(false);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void ABj(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void AC8(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        AbstractC5381Of abstractC5381Of = this.A00;
        if (abstractC5381Of != null) {
            return abstractC5381Of.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5613SQ, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A01.A0O().A0N()) {
            A06(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5613SQ, com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void onDestroy() {
        if (C5064JR.A1I(super.A03)) {
            super.A03.A09().AFF(this.A01);
        }
        AbstractC5381Of abstractC5381Of = this.A00;
        if (abstractC5381Of != null) {
            abstractC5381Of.A0W();
        }
        super.onDestroy();
    }
}
