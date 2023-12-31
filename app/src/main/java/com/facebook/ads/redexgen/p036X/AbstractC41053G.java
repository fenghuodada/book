package com.facebook.ads.redexgen.p036X;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okio.Utf8;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.3G */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC41053G extends AbstractC4741E4 {
    public static byte[] A0d;
    public static String[] A0e = {"9OVkIR1fNYEoLuJhr4v44UGIqobat2iA", "rvjyAE4a8qg3Symxb7ylQnmZk1yEw18g", "yq3KpxRuPN0WZ8jbU7FQkuT3q90s4j9W", "QhWwoh5s4IWFZsopFlKjqr3qYdcDlMjY", "GXhQrMO3EYw7GpvgdmF2LLQyblaoRrya", "HarHLo3NfHHJ1sn22D42qgtNJjG4ySv5", "mWzZtnKFhVqOEEmQC7RHyJpmfpW8oE62", "x54zHbOQHTTVCgIECmCrfbqAOALLU5ir"};
    public static final byte[] A0f;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaCodec A06;
    public Format A07;
    public InterfaceC4649CL<C5889Ww> A08;
    public InterfaceC4649CL<C5889Ww> A09;
    public C4737E0 A0A;
    public ByteBuffer A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public ByteBuffer[] A0S;
    public ByteBuffer[] A0T;
    public C4626Bw A0U;
    public final MediaCodec.BufferInfo A0V;
    public final C4541AZ A0W;
    public final C5895X2 A0X;
    public final C5895X2 A0Y;
    @Nullable
    public final InterfaceC4650CM<C5889Ww> A0Z;
    public final InterfaceC4743E6 A0a;
    public final List<Long> A0b;
    public final boolean A0c;

    public static String A0Z(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0d, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 20);
        }
        return new String(copyOfRange);
    }

    public static void A0j() {
        A0d = new byte[]{76, 64, 2, 21, 20, 64, 14, 15, 64, 19, 5, 3, 21, 18, 5, 64, 4, 5, 3, 15, 4, 5, 18, 64, 1, 22, 1, 9, 12, 1, 2, 12, 5, 78, 64, 52, 18, 25, 9, 14, 7, 64, 20, 15, 64, 16, 18, 15, 3, 5, 5, 4, 64, 23, 9, 20, 8, 64, 118, 116, 116, 116, 116, 116, 117, 114, 115, 112, 118, 7, 116, 116, 6, 0, 5, 118, 113, 125, 116, 116, 116, 116, 116, 116, 117, 114, 124, 7, 1, 116, 2, 117, 119, 118, 116, 116, 116, 116, 116, 116, 117, 114, 113, 124, 124, 124, 112, 116, 0, 7, 1, 115, 117, 117, 124, 5, 116, 116, 116, 118, 2, 6, 2, 117, 7, 119, 117, 7, 119, 118, 115, 113, 0, 115, 124, 7, 0, 18, 4, 15, 8, 26, 3, 29, 26, 8, 15, 117, 89, 85, 78, 91, 90, 34, 20, 11, 70, 21, 3, 21, 21, 15, 9, 8, 70, 20, 3, 23, 19, 15, 20, 3, 21, 70, 21, 3, 5, 19, 20, 3, 70, 2, 3, 5, 9, 2, 3, 20, 70, 0, 9, 20, 70, 62, 22, 23, 26, 18, 83, 1, 22, 2, 6, 26, 1, 22, 0, 83, 18, 83, 55, 1, 30, 32, 22, 0, 0, 26, 28, 29, 62, 18, 29, 18, 20, 22, 1, 125, 85, 84, 89, 81, 115, 95, 84, 85, 83, 98, 85, 94, 84, 85, 66, 85, 66, 125, Byte.MAX_VALUE, 106, 28, 119, 74, 75, 92, 93, 65, 28, 83, 68, 81, 28, 86, 87, 81, 27, 25, 12, 122, 17, 44, 45, 58, 59, 39, 122, 53, 34, 55, 122, 48, 49, 55, 122, 39, 49, 55, 33, 38, 49, 74, 72, 93, 43, 72, 81, 78, 43, 68, 80, 65, 76, 74, 43, 65, 64, 70, 74, 65, 64, 87, 43, 72, 85, 54, Byte.MAX_VALUE, 125, 104, 30, 125, 100, 123, 30, 102, 121, 116, 117, Byte.MAX_VALUE, 30, 116, 117, 115, Byte.MAX_VALUE, 116, 117, 98, 30, 113, 102, 115, 3, 1, 20, 98, 2, 58, 37, 40, 37, 45, 98, 36, 126, 122, 120, 98, 40, 41, 47, 35, 40, 41, 47, 45, 56, 78, 46, 22, 9, 4, 9, 1, 78, 8, 82, 86, 84, 78, 4, 5, 3, 15, 4, 5, 78, 19, 5, 3, 21, 18, 5, 121, 123, 110, 24, 101, 115, 117, 24, 87, 64, 85, 24, 82, 83, 85, 72, 74, 95, 41, 84, 66, 68, 41, 102, 113, 100, 41, 99, 98, 100, 41, 116, 98, 100, 114, 117, 98, 45, 47, 58, 76, 3, 14, 14, 21, 11, 12, 12, 7, 16, 76, 20, 11, 6, 7, 13, 76, 6, 7, 1, 13, 6, 7, 16, 76, 3, 20, 1, 1, 3, 22, 96, 47, 35, 34, 33, 41, 39, 45, 96, 47, 56, 45, 96, 42, 43, 45, 33, 42, 43, 60, 96, 47, 57, 43, 61, 33, 35, 43, Utf8.REPLACEMENT_BYTE, 61, 40, 94, 17, 29, 28, 31, 23, 25, 19, 94, 17, 6, 19, 94, 20, 21, 19, 31, 20, 21, 2, 94, 17, 7, 21, 3, 31, 29, 21, 94, 3, 21, 19, 5, 2, 21, 121, 123, 110, 24, 81, 89, 89, 81, 90, 83, 24, 87, 87, 85, 24, 82, 83, 85, 89, 82, 83, 68, 30, 28, 9, Byte.MAX_VALUE, 54, 62, 62, 54, 61, 52, Byte.MAX_VALUE, 39, 62, 35, 51, 56, 34, Byte.MAX_VALUE, 53, 52, 50, 62, 53, 52, 35, 2, 0, 21, 99, Utf8.REPLACEMENT_BYTE, 38, 99, 59, 36, 41, 40, 34, 18, 41, 40, 46, 34, 41, 40, Utf8.REPLACEMENT_BYTE, 99, 44, 59, 46, 112, 110, 14, 98, 22, 18, 19, 41, 55, 87, 59, 79, 72, 74, 106, 116, 20, 126, 1, 9, 9, 116, 106, 10, 109, 16, 23, 23, 79, 81, 49, 72, 41, 36, 41, 106, 97, 104, 103, 103, 108, 101, 36, 106, 102, 124, 103, 125, Utf8.REPLACEMENT_BYTE, 51, 50, 58, 53, 59, 41, 46, 57, 31, 51, 56, 57, Utf8.REPLACEMENT_BYTE, 15, 30, 9, 13, 24, 9, 47, 3, 8, 9, 15, 86, 96, 118, 101, 109, 106, 69, 106, 96, 66, 97, 97, 96, 83, 89, 90, 64, 91, 81, 80, 71, 24, 18, 17, 11, 16, 26, 27, 12, 33, 18, 10, 27, 5, 16, 13, 23, 18, 7, 16, 43, 33, 113, 115, 115, 115, 45, 32, 44, 34, 45, 49, 3, 4, 17, 2, 4, 51, 31, 20, 21, 19, 113, 108, 105, 100, 117, 108, 100, 101, 123, 118, 102, 122};
    }

    public abstract int A1B(InterfaceC4743E6 interfaceC4743E6, InterfaceC4650CM<C5889Ww> interfaceC4650CM, Format format) throws C4746E9;

    public abstract void A1N(C4737E0 c4737e0, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws C4746E9;

    public abstract boolean A1P(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C4529AM;

    static {
        A0j();
        A0f = C5038Iz.A0h(A0Z(59, 76, 80));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public AbstractC41053G(int i, InterfaceC4743E6 interfaceC4743E6, @Nullable InterfaceC4650CM<C5889Ww> interfaceC4650CM, boolean z) {
        super(i);
        C4997IK.A04(C5038Iz.A02 >= 16);
        this.A0a = (InterfaceC4743E6) C4997IK.A01(interfaceC4743E6);
        this.A0Z = interfaceC4650CM;
        this.A0c = z;
        this.A0X = new C5895X2(0);
        this.A0Y = C5895X2.A02();
        this.A0W = new C4541AZ();
        this.A0b = new ArrayList();
        this.A0V = new MediaCodec.BufferInfo();
        this.A01 = 0;
        this.A02 = 0;
    }

    private int A0W(String str) {
        if (C5038Iz.A02 <= 25 && A0Z(263, 25, 64).equals(str)) {
            String str2 = C5038Iz.A06;
            if (A0e[5].charAt(22) != 'm') {
                String[] strArr = A0e;
                strArr[3] = "rXHSxRetqBcaMazmAuD1LrMN32rrN6yB";
                strArr[0] = "PYELojq5TDB6rkMOhN6BPW4xOGIFZ2Jw";
                if (str2.startsWith(A0Z(625, 7, 8)) || C5038Iz.A06.startsWith(A0Z(597, 7, 55)) || C5038Iz.A06.startsWith(A0Z(604, 7, 110)) || C5038Iz.A06.startsWith(A0Z(618, 7, 51))) {
                    return 2;
                }
            }
            throw new RuntimeException();
        }
        if (C5038Iz.A02 < 24) {
            if (A0Z(338, 22, 88).equals(str) || A0Z(360, 29, 116).equals(str)) {
                if (!A0Z(683, 8, 33).equals(C5038Iz.A03)) {
                    String str3 = C5038Iz.A03;
                    String A0Z = A0Z(691, 12, 106);
                    String[] strArr2 = A0e;
                    if (strArr2[1].charAt(9) != strArr2[6].charAt(9)) {
                        A0e[7] = "EJTrH92MD698cCrSnGocCFo99KF41O7G";
                        if (!A0Z.equals(str3)) {
                            if (!A0Z(703, 7, 118).equals(C5038Iz.A03)) {
                                if (A0Z(732, 7, 17).equals(C5038Iz.A03)) {
                                    return 1;
                                }
                                return 0;
                            }
                            return 1;
                        }
                        return 1;
                    }
                    throw new RuntimeException();
                }
                return 1;
            }
            return 0;
        }
        return 0;
    }

    private final long A0X() {
        return 0L;
    }

    public static MediaCodec.CryptoInfo A0Y(C5895X2 c5895x2, int i) {
        MediaCodec.CryptoInfo A02 = c5895x2.A02.A02();
        if (i == 0) {
            return A02;
        }
        if (A02.numBytesOfClearData == null) {
            String[] strArr = A0e;
            if (strArr[1].charAt(9) == strArr[6].charAt(9)) {
                throw new RuntimeException();
            }
            A0e[5] = "UbtyB27B24Biu3n6sBWjRVSN4hFFB4s1";
            A02.numBytesOfClearData = new int[1];
        }
        int[] iArr = A02.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return A02;
    }

    private ByteBuffer A0a(int i) {
        if (C5038Iz.A02 >= 21) {
            return this.A06.getInputBuffer(i);
        }
        return this.A0S[i];
    }

    private ByteBuffer A0b(int i) {
        if (C5038Iz.A02 >= 21) {
            return this.A06.getOutputBuffer(i);
        }
        return this.A0T[i];
    }

    private void A0c() {
        if (C5038Iz.A02 < 21) {
            this.A0S = this.A06.getInputBuffers();
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0d() throws C4529AM {
        if (this.A02 == 2) {
            A1G();
            A1I();
            return;
        }
        this.A0N = true;
        A1H();
    }

    private void A0e() {
        if (C5038Iz.A02 < 21) {
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0f() throws C4529AM {
        MediaFormat outputFormat = this.A06.getOutputFormat();
        if (this.A00 != 0 && outputFormat.getInteger(A0Z(739, 5, 6)) == 32 && outputFormat.getInteger(A0Z(716, 6, 81)) == 32) {
            this.A0O = true;
            return;
        }
        if (this.A0I) {
            outputFormat.setInteger(A0Z(632, 13, 29), 1);
        }
        A1K(this.A06, outputFormat);
    }

    private void A0g() {
        if (C5038Iz.A02 < 21) {
            this.A0S = null;
            this.A0T = null;
        }
    }

    private void A0h() {
        this.A03 = -1;
        this.A0X.A01 = null;
    }

    private void A0i() {
        this.A04 = -1;
        this.A0B = null;
    }

    private void A0k(C4739E2 c4739e2) throws C4529AM {
        throw C4529AM.A01(c4739e2, A0y());
    }

    private boolean A0l() {
        if (A0Z(147, 6, 32).equals(C5038Iz.A05)) {
            if (!A0Z(139, 4, 90).equals(C5038Iz.A06)) {
                if (A0Z(135, 4, 82).equals(C5038Iz.A06)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f6, code lost:
        if (r12.A0X.A03() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f8, code lost:
        r12.A0b.add(java.lang.Long.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0201, code lost:
        r12.A0X.A08();
        A1M(r12.A0X);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x020b, code lost:
        if (r6 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020e, code lost:
        r12.A06.queueInputBuffer(r12.A03, 0, r12.A0X.A01.limit(), r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0220, code lost:
        r12.A06.queueSecureInputBuffer(r12.A03, 0, A0Y(r12.A0X, r5), r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x022f, code lost:
        A0h();
        r12.A0J = true;
        r12.A01 = 0;
        r12.A0U.A04++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x023d, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x023e, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0247, code lost:
        throw com.facebook.ads.redexgen.p036X.C4529AM.A01(r1, A0y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
        if (r7 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        r12.A0C = false;
        r12.A0X.A01.put(com.facebook.ads.redexgen.p036X.AbstractC41053G.A0f);
        r12.A06.queueInputBuffer(r12.A03, 0, com.facebook.ads.redexgen.p036X.AbstractC41053G.A0f.length, 0, 0);
        A0h();
        r12.A0J = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
        if (r7 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
        if (r12.A0R == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
        r6 = -4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
        if (r6 != (-3)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c6, code lost:
        if (r12.A01 != 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
        r8 = r12.A07.A0P.size();
        r6 = com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
        if (r6[1].charAt(9) == r6[6].charAt(9)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
        com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e[7] = "0VatHXJ47YZXuQNTjh1Q4vWnAJchohqJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
        if (r7 >= r8) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
        r12.A0X.A01.put(r12.A07.A0P.get(r7));
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
        r6 = com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e;
        r6[3] = "zOhD8BhFeW0zpu1geu8qUgn88iwXK5ep";
        r6[0] = "60rX9qlLFkokv4JD1C8g9QKhync8N1Cu";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010e, code lost:
        if (r7 >= r8) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0111, code lost:
        r12.A01 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0113, code lost:
        r7 = r12.A0X.A01;
        r6 = com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0129, code lost:
        if (r6[1].charAt(9) == r6[6].charAt(9)) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012b, code lost:
        r6 = com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e;
        r6[1] = "39aArsNj3IDVPnG6lUIYrUviornu3auc";
        r6[6] = "ZVN5NvQX1lR02F2nkBpRehMiTRLfpSWC";
        r5 = r7.position();
        r6 = A10(r12.A0W, r12.A0X, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0145, code lost:
        r5 = r7.position();
        r6 = A10(r12.A0W, r12.A0X, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0154, code lost:
        if (r6 != (-5)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0158, code lost:
        if (r12.A01 != 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
        r12.A0X.A07();
        r12.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0161, code lost:
        A1L(r12.A0W.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0168, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
        if (r12.A0X.A04() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0173, code lost:
        if (r12.A01 != 2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0175, code lost:
        r12.A0X.A07();
        r12.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017c, code lost:
        r12.A0M = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0180, code lost:
        if (r12.A0J != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0182, code lost:
        A0d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0185, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0188, code lost:
        if (r12.A0G == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
        r12.A0K = true;
        r12.A06.queueInputBuffer(r12.A03, 0, 0, 0, 4);
        A0h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019d, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a6, code lost:
        throw com.facebook.ads.redexgen.p036X.C4529AM.A01(r1, A0y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a9, code lost:
        if (r12.A0Q == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b1, code lost:
        if (r12.A0X.A05() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b3, code lost:
        r12.A0X.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ba, code lost:
        if (r12.A01 != 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bc, code lost:
        r12.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01be, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01bf, code lost:
        r12.A0Q = false;
        r6 = r12.A0X.A0A();
        r12.A0R = A0w(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cf, code lost:
        if (r12.A0R == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d1, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d4, code lost:
        if (r12.A0D == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d6, code lost:
        if (r6 != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d8, code lost:
        com.facebook.ads.redexgen.p036X.C5018If.A0A(r12.A0X.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e7, code lost:
        if (r12.A0X.A01.position() != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e9, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ea, code lost:
        r12.A0D = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ec, code lost:
        r8 = r12.A0X.A00;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0m() throws com.facebook.ads.redexgen.p036X.C4529AM {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.AbstractC41053G.A0m():boolean");
    }

    private boolean A0n() {
        return this.A04 >= 0;
    }

    private boolean A0o(long j) {
        int size = this.A0b.size();
        for (int i = 0; i < size; i++) {
            long longValue = this.A0b.get(i).longValue();
            String[] strArr = A0e;
            if (strArr[1].charAt(9) == strArr[6].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[4] = "ML5bMotUrNJfefR5zyFOe6FKAXdvvO6A";
            strArr2[2] = "SdeYytwJjEjJxI17XZFSuNmI9VlWoLpo";
            if (longValue == j) {
                this.A0b.remove(i);
                if (A0e[5].charAt(22) != 'm') {
                    String[] strArr3 = A0e;
                    strArr3[4] = "PN0xo47Kt8nFjD42DkF1Rwv3kccfY0ZU";
                    strArr3[2] = "8XhLexKKIuuBUtz2cCFHUx77okN3o4VX";
                    return true;
                }
                String[] strArr4 = A0e;
                strArr4[1] = "MaO0vnTK96XnVNRleRSpONjFXCjP5Eov";
                strArr4[6] = "hUdEzwsPaliJglUJ7NraoDZ4Fn5DncmA";
                return false;
            }
        }
        return false;
    }

    private boolean A0p(long j, long j2) throws C4529AM {
        boolean A1P;
        int dequeueOutputBuffer;
        if (!A0n()) {
            if (this.A0F && this.A0K) {
                try {
                    dequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
                } catch (IllegalStateException unused) {
                    A0d();
                    if (this.A0N) {
                        A1G();
                    }
                    return false;
                }
            } else {
                dequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
            }
            if (dequeueOutputBuffer >= 0) {
                if (this.A0O) {
                    this.A0O = false;
                    this.A06.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return true;
                } else if (this.A0V.size == 0 && (this.A0V.flags & 4) != 0) {
                    A0d();
                    return false;
                } else {
                    this.A04 = dequeueOutputBuffer;
                    this.A0B = A0b(dequeueOutputBuffer);
                    ByteBuffer byteBuffer = this.A0B;
                    if (byteBuffer != null) {
                        byteBuffer.position(this.A0V.offset);
                        this.A0B.limit(this.A0V.offset + this.A0V.size);
                    }
                    this.A0P = A0o(this.A0V.presentationTimeUs);
                }
            } else if (dequeueOutputBuffer == -2) {
                A0f();
                return true;
            } else if (dequeueOutputBuffer == -3) {
                A0e();
                return true;
            } else {
                if (this.A0G && (this.A0M || this.A02 == 2)) {
                    A0d();
                }
                return false;
            }
        }
        boolean z = this.A0F;
        String[] strArr = A0e;
        if (strArr[3].charAt(8) != strArr[0].charAt(8)) {
            String[] strArr2 = A0e;
            strArr2[3] = "H6QEdKrNS5VKUI2eiDzJYDiDaOSTSHZm";
            strArr2[0] = "qtM0JqIstAlLtY5WeeeWIRjDSmIhrDzd";
            if (z && this.A0K) {
                try {
                    A1P = A1P(j, j2, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
                } catch (IllegalStateException unused2) {
                    A0d();
                    boolean z2 = this.A0N;
                    String[] strArr3 = A0e;
                    if (strArr3[4].charAt(18) == strArr3[2].charAt(18)) {
                        String[] strArr4 = A0e;
                        strArr4[3] = "kLeAoHdKyNjlIY3W2lnlzypZ7jBCZpds";
                        strArr4[0] = "12vglqLCD0wnh38LM4o4LF1q7CPuStNa";
                        if (z2) {
                            A1G();
                        }
                        return false;
                    }
                }
            } else {
                A1P = A1P(j, j2, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
            }
            if (A1P) {
                A1J(this.A0V.presentationTimeUs);
                boolean z3 = (this.A0V.flags & 4) != 0;
                A0i();
                if (!z3) {
                    return true;
                }
                A0d();
            }
            return false;
        }
        throw new RuntimeException();
    }

    public static boolean A0q(C4737E0 c4737e0) {
        String str = c4737e0.A02;
        if (C5038Iz.A02 > 17 || (!A0Z(573, 24, 89).equals(str) && !A0Z(426, 31, 118).equals(str))) {
            if (A0Z(147, 6, 32).equals(C5038Iz.A05)) {
                if (!A0Z(143, 4, 72).equals(C5038Iz.A06) || !c4737e0.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0r(String str) {
        if (C5038Iz.A02 > 23 || !A0Z(548, 25, 69).equals(str)) {
            if (C5038Iz.A02 <= 19) {
                if (A0Z(710, 6, 87).equals(C5038Iz.A03)) {
                    String[] strArr = A0e;
                    if (strArr[3].charAt(8) == strArr[0].charAt(8)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0e;
                    strArr2[1] = "95wFKgRrMS7zF0LnDUBUyEKLdOv2pw0Q";
                    strArr2[6] = "8UM2DR4qd3kvfN0lEIyvKJByOBGtF0J9";
                    if (A0Z(457, 31, 90).equals(str) || A0Z(488, 38, 100).equals(str)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0s(String str) {
        return C5038Iz.A02 == 21 && A0Z(526, 22, 34).equals(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (A0Z(404, 22, 19).equals(r4) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0t(java.lang.String r4) {
        /*
            int r0 = com.facebook.ads.redexgen.p036X.C5038Iz.A02
            r1 = 18
            if (r0 < r1) goto L81
            int r0 = com.facebook.ads.redexgen.p036X.C5038Iz.A02
            if (r0 != r1) goto L4a
            r2 = 389(0x185, float:5.45E-43)
            r1 = 15
            r0 = 34
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r3 = r0.equals(r4)
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e
            r0 = 3
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 8
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L85
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e
            java.lang.String r1 = "meV5e9Kkfi1Cw7qLNaZXa1JKO1Lv4Z7w"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "iFBSwhWIKfzcqDOwhwOBewnG37AI8L0V"
            r0 = 6
            r2[r0] = r1
            if (r3 != 0) goto L81
            r2 = 404(0x194, float:5.66E-43)
            r1 = 22
            r0 = 19
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L81
        L4a:
            int r1 = com.facebook.ads.redexgen.p036X.C5038Iz.A02
            r0 = 19
            if (r1 != r0) goto L83
            java.lang.String r3 = com.facebook.ads.redexgen.p036X.C5038Iz.A06
            r2 = 611(0x263, float:8.56E-43)
            r1 = 7
            r0 = 45
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L83
            r2 = 245(0xf5, float:3.43E-43)
            r1 = 18
            r0 = 38
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L81
            r2 = 263(0x107, float:3.69E-43)
            r1 = 25
            r0 = 64
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L83
        L81:
            r0 = 1
        L82:
            return r0
        L83:
            r0 = 0
            goto L82
        L85:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.AbstractC41053G.A0t(java.lang.String):boolean");
    }

    public static boolean A0u(String str, Format format) {
        return C5038Iz.A02 < 21 && format.A0P.isEmpty() && A0Z(313, 25, 36).equals(str);
    }

    public static boolean A0v(String str, Format format) {
        return C5038Iz.A02 <= 18 && format.A05 == 1 && A0Z(288, 25, 17).equals(str);
    }

    private boolean A0w(boolean z) throws C4529AM {
        if (this.A08 == null || (!z && this.A0c)) {
            return false;
        }
        int A7W = this.A08.A7W();
        if (A7W != 1) {
            return A7W != 4;
        }
        throw C4529AM.A01(this.A08.A6Y(), A0y());
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4741E4
    public void A12() {
        this.A07 = null;
        try {
            A1G();
            try {
                if (this.A08 != null) {
                    this.A0Z.ADs(this.A08);
                }
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ADs(this.A09);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ADs(this.A09);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.A08 != null) {
                    this.A0Z.ADs(this.A08);
                }
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ADs(this.A09);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ADs(this.A09);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4741E4
    public void A13() {
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4741E4
    public void A14() {
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4741E4
    public void A15(long j, boolean z) throws C4529AM {
        this.A0M = false;
        this.A0N = false;
        if (this.A06 != null) {
            A1F();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4741E4
    public void A16(boolean z) throws C4529AM {
        this.A0U = new C4626Bw();
    }

    public int A1A(MediaCodec mediaCodec, C4737E0 c4737e0, Format format, Format format2) {
        return 0;
    }

    public final MediaCodec A1C() {
        return this.A06;
    }

    public final C4737E0 A1D() {
        return this.A0A;
    }

    public C4737E0 A1E(InterfaceC4743E6 interfaceC4743E6, Format format, boolean z) throws C4746E9 {
        return interfaceC4743E6.A6N(format.A0O, z);
    }

    public void A1F() throws C4529AM {
        this.A05 = -9223372036854775807L;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        this.A0C = false;
        this.A0O = false;
        if (this.A0H || (this.A0E && this.A0K)) {
            A1G();
            A1I();
        } else {
            int i = this.A02;
            if (A0e[7].charAt(4) != 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[1] = "wbouPn2Ftm3cpLG8fvuyld6AKnPflzbx";
            strArr[6] = "bzy96m6ZRNxMDmYLQEfFnOCqhh49XGXp";
            if (i != 0) {
                A1G();
                A1I();
            } else {
                this.A06.flush();
                this.A0J = false;
            }
        }
        if (this.A0L && this.A07 != null) {
            this.A01 = 1;
        }
    }

    public void A1G() {
        this.A05 = -9223372036854775807L;
        A0h();
        A0i();
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        A0g();
        this.A0A = null;
        this.A0L = false;
        this.A0J = false;
        this.A0D = false;
        this.A0H = false;
        this.A00 = 0;
        this.A0G = false;
        this.A0E = false;
        this.A0I = false;
        this.A0C = false;
        this.A0O = false;
        this.A0K = false;
        this.A01 = 0;
        this.A02 = 0;
        if (this.A06 != null) {
            this.A0U.A01++;
            try {
                this.A06.stop();
                try {
                    this.A06.release();
                    this.A06 = null;
                    InterfaceC4649CL<C5889Ww> interfaceC4649CL = this.A08;
                    if (interfaceC4649CL != null && this.A09 != interfaceC4649CL) {
                        try {
                            this.A0Z.ADs(interfaceC4649CL);
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    this.A06 = null;
                    InterfaceC4649CL<C5889Ww> interfaceC4649CL2 = this.A08;
                    if (interfaceC4649CL2 != null && this.A09 != interfaceC4649CL2) {
                        try {
                            this.A0Z.ADs(interfaceC4649CL2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.A06.release();
                    this.A06 = null;
                    InterfaceC4649CL<C5889Ww> interfaceC4649CL3 = this.A08;
                    if (interfaceC4649CL3 != null && this.A09 != interfaceC4649CL3) {
                        try {
                            this.A0Z.ADs(interfaceC4649CL3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.A06 = null;
                    InterfaceC4649CL<C5889Ww> interfaceC4649CL4 = this.A08;
                    if (interfaceC4649CL4 != null && this.A09 != interfaceC4649CL4) {
                        try {
                            this.A0Z.ADs(interfaceC4649CL4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    public void A1H() throws C4529AM {
    }

    public final void A1I() throws C4529AM {
        Format format;
        long j;
        if (this.A06 != null || (format = this.A07) == null) {
            return;
        }
        this.A08 = this.A09;
        String str = format.A0O;
        MediaCrypto mediaCrypto = null;
        boolean z = false;
        InterfaceC4649CL<C5889Ww> interfaceC4649CL = this.A08;
        if (interfaceC4649CL != null) {
            C5889Ww A6x = interfaceC4649CL.A6x();
            if (A0e[5].charAt(22) == 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[1] = "HTFGGBgFgI6ylI68q0FeBZ95y7T9Xgss";
            strArr[6] = "P6HI8GYxdJJ1MGo6JXYXPe6FB7j5p6fI";
            if (A6x == null) {
                if (this.A08.A6Y() == null) {
                    return;
                }
            } else {
                mediaCrypto = A6x.A00();
                z = A6x.A01(str);
            }
            if (A0l()) {
                int A7W = this.A08.A7W();
                if (A7W == 1) {
                    throw C4529AM.A01(this.A08.A6Y(), A0y());
                }
                if (A0e[7].charAt(4) != 'H') {
                    if (A7W != 4) {
                        return;
                    }
                } else {
                    A0e[7] = "zdcyHT7sTCB3al7NiJFn52Vz5qRveBVU";
                    if (A7W != 4) {
                        return;
                    }
                }
            }
        }
        if (this.A0A == null) {
            try {
                this.A0A = A1E(this.A0a, this.A07, z);
                if (this.A0A == null && z) {
                    this.A0A = A1E(this.A0a, this.A07, false);
                    if (this.A0A != null) {
                        Log.w(A0Z(227, 18, 36), A0Z(153, 40, 114) + str + A0Z(0, 58, 116) + this.A0A.A02 + A0Z(58, 1, 76));
                    }
                }
            } catch (C4746E9 e) {
                A0k(new C4739E2(this.A07, e, z, -49998));
            }
            if (this.A0A == null) {
                A0k(new C4739E2(this.A07, (Throwable) null, z, -49999));
            }
        }
        if (!A1Q(this.A0A)) {
            return;
        }
        String str2 = this.A0A.A02;
        this.A00 = A0W(str2);
        this.A0D = A0u(str2, this.A07);
        this.A0H = A0t(str2);
        this.A0G = A0q(this.A0A);
        this.A0E = A0r(str2);
        this.A0F = A0s(str2);
        this.A0I = A0v(str2, this.A07);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            StringBuilder sb = new StringBuilder();
            String codecName = A0Z(659, 12, 120);
            sb.append(codecName);
            sb.append(str2);
            String codecName2 = sb.toString();
            C5035Iw.A02(codecName2);
            this.A06 = MediaCodec.createByCodecName(str2);
            C5035Iw.A00();
            String codecName3 = A0Z(645, 14, 72);
            C5035Iw.A02(codecName3);
            A1N(this.A0A, this.A06, this.A07, mediaCrypto);
            C5035Iw.A00();
            String codecName4 = A0Z(722, 10, 100);
            C5035Iw.A02(codecName4);
            this.A06.start();
            C5035Iw.A00();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            A1O(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            A0c();
        } catch (Exception e2) {
            A0k(new C4739E2(this.A07, e2, z, str2));
        }
        if (A7W() == 2) {
            j = SystemClock.elapsedRealtime() + 1000;
        } else {
            j = -9223372036854775807L;
        }
        this.A05 = j;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0U.A00++;
    }

    public void A1J(long j) {
    }

    public void A1K(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C4529AM {
    }

    public void A1L(Format format) throws C4529AM {
        DrmInitData drmInitData;
        MediaCodec mediaCodec;
        int A1A;
        Format format2 = this.A07;
        this.A07 = format;
        DrmInitData drmInitData2 = this.A07.A0H;
        if (format2 == null) {
            drmInitData = null;
        } else {
            drmInitData = format2.A0H;
        }
        if (!C5038Iz.A0g(drmInitData2, drmInitData)) {
            if (this.A07.A0H != null) {
                InterfaceC4650CM<C5889Ww> interfaceC4650CM = this.A0Z;
                if (A0e[5].charAt(22) != 'm') {
                    String[] strArr = A0e;
                    strArr[4] = "js0xY6djzstMh1ZGSSFwxrm9J2KEODfF";
                    strArr[2] = "gNDkR57A7pqknHdJ9eFPG5bc7UDUELIy";
                    if (interfaceC4650CM != null) {
                        Looper myLooper = Looper.myLooper();
                        DrmInitData drmInitData3 = this.A07.A0H;
                        if (A0e[5].charAt(22) != 'm') {
                            A0e[7] = "L1yeHoCGmaJe3p3nUxagVjwy9TYWwSRI";
                            this.A09 = interfaceC4650CM.A2P(myLooper, drmInitData3);
                            InterfaceC4649CL<C5889Ww> interfaceC4649CL = this.A09;
                            if (interfaceC4649CL == this.A08) {
                                InterfaceC4650CM<C5889Ww> interfaceC4650CM2 = this.A0Z;
                                String[] strArr2 = A0e;
                                if (strArr2[1].charAt(9) == strArr2[6].charAt(9)) {
                                    throw new RuntimeException();
                                }
                                String[] strArr3 = A0e;
                                strArr3[1] = "PNJFXv8k8SK4Yjj8VNQjLQpnTp0fAy1J";
                                strArr3[6] = "VCM67JEqNnPycf67Mw9BgN4gUhlxC0Ru";
                                interfaceC4650CM2.ADs(interfaceC4649CL);
                            }
                        }
                    } else {
                        throw C4529AM.A01(new IllegalStateException(A0Z(193, 34, 103)), A0y());
                    }
                }
                throw new RuntimeException();
            }
            this.A09 = null;
        }
        boolean z = false;
        if (this.A09 == this.A08 && (mediaCodec = this.A06) != null && (A1A = A1A(mediaCodec, this.A0A, format2, this.A07)) != 0) {
            if (A1A == 1) {
                z = true;
            } else if (A1A == 3) {
                z = true;
                this.A0L = true;
                this.A01 = 1;
                int i = this.A00;
                this.A0C = i == 2 || (i == 1 && this.A07.A0F == format2.A0F && this.A07.A08 == format2.A08);
            } else {
                throw new IllegalStateException();
            }
        }
        if (!z) {
            if (this.A0J) {
                this.A02 = 1;
                return;
            }
            A1G();
            A1I();
        }
    }

    public void A1M(C5895X2 c5895x2) {
    }

    public void A1O(String str, long j, long j2) {
    }

    public boolean A1Q(C4737E0 c4737e0) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public boolean A8R() {
        return this.A0N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r3 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        r3 = (r6.A05 > (-9223372036854775807L) ? 1 : (r6.A05 == (-9223372036854775807L) ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e[7].charAt(4) == 'H') goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        r2 = com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e;
        r2[4] = "x7dDRka8TdETs6VLaaF6zooftcMnhKq2";
        r2[2] = "EId5jOcDiZLe1q4ZwHFfLyVQFAikb5sI";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r3 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
        if (android.os.SystemClock.elapsedRealtime() >= r6.A05) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
        r2 = com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e;
        r2[3] = "3vglA6G8yuA12iVw0aFHPuEKtU4GGV7V";
        r2[0] = "dEcUfU5Lns9loW0elZLaj7FKzckicWHS";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (r3 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r3 == false) goto L13;
     */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A8c() {
        /*
            r6 = this;
            com.facebook.ads.internal.exoplayer2.Format r0 = r6.A07
            if (r0 == 0) goto L8d
            boolean r3 = r6.A0R
            java.lang.String[] r1 = com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e
            r0 = 5
            r1 = r1[r0]
            r0 = 22
            char r1 = r1.charAt(r0)
            r0 = 109(0x6d, float:1.53E-43)
            if (r1 == r0) goto L8f
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e
            java.lang.String r1 = "4HO9JQHKOwc6R3VWcS8R4aXAnHys3aci"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "eJ1ha0lSNb53SSfCNHliM2QVteujQRGV"
            r0 = 6
            r2[r0] = r1
            if (r3 != 0) goto L8d
            boolean r0 = r6.A18()
            if (r0 != 0) goto L79
            boolean r3 = r6.A0n()
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e
            r0 = 3
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 8
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L8a
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e
            java.lang.String r1 = "OQSQFxnlZZo22DxvkKeXHq8FF7pzfl1u"
            r0 = 5
            r2[r0] = r1
            if (r3 != 0) goto L79
        L4a:
            long r4 = r6.A05
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.String[] r1 = com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e
            r0 = 7
            r1 = r1[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            r0 = 72
            if (r1 == r0) goto L7b
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e
            java.lang.String r1 = "x7dDRka8TdETs6VLaaF6zooftcMnhKq2"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "EId5jOcDiZLe1q4ZwHFfLyVQFAikb5sI"
            r0 = 2
            r2[r0] = r1
            if (r3 == 0) goto L8d
        L6f:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r1 = r6.A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8d
        L79:
            r0 = 1
        L7a:
            return r0
        L7b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.AbstractC41053G.A0e
            java.lang.String r1 = "3vglA6G8yuA12iVw0aFHPuEKtU4GGV7V"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "dEcUfU5Lns9loW0elZLaj7FKzckicWHS"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L8d
            goto L6f
        L8a:
            if (r3 != 0) goto L79
            goto L4a
        L8d:
            r0 = 0
            goto L7a
        L8f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.AbstractC41053G.A8c():boolean");
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final void ADz(long j, long j2) throws C4529AM {
        if (this.A0N) {
            A1H();
            return;
        }
        if (this.A07 == null) {
            this.A0Y.A07();
            int A10 = A10(this.A0W, this.A0Y, true);
            if (A10 == -5) {
                A1L(this.A0W.A00);
            } else if (A10 == -4) {
                boolean A04 = this.A0Y.A04();
                if (A0e[5].charAt(22) == 'm') {
                    throw new RuntimeException();
                }
                String[] strArr = A0e;
                strArr[3] = "l4f2eN3vcaE4L0NqH64hfjdivD8twkW1";
                strArr[0] = "qiNXaKhyD6I995l1LklLucgRLjJ4pFFW";
                C4997IK.A04(A04);
                this.A0M = true;
                A0d();
                return;
            } else {
                return;
            }
        }
        A1I();
        if (this.A06 != null) {
            C5035Iw.A02(A0Z(671, 12, 16));
            do {
            } while (A0p(j, j2));
            do {
            } while (A0m());
            C5035Iw.A00();
        } else {
            this.A0U.A07 += A0z(j);
            this.A0Y.A07();
            int A102 = A10(this.A0W, this.A0Y, false);
            if (A102 == -5) {
                A1L(this.A0W.A00);
            } else if (A102 == -4) {
                C4997IK.A04(this.A0Y.A04());
                this.A0M = true;
                A0d();
            }
        }
        this.A0U.A00();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4562Au
    public final int AF7(Format format) throws C4529AM {
        try {
            return A1B(this.A0a, this.A0Z, format);
        } catch (C4746E9 e) {
            throw C4529AM.A01(e, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4741E4, com.facebook.ads.redexgen.p036X.InterfaceC4562Au
    public final int AF9() {
        return 8;
    }
}
