package com.unity3d.scar.adapter.v2000;

import android.content.Context;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.ScarAdapterBase;
import com.unity3d.scar.adapter.common.Utils;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v2000.scarads.ScarInterstitialAd;
import com.unity3d.scar.adapter.v2000.scarads.ScarRewardedAd;
import com.unity3d.scar.adapter.v2000.signals.SignalsReader;
import com.unity3d.scar.adapter.v2000.signals.SignalsStorage;

/* loaded from: classes3.dex */
public class ScarAdapter extends ScarAdapterBase {

    /* renamed from: e */
    public final SignalsStorage f18083e;

    /* renamed from: com.unity3d.scar.adapter.v2000.ScarAdapter$a */
    /* loaded from: classes3.dex */
    public class RunnableC9282a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ScarInterstitialAd f18084a;

        /* renamed from: b */
        public final /* synthetic */ ScarAdMetadata f18085b;

        /* renamed from: com.unity3d.scar.adapter.v2000.ScarAdapter$a$a */
        /* loaded from: classes3.dex */
        public class C9283a implements IScarLoadListener {
            public C9283a() {
            }

            @Override // com.unity3d.scar.adapter.common.scarads.IScarLoadListener
            public final void onAdLoaded() {
                RunnableC9282a runnableC9282a = RunnableC9282a.this;
                ScarAdapter.this.f18006b.put(runnableC9282a.f18085b.getPlacementId(), runnableC9282a.f18084a);
            }
        }

        public RunnableC9282a(ScarInterstitialAd scarInterstitialAd, ScarAdMetadata scarAdMetadata) {
            this.f18084a = scarInterstitialAd;
            this.f18085b = scarAdMetadata;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f18084a.loadAd(new C9283a());
        }
    }

    /* renamed from: com.unity3d.scar.adapter.v2000.ScarAdapter$b */
    /* loaded from: classes3.dex */
    public class RunnableC9284b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ScarRewardedAd f18088a;

        /* renamed from: b */
        public final /* synthetic */ ScarAdMetadata f18089b;

        /* renamed from: com.unity3d.scar.adapter.v2000.ScarAdapter$b$a */
        /* loaded from: classes3.dex */
        public class C9285a implements IScarLoadListener {
            public C9285a() {
            }

            @Override // com.unity3d.scar.adapter.common.scarads.IScarLoadListener
            public final void onAdLoaded() {
                RunnableC9284b runnableC9284b = RunnableC9284b.this;
                ScarAdapter.this.f18006b.put(runnableC9284b.f18089b.getPlacementId(), runnableC9284b.f18088a);
            }
        }

        public RunnableC9284b(ScarRewardedAd scarRewardedAd, ScarAdMetadata scarAdMetadata) {
            this.f18088a = scarRewardedAd;
            this.f18089b = scarAdMetadata;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f18088a.loadAd(new C9285a());
        }
    }

    public ScarAdapter(IAdsErrorHandler iAdsErrorHandler) {
        super(iAdsErrorHandler);
        SignalsStorage signalsStorage = new SignalsStorage();
        this.f18083e = signalsStorage;
        this.f18005a = new SignalsReader(signalsStorage);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void loadInterstitialAd(Context context, ScarAdMetadata scarAdMetadata, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        Utils.runOnUiThread(new RunnableC9282a(new ScarInterstitialAd(context, this.f18083e.getQueryInfoMetadata(scarAdMetadata.getPlacementId()), scarAdMetadata, this.f18008d, iScarInterstitialAdListenerWrapper), scarAdMetadata));
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void loadRewardedAd(Context context, ScarAdMetadata scarAdMetadata, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        Utils.runOnUiThread(new RunnableC9284b(new ScarRewardedAd(context, this.f18083e.getQueryInfoMetadata(scarAdMetadata.getPlacementId()), scarAdMetadata, this.f18008d, iScarRewardedAdListenerWrapper), scarAdMetadata));
    }
}
