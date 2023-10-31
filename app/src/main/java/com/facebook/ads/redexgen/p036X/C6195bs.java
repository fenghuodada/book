package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.bs */
/* loaded from: assets/audience_network.dex */
public class C6195bs implements InterfaceC5269Mq {
    public static String[] A01 = {"JdxG2e87fiw1QxhKtyp6wy4hCZ34K54h", "5l6PiVFmWkFi4LSRmzN6ZIbVVY4PyA16", "qh41B7qjlQhNnOsbjTqj3JtjZfsrgLHf", "L6JKyztUTZrhaC2oSi2AGhNMneOalgfU", "mLvzPn8zSeH", "6Oneq6t5dYPlbDhRy7qxaYTJsizasisX", "J8", "lXMgpjBtmdYXVX4s4nwhe"};
    public final WeakReference<C422159> A00;

    public C6195bs(C422159 c422159) {
        this.A00 = new WeakReference<>(c422159);
    }

    private void A00(C422159 c422159) {
        C5445Pi c5445Pi;
        RelativeLayout relativeLayout;
        c5445Pi = c422159.A0C;
        if (c5445Pi != null) {
            relativeLayout = c422159.A06;
            relativeLayout.bringChildToFront(c5445Pi);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5269Mq
    public final void A3H(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout relativeLayout;
        C422159 c422159 = this.A00.get();
        if (c422159 != null) {
            relativeLayout = c422159.A06;
            relativeLayout.addView(view, i, layoutParams);
            A00(c422159);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5269Mq
    public final void A3I(View view, RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout relativeLayout;
        C422159 c422159 = this.A00.get();
        if (c422159 != null) {
            relativeLayout = c422159.A06;
            relativeLayout.addView(view, layoutParams);
            A00(c422159);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5269Mq
    public void A3s(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0D(str);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5269Mq
    public void A3t(String str, C44819a c44819a) {
        if (this.A00.get() != null) {
            this.A00.get().A0F(str, c44819a);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5269Mq
    public final void A8j(String str, C39971U c39971u) {
        if (this.A00.get() != null) {
            C422159 c422159 = this.A00.get();
            String[] strArr = A01;
            if (strArr[0].charAt(19) != strArr[1].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "LaehfLm13EgRqqa58La6JsJDVjNkKsjm";
            strArr2[1] = "U7opStToMRhy5hKGwjx6Oh4Ofub1lgfJ";
            c422159.A0E(str, c39971u);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5269Mq
    public final void AAF(int i) {
        C422159 c422159 = this.A00.get();
        if (c422159 != null) {
            c422159.finish(i);
        }
    }
}
