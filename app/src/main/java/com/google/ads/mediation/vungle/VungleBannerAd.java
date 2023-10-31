package com.google.ads.mediation.vungle;

import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.mediation.C9706b;
import com.vungle.warren.C9975t1;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class VungleBannerAd {
    private static final String TAG = "VungleBannerAd";
    private final WeakReference<C9706b> adapter;
    private final String placementId;
    private C9975t1 vungleBanner;

    public VungleBannerAd(@NonNull String str, @NonNull C9706b c9706b) {
        this.placementId = str;
        this.adapter = new WeakReference<>(c9706b);
    }

    public void attach() {
        C9706b.C9707a c9707a;
        C9975t1 c9975t1;
        C9706b c9706b = this.adapter.get();
        if (c9706b != null && (c9707a = c9706b.f19252k) != null && (c9975t1 = this.vungleBanner) != null && c9975t1.getParent() == null) {
            c9707a.addView(this.vungleBanner);
        }
    }

    public void destroyAd() {
        if (this.vungleBanner != null) {
            String str = TAG;
            Log.d(str, "Vungle banner adapter cleanUp: destroyAd # " + this.vungleBanner.hashCode());
            C9975t1 c9975t1 = this.vungleBanner;
            c9975t1.m1364a(true);
            c9975t1.f20038d = true;
            c9975t1.f20042h = null;
            this.vungleBanner = null;
        }
    }

    public void detach() {
        C9975t1 c9975t1 = this.vungleBanner;
        if (c9975t1 == null || c9975t1.getParent() == null) {
            return;
        }
        ((ViewGroup) this.vungleBanner.getParent()).removeView(this.vungleBanner);
    }

    @Nullable
    public C9706b getAdapter() {
        return this.adapter.get();
    }

    @Nullable
    public C9975t1 getVungleBanner() {
        return this.vungleBanner;
    }

    public void setVungleBanner(@NonNull C9975t1 c9975t1) {
        this.vungleBanner = c9975t1;
    }
}
