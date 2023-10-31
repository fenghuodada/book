package com.vungle.warren.persistence;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: com.vungle.warren.persistence.m */
/* loaded from: classes3.dex */
public final class CallableC9949m implements Callable<Collection<String>> {

    /* renamed from: a */
    public final /* synthetic */ C9928h f19972a;

    public CallableC9949m(C9928h c9928h) {
        this.f19972a = c9928h;
    }

    @Override // java.util.concurrent.Callable
    public final Collection<String> call() throws Exception {
        ArrayList m1396c;
        synchronized (this.f19972a) {
            m1396c = C9928h.m1396c(this.f19972a);
        }
        return m1396c;
    }
}
