package com.facebook.ads.redexgen.p036X;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.eO */
/* loaded from: assets/audience_network.dex */
public final class C6343eO {
    @Nullable
    public InterfaceC6346eR A00;
    @Nullable
    public InterfaceC6344eP A01;
    public C6331eC A02;
    public final InterfaceC6353eY A03;
    @Nullable
    public final InterfaceC6345eQ A04;

    public C6343eO(InterfaceC6353eY interfaceC6353eY, @Nullable InterfaceC6345eQ interfaceC6345eQ) {
        this.A03 = interfaceC6353eY;
        this.A04 = interfaceC6345eQ;
    }

    public static C6343eO A00() {
        return new C6343eO(new C4879GO(), null);
    }

    private void A01(AbstractC6347eS abstractC6347eS, InterfaceC6351eW interfaceC6351eW, InterfaceC4876GL interfaceC4876GL) {
        this.A02 = C6331eC.A00(abstractC6347eS, interfaceC6351eW, interfaceC4876GL);
        InterfaceC6346eR interfaceC6346eR = this.A00;
        if (interfaceC6346eR != null) {
            this.A02.A03(interfaceC6346eR);
        }
        InterfaceC6344eP interfaceC6344eP = this.A01;
        if (interfaceC6344eP != null) {
            this.A02.A04(interfaceC6344eP);
        }
    }

    public final void A02(View view) {
        this.A02.A01(view);
    }

    public final void A03(View view, C6349eU c6349eU) {
        this.A02.A02(view, c6349eU);
    }

    public final void A04(AbstractC6347eS abstractC6347eS, View view) {
        C4878GN c4878gn = new C4878GN(view, this.A03);
        final InterfaceC6345eQ interfaceC6345eQ = this.A04;
        A01(abstractC6347eS, c4878gn, new InterfaceC4876GL(interfaceC6345eQ) { // from class: com.facebook.ads.redexgen.X.3g
            public static byte[] A07;
            public static String[] A08 = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", "E", "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
            public static final String A09;
            public long A00;
            @Nullable
            public InterfaceC6346eR A01;
            @Nullable
            public final InterfaceC6345eQ A02;
            public final Map<String, C6335eG> A06 = new HashMap();
            public final C6336eH A04 = new C6336eH();
            public final C6336eH A03 = new C6336eH();
            public final List<Rect> A05 = new ArrayList(1);

            public static String A02(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
                }
                return new String(copyOfRange);
            }

            public static void A03() {
                A07 = new byte[]{41, 21, 20, 14, 93, 11, 20, 24, 10, 13, 18, 20, 19, 9, 93, 21, 28, 14, 93, 19, 18, 9, 93, 31, 24, 24, 19, 93, 16, 24, 28, 14, 8, 15, 24, 25, 93, 18, 15, 93, 20, 14, 93, 28, 93, 26, 15, 18, 8, 13, 93, 10, 21, 20, 30, 21, 93, 10, 20, 17, 17, 93, 19, 24, 11, 24, 15, 93, 15, 24, 9, 8, 15, 19, 93, 28, 93, 16, 24, 28, 14, 8, 15, 24, 16, 24, 19, 9, 93, 14, 20, 19, 30, 24, 93, 20, 9, 90, 14, 93, 16, 28, 25, 24, 93, 8, 13, 93, 18, 27, 93, 14, 8, 31, 11, 20, 24, 10, 14, 93, 9, 21, 28, 9, 93, 30, 18, 8, 17, 25, 93, 31, 24, 93, 18, 27, 27, 14, 30, 15, 24, 24, 19, 118, 125, 111, 75, 123, 121, 118, Utf8.REPLACEMENT_BYTE, 36, 61, 61, 113, 39, 56, 52, 38, 113, 33, 35, 62, 33, 52, 35, 37, 40, 113, 55, 62, 35, 113, 35, 52, 60, 62, 39, 52, 53, 113, 56, 37, 52, 60, 113, 125, 97, 104, 122, 92, 107, 126, 97, 124, 122};
            }

            static {
                A03();
                A09 = C41313g.class.getSimpleName();
            }

            {
                this.A02 = interfaceC6345eQ;
            }

            public static Rect A00(@Nullable C6335eG c6335eG) {
                Rect rect;
                Rect rect2;
                Rect rect3;
                Rect rect4;
                Rect rect5;
                if (c6335eG != null) {
                    rect = c6335eG.A02;
                    if (rect.top != Integer.MIN_VALUE) {
                        rect2 = c6335eG.A02;
                        if (rect2.left != Integer.MIN_VALUE) {
                            rect3 = c6335eG.A02;
                            String[] strArr = A08;
                            if (strArr[1].length() == strArr[6].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A08;
                            strArr2[1] = "p";
                            strArr2[6] = "Kr6mbDoiLKwWSgNyXDF2oJW";
                            if (rect3.right != Integer.MIN_VALUE) {
                                rect4 = c6335eG.A02;
                                if (rect4.bottom != Integer.MIN_VALUE) {
                                    rect5 = c6335eG.A02;
                                    return rect5;
                                }
                            }
                        }
                    }
                }
                throw new IllegalStateException(A02(0, 143, 38));
            }

            private C6335eG A01(C6349eU c6349eU, Rect rect, Rect rect2) {
                boolean A06;
                Rect rect3;
                List list;
                C6335eG c6335eG = this.A06.get(c6349eU.A03);
                A06 = this.A04.A06(c6349eU);
                if (A06) {
                    if (c6335eG != null) {
                        c6335eG.A01 = EnumC6339eK.A04;
                    } else {
                        c6335eG = C6335eG.A03(this.A00);
                        this.A06.put(c6349eU.A03, c6335eG);
                    }
                }
                rect3 = c6335eG.A02;
                rect3.set(rect2);
                list = c6335eG.A03;
                list.add(new Rect(rect));
                return c6335eG;
            }

            private void A04(C6336eH c6336eH) {
                Collection<C6349eU> A01;
                List list;
                A01 = c6336eH.A01();
                for (C6349eU c6349eU : A01) {
                    C6335eG c6335eG = this.A06.get(c6349eU.A03);
                    if (c6335eG == null) {
                        InterfaceC6345eQ interfaceC6345eQ2 = this.A02;
                        String[] strArr = A08;
                        if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A08;
                        strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
                        strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
                        if (interfaceC6345eQ2 != null) {
                            String str = A02(150, 36, 10) + c6349eU.A03;
                            throw new NullPointerException(A02(186, 10, 85));
                        }
                    } else {
                        c6335eG.A01 = EnumC6339eK.A03;
                        list = c6335eG.A03;
                        list.clear();
                        c6349eU.A03(this);
                    }
                }
            }

            private void A05(C6336eH c6336eH) {
                Collection<C6349eU> A00;
                A00 = c6336eH.A00();
                for (C6349eU c6349eU : A00) {
                    c6349eU.A03(this);
                }
            }

            @Override // com.facebook.ads.redexgen.p036X.InterfaceC4876GL
            public final void A3J(C6349eU c6349eU, Rect rect, Rect rect2) {
                boolean A06;
                List list;
                Rect rect3;
                List list2;
                A01(c6349eU, rect, rect2);
                C6349eU c6349eU2 = c6349eU.A00;
                if (c6349eU2 == C6349eU.A06) {
                    return;
                }
                A06 = this.A03.A06(c6349eU2);
                C6335eG c6335eG = this.A06.get(c6349eU2.A03);
                if (A06) {
                    if (c6335eG == null) {
                        c6335eG = C6335eG.A03(this.A00);
                        rect3 = c6335eG.A02;
                        rect3.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                        this.A06.put(c6349eU2.A03, c6335eG);
                    } else {
                        list2 = c6335eG.A03;
                        list2.clear();
                        c6335eG.A01 = EnumC6339eK.A04;
                    }
                }
                list = c6335eG.A03;
                list.add(new Rect(rect));
            }

            @Override // com.facebook.ads.redexgen.p036X.InterfaceC4876GL
            public final void A3q(long j, List<Rect> list) {
                Collection<C6349eU> A01;
                Collection<C6349eU> A012;
                List list2;
                this.A00 = j;
                this.A05.clear();
                for (Rect rect : list) {
                    this.A05.add(new Rect(rect));
                }
                A01 = this.A04.A01();
                for (C6349eU c6349eU : A01) {
                    this.A06.remove(c6349eU.A03);
                }
                A012 = this.A03.A01();
                for (C6349eU c6349eU2 : A012) {
                    this.A06.remove(c6349eU2.A03);
                }
                for (C6335eG c6335eG : this.A06.values()) {
                    list2 = c6335eG.A03;
                    list2.clear();
                }
                this.A04.A04();
                this.A03.A04();
            }

            @Override // com.facebook.ads.redexgen.p036X.InterfaceC4876GL
            public final void A5E() {
                Collection A00;
                Collection A002;
                A05(this.A04);
                A04(this.A04);
                A05(this.A03);
                A04(this.A03);
                if (this.A01 != null) {
                    String obj = toString();
                    List<Rect> list = this.A05;
                    A00 = this.A04.A00();
                    A002 = this.A03.A00();
                    new C6334eF(obj, this, list, A00, A002);
                    throw new NullPointerException(A02(143, 7, 67));
                }
            }

            @Override // com.facebook.ads.redexgen.p036X.InterfaceC6338eJ
            public final void A6j(C6349eU c6349eU, Rect rect) {
                List<Rect> list;
                rect.setEmpty();
                list = this.A06.get(c6349eU.A03).A03;
                for (Rect rect2 : list) {
                    rect.union(rect2);
                }
            }

            @Override // com.facebook.ads.redexgen.p036X.InterfaceC6338eJ
            public final EnumC6339eK A7o(C6349eU c6349eU) {
                EnumC6339eK enumC6339eK;
                enumC6339eK = this.A06.get(c6349eU.A03).A01;
                return enumC6339eK;
            }

            @Override // com.facebook.ads.redexgen.p036X.InterfaceC6338eJ
            public final void A7q(Rect rect) {
                rect.setEmpty();
                for (Rect rect2 : this.A05) {
                    rect.union(rect2);
                }
            }

            @Override // com.facebook.ads.redexgen.p036X.InterfaceC6338eJ
            public final float A7r(C6349eU c6349eU) {
                List<Rect> list;
                C6335eG c6335eG = this.A06.get(c6349eU.A03);
                if (c6335eG != null) {
                    Rect A00 = A00(c6335eG);
                    int height = A00.height() * A00.width();
                    int i = 0;
                    list = c6335eG.A03;
                    for (Rect rect : list) {
                        int totalPossibleArea = rect.height();
                        int totalVisibleArea = rect.width();
                        i += totalPossibleArea * totalVisibleArea;
                    }
                    return i / height;
                }
                return 0.0f;
            }

            @Override // com.facebook.ads.redexgen.p036X.InterfaceC4876GL
            public final void AEk(@Nullable InterfaceC6346eR interfaceC6346eR) {
                this.A01 = interfaceC6346eR;
            }
        });
    }
}
