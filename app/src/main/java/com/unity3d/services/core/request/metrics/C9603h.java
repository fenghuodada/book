package com.unity3d.services.core.request.metrics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.unity3d.services.core.request.metrics.h */
/* loaded from: classes3.dex */
public class C9603h {

    /* renamed from: a */
    private final C9598e f19050a;

    /* renamed from: b */
    private final List<C9597d> f19051b;

    /* renamed from: c */
    private final String f19052c;

    public C9603h(String str, C9598e c9598e, List<C9597d> list) {
        this.f19052c = str;
        this.f19050a = c9598e;
        this.f19051b = list;
    }

    /* renamed from: a */
    public Map<String, Object> m1840a() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (C9597d c9597d : this.f19051b) {
            arrayList.add(c9597d.m1858a());
        }
        hashMap.put("msr", this.f19052c);
        hashMap.put("m", arrayList);
        hashMap.put("t", this.f19050a.m1856a());
        return hashMap;
    }
}
