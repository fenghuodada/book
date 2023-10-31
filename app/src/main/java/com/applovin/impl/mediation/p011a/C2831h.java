package com.applovin.impl.mediation.p011a;

import androidx.annotation.NonNull;
import com.applovin.impl.sdk.C3214m;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.h */
/* loaded from: classes.dex */
public class C2831h extends C2828f {
    public C2831h(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C3214m c3214m) {
        super(map, jSONObject, jSONObject2, c3214m);
    }

    /* renamed from: a */
    public boolean m8697a() {
        return m8716b("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    @Override // com.applovin.impl.mediation.p011a.C2828f
    @NonNull
    public String toString() {
        return "SignalProviderSpec{adObject=" + m8745J() + '}';
    }
}
