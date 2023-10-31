package com.unity3d.scar.adapter.v1920.signals;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.unity3d.scar.adapter.common.DispatchGroup;

/* loaded from: classes3.dex */
public class QueryInfoCallback extends QueryInfoGenerationCallback {

    /* renamed from: a */
    public final DispatchGroup f18043a;

    /* renamed from: b */
    public final QueryInfoMetadata f18044b;

    public QueryInfoCallback(QueryInfoMetadata queryInfoMetadata, DispatchGroup dispatchGroup) {
        this.f18043a = dispatchGroup;
        this.f18044b = queryInfoMetadata;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f18044b.setError(str);
        this.f18043a.leave();
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f18044b.setQueryInfo(queryInfo);
        this.f18043a.leave();
    }
}
