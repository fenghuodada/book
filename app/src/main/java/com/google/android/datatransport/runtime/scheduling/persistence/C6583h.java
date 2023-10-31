package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.InterfaceC6499b;
import javax.inject.InterfaceC10733a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.h */
/* loaded from: classes.dex */
public final class C6583h implements InterfaceC6499b<String> {

    /* renamed from: a */
    public final InterfaceC10733a<Context> f10411a;

    public C6583h(InterfaceC10733a<Context> interfaceC10733a) {
        this.f10411a = interfaceC10733a;
    }

    @Override // javax.inject.InterfaceC10733a
    public final Object get() {
        String packageName = this.f10411a.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
