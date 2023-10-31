package com.facebook.ads.redexgen.p036X;

import android.view.View;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.48 */
/* loaded from: assets/audience_network.dex */
public class C415948 {
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public boolean A09;
    public boolean A0B = true;
    public int A02 = 0;
    public boolean A0A = false;
    public List<AbstractC41974l> A08 = null;

    private View A00() {
        int size = this.A08.size();
        for (int i = 0; i < size; i++) {
            View view = this.A08.get(i).A0H;
            C41804U c41804u = (C41804U) view.getLayoutParams();
            if (!c41804u.A02()) {
                int i2 = this.A01;
                int i3 = c41804u.A00();
                if (i2 == i3) {
                    A02(view);
                    return view;
                }
            }
        }
        return null;
    }

    private final View A01(View closest) {
        int i = this.A08.size();
        View view = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < i; i3++) {
            View view2 = this.A08.get(i3).A0H;
            C41804U c41804u = (C41804U) view2.getLayoutParams();
            if (view2 != closest && !c41804u.A02()) {
                int A00 = c41804u.A00();
                int closestDistance = this.A01;
                int i4 = A00 - closestDistance;
                int closestDistance2 = this.A03;
                int i5 = i4 * closestDistance2;
                if (i5 >= 0 && i5 < i2) {
                    view = view2;
                    i2 = i5;
                    if (i5 == 0) {
                        break;
                    }
                }
            }
        }
        return view;
    }

    private final void A02(View view) {
        View A01 = A01(view);
        if (A01 == null) {
            this.A01 = -1;
        } else {
            this.A01 = ((C41804U) A01.getLayoutParams()).A00();
        }
    }

    public final View A03(C41874b c41874b) {
        if (this.A08 != null) {
            return A00();
        }
        View A0G = c41874b.A0G(this.A01);
        this.A01 += this.A03;
        return A0G;
    }

    public final void A04() {
        A02(null);
    }

    public final boolean A05(C41944i c41944i) {
        int i = this.A01;
        return i >= 0 && i < c41944i.A03();
    }
}
