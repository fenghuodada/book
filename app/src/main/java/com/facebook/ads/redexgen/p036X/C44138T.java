package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.8T */
/* loaded from: assets/audience_network.dex */
public final class C44138T {
    public static final AtomicReference<C5952Xx> A00 = new AtomicReference<>();

    @Nullable
    public static C5952Xx A00() {
        return A00.get();
    }

    public static void A01(C5952Xx c5952Xx) {
        if (c5952Xx == null) {
            return;
        }
        A00.compareAndSet(null, c5952Xx);
    }
}
