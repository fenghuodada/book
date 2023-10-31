package com.unity3d.scar.adapter.v1950.signals;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.unity3d.scar.adapter.common.DispatchGroup;

/* loaded from: classes3.dex */
public class QueryInfoCallback extends QueryInfoGenerationCallback {

    /* renamed from: a */
    public final DispatchGroup f18075a;

    /* renamed from: b */
    public final QueryInfoMetadata f18076b;

    public QueryInfoCallback(QueryInfoMetadata queryInfoMetadata, DispatchGroup dispatchGroup) {
        this.f18075a = dispatchGroup;
        this.f18076b = queryInfoMetadata;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f18076b.setError(str);
        this.f18075a.leave();
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f18076b.setQueryInfo(queryInfo);
        this.f18075a.leave();
    }
}
