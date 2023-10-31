package com.facebook.ads.redexgen.p036X;

import android.annotation.TargetApi;
import android.net.Uri;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

@TargetApi(14)
/* renamed from: com.facebook.ads.redexgen.X.Qg */
/* loaded from: assets/audience_network.dex */
public final class C5505Qg {
    public static byte[] A02;
    public static String[] A03 = {"WzijvlAd9RP1HJzMxCKzeYHnMs2QP54v", "kfrqpsiELz0FvZTPYg", "hAwPDz", "OryCsPOoCbEZ1Kjw18", "JoqBI6chV", "rfkFyJ13DXugB3RLj6H", "rQvj", "kthZXjW83"};
    public final C4729Ds A00;
    public final C5780V8 A01 = new C5780V8();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-114, -104, -116, -114, -49, -51, -31, -33, -47, -114, -116, -90, -116, -114, -96, -86, -98, -96, -16, -29, -20, -30, -29, -16, -29, -16, -57, -20, -30, -29, -10, -96, -98, -72, -98, -96, -114, -23, 111, 114, -127, -68, 99, -75, -70, -79, -90, 99, 97, 123, 97, 99};
    }

    static {
        A02();
    }

    public C5505Qg(C5953Xy c5953Xy) {
        this.A00 = C4531AO.A00(new C5911XI(c5953Xy), new C4614Bk(new C5787VF(this.A01)), new C5913XK());
    }

    @VisibleForTesting
    public static String A01(C4529AM c4529am) {
        return A00(41, 11, 55) + c4529am.A01 + A00(14, 22, 116) + c4529am.A00 + A00(0, 14, 98) + c4529am.getCause() + A00(36, 2, 98);
    }

    public static boolean A03() {
        if (A03[0].charAt(3) != 'z') {
            A03[6] = "p35x";
            return true;
        }
        throw new RuntimeException();
    }

    public final int A04() {
        return this.A00.A0J();
    }

    public final int A05() {
        return this.A00.A5r();
    }

    public final long A06() {
        return this.A00.A6F();
    }

    public final long A07() {
        return this.A00.A6R();
    }

    @Nullable
    public final C5503Qe A08() {
        Format A0L = this.A00.A0L();
        if (A0L == null) {
            return null;
        }
        return new C5503Qe(A0L.A0F, A0L.A08);
    }

    public final void A09() {
        this.A00.ADm();
    }

    public final void A0A() {
        this.A00.AEO();
    }

    public final void A0B() {
        this.A00.A0M();
    }

    public final void A0C(float f) {
        this.A00.A0N(f);
    }

    public final void A0D(long j) {
        this.A00.AEN(j);
    }

    public final void A0E(@Nullable Surface surface) {
        this.A00.A0O(surface);
    }

    public final void A0F(C5952Xx c5952Xx, Uri uri) {
        if (C5064JR.A26(c5952Xx, A03())) {
            C5806VY c5806vy = new C5806VY(C5509Qk.A05(c5952Xx).A0F(c5952Xx));
            String customCacheKey = C5509Qk.A08(c5952Xx, uri);
            if (customCacheKey != null) {
                c5806vy.A00(customCacheKey);
            }
            this.A00.A0P(c5806vy.A01(uri));
            return;
        }
        this.A00.A0P(new C5806VY(new C5778V6(c5952Xx, C5038Iz.A0K(c5952Xx, A00(38, 3, 4)), this.A01)).A01(uri));
    }

    public final void A0G(InterfaceC5502Qd interfaceC5502Qd) {
        this.A00.A3E(new C4995II(this, interfaceC5502Qd));
    }

    public final void A0H(InterfaceC5504Qf interfaceC5504Qf) {
        this.A00.A0Q(new C4996IJ(this, interfaceC5504Qf));
    }

    public final void A0I(boolean z) {
        this.A00.AEe(z);
    }

    public final boolean A0J() {
        return this.A00.A7D();
    }

    public final boolean A0K() {
        return this.A00.A0K() != null;
    }
}
