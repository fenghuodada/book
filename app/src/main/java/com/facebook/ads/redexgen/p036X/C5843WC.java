package com.facebook.ads.redexgen.p036X;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.WC */
/* loaded from: assets/audience_network.dex */
public final class C5843WC implements InterfaceC4732Dv {
    public static byte[] A02;
    public static String[] A03 = {"ggGLmhyInJSffjkfPU8VRn", "WisLA7DCjwWBxH7MqLlw8w9Z4gicIVYK", "baeaQjGS5RYnakDSUMD4HiL2ABi7hiKM", "QvfNkpkg0VH", "dkSLNeeU5ck3Twa6KyaCdOuwvlu7l8iW", "e6Ade", "C9ShSy7zMtGRXyHgR8PAzFWulvZi4KLP", "w2lskP6GH6NJyN70rzATNYjf2L9mjjHA"};
    public final int A00;
    public final List<Format> A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 6);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-120, -105, -105, -109, -112, -118, -120, -101, -112, -106, -107, 86, -118, -116, -120, 84, 93, 87, 95, -114, -99, -99, -103, -106, -112, -114, -95, -106, -100, -101, 92, -112, -110, -114, 90, 100, 93, 101};
    }

    static {
        A02();
    }

    public C5843WC() {
        this(0);
    }

    public C5843WC(int i) {
        this(i, Collections.emptyList());
    }

    public C5843WC(int i, List<Format> list) {
        this.A00 = i;
        if (!A03(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.A00(null, A01(0, 19, 33), 0, null));
        }
        this.A01 = list;
    }

    private C4728Dr A00(C4731Du c4731Du) {
        String A01;
        int i;
        if (A03(32)) {
            return new C4728Dr(this.A01);
        }
        C5022Ij c5022Ij = new C5022Ij(c4731Du.A03);
        List<Format> list = this.A01;
        while (true) {
            int A04 = c5022Ij.A04();
            String[] strArr = A03;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "9wGqNU4xey1NmHgGithGb88lbeAMl0Qa";
            strArr2[5] = "Me3yU";
            if (A04 > 0) {
                int descriptorLength = c5022Ij.A0E();
                int descriptorTag = c5022Ij.A0E();
                int A06 = c5022Ij.A06() + descriptorTag;
                if (descriptorLength == 134) {
                    list = new ArrayList<>();
                    int nextDescriptorPosition = c5022Ij.A0E();
                    int i2 = nextDescriptorPosition & 31;
                    for (int accessibilityChannel = 0; accessibilityChannel < i2; accessibilityChannel++) {
                        String A0S = c5022Ij.A0S(3);
                        int A0E = c5022Ij.A0E();
                        int captionTypeByte = A0E & 128;
                        int captionTypeByte2 = captionTypeByte != 0 ? 1 : 0;
                        if (captionTypeByte2 != 0) {
                            A01 = A01(19, 19, 39);
                            i = A0E & 63;
                        } else {
                            A01 = A01(0, 19, 33);
                            i = 1;
                        }
                        list.add(Format.A08(null, A01, null, -1, 0, A0S, i, null));
                        c5022Ij.A0Z(2);
                    }
                }
                c5022Ij.A0Y(A06);
            } else {
                return new C4728Dr(list);
            }
        }
    }

    private boolean A03(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4732Dv
    public final SparseArray<InterfaceC4734Dx> A4K() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4732Dv
    public final InterfaceC4734Dx A4P(int i, C4731Du c4731Du) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C5834W3(new C5835W4(c4731Du.A01));
            }
            if (i == 15) {
                if (A03(2)) {
                    return null;
                }
                return new C5834W3(new C5844WD(false, c4731Du.A01));
            } else if (i == 17) {
                if (A03(2)) {
                    return null;
                }
                return new C5834W3(new C5836W5(c4731Du.A01));
            } else if (i != 21) {
                if (i == 27) {
                    if (A03(4)) {
                        return null;
                    }
                    return new C5834W3(new C5839W8(A00(c4731Du), A03(1), A03(8)));
                } else if (i != 36) {
                    if (i != 89) {
                        if (i != 138) {
                            if (i != 129) {
                                if (i != 130) {
                                    if (A03[7].charAt(7) != 'G') {
                                        throw new RuntimeException();
                                    }
                                    A03[2] = "XLjLYE0qXOuIs9WeBuWhNfn9nKSLWrdd";
                                    if (i == 134) {
                                        if (A03(16)) {
                                            return null;
                                        }
                                        return new C5831W0(new C5830Vz());
                                    } else if (i != 135) {
                                        return null;
                                    }
                                }
                            }
                            return new C5834W3(new C5847WG(c4731Du.A01));
                        }
                        return new C5834W3(new C5842WB(c4731Du.A01));
                    }
                    return new C5834W3(new C5841WA(c4731Du.A02));
                } else {
                    return new C5834W3(new C5838W7(A00(c4731Du)));
                }
            } else {
                return new C5834W3(new C5837W6());
            }
        }
        return new C5834W3(new C5840W9());
    }
}
