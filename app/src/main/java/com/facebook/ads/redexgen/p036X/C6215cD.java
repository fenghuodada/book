package com.facebook.ads.redexgen.p036X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cD */
/* loaded from: assets/audience_network.dex */
public final class C6215cD implements InterfaceC41614B {
    public static byte[] A08;
    public static String[] A09 = {"X1JWoRd1RTsi5LXg3YfkE890Z0SkAp6s", "8cHG76lMVFwKxBGRg2kgut24eHhxfbd", "G9TzZa55JFGh4eGgvGtqHGY1m3qrW6LM", "T7A4lgHZzGr7V1uQcw7LfDSO4lerGRH7", "wT7nveBXif1G6UL4LkiEJi9kfhK", "XR1Jqmc9zxsTs7lfyBsyi3NvUHLKhP3K", "pVA6ZWYUVwE4UScIoRBBosOqE3FsfWwK", "nWmw"};
    public int A00;
    public InterfaceC40692e<C41393o> A01;
    public final InterfaceC41383n A02;
    public final C41624C A03;
    public final Runnable A04;
    public final ArrayList<C41393o> A05;
    public final ArrayList<C41393o> A06;
    public final boolean A07;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-100, -75, -78, -75, -74, -66, -75, 103, -68, -73, -85, -88, -69, -84, 103, -74, -73, 103, -69, -64, -73, -84, 103, -83, -74, -71, 103, -44, -45, -47, -34, -123, -41, -54, -46, -44, -37, -54, -123, -58, -45, -55, -123, -38, -43, -55, -58, -39, -54, -123, -44, -43, -40, -123, -56, -58, -45, -123, -57, -54, -123, -55, -50, -40, -43, -58, -39, -56, -51, -54, -55, -123, -50, -45, -123, -53, -50, -41, -40, -39, -123, -43, -58, -40, -40, -24, -23, -103, -20, -31, -24, -18, -27, -35, -103, -37, -34, -103, -21, -34, -26, -24, -17, -34, -103, -24, -21, -103, -18, -23, -35, -38, -19, -34, -89, 30, 19, 26, 32, 23, 15, -53, 25, 26, 31, -53, 15, 20, 30, 27, 12, 31, 14, 19, -53, 12, 15, 15, -53, 26, 29, -53, 24, 26, 33, 16, -53, 17, 26, 29, -53, 27, 29, 16, -53, 23, 12, 36, 26, 32, 31};
    }

    static {
        A03();
    }

    public C6215cD(InterfaceC41383n interfaceC41383n) {
        this(interfaceC41383n, false);
    }

    public C6215cD(InterfaceC41383n interfaceC41383n, boolean z) {
        this.A01 = new C6229cT(30);
        this.A05 = new ArrayList<>();
        this.A06 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = interfaceC41383n;
        this.A07 = z;
        this.A03 = new C41624C(this);
    }

    private int A00(int i, int start) {
        int i2;
        int i3;
        for (int end = this.A06.size() - 1; end >= 0; end--) {
            C41393o c41393o = this.A06.get(end);
            if (c41393o.A00 == 8) {
                if (c41393o.A02 < c41393o.A01) {
                    i2 = c41393o.A02;
                    i3 = c41393o.A01;
                } else {
                    i2 = c41393o.A01;
                    i3 = c41393o.A02;
                }
                if (i >= i2 && i <= i3) {
                    if (i2 == c41393o.A02) {
                        if (start == 1) {
                            c41393o.A01++;
                        } else if (start == 2) {
                            c41393o.A01--;
                        }
                        i++;
                    } else {
                        if (start == 1) {
                            c41393o.A02++;
                        } else if (start == 2) {
                            c41393o.A02--;
                        }
                        i--;
                    }
                } else if (i < c41393o.A02) {
                    if (start == 1) {
                        c41393o.A02++;
                        c41393o.A01++;
                    } else if (start == 2) {
                        c41393o.A02--;
                        c41393o.A01--;
                    }
                }
            } else if (c41393o.A02 <= i) {
                if (c41393o.A00 == 1) {
                    int i4 = c41393o.A01;
                    if (A09[7].length() != 4) {
                        throw new RuntimeException();
                    }
                    A09[7] = "N0sU";
                    i -= i4;
                } else if (c41393o.A00 == 2) {
                    i += c41393o.A01;
                }
            } else if (start == 1) {
                c41393o.A02++;
            } else if (start == 2) {
                c41393o.A02--;
            }
        }
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            C41393o c41393o2 = this.A06.get(size);
            if (c41393o2.A00 == 8) {
                if (c41393o2.A01 == c41393o2.A02 || c41393o2.A01 < 0) {
                    this.A06.remove(size);
                    ADh(c41393o2);
                }
            } else if (c41393o2.A01 <= 0) {
                this.A06.remove(size);
                ADh(c41393o2);
            }
        }
        return i;
    }

    private final int A01(int i, int i2) {
        int size = this.A06.size();
        while (i2 < size) {
            C41393o c41393o = this.A06.get(i2);
            if (c41393o.A00 == 8) {
                if (c41393o.A02 == i) {
                    i = c41393o.A01;
                } else {
                    if (c41393o.A02 < i) {
                        i--;
                    }
                    if (c41393o.A01 <= i) {
                        i++;
                    }
                }
            } else if (c41393o.A02 > i) {
                continue;
            } else if (c41393o.A00 == 2) {
                if (i < c41393o.A02 + c41393o.A01) {
                    return -1;
                }
                i -= c41393o.A01;
            } else {
                int i3 = c41393o.A00;
                String[] strArr = A09;
                if (strArr[6].charAt(31) != strArr[5].charAt(31)) {
                    throw new RuntimeException();
                }
                A09[1] = "6d2Cvy1MfGwOem3AHh21iiz4RwVuOhP";
                if (i3 == 1) {
                    i += c41393o.A01;
                }
            }
            i2++;
        }
        return i;
    }

    private void A04(C41393o c41393o) {
        A09(c41393o);
    }

    private void A05(C41393o c41393o) {
        A09(c41393o);
    }

    private void A06(C41393o c41393o) {
        int tmpEnd = c41393o.A02;
        int type = 0;
        int position = c41393o.A02 + c41393o.A01;
        char c = 65535;
        int i = c41393o.A02;
        while (i < position) {
            boolean z = false;
            if (this.A02.A5Q(i) != null || A0C(i)) {
                if (c == 0) {
                    A08(A9n(2, tmpEnd, type, null));
                    z = true;
                }
                c = 1;
            } else {
                if (c == 1) {
                    C41393o newOp = A9n(2, tmpEnd, type, null);
                    A09(newOp);
                    z = true;
                }
                c = 0;
            }
            if (z) {
                i -= type;
                position -= type;
                type = 1;
            } else {
                type++;
            }
            i++;
        }
        if (type != c41393o.A01) {
            ADh(c41393o);
            c41393o = A9n(2, tmpEnd, type, null);
        }
        if (c == 0) {
            A08(c41393o);
        } else {
            A09(c41393o);
        }
    }

    private void A07(C41393o c41393o) {
        int tmpEnd = c41393o.A02;
        int type = 0;
        int position = c41393o.A02 + c41393o.A01;
        char c = 65535;
        int i = c41393o.A02;
        while (true) {
            String[] strArr = A09;
            if (strArr[6].charAt(31) != strArr[5].charAt(31)) {
                throw new RuntimeException();
            }
            A09[0] = "QVMb2fRXyzWHiAZPpRD1aZXDVthvAAWC";
            if (i < position) {
                if (this.A02.A5Q(i) != null || A0C(i)) {
                    if (c == 0) {
                        A08(A9n(4, tmpEnd, type, c41393o.A03));
                        type = 0;
                        tmpEnd = i;
                    }
                    c = 1;
                } else {
                    if (c == 1) {
                        C41393o newOp = A9n(4, tmpEnd, type, c41393o.A03);
                        A09(newOp);
                        type = 0;
                        tmpEnd = i;
                    }
                    c = 0;
                }
                type++;
                i++;
            } else {
                if (type != c41393o.A01) {
                    Object obj = c41393o.A03;
                    ADh(c41393o);
                    c41393o = A9n(4, tmpEnd, type, obj);
                }
                if (c == 0) {
                    A08(c41393o);
                    return;
                } else {
                    A09(c41393o);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(com.facebook.ads.redexgen.p036X.C41393o r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C6215cD.A08(com.facebook.ads.redexgen.X.3o):void");
    }

    private void A09(C41393o c41393o) {
        this.A06.add(c41393o);
        int i = c41393o.A00;
        if (i == 1) {
            this.A02.A9o(c41393o.A02, c41393o.A01);
        } else if (i == 2) {
            this.A02.A9r(c41393o.A02, c41393o.A01);
        } else if (i == 4) {
            this.A02.A9U(c41393o.A02, c41393o.A01, c41393o.A03);
        } else if (i == 8) {
            this.A02.A9p(c41393o.A02, c41393o.A01);
        } else {
            throw new IllegalArgumentException(A02(0, 27, 5) + c41393o);
        }
    }

    private final void A0A(C41393o c41393o, int i) {
        this.A02.AAV(c41393o);
        int i2 = c41393o.A00;
        if (i2 == 2) {
            this.A02.A9q(i, c41393o.A01);
        } else if (i2 == 4) {
            this.A02.A9U(i, c41393o.A01, c41393o.A03);
        } else {
            throw new IllegalArgumentException(A02(27, 58, 35));
        }
    }

    private final void A0B(List<C41393o> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ADh(list.get(i));
        }
        list.clear();
    }

    private boolean A0C(int i) {
        int size = this.A06.size();
        for (int pos = 0; pos < size; pos++) {
            C41393o c41393o = this.A06.get(pos);
            if (c41393o.A00 == 8) {
                if (A01(c41393o.A01, pos + 1) == i) {
                    return true;
                }
            } else {
                int i2 = c41393o.A00;
                if (A09[4].length() != 28) {
                    A09[7] = "h3FT";
                    if (i2 == 1) {
                        int i3 = c41393o.A02 + c41393o.A01;
                        for (int i4 = c41393o.A02; i4 < i3; i4++) {
                            if (A01(i4, pos + 1) == i) {
                                return true;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return false;
    }

    public final int A0D(int i) {
        return A01(i, 0);
    }

    public final int A0E(int i) {
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            C41393o c41393o = this.A05.get(i2);
            int i3 = c41393o.A00;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        if (c41393o.A02 == i) {
                            i = c41393o.A01;
                        } else {
                            if (c41393o.A02 < i) {
                                i--;
                            }
                            if (c41393o.A01 <= i) {
                                i++;
                            }
                        }
                    }
                } else if (c41393o.A02 > i) {
                    continue;
                } else if (c41393o.A02 + c41393o.A01 > i) {
                    return -1;
                } else {
                    i -= c41393o.A01;
                }
            } else if (c41393o.A02 <= i) {
                i += c41393o.A01;
            }
        }
        return i;
    }

    public final void A0F() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A02.AAX(this.A06.get(i));
        }
        A0B(this.A06);
        this.A00 = 0;
    }

    public final void A0G() {
        A0F();
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            C41393o c41393o = this.A05.get(i);
            int i2 = c41393o.A00;
            if (i2 == 1) {
                this.A02.AAX(c41393o);
                InterfaceC41383n interfaceC41383n = this.A02;
                int i3 = c41393o.A02;
                int i4 = c41393o.A01;
                interfaceC41383n.A9o(i3, i4);
            } else if (i2 == 2) {
                this.A02.AAX(c41393o);
                InterfaceC41383n interfaceC41383n2 = this.A02;
                int i5 = c41393o.A02;
                int i6 = c41393o.A01;
                if (A09[0].charAt(28) != 'A') {
                    A09[0] = "CM7MK7KhSxDopOj0YrHNMoPSB3hYAvlM";
                    interfaceC41383n2.A9q(i5, i6);
                } else {
                    A09[0] = "0a4GBd0juwjU6ZOPGBL8pgIRsQZTAwEC";
                    interfaceC41383n2.A9q(i5, i6);
                }
            } else if (i2 == 4) {
                this.A02.AAX(c41393o);
                InterfaceC41383n interfaceC41383n3 = this.A02;
                int i7 = c41393o.A02;
                int i8 = c41393o.A01;
                if (A09[0].charAt(28) != 'A') {
                    throw new RuntimeException();
                }
                A09[1] = "6Qpi3zwbHCTXm3nhA4JhLro11ECL3LU";
                interfaceC41383n3.A9U(i7, i8, c41393o.A03);
            } else if (i2 == 8) {
                this.A02.AAX(c41393o);
                InterfaceC41383n interfaceC41383n4 = this.A02;
                int i9 = c41393o.A02;
                int i10 = c41393o.A01;
                interfaceC41383n4.A9p(i9, i10);
            }
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
        A0B(this.A05);
        this.A00 = 0;
    }

    public final void A0H() {
        this.A03.A05(this.A05);
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            C41393o c41393o = this.A05.get(i);
            int i2 = c41393o.A00;
            String[] strArr = A09;
            String str = strArr[6];
            String str2 = strArr[5];
            int i3 = str.charAt(31);
            if (i3 != str2.charAt(31)) {
                throw new RuntimeException();
            }
            A09[1] = "1BDdKJQJlsgxETOK14Gjs1hC7fjbuKK";
            if (i2 == 1) {
                A04(c41393o);
            } else if (i2 == 2) {
                A06(c41393o);
            } else if (i2 == 4) {
                A07(c41393o);
            } else if (i2 == 8) {
                A05(c41393o);
            }
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.A05.clear();
    }

    public final void A0I() {
        A0B(this.A05);
        A0B(this.A06);
        this.A00 = 0;
    }

    public final boolean A0J() {
        return this.A05.size() > 0;
    }

    public final boolean A0K() {
        return (this.A06.isEmpty() || this.A05.isEmpty()) ? false : true;
    }

    public final boolean A0L(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC41614B
    public final C41393o A9n(int i, int i2, int i3, Object obj) {
        C41393o A2O = this.A01.A2O();
        if (A2O == null) {
            return new C41393o(i, i2, i3, obj);
        }
        A2O.A00 = i;
        A2O.A02 = i2;
        A2O.A01 = i3;
        A2O.A03 = obj;
        return A2O;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC41614B
    public final void ADh(C41393o c41393o) {
        if (!this.A07) {
            c41393o.A03 = null;
            this.A01.ADp(c41393o);
        }
    }
}
