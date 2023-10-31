package com.unity3d.scar.adapter.v1920.signals;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class SignalsStorage {

    /* renamed from: a */
    public final HashMap f18050a = new HashMap();

    public Map<String, QueryInfoMetadata> getPlacementQueryInfoMap() {
        return this.f18050a;
    }

    public QueryInfoMetadata getQueryInfoMetadata(String str) {
        return (QueryInfoMetadata) this.f18050a.get(str);
    }

    public void put(String str, QueryInfoMetadata queryInfoMetadata) {
        this.f18050a.put(str, queryInfoMetadata);
    }
}
