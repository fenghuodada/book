package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Rq */
/* loaded from: assets/audience_network.dex */
public final class C5577Rq extends FrameLayout implements InterfaceC5458Pv {
    @Nullable
    public TextView A00;
    @Nullable
    public TextView A01;
    @Nullable
    public TextView A02;
    @Nullable
    public TextView A03;
    public final MediaView A04;
    public final NativeAd A05;
    public final C5459Pw A06;
    public final ArrayList<View> A07;
    public static String[] A08 = {"LrUXeZd5oXG5wJ7", "S6ePTdxfK6c7yhvbHMQjZqIgQsLDz3QO", "YqVXoEdDoNpK3nL0El5", "Exhg7LXIw6HgSAmcccR052cOKtX3WF", "LN", "59F20xOEewuTmZzPatOKMeF6XI6ZvB1j", "IRBrDKvf2o0dBHWjf99N02m12yrR0Bg7", "KZ90h8EmVWfLUNKv0pT"};
    public static final int A0E = (int) (C5208Lr.A00 * 6.0f);
    public static final int A0D = (int) (C5208Lr.A00 * 8.0f);
    public static final int A0C = (int) (C5208Lr.A00 * 12.0f);
    public static final int A0A = (int) (C5208Lr.A00 * 350.0f);
    public static final int A09 = (int) (C5208Lr.A00 * 250.0f);
    public static final int A0B = (int) (C5208Lr.A00 * 175.0f);

    public C5577Rq(C5953Xy c5953Xy, NativeAd nativeAd, C5106K7 c5106k7, EnumC5107K8 enumC5107K8, C5372OW c5372ow, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c5953Xy);
        this.A07 = new ArrayList<>();
        this.A05 = nativeAd;
        this.A04 = mediaView;
        this.A06 = new C5459Pw(c5953Xy, this.A05, c5106k7, c5372ow, adOptionsView);
        C5459Pw c5459Pw = this.A06;
        int i = A0C;
        c5459Pw.setPadding(i, i, i, A0E);
        addView(this.A06, new FrameLayout.LayoutParams(-1, -2));
        if (enumC5107K8 == EnumC5107K8.A09 || enumC5107K8 == EnumC5107K8.A0B) {
            A07(c5106k7);
        }
        addView(this.A04, new FrameLayout.LayoutParams(-1, -2));
        if (enumC5107K8 != EnumC5107K8.A0B || this.A05.getAdCreativeType() != NativeAd.AdCreativeType.CAROUSEL) {
            A06(c5106k7);
            A04(c5106k7);
            A05(c5106k7);
        }
        this.A07.add(c5372ow);
        this.A07.add(mediaView);
    }

    private int A00() {
        int i;
        int i2;
        int i3;
        TextView textView = this.A03;
        int titleHeight = 0;
        if (textView != null && textView.getVisibility() == 0) {
            i = this.A03.getMeasuredHeight();
        } else {
            i = 0;
        }
        TextView textView2 = this.A02;
        if (A08[1].charAt(0) != 'k') {
            String[] strArr = A08;
            strArr[6] = "SrhbzBCrZmwJCsE1GN19GBhRpshhKBl4";
            strArr[5] = "lZXGEU0s5y97LRskCQS4IC0Q6rEMlB8o";
            if (textView2 != null && textView2.getVisibility() == 0) {
                i2 = this.A02.getMeasuredHeight();
            } else {
                i2 = 0;
            }
            TextView textView3 = this.A00;
            if (textView3 != null && textView3.getVisibility() == 0) {
                i3 = this.A00.getMeasuredHeight();
            } else {
                i3 = 0;
            }
            TextView textView4 = this.A01;
            if (A08[1].charAt(0) != 'k') {
                String[] strArr2 = A08;
                strArr2[6] = "nRuc5lutSXPKh9f7kKzdW2kIhLu3nB9m";
                strArr2[5] = "FuxAmHJZMOFMUG38wB3yXnFuBZuRMBRE";
                if (textView4 != null) {
                    int subtitleHeight = textView4.getVisibility();
                    if (subtitleHeight == 0) {
                        int titleHeight2 = this.A01.getMeasuredHeight();
                        int subtitleHeight2 = A0C;
                        int titleHeight3 = titleHeight2 + subtitleHeight2;
                        int subtitleHeight3 = A0D;
                        titleHeight = titleHeight3 + subtitleHeight3;
                    }
                }
                int measuredHeight = getMeasuredHeight();
                int ctaHeight = this.A06.getMeasuredHeight();
                return ((((measuredHeight - ctaHeight) - i) - i2) - i3) - titleHeight;
            }
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    private void A01() {
        TextView textView = this.A03;
        if (textView != null) {
            textView.setLines(1);
        }
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.setLines(1);
        }
        TextView textView3 = this.A00;
        if (textView3 != null) {
            textView3.setLines(1);
        }
    }

    private void A02(int i) {
        C5245MS.A0N(this.A04, i > A0B ? 0 : 8);
        C5245MS.A0N(this.A03, i > A0A ? 0 : 8);
        C5245MS.A0N(this.A00, i <= A09 ? 8 : 0);
    }

    public static void A03(int i, int i2, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null && textView.getVisibility() == 0) {
                int A04 = C5245MS.A04(textView, i2);
                textView.setLines(A04 + 1);
                textView.measure(i, View.MeasureSpec.makeMeasureSpec(textView.getMeasuredHeight() + (textView.getLineHeight() * A04), 1073741824));
                i2 -= textView.getLineHeight() * A04;
            }
        }
    }

    private void A04(C5106K7 c5106k7) {
        if (this.A05.getAdBodyText() != null && !this.A05.getAdBodyText().trim().isEmpty()) {
            this.A00 = new TextView(getContext());
            c5106k7.A06(this.A00);
            this.A00.setText(this.A05.getAdBodyText());
            TextView textView = this.A00;
            int i = A0C;
            textView.setPadding(i, 0, i, 0);
            addView(this.A00, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A05(C5106K7 c5106k7) {
        if (this.A05.hasCallToAction()) {
            this.A01 = new TextView(getContext());
            C5245MS.A0K(this.A01);
            c5106k7.A05(this.A01);
            this.A01.setText(this.A05.getAdCallToAction());
            TextView textView = this.A01;
            int i = A0D;
            textView.setPadding(i, i, i, i);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            int i2 = A0D;
            layoutParams.setMargins(i2, 0, i2, 0);
            addView(this.A01, layoutParams);
            this.A07.add(this.A01);
        }
    }

    private void A06(C5106K7 c5106k7) {
        if (this.A05.getAdHeadline() != null && !this.A05.getAdHeadline().trim().isEmpty()) {
            this.A02 = new TextView(getContext());
            c5106k7.A07(this.A02);
            this.A02.setText(this.A05.getAdHeadline());
            TextView textView = this.A02;
            int i = A0C;
            textView.setPadding(i, A0D, i, 0);
            addView(this.A02, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A07(C5106K7 c5106k7) {
        if (this.A05.getAdLinkDescription() != null && !this.A05.getAdLinkDescription().trim().isEmpty()) {
            this.A03 = new TextView(getContext());
            c5106k7.A06(this.A03);
            this.A03.setText(this.A05.getAdLinkDescription());
            TextView textView = this.A03;
            int i = A0C;
            textView.setPadding(i, 0, i, A0D);
            addView(this.A03, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5458Pv
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5458Pv
    public ArrayList<View> getViewsForInteraction() {
        return this.A07;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C5459Pw c5459Pw = this.A06;
        c5459Pw.layout(i, i2, i3, c5459Pw.getMeasuredHeight() + i2);
        int measuredHeight = i2 + this.A06.getMeasuredHeight();
        TextView textView = this.A03;
        if (textView != null && textView.getVisibility() == 0) {
            int measuredHeight2 = this.A03.getMeasuredHeight();
            this.A03.layout(i, measuredHeight, i3, measuredHeight + measuredHeight2);
            measuredHeight += measuredHeight2;
        }
        MediaView mediaView = this.A04;
        mediaView.layout(i, measuredHeight, i3, mediaView.getMeasuredHeight() + measuredHeight);
        int measuredHeight3 = measuredHeight + this.A04.getMeasuredHeight();
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.layout(i, measuredHeight3, i3, textView2.getMeasuredHeight() + measuredHeight3);
            measuredHeight3 += this.A02.getMeasuredHeight();
        }
        TextView textView3 = this.A00;
        if (textView3 != null && textView3.getVisibility() == 0) {
            TextView textView4 = this.A00;
            if (A08[1].charAt(0) == 'k') {
                throw new RuntimeException();
            }
            A08[3] = "gjv6mmFqHT0";
            textView4.layout(i, measuredHeight3, i3, textView4.getMeasuredHeight() + measuredHeight3);
        }
        TextView textView5 = this.A01;
        if (textView5 != null) {
            int measuredHeight4 = i4 - textView5.getMeasuredHeight();
            int i5 = A0C;
            textView5.layout(A0C + i, measuredHeight4 - i5, i3 - i5, i4 - i5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        A02(View.MeasureSpec.getSize(i2));
        A01();
        super.onMeasure(i, i2);
        int A00 = A00();
        if (this.A04.getMediaWidth() == 0 || this.A04.getMediaHeight() == 0) {
            i3 = A00;
        } else if (((C6180bd) this.A04.getMediaViewApi()).A0N()) {
            i3 = A00;
        } else {
            i3 = Math.min((int) (this.A04.getMeasuredWidth() * (this.A04.getMediaHeight() / this.A04.getMediaWidth())), A00);
        }
        this.A04.measure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        if (i3 < A00) {
            A03(i, A00 - i3, this.A02, this.A00, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5458Pv
    public final void unregisterView() {
        this.A05.unregisterView();
    }
}
