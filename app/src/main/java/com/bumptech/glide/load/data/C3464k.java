package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.InterfaceC3454e;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import com.bumptech.glide.load.resource.bitmap.C3735z;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.k */
/* loaded from: classes.dex */
public final class C3464k implements InterfaceC3454e<InputStream> {

    /* renamed from: a */
    public final C3735z f9212a;

    /* renamed from: com.bumptech.glide.load.data.k$a */
    /* loaded from: classes.dex */
    public static final class C3465a implements InterfaceC3454e.InterfaceC3455a<InputStream> {

        /* renamed from: a */
        public final InterfaceC3483b f9213a;

        public C3465a(InterfaceC3483b interfaceC3483b) {
            this.f9213a = interfaceC3483b;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3454e.InterfaceC3455a
        @NonNull
        /* renamed from: a */
        public final Class<InputStream> mo6524a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3454e.InterfaceC3455a
        @NonNull
        /* renamed from: b */
        public final InterfaceC3454e<InputStream> mo6523b(InputStream inputStream) {
            return new C3464k(inputStream, this.f9213a);
        }
    }

    public C3464k(InputStream inputStream, InterfaceC3483b interfaceC3483b) {
        C3735z c3735z = new C3735z(inputStream, interfaceC3483b);
        this.f9212a = c3735z;
        c3735z.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3454e
    @NonNull
    /* renamed from: a */
    public final InputStream mo6526a() throws IOException {
        C3735z c3735z = this.f9212a;
        c3735z.reset();
        return c3735z;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3454e
    /* renamed from: b */
    public final void mo6525b() {
        this.f9212a.release();
    }
}
