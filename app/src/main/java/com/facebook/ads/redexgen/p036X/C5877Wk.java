package com.facebook.ads.redexgen.p036X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Wk */
/* loaded from: assets/audience_network.dex */
public final class C5877Wk extends AbstractC4671Cq {
    public static byte[] A01;
    public static String[] A02 = {"VtWAGSJcoPK1ZfQIT7kg70", "uvijoF7s18JkyzfLjC52JO", "UbwrKHlSsB9uBr4pHbp3GiHEJPcDIn2y", "M5IiKhc4TX4EBu4m9nlnlg4KrGcCYGid", "uZSF2L4tKNd9pS0dTFbwskwuDNdjgXB", "5", "JxfitwILt0nkPD2n3YPqqh4", "RXlbAzoXPs3VSjVZyf6us5"};
    public long A00;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{47, 62, 57, 42, Utf8.REPLACEMENT_BYTE, 34, 36, 37, 83, 82, 113, 89, 72, 93, 120, 93, 72, 93};
    }

    static {
        A0A();
    }

    public C5877Wk() {
        super(null);
        this.A00 = -9223372036854775807L;
    }

    public static int A00(C5022Ij c5022Ij) {
        return c5022Ij.A0E();
    }

    public static Boolean A01(C5022Ij c5022Ij) {
        return Boolean.valueOf(c5022Ij.A0E() == 1);
    }

    public static Double A02(C5022Ij c5022Ij) {
        return Double.valueOf(Double.longBitsToDouble(c5022Ij.A0L()));
    }

    public static Object A03(C5022Ij c5022Ij, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 8) {
                            HashMap<String, Object> A08 = A08(c5022Ij);
                            if (A02[5].length() != 0) {
                                String[] strArr = A02;
                                strArr[7] = "dv1uUJDV50UY3341cCSHZj";
                                strArr[6] = "lZLu8OCPwS2vewsoll9LjNz";
                                return A08;
                            }
                        } else if (i != 10) {
                            if (i != 11) {
                                return null;
                            }
                            return A07(c5022Ij);
                        } else {
                            ArrayList<Object> A06 = A06(c5022Ij);
                            String[] strArr2 = A02;
                            if (strArr2[1].length() == strArr2[0].length()) {
                                A02[4] = "2Wm";
                                return A06;
                            }
                        }
                        throw new RuntimeException();
                    }
                    return A09(c5022Ij);
                }
                return A05(c5022Ij);
            }
            return A01(c5022Ij);
        }
        return A02(c5022Ij);
    }

    public static String A05(C5022Ij c5022Ij) {
        int position = c5022Ij.A0I();
        int A06 = c5022Ij.A06();
        c5022Ij.A0Z(position);
        return new String(c5022Ij.A00, A06, position);
    }

    public static ArrayList<Object> A06(C5022Ij c5022Ij) {
        int A0H = c5022Ij.A0H();
        ArrayList<Object> arrayList = new ArrayList<>(A0H);
        for (int type = 0; type < A0H; type++) {
            arrayList.add(A03(c5022Ij, A00(c5022Ij)));
        }
        return arrayList;
    }

    public static Date A07(C5022Ij c5022Ij) {
        Date date = new Date((long) A02(c5022Ij).doubleValue());
        c5022Ij.A0Z(2);
        return date;
    }

    public static HashMap<String, Object> A08(C5022Ij c5022Ij) {
        int A0H = c5022Ij.A0H();
        HashMap<String, Object> hashMap = new HashMap<>(A0H);
        for (int i = 0; i < A0H; i++) {
            hashMap.put(A05(c5022Ij), A03(c5022Ij, A00(c5022Ij)));
        }
        return hashMap;
    }

    public static HashMap<String, Object> A09(C5022Ij c5022Ij) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String A05 = A05(c5022Ij);
            int A00 = A00(c5022Ij);
            if (A02[4].length() == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "V4HwzONZDXYgxClN6ndm7q";
            strArr[0] = "UAxIIFeY73WGzRiRR4AY1i";
            if (A00 == 9) {
                return hashMap;
            }
            hashMap.put(A05, A03(c5022Ij, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4671Cq
    public final void A0B(C5022Ij c5022Ij, long j) throws C4547Af {
        if (A00(c5022Ij) == 2) {
            if (!A04(8, 10, 28).equals(A05(c5022Ij)) || A00(c5022Ij) != 8) {
                return;
            }
            Map<String, Object> metadata = A08(c5022Ij);
            String A04 = A04(0, 8, 107);
            if (metadata.containsKey(A04)) {
                double doubleValue = ((Double) metadata.get(A04)).doubleValue();
                if (doubleValue > 0.0d) {
                    this.A00 = (long) (1000000.0d * doubleValue);
                    return;
                }
                return;
            }
            return;
        }
        throw new C4547Af();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4671Cq
    public final boolean A0C(C5022Ij c5022Ij) {
        return true;
    }

    public final long A0D() {
        return this.A00;
    }
}
