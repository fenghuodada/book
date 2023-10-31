package com.facebook.ads.redexgen.p036X;

import android.content.Intent;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.56 */
/* loaded from: assets/audience_network.dex */
public class C421856 {
    public static byte[] A04;
    public static String[] A05 = {"3Lm1xoiqmVz", "7", "e", "S", "b9tO4", "WiIyJoqu6MmGONLqJ4ol82uO906afJVw", "5gKa3hz9VQf", "ZFmxpCIwvmg"};
    public final Intent A00;
    public final C422159 A01;
    public final C5953Xy A02;
    public final InterfaceC5080Jh A03;

    public static String A0O(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A04 = new byte[]{51, 54, 13, 54, 51, 38, 51, 13, 48, 39, 60, 54, 62, 55, 18, 29, 8, 21, 10, 25, 61, 24, 56, 29, 8, 29, 62, 9, 18, 24, 16, 25, 73, 94, 76, 90, 73, 95, 94, 95, 109, 82, 95, 94, 84, 122, 95, Byte.MAX_VALUE, 90, 79, 90, 121, 78, 85, 95, 87, 94, 69, 90, 87, 86, 92, 108, 71, 90, 94, 86, 108, 67, 92, 95, 95, 90, 93, 84, 108, 90, 93, 71, 86, 65, 69, 82, 95};
    }

    static {
        A0P();
    }

    public C421856(C422159 c422159, Intent intent, InterfaceC5080Jh interfaceC5080Jh, C5953Xy c5953Xy) {
        this.A01 = c422159;
        this.A00 = intent;
        this.A03 = interfaceC5080Jh;
        this.A02 = c5953Xy;
    }

    private C6281dJ A00() {
        return (C6281dJ) this.A00.getSerializableExtra(A0O(0, 14, 29));
    }

    public InterfaceC5270Mr A02() {
        C422159 c422159 = this.A01;
        return new C5687Td(c422159, this.A02, this.A03, new C6195bs(c422159));
    }

    public InterfaceC5270Mr A03() {
        return new C4509A2(this.A02, this.A03, new C6195bs(this.A01), A00(), new C5670TL(), 1);
    }

    public InterfaceC5270Mr A04() {
        return new C4509A2(this.A02, this.A03, new C6195bs(this.A01), (C6277dF) this.A00.getSerializableExtra(A0O(32, 25, 116)), new C5669TK(), 0);
    }

    public InterfaceC5270Mr A05() {
        AbstractC397518 abstractC397518 = (AbstractC397518) this.A00.getSerializableExtra(A0O(14, 18, 51));
        if (abstractC397518 == null) {
            return null;
        }
        String A0Z = abstractC397518.A0Z();
        String[] strArr = A05;
        if (strArr[2].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[4] = "1M84Q";
        strArr2[6] = "leaDHdAWfWg";
        C5411PA A02 = C5412PB.A02(A0Z);
        if (A02 == null) {
            return null;
        }
        return new C5624Sb(this.A02, new C6195bs(this.A01), A02);
    }

    public InterfaceC5270Mr A06() {
        if (C5064JR.A21(this.A02)) {
            C5953Xy c5953Xy = this.A02;
            return new C44078L(c5953Xy, this.A03, new C43657U(c5953Xy), new C6195bs(this.A01), A00());
        }
        C5953Xy c5953Xy2 = this.A02;
        return new C44068K(c5953Xy2, this.A03, new C43657U(c5953Xy2), new C6195bs(this.A01), A00());
    }

    public InterfaceC5270Mr A07() {
        return new C44599D(this.A02, new C5670TL(), this.A03, A00(), new C43657U(this.A02), new C6195bs(this.A01));
    }

    public InterfaceC5270Mr A08() {
        return new C5673TO(this.A02, this.A03, new C6195bs(this.A01), A00(), null, new C5670TL());
    }

    public InterfaceC5270Mr A09() {
        return new C44088N(this.A02, new C5670TL(), this.A03, A00(), new C43657U(this.A02), new C6195bs(this.A01));
    }

    public InterfaceC5270Mr A0A() {
        return new C44088N(this.A02, new C5669TK(), this.A03, (C6277dF) this.A00.getSerializableExtra(A0O(32, 25, 116)), new C43657U(this.A02), new C4802F7(this.A01));
    }

    public InterfaceC5270Mr A0B() {
        C6277dF c6277dF = (C6277dF) this.A00.getSerializableExtra(A0O(32, 25, 116));
        return new C5673TO(this.A02, this.A03, new C4802F7(this.A01), c6277dF, c6277dF.A0a(), new C5669TK());
    }

    public InterfaceC5270Mr A0C(RelativeLayout relativeLayout) {
        C5671TM c5671tm = new C5671TM(this.A02, new C6194br(this), this.A03, new C6195bs(this.A01));
        c5671tm.A05(relativeLayout);
        c5671tm.A04(this.A00.getIntExtra(A0O(57, 27, 124), 200));
        C5245MS.A0M(relativeLayout, -16777216);
        return c5671tm;
    }
}
