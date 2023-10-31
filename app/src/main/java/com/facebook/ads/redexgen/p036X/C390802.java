package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.02 */
/* loaded from: assets/audience_network.dex */
public final class C390802<T> {
    @Nullable
    public final T A00;
    @Nullable
    public final Throwable A01;
    public final boolean A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.02 != com.facebook.ads.cache.api.CacheResponse<T> */
    public C390802(boolean z, @Nullable T t) {
        this.A02 = z;
        this.A00 = t;
        this.A01 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.02 != com.facebook.ads.cache.api.CacheResponse<T> */
    public C390802(boolean z, @Nullable T result, @Nullable Throwable th) {
        this.A02 = z;
        this.A00 = result;
        this.A01 = th;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.02 != com.facebook.ads.cache.api.CacheResponse<T> */
    @Nullable
    public final T A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.02 != com.facebook.ads.cache.api.CacheResponse<T> */
    public final boolean A01() {
        return this.A02;
    }
}
