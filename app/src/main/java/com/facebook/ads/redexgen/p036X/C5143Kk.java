package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Kk */
/* loaded from: assets/audience_network.dex */
public final class C5143Kk {
    public static byte[] A07;
    public static final ThreadFactoryC5248MV A08;
    public static final Executor A09;
    public long A00;
    @Nullable
    public InterfaceC5142Kj A01;
    @Nullable
    public Map<String, String> A02;
    public final C40422D A03;
    public final C5953Xy A04;
    public final C5144Kl A05;
    public final String A06;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{59, 107, 108, 51, 50, 57, 50, 59, 122, 105, 107, 119, 117, 78, 65, 68, 72, 67, 89, 82, 95, 72, 92, 88, 72, 94, 89, 82, 68, 73, 98, 88, 11, 121, 101, 17, 11, 100, 101, 10, 108, 99, 102, 102, 10, 88, 79, 73, 79, 67, 92, 79, 78, 20, 53, 122, 28, 51, 54, 54, 122, Utf8.REPLACEMENT_BYTE, 40, 40, 53, 40, 122, 57, 53, 62, Utf8.REPLACEMENT_BYTE, 122, 1, Byte.MAX_VALUE, 41, 7, 122, Byte.MAX_VALUE, 41, 15, 13, 6, 13, 26, 1, 11, 81, 90, 75, 72, 80, 77, 84, 40, 41, 0, 47, 42, 42, 14, 41, 41, 45};
    }

    static {
        A0A();
        A08 = new ThreadFactoryC5248MV();
        A09 = Executors.newCachedThreadPool(A08);
    }

    public C5143Kk(C5953Xy c5953Xy) {
        this(c5953Xy, C40432E.A00(c5953Xy.A00()));
    }

    public C5143Kk(C5953Xy c5953Xy, C40422D c40422d) {
        this.A00 = -1L;
        this.A04 = c5953Xy;
        this.A05 = C5144Kl.A00();
        this.A06 = C5147Ko.A01(c5953Xy);
        this.A03 = c40422d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC5528R3 A03(long j, C5140Kh c5140Kh) {
        return new C5711U1(this, c5140Kh, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C5953Xy c5953Xy = this.A04;
        if (c5953Xy == null || !C5545RK.A0A(c5953Xy)) {
            return;
        }
        C444690 c444690 = new C444690(A05(8, 5, 107));
        c444690.A03(1);
        this.A04.A06().A8y(A05(86, 7, 111), C44458z.A1w, c444690);
    }

    private void A0B(int i, String str) {
        String A05 = A05(93, 10, 22);
        C5128KV.A05(A05, A05(37, 16, 122), A05(0, 8, 90));
        C5128KV.A04(A05, String.format(Locale.US, A05(53, 26, 10), Integer.valueOf(i), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(C5115KH c5115kh) {
        InterfaceC5142Kj interfaceC5142Kj = this.A01;
        if (interfaceC5142Kj != null) {
            interfaceC5142Kj.AAi(c5115kh);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C5115KH c5115kh) {
        ExecutorC5239MM.A00(new C5709Tz(this, c5115kh));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(C5708Ty c5708Ty) {
        InterfaceC5142Kj interfaceC5142Kj = this.A01;
        if (interfaceC5142Kj != null) {
            interfaceC5142Kj.ACS(c5708Ty);
        }
    }

    private void A0L(C5708Ty c5708Ty) {
        InterfaceC44208a A04;
        ExecutorC5239MM.A00(new C5710U0(this, c5708Ty));
        if (C5064JR.A1m(this.A04) && (A04 = this.A04.A04()) != null) {
            A04.A5U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(String str, long j, C5140Kh c5140Kh) {
        String str2;
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            C5146Kn A06 = this.A05.A06(this.A04, str, j);
            C44639H A00 = A06.A00();
            C5952Xx A002 = this.A04.A00();
            A002.A01().A8s(A002, str);
            if (A00 != null) {
                C5064JR.A0O(this.A04).A2E(A00.A08());
                this.A04.A06().A9W();
                this.A03.A0N(A00.A06());
                C5139Kg.A05(A00.A05().A0B(), c5140Kh);
                C5259Mg.A01(this.A04, A09, A00);
                C444690 c444690 = new C444690(A05(30, 7, 123) + C5209Ls.A02());
                c444690.A04(1);
                c444690.A08(false);
                this.A04.A06().A9Q(A05(79, 7, 56), C44458z.A1W, c444690);
            }
            int i = C5141Ki.A00[A06.A01().ordinal()];
            if (i == 1) {
                C5708Ty c5708Ty = (C5708Ty) A06;
                if (A00 != null) {
                    if (A00.A05().A0E()) {
                        C5139Kg.A07(str, c5140Kh);
                    }
                    if (this.A02 != null) {
                        str2 = this.A02.get(A05(13, 17, 93));
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(A06.A02()) && !TextUtils.isEmpty(str2)) {
                        this.A04.A01().AEA(this.A04, str2, A06.A02());
                    }
                }
                this.A04.A0D().A2k(C5236MJ.A01(this.A00));
                A0L(c5708Ty);
            } else if (i != 2) {
                AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                this.A04.A0D().A2j(C5236MJ.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                A0D(C5115KH.A01(adErrorType, str));
            } else {
                C5707Tx c5707Tx = (C5707Tx) A06;
                String A04 = c5707Tx.A04();
                AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c5707Tx.A03(), AdErrorType.ERROR_MESSAGE);
                A0B(c5707Tx.A03(), A04);
                if (A04 == null) {
                    A04 = str;
                }
                this.A04.A0D().A2j(C5236MJ.A01(this.A00), adErrorTypeFromCode.getErrorCode(), A04, adErrorTypeFromCode.isPublicError());
                A0D(C5115KH.A01(adErrorTypeFromCode, A04));
            }
        } catch (Exception e2) {
            e = e2;
            String message = e.getMessage();
            AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
            this.A04.A0D().A2j(C5236MJ.A01(this.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            A0D(C5115KH.A01(adErrorType2, message));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j, C5140Kh c5140Kh) {
        A09.execute(new C5712U2(this, str, j, c5140Kh));
    }

    public final void A0O(C5140Kh c5140Kh) {
        this.A00 = System.currentTimeMillis();
        C445498.A0B(this.A04);
        if (C5139Kg.A08(c5140Kh)) {
            ExecutorC5250MX.A06.execute(new C5714U4(this));
            String A02 = C5139Kg.A02(c5140Kh);
            if (A02 != null) {
                this.A04.A0D().AFN();
                A0N(A02, 0L, c5140Kh);
                return;
            }
            AdErrorType adErrorType = AdErrorType.LOAD_TOO_FREQUENTLY;
            this.A04.A0D().A2j(C5236MJ.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage(), adErrorType.isPublicError());
            A0D(C5115KH.A01(adErrorType, null));
            return;
        }
        A09.execute(new C5713U3(this, c5140Kh));
    }

    public final void A0P(InterfaceC5142Kj interfaceC5142Kj) {
        this.A01 = interfaceC5142Kj;
    }
}
