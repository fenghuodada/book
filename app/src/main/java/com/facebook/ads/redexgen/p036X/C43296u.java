package com.facebook.ads.redexgen.p036X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.6u */
/* loaded from: assets/audience_network.dex */
public final class C43296u<T> {
    public final int A00;
    public final int A01;
    public final T A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6u != com.facebook.ads.internal.botdetection.signals.model.BundledSignalMetadata<T> */
    public C43296u(T bundledSignalMetadataKey, int i, int i2) {
        this.A02 = bundledSignalMetadataKey;
        this.A00 = i;
        this.A01 = i2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6u != com.facebook.ads.internal.botdetection.signals.model.BundledSignalMetadata<T> */
    private boolean A00() {
        int i;
        int i2 = this.A00;
        return i2 > 0 && i2 < 9999 && (i = this.A01) > 0 && i < 10000 && i2 < i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6u != com.facebook.ads.internal.botdetection.signals.model.BundledSignalMetadata<T> */
    public final T A01() {
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6u != com.facebook.ads.internal.botdetection.signals.model.BundledSignalMetadata<T> */
    public final boolean A02() {
        return A00() && Build.VERSION.SDK_INT >= this.A00 && Build.VERSION.SDK_INT < this.A01;
    }
}
