package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Y8 */
/* loaded from: assets/audience_network.dex */
public final class C5963Y8 extends AbstractC43457A<Long> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-41};
    }

    public C5963Y8(long j, @Nullable C434378 c434378, long j2) {
        super(j, c434378, Long.valueOf(j2), EnumC434479.A09);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final int A06() {
        return 8;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        jSONObject.put(A00(0, 1, 53), A07());
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.lang.Long> */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC43457A
    public final boolean A0A(AbstractC43457A<Long> abstractC43457A) {
        return A07().equals(abstractC43457A.A07());
    }
}
