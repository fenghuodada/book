package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1n */
/* loaded from: assets/audience_network.dex */
public final class C40161n {
    public static byte[] A00;
    public static String[] A01 = {"kdNZsDbIr2FjUgQ6", "G4tbE8YXKkBHtbRzjHgF1iVs8BhQX3ki", "rgsd1nh14jUfY0oEDkCzVbJlkUwrdBXO", "6d8i19T6TQ9xRiUYh6SOmARBfT83lkdi", "2FsjHYpAfMpiihTdUse", "xtyrzkpFCSmXtl0pVvZtRxgukiiALNOU", "PnjWz3Ubzat8tEiN6RTB47L4MZQANY1H", "IONaBzwOxfylvpW8Ch"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(12) != strArr[5].charAt(12)) {
                break;
            }
            A01[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            byte b = (byte) ((copyOfRange[i4] - i3) - 100);
            if (A01[0].length() == 15) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[3] = "fUzr4JaNgjTtoWHz8k6HkVts9HpSP1Qi";
            strArr2[1] = "zuQx1GaumRIGoFj6MrcQJkCLkICnzrhi";
            copyOfRange[i4] = b;
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A00 = new byte[]{-88, -30, -18, -25, -26};
    }

    static {
        A01();
    }

    public static void A02(C5953Xy c5953Xy, AbstractC397518 abstractC397518, boolean z, InterfaceC40141l interfaceC40141l) {
        if (!C5064JR.A1S(c5953Xy)) {
            C43657U c43657u = new C43657U(c5953Xy);
            C39991W A06 = abstractC397518.A0O().A0D().A06();
            c43657u.A0d(new C5088Jp(abstractC397518.A0U(), c5953Xy.A08()));
            if (A06 == null) {
                interfaceC40141l.ABm(AdError.CACHE_ERROR);
                return;
            } else if (A06.A0J()) {
                interfaceC40141l.ABn();
                if (A01[2].charAt(7) != '1') {
                    throw new RuntimeException();
                }
                A01[0] = "84TqyqDRqUmJCVM8";
                return;
            } else {
                C43617Q c43617q = new C43617Q(A06.A0E(), abstractC397518.A0Z(), abstractC397518.A0Y());
                c43617q.A04 = true;
                if (C5064JR.A1L(c5953Xy)) {
                    c43617q.A03 = A00(0, 5, 22);
                }
                int i = C40131k.A00[A06.A09().ordinal()];
                if (i == 1 || i == 2) {
                    c43657u.A0X(c43617q);
                }
                c43657u.A0b(new C43637S(abstractC397518.A0R().A01(), -1, -1, abstractC397518.A0Z(), abstractC397518.A0Y()));
                c43657u.A0b(new C43637S(A06.A0D(), -1, -1, abstractC397518.A0Z(), abstractC397518.A0Y()));
                c43657u.A0W(new C6270d8(c5953Xy, interfaceC40141l, c43657u, A06, z), new C43587N(abstractC397518.A0Z(), abstractC397518.A0Y()));
                return;
            }
        }
        interfaceC40141l.ABn();
    }
}
