package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@SuppressLint({"CatchGeneralException"})
/* renamed from: com.facebook.ads.redexgen.X.L8 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractRunnableC5165L8 implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC5156Ky> A04;
    @Nullable
    public final C5154Kw A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{124, 91, 64, 64, 79, 76, 66, 75, 14, 77, 92, 75, 79, 90, 75, 74, 0, 14, 122, 70, 92, 75, 79, 74, 20, 14};
    }

    public abstract void A06();

    static {
        A02();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public AbstractRunnableC5165L8() {
        if (A03.get()) {
            this.A00 = C5170LD.A01(new C5169LC(A01(0, 26, 90) + Thread.currentThread().getName()));
            return;
        }
        this.A00 = null;
    }

    public static void A03(boolean z) {
        A03.set(z);
    }

    public static void A04(boolean z, InterfaceC5156Ky interfaceC5156Ky) {
        A02.set(z);
        A04.set(interfaceC5156Ky);
    }

    @Nullable
    public final C5154Kw A05() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C5170LD.A03(this);
            }
            A06();
            if (A03.get()) {
                C5170LD.A04(this);
            }
        } catch (Throwable t) {
            C5158L0.A00(t, this);
        }
    }
}
