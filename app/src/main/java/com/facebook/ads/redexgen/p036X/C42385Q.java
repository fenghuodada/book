package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5Q */
/* loaded from: assets/audience_network.dex */
public final class C42385Q implements NativeAdsManagerApi {
    public static final String A0A = NativeAdsManager.class.getSimpleName();
    public NativeAdsManager.Listener A01;
    public C6258cw A02;
    public String A03;
    public final int A06;
    public final C5953Xy A07;
    public final String A08;
    public final List<NativeAd> A09;
    public int A00 = -1;
    public boolean A04 = false;
    public boolean A05 = false;

    @SuppressLint({"CatchGeneralException"})
    public C42385Q(Context context, String str, int i) {
        this.A07 = C42285G.A02(context);
        this.A08 = str;
        this.A06 = Math.max(i, 0);
        this.A09 = new ArrayList(i);
    }

    public final NativeAdsManager.Listener A00() {
        return this.A01;
    }

    public final C6258cw A01() {
        return this.A02;
    }

    public final void A02() {
        this.A09.clear();
    }

    public final void A03(int i) {
        this.A00 = i;
    }

    public final void A04(NativeAd nativeAd) {
        this.A09.add(nativeAd);
    }

    public final void A05(boolean z) {
        this.A04 = z;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void disableAutoRefresh() {
        this.A05 = true;
        C6258cw c6258cw = this.A02;
        if (c6258cw != null) {
            c6258cw.A06();
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final int getUniqueNativeAdCount() {
        return this.A09.size();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final boolean isLoaded() {
        return this.A04;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds() {
        loadAds(NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        EnumC5119KM enumC5119KM = EnumC5119KM.A05;
        int i = this.A06;
        C6258cw c6258cw = this.A02;
        this.A02 = new C6258cw(this.A07, this.A08, enumC5119KM, null, i);
        if (this.A05) {
            this.A02.A06();
        }
        this.A02.A09(this.A03);
        this.A02.A08(new C6173bW(this, this.A07, mediaCacheFlag));
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    @Nullable
    public final NativeAd nextNativeAd() {
        return nextNativeAd(null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    @Nullable
    public final NativeAd nextNativeAd(@Nullable NativeAdListener nativeAdListener) {
        if (this.A09.size() == 0) {
            return null;
        }
        int i = this.A00;
        this.A00 = i + 1;
        List<NativeAd> list = this.A09;
        NativeAd nativeAd = list.get(i % list.size());
        if (nativeAdListener != null) {
            ((C5721UB) nativeAd.getInternalNativeAd()).A1R(nativeAd, nativeAdListener);
        }
        if (i >= this.A09.size()) {
            return new NativeAd(this.A07, nativeAd);
        }
        return nativeAd;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setExtraHints(String str) {
        this.A03 = str;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setListener(NativeAdsManager.Listener listener) {
        this.A01 = listener;
    }
}
