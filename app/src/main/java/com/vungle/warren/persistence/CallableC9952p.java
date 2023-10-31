package com.vungle.warren.persistence;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.vungle.warren.persistence.p */
/* loaded from: classes3.dex */
public final class CallableC9952p implements Callable<List<String>> {

    /* renamed from: a */
    public final /* synthetic */ String f19979a;

    /* renamed from: b */
    public final /* synthetic */ C9928h f19980b;

    public CallableC9952p(C9928h c9928h, String str) {
        this.f19980b = c9928h;
        this.f19979a = str;
    }

    @Override // java.util.concurrent.Callable
    public final List<String> call() throws Exception {
        return C9928h.m1395d(this.f19980b, this.f19979a);
    }
}
