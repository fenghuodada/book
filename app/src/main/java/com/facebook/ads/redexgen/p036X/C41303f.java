package com.facebook.ads.redexgen.p036X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(19)
/* renamed from: com.facebook.ads.redexgen.X.3f */
/* loaded from: assets/audience_network.dex */
public final class C41303f {
    public static Object A00(final InterfaceC41293e interfaceC41293e) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3d
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) InterfaceC41293e.this.A4D(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return InterfaceC41293e.this.A5O(str, i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo findFocus(int i) {
                return (AccessibilityNodeInfo) InterfaceC41293e.this.A5P(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i, int i2, Bundle bundle) {
                return InterfaceC41293e.this.AD9(i, i2, bundle);
            }
        };
    }
}
