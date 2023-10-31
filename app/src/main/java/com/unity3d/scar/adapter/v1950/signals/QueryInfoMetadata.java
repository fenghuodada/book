package com.unity3d.scar.adapter.v1950.signals;

import com.google.android.gms.ads.query.QueryInfo;

/* loaded from: classes3.dex */
public class QueryInfoMetadata {

    /* renamed from: a */
    public final String f18077a;

    /* renamed from: b */
    public QueryInfo f18078b;

    /* renamed from: c */
    public String f18079c;

    public QueryInfoMetadata(String str) {
        this.f18077a = str;
    }

    public String getError() {
        return this.f18079c;
    }

    public String getPlacementId() {
        return this.f18077a;
    }

    public QueryInfo getQueryInfo() {
        return this.f18078b;
    }

    public String getQueryStr() {
        QueryInfo queryInfo = this.f18078b;
        if (queryInfo != null) {
            return queryInfo.getQuery();
        }
        return null;
    }

    public void setError(String str) {
        this.f18079c = str;
    }

    public void setQueryInfo(QueryInfo queryInfo) {
        this.f18078b = queryInfo;
    }
}
