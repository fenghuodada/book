package com.facebook.ads.redexgen.p036X;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Arrays;
import okhttp3.internal.http.StatusLine;
import okio.Utf8;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.E0 */
/* loaded from: assets/audience_network.dex */
public final class C4737E0 {
    public static byte[] A07;
    public static String[] A08 = {"vBrv5NG59nS", "zkCPCHJFlDmcDIFZ", "dSCDMUmM7uXd", "gDMHkGze", "mPaDa0Yi", "mT3TArY2J5dLaa68x6KdY3", "l0NFbTIehup8", "m9spyvhxT2tneJJM7WnirVc4bphjINlc"};
    @Nullable
    public final MediaCodecInfo.CodecCapabilities A00;
    @Nullable
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A08[1].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[2] = "Hp23aXlVeAE4";
            strArr[6] = "LOeA2GQTCHg8";
            copyOfRange[i4] = (byte) ((b - i3) - 92);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{-49, 35, 30, -49, -42, -54, -108, -120, -61, -23, 27, 27, 29, 21, 13, 12, -11, 9, 32, -21, 16, 9, 22, 22, 13, 20, -23, 12, 18, 29, 27, 28, 21, 13, 22, 28, -30, -56, -55, -5, -5, -3, -11, -19, -20, -37, -3, -8, -8, -9, -6, -4, -88, -29, -41, -17, -18, -13, -21, -51, -7, -18, -17, -19, -45, -8, -16, -7, 1, 34, 6, 40, 35, 35, 34, 37, 39, -45, 14, -52, 29, -32, 27, 18, 21, 18, 33, 37, 26, 39, 22, -34, 33, 29, 18, 42, 19, 18, 20, 28, 22, 33, 30, 28, 35, -29, 24, 22, 37, 40, 1, 12, 9, 7, 14, -50, 22, -29, 1, 16, 19, -45, -25, -42, -37, -31, -95, -91, -39, -30, -30, -36, -16, -33, -28, -22, -86, -36, -34, -82, -10, 10, -7, -2, 4, -60, -10, 2, 7, -62, 12, -9, -22, -2, -19, -14, -8, -72, -18, -22, -20, -68, -31, -11, -28, -23, -17, -81, -26, -20, -31, -29, 38, 58, 41, 46, 52, -12, 44, -4, -10, -10, -14, 38, 49, 38, 60, -63, -43, -60, -55, -49, -113, -57, -105, -111, -111, -115, -51, -52, -63, -41, -20, 0, -17, -12, -6, -70, -14, -2, -8, 52, 72, 55, 60, 66, 2, 64, 67, 7, 52, 0, Utf8.REPLACEMENT_BYTE, 52, 71, 64, -44, -24, -41, -36, -30, -94, -32, -29, -40, -38, 43, Utf8.REPLACEMENT_BYTE, 46, 51, 57, -7, 57, 58, Utf8.REPLACEMENT_BYTE, 61, 51, 71, 54, 59, 65, 1, 68, 51, 73, -56, -36, -53, -48, -42, -106, -35, -42, -39, -55, -48, -38, -17, -12, -19, -6, -6, -15, -8, -49, -5, 1, -6, 0, -70, -19, -49, -19, -4, -1, -31, -26, -33, -20, -20, -29, -22, -63, -19, -13, -20, -14, -84, -31, -33, -18, -15, -55, -50, -57, -44, -44, -53, -46, -87, -43, -37, -44, -38, -108, -39, -37, -42, -42, -43, -40, -38, -110, -122, -45, -33, -44, -43, -45, -98, -35, -39, -35, -43, -112, 37, 49, 38, 39, 37, -16, 50, 52, 49, 40, 43, 46, 39, 14, 39, 56, 39, 46, -18, -30, 9, -9, 3, 6, 2, -5, -24, -9, 10, -5, -60, -9, -39, -9, 6, 9, 52, 34, 46, 49, 45, 38, 19, 34, 53, 38, -17, 36, 34, 49, 52, 11, -7, 5, 8, 4, -3, -22, -7, 12, -3, -58, 11, 13, 8, 8, 7, 10, 12, -60, -72, -42, -56, -58, -40, -43, -56, -112, -45, -49, -60, -36, -59, -60, -58, -50, 11, 1, 18, -3, -39, 6, -4, -22, -7, 12, -3, -58, -5, -7, 8, 11, -27, -37, -20, -41, -77, -32, -42, -60, -45, -26, -41, -96, -28, -31, -26, -45, -26, -41, -42, -98, -110, 61, 51, 68, 47, 11, 56, 46, 28, 43, 62, 47, -8, 61, Utf8.REPLACEMENT_BYTE, 58, 58, 57, 60, 62, -10, -22, 22, 12, 29, 8, -28, 17, 7, -11, 4, 23, 8, -47, 25, -26, 4, 19, 22, -44, -43, -50, -50, -59, -52, -59, -60, -115, -48, -52, -63, -39, -62, -63, -61, -53, -4};
    }

    static {
        A04();
    }

    public C4737E0(String str, @Nullable String str2, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        this.A02 = (String) C4997IK.A01(str);
        this.A01 = str2;
        this.A00 = codecCapabilities;
        this.A04 = z;
        boolean z4 = true;
        this.A03 = (z2 || codecCapabilities == null || !A07(codecCapabilities)) ? false : true;
        this.A06 = codecCapabilities != null && A0B(codecCapabilities);
        if (!z3 && (codecCapabilities == null || !A09(codecCapabilities))) {
            z4 = false;
        }
        this.A05 = z4;
    }

    public static int A00(String str, String str2, int i) {
        int i2;
        if (i <= 1) {
            int i3 = C5038Iz.A02;
            String[] strArr = A08;
            if (strArr[3].length() == strArr[4].length()) {
                String[] strArr2 = A08;
                strArr2[2] = "gQEbThFjrPzX";
                strArr2[6] = "subEH4wbl0ZW";
                if (i3 < 26 || i <= 0) {
                    if (!A03(226, 10, 23).equals(str2) && !A03(121, 10, 22).equals(str2) && !A03(140, 12, 57).equals(str2) && !A03(211, 15, 119).equals(str2) && !A03(255, 12, 11).equals(str2) && !A03(236, 10, 110).equals(str2) && !A03(246, 9, 118).equals(str2)) {
                        String A03 = A03(162, 10, 36);
                        String[] strArr3 = A08;
                        if (strArr3[0].length() != strArr3[5].length()) {
                            String[] strArr4 = A08;
                            strArr4[0] = "Y36qN525yNR";
                            strArr4[5] = "7bCUBG0iCXn5hjLUP8xpgf";
                            if (!A03.equals(str2) && !A03(172, 15, 105).equals(str2) && !A03(187, 15, 4).equals(str2) && !A03(202, 9, 47).equals(str2)) {
                                if (A03(131, 9, 31).equals(str2)) {
                                    i2 = 6;
                                } else if (A03(152, 10, 45).equals(str2)) {
                                    i2 = 16;
                                } else {
                                    i2 = 30;
                                }
                                Log.w(A03(54, 14, 46), A03(9, 29, 76) + str + A03(6, 3, 12) + i + A03(0, 4, 83) + i2 + A03(79, 1, 19));
                                return i2;
                            }
                        }
                    }
                    return i;
                }
            }
            throw new RuntimeException();
        }
        return i;
    }

    public static C4737E0 A01(String str) {
        return new C4737E0(str, null, null, true, false, false);
    }

    public static C4737E0 A02(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new C4737E0(str, str2, codecCapabilities, false, z, z2);
    }

    private void A05(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(A03(38, 16, 44));
        sb.append(str);
        String A03 = A03(80, 3, 100);
        sb.append(A03);
        sb.append(this.A02);
        sb.append(A03(4, 2, 78));
        sb.append(this.A01);
        sb.append(A03);
        sb.append(C5038Iz.A04);
        sb.append(A03(79, 1, 19));
        sb.toString();
    }

    private void A06(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(A03(68, 11, 87));
        sb.append(str);
        String A03 = A03(80, 3, 100);
        sb.append(A03);
        sb.append(this.A02);
        sb.append(A03(4, 2, 78));
        sb.append(this.A01);
        sb.append(A03);
        sb.append(C5038Iz.A04);
        sb.append(A03(79, 1, 19));
        sb.toString();
    }

    public static boolean A07(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (C5038Iz.A02 >= 19) {
            boolean A082 = A08(codecCapabilities);
            if (A08[7].charAt(21) == 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[2] = "8GEBbxYcZYS6";
            strArr[6] = "94exv35S6dP4";
            if (A082) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(19)
    public static boolean A08(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(83, 17, 85));
    }

    public static boolean A09(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C5038Iz.A02 >= 21 && A0A(codecCapabilities);
    }

    @TargetApi(21)
    public static boolean A0A(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(406, 15, 7));
    }

    public static boolean A0B(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C5038Iz.A02 >= 21 && A0C(codecCapabilities);
    }

    @TargetApi(21)
    public static boolean A0C(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(496, 17, 4));
    }

    @TargetApi(21)
    public static boolean A0D(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d != -1.0d) {
            int i3 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            String[] strArr = A08;
            if (strArr[2].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[2] = "A2GQS1dflTwb";
            strArr2[6] = "0Zskb1WNhmLv";
            if (i3 > 0) {
                return videoCapabilities.areSizeAndRateSupported(i, i2, d);
            }
        }
        return videoCapabilities.isSizeSupported(i, i2);
    }

    @TargetApi(21)
    public final Point A0E(int widthAlignment, int heightAlignment) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            String A03 = A03(100, 10, 89);
            String[] strArr = A08;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "Xxto7V1TqW7";
            strArr2[5] = "LHJkWoRn06pgJp8wJy9kTn";
            A06(A03);
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            A06(A03(110, 11, 68));
            return null;
        }
        int widthAlignment2 = videoCapabilities.getWidthAlignment();
        int heightAlignment2 = videoCapabilities.getHeightAlignment();
        return new Point(C5038Iz.A04(widthAlignment, widthAlignment2) * widthAlignment2, C5038Iz.A04(heightAlignment, heightAlignment2) * heightAlignment2);
    }

    @TargetApi(21)
    public final boolean A0F(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            A06(A03(285, 17, 34));
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (A08[1].length() != 9) {
            A08[1] = "HvB";
            if (audioCapabilities == null) {
                A06(A03(267, 18, 48));
                return false;
            }
            int maxInputChannelCount = A00(this.A02, this.A01, audioCapabilities.getMaxInputChannelCount());
            if (maxInputChannelCount < i) {
                A06(A03(302, 22, 10) + i);
                return false;
            }
            return true;
        }
        throw new RuntimeException();
    }

    @TargetApi(21)
    public final boolean A0G(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            A06(A03(371, 15, 101));
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(355, 16, 58));
            return false;
        } else if (!audioCapabilities.isSampleRateSupported(i)) {
            A06(A03(386, 20, 60) + i);
            return false;
        } else {
            return true;
        }
    }

    @TargetApi(21)
    public final boolean A0H(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            A06(A03(StatusLine.HTTP_MISDIRECTED_REQUEST, 16, 60));
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        String[] strArr = A08;
        if (strArr[2].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A08[1] = "lTAqBYuEDZ5pJgHk8tv0g8UZJ2SLdw";
        if (videoCapabilities == null) {
            A06(A03(479, 17, 71));
            return false;
        } else if (!A0D(videoCapabilities, i, i2, d)) {
            String A03 = A03(513, 1, 40);
            if (i >= i2 || !A0D(videoCapabilities, i2, i, d)) {
                A06(A03(458, 21, 110) + i + A03 + i2 + A03 + d);
                return false;
            }
            A05(A03(437, 21, 22) + i + A03 + i2 + A03 + d);
            return true;
        } else {
            return true;
        }
    }

    public final boolean A0I(String codecMimeType) {
        String A05;
        if (codecMimeType == null || this.A01 == null || (A05 = C5015Ic.A05(codecMimeType)) == null) {
            return true;
        }
        boolean equals = this.A01.equals(A05);
        String A03 = A03(4, 2, 78);
        if (!equals) {
            A06(A03(324, 11, 20) + codecMimeType + A03 + A05);
            return false;
        }
        Pair<Integer, Integer> A02 = C4748EB.A02(codecMimeType);
        if (A02 == null) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] A0J = A0J();
        if (A08[7].charAt(21) != 'h') {
            String[] strArr = A08;
            strArr[3] = "mp3Z5Kb6";
            strArr[4] = "MqXhbdhM";
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : A0J) {
                if (codecProfileLevel.profile == ((Integer) A02.first).intValue() && codecProfileLevel.level >= ((Integer) A02.second).intValue()) {
                    return true;
                }
            }
            A06(A03(335, 20, 102) + codecMimeType + A03 + A05);
            return false;
        }
        throw new RuntimeException();
    }

    public final MediaCodecInfo.CodecProfileLevel[] A0J() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null || codecCapabilities.profileLevels == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return this.A00.profileLevels;
    }
}
