package com.facebook.ads.redexgen.p036X;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.d4 */
/* loaded from: assets/audience_network.dex */
public class C6266d4 implements InterfaceC39620v {
    public static byte[] A02;
    public static String[] A03 = {"7FIKHU9lgq27", "AgQqvAltXhi1bYF8zppFCZ", "CRAmwsbXNtyv0vmCJJ9qOPCwxUiND3E6", "ItQqdqoRYHMWKQzbVRTeHzNwEAi", "W2szVhKnaW", "HNVKE5hkEvipBMdeuLWXlSQ07SgK2Jmi", "9NOG2BA2dnlUEqMWgY53wMXC47FXKBrl", "EneshuO9jiHnlHF2bjWwp7WA0EKVaMOF"};
    public final /* synthetic */ C4821FQ A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 16);
            if (A03[2].charAt(4) == 'y') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "2VG06oAYTcRzKBDE7gWFCU36hzL5px1b";
            strArr[7] = "j1xG2z3v9jq0UO66H2WqYNbpklLAu6IG";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{114, 118, 118, 113, 110, -97, 113, -92, -124, -93, -80, -80, -89, -76, 98, -85, -81, -78, -76, -89, -75, -75, -85, -79, -80, 98, -88, -85, -76, -89, -90, -118, -119, 93, 124, -119, -119, Byte.MIN_VALUE, -115, 103, -118, -126, -126, -124, -119, -126, 100, -120, -117, -115, Byte.MIN_VALUE, -114, -114, -124, -118, -119};
    }

    static {
        A01();
    }

    public C6266d4(C4821FQ c4821fq, Runnable runnable) {
        this.A00 = c4821fq;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39620v
    public final void AAC(C6301dd c6301dd) {
        C4780El c4780El;
        c4780El = this.A00.A01;
        c4780El.A0D().A3j();
        this.A00.A06.A0C();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39620v
    public final void AAD(C6301dd c6301dd, View view) {
        C4780El c4780El;
        c4780El = this.A00.A01;
        c4780El.A0D().A3i(c6301dd == ((AbstractC6264d2) this.A00).A00);
        if (c6301dd != ((AbstractC6264d2) this.A00).A00) {
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        InterfaceC39540n interfaceC39540n = ((AbstractC6264d2) this.A00).A01;
        C4821FQ c4821fq = this.A00;
        ((AbstractC6264d2) c4821fq).A01 = c6301dd;
        c4821fq.A00 = view;
        if (!this.A00.A0C) {
            this.A00.A06.A0F(c6301dd);
            return;
        }
        this.A00.A06.A0E(view);
        this.A00.A0K(interfaceC39540n);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39620v
    public final void AAE(C6301dd c6301dd) {
        C4780El c4780El;
        C5128KV.A05(A00(31, 25, 11), A00(8, 23, 50), A00(0, 8, 46));
        c4780El = this.A00.A01;
        c4780El.A0D().A3l();
        this.A00.A06.A0D();
        this.A00.A0I();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39620v
    public final void ABC(C6301dd c6301dd, C5115KH c5115kh) {
        C4780El c4780El;
        c4780El = this.A00.A01;
        c4780El.A0D().A3k(c6301dd == ((AbstractC6264d2) this.A00).A00, c5115kh.A03().getErrorCode());
        if (c6301dd != ((AbstractC6264d2) this.A00).A00) {
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        this.A00.A0K(c6301dd);
        this.A00.AAi(c5115kh);
    }
}
