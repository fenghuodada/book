package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.IY */
/* loaded from: assets/audience_network.dex */
public final class C5011IY implements InterfaceC5492QT {
    public static String[] A05 = {"hBpWhHnhmL5X5T638nUqTTajkmWXq0Jo", "NpDFSQumXtRd9HWL09JYgYkJkV27cWXf", "AxBlHN1IgfTmgBmsQuewVQ8cZkGbRxm7", "auJ8KOWij5XUc2OVh7MwLzJgAA213fGo", "l76sAXRLIUx67IYksgmFi2YoLkAbbgnJ", "1g5g87wiu8KgxwL4MK6lukjj0pQl5xRt", "P6OmLQzTnVk1JPGEjhdY9fnbkCpMcnWe", "QfRSCgXdOTNJYzcBVbNAL0t7GjPIPusf"};
    @Nullable
    public ViewPropertyAnimator A00;
    public EnumC5491QS A01 = EnumC5491QS.A05;
    public final int A02;
    public final View A03;
    public final boolean A04;

    public C5011IY(View view, int i, boolean z) {
        this.A02 = i;
        this.A03 = view;
        this.A04 = z;
    }

    private void A04(boolean z) {
        this.A01 = EnumC5491QS.A04;
        if (this.A04) {
            C5245MS.A0L(this.A03);
        }
        String[] strArr = A05;
        if (strArr[4].charAt(27) != strArr[2].charAt(27)) {
            throw new RuntimeException();
        }
        A05[0] = "iTCONHrR5nymrEIlx0VHUpGctJrwflIU";
        if (!z) {
            this.A03.setAlpha(1.0f);
            this.A01 = EnumC5491QS.A03;
            return;
        }
        this.A00 = this.A03.animate().alpha(1.0f).setDuration(this.A02).setListener(new C5496QX(this));
    }

    private void A05(boolean z) {
        this.A01 = EnumC5491QS.A06;
        if (z) {
            this.A00 = this.A03.animate().alpha(0.0f).setDuration(this.A02).setListener(new C5497QY(this));
            return;
        }
        View view = this.A03;
        if (A05[3].charAt(11) != 'U') {
            throw new RuntimeException();
        }
        A05[1] = "Va1KnH22vapH99C3A8HUoUYkLtllReKa";
        view.setAlpha(0.0f);
        this.A01 = EnumC5491QS.A05;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5492QT
    public final void A3M(boolean z, boolean z2) {
        if (z2) {
            A05(z);
        } else {
            A04(z);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5492QT
    public final EnumC5491QS A7X() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5492QT
    public final void cancel() {
        this.A03.clearAnimation();
        ViewPropertyAnimator viewPropertyAnimator = this.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }
}
