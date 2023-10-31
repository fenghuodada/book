package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.InterfaceC3584l;
import java.util.ArrayList;

/* renamed from: com.bumptech.glide.provider.f */
/* loaded from: classes.dex */
public final class C3819f {

    /* renamed from: a */
    public final ArrayList f9845a = new ArrayList();

    /* renamed from: com.bumptech.glide.provider.f$a */
    /* loaded from: classes.dex */
    public static final class C3820a<T> {

        /* renamed from: a */
        public final Class<T> f9846a;

        /* renamed from: b */
        public final InterfaceC3584l<T> f9847b;

        public C3820a(@NonNull Class<T> cls, @NonNull InterfaceC3584l<T> interfaceC3584l) {
            this.f9846a = cls;
            this.f9847b = interfaceC3584l;
        }
    }

    @Nullable
    /* renamed from: a */
    public final synchronized <Z> InterfaceC3584l<Z> m6472a(@NonNull Class<Z> cls) {
        int size = this.f9845a.size();
        for (int i = 0; i < size; i++) {
            C3820a c3820a = (C3820a) this.f9845a.get(i);
            if (c3820a.f9846a.isAssignableFrom(cls)) {
                return (InterfaceC3584l<Z>) c3820a.f9847b;
            }
        }
        return null;
    }
}
