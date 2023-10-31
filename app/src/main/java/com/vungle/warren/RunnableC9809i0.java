package com.vungle.warren;

import com.vungle.warren.utility.C10085g;

/* renamed from: com.vungle.warren.i0 */
/* loaded from: classes3.dex */
public final class RunnableC9809i0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Boolean f19553a;

    /* renamed from: b */
    public final /* synthetic */ C9818j0 f19554b;

    public RunnableC9809i0(C9818j0 c9818j0, Boolean bool) {
        this.f19554b = c9818j0;
        this.f19553a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10085g.m1273a(this.f19554b.f19602a, "is_coppa", this.f19553a);
    }
}
