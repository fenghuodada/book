package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.C3424g;
import com.bumptech.glide.ComponentCallbacks2C3409b;
import com.bumptech.glide.load.InterfaceC3585m;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.resource.bitmap.C3687e;
import com.bumptech.glide.util.C3860j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.gif.f */
/* loaded from: classes.dex */
public final class C3761f implements InterfaceC3585m<C3757c> {

    /* renamed from: b */
    public final InterfaceC3585m<Bitmap> f9754b;

    public C3761f(InterfaceC3585m<Bitmap> interfaceC3585m) {
        C3860j.m6404b(interfaceC3585m);
        this.f9754b = interfaceC3585m;
    }

    @Override // com.bumptech.glide.load.InterfaceC3585m
    @NonNull
    /* renamed from: a */
    public final InterfaceC3573x mo6501a(@NonNull C3424g c3424g, @NonNull InterfaceC3573x interfaceC3573x, int i, int i2) {
        C3757c c3757c = (C3757c) interfaceC3573x.get();
        C3687e c3687e = new C3687e(c3757c.f9743a.f9753a.f9766l, ComponentCallbacks2C3409b.m6786b(c3424g).f9033a);
        InterfaceC3585m<Bitmap> interfaceC3585m = this.f9754b;
        InterfaceC3573x mo6501a = interfaceC3585m.mo6501a(c3424g, c3687e, i, i2);
        if (!c3687e.equals(mo6501a)) {
            c3687e.mo6510a();
        }
        c3757c.f9743a.f9753a.m6506c(interfaceC3585m, (Bitmap) mo6501a.get());
        return interfaceC3573x;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    /* renamed from: b */
    public final void mo6420b(@NonNull MessageDigest messageDigest) {
        this.f9754b.mo6420b(messageDigest);
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final boolean equals(Object obj) {
        if (obj instanceof C3761f) {
            return this.f9754b.equals(((C3761f) obj).f9754b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final int hashCode() {
        return this.f9754b.hashCode();
    }
}
