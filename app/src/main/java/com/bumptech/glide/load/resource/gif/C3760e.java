package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.ComponentCallbacks2C3441l;
import com.bumptech.glide.load.resource.drawable.AbstractC3743b;
import com.bumptech.glide.load.resource.gif.C3762g;

/* renamed from: com.bumptech.glide.load.resource.gif.e */
/* loaded from: classes.dex */
public final class C3760e extends AbstractC3743b<C3757c> {
    public C3760e(C3757c c3757c) {
        super(c3757c);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    /* renamed from: a */
    public final void mo6510a() {
        C3757c c3757c = (C3757c) this.f9723a;
        c3757c.stop();
        c3757c.f9746d = true;
        C3762g c3762g = c3757c.f9743a.f9753a;
        c3762g.f9757c.clear();
        Bitmap bitmap = c3762g.f9766l;
        if (bitmap != null) {
            c3762g.f9759e.mo6538d(bitmap);
            c3762g.f9766l = null;
        }
        c3762g.f9760f = false;
        C3762g.C3763a c3763a = c3762g.f9763i;
        ComponentCallbacks2C3441l componentCallbacks2C3441l = c3762g.f9758d;
        if (c3763a != null) {
            componentCallbacks2C3441l.m6729i(c3763a);
            c3762g.f9763i = null;
        }
        C3762g.C3763a c3763a2 = c3762g.f9765k;
        if (c3763a2 != null) {
            componentCallbacks2C3441l.m6729i(c3763a2);
            c3762g.f9765k = null;
        }
        C3762g.C3763a c3763a3 = c3762g.f9768n;
        if (c3763a3 != null) {
            componentCallbacks2C3441l.m6729i(c3763a3);
            c3762g.f9768n = null;
        }
        c3762g.f9755a.clear();
        c3762g.f9764j = true;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    @NonNull
    /* renamed from: c */
    public final Class<C3757c> mo6509c() {
        return C3757c.class;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    public final int getSize() {
        C3762g c3762g = ((C3757c) this.f9723a).f9743a.f9753a;
        return c3762g.f9755a.mo6751f() + c3762g.f9769o;
    }

    @Override // com.bumptech.glide.load.resource.drawable.AbstractC3743b, com.bumptech.glide.load.engine.InterfaceC3568t
    public final void initialize() {
        ((C3757c) this.f9723a).f9743a.f9753a.f9766l.prepareToDraw();
    }
}
