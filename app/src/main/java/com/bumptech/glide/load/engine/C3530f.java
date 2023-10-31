package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.InterfaceC3577g;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.engine.f */
/* loaded from: classes.dex */
public final class C3530f implements InterfaceC3577g {

    /* renamed from: b */
    public final InterfaceC3577g f9332b;

    /* renamed from: c */
    public final InterfaceC3577g f9333c;

    public C3530f(InterfaceC3577g interfaceC3577g, InterfaceC3577g interfaceC3577g2) {
        this.f9332b = interfaceC3577g;
        this.f9333c = interfaceC3577g2;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    /* renamed from: b */
    public final void mo6420b(@NonNull MessageDigest messageDigest) {
        this.f9332b.mo6420b(messageDigest);
        this.f9333c.mo6420b(messageDigest);
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final boolean equals(Object obj) {
        if (obj instanceof C3530f) {
            C3530f c3530f = (C3530f) obj;
            return this.f9332b.equals(c3530f.f9332b) && this.f9333c.equals(c3530f.f9333c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final int hashCode() {
        return this.f9333c.hashCode() + (this.f9332b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f9332b + ", signature=" + this.f9333c + '}';
    }
}
