package com.bumptech.glide.load.engine;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.data.InterfaceC3452d;

/* renamed from: com.bumptech.glide.load.engine.h */
/* loaded from: classes.dex */
public interface InterfaceC3532h {

    /* renamed from: com.bumptech.glide.load.engine.h$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3533a {
        /* renamed from: a */
        void mo6664a(InterfaceC3577g interfaceC3577g, Exception exc, InterfaceC3452d<?> interfaceC3452d, EnumC3444a enumC3444a);

        /* renamed from: c */
        void mo6663c();

        /* renamed from: d */
        void mo6662d(InterfaceC3577g interfaceC3577g, @Nullable Object obj, InterfaceC3452d<?> interfaceC3452d, EnumC3444a enumC3444a, InterfaceC3577g interfaceC3577g2);
    }

    /* renamed from: b */
    boolean mo6610b();

    void cancel();
}
