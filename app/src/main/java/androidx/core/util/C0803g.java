package androidx.core.util;

import androidx.annotation.NonNull;

/* renamed from: androidx.core.util.g */
/* loaded from: classes.dex */
public final class C0803g<T> extends C0802f<T> {

    /* renamed from: c */
    public final Object f2504c;

    public C0803g(int i) {
        super(i);
        this.f2504c = new Object();
    }

    @Override // androidx.core.util.C0802f, androidx.core.util.InterfaceC0801e
    /* renamed from: a */
    public final boolean mo6395a(@NonNull T t) {
        boolean mo6395a;
        synchronized (this.f2504c) {
            mo6395a = super.mo6395a(t);
        }
        return mo6395a;
    }

    @Override // androidx.core.util.C0802f, androidx.core.util.InterfaceC0801e
    /* renamed from: b */
    public final T mo6394b() {
        T t;
        synchronized (this.f2504c) {
            t = (T) super.mo6394b();
        }
        return t;
    }
}
