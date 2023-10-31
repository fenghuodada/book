package com.vungle.mediation;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.google.ads.mediation.vungle.VungleBannerAd;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.vungle.warren.AdConfig;
import com.vungle.warren.C9821k;
import com.vungle.warren.C9888n;
import com.vungle.warren.InterfaceC10136z;
import com.vungle.warren.InterfaceC9782e0;
import com.vungle.warren.error.VungleException;

/* renamed from: com.vungle.mediation.b */
/* loaded from: classes3.dex */
public final class C9706b implements InterfaceC9782e0 {

    /* renamed from: p */
    public static final /* synthetic */ int f19241p = 0;
    @NonNull

    /* renamed from: a */
    public final String f19242a;
    @NonNull

    /* renamed from: b */
    public final AdConfig f19243b;

    /* renamed from: c */
    public final String f19244c;

    /* renamed from: d */
    public final MediationBannerAdapter f19245d;

    /* renamed from: e */
    public MediationBannerListener f19246e;

    /* renamed from: f */
    public final MediationBannerAd f19247f;

    /* renamed from: g */
    public MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f19248g;

    /* renamed from: h */
    public MediationBannerAdCallback f19249h;

    /* renamed from: i */
    public String f19250i;

    /* renamed from: j */
    public VungleBannerAd f19251j;

    /* renamed from: k */
    public C9707a f19252k;

    /* renamed from: m */
    public boolean f19254m = false;

    /* renamed from: n */
    public boolean f19255n = true;

    /* renamed from: o */
    public final C9709c f19256o = new C9709c();
    @NonNull

    /* renamed from: l */
    public final C9710c f19253l = C9710c.m1656c();

    /* renamed from: com.vungle.mediation.b$a */
    /* loaded from: classes3.dex */
    public class C9707a extends RelativeLayout {
        public C9707a(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            VungleBannerAd vungleBannerAd = C9706b.this.f19251j;
            if (vungleBannerAd != null) {
                vungleBannerAd.attach();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            VungleBannerAd vungleBannerAd = C9706b.this.f19251j;
            if (vungleBannerAd != null) {
                vungleBannerAd.detach();
            }
        }
    }

    /* renamed from: com.vungle.mediation.b$b */
    /* loaded from: classes3.dex */
    public class C9708b implements VungleInitializer.VungleInitializationListener {
        public C9708b() {
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public final void onInitializeError(AdError adError) {
            C9706b c9706b = C9706b.this;
            c9706b.f19253l.m1653f(c9706b.f19242a, c9706b.f19251j);
            boolean z = c9706b.f19254m;
            if (z && c9706b.f19245d != null && c9706b.f19246e != null) {
                int i = C9706b.f19241p;
                Log.w("b", adError.getMessage());
                c9706b.f19246e.onAdFailedToLoad(c9706b.f19245d, adError);
            } else if (z && c9706b.f19248g != null) {
                int i2 = C9706b.f19241p;
                Log.w("b", adError.getMessage());
                c9706b.f19248g.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public final void onInitializeSuccess() {
            C9706b c9706b = C9706b.this;
            c9706b.getClass();
            Log.d("b", "loadBanner: " + c9706b);
            C9888n.m1438a(c9706b.f19242a, c9706b.f19250i, new C9821k(c9706b.f19243b), c9706b.f19256o);
        }
    }

    /* renamed from: com.vungle.mediation.b$c */
    /* loaded from: classes3.dex */
    public class C9709c implements InterfaceC10136z {
        public C9709c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0174  */
        @Override // com.vungle.warren.InterfaceC10136z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onAdLoad(java.lang.String r25) {
            /*
                Method dump skipped, instructions count: 439
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.mediation.C9706b.C9709c.onAdLoad(java.lang.String):void");
        }

        @Override // com.vungle.warren.InterfaceC10136z, com.vungle.warren.InterfaceC9782e0
        public final void onError(String str, VungleException vungleException) {
            C9706b c9706b = C9706b.this;
            c9706b.f19253l.m1653f(c9706b.f19242a, c9706b.f19251j);
            if (!c9706b.f19254m) {
                int i = C9706b.f19241p;
                Log.w("b", "No banner request fired.");
            } else if (c9706b.f19245d != null && c9706b.f19246e != null) {
                AdError adError = VungleMediationAdapter.getAdError(vungleException);
                int i2 = C9706b.f19241p;
                Log.w("b", adError.getMessage());
                c9706b.f19246e.onAdFailedToLoad(c9706b.f19245d, adError);
            } else if (c9706b.f19248g != null) {
                AdError adError2 = VungleMediationAdapter.getAdError(vungleException);
                int i3 = C9706b.f19241p;
                Log.w("b", adError2.getMessage());
                c9706b.f19248g.onFailure(adError2);
            }
        }
    }

    public C9706b(@NonNull String str, @NonNull String str2, @NonNull AdConfig adConfig, @NonNull MediationBannerAd mediationBannerAd) {
        this.f19242a = str;
        this.f19244c = str2;
        this.f19243b = adConfig;
        this.f19247f = mediationBannerAd;
    }

    public C9706b(@NonNull String str, @NonNull String str2, @NonNull AdConfig adConfig, @NonNull MediationBannerAdapter mediationBannerAdapter) {
        this.f19242a = str;
        this.f19244c = str2;
        this.f19243b = adConfig;
        this.f19245d = mediationBannerAdapter;
    }

    /* renamed from: a */
    public final void m1660a(Context context, String str, AdSize adSize) {
        this.f19252k = new C9707a(context);
        int heightInPixels = adSize.getHeightInPixels(context);
        if (heightInPixels <= 0) {
            heightInPixels = Math.round(this.f19243b.m1425a().getHeight() * context.getResources().getDisplayMetrics().density);
        }
        this.f19252k.setLayoutParams(new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), heightInPixels));
        Log.d("b", "requestBannerAd: " + this);
        this.f19254m = true;
        VungleInitializer.getInstance().initialize(str, context.getApplicationContext(), new C9708b());
    }

    /* renamed from: b */
    public final void m1659b(boolean z) {
        VungleBannerAd vungleBannerAd = this.f19251j;
        if (vungleBannerAd == null) {
            return;
        }
        this.f19255n = z;
        if (vungleBannerAd.getVungleBanner() != null) {
            this.f19251j.getVungleBanner().setAdVisibility(z);
        }
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void creativeId(String str) {
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void onAdClick(String str) {
        MediationBannerListener mediationBannerListener;
        MediationBannerAdapter mediationBannerAdapter = this.f19245d;
        if (mediationBannerAdapter != null && (mediationBannerListener = this.f19246e) != null) {
            mediationBannerListener.onAdClicked(mediationBannerAdapter);
            this.f19246e.onAdOpened(mediationBannerAdapter);
            return;
        }
        MediationBannerAdCallback mediationBannerAdCallback = this.f19249h;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f19249h.onAdOpened();
        }
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void onAdEnd(String str) {
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    @Deprecated
    public final void onAdEnd(String str, boolean z, boolean z2) {
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void onAdLeftApplication(String str) {
        MediationBannerListener mediationBannerListener;
        MediationBannerAdapter mediationBannerAdapter = this.f19245d;
        if (mediationBannerAdapter != null && (mediationBannerListener = this.f19246e) != null) {
            mediationBannerListener.onAdLeftApplication(mediationBannerAdapter);
            return;
        }
        MediationBannerAdCallback mediationBannerAdCallback = this.f19249h;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void onAdRewarded(String str) {
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void onAdStart(String str) {
        if (TextUtils.isEmpty(this.f19250i)) {
            C9888n.m1438a(this.f19242a, null, new C9821k(this.f19243b), null);
        }
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void onAdViewed(String str) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f19249h;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void onError(String str, VungleException vungleException) {
        MediationBannerListener mediationBannerListener;
        AdError adError = VungleMediationAdapter.getAdError(vungleException);
        Log.w("b", adError.getMessage());
        MediationBannerAdapter mediationBannerAdapter = this.f19245d;
        if (mediationBannerAdapter != null && (mediationBannerListener = this.f19246e) != null) {
            mediationBannerListener.onAdFailedToLoad(mediationBannerAdapter, adError);
            return;
        }
        MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback = this.f19248g;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(" [placementId=");
        sb.append(this.f19242a);
        sb.append(" # uniqueRequestId=");
        sb.append(this.f19244c);
        sb.append(" # adMarkup=");
        sb.append(TextUtils.isEmpty(this.f19250i) ? "None" : "Yes");
        sb.append(" # hashcode=");
        sb.append(hashCode());
        sb.append("] ");
        return sb.toString();
    }
}
