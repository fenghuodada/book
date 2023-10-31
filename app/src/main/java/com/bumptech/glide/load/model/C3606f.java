package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.signature.C3845b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.f */
/* loaded from: classes.dex */
public final class C3606f<Data> implements InterfaceC3627o<File, Data> {

    /* renamed from: a */
    public final InterfaceC3611d<Data> f9537a;

    /* renamed from: com.bumptech.glide.load.model.f$a */
    /* loaded from: classes.dex */
    public static class C3607a<Data> implements InterfaceC3629p<File, Data> {

        /* renamed from: a */
        public final InterfaceC3611d<Data> f9538a;

        public C3607a(InterfaceC3611d<Data> interfaceC3611d) {
            this.f9538a = interfaceC3611d;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<File, Data> mo6572b(@NonNull C3635s c3635s) {
            return new C3606f(this.f9538a);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.f$b */
    /* loaded from: classes.dex */
    public static class C3608b extends C3607a<ParcelFileDescriptor> {

        /* renamed from: com.bumptech.glide.load.model.f$b$a */
        /* loaded from: classes.dex */
        public class C3609a implements InterfaceC3611d<ParcelFileDescriptor> {
            @Override // com.bumptech.glide.load.model.C3606f.InterfaceC3611d
            /* renamed from: a */
            public final Class<ParcelFileDescriptor> mo6601a() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.bumptech.glide.load.model.C3606f.InterfaceC3611d
            /* renamed from: b */
            public final ParcelFileDescriptor mo6600b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // com.bumptech.glide.load.model.C3606f.InterfaceC3611d
            /* renamed from: c */
            public final void mo6599c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }
        }

        public C3608b() {
            super(new C3609a());
        }
    }

    /* renamed from: com.bumptech.glide.load.model.f$c */
    /* loaded from: classes.dex */
    public static final class C3610c<Data> implements InterfaceC3452d<Data> {

        /* renamed from: a */
        public final File f9539a;

        /* renamed from: b */
        public final InterfaceC3611d<Data> f9540b;

        /* renamed from: c */
        public Data f9541c;

        public C3610c(File file, InterfaceC3611d<Data> interfaceC3611d) {
            this.f9539a = file;
            this.f9540b = interfaceC3611d;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        @NonNull
        /* renamed from: a */
        public final Class<Data> mo6579a() {
            return this.f9540b.mo6601a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        /* renamed from: b */
        public final void mo6578b() {
            Data data = this.f9541c;
            if (data != null) {
                try {
                    this.f9540b.mo6599c(data);
                } catch (IOException unused) {
                }
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

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        /* renamed from: e */
        public final void mo6576e(@NonNull EnumC3432i enumC3432i, @NonNull InterfaceC3452d.InterfaceC3453a<? super Data> interfaceC3453a) {
            try {
                Data mo6600b = this.f9540b.mo6600b(this.f9539a);
                this.f9541c = mo6600b;
                interfaceC3453a.mo6589f(mo6600b);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                interfaceC3453a.mo6590c(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.model.f$d */
    /* loaded from: classes.dex */
    public interface InterfaceC3611d<Data> {
        /* renamed from: a */
        Class<Data> mo6601a();

        /* renamed from: b */
        Data mo6600b(File file) throws FileNotFoundException;

        /* renamed from: c */
        void mo6599c(Data data) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.model.f$e */
    /* loaded from: classes.dex */
    public static class C3612e extends C3607a<InputStream> {

        /* renamed from: com.bumptech.glide.load.model.f$e$a */
        /* loaded from: classes.dex */
        public class C3613a implements InterfaceC3611d<InputStream> {
            @Override // com.bumptech.glide.load.model.C3606f.InterfaceC3611d
            /* renamed from: a */
            public final Class<InputStream> mo6601a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.C3606f.InterfaceC3611d
            /* renamed from: b */
            public final InputStream mo6600b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            @Override // com.bumptech.glide.load.model.C3606f.InterfaceC3611d
            /* renamed from: c */
            public final void mo6599c(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        public C3612e() {
            super(new C3613a());
        }
    }

    public C3606f(InterfaceC3611d<Data> interfaceC3611d) {
        this.f9537a = interfaceC3611d;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6574a(@NonNull File file) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: b */
    public final InterfaceC3627o.C3628a mo6573b(@NonNull File file, int i, int i2, @NonNull C3581i c3581i) {
        File file2 = file;
        return new InterfaceC3627o.C3628a(new C3845b(file2), new C3610c(file2, this.f9537a));
    }
}
