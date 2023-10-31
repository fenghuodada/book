package com.unity3d.scar.adapter.v1920;

import android.content.Context;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.ScarAdapterBase;
import com.unity3d.scar.adapter.common.Utils;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1920.scarads.ScarInterstitialAd;
import com.unity3d.scar.adapter.v1920.scarads.ScarRewardedAd;
import com.unity3d.scar.adapter.v1920.signals.SignalsReader;
import com.unity3d.scar.adapter.v1920.signals.SignalsStorage;

/* loaded from: classes3.dex */
public class ScarAdapter extends ScarAdapterBase {

    /* renamed from: e */
    public final SignalsStorage f18019e;

    /* renamed from: com.unity3d.scar.adapter.v1920.ScarAdapter$a */
    /* loaded from: classes3.dex */
    public class RunnableC9266a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ScarInterstitialAd f18020a;

        /* renamed from: b */
        public final /* synthetic */ ScarAdMetadata f18021b;

        /* renamed from: com.unity3d.scar.adapter.v1920.ScarAdapter$a$a */
        /* loaded from: classes3.dex */
        public class C9267a implements IScarLoadListener {
            public C9267a() {
            }

            @Override // com.unity3d.scar.adapter.common.scarads.IScarLoadListener
            public final void onAdLoaded() {
                RunnableC9266a runnableC9266a = RunnableC9266a.this;
                ScarAdapter.this.f18006b.put(runnableC9266a.f18021b.getPlacementId(), runnableC9266a.f18020a);
            }
        }

        public RunnableC9266a(ScarInterstitialAd scarInterstitialAd, ScarAdMetadata scarAdMetadata) {
            this.f18020a = scarInterstitialAd;
            this.f18021b = scarAdMetadata;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f18020a.loadAd(new C9267a());
        }
    }

    /* renamed from: com.unity3d.scar.adapter.v1920.ScarAdapter$b */
    /* loaded from: classes3.dex */
    public class RunnableC9268b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ScarRewardedAd f18024a;

        /* renamed from: b */
        public final /* synthetic */ ScarAdMetadata f18025b;

        /* renamed from: com.unity3d.scar.adapter.v1920.ScarAdapter$b$a */
        /* loaded from: classes3.dex */
        public class C9269a implements IScarLoadListener {
            public C9269a() {
            }

            @Override // com.unity3d.scar.adapter.common.scarads.IScarLoadListener
            public final void onAdLoaded() {
                RunnableC9268b runnableC9268b = RunnableC9268b.this;
                ScarAdapter.this.f18006b.put(runnableC9268b.f18025b.getPlacementId(), runnableC9268b.f18024a);
            }
        }

        public RunnableC9268b(ScarRewardedAd scarRewardedAd, ScarAdMetadata scarAdMetadata) {
            this.f18024a = scarRewardedAd;
            this.f18025b = scarAdMetadata;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f18024a.loadAd(new C9269a());
        }
    }

    public ScarAdapter(IAdsErrorHandler iAdsErrorHandler) {
        super(iAdsErrorHandler);
        SignalsStorage signalsStorage = new SignalsStorage();
        this.f18019e = signalsStorage;
        this.f18005a = new SignalsReader(signalsStorage);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void loadInterstitialAd(Context context, ScarAdMetadata scarAdMetadata, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        Utils.runOnUiThread(new RunnableC9266a(new ScarInterstitialAd(context, this.f18019e.getQueryInfoMetadata(scarAdMetadata.getPlacementId()), scarAdMetadata, this.f18008d, iScarInterstitialAdListenerWrapper), scarAdMetadata));
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void loadRewardedAd(Context context, ScarAdMetadata scarAdMetadata, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        Utils.runOnUiThread(new RunnableC9268b(new ScarRewardedAd(context, this.f18019e.getQueryInfoMetadata(scarAdMetadata.getPlacementId()), scarAdMetadata, this.f18008d, iScarRewardedAdListenerWrapper), scarAdMetadata));
    }
}
