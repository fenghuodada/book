package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.NativeAdLayoutApi;

/* renamed from: com.facebook.ads.redexgen.X.bc */
/* loaded from: assets/audience_network.dex */
public class C6179bc extends C42265E implements NativeAdLayoutApi {
    @Nullable
    public View A02;
    public NativeAdLayout A03;
    public int A01 = 0;
    public int A00 = 0;

    public final void A02() {
        C5245MS.A0T(this.A03);
        this.A03.removeView(this.A02);
        this.A02 = null;
    }

    public final void A03(AbstractC5301NN abstractC5301NN) {
        this.A02 = abstractC5301NN;
        abstractC5301NN.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C5245MS.A0T(this.A03);
        this.A03.addView(this.A02);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void initialize(NativeAdLayout nativeAdLayout) {
        this.A03 = nativeAdLayout;
    }

    @Override // com.facebook.ads.redexgen.p036X.C42265E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00 > 0) {
            int measuredWidth = this.A03.getMeasuredWidth();
            int i3 = this.A00;
            if (measuredWidth > i3) {
                setMeasuredDimension(i3, this.A03.getMeasuredHeight());
                return;
            }
        }
        int measuredWidth2 = this.A03.getMeasuredWidth();
        int i4 = this.A01;
        if (measuredWidth2 >= i4) {
            return;
        }
        setMeasuredDimension(i4, this.A03.getMeasuredHeight());
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void setMaxWidth(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void setMinWidth(int i) {
        this.A01 = i;
    }
}
