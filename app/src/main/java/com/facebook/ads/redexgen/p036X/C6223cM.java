package com.facebook.ads.redexgen.p036X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.cM */
/* loaded from: assets/audience_network.dex */
public class C6223cM extends C40762m {
    public static String[] A01 = {"qdMAGnvFuVn0ea0M3RnyzUUMgxm0S2Dt", "2PeyHnmE0bX58Ffgk0gx7OXrgxltyZLW", "2int", "nVrienaBQfkWnV6qIsNJmuY2fGTgVaBy", "EIAfoPo9YRxYx4hqHxVbjlkHHJjThpFm", "", "SPMlRY4DBSEQqdOiv1Q7wDslDeTbAa0F", "kfFOHzhabps7JVIWzUifit9US33gkwJk"};
    public final /* synthetic */ C41113M A00;

    public C6223cM(C41113M c41113m) {
        this.A00 = c41113m;
    }

    private boolean A00() {
        return this.A00.A01 != null && this.A00.A01.A05() > 1;
    }

    @Override // com.facebook.ads.redexgen.p036X.C40762m
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C41113M.class.getName());
        accessibilityEvent.setScrollable(A00());
        if (accessibilityEvent.getEventType() == 4096 && this.A00.A01 != null) {
            accessibilityEvent.setItemCount(this.A00.A01.A05());
            accessibilityEvent.setFromIndex(this.A00.A00);
            accessibilityEvent.setToIndex(this.A00.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.C40762m
    public final void A08(View view, C41223X c41223x) {
        super.A08(view, c41223x);
        c41223x.A0O(C41113M.class.getName());
        c41223x.A0R(A00());
        if (this.A00.canScrollHorizontally(1)) {
            c41223x.A0N(4096);
        }
        if (this.A00.canScrollHorizontally(-1)) {
            c41223x.A0N(8192);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.C40762m
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i == 8192 && this.A00.canScrollHorizontally(-1)) {
                C41113M c41113m = this.A00;
                c41113m.setCurrentItem(c41113m.A00 - 1);
                return true;
            }
            return false;
        }
        C41113M c41113m2 = this.A00;
        String[] strArr = A01;
        if (strArr[3].charAt(13) != strArr[7].charAt(13)) {
            throw new RuntimeException();
        }
        A01[4] = "Vr8sNFSEZwclN9wLDYuYxTMloU2ohTqa";
        if (c41113m2.canScrollHorizontally(1)) {
            C41113M c41113m3 = this.A00;
            c41113m3.setCurrentItem(c41113m3.A00 + 1);
            return true;
        }
        return false;
    }
}
