package com.facebook.ads.redexgen.p036X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.BinaryFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ChapterFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ChapterTocFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.GeobFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.PrivFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Vk */
/* loaded from: assets/audience_network.dex */
public final class C5816Vk implements InterfaceC4751EG {
    public static byte[] A01;
    public static String[] A02 = {"sMUxEv8h1aqUKtOfXRhWvF4cd3jhCIiv", "2", "jdWxaIwDf600E5fQi1jvtrBwOfx6AZo5", "VxysSZONWs4Fbmb", "6vXrI6nW4BVssue1T84qDnzAdKjaXJyK", "dpBJthFwlwkteZKALF9GwsW9kwjpNbjg", "2vyk08U", "E"};
    public static final int A03;
    public static final InterfaceC4763ES A04;
    @Nullable
    public final InterfaceC4763ES A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static ChapterFrame A06(C5022Ij c5022Ij, int i, int i2, boolean z, int i3, @Nullable InterfaceC4763ES interfaceC4763ES) throws UnsupportedEncodingException {
        int A06 = c5022Ij.A06();
        int A022 = A02(c5022Ij.A00, A06);
        String str = new String(c5022Ij.A00, A06, A022 - A06, A0I(169, 10, 52));
        c5022Ij.A0Y(A022 + 1);
        int A08 = c5022Ij.A08();
        int A082 = c5022Ij.A08();
        long A0M = c5022Ij.A0M();
        if (A0M == 4294967295L) {
            A0M = -1;
        }
        long A0M2 = c5022Ij.A0M();
        if (A0M2 == 4294967295L) {
            A0M2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = A06 + i;
        while (c5022Ij.A06() < i4) {
            Id3Frame A0B = A0B(i2, c5022Ij, z, i3, interfaceC4763ES);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, A08, A082, A0M, A0M2, id3FrameArr);
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A0L() {
        A01 = new byte[]{-4, 58, -4, 58, -4, 58, -103, -41, -103, -41, -103, -41, -103, -41, -51, -63, 7, 19, 2, 14, 6, -12, 10, 27, 6, -34, 38, 67, 86, 67, 2, 86, 81, 81, 2, 85, 74, 81, 84, 86, 2, 86, 81, 2, 68, 71, 2, 67, 80, 2, 43, 38, 21, 2, 86, 67, 73, 16, 43, 51, 54, 47, 46, -22, 62, 57, -22, 46, 47, 45, 57, 46, 47, -22, 48, 60, 43, 55, 47, 4, -22, 51, 46, 7, -78, -51, -43, -40, -47, -48, -116, -32, -37, -116, -30, -51, -40, -43, -48, -51, -32, -47, -116, -75, -80, -97, -116, -32, -51, -45, -116, -29, -43, -32, -44, -116, -39, -51, -42, -37, -34, -62, -47, -34, -33, -43, -37, -38, -87, -38, 6, -11, 1, -7, -76, 7, -3, 14, -7, -76, -7, 12, -9, -7, -7, -8, 7, -76, 6, -7, 1, -11, -3, 2, -3, 2, -5, -76, 8, -11, -5, -76, -8, -11, 8, -11, 10, 5, -12, -25, -15, -19, -53, -42, -42, -45, -41, -53, -49, 37, 64, 15, 32, 65, Utf8.REPLACEMENT_BYTE, 75, 64, 65, 78, -19, 5, 3, 10, 10, -1, -2, -70, -29, -34, -51, -70, 14, -5, 1, -70, 17, 3, 14, 2, -70, 7, -5, 4, 9, 12, -16, -1, 12, 13, 3, 9, 8, -41, -52, -70, -5, 8, -2, -70, 15, 8, -2, -1, 0, 3, 8, -1, -2, -70, -3, 9, 7, 10, 12, -1, 13, 13, 3, 9, 8, -70, 13, -3, 2, -1, 7, -1, -25, -1, -3, 4, 4, -7, -8, -76, -35, -40, -57, -76, 8, -11, -5, -76, 11, -3, 8, -4, -76, 9, 2, 7, 9, 4, 4, 3, 6, 8, -7, -8, -76, 1, -11, -2, 3, 6, -22, -7, 6, 7, -3, 3, 2, -47, 49, 73, 71, 78, 78, 71, 76, 69, -2, 83, 76, 81, 83, 78, 78, 77, 80, 82, 67, 66, -2, 65, 77, 75, 78, 80, 67, 81, 81, 67, 66, -2, 77, 80, -2, 67, 76, 65, 80, 87, 78, 82, 67, 66, -2, 68, 80, Utf8.REPLACEMENT_BYTE, 75, 67, 20, 24, 24, 24, -60, -61, -75, -100, -96, -91, -61, -62, -76, -101, -97, -92, -80, -77, 59, 58, 44, 19, 30, 38, Utf8.REPLACEMENT_BYTE, 54, 73, 65, 54, 52, 69, 54, 53, -15, 55, 58, 67, 68, 69, -15, 69, 57, 67, 54, 54, -15, 51, 74, 69, 54, 68, -15, 64, 55, -15, 26, 21, 4, -15, 69, 50, 56, -15, 57, 54, 50, 53, 54, 67, 11, -15, -18, 7, 12, 14, 9, 9, 8, 11, 13, -2, -3, -71, -4, 1, -6, 11, -6, -4, 13, -2, 11, -71, -2, 7, -4, 8, -3, 2, 7, 0, -47, -46, -46, -46, 18, 22, 10, 16, 14, -40, -4, 0, -12, -6, -8, -62, -3, 3, -8, -6, -31, -27, -39, -33, -35, -89, -30, -24, -33};
    }

    static {
        A0L();
        A04 = new C5817Vl();
        A03 = C5038Iz.A08(A0I(166, 3, 87));
    }

    public C5816Vk() {
        this(null);
    }

    public C5816Vk(@Nullable InterfaceC4763ES interfaceC4763ES) {
        this.A00 = interfaceC4763ES;
    }

    public static int A00(int i) {
        if (i == 0 || i == 3) {
            return 1;
        }
        return 2;
    }

    public static int A01(C5022Ij c5022Ij, int i) {
        byte[] bArr = c5022Ij.A00;
        for (int A06 = c5022Ij.A06(); A06 + 1 < i; A06++) {
            if ((bArr[A06] & 255) == 255 && bArr[A06 + 1] == 0) {
                System.arraycopy(bArr, A06 + 2, bArr, A06 + 1, (i - A06) - 2);
                i--;
            }
        }
        return i;
    }

    public static int A02(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int A03(byte[] bArr, int i, int i2) {
        int A022 = A02(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return A022;
        }
        while (A022 < bArr.length - 1) {
            if (A022 % 2 == 0 && bArr[A022 + 1] == 0) {
                return A022;
            }
            A022 = A02(bArr, A022 + 1);
        }
        return bArr.length;
    }

    public static ApicFrame A04(C5022Ij c5022Ij, int i, int i2) throws UnsupportedEncodingException {
        int A022;
        String A0M;
        int A0E = c5022Ij.A0E();
        String A0H = A0H(A0E);
        byte[] bArr = new byte[i - 1];
        c5022Ij.A0c(bArr, 0, i - 1);
        String A0I = A0I(458, 6, 63);
        String A0I2 = A0I(169, 10, 52);
        if (i2 == 2) {
            A022 = 2;
            A0M = A0I + C5038Iz.A0M(new String(bArr, 0, 3, A0I2));
            if (A0I(474, 9, 14).equals(A0M)) {
                A0M = A0I(464, 10, 41);
            }
        } else {
            A022 = A02(bArr, 0);
            A0M = C5038Iz.A0M(new String(bArr, 0, A022, A0I2));
            if (A0M.indexOf(47) == -1) {
                A0M = A0I + A0M;
            }
        }
        int encoding = bArr[A022 + 1] & 255;
        int i3 = A022 + 2;
        int A032 = A03(bArr, i3, A0E);
        int descriptionEndIndex = A032 - i3;
        String str = new String(bArr, i3, descriptionEndIndex, A0H);
        int descriptionEndIndex2 = bArr.length;
        byte[] pictureData = A0N(bArr, A00(A0E) + A032, descriptionEndIndex2);
        return new ApicFrame(A0M, str, encoding, pictureData);
    }

    public static BinaryFrame A05(C5022Ij c5022Ij, int i, String str) {
        byte[] bArr = new byte[i];
        c5022Ij.A0c(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(C5022Ij c5022Ij, int framePosition, int elementIdEndIndex, boolean z, int i, @Nullable InterfaceC4763ES interfaceC4763ES) throws UnsupportedEncodingException {
        int A06 = c5022Ij.A06();
        int A022 = A02(c5022Ij.A00, A06);
        String A0I = A0I(169, 10, 52);
        String str = new String(c5022Ij.A00, A06, A022 - A06, A0I);
        c5022Ij.A0Y(A022 + 1);
        int A0E = c5022Ij.A0E();
        boolean z2 = (A0E & 2) != 0;
        boolean z3 = (A0E & 1) != 0;
        int ctocFlags = c5022Ij.A0E();
        String[] strArr = new String[ctocFlags];
        for (int childCount = 0; childCount < ctocFlags; childCount++) {
            int A062 = c5022Ij.A06();
            int i2 = A02(c5022Ij.A00, A062);
            strArr[childCount] = new String(c5022Ij.A00, A062, i2 - A062, A0I);
            int startIndex = i2 + 1;
            c5022Ij.A0Y(startIndex);
        }
        ArrayList arrayList = new ArrayList();
        int i3 = A06 + framePosition;
        while (c5022Ij.A06() < i3) {
            Id3Frame A0B = A0B(elementIdEndIndex, c5022Ij, z, i, interfaceC4763ES);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    public static CommentFrame A08(C5022Ij c5022Ij, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int A0E = c5022Ij.A0E();
        String A0H = A0H(A0E);
        byte[] data = new byte[3];
        c5022Ij.A0c(data, 0, 3);
        String str = new String(data, 0, 3);
        byte[] bArr = new byte[i - 4];
        c5022Ij.A0c(bArr, 0, i - 4);
        int A032 = A03(bArr, 0, A0E);
        String str2 = new String(bArr, 0, A032, A0H);
        int A00 = A00(A0E) + A032;
        int textEndIndex = A03(bArr, A00, A0E);
        String text = A0K(bArr, A00, textEndIndex, A0H);
        return new CommentFrame(str, str2, text);
    }

    public static GeobFrame A09(C5022Ij c5022Ij, int i) throws UnsupportedEncodingException {
        int A0E = c5022Ij.A0E();
        String A0H = A0H(A0E);
        byte[] bArr = new byte[i - 1];
        c5022Ij.A0c(bArr, 0, i - 1);
        int A022 = A02(bArr, 0);
        String str = new String(bArr, 0, A022, A0I(169, 10, 52));
        int i2 = A022 + 1;
        int filenameEndIndex = A03(bArr, i2, A0E);
        String A0K = A0K(bArr, i2, filenameEndIndex, A0H);
        int A00 = A00(A0E) + filenameEndIndex;
        int filenameEndIndex2 = A03(bArr, A00, A0E);
        String A0K2 = A0K(bArr, A00, filenameEndIndex2, A0H);
        int A002 = A00(A0E) + filenameEndIndex2;
        int objectDataStartIndex = bArr.length;
        return new GeobFrame(str, A0K, A0K2, A0N(bArr, A002, objectDataStartIndex));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
        if (r4 == 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
        r0 = r6 & 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
        if (r0 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
        if (r0 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
        android.util.Log.w(r7, A0I(189, 68, 48));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
        if (r4 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
        if (r4 != 3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b6, code lost:
        r0 = r6 & 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
        if (r0 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
        if (r0 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
        r0 = r9.A08();
        r9.A0Z(r0);
        r2 = r2 - (r0 + 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
        if (r0 != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
        if (r4 != r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
        r0 = r6 & 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
        if (r0 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00de, code lost:
        if (r0 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
        r1 = r9.A0D();
        r0 = r1 - 4;
        r9.A0Z(r0);
        r2 = r2 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
        r0 = r6 & 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
        if (r0 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
        if (r0 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f1, code lost:
        r2 = r2 - 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f4, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f6, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f8, code lost:
        android.util.Log.w(r7, A0I(257, 46, 42) + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0114, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.p036X.C4764ET A0A(com.facebook.ads.redexgen.p036X.C5022Ij r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5816Vk.A0A(com.facebook.ads.redexgen.X.Ij):com.facebook.ads.redexgen.X.ET");
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x019f, code lost:
        if (r8 == 67) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame A0B(int r23, com.facebook.ads.redexgen.p036X.C5022Ij r24, boolean r25, int r26, @androidx.annotation.Nullable com.facebook.ads.redexgen.p036X.InterfaceC4763ES r27) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5816Vk.A0B(int, com.facebook.ads.redexgen.X.Ij, boolean, int, com.facebook.ads.redexgen.X.ES):com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame");
    }

    public static PrivFrame A0C(C5022Ij c5022Ij, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c5022Ij.A0c(bArr, 0, i);
        int A022 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, A022, A0I(169, 10, 52)), A0N(bArr, A022 + 1, bArr.length));
    }

    public static TextInformationFrame A0D(C5022Ij c5022Ij, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int A0E = c5022Ij.A0E();
        String A0H = A0H(A0E);
        byte[] bArr = new byte[i - 1];
        c5022Ij.A0c(bArr, 0, i - 1);
        int descriptionEndIndex = A03(bArr, 0, A0E);
        String str = new String(bArr, 0, descriptionEndIndex, A0H);
        int A00 = A00(A0E) + descriptionEndIndex;
        return new TextInformationFrame(A0I(353, 4, 86), str, A0K(bArr, A00, A03(bArr, A00, A0E), A0H));
    }

    public static TextInformationFrame A0E(C5022Ij c5022Ij, int encoding, String charset) throws UnsupportedEncodingException {
        if (encoding < 1) {
            return null;
        }
        int A0E = c5022Ij.A0E();
        String A0H = A0H(A0E);
        byte[] bArr = new byte[encoding - 1];
        c5022Ij.A0c(bArr, 0, encoding - 1);
        int valueEndIndex = A03(bArr, 0, A0E);
        String value = new String(bArr, 0, valueEndIndex, A0H);
        return new TextInformationFrame(charset, null, value);
    }

    public static UrlLinkFrame A0F(C5022Ij c5022Ij, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) != strArr[5].charAt(11)) {
                String[] strArr2 = A02;
                strArr2[7] = "x";
                strArr2[1] = "0";
                return null;
            }
            throw new RuntimeException();
        }
        int descriptionEndIndex = c5022Ij.A0E();
        String A0H = A0H(descriptionEndIndex);
        byte[] bArr = new byte[i - 1];
        c5022Ij.A0c(bArr, 0, i - 1);
        int A032 = A03(bArr, 0, descriptionEndIndex);
        String str = new String(bArr, 0, A032, A0H);
        int A00 = A00(descriptionEndIndex) + A032;
        return new UrlLinkFrame(A0I(454, 4, 16), str, A0K(bArr, A00, A02(bArr, A00), A0I(169, 10, 52)));
    }

    public static UrlLinkFrame A0G(C5022Ij c5022Ij, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c5022Ij.A0c(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), A0I(169, 10, 52)));
    }

    public static String A0H(int i) {
        String A0I = A0I(169, 10, 52);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return A0I;
                    }
                    String[] strArr = A02;
                    if (strArr[2].charAt(11) != strArr[5].charAt(11)) {
                        A02[0] = "Xs3p10eLQltfrtGuZ9I87GBEYIMhEDM2";
                        return A0I(371, 5, 124);
                    }
                    throw new RuntimeException();
                }
                return A0I(363, 8, 4);
            }
            return A0I(357, 6, 5);
        }
        return A0I;
    }

    public static String A0J(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, A0I(0, 6, 109), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, A0I(6, 8, 10), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String A0K(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        if (i2 <= i || i2 > bArr.length) {
            return A0I(0, 0, 105);
        }
        return new String(bArr, i, i2 - i, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
        if (r8 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
        r7 = 0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
        if (r12 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
        r7 = r7 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
        if (r3 >= r7) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
        r17.A0Y(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
        if (r8 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d5, code lost:
        if (r17.A04() >= r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00de, code lost:
        r17.A0Y(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e1, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0M(com.facebook.ads.redexgen.p036X.C5022Ij r17, int r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5816Vk.A0M(com.facebook.ads.redexgen.X.Ij, int, int, boolean):boolean");
    }

    public static byte[] A0N(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return new byte[0];
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        if (A02[3].length() != 29) {
            String[] strArr = A02;
            strArr[2] = "BXfcBk8SW4yeYxu44B11cVVkBGYBzlAv";
            strArr[5] = "okWvwdNSxMQpYeQbiZnCLiGxFx7BKew9";
            return copyOfRange;
        }
        throw new RuntimeException();
    }

    public final Metadata A0O(byte[] bArr, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        C5022Ij c5022Ij = new C5022Ij(bArr, i);
        C4764ET A0A = A0A(c5022Ij);
        if (A0A == null) {
            return null;
        }
        int A06 = c5022Ij.A06();
        i2 = A0A.A01;
        int i9 = i2 == 2 ? 6 : 10;
        i3 = A0A.A00;
        z = A0A.A02;
        if (z) {
            i8 = A0A.A00;
            i3 = A01(c5022Ij, i8);
        }
        c5022Ij.A0X(A06 + i3);
        boolean unsignedIntFrameSizeHack = false;
        i4 = A0A.A01;
        if (!A0M(c5022Ij, i4, i9, false)) {
            i6 = A0A.A01;
            if (A02[4].charAt(24) == '1') {
                throw new RuntimeException();
            }
            A02[0] = "uYZb4rh3wheJht2DQ5CIaEPvRS4bXzrD";
            if (i6 == 4 && A0M(c5022Ij, 4, i9, true)) {
                unsignedIntFrameSizeHack = true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(A0I(84, 45, 2));
                i7 = A0A.A01;
                sb.append(i7);
                Log.w(A0I(179, 10, 114), sb.toString());
                return null;
            }
        }
        while (c5022Ij.A04() >= i9) {
            i5 = A0A.A01;
            Id3Frame A0B = A0B(i5, c5022Ij, unsignedIntFrameSizeHack, i9, this.A00);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4751EG
    public final Metadata A4h(C4694DJ c4694dj) {
        ByteBuffer byteBuffer = c4694dj.A01;
        return A0O(byteBuffer.array(), byteBuffer.limit());
    }
}
