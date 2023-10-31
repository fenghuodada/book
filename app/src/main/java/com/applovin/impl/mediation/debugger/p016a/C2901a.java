package com.applovin.impl.mediation.debugger.p016a;

import androidx.annotation.Nullable;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.a.a */
/* loaded from: classes.dex */
public class C2901a implements DTBAdCallback {

    /* renamed from: a */
    private final MaxAdFormat f7042a;

    /* renamed from: b */
    private final InterfaceC2902a f7043b;
    @Nullable

    /* renamed from: c */
    private DTBAdRequest f7044c;

    /* renamed from: com.applovin.impl.mediation.debugger.a.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2902a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public C2901a(C2903b c2903b, MaxAdFormat maxAdFormat, InterfaceC2902a interfaceC2902a) {
        this(Arrays.asList(c2903b), maxAdFormat, interfaceC2902a);
    }

    public C2901a(List<C2903b> list, MaxAdFormat maxAdFormat, InterfaceC2902a interfaceC2902a) {
        this.f7042a = maxAdFormat;
        this.f7043b = interfaceC2902a;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i = 0; i < list.size(); i++) {
                dTBAdSizeArr[i] = list.get(i).m8433a();
            }
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            this.f7044c = dTBAdRequest;
            dTBAdRequest.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m8434a() {
        this.f7044c.loadAd(this);
    }

    public void onFailure(AdError adError) {
        this.f7043b.onAdLoadFailed(adError, this.f7042a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f7043b.onAdResponseLoaded(dTBAdResponse, this.f7042a);
    }
}
