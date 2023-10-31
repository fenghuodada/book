package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.util.Arrays;
import okio.Utf8;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.1e */
/* loaded from: assets/audience_network.dex */
public final class C40071e extends AbstractC41053G implements InterfaceC5013Ia {
    public static byte[] A0E;
    public static String[] A0F = {"aLXIjAOeq43kD47uUx47KIQfBztZ5JR6", "bYDvuG1CO7Q3NDumZhhBhB8jHe", "lzauC9VKCpzgBdv7KHug0xPju0EyyDRc", "zBmjWuq", "FwqFg", "FmVSMSIXQUSd0OcxsELVimAN3SmZwHxI", "I9K2sHUvqtNZm1Rj9xJMtQcmEPzsJytW", "SRtBuggTCbvw2MXSYfok3SEL95E53gc0"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final C4596BS A0C;
    public final InterfaceC4602BY A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0E = new byte[]{7, 5, 16, 102, 27, 13, 11, 102, 41, 41, 43, 102, 44, 45, 43, 65, 67, 86, 32, 105, 97, 97, 105, 98, 107, 32, 124, 111, 121, 32, 106, 107, 109, 97, 106, 107, 124, 54, 57, 51, 37, 56, 62, 51, 121, 36, 56, 49, 35, 32, 54, 37, 50, 121, 59, 50, 54, 57, 53, 54, 52, 60, 64, 84, 69, 72, 78, 14, 83, 64, 86, 24, 19, 26, 21, 21, 30, 23, 86, 24, 20, 14, 21, 15, Utf8.REPLACEMENT_BYTE, 50, 37, 56, 59, 35, 50, 76, 65, 86, 75, 85, 72, 80, 65, 95, 83, 74, 31, 91, 92, 66, 71, 70, 31, 65, 91, 72, 87, 70, 66, 70, 78, 48, 50, 41, 47, 50, 41, 52, 57, 121, 107, 103, 122, 102, 111, 39, 120, 107, 126, 111, 70, 84, 88, 70, 64, 91, 82, 5, 26, 13, 16, 25, 19, 11, 26};
    }

    static {
        A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C40071e(Context context, InterfaceC4743E6 interfaceC4743E6, @Nullable InterfaceC4650CM<C5889Ww> interfaceC4650CM, boolean z, @Nullable Handler handler, @Nullable InterfaceC4597BT interfaceC4597BT, @Nullable C4582BE c4582be, InterfaceC4589BL... interfaceC4589BLArr) {
        this(context, interfaceC4743E6, interfaceC4650CM, z, handler, interfaceC4597BT, new C5902X9(c4582be, interfaceC4589BLArr));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C40071e(Context context, InterfaceC4743E6 interfaceC4743E6, @Nullable InterfaceC4650CM<C5889Ww> interfaceC4650CM, boolean z, @Nullable Handler handler, @Nullable InterfaceC4597BT interfaceC4597BT, InterfaceC4602BY interfaceC4602BY) {
        super(1, interfaceC4743E6, interfaceC4650CM, z);
        this.A0B = context.getApplicationContext();
        this.A0D = interfaceC4602BY;
        this.A0C = new C4596BS(handler, interfaceC4597BT);
        interfaceC4602BY.AEb(new C5900X7(this));
    }

    private int A00(C4737E0 c4737e0, Format format) {
        PackageManager packageManager;
        if (C5038Iz.A02 < 24) {
            if (A04(15, 22, 30).equals(c4737e0.A02)) {
                boolean z = true;
                if (C5038Iz.A02 == 23 && (packageManager = this.A0B.getPackageManager()) != null && packageManager.hasSystemFeature(A04(37, 25, 71))) {
                    z = false;
                }
                if (z) {
                    return -1;
                }
            }
        }
        return format.A09;
    }

    private final int A01(C4737E0 c4737e0, Format format, Format[] formatArr) {
        return A00(c4737e0, format);
    }

    @SuppressLint({"InlinedApi"})
    private final MediaFormat A02(Format format, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A04(113, 4, 59), str);
        mediaFormat.setInteger(A04(71, 13, 107), format.A05);
        mediaFormat.setInteger(A04(125, 11, 26), format.A0C);
        C4749EC.A06(mediaFormat, format.A0P);
        C4749EC.A04(mediaFormat, A04(99, 14, 34), i);
        if (C5038Iz.A02 >= 23) {
            mediaFormat.setInteger(A04(117, 8, 80), 0);
        }
        return mediaFormat;
    }

    private void A05() {
        long A6G = this.A0D.A6G(A8R());
        if (A6G != Long.MIN_VALUE) {
            if (!this.A08) {
                A6G = Math.max(this.A05, A6G);
            }
            this.A05 = A6G;
            this.A08 = false;
        }
    }

    public static boolean A08(String str) {
        if (C5038Iz.A02 < 24 && A04(0, 15, 88).equals(str)) {
            if (A04(136, 7, 37).equals(C5038Iz.A05) && (C5038Iz.A03.startsWith(A04(143, 8, 111)) || C5038Iz.A03.startsWith(A04(84, 7, 71)) || C5038Iz.A03.startsWith(A04(91, 8, 52)))) {
                return true;
            }
        }
        return false;
    }

    private final boolean A09(String str) {
        int A00 = C5015Ic.A00(str);
        if (A00 != 0) {
            boolean A8Q = this.A0D.A8Q(A00);
            if (A0F[5].charAt(2) != 'V') {
                throw new RuntimeException();
            }
            A0F[1] = "OP";
            if (A8Q) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G, com.facebook.ads.redexgen.p036X.AbstractC4741E4
    public final void A12() {
        try {
            this.A0D.ADm();
            try {
                super.A12();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A12();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G, com.facebook.ads.redexgen.p036X.AbstractC4741E4
    public final void A13() {
        super.A13();
        this.A0D.ADE();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G, com.facebook.ads.redexgen.p036X.AbstractC4741E4
    public final void A14() {
        A05();
        this.A0D.pause();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G, com.facebook.ads.redexgen.p036X.AbstractC4741E4
    public final void A15(long j, boolean z) throws C4529AM {
        super.A15(j, z);
        this.A0D.reset();
        this.A05 = j;
        this.A07 = true;
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G, com.facebook.ads.redexgen.p036X.AbstractC4741E4
    public final void A16(boolean z) throws C4529AM {
        super.A16(z);
        this.A0C.A05(this.A0U);
        int i = A11().A00;
        if (i != 0) {
            this.A0D.A5B(i);
        } else {
            this.A0D.A4o();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G
    public final int A1A(MediaCodec mediaCodec, C4737E0 c4737e0, Format format, Format format2) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x00cf, code lost:
        if (r7 != (-1)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00d7, code lost:
        if (r4.A0G(r17.A0C) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00db, code lost:
        if (r17.A05 == (-1)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00e3, code lost:
        if (r4.A0F(r17.A05) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00fa, code lost:
        if (r7 != (-1)) goto L52;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    /* JADX WARN: Incorrect condition in loop: B:98:0x0074 */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ec  */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A1B(com.facebook.ads.redexgen.p036X.InterfaceC4743E6 r15, com.facebook.ads.redexgen.p036X.InterfaceC4650CM<com.facebook.ads.redexgen.p036X.C5889Ww> r16, com.facebook.ads.internal.exoplayer2.Format r17) throws com.facebook.ads.redexgen.p036X.C4746E9 {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C40071e.A1B(com.facebook.ads.redexgen.X.E6, com.facebook.ads.redexgen.X.CM, com.facebook.ads.internal.exoplayer2.Format):int");
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G
    public final C4737E0 A1E(InterfaceC4743E6 interfaceC4743E6, Format format, boolean z) throws C4746E9 {
        C4737E0 A79;
        if (A09(format.A0O) && (A79 = interfaceC4743E6.A79()) != null) {
            return A79;
        }
        return super.A1E(interfaceC4743E6, format, z);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G
    public final void A1H() throws C4529AM {
        try {
            this.A0D.ADF();
        } catch (C4601BX e) {
            throw C4529AM.A01(e, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G
    public final void A1K(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C4529AM {
        int i;
        int[] iArr;
        int i2;
        MediaFormat mediaFormat2 = this.A06;
        if (mediaFormat2 != null) {
            i = C5015Ic.A00(mediaFormat2.getString(A04(113, 4, 59)));
            mediaFormat = this.A06;
        } else {
            i = this.A04;
        }
        int integer = mediaFormat.getInteger(A04(71, 13, 107));
        int integer2 = mediaFormat.getInteger(A04(125, 11, 26));
        if (this.A09 && integer == 6 && (i2 = this.A00) < 6) {
            iArr = new int[i2];
            for (int i3 = 0; i3 < this.A00; i3++) {
                iArr[i3] = i3;
            }
        } else {
            iArr = null;
        }
        try {
            this.A0D.A46(i, integer, integer2, 0, iArr, this.A02, this.A03);
        } catch (C4598BU e) {
            throw C4529AM.A01(e, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G
    public final void A1L(Format format) throws C4529AM {
        int i;
        super.A1L(format);
        this.A0C.A03(format);
        if (A04(62, 9, 49).equals(format.A0O)) {
            i = format.A0A;
        } else {
            i = 2;
        }
        this.A04 = i;
        this.A00 = format.A05;
        this.A02 = format.A06;
        this.A03 = format.A07;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G
    public final void A1M(C5895X2 c5895x2) {
        if (this.A07 && !c5895x2.A03()) {
            if (Math.abs(c5895x2.A00 - this.A05) > 500000) {
                this.A05 = c5895x2.A00;
            }
            this.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G
    public final void A1N(C4737E0 c4737e0, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.A01 = A01(c4737e0, format, A19());
        this.A09 = A08(c4737e0.A02);
        this.A0A = c4737e0.A04;
        MediaFormat A02 = A02(format, c4737e0.A01 == null ? A04(62, 9, 49) : c4737e0.A01, this.A01);
        mediaCodec.configure(A02, (Surface) null, mediaCrypto, 0);
        if (this.A0A) {
            this.A06 = A02;
            this.A06.setString(A04(113, 4, 59), format.A0O);
            return;
        }
        this.A06 = null;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G
    public final void A1O(String str, long j, long j2) {
        this.A0C.A06(str, j, j2);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G
    public final boolean A1P(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C4529AM {
        if (this.A0A && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.A0U.A08++;
            this.A0D.A7y();
            return true;
        } else {
            try {
                if (this.A0D.A7v(byteBuffer, j3)) {
                    mediaCodec.releaseOutputBuffer(i, false);
                    this.A0U.A06++;
                    return true;
                }
                return false;
            } catch (C4599BV | C4601BX e) {
                throw C4529AM.A01(e, A0y());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4741E4, com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final InterfaceC5013Ia A6w() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5013Ia
    public final C4549Ah A7E() {
        return this.A0D.A7E();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5013Ia
    public final long A7H() {
        if (A7W() == 2) {
            A05();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4741E4, com.facebook.ads.redexgen.p036X.InterfaceC4559Ar
    public final void A7z(int i, Object obj) throws C4529AM {
        if (i != 2) {
            if (i != 3) {
                super.A7z(i, obj);
                return;
            }
            this.A0D.AEU((C4581BD) obj);
            return;
        }
        InterfaceC4602BY interfaceC4602BY = this.A0D;
        if (A0F[7].charAt(17) == 'P') {
            throw new RuntimeException();
        }
        A0F[4] = "awvXiH99cLu1HaadjiPENScqQYAeI";
        interfaceC4602BY.setVolume(((Float) obj).floatValue());
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G, com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final boolean A8R() {
        return super.A8R() && this.A0D.A8R();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41053G, com.facebook.ads.redexgen.p036X.InterfaceC5909XG
    public final boolean A8c() {
        return this.A0D.A83() || super.A8c();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5013Ia
    public final C4549Ah AEf(C4549Ah c4549Ah) {
        return this.A0D.AEf(c4549Ah);
    }
}
