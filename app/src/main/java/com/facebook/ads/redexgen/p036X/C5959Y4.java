package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Y4 */
/* loaded from: assets/audience_network.dex */
public final class C5959Y4 extends AbstractC43457A<C43156g> {
    public C5959Y4(long j, @Nullable C434378 c434378, C43156g c43156g) {
        super(j, c434378, c43156g, EnumC434479.A0D);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final int A06() {
        return A07().A09();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        return A07().A0A(jSONObject);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.biometric.model.TouchSignalRawValue> */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final boolean A0A(AbstractC43457A<C43156g> abstractC43457A) {
        return A07().A0B(abstractC43457A.A07());
    }
}
