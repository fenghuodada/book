package com.google.android.datatransport.runtime.dagger.internal;

import javax.inject.InterfaceC10733a;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.a */
/* loaded from: classes.dex */
public final class C6498a<T> implements InterfaceC10733a<T> {

    /* renamed from: c */
    public static final Object f10234c = new Object();

    /* renamed from: a */
    public volatile InterfaceC10733a<T> f10235a;

    /* renamed from: b */
    public volatile Object f10236b = f10234c;

    public C6498a(InterfaceC6499b interfaceC6499b) {
        this.f10235a = interfaceC6499b;
    }

    /* renamed from: a */
    public static InterfaceC10733a m6298a(InterfaceC6499b interfaceC6499b) {
        return interfaceC6499b instanceof C6498a ? interfaceC6499b : new C6498a(interfaceC6499b);
    }

    @Override // javax.inject.InterfaceC10733a
    public final T get() {
        boolean z;
        T t = (T) this.f10236b;
        Object obj = f10234c;
        if (t == obj) {
            synchronized (this) {
                t = this.f10236b;
                if (t == obj) {
                    t = this.f10235a.get();
                    Object obj2 = this.f10236b;
                    if (obj2 != obj) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && obj2 != t) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t + ". This is likely due to a circular dependency.");
                    }
                    this.f10236b = t;
                    this.f10235a = null;
                }
            }
        }
        return t;
    }
}
