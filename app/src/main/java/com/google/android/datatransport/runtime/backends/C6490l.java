package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C6500c;
import com.google.android.datatransport.runtime.dagger.internal.InterfaceC6499b;
import com.google.android.datatransport.runtime.time.C6613c;
import com.google.android.datatransport.runtime.time.C6615d;
import com.google.android.datatransport.runtime.time.InterfaceC6611a;
import javax.inject.InterfaceC10733a;

/* renamed from: com.google.android.datatransport.runtime.backends.l */
/* loaded from: classes.dex */
public final class C6490l implements InterfaceC6499b<C6489k> {

    /* renamed from: a */
    public final InterfaceC10733a<Context> f10213a;

    /* renamed from: b */
    public final InterfaceC10733a<InterfaceC6611a> f10214b;

    /* renamed from: c */
    public final InterfaceC10733a<InterfaceC6611a> f10215c;

    public C6490l(C6500c c6500c) {
        C6613c c6613c = C6613c.C6614a.f10452a;
        C6615d c6615d = C6615d.C6616a.f10453a;
        this.f10213a = c6500c;
        this.f10214b = c6613c;
        this.f10215c = c6615d;
    }

    @Override // javax.inject.InterfaceC10733a
    public final Object get() {
        return new C6489k(this.f10213a.get(), this.f10214b.get(), this.f10215c.get());
    }
}
