package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4q */
/* loaded from: assets/audience_network.dex */
public final class C42024q {
    public C41994n A00 = new C41994n();
    public final InterfaceC42004o A01;

    public C42024q(InterfaceC42004o interfaceC42004o) {
        this.A01 = interfaceC42004o;
    }

    public final View A00(int end, int next, int i, int i2) {
        int childStart = this.A01.A78();
        int A77 = this.A01.A77();
        int i3 = next > end ? 1 : -1;
        View view = null;
        while (end != next) {
            View A5z = this.A01.A5z(end);
            this.A00.A03(childStart, A77, this.A01.A62(A5z), this.A01.A61(A5z));
            if (i != 0) {
                this.A00.A01();
                this.A00.A02(i);
                if (this.A00.A04()) {
                    return A5z;
                }
            }
            if (i2 != 0) {
                this.A00.A01();
                this.A00.A02(i2);
                if (this.A00.A04()) {
                    view = A5z;
                }
            }
            end += i3;
        }
        return view;
    }
}
