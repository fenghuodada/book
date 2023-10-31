package com.facebook.ads.redexgen.p036X;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* renamed from: com.facebook.ads.redexgen.X.1f */
/* loaded from: assets/audience_network.dex */
public class C40081f extends C41173S {
    @Override // com.facebook.ads.redexgen.p036X.C41183T
    public Object A00(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z);
    }

    @Override // com.facebook.ads.redexgen.p036X.C41183T
    public Object A01(int i, int i2, boolean z, int i3) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z);
    }

    @Override // com.facebook.ads.redexgen.p036X.C41183T
    public final void A03(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) obj);
    }

    @Override // com.facebook.ads.redexgen.p036X.C41183T
    public final void A04(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) obj);
    }
}
