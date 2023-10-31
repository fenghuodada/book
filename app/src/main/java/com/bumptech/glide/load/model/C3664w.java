package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.signature.C3845b;

/* renamed from: com.bumptech.glide.load.model.w */
/* loaded from: classes.dex */
public final class C3664w<Model> implements InterfaceC3627o<Model, Model> {

    /* renamed from: a */
    public static final C3664w<?> f9623a = new C3664w<>();

    /* renamed from: com.bumptech.glide.load.model.w$a */
    /* loaded from: classes.dex */
    public static class C3665a<Model> implements InterfaceC3629p<Model, Model> {

        /* renamed from: a */
        public static final C3665a<?> f9624a = new C3665a<>();

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<Model, Model> mo6572b(C3635s c3635s) {
            return C3664w.f9623a;
        }
    }

    /* renamed from: com.bumptech.glide.load.model.w$b */
    /* loaded from: classes.dex */
    public static class C3666b<Model> implements InterfaceC3452d<Model> {

        /* renamed from: a */
        public final Model f9625a;

        public C3666b(Model model) {
            this.f9625a = model;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        @NonNull
        /* renamed from: a */
        public final Class<Model> mo6579a() {
            return (Class<Model>) this.f9625a.getClass();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        /* renamed from: b */
        public final void mo6578b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        @NonNull
        /* renamed from: d */
        public final EnumC3444a mo6577d() {
            return EnumC3444a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        /* renamed from: e */
        public final void mo6576e(@NonNull EnumC3432i enumC3432i, @NonNull InterfaceC3452d.InterfaceC3453a<? super Model> interfaceC3453a) {
            interfaceC3453a.mo6589f((Model) this.f9625a);
        }
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final boolean mo6574a(@NonNull Model model) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: b */
    public final InterfaceC3627o.C3628a<Model> mo6573b(@NonNull Model model, int i, int i2, @NonNull C3581i c3581i) {
        return new InterfaceC3627o.C3628a<>(new C3845b(model), new C3666b(model));
    }
}
