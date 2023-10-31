package com.bumptech.glide.load.model;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.signature.C3845b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.e */
/* loaded from: classes.dex */
public final class C3601e<Model, Data> implements InterfaceC3627o<Model, Data> {

    /* renamed from: a */
    public final InterfaceC3602a<Data> f9532a;

    /* renamed from: com.bumptech.glide.load.model.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3602a<Data> {
    }

    /* renamed from: com.bumptech.glide.load.model.e$b */
    /* loaded from: classes.dex */
    public static final class C3603b<Data> implements InterfaceC3452d<Data> {

        /* renamed from: a */
        public final String f9533a;

        /* renamed from: b */
        public final InterfaceC3602a<Data> f9534b;

        /* renamed from: c */
        public ByteArrayInputStream f9535c;

        public C3603b(String str, InterfaceC3602a<Data> interfaceC3602a) {
            this.f9533a = str;
            this.f9534b = interfaceC3602a;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        @NonNull
        /* renamed from: a */
        public final Class<Data> mo6579a() {
            this.f9534b.getClass();
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        /* renamed from: b */
        public final void mo6578b() {
            try {
                InterfaceC3602a<Data> interfaceC3602a = this.f9534b;
                ByteArrayInputStream byteArrayInputStream = this.f9535c;
                ((C3604c.C3605a) interfaceC3602a).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
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
        public final void mo6576e(@NonNull EnumC3432i enumC3432i, @NonNull InterfaceC3452d.InterfaceC3453a<? super Data> interfaceC3453a) {
            try {
                ByteArrayInputStream m6602a = ((C3604c.C3605a) this.f9534b).m6602a(this.f9533a);
                this.f9535c = m6602a;
                interfaceC3453a.mo6589f(m6602a);
            } catch (IllegalArgumentException e) {
                interfaceC3453a.mo6590c(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.model.e$c */
    /* loaded from: classes.dex */
    public static final class C3604c<Model> implements InterfaceC3629p<Model, InputStream> {

        /* renamed from: a */
        public final C3605a f9536a = new C3605a();

        /* renamed from: com.bumptech.glide.load.model.e$c$a */
        /* loaded from: classes.dex */
        public class C3605a implements InterfaceC3602a<InputStream> {
            /* renamed from: a */
            public final ByteArrayInputStream m6602a(String str) throws IllegalArgumentException {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<Model, InputStream> mo6572b(@NonNull C3635s c3635s) {
            return new C3601e(this.f9536a);
        }
    }

    public C3601e(C3604c.C3605a c3605a) {
        this.f9532a = c3605a;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final boolean mo6574a(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: b */
    public final InterfaceC3627o.C3628a<Data> mo6573b(@NonNull Model model, int i, int i2, @NonNull C3581i c3581i) {
        return new InterfaceC3627o.C3628a<>(new C3845b(model), new C3603b(model.toString(), this.f9532a));
    }
}
