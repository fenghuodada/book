package com.facebook.ads.redexgen.p036X;

import android.graphics.drawable.ColorDrawable;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.api.AdCompanionViewApi;
import com.facebook.ads.internal.api.AdComponentViewApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bu */
/* loaded from: assets/audience_network.dex */
public final class C6197bu extends C42265E implements AdCompanionViewApi {
    public static byte[] A05;
    @Nullable
    public AbstractC397518 A00;
    @Nullable
    public AdCompanionView A01;
    @Nullable
    public C5953Xy A02;
    @Nullable
    public InterfaceC5080Jh A03;
    @Nullable
    public C4508A1 A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-120, -108, -110, 83, -117, -122, -120, -118, -121, -108, -108, -112, 83, -122, -119, -104, 83, -114, -109, -103, -118, -105, -104, -103, -114, -103, -114, -122, -111, 83, -120, -111, -114, -120, -112, -118, -119};
    }

    public final void A02() {
        this.A04 = null;
    }

    public final void A03(C5953Xy c5953Xy, AbstractC397518 abstractC397518) {
        AdCompanionView adCompanionView = this.A01;
        if (adCompanionView == null) {
            return;
        }
        this.A02 = c5953Xy;
        this.A00 = abstractC397518;
        C409838.A0A(adCompanionView, new ColorDrawable(0));
        this.A03 = this.A02.A08();
        this.A04 = new C4508A1(this.A02, this.A03, this.A00, A00(0, 37, 16), 3);
        this.A01.addView(this.A04);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.AdCompanionViewApi
    public final void initialize(AdCompanionView adCompanionView) {
        this.A01 = adCompanionView;
    }
}
