package com.facebook.ads.redexgen.p036X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cN */
/* loaded from: assets/audience_network.dex */
public class C6224cN implements InterfaceC40822s {
    public final Rect A00 = new Rect();
    public final /* synthetic */ C41113M A01;

    public C6224cN(C41113M c41113m) {
        this.A01 = c41113m;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40822s
    public final C41143P AA0(View view, C41143P c41143p) {
        C41143P A06 = C409838.A06(view, c41143p);
        if (A06.A07()) {
            return A06;
        }
        Rect rect = this.A00;
        rect.left = A06.A03();
        rect.top = A06.A05();
        rect.right = A06.A04();
        rect.bottom = A06.A02();
        int childCount = this.A01.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C41143P A05 = C409838.A05(this.A01.getChildAt(i), A06);
            rect.left = Math.min(A05.A03(), rect.left);
            rect.top = Math.min(A05.A05(), rect.top);
            rect.right = Math.min(A05.A04(), rect.right);
            rect.bottom = Math.min(A05.A02(), rect.bottom);
        }
        return A06.A06(rect.left, rect.top, rect.right, rect.bottom);
    }
}
