package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Y1 */
/* loaded from: assets/audience_network.dex */
public class C5956Y1 implements InterfaceC39270L {
    public static byte[] A01;
    public static String[] A02 = {"aROWSCJTZ7USEA9NykDAgKPqU9Hz2yMC", "Zqbs868sBagHNlYScp55lXssWh10RIQa", "mbYc5GC1jhCg", "AuzesFDqytnerPl8cSxQvwaSTNgSXgGN", "J34OJh55Zf7CVcps1JZJSO0d6JwePACZ", "sgVYwbqUus7", "7dh0o4NaZc6u8WRc1KGfxvMUmypAWeMQ", "ZE0swazaf"};
    public final /* synthetic */ C5952Xx A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A02[3].charAt(2) == 'x') {
                throw new RuntimeException();
            }
            A02[0] = "5v5qZEzKm5dZGLy7lyhruzHwv9U4ulwR";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{5, 1, 13, 11, 9};
    }

    static {
        A01();
    }

    public C5956Y1(C5952Xx c5952Xx) {
        this.A00 = c5952Xx;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39270L
    public final void A8r(Throwable th) {
        this.A00.A06().A8y(A00(0, 5, 0), C44458z.A1d, new C444690(th));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39270L
    public final void A92(Throwable th) {
        this.A00.A06().A8y(A00(0, 5, 0), C44458z.A1f, new C444690(th));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39270L
    public final void ADf(String str, int i, @Nullable String str2, @Nullable Long l, @Nullable Long l2, C391206 c391206) {
        C43687X.A05(this.A00, c391206.A06, c391206.A08, c391206.A09, c391206.A07, c391206.A03, i, str2, l, l2, null);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39270L
    public final void ADg(String str, boolean z, C391206 c391206) {
        C43687X.A04(this.A00, new C43677W(c391206.A06, c391206.A08, c391206.A07, c391206.A03, str), z);
    }
}
