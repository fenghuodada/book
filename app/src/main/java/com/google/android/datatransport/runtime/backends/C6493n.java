package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C6500c;
import com.google.android.datatransport.runtime.dagger.internal.InterfaceC6499b;
import javax.inject.InterfaceC10733a;

/* renamed from: com.google.android.datatransport.runtime.backends.n */
/* loaded from: classes.dex */
public final class C6493n implements InterfaceC6499b<C6491m> {

    /* renamed from: a */
    public final InterfaceC10733a<Context> f10221a;

    /* renamed from: b */
    public final InterfaceC10733a<C6489k> f10222b;

    public C6493n(C6500c c6500c, C6490l c6490l) {
        this.f10221a = c6500c;
        this.f10222b = c6490l;
    }

    @Override // javax.inject.InterfaceC10733a
    public final Object get() {
        return new C6491m(this.f10221a.get(), this.f10222b.get());
    }
}
