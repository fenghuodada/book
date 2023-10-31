package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.e */
/* loaded from: classes.dex */
public interface InterfaceC3454e<T> {

    /* renamed from: com.bumptech.glide.load.data.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3455a<T> {
        @NonNull
        /* renamed from: a */
        Class<T> mo6524a();

        @NonNull
        /* renamed from: b */
        InterfaceC3454e<T> mo6523b(@NonNull T t);
    }

    @NonNull
    /* renamed from: a */
    T mo6526a() throws IOException;

    /* renamed from: b */
    void mo6525b();
}
