package com.unity3d.scar.adapter.v2000.scarads;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.scarads.IScarAd;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v2000.signals.QueryInfoMetadata;

/* loaded from: classes3.dex */
public abstract class ScarAdBase<T> implements IScarAd {

    /* renamed from: a */
    public T f18092a;

    /* renamed from: b */
    public final Context f18093b;

    /* renamed from: c */
    public final ScarAdMetadata f18094c;

    /* renamed from: d */
    public final QueryInfoMetadata f18095d;

    /* renamed from: e */
    public ScarAdListener f18096e;

    /* renamed from: f */
    public final IAdsErrorHandler f18097f;

    public ScarAdBase(Context context, ScarAdMetadata scarAdMetadata, QueryInfoMetadata queryInfoMetadata, IAdsErrorHandler iAdsErrorHandler) {
        this.f18093b = context;
        this.f18094c = scarAdMetadata;
        this.f18095d = queryInfoMetadata;
        this.f18097f = iAdsErrorHandler;
    }

    /* renamed from: a */
    public abstract void mo2532a(AdRequest adRequest);

    @Override // com.unity3d.scar.adapter.common.scarads.IScarAd
    public void loadAd(IScarLoadListener iScarLoadListener) {
        ScarAdMetadata scarAdMetadata = this.f18094c;
        QueryInfoMetadata queryInfoMetadata = this.f18095d;
        if (queryInfoMetadata == null) {
            this.f18097f.handleError(GMAAdsError.QueryNotFoundError(scarAdMetadata));
            return;
        }
        AdRequest build = new AdRequest.Builder().setAdInfo(new AdInfo(queryInfoMetadata.getQueryInfo(), scarAdMetadata.getAdString())).build();
        this.f18096e.setLoadListener(iScarLoadListener);
        mo2532a(build);
    }

    public void setGmaAd(T t) {
        this.f18092a = t;
    }
}
