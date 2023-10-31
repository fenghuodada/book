package com.iab.omid.library.applovin.walking.p050a;

import com.iab.omid.library.applovin.walking.p050a.AbstractAsyncTaskC8808b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.a.a */
/* loaded from: classes3.dex */
public abstract class AbstractAsyncTaskC8807a extends AbstractAsyncTaskC8808b {

    /* renamed from: a */
    protected final HashSet<String> f16772a;

    /* renamed from: b */
    protected final JSONObject f16773b;

    /* renamed from: c */
    protected final long f16774c;

    public AbstractAsyncTaskC8807a(AbstractAsyncTaskC8808b.InterfaceC8810b interfaceC8810b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC8810b);
        this.f16772a = new HashSet<>(hashSet);
        this.f16773b = jSONObject;
        this.f16774c = j;
    }
}
