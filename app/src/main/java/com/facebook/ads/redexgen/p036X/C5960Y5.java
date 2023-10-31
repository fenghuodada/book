package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Y5 */
/* loaded from: assets/audience_network.dex */
public final class C5960Y5 extends AbstractC43457A<String> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{55};
    }

    public C5960Y5(long j, @Nullable C434378 c434378, String str) {
        super(j, c434378, str, EnumC434479.A0C);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final int A06() {
        return A07().getBytes().length;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        jSONObject.put(A00(0, 1, 58), A07());
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.lang.String> */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final boolean A0A(AbstractC43457A<String> abstractC43457A) {
        return A07().equals(abstractC43457A.A07());
    }
}
