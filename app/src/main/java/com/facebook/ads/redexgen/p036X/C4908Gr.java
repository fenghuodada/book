package com.facebook.ads.redexgen.p036X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gr */
/* loaded from: assets/audience_network.dex */
public final class C4908Gr {
    public static byte[] A07;
    public static String[] A08 = {"0rGqU9QbqgRhw9xCYiy2ikjdJF0tZxW0", "O5zJjRmwn", "Zuwvbdj2tlT5lxRkpa9deVxz18dZQdtj", "3cu9YvSu9oYTgNu7SXt0BZa9RO8c3dJe", "fSpgVoQESo9i788g3Yt2BRpnP7rxN0lE", "PNJ5rPmEA0nUP9bGeJM8wQu7KuAYrDy", "AGqKR696jXLUBqkrCQSQW886irj6NtRI", "IRr9cxFu4Mtz1eOchhtcqFpk7Zjv6sDY"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02 = new Paint();
    public final Paint A03;
    public final C4900Gj A04;
    public final C4901Gk A05;
    public final C4907Gq A06;

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 74);
            String[] strArr = A08;
            if (strArr[4].charAt(19) != strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[1] = "o838eL9fL";
            strArr2[5] = "J6qCpr7RcsAqb79Ub3PrHCSZxMucifP";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{-109, -80, -61, -80, 111, -75, -72, -76, -69, -77, 111, -69, -76, -67, -74, -61, -73, 111, -76, -57, -78, -76, -76, -77, -62, 111, -69, -72, -68, -72, -61, -16, 34, 14, -4, 13, 30, 31, 17, 30};
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, 15};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public C4908Gr(int i, int i2) {
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        this.A03 = new Paint();
        this.A03.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new C4901Gk(719, 575, 0, 719, 0, 575);
        this.A04 = new C4900Gj(0, A0F(), A0G(), A0H());
        this.A06 = new C4907Gq(i, i2);
    }

    public static int A00(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int A01(C5021Ii c5021Ii, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3 = i;
        int column = 0;
        do {
            int runLength = 0;
            byte A04 = c5021Ii.A04(2);
            if (A04 != 0) {
                runLength = 1;
            } else {
                boolean A0F = c5021Ii.A0F();
                String[] strArr = A08;
                if (strArr[6].charAt(3) == strArr[3].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[1] = "NWJ2j8DR8";
                strArr2[5] = "tuFwEgjWv5QsbV2rgY7O01mW2P3xd0b";
                if (A0F) {
                    runLength = c5021Ii.A04(3) + 3;
                    A04 = c5021Ii.A04(2);
                } else if (c5021Ii.A0F()) {
                    runLength = 1;
                    A04 = 0;
                } else {
                    int A042 = c5021Ii.A04(2);
                    if (A042 == 0) {
                        column = 1;
                        A04 = 0;
                    } else if (A042 != 1) {
                        if (A042 == 2) {
                            runLength = c5021Ii.A04(4) + 12;
                            A04 = c5021Ii.A04(2);
                        } else if (A042 != 3) {
                            A04 = 0;
                        } else {
                            int A043 = c5021Ii.A04(8);
                            String[] strArr3 = A08;
                            if (strArr3[1].length() == strArr3[5].length()) {
                                String[] strArr4 = A08;
                                strArr4[1] = "EWrEb5ztJ";
                                strArr4[5] = "osfW1bR5YMm4TxT0YESgxQn9EHcmZGy";
                                runLength = A043 + 12;
                                A04 = c5021Ii.A04(2);
                            } else {
                                A08[7] = "aK1SAaExMssx18Id1roywrSfe1Et1yGa";
                                runLength = A043 + 29;
                                A04 = c5021Ii.A04(2);
                            }
                        }
                    } else {
                        runLength = 2;
                        A04 = 0;
                    }
                }
            }
            if (runLength != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                canvas.drawRect(i3, i2, i3 + runLength, i2 + 1, paint);
            }
            i3 += runLength;
        } while (column == 0);
        return i3;
    }

    public static int A02(C5021Ii c5021Ii, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int runLength = i;
        int column = 0;
        do {
            int clutIndex = 0;
            byte A04 = c5021Ii.A04(4);
            if (A04 != 0) {
                clutIndex = 1;
            } else if (!c5021Ii.A0F()) {
                int A042 = c5021Ii.A04(3);
                if (A042 != 0) {
                    clutIndex = A042 + 2;
                    A04 = 0;
                } else {
                    column = 1;
                    A04 = 0;
                }
            } else if (!c5021Ii.A0F()) {
                clutIndex = c5021Ii.A04(2) + 4;
                A04 = c5021Ii.A04(4);
            } else {
                int A043 = c5021Ii.A04(2);
                if (A043 == 0) {
                    clutIndex = 1;
                    A04 = 0;
                } else if (A043 == 1) {
                    clutIndex = 2;
                    A04 = 0;
                } else if (A043 == 2) {
                    clutIndex = c5021Ii.A04(4) + 9;
                    A04 = c5021Ii.A04(4);
                } else if (A043 != 3) {
                    A04 = 0;
                } else {
                    clutIndex = c5021Ii.A04(8) + 25;
                    A04 = c5021Ii.A04(4);
                }
            }
            if (clutIndex != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                canvas.drawRect(runLength, i2, runLength + clutIndex, i2 + 1, paint);
            }
            runLength += clutIndex;
        } while (column == 0);
        return runLength;
    }

    public static int A03(C5021Ii c5021Ii, int[] iArr, @Nullable byte[] bArr, int i, int peek, Paint paint, Canvas canvas) {
        int A04;
        int runLength = i;
        int column = 0;
        do {
            byte A042 = c5021Ii.A04(8);
            if (A042 != 0) {
                A04 = 1;
            } else if (!c5021Ii.A0F()) {
                A04 = c5021Ii.A04(7);
                if (A04 != 0) {
                    A042 = 0;
                } else {
                    column = 1;
                    A04 = 0;
                    A042 = 0;
                }
            } else {
                A04 = c5021Ii.A04(7);
                A042 = c5021Ii.A04(8);
                String[] strArr = A08;
                if (strArr[4].charAt(19) != strArr[0].charAt(19)) {
                    throw new RuntimeException();
                }
                A08[7] = "oE62i0kU0YacGkvCLxgFzKdMfiudOn3o";
            }
            if (A04 != 0 && paint != null) {
                if (bArr != null) {
                    A042 = bArr[A042];
                }
                paint.setColor(iArr[A042]);
                canvas.drawRect(runLength, peek, runLength + A04, peek + 1, paint);
            }
            runLength += A04;
            String[] strArr2 = A08;
            if (strArr2[1].length() == strArr2[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A08;
            strArr3[6] = "jmdilAXdKLha38CDbN17xGIpmuplWnFc";
            strArr3[3] = "1PNl1axnrexK2c7Nxi5CJrHaXY90XFpd";
        } while (column == 0);
        return runLength;
    }

    public static C4900Gj A04(C5021Ii c5021Ii, int i) {
        int[] iArr;
        int A04;
        int clutId;
        int i2;
        int cb;
        int b = 8;
        int A042 = c5021Ii.A04(8);
        c5021Ii.A08(8);
        int i3 = i - 2;
        int[] clutEntries8Bit = A0F();
        int[] A0G = A0G();
        int[] A0H = A0H();
        while (i3 > 0) {
            int r = c5021Ii.A04(b);
            int t = c5021Ii.A04(b);
            int y = i3 - 2;
            if ((t & 128) != 0) {
                iArr = clutEntries8Bit;
            } else {
                int cr = t & 64;
                if (cr != 0) {
                    iArr = A0G;
                } else {
                    iArr = A0H;
                }
            }
            if ((t & 1) != 0) {
                A04 = c5021Ii.A04(b);
                clutId = c5021Ii.A04(b);
                i2 = c5021Ii.A04(b);
                cb = c5021Ii.A04(b);
                i3 = y - 4;
            } else {
                A04 = c5021Ii.A04(6) << 2;
                int remainingLength = c5021Ii.A04(4);
                clutId = remainingLength << 4;
                int cr2 = c5021Ii.A04(4);
                i2 = cr2 << 4;
                int cr3 = c5021Ii.A04(2);
                cb = cr3 << 6;
                i3 = y - 2;
            }
            if (A04 == 0) {
                clutId = 0;
                i2 = 0;
                cb = 255;
            }
            byte b2 = (byte) (255 - (cb & 255));
            int a = clutId - 128;
            int i4 = (int) (A04 + (a * 1.402d));
            int cb2 = i2 - 128;
            double d = A04 - (cb2 * 0.34414d);
            int cb3 = clutId - 128;
            int i5 = (int) (d - (cb3 * 0.71414d));
            int cb4 = i2 - 128;
            int a2 = C5038Iz.A06(i4, 0, 255);
            int b3 = C5038Iz.A06(i5, 0, 255);
            iArr[r] = A00(b2, a2, b3, C5038Iz.A06((int) (A04 + (cb4 * 1.772d)), 0, 255));
            b = 8;
        }
        return new C4900Gj(A042, clutEntries8Bit, A0G, A0H);
    }

    public static C4901Gk A05(C5021Ii c5021Ii) {
        int verticalPositionMinimum;
        int width;
        int verticalPositionMaximum;
        int height;
        c5021Ii.A08(4);
        boolean A0F = c5021Ii.A0F();
        c5021Ii.A08(3);
        int A04 = c5021Ii.A04(16);
        int A042 = c5021Ii.A04(16);
        if (A0F) {
            verticalPositionMinimum = c5021Ii.A04(16);
            verticalPositionMaximum = c5021Ii.A04(16);
            width = c5021Ii.A04(16);
            height = c5021Ii.A04(16);
        } else {
            verticalPositionMinimum = 0;
            width = 0;
            verticalPositionMaximum = A04;
            height = A042;
        }
        return new C4901Gk(A04, A042, verticalPositionMinimum, verticalPositionMaximum, width, height);
    }

    public static C4902Gl A06(C5021Ii c5021Ii) {
        int objectCodingMethod = c5021Ii.A04(16);
        c5021Ii.A08(4);
        int A04 = c5021Ii.A04(2);
        boolean A0F = c5021Ii.A0F();
        c5021Ii.A08(1);
        byte[] bArr = null;
        byte[] bArr2 = null;
        if (A04 == 1) {
            c5021Ii.A08(c5021Ii.A04(8) * 16);
        } else if (A04 == 0) {
            int A042 = c5021Ii.A04(16);
            int objectId = c5021Ii.A04(16);
            String[] strArr = A08;
            String str = strArr[4];
            String str2 = strArr[0];
            int charAt = str.charAt(19);
            int topFieldDataLength = str2.charAt(19);
            if (charAt != topFieldDataLength) {
                throw new RuntimeException();
            }
            A08[2] = "pcqe5F2CDJi5oBWvBkq2zbdYSROcg8Hm";
            if (A042 > 0) {
                bArr = new byte[A042];
                c5021Ii.A0E(bArr, 0, A042);
            }
            if (objectId > 0) {
                bArr2 = new byte[objectId];
                c5021Ii.A0E(bArr2, 0, objectId);
            } else {
                bArr2 = bArr;
            }
        }
        return new C4902Gl(objectCodingMethod, A0F, bArr, bArr2);
    }

    public static C4903Gm A07(C5021Ii c5021Ii, int timeoutSecs) {
        int remainingLength = c5021Ii.A04(8);
        int A04 = c5021Ii.A04(4);
        int A042 = c5021Ii.A04(2);
        c5021Ii.A08(2);
        int regionHorizontalAddress = timeoutSecs - 2;
        SparseArray sparseArray = new SparseArray();
        while (regionHorizontalAddress > 0) {
            int A043 = c5021Ii.A04(8);
            c5021Ii.A08(8);
            regionHorizontalAddress -= 6;
            sparseArray.put(A043, new C4904Gn(c5021Ii.A04(16), c5021Ii.A04(16)));
        }
        return new C4903Gm(remainingLength, A04, A042, sparseArray);
    }

    public static C4905Go A08(C5021Ii c5021Ii, int i) {
        int i2 = 8;
        int A04 = c5021Ii.A04(8);
        c5021Ii.A08(4);
        boolean A0F = c5021Ii.A0F();
        c5021Ii.A08(3);
        int A042 = c5021Ii.A04(16);
        int A043 = c5021Ii.A04(16);
        int A044 = c5021Ii.A04(3);
        int A045 = c5021Ii.A04(3);
        c5021Ii.A08(2);
        int id = c5021Ii.A04(8);
        int A046 = c5021Ii.A04(8);
        int width = c5021Ii.A04(4);
        int height = c5021Ii.A04(2);
        c5021Ii.A08(2);
        int pixelCode8Bit = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (pixelCode8Bit > 0) {
            int pixelCode4Bit = c5021Ii.A04(16);
            int pixelCode2Bit = c5021Ii.A04(2);
            int remainingLength = c5021Ii.A04(2);
            int objectHorizontalPosition = c5021Ii.A04(12);
            c5021Ii.A08(4);
            int objectVerticalPosition = c5021Ii.A04(12);
            pixelCode8Bit -= 6;
            int remainingLength2 = 0;
            int objectType = 0;
            if (pixelCode2Bit == 1 || pixelCode2Bit == 2) {
                remainingLength2 = c5021Ii.A04(i2);
                objectType = c5021Ii.A04(i2);
                pixelCode8Bit -= 2;
                int objectProvider = A08[2].charAt(23);
                if (objectProvider == 111) {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[4] = "2juIiSC4ZxHJWLrTtxN2ANki5argYjtZ";
                strArr[0] = "MWq7TNsVs7aXK0A5Gh22llfb9AkLnJo6";
            }
            sparseArray.put(pixelCode4Bit, new C4906Gp(pixelCode2Bit, remainingLength, objectHorizontalPosition, objectVerticalPosition, remainingLength2, objectType));
            i2 = 8;
        }
        return new C4905Go(A04, A0F, A042, A043, A044, A045, id, A046, width, height, sparseArray);
    }

    public static void A0B(C4902Gl c4902Gl, C4900Gj c4900Gj, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = c4900Gj.A03;
        } else if (i == 2) {
            iArr = c4900Gj.A02;
        } else {
            iArr = c4900Gj.A01;
        }
        A0D(c4902Gl.A03, iArr, i, i2, i3, paint, canvas);
        A0D(c4902Gl.A02, iArr, i, i2, i3 + 1, paint, canvas);
    }

    public static void A0C(C5021Ii c5021Ii, C4907Gq c4907Gq) {
        int dataFieldLimit = c5021Ii.A04(8);
        int A04 = c5021Ii.A04(16);
        int A042 = c5021Ii.A04(16);
        int A02 = c5021Ii.A02() + A042;
        int i = A042 * 8;
        int pageId = c5021Ii.A01();
        if (i > pageId) {
            Log.w(A09(31, 9, 98), A09(0, 31, 5));
            int pageId2 = c5021Ii.A01();
            c5021Ii.A08(pageId2);
            return;
        }
        switch (dataFieldLimit) {
            case 16:
                if (A04 == c4907Gq.A03) {
                    C4903Gm c4903Gm = c4907Gq.A01;
                    C4903Gm A072 = A07(c5021Ii, A042);
                    if (A072.A00 != 0) {
                        c4907Gq.A01 = A072;
                        c4907Gq.A08.clear();
                        c4907Gq.A06.clear();
                        c4907Gq.A07.clear();
                        break;
                    } else if (c4903Gm != null && c4903Gm.A02 != A072.A02) {
                        c4907Gq.A01 = A072;
                        break;
                    }
                }
                break;
            case 17:
                C4903Gm c4903Gm2 = c4907Gq.A01;
                if (A04 == c4907Gq.A03 && c4903Gm2 != null) {
                    C4905Go A082 = A08(c5021Ii, A042);
                    if (c4903Gm2.A00 == 0) {
                        A082.A00(c4907Gq.A08.get(A082.A03));
                    }
                    c4907Gq.A08.put(A082.A03, A082);
                    break;
                }
                break;
            case 18:
                int i2 = c4907Gq.A03;
                String[] strArr = A08;
                if (strArr[6].charAt(3) == strArr[3].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[6] = "mRSclinCADIq46C9KldTbFaax6B9q8b4";
                strArr2[3] = "vFkDlZLj3MIArV1XHnB7DSJLlPCTmot7";
                if (A04 == i2) {
                    C4900Gj A043 = A04(c5021Ii, A042);
                    c4907Gq.A06.put(A043.A00, A043);
                    break;
                } else if (A04 == c4907Gq.A02) {
                    C4900Gj A044 = A04(c5021Ii, A042);
                    c4907Gq.A04.put(A044.A00, A044);
                    break;
                }
                break;
            case 19:
                int i3 = c4907Gq.A03;
                String[] strArr3 = A08;
                if (strArr3[6].charAt(3) == strArr3[3].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A08;
                strArr4[4] = "pcWRhVspQCHgNcWnX1u2k42jPLp60tyv";
                strArr4[0] = "kZn4JsYkhf5tuSMKkFW2HGy26pqZZVve";
                if (A04 == i3) {
                    C4902Gl A06 = A06(c5021Ii);
                    c4907Gq.A07.put(A06.A00, A06);
                    break;
                } else if (A04 == c4907Gq.A02) {
                    C4902Gl A062 = A06(c5021Ii);
                    c4907Gq.A05.put(A062.A00, A062);
                    break;
                }
                break;
            case 20:
                if (A04 == c4907Gq.A03) {
                    c4907Gq.A00 = A05(c5021Ii);
                    break;
                }
                break;
        }
        int pageId3 = c5021Ii.A02();
        c5021Ii.A09(A02 - pageId3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (r18 == 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r9 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
        r12 = com.facebook.ads.redexgen.p036X.C4908Gr.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
        if (r18 == 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
        r12 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
        r12 = null;
        r2 = com.facebook.ads.redexgen.p036X.C4908Gr.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
        if (r2[6].charAt(3) == r2[3].charAt(3)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
        r2 = com.facebook.ads.redexgen.p036X.C4908Gr.A08;
        r2[6] = "gux03qWXo9ty9zG4lbSXUGnB14yX0Pwl";
        r2[3] = "mOZXu8mKnzB6ItdLGIFDHc3IIcHjCnZN";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0D(byte[] r16, int[] r17, int r18, int r19, int r20, android.graphics.Paint r21, android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4908Gr.A0D(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static byte[] A0E(int i, int i2, C5021Ii c5021Ii) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c5021Ii.A04(i2);
        }
        return bArr;
    }

    public static int[] A0F() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0009 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A0G() {
        /*
            r0 = 16
            int[] r5 = new int[r0]
            r0 = 0
            r5[r0] = r0
            r4 = 1
        L8:
            int r0 = r5.length
            if (r4 >= r0) goto L51
            r0 = 8
            r6 = 255(0xff, float:3.57E-43)
            if (r4 >= r0) goto L32
            r0 = r4 & 1
            if (r0 == 0) goto L30
            r2 = 255(0xff, float:3.57E-43)
        L17:
            r0 = r4 & 2
            if (r0 == 0) goto L2e
            r1 = 255(0xff, float:3.57E-43)
        L1d:
            r0 = r4 & 4
            if (r0 == 0) goto L2c
            r0 = 255(0xff, float:3.57E-43)
        L23:
            int r0 = A00(r6, r2, r1, r0)
            r5[r4] = r0
        L29:
            int r4 = r4 + 1
            goto L8
        L2c:
            r0 = 0
            goto L23
        L2e:
            r1 = 0
            goto L1d
        L30:
            r2 = 0
            goto L17
        L32:
            r0 = r4 & 1
            r3 = 127(0x7f, float:1.78E-43)
            if (r0 == 0) goto L4f
            r2 = 127(0x7f, float:1.78E-43)
        L3a:
            r0 = r4 & 2
            if (r0 == 0) goto L4d
            r1 = 127(0x7f, float:1.78E-43)
        L40:
            r0 = r4 & 4
            if (r0 == 0) goto L4b
        L44:
            int r0 = A00(r6, r2, r1, r3)
            r5[r4] = r0
            goto L29
        L4b:
            r3 = 0
            goto L44
        L4d:
            r1 = 0
            goto L40
        L4f:
            r2 = 0
            goto L3a
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4908Gr.A0G():int[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0143, code lost:
        r0 = 170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x015b, code lost:
        if (r9 != 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x015e, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0183, code lost:
        if (r7 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0185, code lost:
        r2 = 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01cc, code lost:
        if (r7 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01cf, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:
        if (r10 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
        r0 = A00(255, r9, r3, r8 + r6);
        r5[r4] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
        if (r10 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ac, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dc, code lost:
        if (r0 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00de, code lost:
        r0 = 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010b, code lost:
        if (r0 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010e, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0141, code lost:
        if (r9 != 0) goto L133;
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0009 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A0H() {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4908Gr.A0H():int[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0121, code lost:
        if (r14 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0123, code lost:
        r11 = r20.A06;
        r10 = com.facebook.ads.redexgen.p036X.C4908Gr.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0136, code lost:
        if (r10[6].charAt(3) == r10[3].charAt(3)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0138, code lost:
        r10 = com.facebook.ads.redexgen.p036X.C4908Gr.A08;
        r10[4] = "FqzyOIY2SO0zI5B62Gz2koPoL8lG6Y83";
        r10[0] = "OO5P85uWBDMqMzJuElY2BFz2z3H1SOXI";
        r14 = r11.A04.get(r1.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014e, code lost:
        if (r14 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0150, code lost:
        r14 = r20.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0152, code lost:
        r10 = r1.A09;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0155, code lost:
        r13 = r10.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0166, code lost:
        if (com.facebook.ads.redexgen.p036X.C4908Gr.A08[2].charAt(23) == 'o') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0168, code lost:
        com.facebook.ads.redexgen.p036X.C4908Gr.A08[2] = "8CBvTLi9MCYkuIvOm7pX0icqjNgV3H5L";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016f, code lost:
        if (r9 >= r13) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0171, code lost:
        r12 = r10.keyAt(r9);
        r11 = r10.valueAt(r9);
        r13 = r20.A06.A07.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0185, code lost:
        if (r13 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0187, code lost:
        r13 = r20.A06.A05.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0191, code lost:
        if (r13 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0195, code lost:
        if (r13.A01 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0197, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0198, code lost:
        A0B(r13, r14, r1.A01, r4 + r11.A02, r3 + r11.A05, r8, r20.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ab, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ae, code lost:
        r8 = r20.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b3, code lost:
        if (r1.A0A == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b8, code lost:
        if (r1.A01 != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ba, code lost:
        r9 = r14.A03[r1.A07];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c0, code lost:
        r20.A03.setColor(r9);
        r20.A01.drawRect(r4, r3, r1.A08 + r4, r1.A02 + r3, r20.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0213, code lost:
        if (r1.A01 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0215, code lost:
        r9 = r14.A02[r1.A06];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x021c, code lost:
        r11 = r14.A01;
        r10 = com.facebook.ads.redexgen.p036X.C4908Gr.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0230, code lost:
        if (r10[4].charAt(19) == r10[0].charAt(19)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0232, code lost:
        r9 = r11[r1.A05];
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0237, code lost:
        r10 = com.facebook.ads.redexgen.p036X.C4908Gr.A08;
        r10[1] = "SK7qwpqeD";
        r10[5] = "H8yQ2FZGH97VM0iLZGupvWVfM60nEcr";
        r9 = r11[r1.A05];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0249, code lost:
        r14 = r11.A04.get(r1.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0253, code lost:
        if (r14 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x028c, code lost:
        if (r14 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0298, code lost:
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.facebook.ads.redexgen.p036X.C4888GX> A0I(byte[] r21, int r22) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4908Gr.A0I(byte[], int):java.util.List");
    }

    public final void A0J() {
        this.A06.A00();
    }
}
