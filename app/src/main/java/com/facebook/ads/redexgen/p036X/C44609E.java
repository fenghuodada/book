package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.9E */
/* loaded from: assets/audience_network.dex */
public class C44609E extends AbstractC5283N4 {
    public static byte[] A01;
    public final /* synthetic */ C5404P2 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-78, -65, -65, -68, -65};
    }

    public C44609E(C5404P2 c5404p2) {
        this.A00 = c5404p2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
    /* renamed from: A02 */
    public final void A03(C5284N5 c5284n5) {
        InterfaceC5403P1 interfaceC5403P1;
        JSONObject A03;
        new Handler(Looper.getMainLooper()).post(new RunnableC5402P0(this));
        interfaceC5403P1 = this.A00.A0B;
        A03 = this.A00.A03();
        interfaceC5403P1.ACj(A00(0, 5, 60), A03);
    }
}
