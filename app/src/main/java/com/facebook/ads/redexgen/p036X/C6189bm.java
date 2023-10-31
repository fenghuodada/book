package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bm */
/* loaded from: assets/audience_network.dex */
public final class C6189bm extends AbstractC39550o {
    public static byte[] A03;
    @Nullable
    public View A00;
    public final C421654 A01;
    public final C4780El A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-23, 7, 20, 20, 21, 26, -58, 22, 24, 11, 25, 11, 20, 26, -58, 20, 27, 18, 18, -58, 7, 10, -4, 15, 11, 29};
    }

    public C6189bm(C421654 c421654) {
        this.A02 = c421654.A09();
        this.A01 = c421654;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0C() {
        this.A02.A0D().A3d();
        C5157Kz.A00(new C6191bo(this));
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0D() {
        this.A02.A0D().A3g();
        C5157Kz.A00(new C6190bn(this));
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0E(View view) {
        if (view != null) {
            this.A02.A0D().A3f();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if (this.A00 instanceof C5654T5) {
                C5121KO.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            C4821FQ A08 = this.A01.A08();
            if (A08 != null) {
                A08.A0F();
            }
            C5157Kz.A00(new C6192bp(this));
            C421654 c421654 = this.A01;
            c421654.A0B(c421654.A07(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && C5064JR.A0w(this.A01.A07().getContext())) {
                final C5354OE c5354oe = new C5354OE();
                this.A01.A0D(c5354oe);
                c5354oe.A0C(this.A01.getPlacementId());
                c5354oe.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0D() != null) {
                    c5354oe.A09(this.A01.A08().A0D().A0C());
                }
                View view2 = this.A00;
                if (view2 instanceof C5654T5) {
                    c5354oe.A0A(((C5654T5) view2).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5D
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        View view4;
                        View view5;
                        View view6;
                        view4 = C6189bm.this.A00;
                        if (view4 != null) {
                            C5354OE c5354oe2 = c5354oe;
                            view5 = C6189bm.this.A00;
                            int width = view5.getWidth();
                            view6 = C6189bm.this.A00;
                            c5354oe2.setBounds(0, 0, width, view6.getHeight());
                            C5354OE c5354oe3 = c5354oe;
                            c5354oe3.A0D(!c5354oe3.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(c5354oe);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 113));
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0F(InterfaceC39540n interfaceC39540n) {
        this.A02.A0D().A3e(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0G();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0G(C5115KH c5115kh) {
        this.A02.A0D().A2a(C5236MJ.A01(this.A01.A04()), c5115kh.A03().getErrorCode(), c5115kh.A04());
        C5157Kz.A00(new C6193bq(this, c5115kh));
    }
}
