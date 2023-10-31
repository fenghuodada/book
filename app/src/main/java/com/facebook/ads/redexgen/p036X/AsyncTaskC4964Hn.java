package com.facebook.ads.redexgen.p036X;

import android.os.AsyncTask;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Hn */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC4964Hn extends AsyncTask<AbstractC5539RE, Void, InterfaceC5526R1> implements InterfaceC5536RB {
    public static byte[] A04;
    public InterfaceC5528R3 A00;
    public C4957Hg A01;
    public Exception A02;
    public Executor A03;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-18, 25, -14, 30, 30, 26, -4, 15, 27, 31, 15, 29, 30, -2, 11, 29, 21, -54, 30, 11, 21, 15, 29, -54, 15, 34, 11, 13, 30, 22, 35, -54, 25, 24, 15, -54, 11, 28, 17, 31, 23, 15, 24, 30, -54, 25, 16, -54, 30, 35, 26, 15, -54, -14, 30, 30, 26, -4, 15, 27, 31, 15, 29, 30, 15, 27, 27, 23, -25, 57, 44, 56, 60, 44, 58, 59, -25, 45, 40, 48, 51, 44, 43, 1, -25, -20, 58, 36, 80, 80, 76, -4, 78, 65, 79, 76, 75, 74, 79, 65, -4, 69, 79, -4, 74, 81, 72, 72, -67, -48, -34, -37, -38, -39, -34, -48, -91, -117, -112, -49, -117, -109, -112, -34, -108, -91, 117, -112, -34};
    }

    public AsyncTaskC4964Hn(C4957Hg c4957Hg, InterfaceC5528R3 interfaceC5528R3, Executor executor) {
        this.A01 = c4957Hg;
        this.A00 = interfaceC5528R3;
        this.A03 = executor;
    }

    private final InterfaceC5526R1 A00(AbstractC5539RE... abstractC5539REArr) {
        if (C5158L0.A02(this)) {
            return null;
        }
        try {
            if (abstractC5539REArr != null) {
                try {
                    if (abstractC5539REArr.length > 0) {
                        InterfaceC5526R1 A0J = this.A01.A0J(abstractC5539REArr[0]);
                        if (this.A01.A0K().A04() && A0J != null) {
                            String.format(Locale.US, A01(108, 21, 6), Integer.valueOf(A0J.A7a()), A0J.getUrl(), A0J.A5p());
                        }
                        if (A0J != null) {
                            return A0J;
                        }
                        throw new IllegalStateException(A01(87, 21, 119));
                    }
                } catch (Exception e) {
                    this.A02 = e;
                    if (this.A01.A0K().A04()) {
                        String.format(Locale.US, A01(64, 23, 98), e.getMessage());
                    }
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 69));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            return null;
        }
    }

    private final void A03(InterfaceC5526R1 interfaceC5526R1) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.AAM(interfaceC5526R1);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5536RB
    public final void A5H(AbstractC5539RE abstractC5539RE) {
        super.executeOnExecutor(this.A03, abstractC5539RE);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ InterfaceC5526R1 doInBackground(AbstractC5539RE[] abstractC5539REArr) {
        if (C5158L0.A02(this)) {
            return null;
        }
        try {
            return A00(abstractC5539REArr);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.AAj(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(InterfaceC5526R1 interfaceC5526R1) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A03(interfaceC5526R1);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
