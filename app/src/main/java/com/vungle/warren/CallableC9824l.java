package com.vungle.warren;

import android.content.Context;
import android.util.Log;
import com.vungle.warren.AdConfig;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.admarkup.AbstractC9853a;
import com.vungle.warren.persistence.C9928h;
import java.util.concurrent.Callable;

/* renamed from: com.vungle.warren.l */
/* loaded from: classes3.dex */
public final class CallableC9824l implements Callable<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ Context f19614a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC9853a f19615b;

    /* renamed from: c */
    public final /* synthetic */ String f19616c;

    /* renamed from: d */
    public final /* synthetic */ AdConfig.AdSize f19617d;

    public CallableC9824l(Context context, AbstractC9853a abstractC9853a, String str, AdConfig.AdSize adSize) {
        this.f19614a = context;
        this.f19615b = abstractC9853a;
        this.f19616c = str;
        this.f19617d = adSize;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        String str;
        Advertisement advertisement;
        boolean z;
        if (!Vungle.isInitialized()) {
            int i = C9888n.f19867a;
            Log.e("n", "Vungle is not initialized");
        } else {
            C9928h c9928h = (C9928h) C10114v0.m1234a(this.f19614a).m1232c(C9928h.class);
            AbstractC9853a abstractC9853a = this.f19615b;
            if (abstractC9853a != null) {
                str = abstractC9853a.mo1452a();
            } else {
                str = null;
            }
            String str2 = this.f19616c;
            Placement placement = (Placement) c9928h.m1383p(Placement.class, str2).get();
            if (placement != null && ((!placement.m1458c() || str != null) && (advertisement = c9928h.m1387l(str2, str).get()) != null)) {
                AdConfig.AdSize m1460a = placement.m1460a();
                AdConfig.AdSize m1425a = advertisement.f19757v.m1425a();
                AdConfig.AdSize adSize = AdConfig.AdSize.VUNGLE_MREC;
                boolean z2 = true;
                AdConfig.AdSize adSize2 = this.f19617d;
                if (adSize2 == adSize && AdConfig.AdSize.isDefaultAdSize(m1460a) && AdConfig.AdSize.isDefaultAdSize(m1425a) && placement.f19777i == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (!placement.m1458c() || !AdConfig.AdSize.isNonMrecBannerAdSize(m1460a) || !AdConfig.AdSize.isNonMrecBannerAdSize(m1425a) || !AdConfig.AdSize.isNonMrecBannerAdSize(adSize2)) {
                    z2 = z;
                }
                if (z2 || (adSize2 == m1460a && adSize2 == m1425a)) {
                    return Boolean.valueOf(Vungle.canPlayAd(advertisement));
                }
            }
        }
        return Boolean.FALSE;
    }
}
