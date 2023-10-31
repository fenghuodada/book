package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.InterfaceC0801e;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.engine.C3566s;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.util.C3860j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bumptech.glide.load.model.r */
/* loaded from: classes.dex */
public final class C3633r<Model, Data> implements InterfaceC3627o<Model, Data> {

    /* renamed from: a */
    public final List<InterfaceC3627o<Model, Data>> f9572a;

    /* renamed from: b */
    public final InterfaceC0801e<List<Throwable>> f9573b;

    /* renamed from: com.bumptech.glide.load.model.r$a */
    /* loaded from: classes.dex */
    public static class C3634a<Data> implements InterfaceC3452d<Data>, InterfaceC3452d.InterfaceC3453a<Data> {

        /* renamed from: a */
        public final List<InterfaceC3452d<Data>> f9574a;

        /* renamed from: b */
        public final InterfaceC0801e<List<Throwable>> f9575b;

        /* renamed from: c */
        public int f9576c;

        /* renamed from: d */
        public EnumC3432i f9577d;

        /* renamed from: e */
        public InterfaceC3452d.InterfaceC3453a<? super Data> f9578e;
        @Nullable

        /* renamed from: f */
        public List<Throwable> f9579f;

        /* renamed from: g */
        public boolean f9580g;

        public C3634a(@NonNull ArrayList arrayList, @NonNull InterfaceC0801e interfaceC0801e) {
            this.f9575b = interfaceC0801e;
            if (!arrayList.isEmpty()) {
                this.f9574a = arrayList;
                this.f9576c = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        @NonNull
        /* renamed from: a */
        public final Class<Data> mo6579a() {
            return this.f9574a.get(0).mo6579a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        /* renamed from: b */
        public final void mo6578b() {
            List<Throwable> list = this.f9579f;
            if (list != null) {
                this.f9575b.mo6395a(list);
            }
            this.f9579f = null;
            for (InterfaceC3452d<Data> interfaceC3452d : this.f9574a) {
                interfaceC3452d.mo6578b();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d.InterfaceC3453a
        /* renamed from: c */
        public final void mo6590c(@NonNull Exception exc) {
            List<Throwable> list = this.f9579f;
            C3860j.m6404b(list);
            list.add(exc);
            m6588g();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        public final void cancel() {
            this.f9580g = true;
            for (InterfaceC3452d<Data> interfaceC3452d : this.f9574a) {
                interfaceC3452d.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        @NonNull
        /* renamed from: d */
        public final EnumC3444a mo6577d() {
            return this.f9574a.get(0).mo6577d();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        /* renamed from: e */
        public final void mo6576e(@NonNull EnumC3432i enumC3432i, @NonNull InterfaceC3452d.InterfaceC3453a<? super Data> interfaceC3453a) {
            this.f9577d = enumC3432i;
            this.f9578e = interfaceC3453a;
            this.f9579f = this.f9575b.mo6394b();
            this.f9574a.get(this.f9576c).mo6576e(enumC3432i, this);
            if (this.f9580g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d.InterfaceC3453a
        /* renamed from: f */
        public final void mo6589f(@Nullable Data data) {
            if (data != null) {
                this.f9578e.mo6589f(data);
            } else {
                m6588g();
            }
        }

        /* renamed from: g */
        public final void m6588g() {
            if (this.f9580g) {
                return;
            }
            if (this.f9576c < this.f9574a.size() - 1) {
                this.f9576c++;
                mo6576e(this.f9577d, this.f9578e);
                return;
            }
            C3860j.m6404b(this.f9579f);
            this.f9578e.mo6590c(new C3566s("Fetch failed", new ArrayList(this.f9579f)));
        }
    }

    public C3633r(@NonNull ArrayList arrayList, @NonNull InterfaceC0801e interfaceC0801e) {
        this.f9572a = arrayList;
        this.f9573b = interfaceC0801e;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final boolean mo6574a(@NonNull Model model) {
        for (InterfaceC3627o<Model, Data> interfaceC3627o : this.f9572a) {
            if (interfaceC3627o.mo6574a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: b */
    public final InterfaceC3627o.C3628a<Data> mo6573b(@NonNull Model model, int i, int i2, @NonNull C3581i c3581i) {
        InterfaceC3627o.C3628a<Data> mo6573b;
        List<InterfaceC3627o<Model, Data>> list = this.f9572a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC3577g interfaceC3577g = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC3627o<Model, Data> interfaceC3627o = list.get(i3);
            if (interfaceC3627o.mo6574a(model) && (mo6573b = interfaceC3627o.mo6573b(model, i, i2, c3581i)) != null) {
                arrayList.add(mo6573b.f9567c);
                interfaceC3577g = mo6573b.f9565a;
            }
        }
        if (arrayList.isEmpty() || interfaceC3577g == null) {
            return null;
        }
        return new InterfaceC3627o.C3628a<>(interfaceC3577g, new C3634a(arrayList, this.f9573b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f9572a.toArray()) + '}';
    }
}
