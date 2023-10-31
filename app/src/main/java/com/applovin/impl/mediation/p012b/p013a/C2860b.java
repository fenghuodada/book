package com.applovin.impl.mediation.p012b.p013a;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.applovin.impl.mediation.b.a.b */
/* loaded from: classes.dex */
public class C2860b extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a */
    private final int f6915a;

    /* renamed from: b */
    private final MaxNativeAdLoader f6916b;

    /* renamed from: c */
    private final Queue<MaxAd> f6917c = new LinkedList();

    /* renamed from: d */
    private boolean f6918d = false;

    /* renamed from: e */
    private final Object f6919e = new Object();

    /* renamed from: f */
    private InterfaceC2861a f6920f;

    /* renamed from: com.applovin.impl.mediation.b.a.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2861a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public C2860b(String str, int i, Context context, InterfaceC2861a interfaceC2861a) {
        this.f6915a = i;
        this.f6920f = interfaceC2861a;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(str, context);
        this.f6916b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
    }

    /* renamed from: a */
    public void m8580a() {
        this.f6920f = null;
        m8574e();
        this.f6916b.destroy();
    }

    /* renamed from: a */
    public void m8579a(MaxAd maxAd) {
        this.f6916b.destroy(maxAd);
    }

    /* renamed from: a */
    public boolean m8578a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f6916b.render(maxNativeAdView, maxAd);
    }

    /* renamed from: b */
    public boolean m8577b() {
        boolean z;
        synchronized (this.f6919e) {
            z = !this.f6917c.isEmpty();
        }
        return z;
    }

    /* renamed from: c */
    public void m8576c() {
        synchronized (this.f6919e) {
            if (!this.f6918d && this.f6917c.size() < this.f6915a) {
                this.f6918d = true;
                this.f6916b.loadAd();
            }
        }
    }

    @Nullable
    /* renamed from: d */
    public MaxAd m8575d() {
        MaxAd remove;
        synchronized (this.f6919e) {
            remove = this.f6917c.remove();
            m8576c();
        }
        return remove;
    }

    /* renamed from: e */
    public void m8574e() {
        synchronized (this.f6919e) {
            for (MaxAd maxAd : this.f6917c) {
                m8579a(maxAd);
            }
            this.f6917c.clear();
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        InterfaceC2861a interfaceC2861a = this.f6920f;
        if (interfaceC2861a != null) {
            interfaceC2861a.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        InterfaceC2861a interfaceC2861a = this.f6920f;
        if (interfaceC2861a != null) {
            interfaceC2861a.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        InterfaceC2861a interfaceC2861a = this.f6920f;
        if (interfaceC2861a != null) {
            interfaceC2861a.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f6919e) {
            this.f6917c.add(maxAd);
            this.f6918d = false;
            m8576c();
        }
        InterfaceC2861a interfaceC2861a = this.f6920f;
        if (interfaceC2861a != null) {
            interfaceC2861a.onNativeAdLoaded();
        }
    }
}
