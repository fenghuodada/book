package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fz */
/* loaded from: assets/audience_network.dex */
public final class C4856Fz extends AbstractC6313dp {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, 28, 72, 83, 28, 83, 76, 89, 82, 28, 80, 85, 82, 87, 28, 73, 78, 80, 6, 28, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = C4856Fz.class.getSimpleName();
    }

    public C4856Fz(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, String str, Uri uri, Map<String, String> map, @Nullable C39530m c39530m, boolean z) {
        super(c5953Xy, interfaceC5080Jh, str, c39530m, z);
        this.A00 = uri;
        this.A01 = map;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39470f
    @Nullable
    public final EnumC39460e A0A() {
        try {
            C5190LZ.A09(new C5190LZ(), ((AbstractC39470f) this).A00, C5191La.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC39470f) this).A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC39460e.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6313dp
    public final void A0D() {
        EnumC39460e enumC39460e = null;
        if (((AbstractC6313dp) this).A02) {
            enumC39460e = A0A();
        }
        A0E(this.A01, enumC39460e);
    }
}
