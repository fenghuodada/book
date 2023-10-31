package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Pq */
/* loaded from: assets/audience_network.dex */
public final class C5453Pq {
    public final C397619 A00;
    public final C39851I A01;
    public final C39891M A02;
    public final C39971U A03;
    public final C5953Xy A04;
    public final C5088Jp A05;
    public static String[] A06 = {"67PC1vS7qkP", "IjFo3BG6VwtzNtFBLMxB3hm7uxcMitzp", "CicRHWg02u8tYTVNboa", "Lc1HqPOOGgkkm0o4iF185HVfJQb2Oy4J", "rfUiy7qGv2cTTJD", "veTQu7RBhk0w6DuY7Y8JViB1PkIKs", "nFnk8VxBkehLa6QhTm5QccOE2IAl", "l0nPd7gOfqjUiTZVoVDHfvPfOU4VPF8e"};
    public static final int A09 = (int) (C5208Lr.A00 * 4.0f);
    public static final int A07 = (int) (C5208Lr.A00 * 72.0f);
    public static final int A08 = (int) (C5208Lr.A00 * 8.0f);

    public C5453Pq(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, AbstractC397518 abstractC397518) {
        this.A04 = c5953Xy;
        this.A05 = new C5088Jp(abstractC397518.A0U(), interfaceC5080Jh);
        this.A00 = abstractC397518.A0N();
        this.A01 = abstractC397518.A0O().A0E();
        this.A03 = abstractC397518.A0R();
        this.A02 = abstractC397518.A0O().A0G();
    }

    private View A00() {
        C4804F9 c4804f9 = new C4804F9(this.A04);
        c4804f9.setLayoutManager(new C6213cB(this.A04, 0, false));
        c4804f9.setAdapter(new C5582Rv(this.A04, this.A02.A00(), A09));
        return c4804f9;
    }

    private View A01(@Nullable View$OnClickListenerC5650T1 view$OnClickListenerC5650T1) {
        C5378Oc c5378Oc = new C5378Oc(this.A04, this.A00.A01(), true, false, false);
        c5378Oc.A01(this.A01.A06(), this.A01.A01(), null, false, true);
        c5378Oc.setAlignment(17);
        C5372OW c5372ow = new C5372OW(this.A04);
        C5245MS.A0M(c5372ow, 0);
        c5372ow.setRadius(50);
        new AsyncTaskC5652T3(c5372ow, this.A04).A04().A07(this.A03.A01());
        LinearLayout linearLayout = new LinearLayout(this.A04);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i = A07;
        linearLayout.addView(c5372ow, new LinearLayout.LayoutParams(i, i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A08;
        layoutParams.setMargins(0, i2, 0, i2);
        linearLayout.addView(c5378Oc, layoutParams);
        if (view$OnClickListenerC5650T1 != null) {
            C5245MS.A0J(view$OnClickListenerC5650T1);
            linearLayout.addView(view$OnClickListenerC5650T1, layoutParams);
            if (TextUtils.isEmpty(view$OnClickListenerC5650T1.getText())) {
                C5245MS.A0H(view$OnClickListenerC5650T1);
            }
        }
        return linearLayout;
    }

    private final EnumC5452Pp A02() {
        if (!this.A02.A00().isEmpty()) {
            return EnumC5452Pp.A04;
        }
        EnumC5452Pp enumC5452Pp = EnumC5452Pp.A03;
        String[] strArr = A06;
        if (strArr[3].charAt(8) != strArr[7].charAt(8)) {
            A06[4] = "qwlEjiYhEcV8j1J";
            return enumC5452Pp;
        }
        throw new RuntimeException();
    }

    public final Pair<EnumC5452Pp, View> A03(@Nullable View$OnClickListenerC5650T1 view$OnClickListenerC5650T1) {
        View A00;
        EnumC5452Pp A02 = A02();
        if (C5451Po.A00[A02.ordinal()] != 1) {
            A00 = A01(view$OnClickListenerC5650T1);
        } else {
            A00 = A00();
        }
        C5090Jr.A04(A00, this.A05, EnumC5087Jo.A0S);
        return new Pair<>(A02, A00);
    }
}
