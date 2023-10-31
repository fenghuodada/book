package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.InterfaceC0801e;
import com.bumptech.glide.C3433j;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.EnumC3446c;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.InterfaceC3584l;
import com.bumptech.glide.load.InterfaceC3585m;
import com.bumptech.glide.load.data.InterfaceC3454e;
import com.bumptech.glide.load.engine.RunnableC3535j;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.load.resource.transcode.InterfaceC3775e;
import com.bumptech.glide.util.C3860j;
import com.bumptech.glide.util.pool.C3863a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.l */
/* loaded from: classes.dex */
public final class C3542l<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    public final Class<DataType> f9395a;

    /* renamed from: b */
    public final List<? extends InterfaceC3583k<DataType, ResourceType>> f9396b;

    /* renamed from: c */
    public final InterfaceC3775e<ResourceType, Transcode> f9397c;

    /* renamed from: d */
    public final InterfaceC0801e<List<Throwable>> f9398d;

    /* renamed from: e */
    public final String f9399e;

    public C3542l(Class cls, Class cls2, Class cls3, List list, InterfaceC3775e interfaceC3775e, C3863a.C3866c c3866c) {
        this.f9395a = cls;
        this.f9396b = list;
        this.f9397c = interfaceC3775e;
        this.f9398d = c3866c;
        this.f9399e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final InterfaceC3573x m6645a(int i, int i2, @NonNull C3581i c3581i, InterfaceC3454e interfaceC3454e, RunnableC3535j.C3537b c3537b) throws C3566s {
        InterfaceC3573x interfaceC3573x;
        InterfaceC3585m interfaceC3585m;
        boolean z;
        EnumC3446c enumC3446c;
        boolean z2;
        InterfaceC3577g c3530f;
        InterfaceC0801e<List<Throwable>> interfaceC0801e = this.f9398d;
        List<Throwable> mo6394b = interfaceC0801e.mo6394b();
        C3860j.m6404b(mo6394b);
        List<Throwable> list = mo6394b;
        try {
            InterfaceC3573x<ResourceType> m6644b = m6644b(interfaceC3454e, i, i2, c3581i, list);
            interfaceC0801e.mo6395a(list);
            RunnableC3535j runnableC3535j = RunnableC3535j.this;
            runnableC3535j.getClass();
            Class<?> cls = m6644b.get().getClass();
            EnumC3444a enumC3444a = EnumC3444a.RESOURCE_DISK_CACHE;
            EnumC3444a enumC3444a2 = c3537b.f9387a;
            C3534i<R> c3534i = runnableC3535j.f9361a;
            InterfaceC3584l interfaceC3584l = null;
            if (enumC3444a2 != enumC3444a) {
                InterfaceC3585m m6665e = c3534i.m6665e(cls);
                interfaceC3573x = m6665e.mo6501a(runnableC3535j.f9368h, m6644b, runnableC3535j.f9372l, runnableC3535j.f9373m);
                interfaceC3585m = m6665e;
            } else {
                interfaceC3573x = m6644b;
                interfaceC3585m = null;
            }
            if (!m6644b.equals(interfaceC3573x)) {
                m6644b.mo6510a();
            }
            if (c3534i.f9339c.f9077b.f9142d.m6472a(interfaceC3573x.mo6509c()) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C3433j c3433j = c3534i.f9339c.f9077b;
                c3433j.getClass();
                InterfaceC3584l m6472a = c3433j.f9142d.m6472a(interfaceC3573x.mo6509c());
                if (m6472a != null) {
                    enumC3446c = m6472a.mo6511b(runnableC3535j.f9375o);
                    interfaceC3584l = m6472a;
                } else {
                    throw new C3433j.C3437d(interfaceC3573x.mo6509c());
                }
            } else {
                enumC3446c = EnumC3446c.NONE;
            }
            InterfaceC3577g interfaceC3577g = runnableC3535j.f9384x;
            ArrayList m6668b = c3534i.m6668b();
            int size = m6668b.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    if (((InterfaceC3627o.C3628a) m6668b.get(i3)).f9565a.equals(interfaceC3577g)) {
                        z2 = true;
                        break;
                    }
                    i3++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (runnableC3535j.f9374n.mo6640d(!z2, enumC3444a2, enumC3446c)) {
                if (interfaceC3584l != null) {
                    int ordinal = enumC3446c.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            c3530f = new C3575z(c3534i.f9339c.f9076a, runnableC3535j.f9384x, runnableC3535j.f9369i, runnableC3535j.f9372l, runnableC3535j.f9373m, interfaceC3585m, cls, runnableC3535j.f9375o);
                        } else {
                            throw new IllegalArgumentException("Unknown strategy: " + enumC3446c);
                        }
                    } else {
                        c3530f = new C3530f(runnableC3535j.f9384x, runnableC3535j.f9369i);
                    }
                    C3571w<Z> c3571w = (C3571w) C3571w.f9490e.mo6394b();
                    C3860j.m6404b(c3571w);
                    c3571w.f9494d = false;
                    c3571w.f9493c = true;
                    c3571w.f9492b = interfaceC3573x;
                    RunnableC3535j.C3538c<?> c3538c = runnableC3535j.f9366f;
                    c3538c.f9389a = c3530f;
                    c3538c.f9390b = interfaceC3584l;
                    c3538c.f9391c = c3571w;
                    interfaceC3573x = c3571w;
                } else {
                    throw new C3433j.C3437d(interfaceC3573x.get().getClass());
                }
            }
            return this.f9397c.mo6498a(interfaceC3573x, c3581i);
        } catch (Throwable th) {
            interfaceC0801e.mo6395a(list);
            throw th;
        }
    }

    @NonNull
    /* renamed from: b */
    public final InterfaceC3573x<ResourceType> m6644b(InterfaceC3454e<DataType> interfaceC3454e, int i, int i2, @NonNull C3581i c3581i, List<Throwable> list) throws C3566s {
        List<? extends InterfaceC3583k<DataType, ResourceType>> list2 = this.f9396b;
        int size = list2.size();
        InterfaceC3573x<ResourceType> interfaceC3573x = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC3583k<DataType, ResourceType> interfaceC3583k = list2.get(i3);
            try {
                if (interfaceC3583k.mo6504a(interfaceC3454e.mo6526a(), c3581i)) {
                    interfaceC3573x = interfaceC3583k.mo6503b(interfaceC3454e.mo6526a(), i, i2, c3581i);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC3583k, e);
                }
                list.add(e);
            }
            if (interfaceC3573x != null) {
                break;
            }
        }
        if (interfaceC3573x != null) {
            return interfaceC3573x;
        }
        throw new C3566s(this.f9399e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f9395a + ", decoders=" + this.f9396b + ", transcoder=" + this.f9397c + '}';
    }
}
