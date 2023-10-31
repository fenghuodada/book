package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.C3424g;
import com.bumptech.glide.ComponentCallbacks2C3409b;
import com.bumptech.glide.load.InterfaceC3585m;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.r */
/* loaded from: classes.dex */
public final class C3725r implements InterfaceC3585m<Drawable> {

    /* renamed from: b */
    public final InterfaceC3585m<Bitmap> f9690b;

    /* renamed from: c */
    public final boolean f9691c;

    public C3725r(InterfaceC3585m<Bitmap> interfaceC3585m, boolean z) {
        this.f9690b = interfaceC3585m;
        this.f9691c = z;
    }

    @Override // com.bumptech.glide.load.InterfaceC3585m
    @NonNull
    /* renamed from: a */
    public final InterfaceC3573x mo6501a(@NonNull C3424g c3424g, @NonNull InterfaceC3573x interfaceC3573x, int i, int i2) {
        InterfaceC3485d interfaceC3485d = ComponentCallbacks2C3409b.m6786b(c3424g).f9033a;
        Drawable drawable = (Drawable) interfaceC3573x.get();
        C3687e m6539a = C3723q.m6539a(interfaceC3485d, drawable, i, i2);
        if (m6539a == null) {
            if (!this.f9691c) {
                return interfaceC3573x;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        InterfaceC3573x mo6501a = this.f9690b.mo6501a(c3424g, m6539a, i, i2);
        if (mo6501a.equals(m6539a)) {
            mo6501a.mo6510a();
            return interfaceC3573x;
        }
        return new C3733x(c3424g.getResources(), mo6501a);
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    /* renamed from: b */
    public final void mo6420b(@NonNull MessageDigest messageDigest) {
        this.f9690b.mo6420b(messageDigest);
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final boolean equals(Object obj) {
        if (obj instanceof C3725r) {
            return this.f9690b.equals(((C3725r) obj).f9690b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final int hashCode() {
        return this.f9690b.hashCode();
    }
}
