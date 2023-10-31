package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.signature.C3845b;
import com.bumptech.glide.util.C3846a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.model.d */
/* loaded from: classes.dex */
public final class C3598d implements InterfaceC3627o<File, ByteBuffer> {

    /* renamed from: com.bumptech.glide.load.model.d$a */
    /* loaded from: classes.dex */
    public static final class C3599a implements InterfaceC3452d<ByteBuffer> {

        /* renamed from: a */
        public final File f9531a;

        public C3599a(File file) {
            this.f9531a = file;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        @NonNull
        /* renamed from: a */
        public final Class<ByteBuffer> mo6579a() {
            return ByteBuffer.class;
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
        public final void mo6576e(@NonNull EnumC3432i enumC3432i, @NonNull InterfaceC3452d.InterfaceC3453a<? super ByteBuffer> interfaceC3453a) {
            try {
                interfaceC3453a.mo6589f(C3846a.m6419a(this.f9531a));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                interfaceC3453a.mo6590c(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.model.d$b */
    /* loaded from: classes.dex */
    public static class C3600b implements InterfaceC3629p<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<File, ByteBuffer> mo6572b(@NonNull C3635s c3635s) {
            return new C3598d();
        }
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6574a(@NonNull File file) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: b */
    public final InterfaceC3627o.C3628a<ByteBuffer> mo6573b(@NonNull File file, int i, int i2, @NonNull C3581i c3581i) {
        File file2 = file;
        return new InterfaceC3627o.C3628a<>(new C3845b(file2), new C3599a(file2));
    }
}
