package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import com.bumptech.glide.load.resource.bitmap.C3720p;
import com.bumptech.glide.load.resource.bitmap.InterfaceC3729v;
import com.bumptech.glide.util.C3851d;
import com.bumptech.glide.util.C3858h;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b0 */
/* loaded from: classes.dex */
public final class C3679b0 implements InterfaceC3583k<InputStream, Bitmap> {

    /* renamed from: a */
    public final C3720p f9639a;

    /* renamed from: b */
    public final InterfaceC3483b f9640b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b0$a */
    /* loaded from: classes.dex */
    public static class C3680a implements C3720p.InterfaceC3722b {

        /* renamed from: a */
        public final C3735z f9641a;

        /* renamed from: b */
        public final C3851d f9642b;

        public C3680a(C3735z c3735z, C3851d c3851d) {
            this.f9641a = c3735z;
            this.f9642b = c3851d;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C3720p.InterfaceC3722b
        /* renamed from: a */
        public final void mo6541a(Bitmap bitmap, InterfaceC3485d interfaceC3485d) throws IOException {
            IOException iOException = this.f9642b.f9942b;
            if (iOException != null) {
                if (bitmap != null) {
                    interfaceC3485d.mo6538d(bitmap);
                }
                throw iOException;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C3720p.InterfaceC3722b
        /* renamed from: b */
        public final void mo6540b() {
            C3735z c3735z = this.f9641a;
            synchronized (c3735z) {
                c3735z.f9716c = c3735z.f9714a.length;
            }
        }
    }

    public C3679b0(C3720p c3720p, InterfaceC3483b interfaceC3483b) {
        this.f9639a = c3720p;
        this.f9640b = interfaceC3483b;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final boolean mo6504a(@NonNull InputStream inputStream, @NonNull C3581i c3581i) throws IOException {
        this.f9639a.getClass();
        return true;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: b */
    public final InterfaceC3573x<Bitmap> mo6503b(@NonNull InputStream inputStream, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        boolean z;
        C3735z c3735z;
        C3851d c3851d;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof C3735z) {
            c3735z = (C3735z) inputStream2;
            z = false;
        } else {
            z = true;
            c3735z = new C3735z(inputStream2, this.f9640b);
        }
        ArrayDeque arrayDeque = C3851d.f9940c;
        synchronized (arrayDeque) {
            c3851d = (C3851d) arrayDeque.poll();
        }
        if (c3851d == null) {
            c3851d = new C3851d();
        }
        c3851d.f9941a = c3735z;
        C3858h c3858h = new C3858h(c3851d);
        C3680a c3680a = new C3680a(c3735z, c3851d);
        try {
            C3720p c3720p = this.f9639a;
            return c3720p.m6548a(new InterfaceC3729v.C3730a(c3720p.f9686c, c3858h, c3720p.f9687d), i, i2, c3581i, c3680a);
        } finally {
            c3851d.release();
            if (z) {
                c3735z.release();
            }
        }
    }
}
