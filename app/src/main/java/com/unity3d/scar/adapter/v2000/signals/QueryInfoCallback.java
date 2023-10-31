package com.unity3d.scar.adapter.v2000.signals;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.unity3d.scar.adapter.common.DispatchGroup;

/* loaded from: classes3.dex */
public class QueryInfoCallback extends QueryInfoGenerationCallback {

    /* renamed from: a */
    public final DispatchGroup f18104a;

    /* renamed from: b */
    public final QueryInfoMetadata f18105b;

    public QueryInfoCallback(QueryInfoMetadata queryInfoMetadata, DispatchGroup dispatchGroup) {
        this.f18104a = dispatchGroup;
        this.f18105b = queryInfoMetadata;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f18105b.setError(str);
        this.f18104a.leave();
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f18105b.setQueryInfo(queryInfo);
        this.f18104a.leave();
    }
}
