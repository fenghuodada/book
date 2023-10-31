package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Y6 */
/* loaded from: assets/audience_network.dex */
public final class C5961Y6 extends AbstractC43457A<C43136e> {
    public C5961Y6(long j, @Nullable C434378 c434378, C43136e c43136e) {
        super(j, c434378, c43136e, EnumC434479.A0B);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final int A06() {
        return A07().A03();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        return A07().A04(jSONObject);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.biometric.model.SensorSignalRawValue> */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final boolean A0A(AbstractC43457A<C43136e> abstractC43457A) {
        return A07().A05(abstractC43457A.A07());
    }
}
