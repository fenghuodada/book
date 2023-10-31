package com.facebook.ads.redexgen.p036X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Tk */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC5694Tk<T> extends AbstractRunnableC5165L8 {
    public final WeakReference<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Tk != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public AbstractC5694Tk(T t) {
        this.A00 = new WeakReference<>(t);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Tk != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public final T A07() {
        return this.A00.get();
    }
}
