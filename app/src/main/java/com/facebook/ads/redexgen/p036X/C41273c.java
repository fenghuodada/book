package com.facebook.ads.redexgen.p036X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(16)
/* renamed from: com.facebook.ads.redexgen.X.3c */
/* loaded from: assets/audience_network.dex */
public final class C41273c {
    public static Object A00(final InterfaceC41263b interfaceC41263b) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3a
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) InterfaceC41263b.this.A4D(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return InterfaceC41263b.this.A5O(str, i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i, int i2, Bundle bundle) {
                return InterfaceC41263b.this.AD9(i, i2, bundle);
            }
        };
    }
}
