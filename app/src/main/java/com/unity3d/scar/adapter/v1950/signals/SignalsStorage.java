package com.unity3d.scar.adapter.v1950.signals;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class SignalsStorage {

    /* renamed from: a */
    public final HashMap f18082a = new HashMap();

    public Map<String, QueryInfoMetadata> getPlacementQueryInfoMap() {
        return this.f18082a;
    }

    public QueryInfoMetadata getQueryInfoMetadata(String str) {
        return (QueryInfoMetadata) this.f18082a.get(str);
    }

    public void put(String str, QueryInfoMetadata queryInfoMetadata) {
        this.f18082a.put(str, queryInfoMetadata);
    }
}
