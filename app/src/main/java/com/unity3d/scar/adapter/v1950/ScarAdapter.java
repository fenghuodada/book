package com.unity3d.scar.adapter.v1950;

import android.content.Context;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.ScarAdapterBase;
import com.unity3d.scar.adapter.common.Utils;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1950.scarads.ScarInterstitialAd;
import com.unity3d.scar.adapter.v1950.scarads.ScarRewardedAd;
import com.unity3d.scar.adapter.v1950.signals.SignalsReader;
import com.unity3d.scar.adapter.v1950.signals.SignalsStorage;

/* loaded from: classes3.dex */
public class ScarAdapter extends ScarAdapterBase {

    /* renamed from: e */
    public final SignalsStorage f18051e;

    /* renamed from: com.unity3d.scar.adapter.v1950.ScarAdapter$a */
    /* loaded from: classes3.dex */
    public class RunnableC9274a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ScarInterstitialAd f18052a;

        /* renamed from: b */
        public final /* synthetic */ ScarAdMetadata f18053b;

        /* renamed from: com.unity3d.scar.adapter.v1950.ScarAdapter$a$a */
        /* loaded from: classes3.dex */
        public class C9275a implements IScarLoadListener {
            public C9275a() {
            }

            @Override // com.unity3d.scar.adapter.common.scarads.IScarLoadListener
            public final void onAdLoaded() {
                RunnableC9274a runnableC9274a = RunnableC9274a.this;
                ScarAdapter.this.f18006b.put(runnableC9274a.f18053b.getPlacementId(), runnableC9274a.f18052a);
            }
        }

        public RunnableC9274a(ScarInterstitialAd scarInterstitialAd, ScarAdMetadata scarAdMetadata) {
            this.f18052a = scarInterstitialAd;
            this.f18053b = scarAdMetadata;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f18052a.loadAd(new C9275a());
        }
    }

    /* renamed from: com.unity3d.scar.adapter.v1950.ScarAdapter$b */
    /* loaded from: classes3.dex */
    public class RunnableC9276b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ScarRewardedAd f18056a;

        /* renamed from: b */
        public final /* synthetic */ ScarAdMetadata f18057b;

        /* renamed from: com.unity3d.scar.adapter.v1950.ScarAdapter$b$a */
        /* loaded from: classes3.dex */
        public class C9277a implements IScarLoadListener {
            public C9277a() {
            }

            @Override // com.unity3d.scar.adapter.common.scarads.IScarLoadListener
            public final void onAdLoaded() {
                RunnableC9276b runnableC9276b = RunnableC9276b.this;
                ScarAdapter.this.f18006b.put(runnableC9276b.f18057b.getPlacementId(), runnableC9276b.f18056a);
            }
        }

        public RunnableC9276b(ScarRewardedAd scarRewardedAd, ScarAdMetadata scarAdMetadata) {
            this.f18056a = scarRewardedAd;
            this.f18057b = scarAdMetadata;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f18056a.loadAd(new C9277a());
        }
    }

    public ScarAdapter(IAdsErrorHandler iAdsErrorHandler) {
        super(iAdsErrorHandler);
        SignalsStorage signalsStorage = new SignalsStorage();
        this.f18051e = signalsStorage;
        this.f18005a = new SignalsReader(signalsStorage);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void loadInterstitialAd(Context context, ScarAdMetadata scarAdMetadata, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        Utils.runOnUiThread(new RunnableC9274a(new ScarInterstitialAd(context, this.f18051e.getQueryInfoMetadata(scarAdMetadata.getPlacementId()), scarAdMetadata, this.f18008d, iScarInterstitialAdListenerWrapper), scarAdMetadata));
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void loadRewardedAd(Context context, ScarAdMetadata scarAdMetadata, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        Utils.runOnUiThread(new RunnableC9276b(new ScarRewardedAd(context, this.f18051e.getQueryInfoMetadata(scarAdMetadata.getPlacementId()), scarAdMetadata, this.f18008d, iScarRewardedAdListenerWrapper), scarAdMetadata));
    }
}
