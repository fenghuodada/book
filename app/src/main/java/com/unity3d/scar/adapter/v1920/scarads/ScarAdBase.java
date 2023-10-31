package com.unity3d.scar.adapter.v1920.scarads;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.scarads.IScarAd;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1920.signals.QueryInfoMetadata;

/* loaded from: classes3.dex */
public abstract class ScarAdBase implements IScarAd {

    /* renamed from: a */
    public final Context f18028a;

    /* renamed from: b */
    public final ScarAdMetadata f18029b;

    /* renamed from: c */
    public final QueryInfoMetadata f18030c;

    /* renamed from: d */
    public final IAdsErrorHandler f18031d;

    public ScarAdBase(Context context, ScarAdMetadata scarAdMetadata, QueryInfoMetadata queryInfoMetadata, IAdsErrorHandler iAdsErrorHandler) {
        this.f18028a = context;
        this.f18029b = scarAdMetadata;
        this.f18030c = queryInfoMetadata;
        this.f18031d = iAdsErrorHandler;
    }

    @Override // com.unity3d.scar.adapter.common.scarads.IScarAd
    public void loadAd(IScarLoadListener iScarLoadListener) {
        ScarAdMetadata scarAdMetadata = this.f18029b;
        QueryInfoMetadata queryInfoMetadata = this.f18030c;
        if (queryInfoMetadata == null) {
            this.f18031d.handleError(GMAAdsError.QueryNotFoundError(scarAdMetadata));
            return;
        }
        loadAdInternal(iScarLoadListener, new AdRequest.Builder().setAdInfo(new AdInfo(queryInfoMetadata.getQueryInfo(), scarAdMetadata.getAdString())).build());
    }

    public abstract void loadAdInternal(IScarLoadListener iScarLoadListener, AdRequest adRequest);
}
