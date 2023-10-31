package com.unity3d.scar.adapter.v1950.scarads;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.scarads.IScarAd;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1950.signals.QueryInfoMetadata;

/* loaded from: classes3.dex */
public abstract class ScarAdBase implements IScarAd {

    /* renamed from: a */
    public final Context f18060a;

    /* renamed from: b */
    public final ScarAdMetadata f18061b;

    /* renamed from: c */
    public final QueryInfoMetadata f18062c;

    /* renamed from: d */
    public final IAdsErrorHandler f18063d;

    public ScarAdBase(Context context, ScarAdMetadata scarAdMetadata, QueryInfoMetadata queryInfoMetadata, IAdsErrorHandler iAdsErrorHandler) {
        this.f18060a = context;
        this.f18061b = scarAdMetadata;
        this.f18062c = queryInfoMetadata;
        this.f18063d = iAdsErrorHandler;
    }

    @Override // com.unity3d.scar.adapter.common.scarads.IScarAd
    public void loadAd(IScarLoadListener iScarLoadListener) {
        ScarAdMetadata scarAdMetadata = this.f18061b;
        QueryInfoMetadata queryInfoMetadata = this.f18062c;
        if (queryInfoMetadata == null) {
            this.f18063d.handleError(GMAAdsError.QueryNotFoundError(scarAdMetadata));
            return;
        }
        loadAdInternal(iScarLoadListener, new AdRequest.Builder().setAdInfo(new AdInfo(queryInfoMetadata.getQueryInfo(), scarAdMetadata.getAdString())).build());
    }

    public abstract void loadAdInternal(IScarLoadListener iScarLoadListener, AdRequest adRequest);
}
