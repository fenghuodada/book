package com.facebook.ads.redexgen.p036X;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.ads.redexgen.X.Uw */
/* loaded from: assets/audience_network.dex */
public final class C5768Uw implements InterfaceC4974Hx {
    public static String[] A03 = {"zA1HDLVhPd9PsL9PenCbpcrAKXxlN0d6", "FLS1DqH1RbizqOpj", "1z8O9NEtb5xyjYGA", "8w8GUSv0BTEQmaLhHrYTkFjQIFXWxu0p", "o1jGjvwpoOOHSDmJh0w1BZ4ZQReO8O7V", "", "IXAYHKYtOagUrLCRc2OBPi2ErH2JE5Q2", "ufrZt7t49gDVq6vRzV1VlqPqnp3Kfu3W"};
    public HandlerC4968Hr<? extends InterfaceC4969Hs> A00;
    public IOException A01;
    public final ExecutorService A02;

    public C5768Uw(String str) {
        this.A02 = C5038Iz.A0T(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Hs> */
    public final <T extends InterfaceC4969Hs> long A04(T loadable, InterfaceC4967Hq<T> interfaceC4967Hq, int i) {
        Looper myLooper = Looper.myLooper();
        C4997IK.A04(myLooper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC4968Hr(this, myLooper, loadable, interfaceC4967Hq, i, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            HandlerC4968Hr<? extends InterfaceC4969Hs> handlerC4968Hr = this.A00;
            if (handlerC4968Hr != null) {
                if (A03[0].charAt(1) != 'f') {
                    String[] strArr = A03;
                    strArr[2] = "ShO16ogjgPVIHMzl";
                    strArr[1] = "8gZONBnlwtDMou1V";
                    if (i == Integer.MIN_VALUE) {
                        i = handlerC4968Hr.A03;
                    }
                    handlerC4968Hr.A05(i);
                    return;
                }
                throw new RuntimeException();
            }
            return;
        }
        throw iOException;
    }

    public final void A07(@Nullable InterfaceC4970Ht interfaceC4970Ht) {
        HandlerC4968Hr<? extends InterfaceC4969Hs> handlerC4968Hr = this.A00;
        if (handlerC4968Hr != null) {
            handlerC4968Hr.A07(true);
        }
        if (interfaceC4970Ht != null) {
            this.A02.execute(new RunnableC4971Hu(interfaceC4970Ht));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
