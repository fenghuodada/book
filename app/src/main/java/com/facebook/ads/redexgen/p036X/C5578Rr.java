package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Rr */
/* loaded from: assets/audience_network.dex */
public final class C5578Rr extends LinearLayout implements InterfaceC5458Pv {
    public final NativeBannerAd A00;
    public final C5953Xy A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (C5208Lr.A00 * 42.0f);
    public static final int A03 = (int) (C5208Lr.A00 * 48.0f);
    public static final int A05 = (int) (C5208Lr.A00 * 54.0f);
    public static final int A07 = (int) (C5208Lr.A00 * 4.0f);
    public static final int A06 = (int) (C5208Lr.A00 * 8.0f);

    public C5578Rr(C5953Xy c5953Xy, NativeBannerAd nativeBannerAd, C5106K7 c5106k7, EnumC5107K8 enumC5107K8, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c5953Xy);
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c5953Xy;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int A00 = A00(enumC5107K8);
        C5373OX c5373ox = new C5373OX(this.A01);
        c5373ox.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A00, A00);
        layoutParams3.gravity = 16;
        c5373ox.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(c5373ox, layoutParams3);
        C5455Ps c5455Ps = new C5455Ps(c5953Xy, this.A00, enumC5107K8, c5106k7, adOptionsView);
        c5455Ps.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.gravity = 16;
        linearLayout.addView(c5455Ps, layoutParams4);
        if (enumC5107K8 == EnumC5107K8.A0A) {
            int iconSize = A07;
            setPadding(iconSize, iconSize, iconSize, iconSize);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            int iconSize2 = A06;
            setPadding(iconSize2, iconSize2, iconSize2, iconSize2);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView textView = new TextView(getContext());
        int i = A06;
        int iconSize3 = A07;
        textView.setPadding(i, iconSize3, i, iconSize3);
        c5106k7.A05(textView);
        textView.setText(this.A00.getAdCallToAction());
        addView(textView, layoutParams2);
        this.A02.add(mediaView);
        this.A02.add(textView);
    }

    public static int A00(EnumC5107K8 enumC5107K8) {
        int i = C5456Pt.A00[enumC5107K8.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return A05;
            }
            return A03;
        }
        return A04;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5458Pv
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5458Pv
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5458Pv
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
