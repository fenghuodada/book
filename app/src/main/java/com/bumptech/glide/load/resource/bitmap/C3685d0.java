package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.util.C3861k;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.d0 */
/* loaded from: classes.dex */
public final class C3685d0 implements InterfaceC3583k<Bitmap, Bitmap> {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.d0$a */
    /* loaded from: classes.dex */
    public static final class C3686a implements InterfaceC3573x<Bitmap> {

        /* renamed from: a */
        public final Bitmap f9649a;

        public C3686a(@NonNull Bitmap bitmap) {
            this.f9649a = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC3573x
        /* renamed from: a */
        public final void mo6510a() {
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC3573x
        @NonNull
        /* renamed from: c */
        public final Class<Bitmap> mo6509c() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC3573x
        @NonNull
        public final Bitmap get() {
            return this.f9649a;
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC3573x
        public final int getSize() {
            return C3861k.m6401c(this.f9649a);
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6504a(@NonNull Bitmap bitmap, @NonNull C3581i c3581i) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: b */
    public final InterfaceC3573x<Bitmap> mo6503b(@NonNull Bitmap bitmap, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        return new C3686a(bitmap);
    }
}
