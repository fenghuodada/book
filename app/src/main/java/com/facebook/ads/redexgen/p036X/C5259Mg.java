package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Mg */
/* loaded from: assets/audience_network.dex */
public final class C5259Mg {
    @Nullable
    public static C5259Mg A02;
    public final C5691Th A00;
    public final C5261Mi A01;

    public C5259Mg(C5953Xy c5953Xy, Executor executor, C44639H c44639h) {
        this.A01 = new C5261Mi(c5953Xy);
        this.A00 = new C5691Th(executor, c44639h, c5953Xy);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C5953Xy c5953Xy, Executor executor, C44639H c44639h) {
        if (!C5064JR.A10(c5953Xy)) {
            return;
        }
        C5259Mg c5259Mg = A02;
        if (c5259Mg == null) {
            A02 = new C5259Mg(c5953Xy, executor, c44639h);
            A02.A00();
            return;
        }
        c5259Mg.A02(c44639h);
    }

    private void A02(C44639H c44639h) {
        this.A00.A07(c44639h);
    }
}
