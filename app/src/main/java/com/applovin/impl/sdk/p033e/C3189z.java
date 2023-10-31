package com.applovin.impl.sdk.p033e;

import com.applovin.impl.sdk.C3214m;

/* renamed from: com.applovin.impl.sdk.e.z */
/* loaded from: classes.dex */
public class C3189z extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final Runnable f8310a;

    public C3189z(C3214m c3214m, Runnable runnable) {
        this(c3214m, false, runnable);
    }

    public C3189z(C3214m c3214m, boolean z, Runnable runnable) {
        super("TaskRunnable", c3214m, z);
        this.f8310a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8310a.run();
    }
}
