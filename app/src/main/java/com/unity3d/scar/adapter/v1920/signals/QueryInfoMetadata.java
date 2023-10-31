package com.unity3d.scar.adapter.v1920.signals;

import com.google.android.gms.ads.query.QueryInfo;

/* loaded from: classes3.dex */
public class QueryInfoMetadata {

    /* renamed from: a */
    public final String f18045a;

    /* renamed from: b */
    public QueryInfo f18046b;

    /* renamed from: c */
    public String f18047c;

    public QueryInfoMetadata(String str) {
        this.f18045a = str;
    }

    public String getError() {
        return this.f18047c;
    }

    public String getPlacementId() {
        return this.f18045a;
    }

    public QueryInfo getQueryInfo() {
        return this.f18046b;
    }

    public String getQueryStr() {
        QueryInfo queryInfo = this.f18046b;
        if (queryInfo != null) {
            return queryInfo.getQuery();
        }
        return null;
    }

    public void setError(String str) {
        this.f18047c = str;
    }

    public void setQueryInfo(QueryInfo queryInfo) {
        this.f18046b = queryInfo;
    }
}
