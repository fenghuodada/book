package com.facebook.ads.redexgen.p036X;

import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;

@TargetApi(12)
/* renamed from: com.facebook.ads.redexgen.X.KT */
/* loaded from: assets/audience_network.dex */
public final class C5126KT implements InterfaceC5470Q7 {
    public static String[] A0B = {"82Zz8oCZg8zkkbzw8opl2Yz4CtrF2SDp", "9Qv", "sj5N5SmrmBRQmWue5o8rJw6ys3alFtJa", "lBA7odrZYL425", "CSSBUKaIJSWMhqfJuWGnuyX4cipoTk5I", "IDQP5gLMbSSnC18VVbdsGZXvkzghwpNg", "Yf1MSxzKxHs57zUlY7hI2xykX4pHUq1P", "T3bn0lMwtbok5v0PvXD6574OGDOrX6LS"};
    public View A00;
    @Nullable
    public C5483QK A01;
    @Nullable
    public EnumC5482QJ A02;
    public boolean A03;
    public final Handler A04;
    public final AbstractC5285N6 A05;
    public final AbstractC5216Lz A06;
    public final AbstractC5200Lj A07;
    public final AbstractC5137Ke A08;
    public final boolean A09;
    public final boolean A0A;

    public C5126KT(View view, EnumC5482QJ enumC5482QJ, boolean z) {
        this(view, enumC5482QJ, z, false);
    }

    public C5126KT(View view, @Nullable EnumC5482QJ enumC5482QJ, boolean z, boolean z2) {
        this.A06 = new AbstractC5216Lz() { // from class: com.facebook.ads.redexgen.X.7r
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C439585 c439585) {
                C5126KT.this.A06(1, 0);
            }
        };
        this.A07 = new AbstractC5200Lj() { // from class: com.facebook.ads.redexgen.X.7q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C5215Ly c5215Ly) {
                boolean z3;
                EnumC5482QJ enumC5482QJ2;
                boolean z4;
                z3 = C5126KT.this.A03;
                if (!z3) {
                    return;
                }
                enumC5482QJ2 = C5126KT.this.A02;
                if (enumC5482QJ2 != EnumC5482QJ.A03) {
                    z4 = C5126KT.this.A09;
                    if (!z4) {
                        C5126KT.this.A06(0, 8);
                        return;
                    }
                }
                C5126KT.this.A02 = null;
                C5126KT.this.A05();
            }
        };
        this.A05 = new AbstractC5285N6() { // from class: com.facebook.ads.redexgen.X.7p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C439788 c439788) {
                EnumC5482QJ enumC5482QJ2;
                View view2;
                View view3;
                enumC5482QJ2 = C5126KT.this.A02;
                if (enumC5482QJ2 == EnumC5482QJ.A04) {
                    return;
                }
                view2 = C5126KT.this.A00;
                view2.setAlpha(1.0f);
                view3 = C5126KT.this.A00;
                view3.setVisibility(0);
            }
        };
        this.A08 = new C43817o(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z;
        this.A0A = z2;
        A08(view, enumC5482QJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new C5481QI(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i, int i2) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i);
        this.A00.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, EnumC5482QJ enumC5482QJ) {
        this.A02 = enumC5482QJ;
        this.A00 = view;
        this.A00.clearAnimation();
        if (enumC5482QJ == EnumC5482QJ.A04) {
            this.A00.setAlpha(0.0f);
            String[] strArr = A0B;
            if (strArr[5].charAt(26) == strArr[0].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[5] = "3OWa54Sl5zOXBo6RskK22JrE4LW5JWKj";
            strArr2[0] = "lt7hksMEFpJVhV2333OBcIopOVPW9bfy";
            this.A00.setVisibility(8);
            return;
        }
        this.A00.setAlpha(1.0f);
        this.A00.setVisibility(0);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5470Q7
    public final void A8o(C5483QK c5483qk) {
        this.A01 = c5483qk;
        c5483qk.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5470Q7
    public final void AFG(C5483QK c5483qk) {
        A06(1, 0);
        c5483qk.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
