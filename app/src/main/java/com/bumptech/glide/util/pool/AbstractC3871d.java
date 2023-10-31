package com.bumptech.glide.util.pool;

/* renamed from: com.bumptech.glide.util.pool.d */
/* loaded from: classes.dex */
public abstract class AbstractC3871d {

    /* renamed from: com.bumptech.glide.util.pool.d$a */
    /* loaded from: classes.dex */
    public static class C3872a extends AbstractC3871d {

        /* renamed from: a */
        public volatile boolean f9964a;

        /* renamed from: a */
        public final void m6390a() {
            if (this.f9964a) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
