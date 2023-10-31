package com.facebook.ads.redexgen.p036X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.AI */
/* loaded from: assets/audience_network.dex */
public final class C4525AI extends C5598SB {
    public static String[] A00 = {"4DJOkXe9rib7uWc4nLa4kcuSPdxs7gf4", "Dyxr4XzeXsq4jjw5BU630cyoQdL32ISv", "MScpZjpz", "3XC0FNsyX3k6WX9dbHhU9IwCEOagJZ1X", "JEKgPGdFYfe9RoD8dW0t8x0Mvi1GtEmi", "N5tdloXdcly7PUtxD1ZshZXdUDk2Lr2A", "5elKCHWntj6O1Wqi1faAvLWvEV4yzp2T", "JBMx9492vmjOwkRP6"};

    public C4525AI(C40512M c40512m, int i, @Nullable List<C5437Pa> list, @Nullable C5521Qw c5521Qw, @Nullable Bundle bundle) {
        super(c40512m, i, list, c5521Qw, bundle);
        c40512m.A1j(this);
        this.A03 = new C5662TD(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int A27 = this.A0C.A27();
        if (this.A05 != null && A27 != -1 && A27 < this.A05.size() - 1) {
            A0V(A27 + 1);
        }
    }

    private void A01(int lastVisibleItem) {
        int A28 = this.A0C.A28();
        int A29 = this.A0C.A29();
        int visibleItem = this.A0C.A27();
        if (visibleItem != A28) {
            A0S(A28);
        }
        if (visibleItem != A29) {
            A0S(A29);
        }
        A0T(visibleItem);
        A0W(A28, A29, lastVisibleItem);
    }

    @Override // com.facebook.ads.redexgen.p036X.C5598SB, com.facebook.ads.redexgen.p036X.AbstractC41844Y
    public final void A0L(C4804F9 c4804f9, int i) {
    }

    @Override // com.facebook.ads.redexgen.p036X.C5598SB, com.facebook.ads.redexgen.p036X.AbstractC41844Y
    public final void A0M(C4804F9 c4804f9, int i, int i2) {
        if (this.A0C.A27() != -1) {
            AbstractC5634Sl abstractC5634Sl = (AbstractC5634Sl) this.A0C.A1q(this.A0C.A27());
            if (A00[2].length() == 4) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[3] = "IxYVUA16uQkbjXwNztolao4gyOA0tKzF";
            strArr[6] = "jcO9EzcXxFOxyF2BSjZiD0vteRj0mA5y";
            if (abstractC5634Sl != null && abstractC5634Sl.A0i() && !abstractC5634Sl.A0h()) {
                abstractC5634Sl.A0f();
            }
            A01(i);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.C5598SB
    public final void A0Y(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.8f);
    }

    @Override // com.facebook.ads.redexgen.p036X.C5598SB
    public final void A0a(AbstractC5634Sl abstractC5634Sl, boolean z) {
        A0Y(abstractC5634Sl, z);
        if (!z && abstractC5634Sl.A0h()) {
            abstractC5634Sl.A0e();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.C5598SB
    public final boolean A0b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final C5521Qw A0c() {
        return this.A04;
    }

    public final void A0d(C5521Qw c5521Qw) {
        this.A04 = c5521Qw;
    }

    public final void A0e(List<C5437Pa> list) {
        this.A05 = list;
    }
}
