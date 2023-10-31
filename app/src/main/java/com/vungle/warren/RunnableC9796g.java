package com.vungle.warren;

import android.util.Log;
import com.google.gson.AbstractC8692o;
import com.google.gson.C8690m;
import com.google.gson.C8694q;
import com.google.gson.C8695r;
import com.vungle.warren.AdLoader;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.network.C9901e;
import com.vungle.warren.persistence.C9919c;
import com.vungle.warren.persistence.C9928h;
import okhttp3.Response;

/* renamed from: com.vungle.warren.g */
/* loaded from: classes3.dex */
public final class RunnableC9796g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9901e f19534a;

    /* renamed from: b */
    public final /* synthetic */ AdLoader.C9715d f19535b;

    public RunnableC9796g(AdLoader.C9715d c9715d, C9901e c9901e) {
        this.f19535b = c9715d;
        this.f19534a = c9901e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VungleException vungleException;
        AdLoader.C9718f c9718f;
        C8695r c8695r;
        char c;
        VungleException vungleException2;
        AdLoader.C9715d c9715d = this.f19535b;
        C9928h c9928h = AdLoader.this.f19272f;
        AdLoader.C9718f c9718f2 = c9715d.f19288a;
        Placement placement = (Placement) c9928h.m1383p(Placement.class, c9718f2.f19294a.f19307b).get();
        AdLoader adLoader = AdLoader.this;
        if (placement == null) {
            int i = AdLoader.f19266q;
            Log.e("com.vungle.warren.AdLoader", "Placement metadata not found for requested advertisement.");
            VungleLogger.m1603c("AdLoader#fetchAdMetadata; loadAd sequence", "Placement metadata not found for requested advertisement. request = " + c9718f2.f19294a);
            vungleException = new VungleException(2);
        } else {
            C9901e c9901e = this.f19534a;
            boolean z = true;
            if (!c9901e.m1430a()) {
                adLoader.f19274h.getClass();
                long m1613g = VungleApiClient.m1613g(c9901e);
                if (m1613g > 0 && (placement.m1459b() || placement.m1458c())) {
                    AdLoader.this.m1636m(placement, c9718f2.f19295b, m1613g, false);
                    VungleLogger.m1603c("AdLoader#fetchAdMetadata; loadAd sequence", "Response was not successful, retrying; request = " + c9718f2.f19294a);
                    vungleException = new VungleException(14);
                } else {
                    int i2 = AdLoader.f19266q;
                    Log.e("com.vungle.warren.AdLoader", "Failed to retrieve advertisement information");
                    Response response = c9901e.f19882a;
                    VungleLogger.m1603c("AdLoader#fetchAdMetadata; loadAd sequence", String.format("Response was not successful, not retrying;request = %1$s; responseCode = %2$s", c9718f2.f19294a, Integer.valueOf(response.code())));
                    int code = response.code();
                    adLoader.getClass();
                    if (code != 408 && (500 > code || code >= 600)) {
                        z = false;
                    }
                    if (z) {
                        vungleException = new VungleException(22);
                    } else {
                        vungleException = new VungleException(21);
                    }
                }
            } else {
                C8695r c8695r2 = (C8695r) c9901e.f19883b;
                int i3 = AdLoader.f19266q;
                Log.d("com.vungle.warren.AdLoader", "Ads Response: " + c8695r2);
                if (c8695r2 != null && c8695r2.m3219A("ads")) {
                    AbstractC8692o m3213w = c8695r2.m3213w("ads");
                    m3213w.getClass();
                    if (!(m3213w instanceof C8694q)) {
                        C8690m m3212y = c8695r2.m3212y("ads");
                        if (m3212y != null && m3212y.size() != 0) {
                            C8695r m3220n = m3212y.m3222t(0).m3220n();
                            C8695r m3220n2 = m3220n.m3213w("ad_markup").m3220n();
                            AdLoader.C9718f c9718f3 = c9715d.f19288a;
                            long j = c9715d.f19289b;
                            adLoader.getClass();
                            try {
                                Advertisement advertisement = new Advertisement(m3220n);
                                c9718f = c9718f3;
                                c8695r = m3220n2;
                                c = 0;
                                try {
                                    adLoader.m1641h(c9718f3, j, advertisement, placement, c8695r);
                                    return;
                                } catch (IllegalArgumentException unused) {
                                    if (c8695r.m3219A("sleep")) {
                                        long mo3204k = 1000 * c8695r.m3213w("sleep").mo3204k();
                                        placement.f19772d = System.currentTimeMillis() + mo3204k;
                                        try {
                                            Object[] objArr = new Object[2];
                                            objArr[c] = placement;
                                            objArr[1] = c9718f.f19294a;
                                            VungleLogger.m1599g("AdLoader#fetchAdMetadata; loadAd sequence", String.format("badAd - snoozed placement %1$s; request = %2$s", objArr));
                                            adLoader.f19272f.m1376w(placement);
                                            adLoader.m1636m(placement, c9718f.f19295b, mo3204k, false);
                                        } catch (C9919c.C9920a unused2) {
                                            Object[] objArr2 = new Object[2];
                                            objArr2[c] = placement;
                                            objArr2[1] = c9718f.f19294a;
                                            VungleLogger.m1603c("AdLoader#fetchAdMetadata; loadAd sequence", String.format("badAd - can't save snoozed placement %1$s; request = %2$s", objArr2));
                                            vungleException2 = new VungleException(26);
                                            adLoader.m1632q(vungleException2, c9718f.f19294a, null);
                                            return;
                                        }
                                    }
                                    Object[] objArr3 = new Object[2];
                                    objArr3[c] = placement;
                                    objArr3[1] = c9718f.f19294a;
                                    VungleLogger.m1603c("AdLoader#fetchAdMetadata; loadAd sequence", String.format("badAd; can't proceed %1$s; request = %2$s", objArr3));
                                    vungleException2 = new VungleException(1);
                                    adLoader.m1632q(vungleException2, c9718f.f19294a, null);
                                    return;
                                }
                            } catch (IllegalArgumentException unused3) {
                                c9718f = c9718f3;
                                c8695r = m3220n2;
                                c = 0;
                            }
                        } else {
                            VungleLogger.m1603c("AdLoader#fetchAdMetadata; loadAd sequence", "Response was successful, but no ads; request = " + c9718f2.f19294a);
                            vungleException = new VungleException(1);
                        }
                    }
                }
                VungleLogger.m1603c("AdLoader#fetchAdMetadata; loadAd sequence", String.format("Response has no ads; placement = %1$s;op.request = %2$s; response = %3$s", placement, c9718f2.f19294a, c8695r2));
                adLoader.m1632q(new VungleException(1), c9718f2.f19294a, null);
                return;
            }
        }
        adLoader.m1632q(vungleException, c9718f2.f19294a, null);
    }
}
