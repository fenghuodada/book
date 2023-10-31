package com.vungle.warren.persistence;

import java.util.concurrent.Callable;

/* renamed from: com.vungle.warren.persistence.t */
/* loaded from: classes3.dex */
public final class CallableC9956t implements Callable<Object> {

    /* renamed from: a */
    public final /* synthetic */ String f19989a;

    /* renamed from: b */
    public final /* synthetic */ Class f19990b;

    /* renamed from: c */
    public final /* synthetic */ C9928h f19991c;

    public CallableC9956t(C9928h c9928h, Class cls, String str) {
        this.f19991c = c9928h;
        this.f19989a = str;
        this.f19990b = cls;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f19989a;
        return C9928h.m1398a(this.f19991c, this.f19990b, str);
    }
}
