package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.widget.Button;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.OQ */
/* loaded from: assets/audience_network.dex */
public class C5366OQ extends Button {
    public static final int A0A = (int) (C5208Lr.A00 * 16.0f);
    public static final int A0B = (int) (C5208Lr.A00 * 4.0f);
    public int A00;
    public int A01;
    public C39871K A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final int A07;
    public final Runnable A08;
    public final Runnable A09;

    public C5366OQ(C5953Xy c5953Xy, C39871K c39871k) {
        super(c5953Xy);
        this.A03 = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = true;
        this.A05 = false;
        this.A08 = new C5649T0(this);
        this.A09 = new C5648Sz(this);
        this.A02 = c39871k;
        this.A07 = C5064JR.A03(c5953Xy);
        this.A06 = C5064JR.A00(c5953Xy);
        C5245MS.A0X(this, false, 16);
        setGravity(17);
        A03();
    }

    private void A03() {
        C39871K c39871k = this.A02;
        if (c39871k != null) {
            this.A00 = c39871k.A08(this.A05);
            this.A01 = this.A02.A09(this.A05);
        }
        C5245MS.A0O(this, this.A00, this.A04 ? A0B : 0);
        setTextColor(this.A01);
    }

    private void A04() {
        if (this.A07 < 0 || this.A03) {
            return;
        }
        this.A03 = true;
        if (C5064JR.A1r(getContext()) && Build.VERSION.SDK_INT >= 16) {
            postDelayed(this.A08, this.A07);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A04();
    }

    public void setRoundedCornersEnabled(boolean z) {
        this.A04 = z;
        A03();
    }

    public void setText(String str) {
        super.setText((CharSequence) str.toUpperCase(Locale.US));
    }

    public void setUpButtonColors(C39871K c39871k) {
        this.A02 = c39871k;
        A03();
    }

    public void setViewShowsOverMedia(boolean z) {
        this.A05 = z;
        A03();
    }
}
