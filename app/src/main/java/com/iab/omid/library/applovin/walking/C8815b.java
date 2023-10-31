package com.iab.omid.library.applovin.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.walking.p050a.AbstractAsyncTaskC8808b;
import com.iab.omid.library.applovin.walking.p050a.AsyncTaskC8812d;
import com.iab.omid.library.applovin.walking.p050a.AsyncTaskC8813e;
import com.iab.omid.library.applovin.walking.p050a.AsyncTaskC8814f;
import com.iab.omid.library.applovin.walking.p050a.C8811c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.b */
/* loaded from: classes3.dex */
public class C8815b implements AbstractAsyncTaskC8808b.InterfaceC8810b {

    /* renamed from: a */
    private JSONObject f16781a;

    /* renamed from: b */
    private final C8811c f16782b;

    public C8815b(C8811c c8811c) {
        this.f16782b = c8811c;
    }

    /* renamed from: a */
    public void m2949a() {
        this.f16782b.m2956b(new AsyncTaskC8812d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.p050a.AbstractAsyncTaskC8808b.InterfaceC8810b
    @VisibleForTesting
    /* renamed from: a */
    public void mo2948a(JSONObject jSONObject) {
        this.f16781a = jSONObject;
    }

    /* renamed from: a */
    public void m2947a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f16782b.m2956b(new AsyncTaskC8814f(this, hashSet, jSONObject, j));
    }

    @Override // com.iab.omid.library.applovin.walking.p050a.AbstractAsyncTaskC8808b.InterfaceC8810b
    @VisibleForTesting
    /* renamed from: b */
    public JSONObject mo2946b() {
        return this.f16781a;
    }

    /* renamed from: b */
    public void m2945b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f16782b.m2956b(new AsyncTaskC8813e(this, hashSet, jSONObject, j));
    }
}
