package com.unity3d.scar.adapter.v2000.signals;

import com.google.android.gms.ads.query.QueryInfo;

/* loaded from: classes3.dex */
public class QueryInfoMetadata {

    /* renamed from: a */
    public final String f18106a;

    /* renamed from: b */
    public QueryInfo f18107b;

    /* renamed from: c */
    public String f18108c;

    public QueryInfoMetadata(String str) {
        this.f18106a = str;
    }

    public String getError() {
        return this.f18108c;
    }

    public String getPlacementId() {
        return this.f18106a;
    }

    public QueryInfo getQueryInfo() {
        return this.f18107b;
    }

    public String getQueryStr() {
        QueryInfo queryInfo = this.f18107b;
        if (queryInfo != null) {
            return queryInfo.getQuery();
        }
        return null;
    }

    public void setError(String str) {
        this.f18108c = str;
    }

    public void setQueryInfo(QueryInfo queryInfo) {
        this.f18107b = queryInfo;
    }
}
