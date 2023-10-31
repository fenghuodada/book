package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cy */
/* loaded from: assets/audience_network.dex */
public class C6260cy implements InterfaceC396912 {
    public static byte[] A07;
    public static String[] A08 = {"NdU3dTBV9vpPy6YybD2Qky8Xp9oiymUK", "iGXlqhzjj4re98AW13mRmUxQt0ip7heY", "i4JUsV98mtHDxTx4GI", "uX4rqc35PVKyGMlab4Ievks4AeXTKuCR", "rLO13ppjW7wMy", "YX8F9O1K3gbo5OniWABn3Un2bmHHQded", "vQnjhTu4uDmsPPd6tCmWM2PRV3nZ7tVA", "6doRqStA7fW6oocsKlayDSgQ6jqa5ScM"};
    public final /* synthetic */ long A03;
    public final /* synthetic */ C4819FO A04;
    public final /* synthetic */ C44619F A05;
    public final /* synthetic */ Runnable A06;
    public boolean A02 = false;
    public boolean A01 = false;
    public boolean A00 = false;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{57, 46, 46, 51, 46, 67, 93, 73};
    }

    static {
        A01();
    }

    public C6260cy(C4819FO c4819fo, Runnable runnable, long j, C44619F c44619f) {
        this.A04 = c4819fo;
        this.A06 = runnable;
        this.A03 = j;
        this.A05 = c44619f;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC396912
    public final void ABa(C6298da c6298da) {
        if (!this.A00) {
            this.A00 = true;
            this.A04.A05(this.A05.A03(EnumC44659J.A03), null);
        }
        if (this.A04.A06 != null) {
            this.A04.A06.A0C();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC396912
    public final void ABb(C6298da c6298da) {
        Map A01;
        if (c6298da != this.A04.A00) {
            return;
        }
        this.A04.A0C().removeCallbacks(this.A06);
        C4819FO c4819fo = this.A04;
        c4819fo.A01 = c6298da;
        c4819fo.A06.A0F(c6298da);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            this.A04.A05(this.A05.A03(EnumC44659J.A05), A01);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC396912
    public final void ABc(C6298da c6298da) {
        if (!this.A01) {
            this.A01 = true;
            C4819FO c4819fo = this.A04;
            C44619F c44619f = this.A05;
            EnumC44659J enumC44659J = EnumC44659J.A04;
            String[] strArr = A08;
            if (strArr[3].charAt(16) != strArr[0].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "w5hMaJohNUScvyTMb6YchiksjKW7iU2S";
            strArr2[0] = "lwejxTPFHVjkcDrib15s3w6szJ9sWeR6";
            c4819fo.A05(c44619f.A03(enumC44659J), null);
        }
        this.A04.A0I();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC396912
    public final void ABe(C6298da c6298da, C5115KH c5115kh) {
        Map A01;
        if (c6298da != this.A04.A00) {
            return;
        }
        this.A04.A0C().removeCallbacks(this.A06);
        this.A04.A0K(c6298da);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            A01.put(A00(0, 5, 58), String.valueOf(c5115kh.A03().getErrorCode()));
            A01.put(A00(5, 3, 72), String.valueOf(c5115kh.A04()));
            this.A04.A05(this.A05.A03(EnumC44659J.A05), A01);
        }
        this.A04.AAi(c5115kh);
    }
}
