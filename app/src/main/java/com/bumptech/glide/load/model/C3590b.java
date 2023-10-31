package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.signature.C3845b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.model.b */
/* loaded from: classes.dex */
public final class C3590b<Data> implements InterfaceC3627o<byte[], Data> {

    /* renamed from: a */
    public final InterfaceC3593b<Data> f9528a;

    /* renamed from: com.bumptech.glide.load.model.b$a */
    /* loaded from: classes.dex */
    public static class C3591a implements InterfaceC3629p<byte[], ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.model.b$a$a */
        /* loaded from: classes.dex */
        public class C3592a implements InterfaceC3593b<ByteBuffer> {
            @Override // com.bumptech.glide.load.model.C3590b.InterfaceC3593b
            /* renamed from: a */
            public final Class<ByteBuffer> mo6604a() {
                return ByteBuffer.class;
            }

            @Override // com.bumptech.glide.load.model.C3590b.InterfaceC3593b
            /* renamed from: b */
            public final ByteBuffer mo6603b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<byte[], ByteBuffer> mo6572b(@NonNull C3635s c3635s) {
            return new C3590b(new C3592a());
        }
    }

    /* renamed from: com.bumptech.glide.load.model.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3593b<Data> {
        /* renamed from: a */
        Class<Data> mo6604a();

        /* renamed from: b */
        Data mo6603b(byte[] bArr);
    }

    /* renamed from: com.bumptech.glide.load.model.b$c */
    /* loaded from: classes.dex */
    public static class C3594c<Data> implements InterfaceC3452d<Data> {

        /* renamed from: a */
        public final byte[] f9529a;

        /* renamed from: b */
        public final InterfaceC3593b<Data> f9530b;

        public C3594c(byte[] bArr, InterfaceC3593b<Data> interfaceC3593b) {
            this.f9529a = bArr;
            this.f9530b = interfaceC3593b;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        @NonNull
        /* renamed from: a */
        public final Class<Data> mo6579a() {
            return this.f9530b.mo6604a();
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
        public final void mo6576e(@NonNull EnumC3432i enumC3432i, @NonNull InterfaceC3452d.InterfaceC3453a<? super Data> interfaceC3453a) {
            interfaceC3453a.mo6589f((Data) this.f9530b.mo6603b(this.f9529a));
        }
    }

    /* renamed from: com.bumptech.glide.load.model.b$d */
    /* loaded from: classes.dex */
    public static class C3595d implements InterfaceC3629p<byte[], InputStream> {

        /* renamed from: com.bumptech.glide.load.model.b$d$a */
        /* loaded from: classes.dex */
        public class C3596a implements InterfaceC3593b<InputStream> {
            @Override // com.bumptech.glide.load.model.C3590b.InterfaceC3593b
            /* renamed from: a */
            public final Class<InputStream> mo6604a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.C3590b.InterfaceC3593b
            /* renamed from: b */
            public final InputStream mo6603b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<byte[], InputStream> mo6572b(@NonNull C3635s c3635s) {
            return new C3590b(new C3596a());
        }
    }

    public C3590b(InterfaceC3593b<Data> interfaceC3593b) {
        this.f9528a = interfaceC3593b;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6574a(@NonNull byte[] bArr) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: b */
    public final InterfaceC3627o.C3628a mo6573b(@NonNull byte[] bArr, int i, int i2, @NonNull C3581i c3581i) {
        byte[] bArr2 = bArr;
        return new InterfaceC3627o.C3628a(new C3845b(bArr2), new C3594c(bArr2, this.f9528a));
    }
}
