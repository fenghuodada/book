package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.InterfaceC0801e;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.data.InterfaceC3454e;
import com.bumptech.glide.load.engine.RunnableC3535j;
import com.bumptech.glide.util.C3860j;
import com.bumptech.glide.util.pool.C3863a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.v */
/* loaded from: classes.dex */
public final class C3570v<Data, ResourceType, Transcode> {

    /* renamed from: a */
    public final InterfaceC0801e<List<Throwable>> f9487a;

    /* renamed from: b */
    public final List<? extends C3542l<Data, ResourceType, Transcode>> f9488b;

    /* renamed from: c */
    public final String f9489c;

    public C3570v(Class cls, Class cls2, Class cls3, List list, C3863a.C3866c c3866c) {
        this.f9487a = c3866c;
        if (!list.isEmpty()) {
            this.f9488b = list;
            this.f9489c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: a */
    public final InterfaceC3573x m6612a(int i, int i2, @NonNull C3581i c3581i, InterfaceC3454e interfaceC3454e, RunnableC3535j.C3537b c3537b) throws C3566s {
        InterfaceC0801e<List<Throwable>> interfaceC0801e = this.f9487a;
        List<Throwable> mo6394b = interfaceC0801e.mo6394b();
        C3860j.m6404b(mo6394b);
        List<Throwable> list = mo6394b;
        try {
            List<? extends C3542l<Data, ResourceType, Transcode>> list2 = this.f9488b;
            int size = list2.size();
            InterfaceC3573x interfaceC3573x = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC3573x = list2.get(i3).m6645a(i, i2, c3581i, interfaceC3454e, c3537b);
                } catch (C3566s e) {
                    list.add(e);
                }
                if (interfaceC3573x != null) {
                    break;
                }
            }
            if (interfaceC3573x != null) {
                return interfaceC3573x;
            }
            throw new C3566s(this.f9489c, new ArrayList(list));
        } finally {
            interfaceC0801e.mo6395a(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f9488b.toArray()) + '}';
    }
}
