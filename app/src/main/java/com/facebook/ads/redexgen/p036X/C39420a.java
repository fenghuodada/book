package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: com.facebook.ads.redexgen.X.0a */
/* loaded from: assets/audience_network.dex */
public class C39420a extends C39450d {
    @Override // com.facebook.ads.redexgen.p036X.C409737
    public final C41143P A08(View view, C41143P c41143p) {
        WindowInsets windowInsets = (WindowInsets) C41143P.A01(c41143p);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C41143P.A00(windowInsets);
    }

    @Override // com.facebook.ads.redexgen.p036X.C409737
    public final C41143P A09(View view, C41143P c41143p) {
        WindowInsets windowInsets = (WindowInsets) C41143P.A01(c41143p);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C41143P.A00(windowInsets);
    }

    @Override // com.facebook.ads.redexgen.p036X.C409737
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.p036X.C409737
    public final void A0F(View view, final InterfaceC40822s interfaceC40822s) {
        if (interfaceC40822s == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.36
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return (WindowInsets) C41143P.A01(interfaceC40822s.AA0(view2, C41143P.A00(windowInsets)));
                }
            });
        }
    }
}
