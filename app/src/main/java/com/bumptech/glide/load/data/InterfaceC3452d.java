package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.EnumC3444a;

/* renamed from: com.bumptech.glide.load.data.d */
/* loaded from: classes.dex */
public interface InterfaceC3452d<T> {

    /* renamed from: com.bumptech.glide.load.data.d$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3453a<T> {
        /* renamed from: c */
        void mo6590c(@NonNull Exception exc);

        /* renamed from: f */
        void mo6589f(@Nullable T t);
    }

    @NonNull
    /* renamed from: a */
    Class<T> mo6579a();

    /* renamed from: b */
    void mo6578b();

    void cancel();

    @NonNull
    /* renamed from: d */
    EnumC3444a mo6577d();

    /* renamed from: e */
    void mo6576e(@NonNull EnumC3432i enumC3432i, @NonNull InterfaceC3453a<? super T> interfaceC3453a);
}
