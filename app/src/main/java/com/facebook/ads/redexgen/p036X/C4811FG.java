package com.facebook.ads.redexgen.p036X;

import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* renamed from: com.facebook.ads.redexgen.X.FG */
/* loaded from: assets/audience_network.dex */
public class C4811FG extends C6221cJ {
    @Override // com.facebook.ads.redexgen.p036X.C41153Q
    public final int A00(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Override // com.facebook.ads.redexgen.p036X.C41153Q
    public final void A01(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
