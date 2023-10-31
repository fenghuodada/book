package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.util.C3860j;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.model.o */
/* loaded from: classes.dex */
public interface InterfaceC3627o<Model, Data> {

    /* renamed from: com.bumptech.glide.load.model.o$a */
    /* loaded from: classes.dex */
    public static class C3628a<Data> {

        /* renamed from: a */
        public final InterfaceC3577g f9565a;

        /* renamed from: b */
        public final List<InterfaceC3577g> f9566b;

        /* renamed from: c */
        public final InterfaceC3452d<Data> f9567c;

        public C3628a() {
            throw null;
        }

        public C3628a(@NonNull InterfaceC3577g interfaceC3577g, @NonNull InterfaceC3452d<Data> interfaceC3452d) {
            List<InterfaceC3577g> emptyList = Collections.emptyList();
            C3860j.m6404b(interfaceC3577g);
            this.f9565a = interfaceC3577g;
            C3860j.m6404b(emptyList);
            this.f9566b = emptyList;
            C3860j.m6404b(interfaceC3452d);
            this.f9567c = interfaceC3452d;
        }
    }

    /* renamed from: a */
    boolean mo6574a(@NonNull Model model);

    @Nullable
    /* renamed from: b */
    C3628a<Data> mo6573b(@NonNull Model model, int i, int i2, @NonNull C3581i c3581i);
}
